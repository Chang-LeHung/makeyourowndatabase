package sql.evaluator.bytecode;

public enum Operator {

  MUL,
  DIV,
  ADD,
  SUB,

  LOAD_VAR,
  LOAD_CONST,
  CALL,

  AND,
  OR,
  NOT,

  EQ,
  LE,
  LT,
  GT,
  GE,
  NE
}
