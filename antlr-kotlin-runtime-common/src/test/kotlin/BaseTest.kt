import kotlin.test.DefaultAsserter

open class BaseTest {
    private val asserter = DefaultAsserter()

    protected fun assertEquals(a: Any?, b: Any?) {
        asserter.assertEquals("$a was expected to be equal to $b", a, b)
    }

    protected fun assertTrue(a: Boolean) {
        asserter.assertTrue("$a was expected to be true", a)
    }
}