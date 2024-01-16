// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
@file:Suppress("NOTHING_TO_INLINE")

package com.strumenta.antlrkotlin.runtime

import java.lang.System as JavaSystem

internal actual inline fun platformPrintErrLn(): Unit =
  JavaSystem.err.println()

internal actual inline fun platformPrintErrLn(message: String): Unit =
  JavaSystem.err.println(message)

internal actual inline fun platformPrintErr(message: String): Unit =
  JavaSystem.err.print(message)
