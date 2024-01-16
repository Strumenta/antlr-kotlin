// Copyright 2017-2024 Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024 Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.System
import com.strumenta.antlrkotlin.runtime.assert
import org.antlr.v4.kotlinruntime.misc.Interval
import kotlin.math.min

@Suppress("MemberVisibilityCanBePrivate")
public open class UnbufferedTokenStream(override val tokenSource: TokenSource, bufferSize: Int = 256) : TokenStream {
  /**
   * A moving window buffer of the data being scanned. While there's a marker,
   * we keep adding to buffer. Otherwise, [consume] resets, so
   * we start filling at index `0` again.
   */
  protected var tokens: Array<Token?> = arrayOfNulls(bufferSize)

  /**
   * The number of tokens currently in [tokens].
   *
   * This is not the buffer capacity, that's `tokens.length`.
   */
  protected var n: Int = 0

  /**
   * `0..n-1` index into [tokens] of next token.
   *
   * The `LT(1)` token is `tokens[p]`.
   * If `p == n`, we are out of buffered tokens.
   */
  protected var p: Int = 0

  /**
   * Count up with [mark] and down with [release].
   *
   * When we [release] the last mark, [numMarkers] reaches `0` and we reset the buffer.
   * Copy `tokens[p]..tokens[n-1]` to `tokens[0]..tokens[(n-1)-p]`.
   */
  protected var numMarkers: Int = 0

  /**
   * This is the `LT(-1)` token for the current position.
   */
  protected var lastToken: Token? = null

  /**
   * When [numMarkers] `> 0`, this is the `LT(-1)` token for the
   * first token in [tokens]. Otherwise, this is `null`.
   */
  protected var lastTokenBufferStart: Token? = null

  /**
   * Absolute token index. It's the index of the token about to be read via
   * `LT(1)`. Goes from `0` to the number of tokens in the entire stream,
   * although the stream size is unknown before the end is reached.
   *
   * This value is used to set the token indexes if the stream provides tokens
   * that implement [WritableToken].
   */
  protected var currentTokenIndex: Int = 0

  override val text: String =
    ""

  override val sourceName: String
    get() = tokenSource.sourceName

  protected val bufferStartIndex: Int
    get() = currentTokenIndex - p

  init {
    // Prime the pump
    fill(1)
  }

  override operator fun get(index: Int): Token {
    val bufferStartIndex = bufferStartIndex

    if (index < bufferStartIndex || index >= bufferStartIndex + n) {
      val message = "get($index) outside buffer: $bufferStartIndex..${bufferStartIndex + n}"
      throw IndexOutOfBoundsException(message)
    }

    return tokens[index - bufferStartIndex]!!
  }

  override fun LT(k: Int): Token {
    if (k == -1) {
      return lastToken!!
    }

    sync(k)
    val index = p + k - 1

    if (index < 0) {
      throw IndexOutOfBoundsException("LT($k) gives negative index")
    }

    if (index >= n) {
      assert(n > 0 && tokens[n - 1]!!.type == Token.EOF)
      return tokens[n - 1]!!
    }

    return tokens[index]!!
  }

  override fun LA(i: Int): Int =
    LT(i).type

  override fun getText(ctx: RuleContext): String =
    getText(ctx.sourceInterval)

  override fun getText(start: Token, stop: Token): String =
    getText(Interval.of(start.tokenIndex, stop.tokenIndex))

  override fun consume() {
    if (LA(1) == Token.EOF) {
      throw IllegalStateException("cannot consume EOF")
    }

    // buf always has at least tokens[p==0] in this method due to ctor
    lastToken = tokens[p] // Track last token for LT(-1)

    // If we're at last token and no markers, opportunity to flush buffer
    if (p == n - 1 && numMarkers == 0) {
      n = 0
      p = -1 // p++ will leave this at 0
      lastTokenBufferStart = lastToken
    }

    p++
    currentTokenIndex++
    sync(1)
  }

  /**
   * Make sure we have `need` elements from current position [p].
   * Last valid [p] index is `tokens.length - 1`. `p + need - 1` is the tokens
   * index `need` elements ahead.
   * If we need `1` element, `(p + 1 - 1) == p` must be less than `tokens.length`.
   */
  protected fun sync(want: Int) {
    // How many more elements we need?
    val need = p + want - 1 - n + 1

    if (need > 0) {
      fill(need)
    }
  }

  /**
   * Add [n] elements to the buffer.
   *
   * Returns the number of tokens actually added to the buffer.
   * If the return value is less than [n], then `EOF` was reached
   * before [n] tokens could be added.
   */
  protected fun fill(n: Int): Int {
    for (i in 0..<n) {
      if (this.n > 0 && tokens[this.n - 1]!!.type == Token.EOF) {
        return i
      }

      val t = tokenSource.nextToken()
      add(t)
    }

    return n
  }

  protected fun add(t: Token) {
    if (n >= tokens.size) {
      tokens = tokens.copyOf(tokens.size * 2)
    }

    if (t is WritableToken) {
      t.tokenIndex = bufferStartIndex + n
    }

    tokens[n++] = t
  }

  /**
   * Return a marker that we can release later.
   *
   * The specific marker value used for this class allows for some level of
   * protection against misuse where [seek] is called on a mark or [release]
   * is called in the wrong order.
   */
  override fun mark(): Int {
    if (numMarkers == 0) {
      lastTokenBufferStart = lastToken
    }

    val mark = -numMarkers - 1
    numMarkers++
    return mark
  }

  override fun release(marker: Int) {
    val expectedMark = -numMarkers

    if (marker != expectedMark) {
      throw IllegalStateException("release() called with an invalid marker.")
    }

    numMarkers--

    // Can we release buffer?
    if (numMarkers == 0) {
      if (p > 0) {
        // Copy tokens[p]..tokens[n-1] to tokens[0]..tokens[(n-1)-p], reset ptrs
        // p is last valid token; move nothing if p==n as we have no valid char
        System.arraycopy(tokens, p, tokens, 0, n - p) // Shift n-p tokens from p to 0
        n -= p
        p = 0
      }

      lastTokenBufferStart = lastToken
    }
  }

  override fun index(): Int =
    currentTokenIndex

  override fun seek(index: Int) {
    var tempIndex = index

    if (tempIndex == currentTokenIndex) {
      return
    }

    if (tempIndex > currentTokenIndex) {
      sync(tempIndex - currentTokenIndex)
      tempIndex = min(tempIndex, bufferStartIndex + n - 1)
    }

    val bufferStartIndex = bufferStartIndex
    val i = tempIndex - bufferStartIndex

    if (i < 0) {
      throw IllegalArgumentException("cannot seek to negative index $tempIndex")
    } else if (i >= n) {
      throw UnsupportedOperationException(
        "seek to index outside buffer: $tempIndex not in $bufferStartIndex..${bufferStartIndex + n}"
      )
    }

    p = i
    currentTokenIndex = tempIndex
    lastToken = if (p == 0) {
      lastTokenBufferStart
    } else {
      tokens[p - 1]
    }
  }

  override fun size(): Int =
    throw UnsupportedOperationException("Unbuffered stream cannot know its size")

  override fun getText(interval: Interval): String {
    val bufferStartIndex = bufferStartIndex
    val bufferStopIndex = bufferStartIndex + tokens.size - 1
    val start = interval.a
    val stop = interval.b

    if (start < bufferStartIndex || stop > bufferStopIndex) {
      throw UnsupportedOperationException(
        "interval $interval not in token buffer window: $bufferStartIndex..$bufferStopIndex"
      )
    }

    val a = start - bufferStartIndex
    val b = stop - bufferStartIndex
    val buf = StringBuilder()

    for (i in a..b) {
      val t = tokens[i]!!
      buf.append(t.text)
    }

    return buf.toString()
  }
}
