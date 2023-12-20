package com.strumenta.kotlinmultiplatform

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import platform.posix.getenv

@OptIn(ExperimentalForeignApi::class)
internal actual inline fun platformGetEnv(name: String): String? =
  getenv(name)?.toKString()
