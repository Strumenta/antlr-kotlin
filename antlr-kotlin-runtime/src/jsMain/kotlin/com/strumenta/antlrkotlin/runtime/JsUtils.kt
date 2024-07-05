// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
@file:Suppress("NOTHING_TO_INLINE", "UnsafeCastFromDynamic")

package com.strumenta.antlrkotlin.runtime

/**
 * Normalizes potentially `undefined` values to `null`.
 */
internal inline fun <T> undefinedToNull(value: T): T =
  if (value === js("undefined")) js("null") else value

/**
 * Creates a new generic array with an initial [size],
 * without requiring the initialization of the elements.
 */
@Suppress("UNUSED_PARAMETER")
internal inline fun <T> newArray(size: Int): Array<T> =
  js("Array(size)")

/**
 * Returns whether we are running on Node.js, or not.
 */
internal fun isNodeJs(): Boolean =
  js(
    """
    (typeof process !== 'undefined'
      && process.versions != null
      && process.versions.node != null) ||
    (typeof window !== 'undefined'
      && typeof window.process !== 'undefined'
      && window.process.versions != null
      && window.process.versions.node != null)
    """
  )
