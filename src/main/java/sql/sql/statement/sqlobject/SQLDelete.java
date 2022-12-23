package sql.sql.statement.sqlobject;

public class SQLDelete extends SQLBase{

  private String tableName;
  private String condition;

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  @Override
  public String toString() {
    return "SQLDelete{" +
            "tableName='" + tableName + '\'' +
            ", condition='" + condition + '\'' +
            '}';
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }
}
