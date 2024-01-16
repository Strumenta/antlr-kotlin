// Copyright 2017-2024 Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024 Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

public interface WritableToken : Token {
  override var text: String?

  /**
   * Get the token type of the token.
   */
  override var type: Int

  /**
   * The line number on which the 1st character of this token was matched,
   * `line=1..n`.
   */
  override var line: Int

  /**
   * The index of the first character of this token relative to the
   * beginning of the line at which it occurs, `0..n-1`.
   */
  override var charPositionInLine: Int

  /**
   * Return the channel this token. Each token can arrive at the parser
   * on a different channel, but the parser only "tunes" to a single channel.
   *
   * The parser ignores everything not on [Token.DEFAULT_CHANNEL].
   */
  override var channel: Int

  /**
   * An index from `0..n-1` of the token object in the input stream.
   * This must be valid in order to print token streams and
   * use `TokenRewriteStream`.
   *
   * Return `-1` to indicate that this token was conjured up since
   * it doesn't have a valid index.
   */
  override var tokenIndex: Int
}
