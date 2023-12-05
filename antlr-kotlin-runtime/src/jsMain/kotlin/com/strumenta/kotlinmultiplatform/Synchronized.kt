package com.strumenta.kotlinmultiplatform

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

// Not needed, JavaScript is single-threaded
@OptIn(ExperimentalContracts::class)
actual inline fun <R> synchronized(lock: Any, block: () -> R): R {
  contract {
    callsInPlace(block, InvocationKind.EXACTLY_ONCE)
  }

  return block()
}
