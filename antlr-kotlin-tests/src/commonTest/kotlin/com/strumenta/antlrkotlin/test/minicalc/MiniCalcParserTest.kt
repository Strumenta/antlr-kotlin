@file:Suppress("DEPRECATION")

package com.strumenta.antlrkotlin.test.minicalc

import com.strumenta.antlrkotlin.test.ThrowingErrorListener
import com.strumenta.antlrkotlin.test.generated.MiniCalcLexer
import com.strumenta.antlrkotlin.test.generated.MiniCalcParser
import com.strumenta.antlrkotlin.test.generated.MiniCalcParserBaseVisitor
import org.antlr.v4.kotlinruntime.ANTLRInputStream
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.antlr.v4.kotlinruntime.ast.Point
import org.antlr.v4.kotlinruntime.ast.Position
import org.antlr.v4.kotlinruntime.tree.ParseTreeWalker
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class MiniCalcParserTest {
  @Test
  fun simplestFileUsingHomogeneousAPI() {
    val input = ANTLRInputStream("input Int width\n")
    val lexer = MiniCalcLexer(input)
    val parser = MiniCalcParser(CommonTokenStream(lexer))

    val root = parser.miniCalcFile()
    assertEquals(1, root.childCount)

    val line = root.children!![0]
    assertTrue(line is MiniCalcParser.LineContext)
    assertEquals(2, line.childCount)

    val statement = line.children!![0]
    assertTrue(statement is MiniCalcParser.StatementContext)
    assertEquals(1, statement.childCount)

    val inputDecl = statement.children!![0]
    assertTrue(inputDecl is MiniCalcParser.InputDeclarationContext)
    assertEquals(3, inputDecl.childCount)

    val inputKw = inputDecl.children!![0]
    assertTrue(inputKw is TerminalNode)
    assertEquals(0, inputKw.childCount)

    val type = inputDecl.children!![1]
    assertTrue(type is MiniCalcParser.TypeContext)
    assertEquals(1, type.childCount)

    val intKw = type.children!![0]
    assertTrue(intKw is TerminalNode)
    assertEquals(0, intKw.childCount)

    val id = inputDecl.children!![2]
    assertTrue(id is TerminalNode)
    assertEquals(0, id.childCount)

    val newline = line.children!![1]
    assertTrue(newline is TerminalNode)
    assertEquals("\n", newline.text)
  }

  @Test
  fun simplestFileUsingHeterogeneousAPI() {
    val input = ANTLRInputStream("input Int width\n")
    val lexer = MiniCalcLexer(input)
    val parser = MiniCalcParser(CommonTokenStream(lexer))
    val root = parser.miniCalcFile()
    val line = root.line(0)!!
    val statement = line.statement()

    @Suppress("UNUSED_VARIABLE")
    val inputDeclStmt = statement as MiniCalcParser.InputDeclarationStatementContext
    val inputDecl = statement.inputDeclaration()

    val inputKw = inputDecl.INPUT()
    assertEquals("input", inputKw.text)

    val type = inputDecl.type()
    val intKw = (type as MiniCalcParser.IntegerContext).INT()
    assertEquals("Int", intKw.text)

    val id = inputDecl.ID()
    assertEquals("width", id.text)

    val newline = line.NEWLINE()!!
    assertEquals("\n", newline.text)
  }

  @Test
  fun rootStartPoint() {
    val input = ANTLRInputStream("input Int width\n")
    val lexer = MiniCalcLexer(input)
    val parser = MiniCalcParser(CommonTokenStream(lexer))
    val root = parser.miniCalcFile()
    assertEquals(Point(1, 0), root.start?.startPoint())
  }

  @Test
  fun rootStopPoint() {
    val input = ANTLRInputStream("input Int width\n")
    val lexer = MiniCalcLexer(input)
    val parser = MiniCalcParser(CommonTokenStream(lexer))
    val root = parser.miniCalcFile()
    assertEquals(Point(2, 0), root.stop?.endPoint())
  }

  @Test
  fun rootPosition() {
    val input = ANTLRInputStream("input Int width\n")
    val lexer = MiniCalcLexer(input)
    val parser = MiniCalcParser(CommonTokenStream(lexer))
    val root = parser.miniCalcFile()
    assertEquals(Position(1, 0, 2, 0), root.position)
  }

  @Test
  fun callListener() {
    val input = ANTLRInputStream("input Int width\n")
    val lexer = MiniCalcLexer(input)
    lexer.removeErrorListeners()
    lexer.addErrorListener(ThrowingErrorListener)

    val parser = MiniCalcParser(CommonTokenStream(lexer))
    parser.removeErrorListeners()
    parser.addErrorListener(ThrowingErrorListener)

    val root = parser.miniCalcFile()
    val localListener = LocalListener()
    ParseTreeWalker.DEFAULT.walk(localListener, root)
    assertEquals(Position(1, 0, 2, 0), root.position)
  }

  @Test // https://github.com/Strumenta/antlr-kotlin/issues/182
  fun callVisitorWithNullableType() {
    val input = ANTLRInputStream("input Int width\n")
    val lexer = MiniCalcLexer(input)
    lexer.removeErrorListeners()
    lexer.addErrorListener(ThrowingErrorListener)

    val parser = MiniCalcParser(CommonTokenStream(lexer))
    parser.removeErrorListeners()
    parser.addErrorListener(ThrowingErrorListener)

    val visitor = object : MiniCalcParserBaseVisitor<String?>() {
      override fun defaultResult(): String? = null
    }

    val root = parser.miniCalcFile()
    assertNull(root.accept(visitor))
  }
}
