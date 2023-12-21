package com.strumenta.antlrkotlin.runtime.ext

@OptIn(ExperimentalStdlibApi::class)
private val hexFormat: HexFormat = HexFormat {
  upperCase = true
  number {
    prefix = "0x"
    removeLeadingZeros = true
  }
}

@OptIn(ExperimentalStdlibApi::class)
public fun Int.toHex(): String =
  toHexString(hexFormat)
