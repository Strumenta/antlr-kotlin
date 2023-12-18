package com.strumenta.kotlinmultiplatform

import java.lang.System as JavaSystem

internal actual fun platformGetEnv(name: String): String? =
  JavaSystem.getenv(name)
