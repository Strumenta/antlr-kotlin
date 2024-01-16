// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.misc.MurmurHash
import org.antlr.v4.kotlinruntime.misc.ObjectEqualityComparator

@Suppress("EqualsOrHashCode")
public class LexerATNConfig : ATNConfig {
  private val passedThroughNonGreedyDecision: Boolean

  /**
   * The [LexerActionExecutor] capable of executing the embedded
   * action(s) for the current configuration.
   */
  public val lexerActionExecutor: LexerActionExecutor?

  public constructor(
    state: ATNState,
    alt: Int,
    context: PredictionContext,
  ) : super(state, alt, context, SemanticContext.Empty.Instance) {
    passedThroughNonGreedyDecision = false
    lexerActionExecutor = null
  }

  public constructor(
    state: ATNState,
    alt: Int,
    context: PredictionContext,
    lexerActionExecutor: LexerActionExecutor,
  ) : super(state, alt, context, SemanticContext.Empty.Instance) {
    this.lexerActionExecutor = lexerActionExecutor
    passedThroughNonGreedyDecision = false
  }

  public constructor(
    c: LexerATNConfig,
    state: ATNState,
  ) : super(c, state, c.context, c.semanticContext) {
    lexerActionExecutor = c.lexerActionExecutor
    passedThroughNonGreedyDecision = checkNonGreedyDecision(c, state)
  }

  public constructor(
    c: LexerATNConfig,
    state: ATNState,
    lexerActionExecutor: LexerActionExecutor?,
  ) : super(c, state, c.context, c.semanticContext) {
    this.lexerActionExecutor = lexerActionExecutor
    passedThroughNonGreedyDecision = checkNonGreedyDecision(c, state)
  }

  public constructor(
    c: LexerATNConfig,
    state: ATNState,
    context: PredictionContext,
  ) : super(c, state, context, c.semanticContext) {
    lexerActionExecutor = c.lexerActionExecutor
    passedThroughNonGreedyDecision = checkNonGreedyDecision(c, state)
  }

  public fun hasPassedThroughNonGreedyDecision(): Boolean =
    passedThroughNonGreedyDecision

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

  override fun atnEquals(other: ATNConfig?): Boolean {
    if (this === other) {
      return true
    }

    if (other !is LexerATNConfig) {
      return false
    }

    if (passedThroughNonGreedyDecision != other.passedThroughNonGreedyDecision) {
      return false
    }

    if (!ObjectEqualityComparator.INSTANCE.equals(lexerActionExecutor, other.lexerActionExecutor)) {
      return false
    }

    return super.atnEquals(other)
  }

  private fun checkNonGreedyDecision(source: LexerATNConfig, target: ATNState): Boolean =
    source.passedThroughNonGreedyDecision || target is DecisionState && target.nonGreedy
}
