// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.assert
import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * This implementation of [TokenStream] loads tokens from a
 * [TokenSource] on-demand, and places the tokens in a buffer to provide
 * access to any previous token by index.
 *
 * This token stream ignores the value of [Token.channel].
 * If your parser requires the token stream filter tokens to only
 * those on a particular channel, such as [Token.DEFAULT_CHANNEL] or
 * [Token.HIDDEN_CHANNEL], use a filtering token stream such a [CommonTokenStream].
 *
 * @param tokenSource The [TokenSource] from which tokens for this stream are fetched
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class BufferedTokenStream(tokenSource: TokenSource) : TokenStream {
  /**
   * A collection of all tokens fetched from the token source.
   *
   * The list is considered a complete view of the input once [fetchedEOF]
   * is set to `true`.
   */
  public var tokens: MutableList<Token> = ArrayList(100)

  /**
   * The index into [tokens] of the current token (next token to [consume]).
   * `tokens[p]` should be `LT(1)`.
   *
   * This field is set to `-1` when the stream is first constructed or when
   * [tokenSource] is assigned, indicating that the first token has
   * not yet been fetched from the token source.
   *
   * For additional information, see the documentation of [IntStream]
   * for a description of *initializing mMethods*.
   */
  protected var p: Int = -1

  /**
   * Indicates whether the [Token.EOF] token has been fetched from
   * [tokenSource] and added to [tokens].
   *
   * This field improves performance for the following cases:
   *
   * - [consume]: the lookahead check in [consume] to prevent
   *   consuming the `EOF` symbol is optimized by checking the
   *   values of [fetchedEOF] and [p] instead of calling [LA]
   * - [fetch]: the check to prevent adding multiple `EOF` symbols
   *   into [tokens] is trivial with this field
   */
  protected var fetchedEOF: Boolean = false

  override var tokenSource: TokenSource = tokenSource
    set(value) {
      field = value
      tokens.clear()
      p = -1
      fetchedEOF = false
    }

  override val sourceName: String
    get() = tokenSource.sourceName

  /**
   * Get the text of all tokens in this buffer.
   */
  override val text: String
    get() = getText(Interval.of(0, size() - 1))

  override fun index(): Int =
    p

  override fun mark(): Int =
    0

  override fun release(marker: Int) {
    // No resources to release
  }

  override fun seek(index: Int) {
    lazyInit()
    p = adjustSeekIndex(index)
  }

  override fun size(): Int =
    tokens.size

  override fun consume() {
    val skipEofCheck =
      if (p >= 0) {
        if (fetchedEOF) {
          // The last token in tokens is EOF.
          // Skip check if p indexes any fetched token except the last
          p < tokens.size - 1
        } else {
          // No EOF token in tokens. Skip check if p indexes a fetched token.
          p < tokens.size
        }
      } else {
        // Not yet initialized
        false
      }

    if (!skipEofCheck && LA(1) == IntStream.EOF) {
      throw IllegalStateException("cannot consume EOF")
    }

    if (sync(p + 1)) {
      p = adjustSeekIndex(p + 1)
    }
  }

  /**
   * Make sure index [i] in tokens has a token.
   *
   * @return `true` if a token is located at index [i], otherwise `false`
   */
  protected fun sync(i: Int): Boolean {
    assert(i >= 0)
    val n = i - tokens.size + 1 // How many more elements we need?

    if (n > 0) {
      val fetched = fetch(n)
      return fetched >= n
    }

    return true
  }

  /**
   * Add [n] elements to buffer.
   *
   * @return The actual number of elements added to the buffer
   */
  protected fun fetch(n: Int): Int {
    if (fetchedEOF) {
      return 0
    }

    for (i in 0..<n) {
      val t = tokenSource.nextToken()

      if (t is WritableToken) {
        t.tokenIndex = tokens.size
      }

      tokens.add(t)

      if (t.type == Token.EOF) {
        fetchedEOF = true
        return i + 1
      }
    }

    return n
  }

  override operator fun get(index: Int): Token {
    if (index < 0 || index >= tokens.size) {
      throw IndexOutOfBoundsException("token index $index out of range 0..${tokens.size - 1}")
    }

    return tokens[index]
  }

  /**
   * Get all tokens from [start]..[stop] inclusively.
   */
  public operator fun get(start: Int, stop: Int): List<Token>? {
    if (start < 0 || stop < 0) {
      return null
    }

    lazyInit()

    val subset = ArrayList<Token>()
    var tempStop = stop

    if (tempStop >= tokens.size) {
      tempStop = tokens.size - 1
    }

    for (i in start..tempStop) {
      val t = tokens[i]

      if (t.type == Token.EOF) {
        break
      }

      subset.add(t)
    }

    return subset
  }

  override fun LA(i: Int): Int =
    LT(i)!!.type

  @Suppress("FunctionName")
  protected open fun LB(k: Int): Token? =
    if (p - k < 0) {
      null
    } else {
      tokens[p - k]
    }

  override fun LT(k: Int): Token? {
    lazyInit()

    if (k == 0) {
      return null
    }

    if (k < 0) {
      return LB(-k)
    }

    val i = p + k - 1
    sync(i)

    return if (i >= tokens.size) {
      // Return EOF token. EOF must be last token
      tokens[tokens.size - 1]
    } else {
      tokens[i]
    }
  }

  /**
   * Allow derived classes to modify the behavior of operations which change
   * the current stream position by adjusting the target token index of a seek
   * operation.
   *
   * The default implementation simply returns [i].
   *
   * If an exception is thrown in this method, the current stream index
   * should not be changed.
   *
   * For example, [CommonTokenStream] overrides this method to ensure that
   * the seek target is always an on-channel token.
   *
   * @param i The target token index
   * @return The adjusted target token index
   */
  protected open fun adjustSeekIndex(i: Int): Int =
    i

  protected fun lazyInit() {
    if (p == -1) {
      setup()
    }
  }

  protected fun setup() {
    sync(0)
    p = adjustSeekIndex(0)
  }

  /**
   * Given a [start] and [stop] index, return a list of all tokens
   * in the token type `BitSet`.
   *
   * Return `null` if no tokens were found.
   *
   * This method looks at both on and off channel tokens.
   */
  public fun getTokens(start: Int, stop: Int, types: Set<Int>? = null): List<Token>? {
    lazyInit()

    if (start < 0 || stop >= tokens.size || stop < 0 || start >= tokens.size) {
      throw IndexOutOfBoundsException("start $start or stop $stop not in 0..${tokens.size - 1}")
    }

    if (start > stop) {
      return null
    }

    // list = tokens[start:stop]:{T t, t.getType() in types}
    val filteredTokens = ArrayList<Token>()

    for (i in start..stop) {
      val t = tokens[i]

      if (types == null || types.contains(t.type)) {
        filteredTokens.add(t)
      }
    }

    return filteredTokens.ifEmpty { null }
  }

  public fun getTokens(start: Int, stop: Int, ttype: Int): List<Token>? {
    val s = HashSet<Int>(ttype)
    s.add(ttype)
    return getTokens(start, stop, s)
  }

  /**
   * Given a starting index, return the index of the next token on channel.
   *
   * Return [i] if `tokens[i]` is on channel.
   *
   * Return the index of the `EOF` token if there are no tokens on channel
   * between [i] and `EOF`.
   */
  protected fun nextTokenOnChannel(i: Int, channel: Int): Int {
    sync(i)

    if (i >= size()) {
      return size() - 1
    }

    var token = tokens[i]
    var ii = i

    while (token.channel != channel) {
      if (token.type == Token.EOF) {
        return ii
      }

      ii++
      sync(ii)
      token = tokens[ii]
    }

    return ii
  }

  /**
   * Given a starting index, return the index of the previous token on channel.
   *
   * Return [i] if `tokens[i]` is on channel.
   *
   * Return `-1` if there are no tokens on channel between [i] and `0`.
   *
   * If [i] specifies an index at or after the `EOF` token, the `EOF` token
   * index is returned. This is due to the fact that the `EOF` token is treated
   * as though it were on every channel.
   */
  protected fun previousTokenOnChannel(i: Int, channel: Int): Int {
    sync(i)

    if (i >= size()) {
      // The EOF token is on every channel
      return size() - 1
    }

    var ii = i

    while (ii >= 0) {
      val token = tokens[ii]

      if (token.type == Token.EOF || token.channel == channel) {
        return ii
      }

      ii--
    }

    return ii
  }

  /**
   * Collect all tokens on specified channel to the right of the current token
   * up until we see a token on [Lexer.DEFAULT_TOKEN_CHANNEL] or `EOF`.
   *
   * If channel is `-1`, find any non default channel token.
   */
  public fun getHiddenTokensToRight(tokenIndex: Int, channel: Int = -1): List<Token>? {
    lazyInit()

    if (tokenIndex < 0 || tokenIndex >= tokens.size) {
      throw IndexOutOfBoundsException("$tokenIndex not in 0..${tokens.size - 1}")
    }

    val nextOnChannel = nextTokenOnChannel(tokenIndex + 1, Lexer.DEFAULT_TOKEN_CHANNEL)
    val from = tokenIndex + 1

    // If none on channel to right, nextOnChannel=-1 so set to = last token
    val to = if (nextOnChannel == -1) {
      size() - 1
    } else {
      nextOnChannel
    }

    return filterForChannel(from, to, channel)
  }

  /**
   * Collect all tokens on specified channel to the left of
   * the current token up until we see a token on [Lexer.DEFAULT_TOKEN_CHANNEL].
   *
   * If channel is `-1`, find any non default channel token.
   */
  public fun getHiddenTokensToLeft(tokenIndex: Int, channel: Int = -1): List<Token>? {
    lazyInit()

    if (tokenIndex < 0 || tokenIndex >= tokens.size) {
      throw IndexOutOfBoundsException("$tokenIndex not in 0..${tokens.size - 1}")
    }

    if (tokenIndex == 0) {
      // Obviously no tokens can appear before the first token
      return null
    }

    val prevOnChannel = previousTokenOnChannel(tokenIndex - 1, Lexer.DEFAULT_TOKEN_CHANNEL)

    if (prevOnChannel == tokenIndex - 1) {
      return null
    }

    // If none on channel to left, prevOnChannel=-1 then from=0
    val from = prevOnChannel + 1
    val to = tokenIndex - 1

    return filterForChannel(from, to, channel)
  }

  protected fun filterForChannel(from: Int, to: Int, channel: Int): List<Token>? {
    val hidden = ArrayList<Token>()

    for (i in from..to) {
      val t = tokens[i]

      if (channel == -1) {
        if (t.channel != Lexer.DEFAULT_TOKEN_CHANNEL) hidden.add(t)
      } else {
        if (t.channel == channel) hidden.add(t)
      }
    }

    return if (hidden.size == 0) {
      null
    } else {
      hidden
    }
  }

  override fun getText(interval: Interval): String {
    val start = interval.a
    var stop = interval.b

    if (start < 0 || stop < 0) {
      return ""
    }

    sync(stop)

    if (stop >= tokens.size) {
      stop = tokens.size - 1
    }

    val buf = StringBuilder()

    for (i in start..stop) {
      val t = tokens[i]

      if (t.type == Token.EOF) {
        break
      }

      buf.append(t.text)
    }

    return buf.toString()
  }

  override fun getText(ctx: RuleContext): String =
    getText(ctx.sourceInterval)

  override fun getText(start: Token, stop: Token): String? =
    getText(Interval.of(start.tokenIndex, stop.tokenIndex))

  /**
   * Get all tokens from lexer until `EOF`.
   */
  public fun fill() {
    lazyInit()
    val blockSize = 1000

    while (true) {
      val fetched = fetch(blockSize)

      if (fetched < blockSize) {
        return
      }
    }
  }
}
