// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime.ext

import com.strumenta.antlrkotlin.runtime.*

public fun Char.Companion.isSupplementaryCodePoint(codePoint: Int): Boolean =
  codePoint in MIN_SUPPLEMENTARY_CODE_POINT_..MAX_CODE_POINT_

public fun Char.Companion.toChars(codePoint: Int, destination: CharArray, offset: Int): Int {
  when {
    isBmpCodePoint(codePoint) -> {
      destination.setSafe(offset, codePoint.toChar())
      return 1
    }
    isValidCodePoint(codePoint) -> {
      // When writing the low surrogate succeeds but writing the high surrogate fails (offset = -1), the
      // destination will be modified even though the method throws. This feels wrong, but matches the behavior
      // of the Java stdlib implementation.
      destination.setSafe(offset + 1, lowSurrogate(codePoint))
      destination.setSafe(offset, highSurrogate(codePoint))
      return 2
    }
    else -> throw IllegalArgumentException("Not a valid Unicode code point: ${codePoint.toHex()}")
  }
}

public fun Char.Companion.charCount(codePoint: Int): Int =
  if (codePoint >= MIN_SUPPLEMENTARY_CODE_POINT_) {
    2
  } else {
    1
  }

private fun CharArray.setSafe(index: Int, value: Char) {
  if (index !in this.indices) {
    throw IndexOutOfBoundsException("Size: $size, offset: $index")
  }

  this[index] = value
}
