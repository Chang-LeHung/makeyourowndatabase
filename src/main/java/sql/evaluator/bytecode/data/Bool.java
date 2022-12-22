package sql.evaluator.bytecode.data;

public class Bool extends DataType{

  private boolean val;
  public Bool(char dataType) {
    super(dataType);
  }

  public boolean isVal() {
    return val;
  }

  public void setVal(boolean val) {
    this.val = val;
  }

  @Override
  public String toString() {
    return "Bool{" +
            "val=" + val +
            '}';
  }

  public Bool(char dataType, boolean val) {
    super(dataType);
    this.val = val;
  }
}
