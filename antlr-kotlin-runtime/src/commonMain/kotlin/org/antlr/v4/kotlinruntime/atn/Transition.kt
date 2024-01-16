// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.misc.IntervalSet
import kotlin.js.JsName
import kotlin.reflect.KClass

/**
 * An ATN transition between any two ATN states.
 *
 * Subclasses define atom, set, epsilon, action, predicate, rule transitions.
 *
 * This is a one way link. It emanates from a state (usually via a list of
 * transitions) and has a target state.
 *
 * Since we never have to change the ATN transitions once we construct it,
 * we can fix these transitions as specific classes. The DFA transitions
 * on the other hand need to update the labels as it adds transitions to
 * the states. We'll use the term Edge for the DFA to distinguish them from
 * ATN transitions.
 *
 * @param target The target of this transition
 */
public abstract class Transition protected constructor(public var target: ATNState) {
  public companion object {
    // Constants for serialization
    public const val EPSILON: Int = 1
    public const val RANGE: Int = 2
    public const val RULE: Int = 3
    public const val PREDICATE: Int = 4 // e.g., {isType(input.LT(1))}?
    public const val ATOM: Int = 5
    public const val ACTION: Int = 6
    public const val SET: Int = 7 // ~(A|B) or ~atom, wildcard, which convert to next 2
    public const val NOT_SET: Int = 8
    public const val WILDCARD: Int = 9
    public const val PRECEDENCE: Int = 10

    public val serializationNames: List<String> = listOf(
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
    )

    public val serializationTypes: Map<KClass<out Transition>, Int> = buildMap {
      put(EpsilonTransition::class, EPSILON)
      put(RangeTransition::class, RANGE)
      put(RuleTransition::class, RULE)
      put(PredicateTransition::class, PREDICATE)
      put(AtomTransition::class, ATOM)
      put(ActionTransition::class, ACTION)
      put(SetTransition::class, SET)
      put(NotSetTransition::class, NOT_SET)
      put(WildcardTransition::class, WILDCARD)
      put(PrecedencePredicateTransition::class, PRECEDENCE)
    }
  }

  public abstract val serializationType: Int

  /**
   * Determines if the transition is an "epsilon" transition.
   *
   * The default implementation returns `false`.
   *
   * @return `true` if traversing this transition in the ATN does not
   *   consume an input symbol, otherwise `false` if traversing this
   *   transition consumes (matches) an input symbol
   */
  public open val isEpsilon: Boolean =
    false

  @JsName("getLabel")
  public open fun label(): IntervalSet? =
    null

  public abstract fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean
}
