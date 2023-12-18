package com.strumenta.antlrkotlin.test

import com.strumenta.antlrkotlin.test.generated.CPP14Parser
import org.antlr.v4.kotlinruntime.Parser
import org.antlr.v4.kotlinruntime.TokenStream

// Note(Edoardo): this is adapted from antlr/grammars-v4/cpp/java
public abstract class CPP14ParserBase(input: TokenStream) : Parser(input) {
  @Suppress("FunctionName")
  protected fun IsPureSpecifierAllowed(): Boolean {
    try {
      val x = this.context!! // memberDeclarator
      val c = x.getChild(0)!!.getChild(0)
      val c2 = c!!.getChild(0)
      val p = c2!!.getChild(1) ?: return false
      return p is CPP14Parser.ParametersAndQualifiersContext
    } catch (_: Exception) {
      // Noop
    }

    return false
  }
}
