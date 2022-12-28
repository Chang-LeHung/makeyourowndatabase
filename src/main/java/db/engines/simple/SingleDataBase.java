package db.engines.simple;

import db.actions.DBOperations;
import sql.evaluator.bytecode.Eval;
import sql.evaluator.bytecode.bytecodes.ByteCode;
import sql.evaluator.bytecode.data.DataType;
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

  private List<String> tables;

  private Map<String, Table> tableMaps;

  public SingleDataBase(String dir) {
    this.dir = dir;
    tables = new CopyOnWriteArrayList<>();
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

  public List<String> getTables() {
    return tables;
  }

  public void setTables(List<String> tables) {
    this.tables = tables;
  }

  @Override
  public HashMap<String, Object> doSelect(SQLSelect select) {
    if (!ensureExist(select.getTableName()))
      return null;
    return null;
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
      errMsg = e.getMessage();
      return false;
    }
    tableMaps.put(definition.getTableName(), table);
    return true;
  }

  @Override
  public boolean doUpdate(SQLUpdate update) {
    if (!ensureExist(update.getTableName()))
      return false;
    return true;
  }

  @Override
  public boolean doDelete(SQLDelete delete) {
    if (!ensureExist(delete.getTableName()))
      return false;
    return true;
  }

  @Override
  public boolean doInsert(SQLInsert insert) {
    if (!ensureExist(insert.getTableName()))
      return false;
    return true;
  }

  private boolean ensureExist(String table) {
    if (!isExisted(table)) {
      errMsg = "table not exists";
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
    List<List<Object>> data = Table.load(table + ".da");
    TableDefinition definition = TableDefinition.load(table + ".def");
    Table tableData = new Table(definition, data);
    tableMaps.put(table, tableData);
  }

  private boolean isExisted(String fileName) {
    return files.contains(fileName + ".da");
  }

  public String getErrMsg() {
    return errMsg;
  }

  public DataType eval(String code, Map<String, DataType> map) {
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    List<ByteCode> byteCodes;
    try {
      byteCodes = Eval.conditionsCodeGen(inputStream);
    } catch (IOException e) {
      errMsg = "some I/O error occurred";
      return null;
    }
    try {
      return Eval.eval(byteCodes, map);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      errMsg = "no such function";
      return null;
    }
  }
}
