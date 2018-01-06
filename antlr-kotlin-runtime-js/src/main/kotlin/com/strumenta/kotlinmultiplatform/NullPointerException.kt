package com.strumenta.kotlinmultiplatform

actual class NullPointerException : Throwable {
    actual constructor() : super()
    actual constructor(message: String) : super(message)
}
