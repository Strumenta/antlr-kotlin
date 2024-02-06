// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.assert
import com.strumenta.antlrkotlin.runtime.ext.codePointIndicesFast
import org.antlr.v4.kotlinruntime.misc.Interval

public open class StringCharStream(
  private val source: String,
  override val sourceName: String = IntStream.UNKNOWN_SOURCE_NAME,
) : CharStream {
  private val codePointIndices: IntArray
  private val size: Int
  private var position = 0

  init {
    val (codePointIndices, size) = codePointIndicesFast(source)
    this.codePointIndices = codePointIndices
    this.size = size
  }

  override fun consume() {
    if (size - position == 0) {
      assert(LA(1) == IntStream.EOF)
      throw IllegalStateException("cannot consume EOF")
    }

    position++
  }

  override fun index(): Int =
    position

  override fun size(): Int =
    size

  /**
   * Does nothing, as we have the entire buffer.
   */
  override fun mark(): Int =
    -1

  /**
   * Does nothing, as we have the entire buffer.
   */
  override fun release(marker: Int) {
    // Noop
  }

  override fun seek(index: Int) {
    position = index
  }

  override fun toString(): String =
    getText(Interval.of(0, size - 1))

  override fun getText(interval: Interval): String {
    if (interval.a >= size || interval.b < 0) {
      return ""
    }

    val start = codePointIndices[interval.a]
    val bPlus1 = interval.b + 1
    val stop = if (bPlus1 < size) {
      codePointIndices[bPlus1]
    } else {
      source.length
    }

    return source.substring(start, stop)
  }

  override fun LA(i: Int): Int =
    when {
      i < 0 -> codePoint(position + i)
      i > 0 -> codePoint(position + i - 1)
      // Undefined
      else -> 0
    }

  private fun codePoint(index: Int): Int {
    if (index !in 0..<size) {
      return IntStream.EOF
    }

    val char = source[codePointIndices[index]]

    if (char.isHighSurrogate()) {
      if (index + 1 in 0..<size) {
        val low = source[codePointIndices[index] + 1]
        return toCodePoint(char, low)
      }

      return IntStream.EOF
    }

    return char.code
  }

  private fun toCodePoint(high: Char, low: Char): Int =
    (high.code shl 10) + low.code + (-56613888)
}
