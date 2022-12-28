package sql.sql.semantic;

import sql.sql.statement.sqlobject.SQLInsert;

public class InsertChecker implements Checker{

  private SQLInsert insert;

  public InsertChecker(SQLInsert insert) {
    this.insert = insert;
  }

  @Override
  public boolean doCheck() {
    return true;
  }

  @Override
  public void reset() {
    
  }
}
