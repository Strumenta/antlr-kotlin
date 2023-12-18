package com.strumenta.antlrkotlin.test.grammars

import com.strumenta.antlrkotlin.test.GrammarTest
import com.strumenta.antlrkotlin.test.generated.CPP14Lexer
import com.strumenta.antlrkotlin.test.generated.CPP14Parser
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.TokenStream

@Suppress("unused")
class CPP14GrammarTest : GrammarTest<CPP14Lexer, CPP14Parser>() {
  override fun createLexer(input: CharStream): CPP14Lexer =
    CPP14Lexer(input)

  override fun createParser(input: TokenStream): CPP14Parser =
    CPP14Parser(input)

  override fun setupTreeTestRuns(runs: MutableSet<TestRun>) {
    runs += TestRun("cpp/test.cpp", "cpp/test.cpp.tree")
    runs += TestRun("cpp/macro.cpp", "cpp/macro.cpp.tree")
  }

  override fun getTree(parser: CPP14Parser): ParserRuleContext =
    parser.translationUnit()
}
