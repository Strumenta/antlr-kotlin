package com.strumenta.kotlinmultiplatform

actual object Math {
    actual fun min(a: Int, b: Int): Int {
       return java.lang.Math.min(a, b)
    }

    actual fun max(a: Int, b: Int): Int {
        return java.lang.Math.max(a, b)
    }

    actual fun floor(d: Double): Double {
        return java.lang.Math.floor(d)
    }

}