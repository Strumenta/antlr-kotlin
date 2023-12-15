package com.strumenta.antlrkotlin.test

import com.strumenta.antlrkotlin.loadResourceText
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.tree.Trees
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * The base class for implementing grammar tests.
 *
 * @author Edoardo Luppi
 */
abstract class GrammarTest<L : Lexer, P : Parser> {
  data class TestRun(val exampleFilePath: String, val treeFilePath: String)

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
   * A [TestRun] is a pair indicating the example source file to load,
   * and its expected LISP tree representation file.
   */
  abstract fun setupTreeTestRuns(runs: MutableSet<TestRun>)

  /**
   * Returns the tree's node to use to match the LISP representation.
   */
  abstract fun getTree(parser: P): ParserRuleContext

  @Test
  open fun matchesLispTree() {
    val testRuns = LinkedHashSet<TestRun>(32)
    setupTreeTestRuns(testRuns)

    if (testRuns.isEmpty()) {
      throw IllegalStateException("Test runs should be at least one")
    }

    testRuns.forEach(::executeTestRun)
  }

  private fun executeTestRun(run: TestRun) {
    val languageSourceText = loadResourceText("src/commonTest/resources/${run.exampleFilePath}")
    val expectedLispTreeText = loadResourceText("src/commonTest/resources/${run.treeFilePath}")

    // Create the lexer
    val charStream = CharStreams.fromString(languageSourceText)
    val lexer = createLexer(charStream)
    lexer.addErrorListener(ThrowingErrorListener)

    // Create the parser
    val tokenStream = CommonTokenStream(lexer)
    val parser = createParser(tokenStream)
    parser.addErrorListener(ThrowingErrorListener)

    // Get the LISP tree and match it against the expected one
    val tree = getTree(parser)
    val listTree = Trees.toStringTree(tree, parser)

    assertEquals(
      expected = expectedLispTreeText,
      actual = listTree,
      message = "Outputted LISP tree for file '${run.exampleFilePath}' does not match the expected tree",
    )
  }
}
