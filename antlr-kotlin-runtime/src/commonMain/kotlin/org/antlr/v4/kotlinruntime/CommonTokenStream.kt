// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

/**
 * This class extends [BufferedTokenStream] with functionality to filter
 * token streams to tokens on a particular channel (tokens where
 * [Token.channel] returns a particular value).
 *
 * This token stream provides access to all tokens by index or when calling
 * methods like [text]. The channel filtering is only used for code
 * accessing tokens via the lookahead methods [LA], [LT], and [LB].
 *
 * By default, tokens are placed on the default channel ([Token.DEFAULT_CHANNEL]),
 * but may be reassigned by using the `-> channel(HIDDEN)` lexer command,
 * or by using an embedded action to call [Lexer.channel].
 *
 * Note: lexer rules which use the `-> skip` lexer command or call
 * [Lexer.skip] do not produce tokens at all, so input text matched by
 * such a rule will not be available as part of the token stream, regardless of channel.
 */
public open class CommonTokenStream(tokenSource: TokenSource) : BufferedTokenStream(tokenSource) {
  /**
   * Specifies the channel to use for filtering tokens.
   *
   * The default value is [Token.DEFAULT_CHANNEL], which matches the
   * default channel assigned to tokens created by the lexer.
   */
  protected var channel: Int = Token.DEFAULT_CHANNEL

  /**
   * Count `EOF` just once.
   */
  public val numberOfOnChannelTokens: Int
    get() {
      var n = 0
      fill()

      for (i in tokens.indices) {
        val t = tokens[i]

        if (t.channel == channel) {
          n++
        }

        if (t.type == Token.EOF) {
          break
        }
      }

      return n
    }

  /**
   * Constructs a new [CommonTokenStream] using the specified token
   * source and filtering tokens to the specified channel.
   *
   * Only tokens whose [Token.channel] matches [channel] or have the
   * [Token.type] equal to [Token.EOF] will be returned by the
   * token stream lookahead methods.
   *
   * @param tokenSource The token source
   * @param channel The channel to use for filtering tokens
   */
  public constructor(tokenSource: TokenSource, channel: Int) : this(tokenSource) {
    this.channel = channel
  }

  protected override fun adjustSeekIndex(i: Int): Int =
    nextTokenOnChannel(i, channel)

  protected override fun LB(k: Int): Token? {
    if (k == 0 || p - k < 0) {
      return null
    }

    var i = p
    var n = 1

    // Find k good tokens looking backwards
    while (n <= k && i > 0) {
      // skip off-channel tokens
      i = previousTokenOnChannel(i - 1, channel)
      n++
    }

    return if (i < 0) {
      null
    } else {
      tokens[i]
    }
  }

  override fun LT(k: Int): Token? {
    lazyInit()

    if (k == 0) {
      return null
    }

    if (k < 0) {
      return LB(-k)
    }

    var i = p
    var n = 1 // We know tokens[p] is a good one

    // Find k good tokens
    while (n < k) {
      // Skip off-channel tokens, but make sure to not look past EOF
      if (sync(i + 1)) {
        i = nextTokenOnChannel(i + 1, channel)
      }

      n++
    }

    return tokens[i]
  }
}
