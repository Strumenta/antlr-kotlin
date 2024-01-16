// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * A source of characters for an ANTLR lexer.
 */
public interface CharStream : IntStream {
  public companion object {
    public const val EOF: Int = IntStream.EOF
  }

  /**
   * This method returns the text for a range of characters within this input stream.
   *
   * This method is guaranteed to not throw an exception if the
   * specified [interval] lies entirely within a marked range.
   * For more information about marked ranges, see [IntStream.mark].
   *
   * @param interval An interval within the stream
   * @return The text of the specified interval
   *
   * @throws IllegalArgumentException If `interval.a < 0`, or if
   *   `interval.b < interval.a - 1`, or if `interval.b` lies at or
   *   past the end of the stream
   * @throws UnsupportedOperationException If the stream does not support
   *   getting the text of the specified interval
   */
  public fun getText(interval: Interval): String
}
