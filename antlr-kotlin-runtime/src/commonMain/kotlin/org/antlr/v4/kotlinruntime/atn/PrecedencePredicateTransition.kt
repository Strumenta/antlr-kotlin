// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * @author Sam Harwell
 */
public class PrecedencePredicateTransition(
  target: ATNState,
  public val precedence: Int,
) : AbstractPredicateTransition(target) {

  override val serializationType: Int =
    PRECEDENCE

  override val isEpsilon: Boolean =
    true

  public val predicate: SemanticContext.PrecedencePredicate
    get() = SemanticContext.PrecedencePredicate(precedence)

  override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean =
    false

  override fun toString(): String =
    "$precedence >= _p"
}
