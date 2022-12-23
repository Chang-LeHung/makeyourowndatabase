package sql.evaluator.bytecode;

import sql.evaluator.bytecode.data.DataType;
import sql.evaluator.bytecode.data.Float;
import sql.evaluator.bytecode.data.Int;

public class Utils {

  public static float dataToFloat(DataType data) {
    if (data instanceof Int){
      int val = ((Int) data).getVal();
      return (float) val;
    } else if (data instanceof Float){
      return ((Float) data).getVal();
    }
    throw new RuntimeException("parameter should be float or int");
  }

  public static int dataToInt(DataType data) {
    return ((Int)data).getVal();
  }

  /**
   *
   * @param o1 data 1
   * @param o2 data 2
   * @return o1 < o2
   */
  public static boolean compare(DataType o1, DataType o2) {
    if (o1 instanceof Int) {
      int i1 = ((Int)o1).getVal();
      if (o2 instanceof Int) {
        int i2 = ((Int)o1).getVal();
        return i1 < i2;
      }else {
        float i2 = ((Float)o2).getVal();
        return i1 < i2;
      }
    }else {
      float i1 = ((Float)o1).getVal();
      if (o2 instanceof Int) {
        int i2 = ((Int)o2).getVal();
        return i1 < i2;
      }else {
        float i2 = ((Float)o2).getVal();
        return i1 < i2;
      }
    }
  }
}
