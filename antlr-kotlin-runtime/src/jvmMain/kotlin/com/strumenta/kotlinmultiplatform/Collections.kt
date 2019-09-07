package com.strumenta.kotlinmultiplatform

actual object Collections {

    actual fun <T : Comparable<T>> min(precedencePredicates: List<T>): T {
        return java.util.Collections.min(precedencePredicates)
    }

    actual fun <T : Comparable<T>> max(precedencePredicates: List<T>): T {
        return java.util.Collections.max(precedencePredicates)
    }

}
