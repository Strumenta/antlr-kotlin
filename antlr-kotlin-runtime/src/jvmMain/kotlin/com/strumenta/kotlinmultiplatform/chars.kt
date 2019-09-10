package com.strumenta.kotlinmultiplatform

actual fun Char.Companion.isSupplementaryCodePoint(codePoint: Int): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun Char.Companion.charCount(i: Int): Byte {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun Char.Companion.maxValue(): Char = '\uFFFF'

actual fun Char.Companion.toChars(codePoint: Int, resultArray: CharArray, resultIdx: Int): Int {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun isCharUppercase(firstChar: Char): Boolean {
    return firstChar.isUpperCase()
}

actual fun isCharLowerCase(firstChar: Char): Boolean {
    return firstChar.isLowerCase()
}
