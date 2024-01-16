// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
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
