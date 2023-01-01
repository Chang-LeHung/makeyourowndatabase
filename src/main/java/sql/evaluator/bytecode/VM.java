package sql.evaluator.bytecode;

import sql.evaluator.bytecode.data.*;
import sql.evaluator.bytecode.data.Float;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Stack;

public class VM {


  private Stack<DataType> stack;
  private Map<String, DataType> namespace;

  public VM(Stack<DataType> stack, Map<String, DataType> namespace) {
    this.stack = stack;
    this.namespace = namespace;
  }

  public void doMul() {
    DataType op2 = stack.pop();
    DataType op1 = stack.pop();
    if (op1 instanceof Float || op2 instanceof Float) {
      float o1 = Utils.dataToFloat(op1);
      float o2 = Utils.dataToFloat(op2);
      stack.push(new Float((char)1, o1 * o2));
    } else {
      int o1 = Utils.dataToInt(op1);
      int o2 = Utils.dataToInt(op2);
      stack.push(new Int((char)0, o1 * o2));
    }
  }

  public void doDiv() {
    DataType op2 = stack.pop();
    DataType op1 = stack.pop();
    if (op1 instanceof Float || op2 instanceof Float) {
      float o1 = Utils.dataToFloat(op1);
      float o2 = Utils.dataToFloat(op2);
      stack.push(new Float((char)1, o1 / o2));
    } else {
      int o1 = Utils.dataToInt(op1);
      int o2 = Utils.dataToInt(op2);
      stack.push(new Int((char)0, o1 / o2));
    }
  }

  public void doAdd() {
    DataType op2 = stack.pop();
    DataType op1 = stack.pop();
    if (op1 instanceof Float || op2 instanceof Float) {
      float o1 = Utils.dataToFloat(op1);
      float o2 = Utils.dataToFloat(op2);
      stack.push(new Float((char)1, o1 + o2));
    } else {
      int o1 = Utils.dataToInt(op1);
      int o2 = Utils.dataToInt(op2);
      stack.push(new Int((char)0, o1 + o2));
    }
  }

  public void doSub() {
    DataType op2 = stack.pop();
    DataType op1 = stack.pop();
    if (op1 instanceof Float || op2 instanceof Float) {
      float o1 = Utils.dataToFloat(op1);
      float o2 = Utils.dataToFloat(op2);
      stack.push(new Float((char)1, o1 - o2));
    } else {
      int o1 = Utils.dataToInt(op1);
      int o2 = Utils.dataToInt(op2);
      stack.push(new Int((char)0, o1 - o2));
    }
  }

  public void doLoadVar(String name) {
    stack.push(namespace.get(name));
  }

  public void doLoadConst(DataType data){
    stack.push(data);
  }

  public void doCall(String name, int nArgs) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Method method = FunctionCall.class.getMethod(name, Stack.class, int.class);
    method.invoke(null, stack, nArgs);
  }

  public void doAnd() {
    Bool op2 = (Bool)stack.pop();
    Bool op1 = (Bool)stack.pop();
    stack.push(new Bool((char) 2, op1.isVal() && op2.isVal()));
  }

  public void doOr() {
    Bool op2 = (Bool)stack.pop();
    Bool op1 = (Bool)stack.pop();
    stack.push(new Bool((char) 2, op1.isVal() || op2.isVal()));
  }

  public void doNot() {
    Bool op1 = (Bool)stack.pop();
    stack.push(new Bool((char) 2, !op1.isVal()));
  }

  public void doEQ() {
    DataType op2 = stack.pop();
    DataType op1 = stack.pop();
    if (op1.getDataType() != op2.getDataType()) {
      stack.push(new Bool((char)3, false));
    }
    else if (op1 instanceof StringData) {
      String s1 = Utils.dataToString(op1);
      String s2 = Utils.dataToString(op2);
      stack.push(new Bool((char)3, s1.equals(s2)));
    }
    else if (op1 instanceof Float || op2 instanceof Float) {
      float o1 = Utils.dataToFloat(op1);
      float o2 = Utils.dataToFloat(op2);
      stack.push(new Bool((char)3, o1 == o2));
    } else {
      int o1 = Utils.dataToInt(op1);
      int o2 = Utils.dataToInt(op2);
      stack.push(new Bool((char)3, o1 == o2));
    }
  }

  public void doLE() {
    DataType op2 = stack.pop();
    DataType op1 = stack.pop();
    if (op1 instanceof Float || op2 instanceof Float) {
      float o1 = Utils.dataToFloat(op1);
      float o2 = Utils.dataToFloat(op2);
      stack.push(new Bool((char)3, o1 <= o2));
    } else {
      int o1 = Utils.dataToInt(op1);
      int o2 = Utils.dataToInt(op2);
      stack.push(new Bool((char)3, o1 <= o2));
    }
  }

  public void doLT() {
    DataType op2 = stack.pop();
    DataType op1 = stack.pop();
    if (op1 instanceof Float || op2 instanceof Float) {
      float o1 = Utils.dataToFloat(op1);
      float o2 = Utils.dataToFloat(op2);
      stack.push(new Bool((char)3, o1 < o2));
    } else {
      int o1 = Utils.dataToInt(op1);
      int o2 = Utils.dataToInt(op2);
      stack.push(new Bool((char)3, o1 < o2));
    }
  }

  public void doGT() {
    DataType op2 = stack.pop();
    DataType op1 = stack.pop();
    if (op1 instanceof Float || op2 instanceof Float) {
      float o1 = Utils.dataToFloat(op1);
      float o2 = Utils.dataToFloat(op2);
      stack.push(new Bool((char)3, o1 > o2));
    } else {
      int o1 = Utils.dataToInt(op1);
      int o2 = Utils.dataToInt(op2);
      stack.push(new Bool((char)3, o1 > o2));
    }
  }

  public void doGE() {
    DataType op2 = stack.pop();
    DataType op1 = stack.pop();
    if (op1 instanceof Float || op2 instanceof Float) {
      float o1 = Utils.dataToFloat(op1);
      float o2 = Utils.dataToFloat(op2);
      stack.push(new Bool((char)3, o1 >= o2));
    } else {
      int o1 = Utils.dataToInt(op1);
      int o2 = Utils.dataToInt(op2);
      stack.push(new Bool((char)3, o1 >= o2));
    }
  }

  public void doNE() {
    DataType op2 = stack.pop();
    DataType op1 = stack.pop();
    if (op1.getDataType() != op2.getDataType()) {
      stack.push(new Bool((char)3, false));
    }
    else if (op1 instanceof StringData) {
      String s1 = Utils.dataToString(op1);
      String s2 = Utils.dataToString(op2);
      stack.push(new Bool((char)3, !s1.equals(s2)));
    }
    else if (op1 instanceof Float || op2 instanceof Float) {
      float o1 = Utils.dataToFloat(op1);
      float o2 = Utils.dataToFloat(op2);
      stack.push(new Bool((char)3, o1 != o2));
    } else {
      int o1 = Utils.dataToInt(op1);
      int o2 = Utils.dataToInt(op2);
      stack.push(new Bool((char)3, o1 != o2));
    }
  }



  public Stack<DataType> getStack() {
    return stack;
  }

  public void setStack(Stack<DataType> stack) {
    this.stack = stack;
  }

  public Map<String, DataType> getNamespace() {
    return namespace;
  }

  public void setNamespace(Map<String, DataType> namespace) {
    this.namespace = namespace;
  }
}
