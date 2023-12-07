package com.strumenta.kotlinmultiplatform.ext

@OptIn(ExperimentalStdlibApi::class)
public fun <T : Appendable> T.appendCodePoint(codePoint: Int): T {
  if (isBmpCodePoint(codePoint)) {
    append(codePoint.toChar())
  } else if (isValidCodePoint(codePoint)) {
    append(highSurrogate(codePoint))
    append(lowSurrogate(codePoint))
  } else {
    throw IllegalArgumentException("Not a valid Unicode code point: ${codePoint.toHexString()}")
  }

  return this
}
