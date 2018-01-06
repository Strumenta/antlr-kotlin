package com.strumenta.kotlinmultiplatform

actual fun assert(condition: Boolean) {
    if (!condition) throw AssertionError()
}

actual fun outMessage(message: String) {
    print(message)
}

actual fun errMessage(message: String) {
    System.err.print(message)
}