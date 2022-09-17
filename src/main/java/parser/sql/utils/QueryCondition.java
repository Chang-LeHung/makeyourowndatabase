package parser.sql.utils;

import java.util.HashMap;

public class QueryCondition extends Node {

  private String identifier;
  private String value;

  public static HashMap<Symbol, String> sy2str = new HashMap<>();

  static {
    sy2str.put(Symbol.GE, ">=");
    sy2str.put(Symbol.LE, "<=");
    sy2str.put(Symbol.LT, "<");
    sy2str.put(Symbol.GT, ">");
    sy2str.put(Symbol.EQUAL, "=");
  }

  public Symbol getSymbol() {
    return symbol;
  }

  public void setSymbol(Symbol symbol) {
    this.symbol = symbol;
  }

  private Symbol symbol;

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {

    this.value = value;
  }

  @Override
  public String toString() {
    return identifier + sy2str.get(symbol) + value;
  }
}
