package com.strumenta.kotlinmultiplatform

actual inline fun <R> synchronized(lock: Any, block: () -> R): R {
    // TODO: Not supported by Kotlin/Native
    return block()
}