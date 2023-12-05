package com.strumenta.kotlinmultiplatform

object Math {
    fun min(a: Int, b: Int): Int {
        return kotlin.math.min(a, b)
    }

    fun max(a: Int, b: Int): Int {
        return kotlin.math.max(a, b)
    }

    fun floor(d: Double): Double {
        return kotlin.math.floor(d)
    }
}
