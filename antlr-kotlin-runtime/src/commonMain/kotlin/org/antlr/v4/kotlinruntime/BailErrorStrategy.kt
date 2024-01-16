// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.misc.ParseCancellationException

/**
 * This implementation of [ANTLRErrorStrategy] responds to syntax errors
 * by immediately canceling the parse operation with a
 * [ParseCancellationException].
 *
 * The implementation ensures that the [ParserRuleContext.exception]
 * field is set for all parse tree nodes that were not completed prior
 * to encountering the error.
 *
 * This error strategy is useful in the following scenarios:
 *
 * - **Two-stage parsing**: this error strategy allows the first
 *   stage of two-stage parsing to immediately terminate if an error is
 *   encountered, and immediately fall back to the second stage. In addition to
 *   avoiding wasted work by attempting to recover from errors here, the empty
 *   implementation of [BailErrorStrategy.sync] improves the performance of
 *   the first stage
 * - **Silent validation**: when syntax errors are not being reported or logged,
 *   and the parse result is simply ignored if errors occur, the [BailErrorStrategy]
 *   avoids wasting work on recovering from errors when the result will be ignored
 *   either way
 *
 * ```
 * myParser.errorHandler = BailErrorStrategy()
 * ```
 *
 * @see Parser.errorHandler
 */
public class BailErrorStrategy : DefaultErrorStrategy() {
  /**
   * Instead of recovering from exception [e], re-throw it wrapped
   * in a [ParseCancellationException] so it is not caught by the
   * rule function catches.
   *
   * Use [Exception.cause] to get the original [RecognitionException].
   */
  override fun recover(recognizer: Parser, e: RecognitionException) {
    var context = recognizer.context

    while (context != null) {
      context.exception = e
      context = context.readParent()
    }

    throw ParseCancellationException(e)
  }

  /**
   * Make sure we don't attempt to recover inline.
   *
   * If the parser successfully recovers, it won't throw an exception.
   */
  override fun recoverInline(recognizer: Parser): Token {
    val e = InputMismatchException(recognizer)
    var context = recognizer.context

    while (context != null) {
      context.exception = e
      context = context.readParent()
    }

    throw ParseCancellationException(e)
  }

  /**
   * Make sure we don't attempt to recover from problems in sub-rules.
   */
  override fun sync(recognizer: Parser) {
    // Noop
  }
}
