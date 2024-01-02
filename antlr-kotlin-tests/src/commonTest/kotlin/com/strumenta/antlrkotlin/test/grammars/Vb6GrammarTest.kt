package com.strumenta.antlrkotlin.test.grammars

import com.strumenta.antlrkotlin.test.GrammarTest
import com.strumenta.antlrkotlin.test.generated.VisualBasic6Lexer
import com.strumenta.antlrkotlin.test.generated.VisualBasic6Parser
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.TokenStream

@Suppress("unused")
class Vb6GrammarTest : GrammarTest<VisualBasic6Lexer, VisualBasic6Parser>() {
  override fun createLexer(input: CharStream): VisualBasic6Lexer =
    VisualBasic6Lexer(input)

  override fun createParser(input: TokenStream): VisualBasic6Parser =
    VisualBasic6Parser(input)

  override fun setupTreeTestRuns(runs: MutableSet<LispTestRun>) {
    // No test runs
  }

  override fun setupErrorsTestRuns(runs: MutableSet<ErrorsTestRun>) {
    runs += ErrorsTestRun("vb6/form1.vb", "vb6/form1.vb.errors")
  }

  override fun getTree(parser: VisualBasic6Parser): ParserRuleContext =
    parser.startRule()
}
