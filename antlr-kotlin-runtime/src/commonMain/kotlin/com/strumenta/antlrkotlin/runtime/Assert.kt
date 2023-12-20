package com.strumenta.antlrkotlin.runtime

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

/**
 * Throws an [AssertionError] if the [condition] is `false`.
 */
@OptIn(ExperimentalContracts::class)
@Suppress("NOTHING_TO_INLINE", "KotlinRedundantDiagnosticSuppress")
public inline fun assert(condition: Boolean, message: String? = null) {
  contract {
    returns() implies condition
  }

  if (!condition) {
    throw AssertionError(message)
  }
}
