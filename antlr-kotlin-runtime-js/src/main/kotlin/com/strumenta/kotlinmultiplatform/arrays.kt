package com.strumenta.kotlinmultiplatform

actual fun <T> Array<T>.indices(): List<Int> {
    TODO("Array<T>.indices not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun IntArray.indices(): List<Int> {
    TODO("IntArray.indices not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun <T> arraycopy(tokens: Array<T>, p: Int, tokens1: Array<T>, i: Int, i1: Int) {
    TODO("arraycopy not implemented")
}

actual fun <T> Array<T>.clone(): Array<T> {
    TODO("Array<T>.clone() not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual object Arrays {

    actual fun <T> asList(vararg elements: T): List<T> {
        return elements.asList()
    }

    actual fun <T> copyOf(original: Array<T>, size: Int): Array<T> {
        val res = original.copyOf(size)
        return res as Array<T>
    }

    actual fun equals(a: Array<*>, b: Array<*>) : Boolean {
        if (a.size != b.size) {
            return false
        }
        for (i in 0..a.size) {
            if (a[i] != b[i]) {
                return false
            }
        }
        return true
    }

    actual fun toString(a: Array<*>): String {
        return "[${a.joinToString(separator = ", ") { it?.toString() ?: "null"}}]"
    }
}