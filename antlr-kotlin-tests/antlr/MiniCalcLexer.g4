lexer grammar MiniCalcLexer;

channels { WHITESPACE }

// Whitespace
NEWLINE            : '\r\n' | '\r' | '\n' ;
WS                 : [\t ]+ -> channel(WHITESPACE) ;

// Keywords
INPUT              : 'input' ;
VAR                : 'var' ;
PRINT              : 'print';
AS                 : 'as';
INT                : 'Int';
DECIMAL            : 'Decimal';
STRING             : 'String';

// Identifiers
ID                 : [_]*[a-z][A-Za-z0-9_]* ;

// Literals
INTLIT             : '0'|[1-9][0-9]* ;
DECLIT             : '0'|[1-9][0-9]* '.' [0-9]+ ;

// Operators
PLUS               : '+' ;
MINUS              : '-' ;
ASTERISK           : '*' ;
DIVISION           : '/' ;
ASSIGN             : '=' ;
LPAREN             : '(' ;
RPAREN             : ')' ;

STRING_OPEN        : '"' -> pushMode(MODE_IN_STRING);

UNMATCHED          : . ;

mode MODE_IN_STRING;

ESCAPE_STRING_DELIMITER : '\\"' ;
ESCAPE_SLASH            : '\\\\' ;
ESCAPE_NEWLINE          : '\\n' ;
ESCAPE_SHARP            : '\\#' ;
STRING_CLOSE            : '"' -> popMode ;
INTERPOLATION_OPEN      : '#{' -> pushMode(MODE_IN_INTERPOLATION) ;
STRING_CONTENT          : ~["\n\r\t\\#]+ ;

STR_UNMATCHED           : . -> type(UNMATCHED) ;

mode MODE_IN_INTERPOLATION;

INTERPOLATION_CLOSE       : '}' -> popMode ;

INTERP_WS                 : [\t ]+ -> channel(WHITESPACE), type(WS) ;

// Keywords
INTERP_AS                 : 'as'-> type(AS) ;
INTERP_INT                : 'Int'-> type(INT) ;
INTERP_DECIMAL            : 'Decimal'-> type(DECIMAL) ;
INTERP_STRING             : 'String'-> type(STRING) ;

// Literals
INTERP_INTLIT             : ('0'|[1-9][0-9]*) -> type(INTLIT) ;
INTERP_DECLIT             : ('0'|[1-9][0-9]*) '.' [0-9]+ -> type(DECLIT) ;

// Operators
INTERP_PLUS               : '+' -> type(PLUS) ;
INTERP_MINUS              : '-' -> type(MINUS) ;
INTERP_ASTERISK           : '*' -> type(ASTERISK) ;
INTERP_DIVISION           : '/' -> type(DIVISION) ;
INTERP_ASSIGN             : '=' -> type(ASSIGN) ;
INTERP_LPAREN             : '(' -> type(LPAREN) ;
INTERP_RPAREN             : ')' -> type(RPAREN) ;

// Identifiers
INTERP_ID                 : [_]*[a-z][A-Za-z0-9_]* -> type(ID);

INTERP_STRING_OPEN        : '"' -> type(STRING_OPEN), pushMode(MODE_IN_STRING);

INTERP_UNMATCHED          : . -> type(UNMATCHED) ;
