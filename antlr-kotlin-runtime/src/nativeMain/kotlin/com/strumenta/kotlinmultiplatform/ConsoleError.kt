package com.strumenta.kotlinmultiplatform

import kotlinx.cinterop.ExperimentalForeignApi
import platform.posix.fprintf
import platform.posix.stderr

@OptIn(ExperimentalForeignApi::class)
internal actual fun logError(message: String) {
  fprintf(stderr, message)
}
