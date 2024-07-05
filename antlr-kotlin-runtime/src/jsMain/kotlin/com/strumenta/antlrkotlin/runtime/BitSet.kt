// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import js.core.delete
import org.antlr.v4.kotlinruntime.misc.MurmurHash

@Suppress("SimplifyBooleanWithConstants")
public actual class BitSet actual constructor(size: Int) {
  private val bits = newArray<Boolean>(size)

  init {
    require(size >= 0) {
      "The initial bitset size must be equal or greater than 0"
    }
  }

  public actual constructor() : this(64)

  public actual fun set(bitIndex: Int) {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    bits[bitIndex] = true
  }

  public actual fun clear(bitIndex: Int) {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    delete(bits[bitIndex])
  }

  public actual fun get(bitIndex: Int): Boolean {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    if (bitIndex >= bits.size) {
      return false
    }

    return bits[bitIndex] == true
  }

  public actual fun cardinality(): Int {
    // Note(Edoardo): keep like this for performance reasons
    var c = 0

    for (i in bits.indices) {
      if (bits[i] == true) {
        c++
      }
    }

    return c
  }

  public actual fun nextSetBit(startIndex: Int): Int {
    if (startIndex < 0) {
      throw IndexOutOfBoundsException("fromIndex < 0: $startIndex")
    }

    if (startIndex >= bits.size) {
      return -1
    }

    for (i in startIndex..<bits.size) {
      if (bits[i] == true) {
        return i
      }
    }

    return -1
  }

  public actual fun or(another: BitSet) {
    for (i in 0..<another.bits.size) {
      val result = bits[i] == true || another.bits[i] == true

      // This check avoids setting a "false" boolean value,
      // as we want to keep the "undefined" slots
      if (result) {
        bits[i] = true
      }
    }
  }

  override fun equals(other: Any?): Boolean =
    this === other || other is BitSet && contentEquals(bits, other.bits)

  override fun hashCode(): Int {
    val fqn = "com.strumenta.antlrkotlin.runtime.BitSet"
    var hashCode = MurmurHash.initialize(fqn.hashCode())
    var on = 0

    for (i in bits.indices) {
      if (bits[i] == true) {
        hashCode = MurmurHash.update(hashCode, i)
        on++
      }
    }

    return MurmurHash.finish(hashCode, on)
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

  private fun contentEquals(one: Array<Boolean>, two: Array<Boolean>): Boolean {
    val lastIndexOne = lastBitSetIndex(one)
    val lastIndexTwo = lastBitSetIndex(two)

    if (lastIndexOne != lastIndexTwo) {
      return false
    }

    for (i in 0..lastIndexOne) {
      if (one[i] != two[i]) {
        return false
      }
    }

    return true
  }

  private fun lastBitSetIndex(bits: Array<Boolean>): Int {
    var i = bits.size - 1

    while (i > -1) {
      if (bits[i] == true) {
        return i
      }

      i--
    }

    return -1
  }
}
