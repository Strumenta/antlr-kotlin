package com.strumenta.kotlinmultiplatform

public actual inline fun <R> synchronized(lock: Any, block: () -> R): R =
  kotlin.synchronized(lock, block)
