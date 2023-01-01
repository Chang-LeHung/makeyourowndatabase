package sql.sql.semantic;

import sql.sql.statement.sqlobject.SQLUpdate;

public class UpdateChecker implements Checker{

  private SQLUpdate update;
  private String errMsg;
  public SQLUpdate getUpdate() {
    return update;
  }

  public void setUpdate(SQLUpdate update) {
    this.update = update;
  }

  @Override
  public boolean doCheck() {
    return true;
  }

  @Override
  public void reset() {

  }

  public String getErrMsg() {
    return errMsg;
  }

  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }
}
