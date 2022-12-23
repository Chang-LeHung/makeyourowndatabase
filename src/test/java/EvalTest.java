
import org.junit.Test;
import sql.evaluator.bytecode.Eval;
import sql.evaluator.bytecode.bytecodes.ByteCode;
import sql.evaluator.bytecode.data.DataType;
import sql.evaluator.bytecode.data.Int;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EvalTest {


  @Test
  public void testEval() throws IOException {
    String code = "1+2+3*4.345 - (5 - 6 / 2.3)";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    List<ByteCode> byteCodes = Eval.expressionCodeGen(inputStream);
    for (ByteCode byteCode : byteCodes) {
      System.out.println(byteCode);
    }
  }

  @Test
  public void testEvalConditions() throws IOException {
    String code = "1 > 2 and 1 > max(1, 2, 3, 4)";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    List<ByteCode> byteCodes = Eval.conditionsCodeGen(inputStream);
    for (ByteCode byteCode : byteCodes) {
      System.out.println(byteCode);
    }
  }

  @Test
  public void exprRun() throws IOException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
    String code = "1+2+3*4.345 - (5 - 6 / 2.3)";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    List<ByteCode> byteCodes = Eval.expressionCodeGen(inputStream);
    DataType eval = Eval.eval(byteCodes, null);
    System.out.println(eval);
  }

  @Test
  public void conditionRun() throws IOException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
    String code = "1 > 2 or 3 > 2";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    List<ByteCode> byteCodes = Eval.conditionsCodeGen(inputStream);
    DataType eval = Eval.eval(byteCodes, null);
    System.out.println(eval);
  }

  @Test
  public void varTest() throws IOException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
    String code = "a + b > len('changlehung')";
    HashMap<String, DataType> map = new HashMap<>();
    map.put("a", new Int((char) 0, 2));
    map.put("b", new Int((char) 0, 2));
    map.put("c", new Int((char) 0, 10));
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    List<ByteCode> byteCodes = Eval.conditionsCodeGen(inputStream);
    for (ByteCode byteCode : byteCodes) {
      System.out.println(byteCode);
    }
    DataType eval = Eval.eval(byteCodes, map);
    System.out.println(eval);
  }
}
