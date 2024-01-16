// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

// TODO(Edoardo): wait for AtomicFU 0.24.0, so that we can
//  integrate it without buildscript hacks.
//  Also, how are we going to use the "lock" parameter?
//  Probably it makes sense to just tell consumers the
//  Kotlin Native implementation is not thread safe.
public expect inline fun <R> synchronized(lock: Any, block: () -> R): R
