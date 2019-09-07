import kotlin.test.Test as test


class MiscStringTest : BaseTest() {

    @test
    fun testToCharArrayEmpty() {
        assertArrayEquals(charArrayOf(), "".map { it }.toCharArray())
    }

    @test
    fun testToCharArrayEmptyLength() {
        assertEquals(0, "".map { it }.toCharArray().size)
    }

    @test
    fun testToCharArrayEmptyEl0() {
        assertEquals('a', "abc def".map { it }.toCharArray()[0])
    }

    @test
    fun testToCharArray() {
        assertArrayEquals(charArrayOf('a', 'b', 'c', ' ', 'd', 'e', 'f'), "abc def".map { it }.toCharArray())
    }

}

