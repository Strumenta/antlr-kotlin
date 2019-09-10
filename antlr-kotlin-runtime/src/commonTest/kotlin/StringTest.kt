import com.strumenta.kotlinmultiplatform.asCharArray
import kotlin.test.Test as test

class MiscStringTest : BaseTest() {

    @test
    fun testAsCharArrayEmpty() {
        assertArrayEquals(charArrayOf(), "".asCharArray())
    }

    @test
    fun testAsCharArrayEmptyLength() {
        assertEquals(0, "".asCharArray().size)
    }

    @test
    fun testAsCharArrayEmptyEl0() {
        assertEquals('a', "abc def".asCharArray()[0])
    }

    @test
    fun testAsCharArray() {
        assertArrayEquals(charArrayOf('a', 'b', 'c', ' ', 'd', 'e', 'f'), "abc def".asCharArray())
    }

}

