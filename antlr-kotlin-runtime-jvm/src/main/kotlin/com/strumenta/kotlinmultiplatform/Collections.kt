package com.strumenta.kotlinmultiplatform

actual object Collections {
    actual fun unmodifiableList(asList: Collection<*>): List<*> {
        return asList.toList()
    }

    actual fun <T, U> unmodifiableMap(t: T): U {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual fun <T : Comparable<T>> min(precedencePredicates: List<T>): T {
        TODO()
    }

    actual fun <T : Comparable<T>> max(precedencePredicates: List<T>): T {
        TODO()
    }

}