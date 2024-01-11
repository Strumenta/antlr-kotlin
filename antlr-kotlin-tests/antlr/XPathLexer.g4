lexer grammar XPathLexer;

tokens {
  TokenRef,
  RuleRef
}

Anywhere  : '//';
Root      : '/';
Wildcard  : '*';
Bang      : '!';
Id        : NAME_START_CHAR NAME_CHAR* {
  val text = this.text;

  type = if (text[0].isUpperCase()) {
    Tokens.TokenRef;
  } else {
    Tokens.RuleRef;
  }
};
String    : '\'' .*? '\'';

fragment NAME_CHAR
  : [\p{Ll}\p{Lm}\p{Lo}\p{Lt}\p{Lu}\p{Nl}\p{Pc}\p{Nd}\p{Mc}\p{Mn}\p{Cf}\u0000-\u0008\u000E-\u001B\u007F-\u009F];

fragment NAME_START_CHAR
  : [\p{Ll}\p{Lm}\p{Lo}\p{Lt}\p{Lu}\p{Nl}];
