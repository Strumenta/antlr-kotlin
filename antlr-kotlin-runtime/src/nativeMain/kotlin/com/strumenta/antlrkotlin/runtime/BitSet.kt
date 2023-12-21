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
package com.strumenta.antlrkotlin.runtime

import kotlin.native.BitSet as NativeBitSet

@OptIn(ObsoleteNativeApi::class)
public actual class BitSet actual constructor() {
  private val wrapped = NativeBitSet()

  public actual fun set(bitIndex: Int): Unit =
    wrapped.set(bitIndex)

  public actual fun clear(bitIndex: Int): Unit =
    wrapped.clear(bitIndex)

  public actual fun get(bitIndex: Int): Boolean =
    wrapped[bitIndex]

  public actual fun cardinality(): Int {
    var count = 0

    for (i in 0..<wrapped.size) {
      if (wrapped[i]) {
        count++
      }
    }

    return count
  }

  public actual fun nextSetBit(fromIndex: Int): Int =
    wrapped.nextSetBit(fromIndex)

  public actual fun or(otherBitSet: BitSet): Unit =
    wrapped.or(otherBitSet.wrapped)

  override fun equals(other: Any?): Boolean =
    this === other || other is BitSet && wrapped == other.wrapped

  override fun hashCode(): Int =
    wrapped.hashCode()

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
