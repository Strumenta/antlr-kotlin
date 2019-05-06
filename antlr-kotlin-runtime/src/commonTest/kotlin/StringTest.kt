import com.strumenta.kotlinmultiplatform.toCharArray
import kotlin.test.Test as test

class MiscStringTest : BaseTest() {

    @test
    fun testToCharArrayEmpty() {
        assertArrayEquals(charArrayOf(), "".toCharArray())
    }

    @test
    fun testToCharArrayEmptyLength() {
        assertEquals(0, "".toCharArray().size)
    }

    @test
    fun testToCharArrayEmptyEl0() {
        assertEquals('a', "abc def".toCharArray()[0])
    }

    @test
    fun testToCharArray() {
        assertArrayEquals(charArrayOf('a', 'b', 'c', ' ', 'd', 'e', 'f'), "abc def".toCharArray())
    }

}

