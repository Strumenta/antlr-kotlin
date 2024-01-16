// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.antlrkotlin.runtime.BitSet
import org.antlr.v4.kotlinruntime.misc.AbstractEqualityComparator
import org.antlr.v4.kotlinruntime.misc.Array2DHashSet
import org.antlr.v4.kotlinruntime.misc.DoubleKeyMap
import kotlin.math.max

/**
 * Specialized [Set]`<`[ATNConfig]`>` that can track
 * info about the set, with support for combining similar configurations using a
 * graph-structured stack.
 *
 * @param fullCtx Indicates that this configuration set is part of a full
 *   context LL prediction. It will be used to determine how to merge `$`.
 *   With SLL it's a wildcard whereas it is not for LL context merge
 */
public open class ATNConfigSet(public val fullCtx: Boolean = true) : MutableSet<ATNConfig> {
  /**
   * The reason that we need this is that we don't want the hash map to use
   * the standard hash code and equals. We need all configurations with the same
   * `(s,i,_,semctx)` to be equal. Unfortunately, this key effectively doubles
   * the number of objects associated with ATNConfigs. The other solution is to
   * use a hash table that lets us specify the equals/hashcode operation.
   */
  public class ConfigHashSet : AbstractConfigHashSet(ConfigEqualityComparator.INSTANCE)

  public class ConfigEqualityComparator private constructor() : AbstractEqualityComparator<ATNConfig>() {
    public companion object {
      public val INSTANCE: ConfigEqualityComparator = ConfigEqualityComparator()
    }

    override fun hashCode(obj: ATNConfig): Int {
      var hashCode = 7
      hashCode = 31 * hashCode + obj.state.stateNumber
      hashCode = 31 * hashCode + obj.alt
      hashCode = 31 * hashCode + obj.semanticContext.hashCode()
      return hashCode
    }

    override fun equals(a: ATNConfig?, b: ATNConfig?): Boolean {
      if (a === b) {
        return true
      }

      if (a == null || b == null) {
        return false
      }

      return a.state.stateNumber == b.state.stateNumber &&
        a.alt == b.alt &&
        a.semanticContext == b.semanticContext
    }
  }

  /**
   * All configs but hashed by (s, i, _, pi) not including context.
   *
   * Wiped out when we go readonly as this set becomes a DFA state.
   */
  public var configLookup: AbstractConfigHashSet? = ConfigHashSet()

  /**
   * Track the elements as they are added to the set; supports get(i).
   */
  public val configs: MutableList<ATNConfig> = ArrayList(7)

  // TODO: these fields make me pretty uncomfortable but nice to pack up info together, saves re-computation
  // TODO: can we track conflicts as they are added to save scanning configs later?
  public var uniqueAlt: Int = 0

  /**
   * Currently this is only used when we detect SLL conflict; this does
   * not necessarily represent the ambiguous alternatives. In fact,
   * I should also point out that this seems to include predicated alternatives
   * that have predicates that evaluate to false. Computed in computeTargetState().
   */
  public var conflictingAlts: BitSet? = null

  // Used in parser and lexer. In lexer, it indicates we hit a pred
  // while computing a closure operation. Don't make a DFA state from this.
  public var hasSemanticContext: Boolean = false
  public var dipsIntoOuterContext: Boolean = false

  private var cachedHashCode = -1

  public val states: Set<ATNState>
    get() {
      val states = HashSet<ATNState>()

      for (c in configs) {
        states.add(c.state)
      }

      return states
    }

  /**
   * The complete set of represented alternatives for the configuration set.
   *
   * @since 4.3
   */
  public val alts: BitSet
    get() {
      val alts = BitSet()

      for (config in configs) {
        alts.set(config.alt)
      }

      return alts
    }

  public val predicates: List<SemanticContext>
    get() {
      val preds = ArrayList<SemanticContext>()

      for (c in configs) {
        if (c.semanticContext !== SemanticContext.Empty.Instance) {
          preds.add(c.semanticContext)
        }
      }

      return preds
    }

  /**
   * Indicates that the set of configurations is read-only. Do not
   * allow any code to manipulate the set; DFA states will point at
   * the sets, and they must not change. This does not protect the other
   * fields; in particular, conflictingAlts is set after
   * we've made this readonly.
   */
  public var isReadonly: Boolean = false
    set(value) {
      field = value

      // Can't mod, no need for lookup cache
      configLookup = null
    }

  public constructor(old: ATNConfigSet) : this(old.fullCtx) {
    @Suppress("LeakingThis")
    addAll(old)
    uniqueAlt = old.uniqueAlt
    conflictingAlts = old.conflictingAlts
    hasSemanticContext = old.hasSemanticContext
    dipsIntoOuterContext = old.dipsIntoOuterContext
  }

  override fun add(element: ATNConfig): Boolean =
    add(element, null)

  /**
   * Adding a new config means merging contexts with existing configs for
   * `(s, i, pi, _)`, where `s` is the [ATNConfig.state],`i` is the [ATNConfig.alt],
   * and `pi` is the [ATNConfig.semanticContext].
   *
   * We use `(s,i,pi)` as key.
   *
   * This method updates [dipsIntoOuterContext] and [hasSemanticContext] when necessary.
   */
  public fun add(
    config: ATNConfig,
    mergeCache: DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext>?,
  ): Boolean {
    if (isReadonly) {
      throw IllegalStateException("This set is readonly")
    }

    if (config.semanticContext !== SemanticContext.Empty.Instance) {
      hasSemanticContext = true
    }

    if (config.outerContextDepth > 0) {
      dipsIntoOuterContext = true
    }

    val existing = configLookup!!.getOrAdd(config)

    if (existing === config) { // we added this new one
      cachedHashCode = -1
      configs.add(config)  // track order here
      return true
    }

    // A previous (s,i,pi,_), merge with it and save result
    val rootIsWildcard = !fullCtx
    val merged = PredictionContext.merge(existing.context, config.context, rootIsWildcard, mergeCache)

    // No need to check for existing.context, config.context in cache
    // since only way to create new graphs is "call rule" and here. We
    // cache at both places
    existing.reachesIntoOuterContext = max(existing.reachesIntoOuterContext, config.reachesIntoOuterContext)

    // Make sure to preserve the precedence filter suppression during the merge
    if (config.isPrecedenceFilterSuppressed) {
      existing.isPrecedenceFilterSuppressed = true
    }

    existing.context = merged // replace context; no need to alt mapping
    return true
  }

  /**
   * Return a list holding list of configs.
   */
  public fun elements(): List<ATNConfig> =
    configs

  public operator fun get(i: Int): ATNConfig =
    configs[i]

  public fun optimizeConfigs(interpreter: ATNSimulator) {
    if (isReadonly) {
      throw IllegalStateException("This set is readonly")
    }

    if (configLookup!!.isEmpty()) {
      return
    }

    for (config in configs) {
      config.context = interpreter.getCachedContext(config.context!!)
    }
  }

  public override fun addAll(elements: Collection<ATNConfig>): Boolean {
    for (c in elements) {
      add(c)
    }

    return false
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) {
      return true
    }

    if (other !is ATNConfigSet) {
      return false
    }

    return configs == other.configs &&  // includes stack context
      fullCtx == other.fullCtx &&
      uniqueAlt == other.uniqueAlt &&
      conflictingAlts === other.conflictingAlts &&
      hasSemanticContext == other.hasSemanticContext &&
      dipsIntoOuterContext == other.dipsIntoOuterContext
  }

  override fun hashCode(): Int {
    if (isReadonly) {
      if (cachedHashCode == -1) {
        cachedHashCode = configs.hashCode()
      }

      return cachedHashCode
    }

    return configs.hashCode()
  }

  override val size: Int
    get() = configs.size

  override fun isEmpty(): Boolean =
    configs.isEmpty()

  override fun contains(element: ATNConfig): Boolean {
    if (configLookup == null) {
      throw UnsupportedOperationException("This method is not implemented for readonly sets.")
    }

    return configLookup!!.contains(element)
  }

  public fun containsFast(obj: ATNConfig): Boolean {
    if (configLookup == null) {
      throw UnsupportedOperationException("This method is not implemented for readonly sets.")
    }

    return configLookup!!.containsFast(obj)
  }

  override fun iterator(): MutableIterator<ATNConfig> =
    configs.iterator()

  public override fun clear() {
    if (isReadonly) {
      throw IllegalStateException("This set is readonly")
    }

    configs.clear()
    cachedHashCode = -1
    configLookup!!.clear()
  }

  override fun toString(): String {
    val buf = StringBuilder()
    buf.append(elements().toString())

    if (hasSemanticContext) {
      buf.append(",hasSemanticContext=")
      buf.append(hasSemanticContext)
    }

    if (uniqueAlt != ATN.INVALID_ALT_NUMBER) {
      buf.append(",uniqueAlt=")
      buf.append(uniqueAlt)
    }

    if (conflictingAlts != null) {
      buf.append(",conflictingAlts=")
      buf.append(conflictingAlts)
    }

    if (dipsIntoOuterContext) {
      buf.append(",dipsIntoOuterContext")
    }

    return buf.toString()
  }

  public fun toArray(): Array<ATNConfig> =
    configLookup!!.toArray()

  public fun <T> toArray(a: Array<T>): Array<T> =
    configLookup!!.toArray(a)

  override fun remove(element: ATNConfig): Boolean =
    throw UnsupportedOperationException()

  override fun containsAll(elements: Collection<ATNConfig>): Boolean =
    throw UnsupportedOperationException()

  override fun retainAll(elements: Collection<ATNConfig>): Boolean =
    throw UnsupportedOperationException()

  override fun removeAll(elements: Collection<ATNConfig>): Boolean =
    throw UnsupportedOperationException()

  public abstract class AbstractConfigHashSet(
    comparator: AbstractEqualityComparator<ATNConfig>,
    initialCapacity: Int = 16,
    initialBucketCapacity: Int = 2,
  ) : Array2DHashSet<ATNConfig>(comparator, initialCapacity, initialBucketCapacity) {
    protected override fun asElementType(o: Any?): ATNConfig? =
      if (o !is ATNConfig) null else o

    protected override fun createBuckets(capacity: Int): Array<Array<ATNConfig?>?> =
      arrayOfNulls(capacity)

    protected override fun createBucket(capacity: Int): Array<ATNConfig?> =
      arrayOfNulls(capacity)
  }
}
