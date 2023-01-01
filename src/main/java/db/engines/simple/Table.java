package db.engines.simple;

import sql.evaluator.bytecode.data.DataType;

import java.io.*;
import java.nio.file.Paths;
import java.util.List;

public class Table {
  public static final long serialVersionUID = 22222222L;

  private TableDefinition definition;

  private List<List<DataType>> tableData;

  private int rowSize;

  public Table(TableDefinition definition, List<List<DataType>> tableData) {
    this.definition = definition;
    this.tableData = tableData;
  }

  public List<List<DataType>> getTableData() {
    return tableData;
  }

  public boolean append(List<DataType> row) {
    if (row.size() != rowSize) return false;
    tableData.add(row);
    return true;
  }

  public void dump(String tableName) throws IOException {
    FileOutputStream outputStream = new FileOutputStream(tableName);

    ObjectOutputStream stream = new ObjectOutputStream(outputStream);

    stream.writeObject(tableData);
    FileDescriptor fd = outputStream.getFD();
    fd.sync();
    stream.close();
    outputStream.close();
  }



  public static List<List<DataType>> load(String tableName) throws IOException, ClassNotFoundException {
    FileInputStream inputStream = new FileInputStream(tableName);
    ObjectInputStream stream = new ObjectInputStream(inputStream);
    Object o = stream.readObject();
    stream.close();
    inputStream.close();
    return (List<List<DataType>>) o;
  }

  public TableDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(TableDefinition definition) {
    this.definition = definition;
  }
}
