package sql.evaluator.bytecode.bytecodes;

import sql.evaluator.bytecode.Operator;

import java.util.List;

public class ByteCodeCall extends ByteCode{

  private String functionName;

  private int numParams;

  public int getNumParams() {
    return numParams;
  }

  public void setNumParams(int numParams) {
    this.numParams = numParams;
  }

  public ByteCodeCall(Operator operator) {
    super(operator);
  }

  public String getFunctionName() {
    return functionName;
  }

  @Override
  public String toString() {
    return "ByteCodeCall{" +
            "functionName='" + functionName + '\'' +
            ", numParams=" + numParams +
            '}';
  }

  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }
}
