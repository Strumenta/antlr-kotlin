@file:Suppress("NOTHING_TO_INLINE")

package com.strumenta.kotlinmultiplatform

import java.lang.System as JavaSystem

internal actual inline fun platformPrintErrLn(): Unit =
  JavaSystem.err.println()

internal actual inline fun platformPrintErrLn(message: String): Unit =
  JavaSystem.err.println(message)

internal actual inline fun platformPrintErr(message: String): Unit =
  JavaSystem.err.print(message)
