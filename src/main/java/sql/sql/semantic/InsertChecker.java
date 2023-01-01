package sql.sql.semantic;

import sql.sql.statement.sqlobject.SQLInsert;

public class InsertChecker implements Checker{

  private SQLInsert insert;
  private String errMsg;
  public SQLInsert getInsert() {
    return insert;
  }

  public void setInsert(SQLInsert insert) {
    this.insert = insert;
  }

  public InsertChecker(SQLInsert insert) {
    this.insert = insert;
  }

  public InsertChecker(){

  }

  public String getErrMsg() {
    return errMsg;
  }

  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }

  @Override
  public boolean doCheck() {
    return true;
  }

  @Override
  public void reset() {
    
  }
}
