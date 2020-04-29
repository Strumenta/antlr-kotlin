package com.strumenta.kotlinmultiplatform

actual fun <T> arraycopy(src: Array<T>, srcPos: Int, dest: Array<T>, destPos: Int, length: Int) {
    src.copyInto(dest,
            destinationOffset = destPos,
            startIndex = srcPos,
            endIndex = srcPos + length)
}

actual fun arraycopy(src: IntArray, srcPos: Int, dest: IntArray, destPos: Int, length: Int) {
    src.copyInto(dest,
            destinationOffset = destPos,
            startIndex = srcPos,
            endIndex = srcPos + length)
}
