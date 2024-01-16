// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * This default implementation of [TokenFactory] creates [CommonToken] objects.
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class CommonTokenFactory(
  /**
   * Indicates whether [CommonToken.text] should be called after
   * constructing tokens to explicitly set the text.
   *
   * This is useful for cases where the input stream might not be able
   * to provide arbitrary substrings of text from the input after
   * the lexer creates a token (e.g., the implementation of [CharStream.getText] in
   * [UnbufferedCharStream] throws an [UnsupportedOperationException]).
   *
   * Explicitly setting the token text allows [Token.text] to be called
   * at any time regardless of the input stream implementation.
   *
   * The default value is `false` to avoid the performance and memory
   * overhead of copying text for every token unless explicitly requested.
   */
  protected val copyText: Boolean = false,
) : TokenFactory<CommonToken> {
  public companion object {
    /**
     * The default [CommonTokenFactory] instance.
     *
     * This token factory does not explicitly copy token text when constructing tokens.
     */
    public val DEFAULT: TokenFactory<CommonToken> = CommonTokenFactory()
  }

  override fun create(
    source: Pair<TokenSource?, CharStream?>,
    type: Int,
    text: String?,
    channel: Int,
    start: Int,
    stop: Int,
    line: Int,
    charPositionInLine: Int,
  ): CommonToken {
    val t = CommonToken(source, type, channel, start, stop)
    t.line = line
    t.charPositionInLine = charPositionInLine

    if (text != null) {
      t.text = text
    } else if (copyText && source.second != null) {
      t.text = source.second!!.getText(Interval.of(start, stop))
    }

    return t
  }

  override fun create(type: Int, text: String): CommonToken =
    CommonToken(type, text)
}
