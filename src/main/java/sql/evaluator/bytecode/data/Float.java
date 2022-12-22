package sql.evaluator.bytecode.data;

public class Float extends DataType{
  private float val;

  public float getVal() {
    return val;
  }

  @Override
  public String toString() {
    return "Float{" +
            "val=" + val +
            '}';
  }

  public void setVal(float val) {
    this.val = val;
  }

  public Float(char dataType, float val) {
    super(dataType);
    this.val = val;
  }

  public Float(char dataType) {
    super(dataType);
  }
}
