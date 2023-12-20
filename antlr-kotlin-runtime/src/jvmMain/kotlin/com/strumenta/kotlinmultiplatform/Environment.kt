package com.strumenta.kotlinmultiplatform

import java.lang.System as JavaSystem

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun platformGetEnv(name: String): String? =
  JavaSystem.getenv(name)
