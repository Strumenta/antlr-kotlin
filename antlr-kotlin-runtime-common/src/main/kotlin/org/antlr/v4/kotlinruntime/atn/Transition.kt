/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.Collections
import com.strumenta.kotlinmultiplatform.NullPointerException
import org.antlr.v4.kotlinruntime.misc.IntervalSet

/** An ATN transition between any two ATN states.  Subclasses define
 * atom, set, epsilon, action, predicate, rule transitions.
 *
 *
 * This is a one way link.  It emanates from a state (usually via a list of
 * transitions) and has a target state.
 *
 *
 * Since we never have to change the ATN transitions once we construct it,
 * we can fix these transitions as specific classes. The DFA transitions
 * on the other hand need to update the labels as it adds transitions to
 * the states. We'll use the term Edge for the DFA to distinguish them from
 * ATN transitions.
 */
abstract class Transition protected constructor(
        /** The target of this transition.  */

        var target: ATNState?) {

    abstract val serializationType: Int

    /**
     * Determines if the transition is an "epsilon" transition.
     *
     *
     * The default implementation returns `false`.
     *
     * @return `true` if traversing this transition in the ATN does not
     * consume an input symbol; otherwise, `false` if traversing this
     * transition consumes (matches) an input symbol.
     */
    open val isEpsilon: Boolean
        get() = false

    init {
        if (target == null) {
            throw NullPointerException("target cannot be null.")
        }
    }


    open fun accessLabel(): IntervalSet? {
        return null
    }

    abstract fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean

    companion object {
        // constants for serialization
        val EPSILON = 1
        val RANGE = 2
        val RULE = 3
        val PREDICATE = 4 // e.g., {isType(input.LT(1))}?
        val ATOM = 5
        val ACTION = 6
        val SET = 7 // ~(A|B) or ~atom, wildcard, which convert to next 2
        val NOT_SET = 8
        val WILDCARD = 9
        val PRECEDENCE = 10


        val serializationNames = Collections.unmodifiableList(Arrays.asList(
                "INVALID",
                "EPSILON",
                "RANGE",
                "RULE",
                "PREDICATE",
                "ATOM",
                "ACTION",
                "SET",
                "NOT_SET",
                "WILDCARD",
                "PRECEDENCE"
        ))

//        val serializationTypes = Collections.unmodifiableMap<Class<out Transition>, Int>(object : HashMap<Class<out Transition>, Int>() {
//            init {
//                put(EpsilonTransition::class.java, EPSILON)
//                put(RangeTransition::class.java, RANGE)
//                put(RuleTransition::class.java, RULE)
//                put(PredicateTransition::class.java, PREDICATE)
//                put(AtomTransition::class.java, ATOM)
//                put(ActionTransition::class.java, ACTION)
//                put(SetTransition::class.java, SET)
//                put(NotSetTransition::class.java, NOT_SET)
//                put(WildcardTransition::class.java, WILDCARD)
//                put(PrecedencePredicateTransition::class.java, PRECEDENCE)
//            }
//        })
    }
}
