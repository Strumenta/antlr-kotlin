package com.strumenta.kotlinmultiplatform

internal actual fun platformPrintErrLn(message: String): Unit =
  console.error(message)

internal actual fun platformPrintErr(message: String): Unit =
  console.error(message)
