package sql.evaluator.bytecode;

import sql.evaluator.bytecode.data.Bool;
import sql.evaluator.bytecode.data.DataType;
import sql.evaluator.bytecode.data.Int;
import sql.evaluator.bytecode.data.StringData;

import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

public class FunctionCall {

  public static void min(Stack<DataType> stack, int nParams) {
    if (nParams < 1)
      throw new RuntimeException("function min's parameters should grater than 1");
    DataType pop = stack.pop();
    for (int i = 0; i < nParams - 1; ++i) {
      if (!Utils.compare(pop, stack.peek()))
        pop = stack.pop();
      else
        stack.pop();
    }
    stack.push(pop);
  }

  public static void count(Stack<DataType> stack, int nParams) {
    // this can be an empty function
  }

  public static void avg(Stack<DataType> stack, int nParams) {
    // this can be an empty function
  }


  public static void max(Stack<DataType> stack, int nParams) {
    if (nParams < 1)
      throw new RuntimeException("function min's parameters should grater than 1");
    DataType pop = stack.pop();
    for (int i = 0; i < nParams - 1; ++i) {
      if (Utils.compare(pop, stack.peek()))
        pop = stack.pop();
      else
        stack.pop();
    }
    stack.push(pop);
  }

  public static void len(Stack<DataType> stack, int nParams) {
    StringData pop = (StringData)stack.pop();
    stack.push(new Int((char) 0, pop.getParam().length()));
  }

  public static void like(Stack<DataType> stack, int nParams) {
    StringData o1 = (StringData)stack.pop();
    StringData o2 = (StringData)stack.pop();
    String pattern = o1.getParam();
    String param = o2.getParam();
    pattern = pattern.replace("%", ".*").replace('_', '.');
    boolean b = Pattern.matches(pattern, param);
    Bool bool = new Bool((char) 3, b);
    stack.push(bool);
  }

}
