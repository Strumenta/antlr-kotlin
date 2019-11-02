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

