/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.Collections
import com.strumenta.kotlinmultiplatform.errMessage
import org.antlr.v4.kotlinruntime.misc.IntervalSet

/**
 * The following images show the relation of states and
 * [ATNState.transitions] for various grammar constructs.
 *
 *
 *
 *  * Solid edges marked with an &#0949; indicate a required
 * [EpsilonTransition].
 *
 *  * Dashed edges indicate locations where any transition derived from
 * [Transition] might appear.
 *
 *  * Dashed nodes are place holders for either a sequence of linked
 * [BasicState] states or the inclusion of a block representing a nested
 * construct in one of the forms below.
 *
 *  * Nodes showing multiple outgoing alternatives with a `...` support
 * any number of alternatives (one or more). Nodes without the `...` only
 * support the exact number of alternatives shown in the diagram.
 *
 *
 *
 * <h2>Basic Blocks</h2>
 *
 * <h3>Rule</h3>
 *
 * <embed src="images/Rule.svg" type="image/svg+xml"></embed>
 *
 * <h3>Block of 1 or more alternatives</h3>
 *
 * <embed src="images/Block.svg" type="image/svg+xml"></embed>
 *
 * <h2>Greedy Loops</h2>
 *
 * <h3>Greedy Closure: `(...)*`</h3>
 *
 * <embed src="images/ClosureGreedy.svg" type="image/svg+xml"></embed>
 *
 * <h3>Greedy Positive Closure: `(...)+`</h3>
 *
 * <embed src="images/PositiveClosureGreedy.svg" type="image/svg+xml"></embed>
 *
 * <h3>Greedy Optional: `(...)?`</h3>
 *
 * <embed src="images/OptionalGreedy.svg" type="image/svg+xml"></embed>
 *
 * <h2>Non-Greedy Loops</h2>
 *
 * <h3>Non-Greedy Closure: `(...)*?`</h3>
 *
 * <embed src="images/ClosureNonGreedy.svg" type="image/svg+xml"></embed>
 *
 * <h3>Non-Greedy Positive Closure: `(...)+?`</h3>
 *
 * <embed src="images/PositiveClosureNonGreedy.svg" type="image/svg+xml"></embed>
 *
 * <h3>Non-Greedy Optional: `(...)??`</h3>
 *
 * <embed src="images/OptionalNonGreedy.svg" type="image/svg+xml"></embed>
 */
abstract class ATNState {

    /** Which ATN are we in?  */
    var atn: ATN? = null

    var stateNumber = INVALID_STATE_NUMBER

    var ruleIndex: Int = 0 // at runtime, we don't have Rule objects

    var epsilonOnlyTransitions = false

    /** Track the transitions emanating from this ATN state.  */
    val transitions: MutableList<Transition> = ArrayList<Transition>(INITIAL_NUM_TRANSITIONS)

    /** Used to cache lookahead during parsing, not used during construction  */
    var nextTokenWithinRule: IntervalSet? = null

    val isNonGreedyExitState: Boolean
        get() = false

    val numberOfTransitions: Int
        get() = transitions.size

    abstract val stateType: Int

    override fun hashCode(): Int {
        return stateNumber
    }

    override fun equals(o: Any?): Boolean {
        // are these states same object?
        return if (o is ATNState) stateNumber == o.stateNumber else false
    }

    override fun toString(): String {
        return stateNumber.toString()
    }

    fun getTransitions(): Array<Transition> {
        return transitions.toTypedArray<Transition>()
    }

    fun addTransition(e: Transition) {
        addTransition(transitions.size, e)
    }

    fun addTransition(index: Int, e: Transition) {
        if (transitions.isEmpty()) {
            epsilonOnlyTransitions = e.isEpsilon
        } else if (epsilonOnlyTransitions != e.isEpsilon) {
            errMessage("ATN state ${stateNumber} has both epsilon and non-epsilon transitions.\n")
            epsilonOnlyTransitions = false
        }

        var alreadyPresent = false
        for (t in transitions) {
            if (t.target!!.stateNumber == e.target!!.stateNumber) {
                if (t.accessLabel() != null && e.accessLabel() != null && t.accessLabel()!!.equals(e.accessLabel())) {
                    //					System.err.println("Repeated transition upon "+e.accessLabel()+" from "+stateNumber+"->"+t.target.stateNumber);
                    alreadyPresent = true
                    break
                } else if (t.isEpsilon && e.isEpsilon) {
                    //					System.err.println("Repeated epsilon transition from "+stateNumber+"->"+t.target.stateNumber);
                    alreadyPresent = true
                    break
                }
            }
        }
        if (!alreadyPresent) {
            transitions.add(index, e)
        }
    }

    fun transition(i: Int): Transition {
        return transitions[i]
    }

    fun setTransition(i: Int, e: Transition) {
        transitions[i] = e
    }

    fun removeTransition(index: Int): Transition {
        return transitions.removeAt(index)
    }

    fun onlyHasEpsilonTransitions(): Boolean {
        return epsilonOnlyTransitions
    }

//    fun setRuleIndex(ruleIndex: Int) {
//        this.ruleIndex = ruleIndex
//    }

    companion object {
        val INITIAL_NUM_TRANSITIONS = 4

        // constants for serialization
        val INVALID_TYPE = 0
        val BASIC = 1
        val RULE_START = 2
        val BLOCK_START = 3
        val PLUS_BLOCK_START = 4
        val STAR_BLOCK_START = 5
        val TOKEN_START = 6
        val RULE_STOP = 7
        val BLOCK_END = 8
        val STAR_LOOP_BACK = 9
        val STAR_LOOP_ENTRY = 10
        val PLUS_LOOP_BACK = 11
        val LOOP_END = 12

        val serializationNames = Collections.unmodifiableList(Arrays.asList(
                "INVALID",
                "BASIC",
                "RULE_START",
                "BLOCK_START",
                "PLUS_BLOCK_START",
                "STAR_BLOCK_START",
                "TOKEN_START",
                "RULE_STOP",
                "BLOCK_END",
                "STAR_LOOP_BACK",
                "STAR_LOOP_ENTRY",
                "PLUS_LOOP_BACK",
                "LOOP_END"
        ))

        val INVALID_STATE_NUMBER = -1
    }
}
