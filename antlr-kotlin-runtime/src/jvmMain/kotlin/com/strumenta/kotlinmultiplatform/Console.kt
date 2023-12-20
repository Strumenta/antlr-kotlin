package com.strumenta.kotlinmultiplatform

import java.lang.System as JavaSystem

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun platformPrintErrLn(): Unit =
  JavaSystem.err.println()

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun platformPrintErrLn(message: String): Unit =
  JavaSystem.err.println(message)

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun platformPrintErr(message: String): Unit =
  JavaSystem.err.print(message)
