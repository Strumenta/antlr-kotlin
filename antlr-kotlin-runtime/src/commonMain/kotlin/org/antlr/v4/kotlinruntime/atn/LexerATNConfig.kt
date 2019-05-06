/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.misc.MurmurHash
import org.antlr.v4.kotlinruntime.misc.ObjectEqualityComparator

class LexerATNConfig : ATNConfig {
    /**
     * This is the backing field for [.getLexerActionExecutor].
     */
    /**
     * Gets the [LexerActionExecutor] capable of executing the embedded
     * action(s) for the current configuration.
     */
    val lexerActionExecutor: LexerActionExecutor?

    private val passedThroughNonGreedyDecision: Boolean

    constructor(state: ATNState,
                alt: Int,
                context: PredictionContext) : super(state, alt, context, SemanticContext.NONE) {
        this.passedThroughNonGreedyDecision = false
        this.lexerActionExecutor = null
    }

    constructor(state: ATNState,
                alt: Int,
                context: PredictionContext,
                lexerActionExecutor: LexerActionExecutor) : super(state, alt, context, SemanticContext.NONE) {
        this.lexerActionExecutor = lexerActionExecutor
        this.passedThroughNonGreedyDecision = false
    }

    constructor(c: LexerATNConfig, state: ATNState) : super(c, state, c.context, c.semanticContext) {
        this.lexerActionExecutor = c.lexerActionExecutor
        this.passedThroughNonGreedyDecision = checkNonGreedyDecision(c, state)
    }

    constructor(c: LexerATNConfig, state: ATNState,
                lexerActionExecutor: LexerActionExecutor?) : super(c, state, c.context, c.semanticContext) {
        this.lexerActionExecutor = lexerActionExecutor
        this.passedThroughNonGreedyDecision = checkNonGreedyDecision(c, state)
    }

    constructor(c: LexerATNConfig, state: ATNState,
                context: PredictionContext) : super(c, state, context, c.semanticContext) {
        this.lexerActionExecutor = c.lexerActionExecutor
        this.passedThroughNonGreedyDecision = checkNonGreedyDecision(c, state)
    }

    fun hasPassedThroughNonGreedyDecision(): Boolean {
        return passedThroughNonGreedyDecision
    }

    override fun hashCode(): Int {
        var hashCode = MurmurHash.initialize(7)
        hashCode = MurmurHash.update(hashCode, state.stateNumber)
        hashCode = MurmurHash.update(hashCode, alt)
        hashCode = MurmurHash.update(hashCode, context)
        hashCode = MurmurHash.update(hashCode, semanticContext)
        hashCode = MurmurHash.update(hashCode, if (passedThroughNonGreedyDecision) 1 else 0)
        hashCode = MurmurHash.update(hashCode, lexerActionExecutor)
        hashCode = MurmurHash.finish(hashCode, 6)
        return hashCode
    }

    override fun equals(other: ATNConfig?): Boolean {
        if (this === other) {
            return true
        } else if (other !is LexerATNConfig) {
            return false
        }

        val lexerOther = other as LexerATNConfig?
        if (passedThroughNonGreedyDecision != lexerOther!!.passedThroughNonGreedyDecision) {
            return false
        }

        return if (!ObjectEqualityComparator.INSTANCE.equals(lexerActionExecutor, lexerOther.lexerActionExecutor)) {
            false
        } else super.equals(other)

    }

    private fun checkNonGreedyDecision(source: LexerATNConfig, target: ATNState): Boolean {
        return source.passedThroughNonGreedyDecision || target is DecisionState && (target as DecisionState).nonGreedy
    }
}
