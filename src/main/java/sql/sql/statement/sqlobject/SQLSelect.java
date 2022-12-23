package sql.sql.statement.sqlobject;

import java.util.List;

public class SQLSelect extends SQLBase{


  private String tableName;
  private List<Filed> fields;
  private String where;
  private String groupByField;
  private String having;

  public List<Filed> getFields() {
    return fields;
  }

  @Override
  public String toString() {
    return "SQLSelect{" +
            "tableName='" + tableName + '\'' +
            ", fields=" + fields +
            ", where='" + where + '\'' +
            ", groupByField='" + groupByField + '\'' +
            ", having='" + having + '\'' +
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
