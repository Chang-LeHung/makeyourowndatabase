package sql.sql.statement.sqlobject;

import java.util.List;

public class SQLSelect extends SQLBase{


  private String tableName;
  private List<Filed> fields;
  private String where;
  private String groupByField;
  private String having;
  private List<String> items;

  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public List<Filed> getFields() {
    return fields;
  }

  @Override
  public String toString() {
    return "SQLSelect{" +
            "tableName='" + tableName + '\'' +
            ", where='" + where + '\'' +
            ", groupByField='" + groupByField + '\'' +
            ", having='" + having + '\'' +
            ", items=" + items +
            '}';
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public void setFields(List<Filed> fields) {
    this.fields = fields;
  }

  public String getWhere() {
    return where;
  }

  public void setWhere(String where) {
    this.where = where;
  }

  public String getGroupByField() {
    return groupByField;
  }

  public void setGroupByField(String groupByField) {
    this.groupByField = groupByField;
  }

  public String getHaving() {
    return having;
  }

  public void setHaving(String having) {
    this.having = having;
  }

  public void clean() {
    fields.clear();
  }
}
