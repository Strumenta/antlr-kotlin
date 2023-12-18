package com.strumenta.kotlinmultiplatform

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@OptIn(ExperimentalContracts::class)
public inline fun assert(condition: Boolean, lazyMessage: () -> String? = { null }) {
  contract {
    returns() implies condition
  }

  if (!condition) {
    val message = lazyMessage()
    throw AssertionError(message)
  }
}
