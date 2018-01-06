package com.strumenta.kotlinmultiplatform

actual fun assert(condition: Boolean) {
    if (!condition) throw RuntimeException("Assertion failed")
}

actual fun outMessage(message: String) {
    print(message)
}

actual fun errMessage(message: String) {
    print("ERR: $message")
}
