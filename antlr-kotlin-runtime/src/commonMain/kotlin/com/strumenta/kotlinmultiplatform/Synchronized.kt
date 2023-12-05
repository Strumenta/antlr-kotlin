package com.strumenta.kotlinmultiplatform

expect inline fun <R> synchronized(lock: Any, block: () -> R): R
