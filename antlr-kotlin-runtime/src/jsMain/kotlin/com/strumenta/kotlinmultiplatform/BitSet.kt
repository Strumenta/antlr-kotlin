/*
 * Copyright (C) 2021 Strumenta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.strumenta.kotlinmultiplatform

import js.core.delete
import org.antlr.v4.kotlinruntime.misc.MurmurHash

public actual class BitSet actual constructor() {
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

  public actual fun nextSetBit(fromIndex: Int): Int {
    if (fromIndex < 0) {
      throw IndexOutOfBoundsException("fromIndex < 0: $fromIndex")
    }

    if (fromIndex >= wrapped.size) {
      return -1
    }

    for (n in fromIndex..<wrapped.size) {
      @Suppress("SimplifyBooleanWithConstants")
      if (wrapped[n] == true) {
        return n
      }
    }

    return -1
  }

  public actual fun or(otherBitSet: BitSet) {
    for (i in 0..<otherBitSet.wrapped.size) {
      @Suppress("SimplifyBooleanWithConstants")
      val result = wrapped[i] == true || otherBitSet.wrapped[i] == true

      // This check avoids setting a "false" boolean value,
      // as we want to keep the "undefined" slots
      if (result) {
        wrapped[i] = result
      }
    }
  }

  override fun equals(other: Any?): Boolean =
    this === other || other is BitSet && wrapped.contentEquals(other.wrapped)

  override fun hashCode(): Int {
    val fqn = "com.strumenta.kotlinmultiplatform.BitSet"
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
