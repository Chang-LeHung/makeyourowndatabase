package sql.evaluator.bytecode.data;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Float aFloat = (Float) o;
    return java.lang.Float.compare(aFloat.val, val) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), val);
  }

  public Float(char dataType) {
    super(dataType);
  }
}
