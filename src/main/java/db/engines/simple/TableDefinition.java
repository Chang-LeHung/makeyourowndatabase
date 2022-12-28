package db.engines.simple;

import sql.sql.statement.sqlobject.Item;

import java.io.*;
import java.util.List;

public class TableDefinition implements Serializable {

  public static final long serialVersionUID = 1111111111L;

  /* table name*/
  private String tableName;

  private List<Item> items;

  /* primary key */
  private List<String> pk;

  /* foreign key*/
  private List<String> fk;

  /* foreign table name*/
  private String foreignTable;


  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public List<String> getPk() {
    return pk;
  }

  public void setPk(List<String> pk) {
    this.pk = pk;
  }

  public List<String> getFk() {
    return fk;
  }

  public void setFk(List<String> fk) {
    this.fk = fk;
  }

  public String getForeignTable() {
    return foreignTable;
  }

  public void setForeignTable(String foreignTable) {
    this.foreignTable = foreignTable;
  }

  public void dump(String tableName) throws IOException {
    FileOutputStream outputStream = new FileOutputStream(tableName);

    ObjectOutputStream stream = new ObjectOutputStream(outputStream);

    stream.writeObject(this);
    FileDescriptor fd = outputStream.getFD();
    // sync to disk
    fd.sync();
    stream.close();
    outputStream.close();
  }

  public static TableDefinition load(String tableName) throws IOException, ClassNotFoundException {
    FileInputStream inputStream = new FileInputStream(tableName);
    ObjectInputStream stream = new ObjectInputStream(inputStream);
    Object o = stream.readObject();
    stream.close();
    inputStream.close();
    return (TableDefinition) o;
  }
}
