// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
@file:Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")

package com.strumenta.antlrkotlin.runtime

import kotlin.experimental.ExperimentalNativeApi
import kotlin.native.internal.GCUnsafeCall
import kotlin.native.internal.InternalForKotlinNative

@OptIn(ExperimentalNativeApi::class)
private val lineBreak = if (Platform.osFamily == OsFamily.WINDOWS) "\r\n" else "\n"

@OptIn(InternalForKotlinNative::class)
@GCUnsafeCall("Kotlin_io_Console_printToStdErr")
private external fun runtimePrintToStdErr(message: String)

internal actual inline fun platformPrintErrLn(): Unit =
  runtimePrintToStdErr(lineBreak)

internal actual inline fun platformPrintErrLn(message: String): Unit =
  runtimePrintToStdErr("$message$lineBreak")

internal actual inline fun platformPrintErr(message: String): Unit =
  runtimePrintToStdErr(message)
