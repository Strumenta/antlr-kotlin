package com.strumenta.kotlinmultiplatform

actual fun <T> Array<T>.indices(): List<Int> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun IntArray.indices(): List<Int> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun <T> arraycopy(tokens: Array<T>, p: Int, tokens1: Array<T>, i: Int, i1: Int) {
    TODO()
}

actual fun <T> Array<T>.clone(): Array<T> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual object Arrays {
    actual fun <T> asList(vararg elements: T): List<T> {
        return java.util.Arrays.asList(*elements)
    }
    actual fun <T> copyOf(original: Array<T>, size: Int): Array<T> {
        return java.util.Arrays.copyOf(original, size)
    }

    actual fun equals(a: Array<*>, b: Array<*>) : Boolean {
        return java.util.Arrays.equals(a, b)
    }

    actual fun toString(a: Array<*>): String {
        return java.util.Arrays.toString(a)
    }
}
