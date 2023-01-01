package sql.sql.semantic;

import sql.sql.statement.sqlobject.SQLSelect;

public class SelectChecker implements Checker{

  private SQLSelect select;
  private String errMsg;
  public SQLSelect getSelect() {
    return select;
  }

  public void setSelect(SQLSelect select) {
    this.select = select;
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
