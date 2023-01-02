package db.engines.simple;

import db.actions.DBOperations;
import sql.evaluator.bytecode.ByteCodeGenerator;
import sql.evaluator.bytecode.Eval;
import sql.evaluator.bytecode.Utils;
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
    List<Map<String, DataType>> results = new ArrayList<>();
    Table table = tableMaps.get(select.getTableName());
    List<List<DataType>> tableData = table.getTableData();
    String where = select.getWhere();
    List<Item> items = table.getDefinition().getItems();
    List<String> query = new ArrayList<>();
    for (Item item : table.getDefinition().getItems()) {
      query.add(item.getName());
    }
    if (where == null) {
      for (List<DataType> tableDatum : tableData) {
        Map<String, DataType> map = list2Map(tableDatum, items);
        if (!extractDataFromSingleRow(results, query, map)) return null;
      }
    }else {
      for (List<DataType> tableDatum : tableData) {
        Map<String, DataType> map = list2Map(tableDatum, items);
        List<Map<String, DataType>> maps = loadMaps(select.getTableName());
        DataType eval = eval(select.getTableName(), where, map, maps);
        Bool ret = (Bool)eval;
        if (ret == null) return null;
        if (ret.isVal()) {
          if (!extractDataFromSingleRow(results, query, map)) return null;
        }
      }
    }
    List<String> queries = select.getItems();
    if (queries.size() == 0) {
      for (Item item : table.getDefinition().getItems()) {
        queries.add(item.getName());
      }
    }
    if (select.getGroupByField() != null) {
      return doSelectGroup(select, results, queries);
    }

    // below code: deal with none group situation
    boolean is, all;
    try {
      is = isAggregation(queries);
      all = isAllAggregation(queries);
    } catch (IOException e) {
      errMsg = e.getMessage();
      return null;
    }
    if (is) {
     if (!all) {
       errMsg = "all query item should be aggregation if one of queries is";
       return null;
     }else {
       return getAggregationResult(select, results, queries);
     }
    }
    return getNoneAggregationResult(select, results, queries);
  }

  private List<Map<String, DataType>> doSelectGroup(SQLSelect select, List<Map<String, DataType>> results,
                                                    List<String> queries) {
    String groupByField = select.getGroupByField();
    boolean isIn = queries.contains(groupByField);
    queries.remove(groupByField);
    try {
      boolean b = isAllAggregation(queries);
      if (!b) {
        errMsg = "all query item should be aggregation type";
        return null;
      }
    } catch (IOException e) {
      errMsg = e.getMessage();
      return null;
    }
    String having = select.getHaving();
    List<Map<String, DataType>> ans = new ArrayList<>();
    Map<DataType, List<Map<String, DataType>>> map = new HashMap<>(); map = new HashMap<>();
    if (ensureGroupItemInTableItem(select.getTableName(),
            groupByField)) {
      Map<DataType, List<Map<String, DataType>>> groupResult = doGroup(results, groupByField);
      for (Map.Entry<DataType, List<Map<String, DataType>>> entry : groupResult.entrySet()) {
        List<Map<String, DataType>> t = getAggregationResult(select, entry.getValue(), queries);
        if (t == null) return null;
        if (having != null) {
          DataType eval = eval(select.getTableName(), having, new HashMap<>(),
                  entry.getValue());
          Bool ret = (Bool)eval;
          if (ret.isVal()) {
            if (isIn)
              t.forEach(x-> {
                x.put(groupByField, entry.getKey());
              });
            ans.addAll(t);
          }
        }else {
          if (isIn)
            t.forEach(x-> {
              x.put(groupByField, entry.getKey());
            });
          ans.addAll(t);
        }
      }
      return ans;
    }else
      return null;
  }

  private Map<DataType, List<Map<String, DataType>>> doGroup(List<Map<String, DataType>> results,
                                                             String field) {
    Map<DataType, List<Map<String, DataType>>> map = new HashMap<>();
    for (Map<String, DataType> result : results) {
      DataType dataType = result.get(field);
      List<Map<String, DataType>> t = map.computeIfAbsent(dataType, k -> new ArrayList<>());
      t.add(result);
    }
    return map;
  }

  private boolean ensureGroupItemInTableItem(String tableName, String field) {
    List<Item> items = tableMaps.get(tableName).getDefinition().getItems();
    Set<String> set = items.stream().map(Item::getName).collect(Collectors.toSet());
    return set.contains(field);
  }

  private List<Map<String, DataType>> getAggregationResult(SQLSelect select, List<Map<String, DataType>> results, List<String> queries) {
    List<Map<String, DataType>> finalResults = new ArrayList<>();
    HashMap<String, DataType> map = new HashMap<>();
    for (String s : queries) {
      DataType eval = eval(select.getTableName(), s, new HashMap<>(), results, EvalType.EXPRESSION);
      if (eval == null) {
        errMsg = s + " can not be evaluated";
        return null;
      }
      map.put(s, eval);
    }
    finalResults.add(map);
    return finalResults;
  }

  private List<Map<String, DataType>> getNoneAggregationResult(SQLSelect select, List<Map<String, DataType>> results, List<String> queries) {
    List<Map<String, DataType>> finalResults = new ArrayList<>();
    for (Map<String, DataType> result : results) {
      HashMap<String, DataType> map = new HashMap<>();
      for (String s : queries) {
        DataType eval = eval(select.getTableName(), s, result, results, EvalType.EXPRESSION);
        if (eval == null) {
          errMsg = s + " can not be evaluated";
          return null;
        }
        map.put(s, eval);
      }
      finalResults.add(map);
    }
    return finalResults;
  }

  private boolean isAggregation(List<String> queries) throws IOException {
    for (String query : queries) {
      ByteArrayInputStream stream = new ByteArrayInputStream(query.getBytes(StandardCharsets.UTF_8));
      ByteCodeGenerator generator = Eval.ITEMExpression(stream);
      if (generator.getAggregations().size() != 0)
        return true;
    }
    return false;
  }

  private boolean isAllAggregation(List<String> queries) throws IOException {
    for (String query : queries) {
      ByteArrayInputStream stream = new ByteArrayInputStream(query.getBytes(StandardCharsets.UTF_8));
      ByteCodeGenerator generator = Eval.ITEMExpression(stream);
      if (generator.getAggregations().size() == 0)
        return false;
    }
    return true;
  }

  private boolean extractDataFromSingleRow(List<Map<String, DataType>> results, List<String> query, Map<String, DataType> map) {
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
      List<Map<String, DataType>> maps = loadMaps(update.getTableName());
      Bool eval = (Bool)eval(table.getDefinition().getTableName(),
              condition, map, maps);
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
      List<Map<String, DataType>> maps = loadMaps(delete.getTableName());
      Bool eval = (Bool)eval(delete.getTableName(),
              condition, map, maps);
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

  private List<Map<String, DataType>> loadMaps(String tableName) {
    Table table = tableMaps.get(tableName);
    if (table.getMaps() == null) {
      List<Map<String, DataType>> maps = data2Map(tableName, table.getTableData());
      table.setMaps(maps);
    }
    return table.getMaps();
  }

  private List<Map<String, DataType>> data2Map(String tableName,
                                               List<List<DataType>> data){
    List<Map<String, DataType>>  maps = new ArrayList<>();
    data.forEach(x-> {
      maps.add(list2Map(tableName, x));
    });
    return maps;
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

  private void updateMaps(String tableName,
                          List<List<DataType>> data) {
    Table table = tableMaps.get(tableName);
    List<Map<String, DataType>> maps = table.getMaps();
    data.forEach(x -> {
      Map<String, DataType> map = list2Map(tableName, x);
      maps.add(map);
    });
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

  private DataType eval(String tableName, String code,
                        Map<String, DataType> map,
                        List<Map<String, DataType>> data) {
    return eval(tableName, code, map, data, EvalType.CONDITION);
  }

  private DataType eval(String tableName, String code,
                        Map<String, DataType> map,
                        List<Map<String, DataType>> data, EvalType type) {
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    ByteCodeGenerator generator;
    try {
      if (type == EvalType.CONDITION) {
        generator = Eval.SQLExpression(inputStream);
      } else {
        generator = Eval.ITEMExpression(inputStream);
      }
    } catch (Exception e) {
      errMsg = e.getMessage();
      return null;
    }
    if (!doLoadAggregation(tableName, generator , map, data))
      return null;
    try {
      return Eval.eval(generator.getByteCodes(), map);
    } catch (Exception e) {
      errMsg = e.getMessage();
      return null;
    }
  }

  private boolean doLoadAggregation(String tableName,
                                    ByteCodeGenerator generator,
                                    Map<String, DataType> map,
                                    List<Map<String, DataType>> data) {
    if (generator.getAggregations().size() == 0)
      return true;
    Table table = tableMaps.get(tableName);
    Set<String> items = table.getDefinition().getItems().stream().map(
            Item::getName
    ).collect(Collectors.toSet());
    List<ByteCodeGenerator.Aggregation> aggregations = generator.getAggregations();
    for (ByteCodeGenerator.Aggregation aggregation : aggregations) {
      if (items.contains(aggregation.getVarName())) {
        ByteCodeGenerator.AggType type = aggregation.getType();
        switch (type) {
          case AVG:
            DataType avg = doAvgAggregation(data, aggregation.getVarName());
            map.put("__agg__avg__" + aggregation.getVarName(), avg);
            break;
          case MIN:
            DataType min = doMinAggregation(data, aggregation.getVarName());
            map.put("__agg__min__" + aggregation.getVarName(), min);
            break;
          case MAX:
            DataType max = doMaxAggregation(data, aggregation.getVarName());
            map.put("__agg__max__" + aggregation.getVarName(), max);
            break;
          case COUNT:
            DataType count = doCountAggregation(data, aggregation.getVarName());
            map.put("__agg__count__" + aggregation.getVarName(), count);
            break;
        }
      }else {
        errMsg = aggregation.getVarName() + " not in table \"" + tableName + "\";";
        return false;
      }
    }
    return true;
  }

  private DataType doMinAggregation(List<Map<String, DataType>> data, String item) {
    DataType dataType = data.get(0).get(item);
    if (dataType instanceof Float) {
      float min = Utils.dataToFloat(dataType);
      Float ans = new Float((char) 1, min);
      data.forEach(x-> {
        float t = Utils.dataToFloat(x.get(item));
        if (ans.getVal() > t)
          ans.setVal(t);
      });
      return ans;
    }else if (dataType instanceof Int) {
      int min = Utils.dataToInt(dataType);
      Int ans = new Int((char) 0, min);
      data.forEach(x-> {
        int t = Utils.dataToInt(x.get(item));
        if (ans.getVal() > t)
          ans.setVal(t);
      });
      return ans;
    }
    return null;
  }

  private DataType doCountAggregation(List<Map<String, DataType>> data, String item) {
    Int ret = new Int((char) 0, 0);
    ret.setVal(data.size());
    return ret;
  }

  private DataType doMaxAggregation(List<Map<String, DataType>> data, String item) {
    DataType dataType = data.get(0).get(item);
    if (dataType instanceof Float) {
      float min = Utils.dataToFloat(dataType);
      Float ans = new Float((char) 1, min);
      data.forEach(x-> {
        float t = Utils.dataToFloat(x.get(item));
        if (ans.getVal() < t)
          ans.setVal(t);
      });
      return ans;
    }else if (dataType instanceof Int) {
      int min = Utils.dataToInt(dataType);
      Int ans = new Int((char) 0, min);
      data.forEach(x-> {
        int t = Utils.dataToInt(x.get(item));
        if (ans.getVal() < t)
          ans.setVal(t);
      });
      return ans;
    }
    return null;
  }

  private DataType doAvgAggregation(List<Map<String, DataType>> data, String item) {
    DataType dataType = data.get(0).get(item);
    if (dataType instanceof Float) {
      float min = Utils.dataToFloat(dataType);
      Float ans = new Float((char) 1, min);
      data.forEach(x-> {
        float t = Utils.dataToFloat(x.get(item));
        ans.setVal(ans.getVal() + t);
      });
      ans.setVal(ans.getVal() / data.size());
      return ans;
    }else if (dataType instanceof Int) {
      int min = 0;
      Float ans = new Float((char) 1, min);
      for (Map<String, DataType> x : data) {
        int t = Utils.dataToInt(x.get(item));
        min += t;
      }
      ans.setVal((float) min / data.size());
      return ans;
    }
    return null;
  }

  public enum EvalType {
    CONDITION, EXPRESSION
  }
}
