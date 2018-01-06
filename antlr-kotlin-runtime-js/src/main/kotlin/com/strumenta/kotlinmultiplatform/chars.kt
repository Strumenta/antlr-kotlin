package com.strumenta.kotlinmultiplatform

import org.w3c.dom.CharacterData

actual fun Char.Companion.isSupplementaryCodePoint(codePoint: Int): Boolean {
    TODO("Char.Companion.isSupplementaryCodePoint not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun Char.Companion.charCount(i: Int): Byte {
    TODO("Char.Companion.charCount not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun Char.Companion.maxValue(): Char {
    return '\uFFFF'
}

actual fun String.toCharArray(): CharArray {
    return CharArray(this.length) {
        this[it]
    }
}

actual fun Char.Companion.toChars(codePoint: Int, resultArray: CharArray, resultIdx: Int): Int {
    TODO("Char.Companion.toChars not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun isCharUppercase(firstChar: Char): Boolean {
    if (firstChar.toUpperCase() == firstChar.toLowerCase()) {
        return false
    }
    return firstChar == firstChar.toUpperCase()
}

actual fun isCharLowerCase(firstChar: Char): Boolean {
    if (firstChar.toUpperCase() == firstChar.toLowerCase()) {
        return false
    }
    return firstChar == firstChar.toLowerCase()
}
