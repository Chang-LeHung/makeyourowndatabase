package sql.sql.statement.sqlobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SQLCreate extends SQLBase{

  /* all field will be assign lazily*/
  private String tableName;
  private List<Item> items;
  private List<String> primaryKey;
  private List<String> foreignKey;
  private List<String> references;

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public List<String> getReferences() {
    return references;
  }

  public void setReferences(List<String> references) {
    this.references = references;
  }

  private String foreignTable;


  public List<String> getForeignKey() {
    return foreignKey;
  }

  public void setForeignKey(List<String> foreignKey) {
    this.foreignKey = foreignKey;
  }

  public String getForeignTable() {
    return foreignTable;
  }

  public void setForeignTable(String foreignTable) {
    this.foreignTable = foreignTable;
  }

  public String gettableName() {
    return tableName;
  }

  public void settableName(String tableName) {
    this.tableName = tableName;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public List<String> getPrimaryKey() {
    return primaryKey;
  }

  public void setPrimaryKey(List<String> primaryKey) {
    this.primaryKey = primaryKey;
  }

  @Override
  public String toString() {
    return "SQLCreate{" +
            "tableName='" + tableName + '\'' +
            ", items=" + items +
            ", primaryKey=" + primaryKey +
            ", foreignKey=" + foreignKey +
            ", references=" + references +
            ", foreignTable='" + foreignTable + '\'' +
            '}';
  }
}
