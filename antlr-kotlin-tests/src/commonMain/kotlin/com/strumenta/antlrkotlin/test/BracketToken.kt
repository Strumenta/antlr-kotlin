package com.strumenta.antlrkotlin.test

import org.antlr.v4.kotlinruntime.CommonToken
import org.antlr.v4.kotlinruntime.Token

public sealed interface BracketToken : Token {
  public class Left(text: String) : CommonToken(1, text), BracketToken
  public class Right(text: String) : CommonToken(2, text), BracketToken
}
