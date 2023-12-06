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

import java.util.BitSet as JavaBitSet

actual class BitSet actual constructor() {
  private val wrapped = JavaBitSet()

  actual fun set(bitIndex: Int) =
    wrapped.set(bitIndex)

  actual fun clear(bitIndex: Int) =
    wrapped.clear(bitIndex)

  actual fun get(bitIndex: Int): Boolean =
    wrapped.get(bitIndex)

  actual fun cardinality(): Int =
    wrapped.cardinality()

  actual fun nextSetBit(fromIndex: Int): Int =
    wrapped.nextSetBit(fromIndex)

  actual fun or(otherBitSet: BitSet) =
    wrapped.or(otherBitSet.wrapped)
}
