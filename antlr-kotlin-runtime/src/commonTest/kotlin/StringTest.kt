import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class StringTest {
  @Test
  fun testAsCharArrayEmpty() {
    assertContentEquals(charArrayOf(), "".toCharArray())
  }

  @Test
  fun testAsCharArrayEmptyLength() {
    assertEquals(0, "".toCharArray().size)
  }

  @Test
  fun testAsCharArrayEmptyEl0() {
    assertEquals('a', "abc def".toCharArray()[0])
  }

  @Test
  fun testAsCharArray() {
    assertContentEquals(charArrayOf('a', 'b', 'c', ' ', 'd', 'e', 'f'), "abc def".toCharArray())
  }
}
