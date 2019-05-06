/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.BitSet
import com.strumenta.kotlinmultiplatform.Math
import org.antlr.v4.kotlinruntime.misc.AbstractEqualityComparator
import org.antlr.v4.kotlinruntime.misc.Array2DHashSet
import org.antlr.v4.kotlinruntime.misc.DoubleKeyMap

/**
 * Specialized [Set]`<`[ATNConfig]`>` that can track
 * info about the set, with support for combining similar configurations using a
 * graph-structured stack.
 */
open class ATNConfigSet constructor(
        /** Indicates that this configuration set is part of a full context
         * LL prediction. It will be used to determine how to merge $. With SLL
         * it's a wildcard whereas it is not for LL context merge.
         */
        val fullCtx: Boolean = true) : Set<ATNConfig> {

    /** Indicates that the set of configurations is read-only. Do not
     * allow any code to manipulate the set; DFA states will point at
     * the sets and they must not change. This does not protect the other
     * fields; in particular, conflictingAlts is set after
     * we've made this readonly.
     */
    //protected var readonly = false

    /**
     * All configs but hashed by (s, i, _, pi) not including context. Wiped out
     * when we go readonly as this set becomes a DFA state.
     */
    var configLookup: AbstractConfigHashSet? = null

    /** Track the elements as they are added to the set; supports get(i)  */
    val configs = ArrayList<ATNConfig>(7)

    // TODO: these fields make me pretty uncomfortable but nice to pack up info together, saves recomputation
    // TODO: can we track conflicts as they are added to save scanning configs later?
    var uniqueAlt: Int = 0
    /** Currently this is only used when we detect SLL conflict; this does
     * not necessarily represent the ambiguous alternatives. In fact,
     * I should also point out that this seems to include predicated alternatives
     * that have predicates that evaluate to false. Computed in computeTargetState().
     */
    var conflictingAlts: BitSet? = null

    // Used in parser and lexer. In lexer, it indicates we hit a pred
    // while computing a closure operation.  Don't make a DFA state from this.
    var hasSemanticContext: Boolean = false
    var dipsIntoOuterContext: Boolean = false

    private var cachedHashCode = -1

    val states: Set<ATNState>
        get() {
            val states = HashSet<ATNState>()
            for (c in configs) {
                states.add(c.state)
            }
            return states
        }

    /**
     * Gets the complete set of represented alternatives for the configuration
     * set.
     *
     * @return the set of represented alternatives in this configuration set
     *
     * @since 4.3
     */

    val alts: BitSet
        get() {
            val alts = BitSet()
            for (config in configs) {
                alts.set(config.alt)
            }
            return alts
        }

    val predicates: List<SemanticContext>
        get() {
            val preds = ArrayList<SemanticContext>()
            for (c in configs) {
                if (c.semanticContext !== SemanticContext.NONE) {
                    preds.add(c.semanticContext!!)
                }
            }
            return preds
        }

    // can't mod, no need for lookup cache
    var isReadonly: Boolean = false
        get
        set(value: Boolean) {
            field = value
            configLookup = null
        }

    /**
     * The reason that we need this is because we don't want the hash map to use
     * the standard hash code and equals. We need all configurations with the same
     * `(s,i,_,semctx)` to be equal. Unfortunately, this key effectively doubles
     * the number of objects associated with ATNConfigs. The other solution is to
     * use a hash table that lets us specify the equals/hashcode operation.
     */
    class ConfigHashSet : AbstractConfigHashSet(ConfigEqualityComparator.INSTANCE) {
        override fun containsAll(elements: Collection<ATNConfig>): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun retainAll(elements: Collection<ATNConfig>): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun remove(element: ATNConfig): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

    class ConfigEqualityComparator private constructor() : AbstractEqualityComparator<ATNConfig>() {

        override fun hashCode(o: ATNConfig): Int {
            var hashCode = 7
            hashCode = 31 * hashCode + o.state.stateNumber
            hashCode = 31 * hashCode + o.alt
            hashCode = 31 * hashCode + o.semanticContext!!.hashCode()
            return hashCode
        }

        override fun equals(a: ATNConfig?, b: ATNConfig?): Boolean {
            if (a === b) return true
            return if (a == null || b == null) false else a!!.state.stateNumber == b!!.state.stateNumber
                    && a!!.alt == b!!.alt
                    && a!!.semanticContext == b!!.semanticContext
        }

        companion object {
            val INSTANCE = ConfigEqualityComparator()
        }
    }

    init {
        configLookup = ConfigHashSet()
    }

    constructor(old: ATNConfigSet) : this(old.fullCtx) {
        addAll(old)
        this.uniqueAlt = old.uniqueAlt
        this.conflictingAlts = old.conflictingAlts
        this.hasSemanticContext = old.hasSemanticContext
        this.dipsIntoOuterContext = old.dipsIntoOuterContext
    }

    fun add(config: ATNConfig): Boolean {
        return add(config, null)
    }

    /**
     * Adding a new config means merging contexts with existing configs for
     * `(s, i, pi, _)`, where `s` is the
     * [ATNConfig.state], `i` is the [ATNConfig.alt], and
     * `pi` is the [ATNConfig.semanticContext]. We use
     * `(s,i,pi)` as key.
     *
     *
     * This method updates [.dipsIntoOuterContext] and
     * [.hasSemanticContext] when necessary.
     */
    fun add(
            config: ATNConfig,
            mergeCache: DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext>?): Boolean {
        if (isReadonly) throw IllegalStateException("This set is readonly")
        if (config.semanticContext !== SemanticContext.NONE) {
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
        // a previous (s,i,pi,_), merge with it and save result
        val rootIsWildcard = !fullCtx
        val merged = PredictionContext.merge(existing.context, config.context, rootIsWildcard, mergeCache)
        // no need to check for existing.context, config.context in cache
        // since only way to create new graphs is "call rule" and here. We
        // cache at both places.
        existing.reachesIntoOuterContext = Math.max(existing.reachesIntoOuterContext, config.reachesIntoOuterContext)

        // make sure to preserve the precedence filter suppression during the merge
        if (config.isPrecedenceFilterSuppressed) {
            existing.isPrecedenceFilterSuppressed = true
        }

        existing.context = merged // replace context; no need to alt mapping
        return true
    }

    /** Return a List holding list of configs  */
    fun elements(): List<ATNConfig> {
        return configs
    }

    operator fun get(i: Int): ATNConfig {
        return configs[i]
    }

    fun optimizeConfigs(interpreter: ATNSimulator) {
        if (isReadonly) throw IllegalStateException("This set is readonly")
        if (configLookup!!.isEmpty()) return

        for (config in configs) {
            //			int before = PredictionContext.getAllContextNodes(config.context).size();
            config.context = interpreter.getCachedContext(config.context!!)
            //			int after = PredictionContext.getAllContextNodes(config.context).size();
            //			System.out.println("configs "+before+"->"+after);
        }
    }

    fun addAll(coll: Collection<out ATNConfig>): Boolean {
        for (c in coll) add(c)
        return false
    }

    override fun equals(o: Any?): Boolean {
        if (o === this) {
            return true
        } else if (o !is ATNConfigSet) {
            return false
        }

        //		System.out.print("equals " + this + ", " + o+" = ");
        val other = o as ATNConfigSet?

        //		System.out.println(same);
        return configs != null &&
                configs == other!!.configs &&  // includes stack context

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

    override fun isEmpty(): Boolean {
        return configs.isEmpty()
    }

    override fun contains(o: ATNConfig): Boolean {
        if (configLookup == null) {
            throw UnsupportedOperationException("This method is not implemented for readonly sets.")
        }

        return configLookup!!.contains(o)
    }

    fun containsFast(obj: ATNConfig): Boolean {
        if (configLookup == null) {
            throw UnsupportedOperationException("This method is not implemented for readonly sets.")
        }

        return configLookup!!.containsFast(obj)
    }

    override fun iterator(): Iterator<ATNConfig> {
        return configs.iterator()
    }

    fun clear() {
        if (isReadonly) throw IllegalStateException("This set is readonly")
        configs.clear()
        cachedHashCode = -1
        configLookup!!.clear()
    }

    override fun toString(): String {
        val buf = StringBuilder()
        buf.append(elements().toString())
        if (hasSemanticContext) buf.append(",hasSemanticContext=").append(hasSemanticContext)
        if (uniqueAlt != ATN.INVALID_ALT_NUMBER) buf.append(",uniqueAlt=").append(uniqueAlt)
        if (conflictingAlts != null) buf.append(",conflictingAlts=").append(conflictingAlts)
        if (dipsIntoOuterContext) buf.append(",dipsIntoOuterContext")
        return buf.toString()
    }

    // satisfy interface

    fun toArray(): Array<ATNConfig> {
        return configLookup!!.toArray()
    }

    fun <T> toArray(a: Array<T>): Array<T> {
        return configLookup!!.toArray(a)
    }


    override fun containsAll(elements: Collection<ATNConfig>): Boolean {
        throw UnsupportedOperationException()
    }

    abstract class AbstractConfigHashSet constructor(comparator: AbstractEqualityComparator<in ATNConfig>, initialCapacity: Int = 16, initialBucketCapacity: Int = 2) : Array2DHashSet<ATNConfig>(comparator, initialCapacity, initialBucketCapacity) {

        protected override fun asElementType(o: Any): ATNConfig? {
            return if (o !is ATNConfig) {
                null
            } else o as ATNConfig

        }

        protected override fun createBuckets(capacity: Int): Array<Array<ATNConfig>?> {
            return arrayOfNulls<Array<ATNConfig>>(capacity)
        }

        protected override fun createBucket(capacity: Int): Array<ATNConfig?> {
            return arrayOfNulls<ATNConfig>(capacity)
        }

    }
}
