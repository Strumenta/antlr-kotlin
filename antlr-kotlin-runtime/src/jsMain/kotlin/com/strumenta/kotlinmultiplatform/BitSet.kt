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

// TODO(Edoardo): revisit this implementation
actual class BitSet actual constructor() {
  private val setBits = HashSet<Int>()

  actual fun set(bitIndex: Int) {
    require(bitIndex >= 0)
    setBits.add(bitIndex)
  }

  actual fun clear(bitIndex: Int) {
    require(bitIndex >= 0)
    setBits.remove(bitIndex)
  }

  actual fun get(bitIndex: Int): Boolean {
    require(bitIndex >= 0)
    return setBits.contains(bitIndex)
  }

  actual fun cardinality(): Int {
    return setBits.size
  }

  actual fun nextSetBit(i: Int): Int {
    val nextSetBits = setBits.filter { it >= i }
    return nextSetBits.minOrNull() ?: -1
  }

  actual fun or(alts: BitSet) {
    this.setBits.addAll(alts.setBits)
  }
}
