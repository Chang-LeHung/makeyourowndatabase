package sql.sql.statement;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorListener extends BaseErrorListener {
  private boolean errorOccurred;

  public boolean isErrorOccurred() {
    return errorOccurred;
  }

  public void setErrorOccurred(boolean errorOccurred) {
    this.errorOccurred = errorOccurred;
  }

  @Override
  public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
    super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
    errorOccurred = true;
  }
}
