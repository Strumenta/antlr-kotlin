package com.strumenta.kotlinmultiplatform.ext

import com.strumenta.kotlinmultiplatform.highSurrogate
import com.strumenta.kotlinmultiplatform.isBmpCodePoint
import com.strumenta.kotlinmultiplatform.isValidCodePoint
import com.strumenta.kotlinmultiplatform.lowSurrogate

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
