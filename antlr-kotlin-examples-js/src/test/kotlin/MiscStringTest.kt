import com.strumenta.kotlinmultiplatform.toCharArray
import kotlin.test.*

fun assertArrayEquals(a: CharArray, b: CharArray) {
    assertEquals(a.size, b.size)
    for (i in 0..a.size) {
        assertEquals(a[i], b[i])
    }
}

class MiscStringTest {

    @Test fun testToCharArrayEmpty() {
        assertArrayEquals(charArrayOf(), "".map { it }.toCharArray())
    }

    @Test fun testToCharArrayEmptyLength() {
        assertEquals(0, "".map { it }.toCharArray().size)
    }

    @Test fun testToCharArrayEmptyEl0() {
        assertEquals('a', "abc def".map { it }.toCharArray()[0])
    }

    @Test fun testmap { it }.toCharArray() {
        assertArrayEquals(charArrayOf('a', 'b', 'c', ' ', 'd', 'e', 'f'), "abc def".map { it }.toCharArray())
    }

}

