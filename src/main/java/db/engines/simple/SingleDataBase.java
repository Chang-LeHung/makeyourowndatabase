package db.engines.simple;

import db.actions.DBOperations;
import sql.evaluator.bytecode.ByteCodeGenerator;
import sql.evaluator.bytecode.Eval;
import sql.evaluator.bytecode.bytecodes.ByteCode;
import sql.evaluator.bytecode.data.*;
import sql.evaluator.bytecode.data.Float;
import sql.sql.statement.sqlobject.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * table definition suffix : .def
 * table data suffix       : .da
 * a database with an unique dir
 */
public class SingleDataBase implements DBOperations {

  /* directory of this database */
  private String dir;

  private Set<String> files;

  String errMsg;

  private Set<String> tables;

  private Map<String, Table> tableMaps;

  public SingleDataBase(String dir) {
    tableMaps = new HashMap<>();
    files = new HashSet<>();
    this.dir = dir;
    tables = new HashSet<>();
    File file = new File(dir);
    for (File f : Objects.requireNonNull(file.listFiles())) {
      if (f.isFile() && f.getName().endsWith(".def")) {
        String name = f.getName();
        tables.add(name.substring(0, name.length() - 4));
      }
      files.add(f.getName());
    }
  }

  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public Set<String> getTables() {
    return tables;
  }

  @Override
  public List<Map<String, DataType>> doSelect(SQLSelect select) {
    if (!ensureExist(select.getTableName()))
      return null;
    if (!ensureLoadTable(select.getTableName()))
      return null;
    ArrayList<Map<String, DataType>> results = new ArrayList<>();
    Table table = tableMaps.get(select.getTableName());
    List<List<DataType>> tableData = table.getTableData();
    String where = select.getWhere();
    List<Item> items = table.getDefinition().getItems();
    List<String> query = select.getItems();
    if (query.size() == 0) {
      for (Item item : table.getDefinition().getItems()) {
        query.add(item.getName());
      }
    }
    if (where == null) {
      for (List<DataType> tableDatum : tableData) {
        Map<String, DataType> map = list2Map(tableDatum, items);
        if (!extractDataFromSingleRow(results, query, map)) return null;
      }
    }else {
      for (List<DataType> tableDatum : tableData) {
        Map<String, DataType> map = list2Map(tableDatum, items);
        DataType eval = eval(select.getTableName(), where, map);
        Bool ret = (Bool)eval;
        if (ret == null) return null;
        if (ret.isVal()) {
          if (!extractDataFromSingleRow(results, query, map)) return null;
        }
      }
    }
    return results;
  }

  private boolean extractDataFromSingleRow(ArrayList<Map<String, DataType>> results, List<String> query, Map<String, DataType> map) {
    Map<String, DataType> r = new HashMap<>();
    for (String s : query) {
      if (!map.containsKey(s)) {
        errMsg = "table can not contain item " + s;
        return false;
      }
      r.put(s, map.get(s));
    }
    results.add(r);
    return true;
  }

  private Map<String, DataType> list2Map(List<DataType> row,
                                         List<Item> items) {
    HashMap<String, DataType> map = new HashMap<>();

    for (int i = 0; i < row.size(); ++i) {
      map.put(items.get(i).getName(), row.get(i));
    }
    return map;
  }

  @Override
  public boolean doCreate(SQLCreate create){
    if (tables.contains(create.gettableName())) {
      errMsg = "table name has already existed";
      return false;
    }
    if (create.getPrimaryKey().size() == 0 || create.getItems().size() == 0) {
      errMsg = "number item and primary key should greater than 0";
      return false;
    }
    TableDefinition definition = new TableDefinition();
    definition.setTableName(create.getTableName());
    definition.setPk(create.getPrimaryKey());
    definition.setFk(create.getForeignKey());
    definition.setForeignTable(create.getForeignTable());
    definition.setItems(create.getItems());
    Table table = new Table(definition, new CopyOnWriteArrayList<>());

    // dump to disk
    Path path = Paths.get(dir, definition.getTableName() + ".def");
    try {
      definition.dump(path.toString());
    } catch (IOException e) {
      e.printStackTrace();
      errMsg = e.getMessage();
      return false;
    }
    tableMaps.put(definition.getTableName(), table);
    tables.add(definition.getTableName());
    try {
      path = Paths.get(dir, definition.getTableName() + ".da");
      table.dump(path.toString());
    } catch (IOException e) {
      errMsg = "I/O error";
      return false;
    }
    return true;
  }

  @Override
  public boolean doUpdate(SQLUpdate update) {
    if (!ensureExist(update.getTableName()))
      return false;
    if (!ensureLoadTable(update.getTableName()))
      return false;
    Table table = tableMaps.get(update.getTableName());
    for (List<DataType> data : table.getTableData()) {
      String condition = update.getCondition();
      Map<String, DataType> map = list2Map(update.getTableName(), data);
      Bool eval = (Bool)eval(table.getDefinition().getTableName(), condition, map);
      if (eval == null) return false;
      if (eval.isVal()) {
        Map<String, Object> map1 = update.getMap();
        map1.forEach((x, y) -> {
          DataType dataType = obj2DataType(y);
          map.put(x, dataType);
        });
        List<DataType> types = map2List(update.getTableName(), map);
        for (int i = 0; i < types.size(); ++i) {
          data.set(i, types.get(i));
        }
      }
    }
    try {
      Path path = Paths.get(dir, table.getDefinition().getTableName() + ".da");
      table.dump(path.toString());
    } catch (IOException e) {
      errMsg = "I/O error";
      return false;
    }
    return true;
  }

  private List<DataType> map2List(String tableName,
                                  Map<String, DataType> map) {
    Table table = tableMaps.get(tableName);
    List<Item> items = table.getDefinition().getItems();
    ArrayList<DataType> dataTypes = new ArrayList<>();
    for (Item item : items) {
      dataTypes.add(map.getOrDefault(item.getName(), null));
    }
    return dataTypes;
  }

  @Override
  public boolean doDelete(SQLDelete delete) {
    if (!ensureExist(delete.getTableName()))
      return false;
    if (!ensureLoadTable(delete.getTableName()))
      return false;
    Table table = tableMaps.get(delete.getTableName());
    for (List<DataType> data : table.getTableData()) {
      String condition = delete.getCondition();
      Map<String, DataType> map = list2Map(delete.getTableName(), data);
      Bool eval = (Bool)eval(delete.getTableName(), condition, map);
      if (eval == null) return false;
      if (eval.isVal())
        table.getTableData().remove(data);
    }

    try {
      Path path = Paths.get(dir, table.getDefinition().getTableName() + ".da");
      table.dump(path.toString());
    } catch (IOException e) {
      errMsg = "I/O error";
      return false;
    }
    return true;
  }

  private Map<String, DataType> list2Map(String tableName, List<DataType> data) {
    Table table = tableMaps.get(tableName);
    TableDefinition definition = table.getDefinition();
    List<Item> items = definition.getItems();
    HashMap<String, DataType> map = new HashMap<>();
    for (int i = 0; i < items.size(); ++i) {
      map.put(items.get(i).getName(), data.get(i));
    }
    return map;
  }

  @Override
  public boolean doInsert(SQLInsert insert) {
    if (!ensureExist(insert.getTableName()))
      return false;
    if (!ensureLoadTable(insert.getTableName()))
      return false;
    Table table = tableMaps.get(insert.getTableName());
    List<Item> items = table.getDefinition().getItems();
    List<List<DataType>> objects = new ArrayList<>();
    List<String> pk = table.getDefinition().getPk();
    for (Map<String, Object> assign : insert.getAssigns()) {
      ArrayList<DataType> list = new ArrayList<>();
      for (int i = 0; i < items.size(); ++i) {
        Item item = items.get(i);
        Object o = assign.getOrDefault(item.getName(), null);
        DataType dataType = obj2DataType(item, (String) o);
        if (dataType == null) return false;
        if (o == null && item.isNotNull()) {
          errMsg = item.getName() + " should not be null";
          return false;
        }
        if (item.isUnique() || item.isPrimaryKey() || pk.contains(item.getName())) {
          for (List<DataType> data : table.getTableData()) {
            if (data.get(i).equals(dataType)) {
              errMsg = item.getName() + " = " + dataType + " has already existed";
              return false;
            }
          }
        }
        list.add(dataType);
      }
      objects.add(list);
    }
    table.getTableData().addAll(objects);
    try {
      Path path = Paths.get(dir, table.getDefinition().getTableName() + ".da");
      table.dump(path.toString());
    } catch (IOException e) {
      e.printStackTrace();
      errMsg = "I/O error";
      return false;
    }
    return true;
  }

  private DataType obj2DataType(Item item, String o) {
    String type = item.getType();
    if ("int".equalsIgnoreCase(type)) {
      int i;
      try {
        i = Integer.parseInt(o);
      }catch (NumberFormatException e) {
        errMsg = o + " is not type of int";
        return null;
      }
      return new Int((char)0, i);
    }else if ("string".equalsIgnoreCase(type) ||
    "varchar".equalsIgnoreCase(type) || "char".equalsIgnoreCase(type)) {
      return new StringData((char)2, o);
    }else if ("float".equalsIgnoreCase(type) ||
    "double".equalsIgnoreCase(type)) {
      float i;
      try {
        i = java.lang.Float.parseFloat(o);
      }catch (NumberFormatException e) {
        errMsg = o + " is not type of int";
        return null;
      }
      return new Float((char)0, i);
    }else if ("bool".equalsIgnoreCase(type)) {
      boolean t;
      if ("true".equalsIgnoreCase(o)) {
        t = true;
      }else if ("false".equalsIgnoreCase(o)) {
        t = false;
      }else {
        errMsg = "Unknow \"" + o + "\"'s type";
        return null;
      }
      return new Bool((char)4, t);
    }
    errMsg = "meet a unsupported type";
    return null;
  }

  private DataType obj2DataType(Object o) {
    if (o instanceof Integer) {
      Int dataType = new Int((char) 1);
      dataType.setVal((Integer)o);
      return dataType;
    }else if (o instanceof Float || o instanceof Double) {
      Float data = new Float((char)1, (java.lang.Float) o);
      return data;
    }
    StringData data = new StringData((char) 2);
    data.setParam((String) o);
    return data;
  }

  private boolean ensureExist(String table) {
    if (!isExisted(table)) {
      errMsg = "table \"" + table + "\" not exists;";
      return false;
    }
    return true;
  }

  private boolean ensureLoadTable(String table) {
    if (!tableMaps.containsKey(table)) {
      try {
        doLoadTable(table);
      } catch (IOException | ClassNotFoundException e) {
        errMsg = e.getMessage();
        return false;
      }
    }
    return true;
  }

  private void doLoadTable(String table) throws IOException, ClassNotFoundException {
    Path path = Paths.get(dir, table + ".da");
    List<List<DataType>> data = Table.load(path.toString());
    path = Paths.get(dir, table + ".def");
    TableDefinition definition = TableDefinition.load(path.toString());
    Table tableData = new Table(definition, data);
    tableMaps.put(table, tableData);
  }

  private boolean isExisted(String fileName) {
    return files.contains(fileName + ".def") || tables.contains(fileName);
  }

  public String getErrMsg() {
    return errMsg;
  }

  private DataType eval(String tableName, String code, Map<String, DataType> map) {
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    ByteCodeGenerator generator;
    try {
      generator = Eval.SQLExpression(inputStream);
    } catch (Exception e) {
      errMsg = e.getMessage();
      return null;
    }
    if (!doLoadAggregation(tableName, generator , map))
      return null;
    try {
      return Eval.eval(generator.getByteCodes(), map);
    } catch (Exception e) {
      errMsg = e.getMessage();
      return null;
    }
  }

  private boolean doLoadAggregation(String tableName,
                                    ByteCodeGenerator generator, Map<String, DataType> map) {
    Table table = tableMaps.get(tableName);
    Set<String> items = table.getDefinition().getItems().stream().map(
            Item::getName
    ).collect(Collectors.toSet());
    List<ByteCodeGenerator.Aggregation> aggregations = generator.getAggregations();
    for (ByteCodeGenerator.Aggregation aggregation : aggregations) {
      if (items.contains(aggregation.getVarName())) {
        // finish the code
      }else {
        return false;
      }
    }
    return true;
  }
}
