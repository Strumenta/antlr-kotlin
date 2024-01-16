// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Recognizer
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * A tuple: (ATN state, predicted alt, syntactic, semantic context).
 *
 * The syntactic context is a graph-structured stack node whose
 * path(s) to the root is the rule invocation(s)
 * chain used to arrive in the state.
 *
 * The semantic context is the tree of semantic predicates encountered
 * before reaching an ATN state.
 */
public open class ATNConfig {
  public companion object {
    /**
     * This field stores the bit mask for implementing the
     * [isPrecedenceFilterSuppressed] property as a bit within the
     * existing [reachesIntoOuterContext] field.
     */
    private const val SUPPRESS_PRECEDENCE_FILTER: Int = 0x40000000
  }

  /**
   * The ATN state associated with this configuration.
   */
  public val state: ATNState

  /**
   * What alt (or lexer rule) is predicted by this configuration.
   */
  public val alt: Int

  /**
   * The stack of invoking states leading to the rule/states associated
   * with this config.
   *
   * We track only those contexts pushed during execution of the ATN simulator.
   */
  public var context: PredictionContext? = null

  /**
   * We cannot execute predicates dependent upon local context unless
   * we know for sure we are in the correct context. Because there is
   * no way to do this efficiently, we simply cannot evaluate
   * dependent predicates unless we are in the rule that initially
   * invokes the ATN simulator.
   *
   * `closure()` tracks the depth of how far we dip into the outer context:
   * `depth > 0`. Note that it may not be totally accurate depth since I
   * don't ever decrement. TODO: make it a boolean then
   *
   * For memory efficiency, the [isPrecedenceFilterSuppressed] method
   * is also backed by this field. Since the field is publicly accessible, the
   * highest bit which would not cause the value to become negative is used to
   * store this field. This choice minimizes the risk that code which only
   * compares this value to `0` would be affected by the new purpose of the
   * flag. It also ensures the performance of the existing [ATNConfig]
   * constructors as well as certain operations like [ATNConfigSet.add]
   * method are *completely* unaffected by the change.
   */
  public var reachesIntoOuterContext: Int = 0

  public val semanticContext: SemanticContext

  /**
   * This method gets the value of the [reachesIntoOuterContext] field
   * as it existed prior to the introduction of the [isPrecedenceFilterSuppressed] method.
   */
  public val outerContextDepth: Int
    get() = reachesIntoOuterContext and SUPPRESS_PRECEDENCE_FILTER.inv()

  public var isPrecedenceFilterSuppressed: Boolean
    get() = reachesIntoOuterContext and SUPPRESS_PRECEDENCE_FILTER != 0
    set(value) = if (value) {
      reachesIntoOuterContext = reachesIntoOuterContext or 0x40000000
    } else {
      reachesIntoOuterContext = reachesIntoOuterContext and SUPPRESS_PRECEDENCE_FILTER.inv()
    }

  public constructor(old: ATNConfig) {
    state = old.state
    alt = old.alt
    context = old.context
    semanticContext = old.semanticContext
    reachesIntoOuterContext = old.reachesIntoOuterContext
  }

  public constructor(
    state: ATNState,
    alt: Int,
    context: PredictionContext?,
    semanticContext: SemanticContext = SemanticContext.Empty.Instance,
  ) {
    this.state = state
    this.alt = alt
    this.context = context
    this.semanticContext = semanticContext
  }

  public constructor(
    c: ATNConfig,
    state: ATNState,
    semanticContext: SemanticContext,
  ) : this(c, state, c.context, semanticContext)

  public constructor(
    c: ATNConfig,
    semanticContext: SemanticContext,
  ) : this(c, c.state, c.context, semanticContext)

  public constructor(
    c: ATNConfig,
    state: ATNState,
    context: PredictionContext? = c.context,
    semanticContext: SemanticContext = c.semanticContext,
  ) {
    this.state = state
    alt = c.alt
    this.context = context
    this.semanticContext = semanticContext
    reachesIntoOuterContext = c.reachesIntoOuterContext
  }

  /**
   * An ATN configuration is equal to another if both have
   * the same state, they predict the same alternative, and
   * syntactic/semantic contexts are the same.
   */
  override fun equals(other: Any?): Boolean =
    other is ATNConfig && atnEquals(other)

  // Note(Edoardo): renamed from 'equals' to avoid unexpected conflicts
  public open fun atnEquals(other: ATNConfig?): Boolean {
    if (this === other) {
      return true
    }

    if (other == null) {
      return false
    }

    return state.stateNumber == other.state.stateNumber
      && alt == other.alt
      && context == other.context
      && semanticContext == other.semanticContext
      && isPrecedenceFilterSuppressed == other.isPrecedenceFilterSuppressed
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

  override fun toString(): String =
    toString(null, true)

  public open fun toString(recog: Recognizer<*, *>?, showAlt: Boolean): String {
    val buf = StringBuilder()
    buf.append("(")
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

    if (semanticContext !== SemanticContext.Empty.Instance) {
      buf.append(",")
      buf.append(semanticContext)
    }

    if (outerContextDepth > 0) {
      buf.append(",up=")
      buf.append(outerContextDepth)
    }

    buf.append(")")
    return buf.toString()
  }
}
