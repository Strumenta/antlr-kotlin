parser grammar MiniCalcParser;

options { tokenVocab=MiniCalcLexer; }

miniCalcFile : lines=line+ ;

line      : statement (NEWLINE | EOF) ;

statement : inputDeclaration # inputDeclarationStatement
          | varDeclaration   # varDeclarationStatement
          | assignment       # assignmentStatement
          | print            # printStatement ;

print : PRINT LPAREN expression RPAREN ;

inputDeclaration : INPUT type name=ID ;

varDeclaration : VAR assignment ;

assignment : ID ASSIGN expression ;

expression : left=expression operator=(DIVISION|ASTERISK) right=expression # binaryOperation
           | left=expression operator=(PLUS|MINUS) right=expression        # binaryOperation
           | value=expression AS targetType=type                           # typeConversion
           | LPAREN expression RPAREN                                      # parenExpression
           | ID                                                            # valueReference
           | MINUS expression                                              # minusExpression
           | STRING_OPEN (parts+=stringLiteralContent)* STRING_CLOSE       # stringLiteral
           | INTLIT                                                        # intLiteral
           | DECLIT                                                        # decimalLiteral ;

stringLiteralContent : STRING_CONTENT                                    # constantString
                     | INTERPOLATION_OPEN expression INTERPOLATION_CLOSE # interpolatedValue ;

type : INT     # integer
     | DECIMAL # decimal
     | STRING  # string ;
