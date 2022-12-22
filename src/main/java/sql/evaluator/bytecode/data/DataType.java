package sql.evaluator.bytecode.data;

public class DataType {
  /**
   * dataType
   *  = 0 means int
   *  = 1 means float
   *  = ... for extension
   */
  private char dataType;

  @Override
  public String toString() {
    return "DataType{" +
            "dataType=" + dataType +
            '}';
  }

  public DataType(char dataType) {
    this.dataType = dataType;
  }

  public void setDataType(char dataType) {
    this.dataType = dataType;
  }

  public char getDataType() {
    return dataType;
  }
}
