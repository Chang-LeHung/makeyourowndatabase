

grammar Evaluator;

conditions: '(' conditions ')'                                 # ParensCondition
    | conditions AND conditions                                # And
    | conditions OR conditions                                 # Or
    | '!' conditions                                           # Not
    | condition                                                # Single
    ;

condition: expression '>' expression                            # Gt
    | expression '<' expression                                 # Lt
    | expression '>=' expression                                # Ge
    | expression '<=' expression                                # Le
    | expression '==' expression                                # Equal
    | expression '!=' expression                                # NEqual
    ;

expression: expression op=('*'|'/') expression                  # MulDiv
    | expression op=('+'|'-') expression                        # AddSub
    | INT                                                       # PInt
    | '-' INT                                                   # NInt
    | ID                                                        # ID
    | '\'' ID '\''                                              # SingleString
    | '"' ID '"'                                                # DoubleString
    | ID '(' expression (',' expression)* ')'                   # Function
    | '(' expression ')'                                        # Parens
    | FLOAT                                                     # PFloat
    | '-' FLOAT                                                 # NFloat
    ;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
AND: 'and';
OR: 'or';

ID: [a-zA-Z]+;
INT: [1-9][0-9]*;
FLOAT: '.'[0-9]+
    | '0.'[0-9]+
    | INT '.' [0-9]+
    ;
NEWLINE: '\r'?'\n';
WS: [ \t\r\n]+ -> skip;
