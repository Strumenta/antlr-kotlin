import kotlin.test.Test

class StringTest : BaseTest() {
  @Test
  fun testAsCharArrayEmpty() {
    assertArrayEquals(charArrayOf(), "".toCharArray())
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
    assertArrayEquals(charArrayOf('a', 'b', 'c', ' ', 'd', 'e', 'f'), "abc def".toCharArray())
  }
}
