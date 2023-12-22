package com.strumenta.antlrkotlin.runtime

internal actual fun platformPrintErrLn(): Unit =
  js("console.error('')")

internal actual fun platformPrintErrLn(message: String): Unit =
  js("console.error(message)")

internal actual fun platformPrintErr(message: String): Unit =
  js("console.error(message)")
