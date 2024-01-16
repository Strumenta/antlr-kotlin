// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package com.strumenta.antlrkotlin.runtime

import js.core.delete
import org.antlr.v4.kotlinruntime.misc.MurmurHash

public actual class BitSet {
  private val wrapped = js("[]").unsafeCast<Array<Boolean>>()

  public actual fun set(bitIndex: Int) {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    wrapped[bitIndex] = true
  }

  public actual fun clear(bitIndex: Int) {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    delete(wrapped[bitIndex])
  }

  public actual fun get(bitIndex: Int): Boolean {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    if (bitIndex >= wrapped.size) {
      return false
    }

    @Suppress("SimplifyBooleanWithConstants")
    return wrapped[bitIndex] == true
  }

  public actual fun cardinality(): Int =
    @Suppress("SimplifyBooleanWithConstants")
    wrapped.count { it == true }

  public actual fun nextSetBit(startIndex: Int): Int {
    if (startIndex < 0) {
      throw IndexOutOfBoundsException("fromIndex < 0: $startIndex")
    }

    if (startIndex >= wrapped.size) {
      return -1
    }

    for (n in startIndex..<wrapped.size) {
      @Suppress("SimplifyBooleanWithConstants")
      if (wrapped[n] == true) {
        return n
      }
    }

    return -1
  }

  public actual fun or(another: BitSet) {
    for (i in 0..<another.wrapped.size) {
      @Suppress("SimplifyBooleanWithConstants")
      val result = wrapped[i] == true || another.wrapped[i] == true

      // This check avoids setting a "false" boolean value,
      // as we want to keep the "undefined" slots
      if (result) {
        wrapped[i] = true
      }
    }
  }

  override fun equals(other: Any?): Boolean =
    this === other || other is BitSet && wrapped.contentEquals(other.wrapped)

  override fun hashCode(): Int {
    val fqn = "com.strumenta.antlrkotlin.runtime.BitSet"
    return MurmurHash.hashCode(wrapped, fqn.hashCode())
  }

  override fun toString(): String {
    val sb = StringBuilder()
    var first = true
    sb.append("{")

    var index = nextSetBit(0)

    while (index != -1) {
      if (!first) {
        sb.append(", ")
      } else {
        first = false
      }

      sb.append(index)
      index = nextSetBit(index + 1)
    }

    sb.append("}")
    return sb.toString()
  }
}
