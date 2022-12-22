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
}
