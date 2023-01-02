package sql.evaluator.bytecode.data;

import java.io.Serializable;
import java.util.Objects;

public class DataType implements Serializable, ToStr {

  public static final long serialVersionUID = 3333333L;

  /**
   * dataType
   *  = 0 means int
   *  = 1 means float
   *  = ... for extension
   *  = 2 means string
   */
  private char dataType;

  private Type type;

  @Override
  public String toStr() {
    return "";
  }

  public enum Type{
    INT, FLOAT, BOOL, VARCHAR, CHAR, STRING
  }

  @Override
  public String toString() {
    return "DataType{" +
            "dataType=" + dataType +
            ", type=" + type +
            '}';
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public DataType(char dataType) {
    this.dataType = dataType;
  }

  public void setDataType(char dataType) {
    this.dataType = dataType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataType dataType1 = (DataType) o;
    return dataType == dataType1.dataType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType);
  }

  public char getDataType() {


    return dataType;
  }
}
