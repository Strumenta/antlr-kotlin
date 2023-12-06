/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.Collections
import com.strumenta.kotlinmultiplatform.ext.hashCodeCustom
import org.antlr.v4.kotlinruntime.Recognizer
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.atn.SemanticContext.*
import org.antlr.v4.kotlinruntime.misc.MurmurHash
import kotlin.jvm.JvmStatic


/** A tree structure used to record the semantic context in which
 * an ATN configuration is valid.  It's either a single predicate,
 * a conjunction `p1&&p2`, or a sum of products `p1||p2`.
 *
 *
 * I have scoped the [AND], [OR], and [Predicate] subclasses of
 * [SemanticContext] within the scope of this outer class.
 */
abstract class SemanticContext {

    /**
     * For context independent predicates, we evaluate them without a local
     * context (i.e., null context). That way, we can evaluate them without
     * having to create proper rule-specific context during prediction (as
     * opposed to the parser, which creates them naturally). In a practical
     * sense, this avoids a cast exception from RuleContext to myruleContext.
     *
     *
     * For context dependent predicates, we must pass in a local context so that
     * references such as $arg evaluate properly as _localctx.arg. We only
     * capture context dependent predicates in the context in which we begin
     * prediction, so we passed in the outer context here in case of context
     * dependent predicate evaluation.
     */
    abstract fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean

    /**
     * Evaluate the precedence predicates for the context and reduce the result.
     *
     * @param parser The parser instance.
     * @param parserCallStack
     * @return The simplified semantic context after precedence predicates are
     * evaluated, which will be one of the following values.
     *
     *  * [Empty.Instance]: if the predicate simplifies to `true` after
     * precedence predicates are evaluated.
     *  * `null`: if the predicate simplifies to `false` after
     * precedence predicates are evaluated.
     *  * `this`: if the semantic context is not changed as a result of
     * precedence predicate evaluation.
     *  * A non-`null` [SemanticContext]: the new simplified
     * semantic context after precedence predicates are evaluated.
     *
     */
    open fun evalPrecedence(parser: Recognizer<*, *>, parserCallStack: RuleContext): SemanticContext? {
        return this
    }

    class Empty : SemanticContext() {
        companion object {
            /**
             * The default [SemanticContext], which is semantically equivalent to
             * a predicate of the form `{true}?`.
             */
            @JvmStatic
            val Instance: Empty = Empty()
        }

        override fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean {
            return false
        }
    }

    class Predicate : SemanticContext {
        val ruleIndex: Int
        val predIndex: Int
        val isCtxDependent: Boolean  // e.g., $i ref in pred

        constructor() {
            this.ruleIndex = -1
            this.predIndex = -1
            this.isCtxDependent = false
        }

        constructor(ruleIndex: Int, predIndex: Int, isCtxDependent: Boolean) {
            this.ruleIndex = ruleIndex
            this.predIndex = predIndex
            this.isCtxDependent = isCtxDependent
        }

        override fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean {
            val localctx = if (isCtxDependent) parserCallStack else null
            return parser.sempred(localctx!!, ruleIndex, predIndex)
        }

        override fun hashCode(): Int {
            var hashCode = MurmurHash.initialize()
            hashCode = MurmurHash.update(hashCode, ruleIndex)
            hashCode = MurmurHash.update(hashCode, predIndex)
            hashCode = MurmurHash.update(hashCode, if (isCtxDependent) 1 else 0)
            hashCode = MurmurHash.finish(hashCode, 3)
            return hashCode
        }

        override fun equals(other: Any?): Boolean {
            if (other !is Predicate) return false
            if (this === other) return true
            return this.ruleIndex == other.ruleIndex &&
                    this.predIndex == other.predIndex &&
                    this.isCtxDependent == other.isCtxDependent
        }

        override fun toString(): String {
            return "{$ruleIndex:$predIndex}?"
        }
    }

    class PrecedencePredicate(val precedence: Int = 0)
        : SemanticContext(), Comparable<PrecedencePredicate> {

        override fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean {
            return parser.precpred(parserCallStack, precedence)
        }

        override fun evalPrecedence(parser: Recognizer<*, *>, parserCallStack: RuleContext): SemanticContext? {
            return if (parser.precpred(parserCallStack, precedence)) {
                Empty.Instance
            } else {
                null
            }
        }

        override fun compareTo(other: PrecedencePredicate): Int {
            return precedence - other.precedence
        }

        override fun hashCode(): Int {
            var hashCode = 1
            hashCode = 31 * hashCode + precedence
            return hashCode
        }

        override fun equals(other: Any?): Boolean {
            if (other !is PrecedencePredicate) {
                return false
            }

            if (this === other) {
                return true
            }
            return this.precedence == other.precedence
        }

        override// precedence >= _precedenceStack.peek()
        fun toString(): String {
            return "{$precedence>=prec}?"
        }
    }

    /**
     * This is the base class for semantic context "operators", which operate on
     * a collection of semantic context "operands".
     *
     * @since 4.3
     */
    abstract class Operator : SemanticContext() {
        /**
         * Gets the operands for the semantic context operator.
         *
         * @return a collection of [SemanticContext] operands for the
         * operator.
         *
         * @since 4.3
         */

        abstract val operands: Collection<SemanticContext>
    }

    /**
     * A semantic context which is true whenever none of the contained contexts
     * is false.
     */
    class AND(a: SemanticContext, b: SemanticContext) : Operator() {
        val opnds: Array<SemanticContext>

        override val operands: Collection<SemanticContext>
            get() = opnds.toList()

        init {
            val operands = HashSet<SemanticContext>()
            if (a is AND)
                operands.addAll(a.opnds.toList())
            else
                operands.add(a)
            if (b is AND)
                operands.addAll(b.opnds.toList())
            else
                operands.add(b)

            val precedencePredicates = filterPrecedencePredicates(operands)
            if (precedencePredicates.isNotEmpty()) {
                // interested in the transition with the lowest precedence
                val reduced = Collections.min(precedencePredicates)
                operands.add(reduced)
            }

            opnds = operands.toTypedArray()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is AND) return false
            return Arrays.equals(this.opnds, other.opnds)
        }

        override fun hashCode(): Int {
            // TODO(Edoardo): K/JS KClass.hashCode uses only the class simple name
            //   On the JVM, the fqn param is ignored
            val fqn = "org.antlr.v4.kotlinruntime.atn.SemanticContext.AND"
            return MurmurHash.hashCode(opnds, AND::class.hashCodeCustom(fqn))
        }

        /**
         * {@inheritDoc}
         *
         *
         *
         * The evaluation of predicates by this context is short-circuiting, but
         * unordered.
         */
        override fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean {
            for (opnd in opnds) {
                if (!opnd.eval(parser, parserCallStack)) return false
            }
            return true
        }

        override fun evalPrecedence(parser: Recognizer<*, *>, parserCallStack: RuleContext): SemanticContext? {
            var differs = false
            val operands = ArrayList<SemanticContext>()
            for (context in opnds) {
                val evaluated = context.evalPrecedence(parser, parserCallStack)
                differs = differs or (evaluated !== context)
                if (evaluated == null) {
                    // The AND context is false if any element is false
                    return null
                } else if (evaluated !== Empty.Instance) {
                    // Reduce the result by skipping true elements
                    operands.add(evaluated)
                }
            }

            if (!differs) {
                return this
            }

            if (operands.isEmpty()) {
                // all elements were true, so the AND context is true
                return Empty.Instance
            }

            var result: SemanticContext? = operands[0]
            for (i in 1 until operands.size) {
                result = and(result, operands[i])
            }

            return result
        }

        override fun toString(): String {
            return opnds.toList().joinToString("&&")
        }
    }

    /**
     * A semantic context which is true whenever at least one of the contained
     * contexts is true.
     */
    class OR(a: SemanticContext, b: SemanticContext) : Operator() {
        val opnds: Array<SemanticContext>

        override val operands: Collection<SemanticContext>
            get() = opnds.toList()

        init {
            val operands = HashSet<SemanticContext>()
            if (a is OR)
                operands.addAll(a.opnds.toList())
            else
                operands.add(a)
            if (b is OR)
                operands.addAll(b.opnds.toList())
            else
                operands.add(b)

            val precedencePredicates = filterPrecedencePredicates(operands)
            if (precedencePredicates.isNotEmpty()) {
                // interested in the transition with the highest precedence
                val reduced = Collections.max(precedencePredicates)
                operands.add(reduced)
            }

            this.opnds = operands.toTypedArray()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is OR) return false
            return Arrays.equals(this.opnds, other.opnds)
        }

        override fun hashCode(): Int {
            // TODO(Edoardo): K/JS KClass.hashCode uses only the class simple name
            //   On the JVM, the fqn param is ignored
            val fqn = "org.antlr.v4.kotlinruntime.atn.SemanticContext.OR"
            return MurmurHash.hashCode(opnds, OR::class.hashCodeCustom(fqn))
        }

        /**
         * {@inheritDoc}
         *
         *
         *
         * The evaluation of predicates by this context is short-circuiting, but
         * unordered.
         */
        override fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean {
            for (opnd in opnds) {
                if (opnd.eval(parser, parserCallStack)) return true
            }
            return false
        }

        override fun evalPrecedence(parser: Recognizer<*, *>, parserCallStack: RuleContext): SemanticContext? {
            var differs = false
            val operands = ArrayList<SemanticContext>()
            for (context in opnds) {
                val evaluated = context.evalPrecedence(parser, parserCallStack)
                differs = differs or (evaluated !== context)
                if (evaluated === Empty.Instance) {
                    // The OR context is true if any element is true
                    return Empty.Instance
                } else if (evaluated != null) {
                    // Reduce the result by skipping false elements
                    operands.add(evaluated)
                }
            }

            if (!differs) {
                return this
            }

            if (operands.isEmpty()) {
                // all elements were false, so the OR context is false
                return null
            }

            var result: SemanticContext? = operands[0]
            for (i in 1 until operands.size) {
                result = or(result, operands[i])
            }

            return result
        }

        override fun toString(): String {
            return opnds.toList().joinToString("||")
        }
    }

    companion object {
        fun and(a: SemanticContext?, b: SemanticContext?): SemanticContext? {
            if (a == null || a === Empty.Instance) return b
            if (b == null || b === Empty.Instance) return a
            val result = AND(a, b)
            return if (result.opnds.size == 1) {
                result.opnds[0]
            } else result

        }

        /**
         *
         * @see ParserATNSimulator.getPredsForAmbigAlts
         */
        fun or(a: SemanticContext?, b: SemanticContext?): SemanticContext? {
            if (a == null) return b
            if (b == null) return a
            if (a === Empty.Instance || b === Empty.Instance) return Empty.Instance
            val result = OR(a, b)
            return if (result.opnds.size == 1) {
                result.opnds[0]
            } else result

        }

        private fun filterPrecedencePredicates(collection: MutableCollection<out SemanticContext>): List<PrecedencePredicate> {
            var result: ArrayList<PrecedencePredicate>? = null
            val iterator = collection.iterator()
            while (iterator.hasNext()) {
                val context = iterator.next()
                if (context is PrecedencePredicate) {
                    if (result == null) {
                        result = ArrayList()
                    }

                    result.add(context)
                    iterator.remove()
                }
            }

            return result ?: emptyList()
        }
    }
}

