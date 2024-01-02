package com.strumenta.antlrkotlin.test.grammars

import com.strumenta.antlrkotlin.test.GrammarTest
import com.strumenta.antlrkotlin.test.generated.css3Lexer
import com.strumenta.antlrkotlin.test.generated.css3Parser
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.TokenStream

@Suppress("unused")
class Css3GrammarTest : GrammarTest<css3Lexer, css3Parser>() {
  override fun createLexer(input: CharStream): css3Lexer =
    css3Lexer(input)

  override fun createParser(input: TokenStream): css3Parser =
    css3Parser(input)

  override fun setupTreeTestRuns(runs: MutableSet<LispTestRun>) {
    runs += LispTestRun("css3/at-rule.css", "css3/at-rule.css.tree")
  }

  override fun setupErrorsTestRuns(runs: MutableSet<ErrorsTestRun>) {
    // No test runs
  }

  override fun getTree(parser: css3Parser): ParserRuleContext =
    parser.stylesheet()
}
