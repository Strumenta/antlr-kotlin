package com.strumenta.antlrkotlin.runtime

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

// Not needed, JavaScript is single-threaded
@OptIn(ExperimentalContracts::class)
public actual inline fun <R> synchronized(lock: Any, block: () -> R): R {
  contract {
    callsInPlace(block, InvocationKind.EXACTLY_ONCE)
  }

  return block()
}
