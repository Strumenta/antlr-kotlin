// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.dfa

import com.strumenta.antlrkotlin.runtime.ext.appendCodePoint
import org.antlr.v4.kotlinruntime.VocabularyImpl

public class LexerDFASerializer(dfa: DFA) : DFASerializer(dfa, VocabularyImpl.EMPTY_VOCABULARY) {
  protected override fun getEdgeLabel(i: Int): String {
    val buf = StringBuilder()
    buf.append("'")
    buf.appendCodePoint(i)
    buf.append("'")
    return buf.toString()
  }
}
