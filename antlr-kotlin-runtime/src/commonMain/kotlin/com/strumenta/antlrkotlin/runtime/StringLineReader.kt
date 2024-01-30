// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

public class StringLineReader(str: String) : LineReader {
  private val lines = str.lineSequence().iterator()

  override fun readLine(): String =
    readLineOrNull() ?: throw NoSuchElementException()

  override fun readLineOrNull(): String? =
    if (lines.hasNext()) lines.next() else null
}
