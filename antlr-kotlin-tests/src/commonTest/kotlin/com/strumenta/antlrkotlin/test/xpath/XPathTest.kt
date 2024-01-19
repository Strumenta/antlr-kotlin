package com.strumenta.antlrkotlin.test.xpath

import com.strumenta.antlrkotlin.test.generated.XPathExprLexer
import com.strumenta.antlrkotlin.test.generated.XPathExprParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.tree.xpath.XPath
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@Suppress("SpellCheckingInspection")
class XPathTest {
  private val sampleProgram: String =
    """
    def f(x,y) { x = 3+4; y; ; }
    def g(x) { return 1+2*x; }
    """.trimIndent()

  @Test
  fun testValidPaths() {
    val xpaths = arrayOf(
      "/prog/func",         // All funcs under prog at root
      "/prog/*",            // All children of prog at root
      "/*/func",            // All func kids of any root node
      "prog",               // Prog must be root node
      "/prog",              // Prog must be root node
      "/*",                 // Any root
      "*",                  // Any root
      "//ID",               // Any ID in tree
      "//expr/primary/ID",  // Any ID child of a primary under any expr
      "//body//ID",         // Any ID under a body
      "//'return'",         // Any 'return' literal in tree, matched by literal name
      "//RETURN",           // Any 'return' literal in tree, matched by symbolic name
      "//primary/*",        // All kids of any primary
      "//func/*/stat",      // All stat nodes grandkids of any func node
      "/prog/func/'def'",   // All def literal kids of func kid of prog
      "//stat/';'",         // All ';' under any stat node
      "//expr/primary/!ID", // Anything but ID under primary under any expr node
      "//expr/!primary",    // Anything but primary under any expr node
      "//!*",               // Nothing anywhere
      "/!*",                // Nothing at root
      "//expr//ID",         // Any ID under any expression (tests antlr/antlr4#370)
    )

    val expected = arrayOf(
      "[func, func]",
      "[func, func]",
      "[func, func]",
      "[prog]",
      "[prog]",
      "[prog]",
      "[prog]",
      "[f, x, y, x, y, g, x, x]",
      "[y, x]",
      "[x, y, x]",
      "[return]",
      "[return]",
      "[3, 4, y, 1, 2, x]",
      "[stat, stat, stat, stat]",
      "[def, def]",
      "[;, ;, ;, ;]",
      "[3, 4, 1, 2]",
      "[expr, expr, expr, expr, expr, expr]",
      "[]",
      "[]",
      "[y, x]",
    )

    for (i in xpaths.indices) {
      val nodesStr = getNodesStr(sampleProgram, xpaths[i])
      val str = nodesStr.toString()
      assertEquals(expected[i], str, "Path '${xpaths[i]}' failed")
    }
  }

  @Test
  fun testWeirdChar() {
    val xpath = "&"
    val expectedMessage = "Invalid tokens or characters at index 0 in path '&'"
    testError(sampleProgram, xpath, expectedMessage)
  }

  @Test
  fun testWeirdChar2() {
    val xpath = "//w&e/"
    val expectedMessage = "Invalid tokens or characters at index 3 in path '//w&e/'"
    testError(sampleProgram, xpath, expectedMessage)
  }

  @Test
  fun testBadSyntax() {
    val xpath = "///"
    val expectedMessage = "/ at index 2 isn't a valid rule name"
    testError(sampleProgram, xpath, expectedMessage)
  }

  @Test
  fun testMissingWordAtEnd() {
    val xpath = "//"
    val expectedMessage = "Missing path element at end of path"
    testError(sampleProgram, xpath, expectedMessage)
  }

  @Test
  fun testBadTokenName() {
    val xpath = "//Ick"
    val expectedMessage = "Ick at index 2 isn't a valid token name"
    testError(sampleProgram, xpath, expectedMessage)
  }

  @Test
  fun testBadRuleName() {
    val xpath = "/prog/ick"
    val expectedMessage = "ick at index 6 isn't a valid rule name"
    testError(sampleProgram, xpath, expectedMessage)
  }

  private fun testError(input: String, xpath: String, expectedMessage: String) {
    val exception = try {
      parseAndFindAll(input, xpath)
      null
    } catch (e: IllegalArgumentException) {
      e
    }

    assertNotNull(exception)
    assertEquals(expectedMessage, exception.message)
  }

  private fun getNodesStr(input: String, xpath: String): List<String> {
    val (ruleNames, nodes) = parseAndFindAll(input, xpath)
    val nodesStr = ArrayList<String>(nodes.size)

    for (result in nodes) {
      if (result is RuleContext) {
        nodesStr.add(ruleNames[result.ruleIndex])
      } else {
        nodesStr.add((result as TerminalNode).text)
      }
    }

    return nodesStr
  }

  private fun parseAndFindAll(input: String, xpath: String): Pair<Array<String>, Collection<ParseTree>> {
    val lexer = XPathExprLexer(CharStreams.fromString(input))
    val parser = XPathExprParser(CommonTokenStream(lexer))
    val nodes = XPath.findAll(parser.prog(), xpath, parser)
    return Pair(parser.ruleNames, nodes)
  }
}
