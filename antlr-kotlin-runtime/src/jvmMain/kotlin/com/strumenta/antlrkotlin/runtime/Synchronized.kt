// Copyright 2017-2024 Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024 Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

public actual inline fun <R> synchronized(lock: Any, block: () -> R): R =
  kotlin.synchronized(lock, block)
