// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.assert
import com.strumenta.antlrkotlin.runtime.ext.codePointIndices
import org.antlr.v4.kotlinruntime.misc.Interval
import kotlin.math.min

public class StringCharStream(
  private val source: String,
  override val sourceName: String = IntStream.UNKNOWN_SOURCE_NAME,
) : CharStream {
  private val codePointIndices = source.codePointIndices()
  private val size = codePointIndices.size
  private var position = 0

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
    val startIndex = min(interval.a, size)
    val endIndex = min(interval.b, size)
    return source.substring(codePointIndices[startIndex], codePointIndices[endIndex] + 1)
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
