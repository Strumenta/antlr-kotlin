/*
 * Copyright (C) 2021 Strumenta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
