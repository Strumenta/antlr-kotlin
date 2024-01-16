// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime.ext

import com.strumenta.antlrkotlin.runtime.highSurrogate
import com.strumenta.antlrkotlin.runtime.isBmpCodePoint
import com.strumenta.antlrkotlin.runtime.isValidCodePoint
import com.strumenta.antlrkotlin.runtime.lowSurrogate

/**
 * Appends the string representation of the [codePoint] argument to this sequence.
 *
 * See Java's `StringBuilder.appendCodePoint`.
 */
public fun <T : Appendable> T.appendCodePoint(codePoint: Int): T {
  if (isBmpCodePoint(codePoint)) {
    append(codePoint.toChar())
  } else if (isValidCodePoint(codePoint)) {
    append(highSurrogate(codePoint))
    append(lowSurrogate(codePoint))
  } else {
    throw IllegalArgumentException("Not a valid Unicode code point: ${codePoint.toHex()}")
  }

  return this
}
