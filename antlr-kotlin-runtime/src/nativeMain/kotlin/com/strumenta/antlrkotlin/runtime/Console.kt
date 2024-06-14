// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import kotlinx.cinterop.ExperimentalForeignApi
import platform.posix.fflush
import platform.posix.fprintf
import platform.posix.stderr
import kotlin.experimental.ExperimentalNativeApi

// Must throw an exception in all platforms but Android
internal expect fun androidPrintErr(message: String)

internal actual fun platformPrintErrLn(): Unit =
  printImpl(lineBreak)

internal actual fun platformPrintErrLn(message: String): Unit =
  printImpl("$message$lineBreak")

internal actual fun platformPrintErr(message: String): Unit =
  printImpl(message)

@OptIn(ExperimentalNativeApi::class)
private val lineBreak = if (Platform.osFamily == OsFamily.WINDOWS) "\r\n" else "\n"

// Let me explain what is going on here, why we have a generic
// function for all native targets and a specific one for Android.
//
// Why can't we simply declare nativePrintErr an expect function
// and implement it in appleMain/linuxMain/mingwMain/androidNativeMain?
//
// The answer is fprintf and fflush are not available under appleMain
// for some reason, even if they should be, and thus the compilation fails.
// This strategy is a temporary workaround until the problem is fixed.

@OptIn(ExperimentalNativeApi::class)
private val printImpl = if (Platform.osFamily == OsFamily.ANDROID) ::androidPrintErr else ::nativePrintErr

@OptIn(ExperimentalForeignApi::class)
private fun nativePrintErr(message: String) {
  fprintf(stderr, message)
  fflush(stderr)
}
