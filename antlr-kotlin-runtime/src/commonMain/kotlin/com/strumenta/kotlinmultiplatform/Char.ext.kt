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

// Note: Kotlin Native has constants named in the same way.
//  The _ suffix prevents the conflicts
private const val MIN_SUPPLEMENTARY_CODE_POINT_ = 0x10000
private const val MAX_CODE_POINT_ = 0x10FFFF

private const val MIN_HIGH_SURROGATE = 0xD800
private const val MIN_LOW_SURROGATE = 0xDC00
private const val HIGH_SURROGATE_ENCODE_OFFSET =
    (MIN_HIGH_SURROGATE - (MIN_SUPPLEMENTARY_CODE_POINT_ ushr 10))

private fun isBmpCodePoint(codePoint: Int): Boolean =
    codePoint ushr 16 == 0

private fun highSurrogate(codePoint: Int): Char =
    ((codePoint ushr 10) + HIGH_SURROGATE_ENCODE_OFFSET).toChar()

private fun lowSurrogate(codePoint: Int): Char =
    ((codePoint and 0x3FF) + MIN_LOW_SURROGATE).toChar()

private fun isValidCodePoint(codePoint: Int): Boolean =
    codePoint in 0..MAX_CODE_POINT_

private fun CharArray.setSafe(index: Int, value: Char) {
    if (index !in this.indices) {
        throw IndexOutOfBoundsException("Size: $size, offset: $index")
    }

    this[index] = value
}

fun Char.Companion.isSupplementaryCodePoint(codePoint: Int): Boolean =
    codePoint in MIN_SUPPLEMENTARY_CODE_POINT_..MAX_CODE_POINT_

@OptIn(ExperimentalStdlibApi::class)
fun Char.Companion.toChars(codePoint: Int, destination: CharArray, offset: Int): Int {
    if (isBmpCodePoint(codePoint)) {
        destination.setSafe(offset, codePoint.toChar())
        return 1
    } else if (isValidCodePoint(codePoint)) {
        // When writing the low surrogate succeeds but writing the high surrogate fails (offset = -1), the
        // destination will be modified even though the method throws. This feels wrong, but matches the behavior
        // of the Java stdlib implementation.
        destination.setSafe(offset + 1, lowSurrogate(codePoint))
        destination.setSafe(offset, highSurrogate(codePoint))
        return 2
    } else {
        throw IllegalArgumentException("Not a valid Unicode code point: ${codePoint.toHexString()}")
    }
}

fun Char.Companion.charCount(codePoint: Int): Int =
    if (codePoint < MIN_SUPPLEMENTARY_CODE_POINT_) {
      1
    } else {
      2
    }
