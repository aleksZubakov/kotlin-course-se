parser grammar FunParser;

options { tokenVocab=FunLexer; }

// FILE = BLOCK
file: block;

// LITERAL = <define-yourself>
literal: INT_NUM;

// BINARY_EXPR
logical_expr
    : left=arithm_expr op=compare_op right=arithm_expr #LogicalCompareExpr
    | left=logical_expr op=logical_op right=logical_expr #LogicalBinaryExpr
    | LPAREN logical_expr RPAREN #LogicalParensExpr
    | atom #LogicalAtomExpr;

atom
    : ID
    | literal
    | func_invoke;

logical_op: AND | OR;
compare_op: EQUAL | NOTEQUAL | GREATER | GREQUAL | LESS | LEQUAL;

plumin: PLUS | MINUS;
divast: DIVISION | ASTERISK;

arithm_expr : left=arithm_expr op=divast right=arithm_expr #ArithmeticDABinaryExpr
            | left=arithm_expr op=plumin right=arithm_expr #ArithmeticPMBinaryExpr
            | LPAREN arithm_expr RPAREN #ArithmeticParensExpr
            | atom #ArithmeticAtomExpr;

binary_expr
    : logical_expr
    | arithm_expr;

// EXPRESSION = FUNCTION_CALL | BINARY_EXPRESSION | IDENTIFIER | LITERAL | "(" EXPRESSION ")"
expr
    : func_invoke
    | binary_expr
    | ID
    | literal
    | '(' expr ')';


// VARIABLE = "var" IDENTIFIER ("=" EXPRESSION)?
var_def : VAR ID ('=' expr)? ;

// ASSIGNMENT = IDENTIFIER "=" EXPRESSION
var_assign : ID '=' expr ;

// STATEMENT = FUNCTION | VARIABLE | EXPRESSION | WHILE | IF | ASSIGNMENT | RETURN
stmt
    : func_invoke
    | var_def
    | expr
    | while_stmt
    | if_stmt
    | var_assign
    | return_stmt;

// RETURN = "return" EXPRESSION
return_stmt: RETURN expr;

// FUNCTION = "fun" IDENTIFIER "(" PARAMETER_NAMES ")" BLOCK_WITH_BRACES
func_def
    : 'fun' ID '(' func_def_args ')' func_body=block_with_braces;

// PARAMETER_NAMES = IDENTIFIER{,}
func_def_args
    : ID ?
    | ID (',' ID)*;

// IF = "if" "(" EXPRESSION ")" BLOCK_WITH_BRACES ("else" BLOCK_WITH_BRACES)?
if_stmt: IF '(' expr ')' if_body=block_with_braces (ELSE else_body=block_with_braces)?;

// WHILE = "while" "(" EXPRESSION ")" BLOCK_WITH_BRACES
while_stmt: WHILE '(' expr ')' while_body=block_with_braces;


// FUNCTION_CALL = IDENTIFIER "(" ARGUMENTS ")"
func_invoke: ID '(' func_arguments ')';

// ARGUMENTS = EXPRESSION{","}
func_arguments
    : expr?
    | expr (',' expr)*;

// BLOCK_WITH_BRACES = "{" BLOCK "}"
block_with_braces: '{' block '}';

// BLOCK = (STATEMENT)*
block : (stmt)*;