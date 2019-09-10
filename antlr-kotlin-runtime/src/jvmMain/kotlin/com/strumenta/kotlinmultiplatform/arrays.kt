package com.strumenta.kotlinmultiplatform

actual fun <T> arraycopy(src: Array<T>, srcPos: Int, dest: Array<T>, destPos: Int, length: Int) {
    System.arraycopy(src, srcPos, dest, destPos, length)
}

actual fun arraycopy(src: IntArray, srcPos: Int, dest: IntArray, destPos: Int, length: Int) {
    System.arraycopy(src, srcPos, dest, destPos, length)
}
