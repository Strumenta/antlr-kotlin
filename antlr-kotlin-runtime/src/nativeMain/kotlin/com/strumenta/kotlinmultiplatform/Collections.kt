package com.strumenta.kotlinmultiplatform

actual object Collections {

    actual fun <T : Comparable<T>> min(precedencePredicates: List<T>): T {
        return precedencePredicates.min() ?: throw NoSuchElementException()
    }

    actual fun <T : Comparable<T>> max(precedencePredicates: List<T>): T {
        return precedencePredicates.max() ?: throw NoSuchElementException()
    }
}
