import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import sql.sql.SQLLexer;
import sql.sql.SQLParser;
import sql.sql.statement.SQLObjectGenerator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SQLTest {


  @Test
  public void createTest() throws IOException {
    String code = "create TAble sc (\n" +
            "        sno int primary key,\n" +
            "        cno int not null,\n" +
            "        grade int unique,\n" +
            "        primary key(sno,cno),\n" +
            "        foreign key (sno) references student(sno)\n" +
            "   );";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    ANTLRInputStream stream = new ANTLRInputStream(inputStream);
    SQLLexer lexer = new SQLLexer(stream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    SQLParser parser = new SQLParser(tokenStream);
    SQLParser.StatementContext statement = parser.statement();

    SQLObjectGenerator objectGenerator = new SQLObjectGenerator();
    objectGenerator.visit(statement);
    System.out.println(objectGenerator.getCreate());
  }


  @Test
  public void selectTest() throws IOException {
    String code = "select min(id), name, age from student\n" +
            "where age > 18 and age < 50 group by class\n" +
            "having data > 1000;";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    ANTLRInputStream stream = new ANTLRInputStream(inputStream);
    SQLLexer lexer = new SQLLexer(stream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    SQLParser parser = new SQLParser(tokenStream);
    SQLParser.StatementContext statement = parser.statement();

    SQLObjectGenerator objectGenerator = new SQLObjectGenerator();
    objectGenerator.visit(statement);
    System.out.println(objectGenerator.getSelect());
  }

  @Test
  public void insertTest() throws IOException {
    String code = "insert into student(sno,name,age) values((9,zyang,18), (9,'zyang',17), (9,'zyang',16));";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    ANTLRInputStream stream = new ANTLRInputStream(inputStream);
    SQLLexer lexer = new SQLLexer(stream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    SQLParser parser = new SQLParser(tokenStream);
    SQLParser.StatementContext statement = parser.statement();

    SQLObjectGenerator objectGenerator = new SQLObjectGenerator();
    objectGenerator.visit(statement);
    System.out.println(objectGenerator.getInsert());
  }

  @Test
  public void updateTest() throws IOException {
    String code = "update student set id=100, name='huchang' where name > 100;";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    ANTLRInputStream stream = new ANTLRInputStream(inputStream);
    SQLLexer lexer = new SQLLexer(stream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    SQLParser parser = new SQLParser(tokenStream);
    SQLParser.StatementContext statement = parser.statement();

    SQLObjectGenerator objectGenerator = new SQLObjectGenerator();
    objectGenerator.visit(statement);
    System.out.println(objectGenerator.getUpdate());

    System.out.println(parser.isMatchedEOF());
  }

  @Test
  public void deleteTest() throws IOException {
    String code = "delete from student where name ==\"huchang\"";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    ANTLRInputStream stream = new ANTLRInputStream(inputStream);
    SQLLexer lexer = new SQLLexer(stream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    SQLParser parser = new SQLParser(tokenStream);
    SQLParser.StatementContext statement = parser.statement();

    SQLObjectGenerator objectGenerator = new SQLObjectGenerator();
    objectGenerator.visit(statement);
    System.out.println(objectGenerator.getDelete());
  }

  @Test
  public void insertOne() throws IOException {
    String code = "insert into student(sno,name,age) values(9,'zyang',18);";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(code.getBytes(StandardCharsets.UTF_8));
    ANTLRInputStream stream = new ANTLRInputStream(inputStream);
    SQLLexer lexer = new SQLLexer(stream);
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    SQLParser parser = new SQLParser(tokenStream);
    SQLParser.StatementContext statement = parser.statement();

    SQLObjectGenerator objectGenerator = new SQLObjectGenerator();
    objectGenerator.visit(statement);
    System.out.println(objectGenerator.getInsert());
  }

}
