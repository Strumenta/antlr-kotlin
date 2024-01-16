// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
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
