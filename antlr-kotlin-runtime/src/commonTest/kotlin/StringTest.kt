import com.strumenta.kotlinmultiplatform.asCharArray
import kotlin.test.Test

class StringTest : BaseTest() {
  @Test
  fun testAsCharArrayEmpty() {
    assertArrayEquals(charArrayOf(), "".asCharArray())
  }

  @Test
  fun testAsCharArrayEmptyLength() {
    assertEquals(0, "".asCharArray().size)
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
