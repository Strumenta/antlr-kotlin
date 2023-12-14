package com.strumenta.kotlinmultiplatform

internal actual fun platformPrintErrLn(message: String): Unit =
  System.err.println(message)

internal actual fun platformPrintErr(message: String): Unit =
  System.err.print(message)
