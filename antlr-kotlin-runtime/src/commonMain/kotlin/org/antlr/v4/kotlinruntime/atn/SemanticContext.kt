// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.antlrkotlin.runtime.Collections
import org.antlr.v4.kotlinruntime.Recognizer
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.atn.SemanticContext.*
import org.antlr.v4.kotlinruntime.misc.MurmurHash
import kotlin.jvm.JvmStatic

/**
 * A tree structure used to record the semantic context in which
 * an ATN configuration is valid.
 *
 * It's either a single predicate, a conjunction `p1 && p2`,
 * or a sum of products `p1 || p2`.
 *
 * I have scoped the [AND], [OR], and [Predicate] subclasses of
 * [SemanticContext] within the scope of this outer class.
 */
public abstract class SemanticContext {
  public companion object {
    public fun and(a: SemanticContext?, b: SemanticContext?): SemanticContext? {
      if (a == null || a === Empty.Instance) {
        return b
      }

      if (b == null || b === Empty.Instance) {
        return a
      }

      val result = AND(a, b)
      return if (result.opnds.size == 1) {
        result.opnds[0]
      } else {
        result
      }
    }

    /**
     * @see ParserATNSimulator.getPredsForAmbigAlts
     */
    public fun or(a: SemanticContext?, b: SemanticContext?): SemanticContext? {
      if (a == null) {
        return b
      }

      if (b == null) {
        return a
      }

      if (a === Empty.Instance || b === Empty.Instance) {
        return Empty.Instance
      }

      val result = OR(a, b)
      return if (result.opnds.size == 1) {
        result.opnds[0]
      } else {
        result
      }
    }

    private fun filterPrecedencePredicates(collection: MutableCollection<out SemanticContext>): List<PrecedencePredicate> {
      val result = ArrayList<PrecedencePredicate>()
      val iterator = collection.iterator()

      while (iterator.hasNext()) {
        val context = iterator.next()

        if (context is PrecedencePredicate) {
          result.add(context)
          iterator.remove()
        }
      }

      return result
    }
  }

  /**
   * For context independent predicates, we evaluate them without a local
   * context (i.e., `null` context). That way, we can evaluate them without
   * having to create proper rule-specific context during prediction (as
   * opposed to the parser, which creates them naturally). In a practical
   * sense, this avoids a cast exception from [RuleContext] to `myRuleContext`.
   *
   * For context dependent predicates, we must pass in a local context so that
   * references such as `$arg` evaluate properly as `_localctx.arg`. We only
   * capture context dependent predicates in the context in which we begin
   * prediction, so we passed in the outer context here in case of context
   * dependent predicate evaluation.
   */
  public abstract fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean

  /**
   * Evaluate the precedence predicates for the context and reduce the result.
   *
   * @param parser The parser instance
   * @param parserCallStack
   * @return The simplified semantic context after precedence predicates are
   *   evaluated, which will be one of the following values:
   *   - [Empty.Instance]: if the predicate simplifies to `true` after
   *     precedence predicates are evaluated
   *   - `null`: if the predicate simplifies to `false` after
   *     precedence predicates are evaluated
   *   - `this`: if the semantic context is not changed as a result of
   *     precedence predicate evaluation
   *   - A non-`null` [SemanticContext]: the new simplified
   *     semantic context after precedence predicates are evaluated
   */
  public open fun evalPrecedence(parser: Recognizer<*, *>, parserCallStack: RuleContext): SemanticContext? =
    this

  public class Empty : SemanticContext() {
    public companion object {
      /**
       * The default [SemanticContext], which is semantically equivalent to
       * a predicate of the form `{true}?`.
       */
      @JvmStatic
      public val Instance: Empty = Empty()
    }

    override fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean =
      false
  }

  public class Predicate : SemanticContext {
    public val ruleIndex: Int
    public val predIndex: Int
    public val isCtxDependent: Boolean  // e.g., $i ref in pred

    public constructor() {
      ruleIndex = -1
      predIndex = -1
      isCtxDependent = false
    }

    public constructor(ruleIndex: Int, predIndex: Int, isCtxDependent: Boolean) {
      this.ruleIndex = ruleIndex
      this.predIndex = predIndex
      this.isCtxDependent = isCtxDependent
    }

    override fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean {
      val localctx = if (isCtxDependent) {
        parserCallStack
      } else {
        null
      }

      return parser.sempred(localctx, ruleIndex, predIndex)
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
      if (other !is Predicate) {
        return false
      }

      if (this === other) {
        return true
      }

      return ruleIndex == other.ruleIndex &&
        predIndex == other.predIndex &&
        isCtxDependent == other.isCtxDependent
    }

    override fun toString(): String =
      "{$ruleIndex:$predIndex}?"
  }

  public class PrecedencePredicate(
    public val precedence: Int = 0,
  ) : SemanticContext(), Comparable<PrecedencePredicate> {
    override fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean =
      parser.precpred(parserCallStack, precedence)

    override fun evalPrecedence(parser: Recognizer<*, *>, parserCallStack: RuleContext): SemanticContext? =
      if (parser.precpred(parserCallStack, precedence)) {
        Empty.Instance
      } else {
        null
      }

    override fun compareTo(other: PrecedencePredicate): Int =
      precedence - other.precedence

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

      return precedence == other.precedence
    }

    override fun toString(): String =
      // precedence >= _precedenceStack.peek()
      "{$precedence>=prec}?"
  }

  /**
   * This is the base class for semantic context "operators", which operate on
   * a collection of semantic context "operands".
   *
   * @since 4.3
   */
  public abstract class Operator : SemanticContext() {
    /**
     * Gets the operands for the semantic context operator.
     *
     * @return A collection of [SemanticContext] operands for the operator
     *
     * @since 4.3
     */
    public abstract val operands: Collection<SemanticContext>
  }

  /**
   * A semantic context which is true whenever none of the contained contexts is false.
   */
  public class AND(a: SemanticContext, b: SemanticContext) : Operator() {
    @Suppress("SpellCheckingInspection")
    public val opnds: Array<SemanticContext>

    override val operands: Collection<SemanticContext>
      get() = opnds.asList()

    init {
      val operands = LinkedHashSet<SemanticContext>()

      if (a is AND) {
        operands.addAll(a.opnds.asList())
      } else {
        operands.add(a)
      }

      if (b is AND) {
        operands.addAll(b.opnds.asList())
      } else {
        operands.add(b)
      }

      val precedencePredicates = filterPrecedencePredicates(operands)

      if (precedencePredicates.isNotEmpty()) {
        // Interested in the transition with the lowest precedence
        val reduced = Collections.min(precedencePredicates)
        operands.add(reduced)
      }

      opnds = operands.toTypedArray()
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
        return true
      }

      if (other !is AND) {
        return false
      }

      return opnds.contentEquals(other.opnds)
    }

    override fun hashCode(): Int {
      // Note(Edoardo): K/JS KClass.hashCode uses only the class simple name
      //   On the JVM and on Native, the fqn param is ignored
      val fqn = "org.antlr.v4.kotlinruntime.atn.SemanticContext.AND"
      val seed = 31 * fqn.hashCode() + AND::class.hashCode()
      return MurmurHash.hashCode(opnds, seed)
    }

    /**
     * The evaluation of predicates by this context is short-circuiting, but unordered.
     */
    override fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean {
      for (operand in opnds) {
        if (!operand.eval(parser, parserCallStack)) {
          return false
        }
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
        // All elements were true, so the AND context is true
        return Empty.Instance
      }

      var result: SemanticContext? = operands[0]

      for (i in 1..<operands.size) {
        result = and(result, operands[i])
      }

      return result
    }

    override fun toString(): String =
      opnds.joinToString("&&")
  }

  /**
   * A semantic context which is true whenever at least one of the contained
   * contexts is true.
   */
  public class OR(a: SemanticContext, b: SemanticContext) : Operator() {
    @Suppress("SpellCheckingInspection")
    public val opnds: Array<SemanticContext>

    override val operands: Collection<SemanticContext>
      get() = opnds.asList()

    init {
      val operands = LinkedHashSet<SemanticContext>()

      if (a is OR) {
        operands.addAll(a.opnds.asList())
      } else {
        operands.add(a)
      }

      if (b is OR) {
        operands.addAll(b.opnds.asList())
      } else {
        operands.add(b)
      }

      val precedencePredicates = filterPrecedencePredicates(operands)

      if (precedencePredicates.isNotEmpty()) {
        // Interested in the transition with the highest precedence
        val reduced = Collections.max(precedencePredicates)
        operands.add(reduced)
      }

      opnds = operands.toTypedArray()
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
        return true
      }

      if (other !is OR) {
        return false
      }

      return opnds.contentEquals(other.opnds)
    }

    override fun hashCode(): Int {
      // Note(Edoardo): K/JS KClass.hashCode uses only the class simple name
      //   On the JVM and on Native, the fqn param is ignored
      val fqn = "org.antlr.v4.kotlinruntime.atn.SemanticContext.OR"
      val seed = 31 * fqn.hashCode() + OR::class.hashCode()
      return MurmurHash.hashCode(opnds, seed)
    }

    /**
     * The evaluation of predicates by this context is short-circuiting, but unordered.
     */
    override fun eval(parser: Recognizer<*, *>, parserCallStack: RuleContext): Boolean {
      for (operand in opnds) {
        if (operand.eval(parser, parserCallStack)) {
          return true
        }
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
        // All elements were false, so the OR context is false
        return null
      }

      var result: SemanticContext? = operands[0]

      for (i in 1..<operands.size) {
        result = or(result, operands[i])
      }

      return result
    }

    override fun toString(): String =
      opnds.joinToString("||")
  }
}
