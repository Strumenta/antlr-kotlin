package com.strumenta.kotlinmultiplatform

actual object Collections {
    actual fun unmodifiableList(asList: Collection<*>): List<*> {
        return asList.toList()
    }

    actual fun <T, U> unmodifiableMap(t: T): U {
        TODO("Collections.unmodifiableMap not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual fun <T : Comparable<T>> min(precedencePredicates: List<T>): T {
        TODO("Collections.min not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual fun <T : Comparable<T>> max(precedencePredicates: List<T>): T {
        TODO("Collections.max not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}