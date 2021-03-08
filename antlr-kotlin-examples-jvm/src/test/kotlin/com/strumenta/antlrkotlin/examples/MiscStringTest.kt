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

package com.strumenta.antlrkotlin.examples

import com.strumenta.kotlinmultiplatform.asCharArray
import com.strumenta.kotlinmultiplatform.convertToString
import kotlin.test.Test
import kotlin.test.assertEquals

fun assertArrayEquals(a: CharArray, b: CharArray) {
    assertEquals(a.size, b.size)
    for (i in a.indices) {
        assertEquals(a[i], b[i])
    }
}

class MiscStringTest {

    @Test
    fun testAsCharArrayEmpty() {
        assertArrayEquals(charArrayOf(), "".asCharArray())
    }

    @Test
    fun testAsCharArrayEmptyLength() {
        assertEquals(0, "".asCharArray().size)
    }

    @Test
    fun testUnicodeAsCharArray() {
        assertArrayEquals(charArrayOf('a', '\uD83D', '\uDE31', 'b'), "a😱b".asCharArray())
    }

    @Test
    fun testUnicodeToString() {
        assertEquals(charArrayOf('a', '\uD83D', '\uDE31', 'b').convertToString(), "a😱b")
    }

    @Test
    fun testAsCharArrayEmptyEl0() {
        assertEquals('a', "abc def".asCharArray()[0])
    }

    @Test
    fun testAsCharArray() {
        assertArrayEquals(charArrayOf('a', 'b', 'c', ' ', 'd', 'e', 'f'), "abc def".asCharArray())
    }

}

