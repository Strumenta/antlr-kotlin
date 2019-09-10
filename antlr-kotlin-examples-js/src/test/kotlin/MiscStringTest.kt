import com.strumenta.kotlinmultiplatform.asCharArray
import kotlin.test.*

fun assertArrayEquals(a: CharArray, b: CharArray) {
    assertEquals(a.size, b.size)
    for (i in 0..a.size) {
        assertEquals(a[i], b[i])
    }
}

class MiscStringTest {

    @Test fun testToCharArrayEmpty() {
        assertArrayEquals(charArrayOf(), "".asCharArray())
    }

    @Test fun testToCharArrayEmptyLength() {
        assertEquals(0, "".asCharArray().size)
    }

    @Test fun testToCharArrayEmptyEl0() {
        assertEquals('a', "abc def".asCharArray()[0])
    }

    @Test fun testToCharArray() {
        assertArrayEquals(charArrayOf('a', 'b', 'c', ' ', 'd', 'e', 'f'), "abc def".asCharArray())
    }

}

