import kotlin.test.DefaultAsserter

open class BaseTest {
    private val asserter = DefaultAsserter()

    protected fun assertEquals(a: Any?, b: Any?) {
        asserter.assertEquals("$a was expected to be equal to $b", a, b)
    }

    protected fun assertTrue(a: Boolean) {
        asserter.assertTrue("$a was expected to be true", a)
    }

    protected fun assertArrayEquals(a: CharArray, b: CharArray) {
        assertEquals(a.size, b.size)
        for (i in 0 until a.size) {
            assertEquals(a[i], b[i])
        }
    }
}