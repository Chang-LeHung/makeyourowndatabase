package sql.sql.semantic;

import sql.sql.statement.sqlobject.SQLDelete;

public class DeleteChecker implements Checker{
  private String errMsg;
  private SQLDelete delete;

  public SQLDelete getDelete() {
    return delete;
  }

  public void setDelete(SQLDelete delete) {
    this.delete = delete;
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
