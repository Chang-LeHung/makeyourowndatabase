import db.engines.simple.SingleDataBase;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import sql.evaluator.bytecode.data.DataType;
import sql.sql.SQLLexer;
import sql.sql.SQLParser;
import sql.sql.statement.ErrorListener;
import sql.sql.statement.SQLObjectGenerator;
import sql.sql.statement.sqlobject.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DataBase {

  private final SingleDataBase database;
  private final SQLObjectGenerator generator;
  private final PrintStream out;
  private final ErrorListener listener;

  public DataBase(String dir) {
    this(dir, System.out);
  }

  public DataBase(String dir, PrintStream stream) {
    database = new SingleDataBase(dir);
    generator = new SQLObjectGenerator();
    out = stream;
    listener = new ErrorListener();
  }

  public void execute(String statement) throws IOException {
    ANTLRInputStream antlrInputStream = new ANTLRInputStream(new ByteArrayInputStream(statement.getBytes(StandardCharsets.UTF_8)));
    SQLLexer lexer = new SQLLexer(antlrInputStream);
    CommonTokenStream stream = new CommonTokenStream(lexer);
    SQLParser parser = new SQLParser(stream);
    parser.addErrorListener(listener);
    SQLParser.StatementContext context = parser.statement();
    generator.visit(context);
    if (listener.isErrorOccurred()) {
      listener.setErrorOccurred(false);
      return;
    }
    if (!doExecute())
      printFailed("Execute Error;");
  }

  private boolean doExecute() {
    if (generator.isCreate()) {
      SQLCreate create = generator.getCreate();
      Objects.requireNonNull(create);
      if (database.doCreate(create)) {
        printSuccessfully("Create table " + create.gettableName() + " OK;" );
      }else {
        printFailed(database.getErrMsg());
        return false;
      }
    }else if (generator.isSelect()) {
      SQLSelect select = generator.getSelect();
      Objects.requireNonNull(select);
      List<Map<String, DataType>> maps = database.doSelect(select);
      if (maps == null){
        printFailed(database.getErrMsg());
        return false;
      }
      else {
        for (Map<String, DataType> map : maps) {
          out.println(map);
        }
        printSuccessfully("Size of this table : " + maps.size());
      }
    }else if (generator.isDelete()) {
      SQLDelete delete = generator.getDelete();
      Objects.requireNonNull(delete);
      if (database.doDelete(delete)) {
        printSuccessfully("Delete OK;");
      }else {
        printFailed(database.getErrMsg());
        return false;
      }
    }else if (generator.isUpdate()) {
      SQLUpdate update = generator.getUpdate();
      Objects.requireNonNull(update);
      if (database.doUpdate(update)) {
        printSuccessfully("Update OK;");
      }else {
        printFailed(database.getErrMsg());
        return false;
      }
    }else if (generator.isInsert()) {
      SQLInsert insert = generator.getInsert();
      Objects.requireNonNull(insert);
      if (database.doInsert(insert)) {
        printSuccessfully("Insert OK;");
      }else {
        printFailed(database.getErrMsg());
        return false;
      }
    }else {
      throw new RuntimeException("state error");
    }
    return true;
  }

  public void printSuccessfully(String s) {
    out.printf("\033[32;1m%s\033[0m\n", s);
  }

  public void printFailed(String s) {
    out.printf("\033[31;1m%s\033[0m\n", s);
  }

  public static void outSuccessfully(String s) {
    System.out.printf("\033[32;1m%s\033[0m\n", s);
  }

  public void outFailed(String s) {
    System.out.printf("\033[31;1m%s\033[0m\n", s);
  }
}
