package com.strumenta.kotlinmultiplatform

actual inline fun <R> synchronized(lock: Any, block: () -> R): R =
        kotlin.synchronized(lock, block)