


grammar SQL;


create: CREATE TABLE ID '('
        item+
        keys?
        ')'
        ;

keys: (PRIMARY KEY '(' ID (',' ID)? ')')?      # PrimaryKey
      ;

item: (ID ',' TYPE (constrain)?)             # SingleItem
      ;

constrain: PRIMARY KEY
           | UNIQUE
           | NOT NULL
           ;


CREATE: C R E A T E;
SELECT: S E L E C T;
DELETE: D E L E T E;
INSERT: I N S E R T;
TABLE: T A B L E;
NOT: N O T;
NULL: N U L L;
UNIQUE: U N I Q U E;

ID: [A-Za-z]+;
TYPE: FLOAT | INT | CHAR | VARCHAR;

PRIMARY: P R I M A R Y;
KEY: K E Y;
FLOAT: F L O A T;
INT: I N T;
CHAR: C H A R;
VARCHAR: V A R C H A R;

fragment A:[aA];
fragment B:[bB];
fragment C:[cC];
fragment D:[dD];
fragment E:[eE];
fragment F:[fF];
fragment G:[gG];
fragment H:[hH];
fragment I:[iI];
fragment J:[jJ];
fragment K:[kK];
fragment L:[lL];
fragment M:[mM];
fragment N:[nN];
fragment O:[oO];
fragment P:[pP];
fragment Q:[qQ];
fragment R:[rR];
fragment S:[sS];
fragment T:[tT];
fragment U:[uU];
fragment V:[vV];
fragment W:[wW];
fragment X:[xX];
fragment Y:[yY];
fragment Z:[zZ];
