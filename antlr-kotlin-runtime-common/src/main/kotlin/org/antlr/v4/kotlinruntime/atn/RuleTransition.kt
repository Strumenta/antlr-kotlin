/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/**  */
class RuleTransition(ruleStart: RuleStartState,
                     /** Ptr to the rule definition object for this rule ref  */
                     val ruleIndex: Int     // no Rule object at runtime
                     ,
                     val precedence: Int,
                     /** What node to begin computations following ref to rule  */
                     var followState: ATNState) : Transition(ruleStart) {

    override val serializationType: Int
        get() = Transition.RULE

    override val isEpsilon: Boolean
        get() = true


    @Deprecated("Use\n" +
            "\t  {@link #RuleTransition(RuleStartState, int, int, ATNState)} instead.")
    constructor(ruleStart: RuleStartState,
                ruleIndex: Int,
                followState: ATNState) : this(ruleStart, ruleIndex, 0, followState) {
    }

    override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean {
        return false
    }
}
