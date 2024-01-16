// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

/**
 * Thrown to indicate that a stack is empty.
 */
public class EmptyStackException(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
