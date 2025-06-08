// This is needed as the IDE is not able to properly reference
// the TSqlParser class as it is too big
@file:Suppress("UNRESOLVED_REFERENCE")

package com.strumenta.antlrkotlin.test.grammars

import com.strumenta.antlrkotlin.test.GrammarTest
import com.strumenta.antlrkotlin.test.generated.TSqlLexer
import com.strumenta.antlrkotlin.test.generated.TSqlParser
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.TokenStream

@Suppress("unused")
class TSqlGrammarTest : GrammarTest<TSqlLexer, TSqlParser>() {
  override fun createLexer(input: CharStream): TSqlLexer =
    TSqlLexer(input)

  override fun createParser(input: TokenStream): TSqlParser =
    TSqlParser(input)

  override fun setupTreeTestRuns(runs: MutableSet<LispTestRun>) {
    runs += LispTestRun("tsql/hints.sql", "tsql/hints.sql.tree")
  }

  override fun setupErrorsTestRuns(runs: MutableSet<ErrorsTestRun>) {
    runs += ErrorsTestRun("tsql/constants.sql", "tsql/constants.sql.errors")
  }

  override fun getTree(parser: TSqlParser): ParserRuleContext =
    parser.tsql_file()
}
