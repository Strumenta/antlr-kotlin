// Copyright 2017-2024 Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024 Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import java.lang.System as JavaSystem

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun platformGetEnv(name: String): String? =
  JavaSystem.getenv(name)
