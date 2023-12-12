/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
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
