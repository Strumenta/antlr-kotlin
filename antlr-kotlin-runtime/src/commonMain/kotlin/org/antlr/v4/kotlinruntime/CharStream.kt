/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

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
