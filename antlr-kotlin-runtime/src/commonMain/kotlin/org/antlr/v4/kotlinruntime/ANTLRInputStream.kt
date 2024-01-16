// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.assert
import org.antlr.v4.kotlinruntime.misc.Interval
import kotlin.math.min

/**
 * Vacuum all input from a `Reader`/`InputStream` and then treat it
 * like a [CharArray] buffer.
 *
 * Can also pass in a [String] or [CharArray] to use.
 *
 * If you need encoding, pass in stream/reader with correct encoding.
 */
@Deprecated("As of 4.7, please use CharStreams")
public open class ANTLRInputStream : CharStream {
  public companion object {
    public const val READ_BUFFER_SIZE: Int = 1024
    public const val INITIAL_BUFFER_SIZE: Int = 1024
  }

  /**
   * The data being scanned.
   */
  protected var data: CharArray

  /**
   * How many characters are actually in the buffer.
   */
  protected var n: Int = 0

  /**
   * `0..n-1` index into string of next char.
   */
  protected var p: Int = 0

  final override val sourceName: String

  public constructor(
    data: CharArray,
    numberOfActualCharsInArray: Int,
    sourceName: String = IntStream.UNKNOWN_SOURCE_NAME,
  ) {
    this.data = data
    n = numberOfActualCharsInArray

    require(sourceName.isNotEmpty()) {
      "The source name cannot be empty"
    }

    this.sourceName = sourceName
  }

  public constructor(
    input: String,
    sourceName: String = IntStream.UNKNOWN_SOURCE_NAME,
  ) {
    val data = input.toCharArray()
    this.data = data
    n = data.size

    require(sourceName.isNotEmpty()) {
      "The source name cannot be empty"
    }

    this.sourceName = sourceName
  }

  /**
   * Reset the stream so that it's in the same state it was when
   * the object was created *except* the data array is not touched.
   */
  public fun reset() {
    p = 0
  }

  override fun consume() {
    if (p >= n) {
      assert(LA(1) == IntStream.EOF)
      throw IllegalStateException("cannot consume EOF")
    }

    if (p < n) {
      p++
    }
  }

  override fun LA(i: Int): Int {
    var ii = i

    if (ii == 0) {
      // Undefined
      return 0
    }

    if (ii < 0) {
      ii++ // e.g., translate LA(-1) to use offset i=0; then data[p+0-1]

      if (p + ii - 1 < 0) {
        // Invalid, no char before first char
        return IntStream.EOF
      }
    }

    return if (p + ii - 1 >= n) {
      IntStream.EOF
    } else {
      data[p + ii - 1].code
    }
  }

  @Suppress("FunctionName")
  public fun LT(i: Int): Int =
    LA(i)

  /**
   * Return the current input symbol index `0..n` where `n` indicates the
   * last symbol has been read. The index is the index of char to
   * be returned from `LA(1)`.
   */
  override fun index(): Int =
    p

  override fun size(): Int =
    n

  /**
   * Does nothing, as we have entire buffer.
   */
  override fun mark(): Int =
    -1

  /**
   * Does nothing, as we have entire buffer.
   */
  override fun release(marker: Int) {
    // Noop
  }

  /**
   * [consume] ahead until `p == index`.
   *
   * Can't just set `p = index` as we must update `line` and `charPositionInLine`.
   *
   * If we seek backwards, just set [p].
   */
  override fun seek(index: Int) {
    var i = index

    if (i <= p) {
      // Just jump, don't update stream state (line, ...)
      p = i
      return
    }

    // Seek forward, consume until p hits index or n (whichever comes first)
    i = min(i, n)

    while (p < i) {
      consume()
    }
  }

  override fun getText(interval: Interval): String {
    val start = interval.a
    var stop = interval.b

    if (stop >= n) {
      stop = n - 1
    }

    val count = stop - start + 1
    return if (start >= n) {
      ""
    } else {
      data.concatToString(start, start + count)
    }
  }

  override fun toString(): String =
    data.concatToString()
}
