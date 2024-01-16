// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.atn.ATNConfigSet

/**
 * Indicates that the parser could not decide which of two or more paths
 * to take based upon the remaining input.
 *
 * It tracks the starting token of the offending input and also knows where
 * the parser was in the various paths when the error.
 *
 * Reported by `reportNoViableAlternative()`.
 *
 * @param startToken The token object at the start index; the input stream might
 *   not be buffering tokens so get a reference to it. (At the
 *   time the error occurred, of course the stream needs to keep a
 *   buffer all the tokens, but later we might not have access to those)
 * @param deadEndConfigs Which configurations did we try at `input.index()`
 *   that couldn't match `input.LT(1)`?
 */
public class NoViableAltException(
  recognizer: Parser,
  input: TokenStream = recognizer.tokenStream,
  public val startToken: Token? = recognizer.currentToken,
  offendingToken: Token? = recognizer.currentToken,
  public val deadEndConfigs: ATNConfigSet? = null,
  ctx: ParserRuleContext = recognizer.context!!,
) : RecognitionException(recognizer, input, ctx) {
  init {
    this.offendingToken = offendingToken
  }
}
