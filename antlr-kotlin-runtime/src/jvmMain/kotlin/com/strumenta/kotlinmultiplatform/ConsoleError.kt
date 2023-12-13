package com.strumenta.kotlinmultiplatform

internal actual fun printErrorLine(message: String) {
  System.err.println(message)
}

internal actual fun printError(message: String) {
  System.err.print(message)
}
