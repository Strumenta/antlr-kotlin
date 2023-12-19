/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.dfa

import org.antlr.v4.kotlinruntime.Vocabulary
import org.antlr.v4.kotlinruntime.VocabularyImpl

/**
 * A DFA walker that knows how to dump them to serialized strings.
 */
public open class DFASerializer(
  private val dfa: DFA,
  private val vocabulary: Vocabulary,
) {
  @Deprecated("Use {@link #DFASerializer(DFA, Vocabulary)} instead.")
  @Suppress("UNCHECKED_CAST")
  public constructor(dfa: DFA, tokenNames: Array<String>) :
    this(
      dfa,
      VocabularyImpl.fromTokenNames(tokenNames as Array<String?>),
    )

  override fun toString(): String {
    if (dfa.s0 == null) {
      return "null"
    }

    val buf = StringBuilder()
    val states = dfa.getStates()

    for (s in states) {
      var n = 0
      val edges = s.edges

      if (edges != null) {
        n = edges.size
      }

      for (i in 0..<n) {
        // If edges is null, we won't get here at all, so asserting is fine
        val t = edges!![i]

        if (t != null && t.stateNumber != Int.MAX_VALUE) {
          buf.append(getStateString(s))
          buf.append("-")
          buf.append(getEdgeLabel(i))
          buf.append("->")
          buf.append(getStateString(t))
          buf.append("\n")
        }
      }
    }

    val output = buf.toString()
    return output.ifEmpty { "null" }
  }

  protected open fun getEdgeLabel(i: Int): String =
    vocabulary.getDisplayName(i - 1)

  @Suppress("MemberVisibilityCanBePrivate")
  protected fun getStateString(s: DFAState): String {
    val n = s.stateNumber
    val baseStateStr = "${if (s.isAcceptState) ":" else ""}s$n${if (s.requiresFullContext) "^" else ""}"
    return if (s.isAcceptState) {
      val predicates = s.predicates

      if (predicates != null) {
        baseStateStr + "=>" + predicates.joinToString()
      } else {
        baseStateStr + "=>" + s.prediction
      }
    } else {
      baseStateStr
    }
  }
}
