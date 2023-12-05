package com.strumenta.kotlinmultiplatform

object Arrays {
    fun equals(a: Array<*>?, b: Array<*>?): Boolean {
        return (a == null && b == null) ||
                ((a != null && b != null) && a.contentEquals(b))
    }

    fun equals(a: IntArray?, b: IntArray?): Boolean {
        return (a == null && b == null) ||
                ((a != null && b != null) && a.contentEquals(b))
    }
}
