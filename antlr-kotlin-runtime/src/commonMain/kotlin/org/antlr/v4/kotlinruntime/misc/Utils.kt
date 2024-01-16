// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.misc

import com.strumenta.antlrkotlin.runtime.BitSet

@Suppress("MemberVisibilityCanBePrivate")
public object Utils {
  public fun numNonnull(data: Array<Any?>?): Int {
    if (data == null) {
      return 0
    }

    var n = 0

    for (o in data) {
      if (o != null) {
        n++
      }
    }

    return n
  }

  public fun <T> removeAllElements(data: MutableCollection<T>?, value: T) {
    if (data == null) {
      return
    }

    while (data.contains(value)) {
      data.remove(value)
    }
  }

  public fun escapeWhitespace(s: String, escapeSpaces: Boolean): String {
    val buf = StringBuilder()

    for (c in s.toCharArray()) {
      when {
        c == ' ' && escapeSpaces -> buf.append("\u00B7")
        c == '\t' -> buf.append("\\t")
        c == '\n' -> buf.append("\\n")
        c == '\r' -> buf.append("\\r")
        else -> buf.append(c)
      }
    }

    return buf.toString()
  }

  /**
   * Convert an array of strings to a `string -> index` map.
   *
   * Useful for converting `rulenames` to a `name -> ruleindex` map.
   */
  public fun toMap(keys: Array<String>): Map<String, Int> {
    val m = HashMap<String, Int>()

    for (i in keys.indices) {
      m[keys[i]] = i
    }

    return m
  }

  public fun toSet(bits: BitSet): IntervalSet {
    val s = IntervalSet()
    var i = bits.nextSetBit(0)

    while (i >= 0) {
      s.add(i)
      i = bits.nextSetBit(i + 1)
    }

    return s
  }

  public fun expandTabs(s: String?, tabSize: Int): String? {
    if (s == null) {
      return null
    }

    val buf = StringBuilder()
    var col = 0

    for (element in s) {
      when (element) {
        '\n' -> {
          col = 0
          buf.append(element)
        }
        '\t' -> {
          val n = tabSize - col % tabSize
          col += n
          buf.append(spaces(n))
        }
        else -> {
          col++
          buf.append(element)
        }
      }
    }

    return buf.toString()
  }

  public fun spaces(n: Int): String =
    sequence(n, " ")

  public fun newlines(n: Int): String =
    sequence(n, "\n")

  public fun sequence(n: Int, s: String): String {
    val buf = StringBuilder()

    for (sp in 1..n) {
      buf.append(s)
    }

    return buf.toString()
  }

  public fun count(s: String, x: Char): Int {
    var n = 0

    for (element in s) {
      if (element == x) {
        n++
      }
    }

    return n
  }
}
