package sql.sql.statement.sqlobject;

import java.util.Map;

public class SQLUpdate extends SQLBase{

  private String condition;
  private Map<String, Object> map;
  private String tableName;

  public String getTableName() {
    return tableName;
  }

  @Override
  public String toString() {
    return "SQLUpdate{" +
            "condition='" + condition + '\'' +
            ", map=" + map +
            ", tableName='" + tableName + '\'' +
            '}';
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public Map<String, Object> getMap() {
    return map;
  }

  public void setMap(Map<String, Object> map) {
    this.map = map;
  }

  public void clear() {
    map.clear();
  }
}
