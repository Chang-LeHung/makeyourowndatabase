
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import sql.evaluator.EvaluatorLexer;
import sql.evaluator.EvaluatorParser;
import sql.evaluator.bytecode.ByteCodeGenerator;
import sql.evaluator.bytecode.Eval;
import sql.evaluator.bytecode.bytecodes.ByteCode;
import sql.evaluator.bytecode.data.DataType;
import sql.evaluator.bytecode.data.Float;
import sql.evaluator.bytecode.data.Int;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
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
  public void testEval02() throws IOException {
    String code = "id - 2";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    List<ByteCode> byteCodes = Eval.expressionCodeGen(inputStream);
    for (ByteCode byteCode : byteCodes) {
      System.out.println(byteCode);
    }
  }

  @Test
  public void testEvalConditions() throws IOException {
    String code = "213 > 2 and 2 > max(name)";
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
    String code = "a + b > len(name)";
    HashMap<String, DataType> map = new HashMap<>();
    map.put("a", new Int((char) 0, 2));
    map.put("b", new Int((char) 0, 2));
    map.put("c", new Int((char) 0, 10));
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    List<ByteCode> byteCodes = Eval.conditionsCodeGen(inputStream);
    for (ByteCode byteCode : byteCodes) {
      System.out.println(byteCode);
    }
  }

  @Test
  public void aggTest() throws IOException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
    String code = "avg(a) + min(b) > max(age)";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    List<ByteCode> byteCodes = Eval.conditionsCodeGen(inputStream);
    for (ByteCode byteCode : byteCodes) {
      System.out.println(byteCode);
    }
  }

  @Test
  public void aggDoTest() throws IOException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
    String code = "min(a) + max(b)";
    HashMap<String, DataType> map = new HashMap<>();
    map.put("__agg__min__a", new Int((char) 0, 2));
    Float aFloat = new Float((char) 0);
    aFloat.setVal(21312.3123f);
    map.put("__agg__max__b", aFloat);
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    List<ByteCode> byteCodes = Eval.expressionCodeGen(inputStream);
    for (ByteCode byteCode : byteCodes) {
      System.out.println(byteCode);
    }
    DataType eval = Eval.eval(byteCodes, map);
    System.out.println(eval);
  }

  @Test
  public void newTest() {
    String code = "a + b > len(name)";
    CharStream input = CharStreams.fromString(code);
    EvaluatorLexer lexer = new EvaluatorLexer(input);
    CommonTokenStream stream = new CommonTokenStream(lexer);
    EvaluatorParser parser = new EvaluatorParser(stream);
    EvaluatorParser.ConditionsContext conditions = parser.conditions();
    ByteCodeGenerator generator = new ByteCodeGenerator(new ArrayList<>());
    generator.visit(conditions);
    System.out.println(generator.getByteCodes());
  }

}
