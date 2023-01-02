package sql.evaluator.bytecode;

import sql.evaluator.bytecode.data.DataType;
import sql.evaluator.bytecode.data.Int;
import sql.evaluator.bytecode.data.StringData;

import java.util.Map;
import java.util.Stack;

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

}
