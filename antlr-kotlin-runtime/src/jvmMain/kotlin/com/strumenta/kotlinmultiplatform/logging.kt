package com.strumenta.kotlinmultiplatform

actual fun assert(condition: Boolean) {
    if (!condition) throw AssertionError()
}

actual fun errMessage(message: String) {
    System.err.println(message)
}