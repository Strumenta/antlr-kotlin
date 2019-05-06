/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.BitSet
import org.antlr.v4.kotlinruntime.misc.AbstractEqualityComparator
import org.antlr.v4.kotlinruntime.misc.FlexibleHashMap
import org.antlr.v4.kotlinruntime.misc.MurmurHash

/**
 * This enumeration defines the prediction modes available in ANTLR 4 along with
 * utility methods for analyzing configuration sets for conflicts and/or
 * ambiguities.
 */
enum class PredictionMode {
    /**
     * The SLL(*) prediction mode. This prediction mode ignores the current
     * parser context when making predictions. This is the fastest prediction
     * mode, and provides correct results for many grammars. This prediction
     * mode is more powerful than the prediction mode provided by ANTLR 3, but
     * may result in syntax errors for grammar and input combinations which are
     * not SLL.
     *
     *
     *
     * When using this prediction mode, the parser will either return a correct
     * parse tree (i.e. the same parse tree that would be returned with the
     * [.LL] prediction mode), or it will report a syntax error. If a
     * syntax error is encountered when using the [.SLL] prediction mode,
     * it may be due to either an actual syntax error in the input or indicate
     * that the particular combination of grammar and input requires the more
     * powerful [.LL] prediction abilities to complete successfully.
     *
     *
     *
     * This prediction mode does not provide any guarantees for prediction
     * behavior for syntactically-incorrect inputs.
     */
    SLL,
    /**
     * The LL(*) prediction mode. This prediction mode allows the current parser
     * context to be used for resolving SLL conflicts that occur during
     * prediction. This is the fastest prediction mode that guarantees correct
     * parse results for all combinations of grammars with syntactically correct
     * inputs.
     *
     *
     *
     * When using this prediction mode, the parser will make correct decisions
     * for all syntactically-correct grammar and input combinations. However, in
     * cases where the grammar is truly ambiguous this prediction mode might not
     * report a precise answer for *exactly which* alternatives are
     * ambiguous.
     *
     *
     *
     * This prediction mode does not provide any guarantees for prediction
     * behavior for syntactically-incorrect inputs.
     */
    LL,
    /**
     * The LL(*) prediction mode with exact ambiguity detection. In addition to
     * the correctness guarantees provided by the [.LL] prediction mode,
     * this prediction mode instructs the prediction algorithm to determine the
     * complete and exact set of ambiguous alternatives for every ambiguous
     * decision encountered while parsing.
     *
     *
     *
     * This prediction mode may be used for diagnosing ambiguities during
     * grammar development. Due to the performance overhead of calculating sets
     * of ambiguous alternatives, this prediction mode should be avoided when
     * the exact results are not necessary.
     *
     *
     *
     * This prediction mode does not provide any guarantees for prediction
     * behavior for syntactically-incorrect inputs.
     */
    LL_EXACT_AMBIG_DETECTION;

    /** A Map that uses just the state and the stack context as the key.  */
    internal class AltAndContextMap : FlexibleHashMap<ATNConfig, BitSet>(AltAndContextConfigEqualityComparator.INSTANCE) {
        // TODO decorate?
    }

    private class AltAndContextConfigEqualityComparator private constructor() : AbstractEqualityComparator<ATNConfig>() {

        /**
         * The hash code is only a function of the [ATNState.stateNumber]
         * and [ATNConfig.context].
         */
        override fun hashCode(o: ATNConfig): Int {
            var hashCode = MurmurHash.initialize(7)
            hashCode = MurmurHash.update(hashCode, o.state.stateNumber)
            hashCode = MurmurHash.update(hashCode, o.context)
            hashCode = MurmurHash.finish(hashCode, 2)
            return hashCode
        }

        override fun equals(a: ATNConfig?, b: ATNConfig?): Boolean {
            if (a === b) return true
            return if (a == null || b == null) false else a!!.state.stateNumber == b!!.state.stateNumber && a!!.context == b!!.context
        }

        companion object {
            val INSTANCE = AltAndContextConfigEqualityComparator()
        }
    }

    companion object {

        /**
         * Computes the SLL prediction termination condition.
         *
         *
         *
         * This method computes the SLL prediction termination condition for both of
         * the following cases.
         *
         *
         *  * The usual SLL+LL fallback upon SLL conflict
         *  * Pure SLL without LL fallback
         *
         *
         *
         * **COMBINED SLL+LL PARSING**
         *
         *
         * When LL-fallback is enabled upon SLL conflict, correct predictions are
         * ensured regardless of how the termination condition is computed by this
         * method. Due to the substantially higher cost of LL prediction, the
         * prediction should only fall back to LL when the additional lookahead
         * cannot lead to a unique SLL prediction.
         *
         *
         * Assuming combined SLL+LL parsing, an SLL configuration set with only
         * conflicting subsets should fall back to full LL, even if the
         * configuration sets don't resolve to the same alternative (e.g.
         * `{1,2}` and `{3,4}`. If there is at least one non-conflicting
         * configuration, SLL could continue with the hopes that more lookahead will
         * resolve via one of those non-conflicting configurations.
         *
         *
         * Here's the prediction termination rule them: SLL (for SLL+LL parsing)
         * stops when it sees only conflicting configuration subsets. In contrast,
         * full LL keeps going when there is uncertainty.
         *
         *
         * **HEURISTIC**
         *
         *
         * As a heuristic, we stop prediction when we see any conflicting subset
         * unless we see a state that only has one alternative associated with it.
         * The single-alt-state thing lets prediction continue upon rules like
         * (otherwise, it would admit defeat too soon):
         *
         *
         * `[12|1|[], 6|2|[], 12|2|[]]. s : (ID | ID ID?) ';' ;`
         *
         *
         * When the ATN simulation reaches the state before `';'`, it has a
         * DFA state that looks like: `[12|1|[], 6|2|[], 12|2|[]]`. Naturally
         * `12|1|[]` and `12|2|[]` conflict, but we cannot stop
         * processing this node because alternative to has another way to continue,
         * via `[6|2|[]]`.
         *
         *
         * It also let's us continue for this rule:
         *
         *
         * `[1|1|[], 1|2|[], 8|3|[]] a : A | A | A B ;`
         *
         *
         * After matching input A, we reach the stop state for rule A, state 1.
         * State 8 is the state right before B. Clearly alternatives 1 and 2
         * conflict and no amount of further lookahead will separate the two.
         * However, alternative 3 will be able to continue and so we do not stop
         * working on this state. In the previous example, we're concerned with
         * states associated with the conflicting alternatives. Here alt 3 is not
         * associated with the conflicting configs, but since we can continue
         * looking for input reasonably, don't declare the state done.
         *
         *
         * **PURE SLL PARSING**
         *
         *
         * To handle pure SLL parsing, all we have to do is make sure that we
         * combine stack contexts for configurations that differ only by semantic
         * predicate. From there, we can do the usual SLL termination heuristic.
         *
         *
         * **PREDICATES IN SLL+LL PARSING**
         *
         *
         * SLL decisions don't evaluate predicates until after they reach DFA stop
         * states because they need to create the DFA cache that works in all
         * semantic situations. In contrast, full LL evaluates predicates collected
         * during start state computation so it can ignore predicates thereafter.
         * This means that SLL termination detection can totally ignore semantic
         * predicates.
         *
         *
         * Implementation-wise, [ATNConfigSet] combines stack contexts but not
         * semantic predicate contexts so we might see two configurations like the
         * following.
         *
         *
         * `(s, 1, x, {}), (s, 1, x', {p})`
         *
         *
         * Before testing these configurations against others, we have to merge
         * `x` and `x'` (without modifying the existing configurations).
         * For example, we test `(x+x')==x''` when looking for conflicts in
         * the following configurations.
         *
         *
         * `(s, 1, x, {}), (s, 1, x', {p}), (s, 2, x'', {})`
         *
         *
         * If the configuration set has predicates (as indicated by
         * [ATNConfigSet.hasSemanticContext]), this algorithm makes a copy of
         * the configurations to strip out all of the predicates so that a standard
         * [ATNConfigSet] will merge everything ignoring predicates.
         */
        fun hasSLLConflictTerminatingPrediction(mode: PredictionMode, configs: ATNConfigSet): Boolean {
            var configs = configs
            /* Configs in rule stop states indicate reaching the end of the decision
		 * rule (local context) or end of start rule (full context). If all
		 * configs meet this condition, then none of the configurations is able
		 * to match additional input so we terminate prediction.
		 */
            if (allConfigsInRuleStopStates(configs)) {
                return true
            }

            // pure SLL mode parsing
            if (mode == PredictionMode.SLL) {
                // Don't bother with combining configs from different semantic
                // contexts if we can fail over to full LL; costs more time
                // since we'll often fail over anyway.
                if (configs.hasSemanticContext) {
                    // dup configs, tossing out semantic predicates
                    val dup = ATNConfigSet()
                    for (c in configs) {
                        var mutableC = c
                        mutableC = ATNConfig(mutableC, SemanticContext.NONE)
                        dup.add(mutableC)
                    }
                    configs = dup
                }
                // now we have combined contexts for configs with dissimilar preds
            }

            // pure SLL or combined SLL+LL mode parsing

            val altsets = getConflictingAltSubsets(configs)
            return hasConflictingAltSet(altsets) && !hasStateAssociatedWithOneAlt(configs)
        }

        /**
         * Checks if any configuration in `configs` is in a
         * [RuleStopState]. Configurations meeting this condition have reached
         * the end of the decision rule (local context) or end of start rule (full
         * context).
         *
         * @param configs the configuration set to test
         * @return `true` if any configuration in `configs` is in a
         * [RuleStopState], otherwise `false`
         */
        fun hasConfigInRuleStopState(configs: ATNConfigSet): Boolean {
            for (c in configs) {
                if (c.state is RuleStopState) {
                    return true
                }
            }

            return false
        }

        /**
         * Checks if all configurations in `configs` are in a
         * [RuleStopState]. Configurations meeting this condition have reached
         * the end of the decision rule (local context) or end of start rule (full
         * context).
         *
         * @param configs the configuration set to test
         * @return `true` if all configurations in `configs` are in a
         * [RuleStopState], otherwise `false`
         */
        fun allConfigsInRuleStopStates(configs: ATNConfigSet): Boolean {
            for (config in configs) {
                if (config.state !is RuleStopState) {
                    return false
                }
            }

            return true
        }

        /**
         * Full LL prediction termination.
         *
         *
         * Can we stop looking ahead during ATN simulation or is there some
         * uncertainty as to which alternative we will ultimately pick, after
         * consuming more input? Even if there are partial conflicts, we might know
         * that everything is going to resolve to the same minimum alternative. That
         * means we can stop since no more lookahead will change that fact. On the
         * other hand, there might be multiple conflicts that resolve to different
         * minimums. That means we need more look ahead to decide which of those
         * alternatives we should predict.
         *
         *
         * The basic idea is to split the set of configurations `C`, into
         * conflicting subsets `(s, _, ctx, _)` and singleton subsets with
         * non-conflicting configurations. Two configurations conflict if they have
         * identical [ATNConfig.state] and [ATNConfig.context] values
         * but different [ATNConfig.alt] value, e.g. `(s, i, ctx, _)`
         * and `(s, j, ctx, _)` for `i!=j`.
         *
         *
         * Reduce these configuration subsets to the set of possible alternatives.
         * You can compute the alternative subsets in one pass as follows:
         *
         *
         * `A_s,ctx = {i | (s, i, ctx, _)}` for each configuration in
         * `C` holding `s` and `ctx` fixed.
         *
         *
         * Or in pseudo-code, for each configuration `c` in `C`:
         *
         * <pre>
         * map[c] U= c.[alt][ATNConfig.alt] # map hash/equals uses s and x, not
         * alt and not pred
        </pre> *
         *
         *
         * The values in `map` are the set of `A_s,ctx` sets.
         *
         *
         * If `|A_s,ctx|=1` then there is no conflict associated with
         * `s` and `ctx`.
         *
         *
         * Reduce the subsets to singletons by choosing a minimum of each subset. If
         * the union of these alternative subsets is a singleton, then no amount of
         * more lookahead will help us. We will always pick that alternative. If,
         * however, there is more than one alternative, then we are uncertain which
         * alternative to predict and must continue looking for resolution. We may
         * or may not discover an ambiguity in the future, even if there are no
         * conflicting subsets this round.
         *
         *
         * The biggest sin is to terminate early because it means we've made a
         * decision but were uncertain as to the eventual outcome. We haven't used
         * enough lookahead. On the other hand, announcing a conflict too late is no
         * big deal; you will still have the conflict. It's just inefficient. It
         * might even look until the end of file.
         *
         *
         * No special consideration for semantic predicates is required because
         * predicates are evaluated on-the-fly for full LL prediction, ensuring that
         * no configuration contains a semantic context during the termination
         * check.
         *
         *
         * **CONFLICTING CONFIGS**
         *
         *
         * Two configurations `(s, i, x)` and `(s, j, x')`, conflict
         * when `i!=j` but `x=x'`. Because we merge all
         * `(s, i, _)` configurations together, that means that there are at
         * most `n` configurations associated with state `s` for
         * `n` possible alternatives in the decision. The merged stacks
         * complicate the comparison of configuration contexts `x` and
         * `x'`. Sam checks to see if one is a subset of the other by calling
         * merge and checking to see if the merged result is either `x` or
         * `x'`. If the `x` associated with lowest alternative `i`
         * is the superset, then `i` is the only possible prediction since the
         * others resolve to `min(i)` as well. However, if `x` is
         * associated with `j>i` then at least one stack configuration for
         * `j` is not in conflict with alternative `i`. The algorithm
         * should keep going, looking for more lookahead due to the uncertainty.
         *
         *
         * For simplicity, I'm doing a equality check between `x` and
         * `x'` that lets the algorithm continue to consume lookahead longer
         * than necessary. The reason I like the equality is of course the
         * simplicity but also because that is the test you need to detect the
         * alternatives that are actually in conflict.
         *
         *
         * **CONTINUE/STOP RULE**
         *
         *
         * Continue if union of resolved alternative sets from non-conflicting and
         * conflicting alternative subsets has more than one alternative. We are
         * uncertain about which alternative to predict.
         *
         *
         * The complete set of alternatives, `[i for (_,i,_)]`, tells us which
         * alternatives are still in the running for the amount of input we've
         * consumed at this point. The conflicting sets let us to strip away
         * configurations that won't lead to more states because we resolve
         * conflicts to the configuration with a minimum alternate for the
         * conflicting set.
         *
         *
         * **CASES**
         *
         *
         *
         *  * no conflicts and more than 1 alternative in set =&gt; continue
         *
         *  *  `(s, 1, x)`, `(s, 2, x)`, `(s, 3, z)`,
         * `(s', 1, y)`, `(s', 2, y)` yields non-conflicting set
         * `{3}` U conflicting sets `min({1,2})` U `min({1,2})` =
         * `{1,3}` =&gt; continue
         *
         *
         *  * `(s, 1, x)`, `(s, 2, x)`, `(s', 1, y)`,
         * `(s', 2, y)`, `(s'', 1, z)` yields non-conflicting set
         * `{1}` U conflicting sets `min({1,2})` U `min({1,2})` =
         * `{1}` =&gt; stop and predict 1
         *
         *  * `(s, 1, x)`, `(s, 2, x)`, `(s', 1, y)`,
         * `(s', 2, y)` yields conflicting, reduced sets `{1}` U
         * `{1}` = `{1}` =&gt; stop and predict 1, can announce
         * ambiguity `{1,2}`
         *
         *  * `(s, 1, x)`, `(s, 2, x)`, `(s', 2, y)`,
         * `(s', 3, y)` yields conflicting, reduced sets `{1}` U
         * `{2}` = `{1,2}` =&gt; continue
         *
         *  * `(s, 1, x)`, `(s, 2, x)`, `(s', 3, y)`,
         * `(s', 4, y)` yields conflicting, reduced sets `{1}` U
         * `{3}` = `{1,3}` =&gt; continue
         *
         *
         *
         *
         * **EXACT AMBIGUITY DETECTION**
         *
         *
         * If all states report the same conflicting set of alternatives, then we
         * know we have the exact ambiguity set.
         *
         *
         * `|A_*i*|>1` and
         * `A_*i* = A_*j*` for all *i*, *j*.
         *
         *
         * In other words, we continue examining lookahead until all `A_i`
         * have more than one alternative and all `A_i` are the same. If
         * `A={{1,2}, {1,3}}`, then regular LL prediction would terminate
         * because the resolved set is `{1}`. To determine what the real
         * ambiguity is, we have to know whether the ambiguity is between one and
         * two or one and three so we keep going. We can only stop prediction when
         * we need exact ambiguity detection when the sets look like
         * `A={{1,2}}` or `{{1,2},{1,2}}`, etc...
         */
        fun resolvesToJustOneViableAlt(altsets: Collection<BitSet>): Int {
            return getSingleViableAlt(altsets)
        }

        /**
         * Determines if every alternative subset in `altsets` contains more
         * than one alternative.
         *
         * @param altsets a collection of alternative subsets
         * @return `true` if every [BitSet] in `altsets` has
         * [cardinality][BitSet.cardinality] &gt; 1, otherwise `false`
         */
        fun allSubsetsConflict(altsets: Collection<BitSet>): Boolean {
            return !hasNonConflictingAltSet(altsets)
        }

        /**
         * Determines if any single alternative subset in `altsets` contains
         * exactly one alternative.
         *
         * @param altsets a collection of alternative subsets
         * @return `true` if `altsets` contains a [BitSet] with
         * [cardinality][BitSet.cardinality] 1, otherwise `false`
         */
        fun hasNonConflictingAltSet(altsets: Collection<BitSet>): Boolean {
            for (alts in altsets) {
                if (alts.cardinality() == 1) {
                    return true
                }
            }
            return false
        }

        /**
         * Determines if any single alternative subset in `altsets` contains
         * more than one alternative.
         *
         * @param altsets a collection of alternative subsets
         * @return `true` if `altsets` contains a [BitSet] with
         * [cardinality][BitSet.cardinality] &gt; 1, otherwise `false`
         */
        fun hasConflictingAltSet(altsets: Collection<BitSet>): Boolean {
            for (alts in altsets) {
                if (alts.cardinality() > 1) {
                    return true
                }
            }
            return false
        }

        /**
         * Determines if every alternative subset in `altsets` is equivalent.
         *
         * @param altsets a collection of alternative subsets
         * @return `true` if every member of `altsets` is equal to the
         * others, otherwise `false`
         */
        fun allSubsetsEqual(altsets: Collection<BitSet>): Boolean {
            val it = altsets.iterator()
            val first = it.next()
            while (it.hasNext()) {
                val next = it.next()
                if (next != first) return false
            }
            return true
        }

        /**
         * Returns the unique alternative predicted by all alternative subsets in
         * `altsets`. If no such alternative exists, this method returns
         * [ATN.INVALID_ALT_NUMBER].
         *
         * @param altsets a collection of alternative subsets
         */
        fun getUniqueAlt(altsets: Collection<BitSet>): Int {
            val all = getAlts(altsets)
            return if (all.cardinality() == 1) all.nextSetBit(0) else ATN.INVALID_ALT_NUMBER
        }

        /**
         * Gets the complete set of represented alternatives for a collection of
         * alternative subsets. This method returns the union of each [BitSet]
         * in `altsets`.
         *
         * @param altsets a collection of alternative subsets
         * @return the set of represented alternatives in `altsets`
         */
        fun getAlts(altsets: Collection<BitSet>): BitSet {
            val all = BitSet()
            for (alts in altsets) {
                all.or(alts)
            }
            return all
        }

        /**
         * Get union of all alts from configs.
         *
         * @since 4.5.1
         */
        fun getAlts(configs: ATNConfigSet): BitSet {
            val alts = BitSet()
            for (config in configs) {
                alts.set(config.alt)
            }
            return alts
        }

        /**
         * This function gets the conflicting alt subsets from a configuration set.
         * For each configuration `c` in `configs`:
         *
         * <pre>
         * map[c] U= c.[alt][ATNConfig.alt] # map hash/equals uses s and x, not
         * alt and not pred
        </pre> *
         */
        fun getConflictingAltSubsets(configs: ATNConfigSet): Collection<BitSet> {
            val configToAlts = AltAndContextMap()
            for (c in configs) {
                var alts = configToAlts.get(c)
                if (alts == null) {
                    alts = BitSet()
                    configToAlts.put(c, alts)
                }
                alts!!.set(c.alt)
            }
            return configToAlts.values
        }

        /**
         * Get a map from state to alt subset from a configuration set. For each
         * configuration `c` in `configs`:
         *
         * <pre>
         * map[c.[state][ATNConfig.state]] U= c.[alt][ATNConfig.alt]
        </pre> *
         */
        fun getStateToAltMap(configs: ATNConfigSet): Map<ATNState, BitSet> {
            val m = HashMap<ATNState, BitSet>()
            for (c in configs) {
                var alts: BitSet? = m[c.state]
                if (alts == null) {
                    alts = BitSet()
                    m.put(c.state, alts)
                }
                alts.set(c.alt)
            }
            return m
        }

        fun hasStateAssociatedWithOneAlt(configs: ATNConfigSet): Boolean {
            val x = getStateToAltMap(configs)
            for (alts in x.values) {
                if (alts.cardinality() == 1) return true
            }
            return false
        }

        fun getSingleViableAlt(altsets: Collection<BitSet>): Int {
            val viableAlts = BitSet()
            for (alts in altsets) {
                val minAlt = alts.nextSetBit(0)
                viableAlts.set(minAlt)
                if (viableAlts.cardinality() > 1) { // more than 1 viable alt
                    return ATN.INVALID_ALT_NUMBER
                }
            }
            return viableAlts.nextSetBit(0)
        }
    }

}
