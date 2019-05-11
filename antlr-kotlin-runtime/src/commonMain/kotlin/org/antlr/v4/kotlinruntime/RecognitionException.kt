/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.atn.DecisionState
import org.antlr.v4.kotlinruntime.misc.IntervalSet

/** The root of the ANTLR exception hierarchy. In general, ANTLR tracks just
 * 3 kinds of errors: prediction errors, failed predicate errors, and
 * mismatched input errors. In each case, the parser knows where it is
 * in the input, where it is in the ATN, the rule invocation stack,
 * and what kind of problem occurred.
 */
open class RecognitionException(val recognizer: Recognizer<*, *>?,
                                open val inputStream: IntStream,
                                val ctx: ParserRuleContext?, override val message: String? = null) : RuntimeException() {
    /** The [Recognizer] where this exception originated.  */
    /**
     * Gets the [Recognizer] where this exception occurred.
     *
     *
     * If the recognizer is not available, this method returns `null`.
     *
     * @return The recognizer where this exception occurred, or `null` if
     * the recognizer is not available.
     */
    //val recognizer: Recognizer<*, *>?

    /**
     * Gets the [RuleContext] at the time this exception was thrown.
     *
     *
     * If the context is not available, this method returns `null`.
     *
     * @return The [RuleContext] at the time this exception was thrown.
     * If the context is not available, this method returns `null`.
     */
    //val ctx: RuleContext

    /**
     * Gets the input stream which is the symbol source for the recognizer where
     * this exception was thrown.
     *
     *
     * If the input stream is not available, this method returns `null`.
     *
     * @return The input stream which is the symbol source for the recognizer
     * where this exception was thrown, or `null` if the stream is not
     * available.
     */
    //open val inputStream: IntStream

    /**
     * The current [Token] when an error occurred. Since not all streams
     * support accessing symbols by index, we have to track the [Token]
     * instance itself.
     */
    var offendingToken: Token? = null
        protected set

    /**
     * Get the ATN state number the parser was in at the time the error
     * occurred. For [NoViableAltException] and
     * [LexerNoViableAltException] exceptions, this is the
     * [DecisionState] number. For others, it is the state whose outgoing
     * edge we couldn't match.
     *
     *
     * If the state number is not known, this method returns -1.
     */
    var offendingState = -1
        protected set

    /**
     * Gets the set of input symbols which could potentially follow the
     * previously matched symbol at the time this exception was thrown.
     *
     *
     * If the set of expected tokens is not known and could not be computed,
     * this method returns `null`.
     *
     * @return The set of token types that could potentially follow the current
     * state in the ATN, or `null` if the information is not available.
     */
    val expectedTokens: IntervalSet?
        get() = if (recognizer != null) {
            recognizer!!.atn.getExpectedTokens(offendingState, ctx)
        } else null

//    constructor(recognizer: Recognizer<*, *>?,
//                input: IntStream,
//                ctx: ParserRuleContext?) {
//        this.recognizer = recognizer
//        this.inputStream = input
//        this.ctx = ctx!!
//        if (recognizer != null) this.offendingState = recognizer!!.state
//    }
//
//    constructor(message: String,
//                recognizer: Recognizer<*, *>?,
//                input: IntStream,
//                ctx: ParserRuleContext) : super(message) {
//        this.recognizer = recognizer
//        this.inputStream = input
//        this.ctx = ctx
//        if (recognizer != null) this.offendingState = recognizer!!.state
//    }

    init {
        if (recognizer != null) this.offendingState = recognizer!!.state
    }
}
