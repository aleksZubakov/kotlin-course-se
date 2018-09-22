lexer grammar FunLexer;

fragment WS      : [\t ]+;
fragment NL      : '\r'? '\n'
        | '\r' ;

SKIP_: (WS | NL | EOF) -> skip;

fragment CR
        : '\r'
        ;

fragment LF
        : '\n'
        ;


MultiLineComment
        :  '/*' .*? '*/' -> skip;
LineComment
        :   '//' ~[\r\n]* -> skip;

/* KEYWORDS */
IF      : 'if';
ELSE    : 'else';
WHILE   : 'while';
DO      : 'do';
FUN     : 'fun';
VAR     : 'var';
RETURN  : 'return';

// Арифметическое выражение с операциями: +, -, *, /, %, >, <, >=, <=, ==, !=, ||, &&
/* OPERATORS */
/* ARITHMETIC */
PLUS    : '+';
MINUS   : '-';
ASTERISK: '*';
DIVISION: '/';
MOD     : '%';

/* COMPARE */
EQUAL   : '==';
NOTEQUAL: '!=';
GREATER : '>';
GREQUAL : '>=';
LESS    : '<';
LEQUAL  : '<=';

/* LOGICAL */
AND     : '&&';
OR      : '||';

ASSIGN  : '=';

/* DELIMITERS */
COLON   : ';';
LPAREN  : '(' ;
RPAREN  : ')' ;
LBRACE  : '{';
RBRACE  : '}';
COMMA   : ',';
DOUBLE  : '..';


/* LITERALS */
INT_NUM   : ('0' .. '9')+;

/* IDENTIFICATORS */
ID      : [a-z_][a-z_0-9]*;



