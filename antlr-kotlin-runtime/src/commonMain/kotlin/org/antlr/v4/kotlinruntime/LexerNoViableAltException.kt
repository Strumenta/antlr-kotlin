// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.atn.ATNConfigSet
import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.misc.Utils

/**
 * @param startIndex Matching attempted at what input index?
 * @param deadEndConfigs Which configurations did we try at `input.index()`
 *   that couldn't match `input.LA(1)`?
 */
@Suppress("MemberVisibilityCanBePrivate")
public class LexerNoViableAltException(
  lexer: Lexer,
  input: CharStream,
  public val startIndex: Int,
  public val deadEndConfigs: ATNConfigSet?,
) : RecognitionException(lexer, input, null) {
  override val inputStream: CharStream
    get() = super.inputStream as CharStream

  override fun toString(): String {
    var symbol = ""

    if (startIndex >= 0 && startIndex < inputStream.size()) {
      symbol = inputStream.getText(Interval.of(startIndex, startIndex))
      symbol = Utils.escapeWhitespace(symbol, false)
    }

    return "${this::class.simpleName}('$symbol')"
  }
}
