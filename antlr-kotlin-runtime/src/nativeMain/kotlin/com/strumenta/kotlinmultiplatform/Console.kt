package com.strumenta.kotlinmultiplatform

import kotlinx.cinterop.ExperimentalForeignApi
import platform.posix.fprintf
import platform.posix.stderr
import kotlin.experimental.ExperimentalNativeApi

@OptIn(ExperimentalNativeApi::class)
private val lineBreak = when (Platform.osFamily) {
  OsFamily.WINDOWS -> "\r\n"
  else -> "\n"
}

@OptIn(ExperimentalForeignApi::class)
internal actual fun platformPrintErrLn(message: String) {
  fprintf(stderr, "%s", message)
}

@OptIn(ExperimentalForeignApi::class)
internal actual fun platformPrintErr(message: String) {
  fprintf(stderr, "%s$lineBreak", message)
}