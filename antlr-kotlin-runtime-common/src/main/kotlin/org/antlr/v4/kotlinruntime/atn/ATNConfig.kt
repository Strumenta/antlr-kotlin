/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Recognizer
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/** A tuple: (ATN state, predicted alt, syntactic, semantic context).
 * The syntactic context is a graph-structured stack node whose
 * path(s) to the root is the rule invocation(s)
 * chain used to arrive at the state.  The semantic context is
 * the tree of semantic predicates encountered before reaching
 * an ATN state.
 */
open class ATNConfig {

    /** The ATN state associated with this configuration  */
    val state: ATNState

    /** What alt (or lexer rule) is predicted by this configuration  */
    val alt: Int

    /** The stack of invoking states leading to the rule/states associated
     * with this config.  We track only those contexts pushed during
     * execution of the ATN simulator.
     */
    var context: PredictionContext? = null

    /**
     * We cannot execute predicates dependent upon local context unless
     * we know for sure we are in the correct context. Because there is
     * no way to do this efficiently, we simply cannot evaluate
     * dependent predicates unless we are in the rule that initially
     * invokes the ATN simulator.
     *
     *
     *
     * closure() tracks the depth of how far we dip into the outer context:
     * depth &gt; 0.  Note that it may not be totally accurate depth since I
     * don't ever decrement. TODO: make it a boolean then
     *
     *
     *
     * For memory efficiency, the [.isPrecedenceFilterSuppressed] method
     * is also backed by this field. Since the field is publicly accessible, the
     * highest bit which would not cause the value to become negative is used to
     * store this field. This choice minimizes the risk that code which only
     * compares this value to 0 would be affected by the new purpose of the
     * flag. It also ensures the performance of the existing [ATNConfig]
     * constructors as well as certain operations like
     * [ATNConfigSet.add] method are
     * *completely* unaffected by the change.
     */
    var reachesIntoOuterContext: Int = 0


    val semanticContext: SemanticContext?

    /**
     * This method gets the value of the [.reachesIntoOuterContext] field
     * as it existed prior to the introduction of the
     * [.isPrecedenceFilterSuppressed] method.
     */
    val outerContextDepth: Int
        get() = reachesIntoOuterContext and SUPPRESS_PRECEDENCE_FILTER.inv()

    var isPrecedenceFilterSuppressed: Boolean
        get() = reachesIntoOuterContext and SUPPRESS_PRECEDENCE_FILTER != 0
        set(value) = if (value) {
            this.reachesIntoOuterContext = this.reachesIntoOuterContext or 0x40000000
        } else {
            this.reachesIntoOuterContext = this.reachesIntoOuterContext and SUPPRESS_PRECEDENCE_FILTER.inv()
        }

    constructor(old: ATNConfig) { // dup
        this.state = old.state
        this.alt = old.alt
        this.context = old.context
        this.semanticContext = old.semanticContext
        this.reachesIntoOuterContext = old.reachesIntoOuterContext
    }

    constructor(state: ATNState,
                              alt: Int,
                              context: PredictionContext?,
                              semanticContext: SemanticContext = SemanticContext.NONE) {
        this.state = state
        this.alt = alt
        this.context = context
        this.semanticContext = semanticContext
    }

    constructor(c: ATNConfig, state: ATNState,
                semanticContext: SemanticContext) : this(c, state, c.context, semanticContext) {
    }

    constructor(c: ATNConfig,
                semanticContext: SemanticContext) : this(c, c.state, c.context, semanticContext) {
    }

    constructor(c: ATNConfig, state: ATNState,
                              context: PredictionContext? = c.context,
                              semanticContext: SemanticContext? = c.semanticContext) {
        this.state = state
        this.alt = c.alt
        this.context = context
        this.semanticContext = semanticContext
        this.reachesIntoOuterContext = c.reachesIntoOuterContext
    }

    /** An ATN configuration is equal to another if both have
     * the same state, they predict the same alternative, and
     * syntactic/semantic contexts are the same.
     */
    override fun equals(o: Any?): Boolean {
        return if (o !is ATNConfig) {
            false
        } else this.equals(o as ATNConfig?)

    }

    open fun equals(other: ATNConfig?): Boolean {
        if (this === other) {
            return true
        } else if (other == null) {
            return false
        }

        return (this.state.stateNumber == other.state.stateNumber
                && this.alt == other.alt
                && (this.context === other.context || this.context != null && this.context == other.context)
                && this.semanticContext == other.semanticContext
                && this.isPrecedenceFilterSuppressed == other.isPrecedenceFilterSuppressed)
    }

    override fun hashCode(): Int {
        var hashCode = MurmurHash.initialize(7)
        hashCode = MurmurHash.update(hashCode, state.stateNumber)
        hashCode = MurmurHash.update(hashCode, alt)
        hashCode = MurmurHash.update(hashCode, context)
        hashCode = MurmurHash.update(hashCode, semanticContext)
        hashCode = MurmurHash.finish(hashCode, 4)
        return hashCode
    }

    override fun toString(): String {
        return toString(null, true)
    }

    fun toString(recog: Recognizer<*, *>?, showAlt: Boolean): String {
        val buf = StringBuilder()
        //		if ( state.ruleIndex>=0 ) {
        //			if ( recog!=null ) buf.append(recog.getRuleNames()[state.ruleIndex]+":");
        //			else buf.append(state.ruleIndex+":");
        //		}
        buf.append('(')
        buf.append(state)
        if (showAlt) {
            buf.append(",")
            buf.append(alt)
        }
        if (context != null) {
            buf.append(",[")
            buf.append(context!!.toString())
            buf.append("]")
        }
        if (semanticContext != null && semanticContext !== SemanticContext.NONE) {
            buf.append(",")
            buf.append(semanticContext)
        }
        if (outerContextDepth > 0) {
            buf.append(",up=").append(outerContextDepth)
        }
        buf.append(')')
        return buf.toString()
    }

    companion object {
        /**
         * This field stores the bit mask for implementing the
         * [.isPrecedenceFilterSuppressed] property as a bit within the
         * existing [.reachesIntoOuterContext] field.
         */
        private val SUPPRESS_PRECEDENCE_FILTER = 0x40000000
    }
}
