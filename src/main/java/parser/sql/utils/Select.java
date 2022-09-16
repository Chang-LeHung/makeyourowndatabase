package parser.sql.utils;

import java.util.ArrayList;

public class Select extends SQLStatement {

  private ArrayList<String> queryItem;

  private String tableName;

  private ArrayList<QueryCondition> conditions;

  public Select() {
    queryItem = new ArrayList<>();
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public ArrayList<QueryCondition> getConditions() {
    return conditions;
  }

  public void setConditions(ArrayList<QueryCondition> conditions) {
    this.conditions = conditions;
  }
}
