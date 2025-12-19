package com.strumenta.antlrkotlin.test.grammars

import com.strumenta.antlrkotlin.test.BracketToken.Left
import com.strumenta.antlrkotlin.test.BracketToken.Right
import com.strumenta.antlrkotlin.test.ThrowingErrorListener
import com.strumenta.antlrkotlin.test.generated.BracketsParser
import com.strumenta.antlrkotlin.util.loadResourceText
import org.antlr.v4.kotlinruntime.ListTokenSource
import org.antlr.v4.kotlinruntime.UnbufferedTokenStream
import org.antlr.v4.kotlinruntime.tree.Trees
import kotlin.test.Test
import kotlin.test.assertEquals

@Suppress("unused")
class BracketsTest {

  @Test
  fun parsesMatched() {
    // Create the parser
    val tokenStream = UnbufferedTokenStream(
      ListTokenSource(
        listOf(
          Left("("), Left("["), Right("]"),
          Left("{"), Right("}"), Right(")")
        )
      )
    )
    val parser = BracketsParser(tokenStream)
    parser.addErrorListener(ThrowingErrorListener)
    val tree = parser.matched()
    val lispTree = Trees.toStringTree(tree, parser)
    val expectedLispTreeText = loadResourceText("brackets/matched.tree")

    assertEquals(
      expected = expectedLispTreeText,
      actual = lispTree,
      message = "Outputted LISP tree does not match the expected tree",
    )
  }
}
