package com.strumenta.kotlinmultiplatform

actual fun <T> arraycopy(src: Array<T>, srcPos: Int, dest: Array<T>, destPos: Int, length: Int) {
    0.until(length).forEach { i ->
        dest[destPos + i] = src[srcPos + i]
    }
}

actual fun arraycopy(src: IntArray, srcPos: Int, dest: IntArray, destPos: Int, length: Int) {
    0.until(length).forEach { i ->
        dest[destPos + i] = src[srcPos + i]
    }
}
