package com.strumenta.kotlinmultiplatform

actual object Collections {
    actual fun unmodifiableList(asList: Collection<*>): List<*> {
        return asList.toList()
    }

    actual fun <T, U> unmodifiableMap(map: Map<T, U>): MutableMap<T, U> {
        return java.util.Collections.unmodifiableMap(map)
    }

    actual fun <T : Comparable<T>> min(precedencePredicates: List<T>): T {
        return java.util.Collections.min(precedencePredicates)
    }

    actual fun <T : Comparable<T>> max(precedencePredicates: List<T>): T {
        return java.util.Collections.max(precedencePredicates)
    }

}