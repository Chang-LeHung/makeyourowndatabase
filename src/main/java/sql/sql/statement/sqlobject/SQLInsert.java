package sql.sql.statement.sqlobject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQLInsert extends SQLBase{

  private String tableName;
  private List<Map<String, Object>> assigns;

  public String getTableName() {
    return tableName;
  }

  @Override
  public String toString() {
    return "SQLInsert{" +
            "tableName='" + tableName + '\'' +
            ", assigns=" + assigns +
            '}';
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public List<Map<String, Object>> getAssigns() {
    return assigns;
  }

  public void setAssigns(List<Map<String, Object>> assigns) {
    this.assigns = assigns;
  }

  public void clean() {
    assigns.clear();
  }

}
