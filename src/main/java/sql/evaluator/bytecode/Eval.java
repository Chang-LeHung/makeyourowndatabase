package sql.evaluator.bytecode;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import sql.evaluator.EvaluatorLexer;
import sql.evaluator.EvaluatorParser;
import sql.evaluator.bytecode.bytecodes.ByteCode;
import sql.evaluator.bytecode.bytecodes.ByteCodeCall;
import sql.evaluator.bytecode.bytecodes.ByteCodeConst;
import sql.evaluator.bytecode.bytecodes.ByteCodeLoad;
import sql.evaluator.bytecode.data.DataType;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Eval {

  public static EvaluatorParser commonStep(InputStream inputStream) throws IOException {
    ANTLRInputStream stream = new ANTLRInputStream(inputStream);

    EvaluatorLexer lexer = new EvaluatorLexer(stream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    return new EvaluatorParser(tokenStream);
  }

  public static List<ByteCode> expressionCodeGen(InputStream inputStream) throws IOException {
    EvaluatorParser parser = commonStep(inputStream);
    EvaluatorParser.ExpressionContext context = parser.expression();
    ByteCodeGenerator codeGenerator = new ByteCodeGenerator(new ArrayList<>());
    codeGenerator.visit(context);
    return codeGenerator.getByteCodes();
  }

  public static List<ByteCode> conditionsCodeGen(InputStream inputStream) throws IOException {
    EvaluatorParser parser = commonStep(inputStream);
    EvaluatorParser.ConditionsContext context = parser.conditions();
    ByteCodeGenerator codeGenerator = new ByteCodeGenerator(new ArrayList<>());
    codeGenerator.visit(context);
    return codeGenerator.getByteCodes();
  }

  public static DataType eval(List<ByteCode> byteCodes,
                              Map<String, DataType> namespace) {
    // data stack for virtual machine
    VM vm = new VM(new Stack<>(), namespace);
    for (ByteCode code : byteCodes) {
      switch (code.getOperator()) {
        case MUL:
          vm.doMul();
          break;
        case DIV:
          vm.doDiv();
          break;
        case ADD:
          vm.doAdd();
          break;
        case SUB:
          vm.doSub();
          break;
        case LOAD_VAR:
          vm.doLoadVar(((ByteCodeLoad)code).getVariableName());
          break;
        case LOAD_CONST:
          vm.doLoadConst(((ByteCodeConst)code).getDataType());
          break;
        case CALL:
          ByteCodeCall c = (ByteCodeCall)code;
          vm.doCall(c.getFunctionName(), c.getNumParams());
          break;
        case AND:
          vm.doAnd();
          break;
        case OR:
          vm.doOr();
          break;
        case NOT:
          vm.doNot();
          break;
        case EQ:
          vm.doEQ();
          break;
        case LE:
          vm.doLE();
          break;
        case LT:
          vm.doLT();
          break;
        case GT:
          vm.doGT();
          break;
        case GE:
          vm.doGE();
          break;
        case NE:
          vm.doNE();
          break;
        default:
          throw new RuntimeException("no such bytecode " + code.getOperator());
      }
    }
    if (vm.getStack().isEmpty())
      return null;
    return vm.getStack().pop();
  }
}
