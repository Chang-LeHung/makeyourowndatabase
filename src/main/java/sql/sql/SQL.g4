


grammar SQL;

options { caseInsensitive = true; }

statement: create                                           # DoCreate
           | select                                         # DoSelect
           | insert                                         # DoInsert
           | update                                         # DoUpdate
           | delete                                         # DoDelete
           ;

create: CREATE TABLE ID '('
        item*
        ((pkeys ',' rkeys) | pkeys)
        ')' ';'                                             # SQLCreate
        ;

select: SELECT ('*' | (expression (',' expression)*))
        FROM ID where? groupby?  having? ';'                # SQLSelect
        ;


insert: INSERT INTO ID '(' ID (',' ID)*')'
        VALUES group ';'                 # SQLInsertOne
        |INSERT INTO ID '('ID (',' ID)*')'
        VALUES '(' group (',' group)* ')' ';'           # SQLInsertMany
        ;

update: UPDATE ID SET assign (',' assign)* where ';'        # SQLUpdate
        ;

delete: DELETE FROM ID where                                # SQLDelete
        ;

assign: ID '=' data                                         # UpdateAssign
        ;

group: '(' data (',' data)* ')';

data: '\'' ID '\''
      | '"' ID '"'
      | ID
      | MFLOAT
      | MINT
      ;

itemexpre: ID                                                # OrdinaryItem
           | ID '(' ID ')'                                   # FunctionItem
           ;

where: WHERE conditions                                      # WhereCondition
       ;
having: HAVING conditions                                    # HavingCondition
       ;

groupby: GROUP BY ID                                         # GroupByImpl
         ;

pkeys: (PRIMARY KEY '(' ID (',' ID)? ')')?                   # PrimaryKey
      ;

rkeys: (fk rk)?
      ;

fk: FOREIGN KEY '(' ID (',' ID)? ')'                         # ForeignKey
    ;
rk: REFERENCE ID '(' ID (',' ID)? ')'                        # ReferenceKey
    ;

item: ID TYPE ('('MINT')')? constrain? ','                   # SingleItem
      ;

constrain: PRIMARY KEY
           | UNIQUE
           | NOT NULL
           ;



conditions: '(' conditions ')'
    | conditions AND conditions
    | conditions OR conditions
    | '!' conditions
    | condition
    ;

condition: expression '>' expression
    | expression '<' expression
    | expression '>=' expression
    | expression '<=' expression
    | expression '==' expression
    | expression '!=' expression
    ;

expression: expression op=('*'|'/') expression
    | expression op=('+'|'-') expression
    | MINT
    | '-' MINT
    | ID
    | '\'' ID '\''
    | '"' ID '"'
    | ID '(' ID ')'
    | '(' expression ')'
    | MFLOAT
    ;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
AND: 'and';
OR: 'or';

MINT: [1-9][0-9]*;
MFLOAT: '.'[0-9]+
    | '0.'[0-9]+
    | MINT '.' [0-9]+
    ;

CREATE: 'create';
SELECT: 'select';
DELETE: 'delete';
INSERT: 'insert';
UPDATE: 'update';
TABLE: 'table';
WHERE: 'where';
GROUP: 'group';
HAVING: 'having';
BY: 'by';
SET: 'set';
INTO: 'into';
FROM: 'from';
NOT: 'not';
VALUES: 'values';
VALUE: 'value';
NULL: 'null';
UNIQUE: 'unique';
FOREIGN: 'foreign';
REFERENCE: 'references';

TYPE: FLOAT
     | INT
     | CHAR
     | VARCHAR
     | STRING
     ;


PRIMARY: 'primary';
KEY: 'key';
FLOAT: 'float';
INT: 'int';
CHAR: 'char';
VARCHAR: 'varchar';
STRING: 'string';

ID: [_a-z0-9]+;

WS: [ \t\n] -> skip;
