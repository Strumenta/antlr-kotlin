// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

public interface LineReader {
  /**
   * Reads and returns the next line, or throws [NoSuchElementException] if no line can be read.
   */
  public fun readLine(): String

  /**
   * Reads and returns the next line, or returns `null` if no line can be read.
   */
  public fun readLineOrNull(): String?
}
