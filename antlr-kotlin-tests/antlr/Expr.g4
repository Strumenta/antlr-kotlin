grammar Expr;

prog
  : func+
  ;

func
  : 'def' ID '(' arg (',' arg)* ')' body
  ;

body
  : '{' stat+ '}'
  ;

arg
  : ID
  ;

stat
  : expr ';'                 # printExpr
  | ID '=' expr ';'          # assign
  | 'return' expr ';'        # ret
  | ';'                      # blank
  ;

expr
  : expr ('*'|'/') expr      # MulDiv
  | expr ('+'|'-') expr      # AddSub
  | primary                  # prim
  ;

primary
  : INT                      # int
  | ID                       # id
  | '(' expr ')'             # parens
  ;

MUL:      '*';                  // Assigns token name to '*' used above in grammar
DIV:      '/';
ADD:      '+';
SUB:      '-';
RETURN:   'return';
ID:       [a-zA-Z]+;            // Match identifiers
INT:      [0-9]+;               // Match integers
NEWLINE:  '\r'? '\n'  -> skip;  // Return newlines to parser (is end-statement signal)
WS:       [ \t]+      -> skip;  // Toss out whitespace
