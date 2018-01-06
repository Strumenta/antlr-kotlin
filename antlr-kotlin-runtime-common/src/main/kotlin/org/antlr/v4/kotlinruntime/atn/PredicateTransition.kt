/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/** TODO: this is old comment:
 * A tree of semantic predicates from the grammar AST if accessLabel==SEMPRED.
 * In the ATN, labels will always be exactly one predicate, but the DFA
 * may have to combine a bunch of them as it collects predicates from
 * multiple ATN configurations into a single DFA state.
 */
class PredicateTransition(target: ATNState, val ruleIndex: Int, val predIndex: Int, val isCtxDependent: Boolean  // e.g., $i ref in pred
) : AbstractPredicateTransition(target) {

    override val serializationType: Int
        get() = Transition.PREDICATE

    override val isEpsilon: Boolean
        get() = true

    val predicate: SemanticContext.Predicate
        get() = SemanticContext.Predicate(ruleIndex, predIndex, isCtxDependent)

    override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean {
        return false
    }

    override fun toString(): String {
        return "pred_$ruleIndex:$predIndex"
    }

}
