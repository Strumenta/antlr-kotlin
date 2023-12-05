package com.strumenta.kotlinmultiplatform

object Collections {
    fun <T : Comparable<T>> min(precedencePredicates: List<T>): T {
        return precedencePredicates.minOrNull() ?: throw NoSuchElementException()
    }

    fun <T : Comparable<T>> max(precedencePredicates: List<T>): T {
        return precedencePredicates.maxOrNull() ?: throw NoSuchElementException()
    }
}
