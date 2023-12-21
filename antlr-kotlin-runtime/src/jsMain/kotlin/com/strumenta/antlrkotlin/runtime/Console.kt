@file:Suppress("NOTHING_TO_INLINE")

package com.strumenta.antlrkotlin.runtime

internal actual inline fun platformPrintErrLn(): Unit =
  console.error("")

internal actual inline fun platformPrintErrLn(message: String): Unit =
  console.error(message)

internal actual inline fun platformPrintErr(message: String): Unit =
  console.error(message)
