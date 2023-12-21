/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.System

/**
 * @author Sam Harwell
 */
public open class ConsoleErrorListener : BaseErrorListener() {
  public companion object {
    /**
     * Provides a default instance of [ConsoleErrorListener].
     */
    public val INSTANCE: ConsoleErrorListener = ConsoleErrorListener()
  }

  /**
   * This implementation prints messages to [System.err] containing the
   * values of [line], [charPositionInLine], and [msg] using the following format:
   *
   * ```
   * line *line*:*charPositionInLine* *msg*
   * ```
   */
  override fun syntaxError(
    recognizer: Recognizer<*, *>,
    offendingSymbol: Any?,
    line: Int,
    charPositionInLine: Int,
    msg: String,
    e: RecognitionException?,
  ) {
    System.err.println("line $line:$charPositionInLine $msg")
  }
}
