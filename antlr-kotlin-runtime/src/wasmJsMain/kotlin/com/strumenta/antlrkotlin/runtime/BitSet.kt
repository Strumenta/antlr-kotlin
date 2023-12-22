package com.strumenta.antlrkotlin.runtime

import org.antlr.v4.kotlinruntime.misc.MurmurHash

public actual class BitSet actual constructor() {
  private companion object {
    private val TRUE = true.toJsBoolean()
    private val FALSE = false.toJsBoolean()
  }

  private val wrapped = JsArray<JsBoolean>()

  public actual fun set(bitIndex: Int) {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    wrapped[bitIndex] = TRUE
  }

  public actual fun clear(bitIndex: Int) {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    wrapped[bitIndex] = FALSE
  }

  public actual fun get(bitIndex: Int): Boolean {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    if (bitIndex >= wrapped.length) {
      return false
    }

    return wrapped[bitIndex] == TRUE
  }

  public actual fun cardinality(): Int {
    var count = 0

    for (i in 0..<wrapped.length) {
      if (wrapped[i] == TRUE) {
        count++
      }
    }

    return count
  }

  public actual fun nextSetBit(fromIndex: Int): Int {
    if (fromIndex < 0) {
      throw IndexOutOfBoundsException("fromIndex < 0: $fromIndex")
    }

    if (fromIndex >= wrapped.length) {
      return -1
    }

    for (n in fromIndex..<wrapped.length) {
      if (wrapped[n] == TRUE) {
        return n
      }
    }

    return -1
  }

  public actual fun or(otherBitSet: BitSet) {
    for (i in 0..<otherBitSet.wrapped.length) {
      val result = wrapped[i] == TRUE || otherBitSet.wrapped[i] == TRUE

      // This check avoids setting a "false" boolean value,
      // as we want to keep the "undefined" slots
      if (result) {
        wrapped[i] = TRUE
      }
    }
  }

  override fun equals(other: Any?): Boolean =
    this === other || other is BitSet && contentEquals(wrapped, other.wrapped)

  override fun hashCode(): Int {
    val fqn = "com.strumenta.antlrkotlin.runtime.BitSet"
    return murmurHashCode(wrapped, fqn.hashCode())
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

  private fun <T : JsAny> contentEquals(one: JsArray<T>, two: JsArray<T>): Boolean {
    if (one === two) {
      return true
    }

    if (one.length != two.length) {
      return false
    }

    for (i in 0..<one.length) {
      if (one[i] != two[i]) {
        return false
      }
    }

    return true
  }

  private fun murmurHashCode(data: JsArray<JsBoolean>, seed: Int): Int {
    var hash = MurmurHash.initialize(seed)

    for (i in 0..<data.length) {
      val bool = data[i] == TRUE
      hash = MurmurHash.update(hash, bool)
    }

    hash = MurmurHash.finish(hash, data.length)
    return hash
  }
}
