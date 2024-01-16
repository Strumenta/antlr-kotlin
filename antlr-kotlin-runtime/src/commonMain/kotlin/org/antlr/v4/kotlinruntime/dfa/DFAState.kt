// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.dfa

import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * A DFA state represents a set of possible ATN configurations.
 * As Aho, Sethi, Ullman p. 117 says "The DFA uses its state
 * to keep track of all possible states the ATN can be in after
 * reading each input symbol. That is to say, after reading
 * input a1a2..an, the DFA is in a state that represents the
 * subset T of the states of the ATN that are reachable from the
 * ATN's start state along some path labeled a1a2..an."
 * In conventional NFADFA conversion, therefore, the subset T
 * would be a bitset representing the set of states the
 * ATN could be in. We need to track the alt predicted by each
 * state as well, however. More importantly, we need to maintain
 * a stack of states, tracking the closure operations as they
 * jump from rule to rule, emulating rule invocations (method calls).
 * I have to add a stack to simulate the proper lookahead sequences for
 * the underlying LL grammar from which the ATN was derived.
 *
 * I use a set of ATNConfig objects not simple states. An ATNConfig
 * is both a state (ala normal conversion) and a RuleContext describing
 * the chain of rules (if any) followed to arrive at that state.
 *
 * A DFA state may have multiple references to a particular state,
 * but with different ATN contexts (with same or different alts)
 * meaning that state was reached via a different set of rule invocations.
 */
public class DFAState {
  public var stateNumber: Int = -1
  public var configs: ATNConfigSet = ATNConfigSet()

  /**
   * `edges[symbol]` points to target of symbol.
   * Shift up by 1 so (-1) [Token.EOF] maps to `edges[0]`.
   */
  public var edges: Array<DFAState?>? = null
  public var isAcceptState: Boolean = false

  /**
   * If accept state, what ttype do we match or alt do we predict?
   * This is set to [ATN.INVALID_ALT_NUMBER] when [predicates] `!= null` or [requiresFullContext].
   */
  public var prediction: Int = 0
  public var lexerActionExecutor: LexerActionExecutor? = null

  /**
   * Indicates that this state was created during SLL prediction that
   * discovered a conflict between the configurations in the state. Future
   * [ParserATNSimulator.execATN] invocations immediately jumped doing
   * full context prediction if this field is true.
   */
  public var requiresFullContext: Boolean = false

  /**
   * During SLL parsing, this is a list of predicates associated with the
   * ATN configurations of the DFA state. When we have predicates,
   * [requiresFullContext] is `false` since full context prediction evaluates predicates
   * on-the-fly. If this is not null, then [prediction] is [ATN.INVALID_ALT_NUMBER].
   *
   * We only use these for non-[requiresFullContext] but conflicting states.
   * That means we know from the context (it's $ or we don't dip into outer context)
   * that it's an ambiguity not a conflict.
   *
   * This list is computed by [ParserATNSimulator.predicateDFAState].
   */
  public var predicates: Array<PredPrediction>? = null

  /**
   * Get the set of all alts mentioned by all ATN configurations in this DFA state.
   */
  public val altSet: Set<Int>?
    get() {
      val alts = HashSet<Int>()
      val configs = configs

      for (c in configs) {
        alts.add(c.alt)
      }

      return alts.ifEmpty { null }
    }

  /**
   * Map a predicate to a predicted alternative.
   */
  public class PredPrediction(
    // Never null, at least SemanticContext.NONE
    public var pred: SemanticContext,
    public var alt: Int,
  ) {
    override fun toString(): String =
      "($pred, $alt)"
  }

  public constructor()

  public constructor(stateNumber: Int) {
    this.stateNumber = stateNumber
  }

  public constructor(configs: ATNConfigSet) {
    this.configs = configs
  }

  override fun hashCode(): Int {
    var hash = MurmurHash.initialize(7)
    hash = MurmurHash.update(hash, configs.hashCode())
    hash = MurmurHash.finish(hash, 1)
    return hash
  }

  /**
   * Two [DFAState] instances are equal if their ATN configuration sets
   * are the same. This method is used to see if a state already exists.
   *
   * Because the number of alternatives and number of ATN configurations are
   * finite, there is a finite number of DFA states that can be processed.
   * This is necessary to show that the algorithm terminates.
   *
   * Cannot test the DFA state numbers here because in
   * [ParserATNSimulator.addDFAState] we need to know if any other state
   * exists that has this exact set of ATN configurations.
   * The [stateNumber] is irrelevant.
   */
  override fun equals(other: Any?): Boolean {
    // Compare set of ATN configurations in this set with other
    if (this === other) {
      return true
    }

    if (other !is DFAState) {
      return false
    }

    // TODO(sam): what to do when configs==null?
    return configs == other.configs
  }

  override fun toString(): String {
    val buf = StringBuilder()
    buf.append(stateNumber)
    buf.append(":")
    buf.append(configs)

    if (isAcceptState) {
      buf.append("=>")
      val predicates = predicates

      if (predicates != null) {
        buf.append(predicates.joinToString())
      } else {
        buf.append(prediction)
      }
    }

    return buf.toString()
  }
}
