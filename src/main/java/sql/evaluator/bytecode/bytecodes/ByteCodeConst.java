package sql.evaluator.bytecode.bytecodes;

import sql.evaluator.bytecode.Operator;
import sql.evaluator.bytecode.data.DataType;

public class ByteCodeConst extends ByteCode{
  private DataType dataType;

  public DataType getDataType() {
    return dataType;
  }

  public void setDataType(DataType dataType) {
    this.dataType = dataType;
  }

  @Override
  public String toString() {
    return "ByteCodeConst{" +
            "dataType=" + dataType +
            '}';
  }

  public ByteCodeConst(Operator operator, DataType dataType) {
    super(operator);
    this.dataType = dataType;
  }

  public ByteCodeConst(Operator operator) {
    super(operator);
  }
}
