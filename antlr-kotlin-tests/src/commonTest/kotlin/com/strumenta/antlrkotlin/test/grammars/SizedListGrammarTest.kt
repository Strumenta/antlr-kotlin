package com.strumenta.antlrkotlin.test.grammars

import com.strumenta.antlrkotlin.test.GrammarTest
import com.strumenta.antlrkotlin.test.generated.SizedListLexer
import com.strumenta.antlrkotlin.test.generated.SizedListParser
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.TokenStream

@Suppress("unused")
class SizedListGrammarTest : GrammarTest<SizedListLexer, SizedListParser>() {
  override fun createLexer(input: CharStream) = SizedListLexer(input)

  override fun createParser(input: TokenStream) = SizedListParser(input)

  override fun setupTreeTestRuns(runs: MutableSet<LispTestRun>) {
    runs += LispTestRun("sizedList/five.sl", "sizedList/five.sl.tree")
  }

  override fun setupErrorsTestRuns(runs: MutableSet<ErrorsTestRun>) {
    runs += ErrorsTestRun("sizedList/oneTooMany.sl", "sizedList/oneTooMany.sl.errors")
  }

  override fun getTree(parser: SizedListParser) = parser.stringList()
}
