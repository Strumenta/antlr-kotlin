package com.strumenta.kotlinmultiplatform

internal actual fun logError(message: String) {
  System.err.println(message)
}
