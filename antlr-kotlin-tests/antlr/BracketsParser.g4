parser grammar BracketsParser;

tokens {
  LEFT, RIGHT
}

options {
  TokenLabelType=BracketToken;
}

@header {
  import com.strumenta.antlrkotlin.test.BracketToken
}

matched: left=LEFT matched* left=RIGHT;
