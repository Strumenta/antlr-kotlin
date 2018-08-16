package org.antlr.v4.kotlinruntime.misc

import kotlin.test.assertEquals
import kotlin.test.Test as test

class IntegerListTest {

    @test fun addToIntegerList() {
        val il = IntegerList()
        il.add(10)
        assertEquals(1, il.size())
        assertEquals(10, il[0])
    }

}
