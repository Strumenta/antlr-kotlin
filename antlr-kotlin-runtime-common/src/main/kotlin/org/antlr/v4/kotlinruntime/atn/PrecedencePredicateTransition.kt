/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/**
 *
 * @author Sam Harwell
 */
class PrecedencePredicateTransition(target: ATNState, val precedence: Int) : AbstractPredicateTransition(target) {

    override val serializationType: Int
        get() = Transition.PRECEDENCE

    override val isEpsilon: Boolean
        get() = true

    val predicate: SemanticContext.PrecedencePredicate
        get() = SemanticContext.PrecedencePredicate(precedence)

    override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean {
        return false
    }

    override fun toString(): String {
        return precedence.toString() + " >= _p"
    }

}
