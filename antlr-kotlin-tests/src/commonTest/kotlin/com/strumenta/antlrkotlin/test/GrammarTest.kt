package com.strumenta.antlrkotlin.test

import com.strumenta.antlrkotlin.util.loadResourceText
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.tree.Trees
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.fail

/**
 * The base class for implementing grammar tests.
 *
 * @author Edoardo Luppi
 */
abstract class GrammarTest<L : Lexer, P : Parser> {
  private companion object {
    private const val CHAR_CR = "\r"
    private const val CHAR_LF = "\n"
    private const val LITERAL_BACKSLASH_R = "\\\\r"
    private const val LITERAL_BACKSLASH_N = "\\\\n"
    private const val LITERAL_BACKSLASH_R_PLACEHOLDER = "literal-backslash-r"
    private const val LITERAL_BACKSLASH_N_PLACEHOLDER = "literal-backslash-n"
    private val REGEXP_PLACEHOLDERS = Regex("\\\\r|\\\\n|literal-backslash-r|literal-backslash-n")
  }

  data class LispTestRun(val exampleFilePath: String, val treeFilePath: String)
  data class ErrorsTestRun(val exampleFilePath: String, val errorsFilePath: String)

  /**
   * Creates and returns the appropriate [Lexer] for this grammar.
   */
  abstract fun createLexer(input: CharStream): L

  /**
   * Creates and returns the appropriate [Parser] for this grammar.
   */
  abstract fun createParser(input: TokenStream): P

  /**
   * Instructs the grammar test about which example files
   * should be parsed, and to which example LISP trees their
   * LISP representation should be matched against.
   *
   * A [LispTestRun] is a pair indicating the example source file to load,
   * and its expected LISP tree representation file.
   */
  abstract fun setupTreeTestRuns(runs: MutableSet<LispTestRun>)

  /**
   * Sets up syntax errors tests.
   *
   * A [ErrorsTestRun] is a pair indicating the example source file to parse,
   * and the file containing the expected syntax errors (one per line).
   */
  abstract fun setupErrorsTestRuns(runs: MutableSet<ErrorsTestRun>)

  /**
   * Returns the tree's node to use to match the LISP representation
   * or the outputted syntax errors.
   */
  abstract fun getTree(parser: P): ParserRuleContext

  @Test
  open fun matchesLispTree() {
    val testRuns = LinkedHashSet<LispTestRun>(32)
    setupTreeTestRuns(testRuns)
    testRuns.forEach(::executeLispTestRun)
  }

  @Test
  open fun matchesErrors() {
    val testRuns = LinkedHashSet<ErrorsTestRun>(32)
    setupErrorsTestRuns(testRuns)
    testRuns.forEach(::executeErrorsTestRun)
  }

  private fun executeLispTestRun(testRun: LispTestRun) {
    val languageSourceText = loadResourceText(testRun.exampleFilePath)
    val expectedLispTreeText = loadResourceText(testRun.treeFilePath)

    // Create the lexer
    val charStream = CharStreams.fromString(languageSourceText)
    val lexer = createLexer(charStream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(ThrowingErrorListener)

    // Create the parser
    val tokenStream = CommonTokenStream(lexer)
    val parser = createParser(tokenStream)
    parser.removeErrorListeners()
    parser.addErrorListener(ThrowingErrorListener)

    // Get the LISP tree and match it against the expected one
    val tree = getTree(parser)
    val lispTree = Trees.toStringTree(tree, parser)

    assertEquals(
      expected = expectedLispTreeText,
      actual = lispTree,
      message = "Outputted LISP tree for file '${testRun.exampleFilePath}' does not match the expected tree",
    )
  }

  private fun executeErrorsTestRun(testRun: ErrorsTestRun) {
    val languageSourceText = loadResourceText(testRun.exampleFilePath)
    val expectedErrorsText = loadResourceText(testRun.errorsFilePath)
    val listener = SyntaxErrorsErrorListener()

    // Create the lexer
    val charStream = CharStreams.fromString(languageSourceText)
    val lexer = createLexer(charStream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(listener)

    // Create the parser
    val tokenStream = CommonTokenStream(lexer)
    val parser = createParser(tokenStream)
    parser.removeErrorListeners()
    parser.addErrorListener(listener)

    // Parse the document
    getTree(parser)

    val expectedErrors = expectedErrorsText.lineSequence()
      .filter(String::isNotBlank)
      .map(::replacePlaceholders)
      .toList()

    val actualErrors = listener.errors.asSequence()
      .map(::replacePlaceholders)
      .toList()

    assertErrors(
      expected = expectedErrors,
      actual = actualErrors,
      errorsFilePath = testRun.errorsFilePath,
    )
  }

  private fun assertErrors(expected: List<String>, actual: List<String>, errorsFilePath: String) {
    if (expected.size != actual.size) {
      fail("${errorsFilePath}: expected ${expected.size} errors, but was ${actual.size} errors")
    }

    for (i in expected.indices) {
      if (expected[i] != actual[i]) {
        fail("${errorsFilePath}: expected '${expected[i]}', but was '${actual[i]}'")
      }
    }
  }

  private fun replacePlaceholders(str: String): String =
    str.replace(REGEXP_PLACEHOLDERS) {
      when (it.value) {
        LITERAL_BACKSLASH_R -> CHAR_CR
        LITERAL_BACKSLASH_N -> CHAR_LF
        LITERAL_BACKSLASH_R_PLACEHOLDER -> LITERAL_BACKSLASH_R
        LITERAL_BACKSLASH_N_PLACEHOLDER -> LITERAL_BACKSLASH_N
        else -> throw IllegalStateException("Should never land here")
      }
    }
}
