package com.strumenta.kotlinmultiplatform

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun platformPrintErrLn(): Unit =
  console.error("")

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun platformPrintErrLn(message: String): Unit =
  console.error(message)

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun platformPrintErr(message: String): Unit =
  console.error(message)
