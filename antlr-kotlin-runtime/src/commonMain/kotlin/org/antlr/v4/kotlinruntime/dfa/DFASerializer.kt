/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.dfa

import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.kotlinruntime.Vocabulary
import org.antlr.v4.kotlinruntime.VocabularyImpl

/** A DFA walker that knows how to dump them to serialized strings.  */
open class DFASerializer {

    private val dfa: DFA

    private val vocabulary: Vocabulary


    @Deprecated("Use {@link #DFASerializer(DFA, Vocabulary)} instead.")
    constructor(dfa: DFA, tokenNames: Array<String>) : this(dfa, VocabularyImpl.fromTokenNames(tokenNames as Array<String?>)) {
    }

    constructor(dfa: DFA, vocabulary: Vocabulary) {
        this.dfa = dfa
        this.vocabulary = vocabulary
    }

    override fun toString(): String {
        if (dfa.s0 == null) return "null"
        val buf = StringBuilder()
        val states = dfa.getStates()
        for (s in states) {
            var n = 0
            if (s.edges != null) n = s.edges!!.size
            for (i in 0 until n) {
                val t = s.edges!![i]
                if (t != null && t!!.stateNumber != Int.MAX_VALUE) {
                    buf.append(getStateString(s))
                    val label = getEdgeLabel(i)
                    buf.append("-").append(label).append("->").append(getStateString(t)).append('\n')
                }
            }
        }

        val output = buf.toString()
        return if (output.length == 0) "null" else output
        //return Utils.sortLinesInString(output);
    }

    protected open fun getEdgeLabel(i: Int): String {
        return vocabulary.getDisplayName(i - 1)
    }


    protected fun getStateString(s: DFAState): String {
        val n = s.stateNumber
        val baseStateStr = (if (s.isAcceptState) ":" else "") + "s" + n + if (s.requiresFullContext) "^" else ""
        return if (s.isAcceptState) {
            if (s.predicates != null) {
                baseStateStr + "=>" + Arrays.toString(s.predicates!!)
            } else {
                baseStateStr + "=>" + s.prediction
            }
        } else {
            baseStateStr
        }
    }
}
