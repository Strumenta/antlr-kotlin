// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

// Note: Kotlin Native has constants named in the same way.
//  The _ suffix prevents the conflicts
internal const val MIN_SUPPLEMENTARY_CODE_POINT_: Int = 0x10000
internal const val MAX_CODE_POINT_: Int = 0x10FFFF
internal const val MIN_HIGH_SURROGATE: Int = 0xD800
internal const val MIN_LOW_SURROGATE: Int = 0xDC00
internal const val HIGH_SURROGATE_ENCODE_OFFSET: Int =
  (MIN_HIGH_SURROGATE - (MIN_SUPPLEMENTARY_CODE_POINT_ ushr 10))

public fun isBmpCodePoint(codePoint: Int): Boolean =
  codePoint ushr 16 == 0

public fun highSurrogate(codePoint: Int): Char =
  ((codePoint ushr 10) + HIGH_SURROGATE_ENCODE_OFFSET).toChar()

public fun lowSurrogate(codePoint: Int): Char =
  ((codePoint and 0x3FF) + MIN_LOW_SURROGATE).toChar()

public fun isValidCodePoint(codePoint: Int): Boolean =
  codePoint in 0..MAX_CODE_POINT_
