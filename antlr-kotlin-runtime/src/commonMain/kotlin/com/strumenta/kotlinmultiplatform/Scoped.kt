package com.strumenta.kotlinmultiplatform

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * @author Edoardo Luppi
 */
@OptIn(ExperimentalContracts::class)
@Suppress("unused")
inline fun scoped(block: () -> Unit) {
  contract {
    callsInPlace(block, InvocationKind.EXACTLY_ONCE)
  }

  block()
}
