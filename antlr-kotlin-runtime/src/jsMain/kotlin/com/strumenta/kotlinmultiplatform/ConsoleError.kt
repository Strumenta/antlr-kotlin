package com.strumenta.kotlinmultiplatform

internal actual fun logError(message: String) {
  console.error(message)
}
