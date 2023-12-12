package org.antlr.v4.kotlinruntime

/**
 * Thrown to indicate that a stack is empty.
 */
public class EmptyStackException(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
