package com.strumenta.kotlinmultiplatform

internal actual fun printErrorLine(message: String) {
  console.error(message)
}

internal actual fun printError(message: String) {
  console.error(message)
}
