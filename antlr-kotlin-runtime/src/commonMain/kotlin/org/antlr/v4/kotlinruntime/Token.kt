// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.ast.Point

/**
 * A token has properties: text, type, line, character position in the line
 * (so we can ignore tabs), token channel, index, and source from which
 * we obtained this token.
 */
@Suppress("MemberVisibilityCanBePrivate")
public interface Token {
  public companion object {
    public const val INVALID_TYPE: Int = 0

    /**
     * During lookahead operations, this "token" signifies we hit rule end ATN state
     * and did not follow it despite needing to.
     */
    public const val EPSILON: Int = -2
    public const val MIN_USER_TOKEN_TYPE: Int = 1
    public const val EOF: Int = IntStream.EOF

    /**
     * All tokens go to the parser (unless [Lexer.skip] is called in that rule)
     * on a particular "channel". The parser tunes to a particular channel
     * so that whitespace etc. can go to the parser on a "hidden" channel.
     */
    public const val DEFAULT_CHANNEL: Int = 0

    /**
     * Anything on different channel than [DEFAULT_CHANNEL] is not parsed
     * by parser.
     */
    public const val HIDDEN_CHANNEL: Int = 1

    /**
     * This is the minimum constant value which can be assigned to a
     * user-defined token channel.
     *
     * The non-negative numbers less than [MIN_USER_CHANNEL_VALUE] are
     * assigned to the predefined channels [DEFAULT_CHANNEL] and [HIDDEN_CHANNEL].
     *
     * @see Token.channel
     */
    public const val MIN_USER_CHANNEL_VALUE: Int = 2
  }

  /**
   * Get the text of the token.
   */
  public val text: String?

  /**
   * Get the token type of the token.
   */
  public val type: Int

  /**
   * The line number on which the 1st character of this token was matched, `line=1..n`.
   */
  public val line: Int

  /**
   * The index of the first character of this token relative to the
   * beginning of the line at which it occurs, `0..n-1`.
   */
  public val charPositionInLine: Int

  /**
   * Return the channel this token. Each token can arrive at the parser
   * on a different channel, but the parser only "tunes" to a single channel.
   * The parser ignores everything not on [DEFAULT_CHANNEL].
   */
  public val channel: Int

  /**
   * An index from `0..n-1` of the token object in the input stream.
   *
   * This must be valid in order to print token streams and use `TokenRewriteStream`.
   *
   * Return `-1` to indicate that this token was conjured up since
   * it doesn't have a valid index.
   */
  public val tokenIndex: Int

  /**
   * The starting character index of the token.
   *
   * This method is optional.
   *
   * Return `-1` if not implemented.
   */
  public val startIndex: Int

  /**
   * The last character index of the token.
   *
   * This method is optional.
   *
   * Return `-1` if not implemented.
   */
  public val stopIndex: Int

  /**
   * Gets the [TokenSource] which created this token.
   */
  public val tokenSource: TokenSource?

  /**
   * Gets the [CharStream] from which this token was derived.
   */
  public val inputStream: CharStream?

  public fun startPoint(): Point =
    Point(line, charPositionInLine)

  public fun endPoint(): Point? =
    if (text == null) {
      null
    } else {
      Point(line, charPositionInLine).advance(text!!)
    }
}
