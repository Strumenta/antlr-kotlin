// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

/**
 * This signifies any kind of mismatched input exceptions such as
 * when the current input does not match the expected token.
 */
public class InputMismatchException : RecognitionException {
  public constructor(recognizer: Parser) : super(recognizer, recognizer.tokenStream, recognizer.context!!) {
    offendingToken = recognizer.currentToken
  }

  public constructor(
    recognizer: Parser,
    state: Int,
    ctx: ParserRuleContext,
  ) : super(recognizer, recognizer.tokenStream, ctx) {
    offendingState = state
    offendingToken = recognizer.currentToken
  }
}
