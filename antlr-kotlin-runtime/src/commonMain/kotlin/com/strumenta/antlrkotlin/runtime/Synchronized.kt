// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

// Builds perfectly fine with AtomicFu 0.33, and the native implementation is simple enough to reason about
// handles contention well enough and does not grow abundantly in real-world use cases
internal expect inline fun <R> synchronized(lock: Any, block: () -> R): R
