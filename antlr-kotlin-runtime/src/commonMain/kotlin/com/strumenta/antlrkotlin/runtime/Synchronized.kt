// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

/**
 * Multiplatform `synchronized` (monitor-based locking) implementation
 * * On the JVM this delegates to Java's `synchronized`
 * * On Web targets, this is a NOOP, as there is no shared memory concurrency
 * * On native targets, this uses AtomicFU and a simple enough custom implementation that handles
 *   realistic uses cases well enough and is easy to reason about
 */
internal expect inline fun <R> synchronized(lock: Any, block: () -> R): R
