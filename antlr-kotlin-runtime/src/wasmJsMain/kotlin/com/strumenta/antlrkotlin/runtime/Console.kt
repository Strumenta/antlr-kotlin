// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

internal actual fun platformPrintErrLn(): Unit =
  js("console.error('')")

internal actual fun platformPrintErrLn(message: String): Unit =
  js("console.error(message)")

internal actual fun platformPrintErr(message: String): Unit =
  js("console.error(message)")
