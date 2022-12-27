package db.engines.simple;

import db.actions.DBOperations;
import sql.sql.statement.sqlobject.*;

import java.util.HashMap;
import java.util.List;

/**
 * table definition suffix : .def
 * table data suffix       : .da
 * a database with an unique dir
 */
public class SingleDataBase implements DBOperations {

  /* directory of this database */
  private String dir;

  private List<String> tables;

  public SingleDataBase(String dir, List<String> tables) {
    this.dir = dir;
    this.tables = tables;
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
    return null;
  }

  @Override
  public void doCreate(SQLCreate create) {

  }

  @Override
  public void doUpdate(SQLUpdate update) {

  }

  @Override
  public void doDelete(SQLDelete delete) {

  }

  @Override
  public void doInsert(SQLInsert insert) {

  }
}
