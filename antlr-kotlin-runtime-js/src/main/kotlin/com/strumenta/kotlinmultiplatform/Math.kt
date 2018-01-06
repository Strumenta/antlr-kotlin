package com.strumenta.kotlinmultiplatform

actual object Math {
    actual fun min(a: Int, b: Int): Int {
        return kotlin.js.Math.min(a, b)
    }

    actual fun max(a: Int, b: Int): Int {
        return kotlin.js.Math.max(a, b)
    }

    actual fun floor(d: Double): Double {
        return kotlin.js.Math.floor(d).toDouble()
    }

}