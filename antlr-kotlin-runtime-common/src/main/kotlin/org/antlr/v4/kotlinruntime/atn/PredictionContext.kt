/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.IdentityHashMap
import com.strumenta.kotlinmultiplatform.assert
import org.antlr.v4.kotlinruntime.EMPTY_RULECTX
import org.antlr.v4.kotlinruntime.Recognizer
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.misc.DoubleKeyMap
import org.antlr.v4.kotlinruntime.misc.MurmurHash

abstract class PredictionContext protected constructor(
    /**
     * Stores the computed hash code of this [PredictionContext]. The hash
     * code is computed in parts to match the following reference algorithm.
     *
     * <pre>
     * private int referenceHashCode() {
     * int hash = [MurmurHash.initialize]([.INITIAL_HASH]);
     *
     * for (int i = 0; i &lt; [.size]; i++) {
     * hash = [MurmurHash.update](hash, [getParent][.getParent](i));
     * }
     *
     * for (int i = 0; i &lt; [.size]; i++) {
     * hash = [MurmurHash.update](hash, [getReturnState][.getReturnState](i));
     * }
     *
     * hash = [MurmurHash.finish](hash, 2 * [.size]);
     * return hash;
     * }
    </pre> *
     */
    val cachedHashCode: Int
) {
    val id = globalNodeCount++

    /** This means only the [.EMPTY] (wildcard? not sure) context is in set.  */
    open val isEmpty: Boolean
        get() = this === EMPTY

    abstract fun size(): Int

    abstract fun getParent(index: Int): PredictionContext?

    abstract fun getReturnState(index: Int): Int

    fun hasEmptyPath(): Boolean {
        // since EMPTY_RETURN_STATE can only appear in the last position, we check last one
        return getReturnState(size() - 1) == EMPTY_RETURN_STATE
    }

    override fun hashCode(): Int {
        return cachedHashCode
    }

    abstract override fun equals(obj: Any?): Boolean

    fun toString(recog: Recognizer<*, *>): String {
        return toString()
        //		return toString(recog, ParserRuleContext.EMPTY);
    }

    fun toStrings(recognizer: Recognizer<*, *>, currentState: Int): Array<String> {
        return toStrings(recognizer, EMPTY, currentState)
    }

    // FROM SAM
    fun toStrings(recognizer: Recognizer<*, *>?, stop: PredictionContext, currentState: Int): Array<String> {
        val result = ArrayList<String>()

        var perm = 0
        outer@ while (true) {
            var offset = 0
            var last = true
            var p: PredictionContext? = this
            var stateNumber = currentState
            val localBuffer = StringBuilder()
            localBuffer.append("[")
            while (!p!!.isEmpty && p !== stop) {
                var index = 0
                if (p.size() > 0) {
                    var bits = 1
                    while (1 shl bits < p.size()) {
                        bits++
                    }

                    val mask = (1 shl bits) - 1
                    index = perm shr offset and mask
                    last = last and (index >= p.size() - 1)
                    if (index >= p.size()) {
                        perm++
                        continue@outer
                    }
                    offset += bits
                }

                if (recognizer != null) {
                    if (localBuffer.length > 1) {
                        // first char is '[', if more than that this isn't the first rule
                        localBuffer.append(' ')
                    }

                    val atn = recognizer!!.atn
                    val s = atn.states.get(stateNumber)
                    val ruleName = recognizer!!.ruleNames!![s!!.ruleIndex]
                    localBuffer.append(ruleName)
                } else if (p.getReturnState(index) != EMPTY_RETURN_STATE) {
                    if (!p.isEmpty) {
                        if (localBuffer.length > 1) {
                            // first char is '[', if more than that this isn't the first rule
                            localBuffer.append(' ')
                        }

                        localBuffer.append(p.getReturnState(index))
                    }
                }
                stateNumber = p.getReturnState(index)
                p = p.getParent(index)
            }
            localBuffer.append("]")
            result.add(localBuffer.toString())

            if (last) {
                break
            }
            perm++
        }

        return result.toTypedArray()
    }

    companion object {
        /**
         * Represents `$` in local context prediction, which means wildcard.
         * `*+x = *`.
         */
        val EMPTY = EmptyPredictionContext()

        /**
         * Represents `$` in an array in full context mode, when `$`
         * doesn't mean wildcard: `$ + x = [$,x]`. Here,
         * `$` = [.EMPTY_RETURN_STATE].
         */
        val EMPTY_RETURN_STATE = Int.MAX_VALUE

        private val INITIAL_HASH = 1

        var globalNodeCount = 0

        /** Convert a [RuleContext] tree to a [PredictionContext] graph.
         * Return [.EMPTY] if `outerContext` is empty or null.
         */
        fun fromRuleContext(atn: ATN, outerContext: RuleContext?): PredictionContext {
            var outerContext = outerContext
            if (outerContext == null) outerContext = EMPTY_RULECTX

            // if we are in RuleContext of start rule, s, then PredictionContext
            // is EMPTY. Nobody called us. (if we are empty, return empty)
            if (outerContext!!.readParent() == null || outerContext === EMPTY_RULECTX) {
                return PredictionContext.EMPTY
            }

            // If we have a parent, convert it to a PredictionContext graph
            var parent: PredictionContext = EMPTY
            parent = PredictionContext.fromRuleContext(atn, outerContext!!.readParent())

            val state = atn.states.get(outerContext!!.invokingState)
            val transition = state!!.transition(0) as RuleTransition
            return SingletonPredictionContext.create(parent, transition.followState.stateNumber)
        }

        public fun calculateEmptyHashCode(): Int {
            var hash = MurmurHash.initialize(INITIAL_HASH)
            hash = MurmurHash.finish(hash, 0)
            return hash
        }

        public fun calculateHashCode(parent: PredictionContext, returnState: Int): Int {
            var hash = MurmurHash.initialize(INITIAL_HASH)
            hash = MurmurHash.update(hash, parent)
            hash = MurmurHash.update(hash, returnState)
            hash = MurmurHash.finish(hash, 2)
            return hash
        }

        public fun calculateHashCode(parents: Array<PredictionContext?>, returnStates: IntArray): Int {
            var hash = MurmurHash.initialize(INITIAL_HASH)

            for (parent in parents) {
                hash = MurmurHash.update(hash, parent)
            }

            for (returnState in returnStates) {
                hash = MurmurHash.update(hash, returnState)
            }

            hash = MurmurHash.finish(hash, 2 * parents.size)
            return hash
        }

        // dispatch
        fun merge(
            a: PredictionContext?, b: PredictionContext?,
            rootIsWildcard: Boolean,
            mergeCache: DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext>?
        ): PredictionContext {
            var a = a
            var b = b
            assert(a != null && b != null) // must be empty context, never null

            // share same graph if both same
            if (a === b || a == b) return a!!

            if (a is SingletonPredictionContext && b is SingletonPredictionContext) {
                return mergeSingletons(
                    a as SingletonPredictionContext,
                    b as SingletonPredictionContext,
                    rootIsWildcard, mergeCache
                )
            }

            // At least one of a or b is array
            // If one is $ and rootIsWildcard, return $ as * wildcard
            if (rootIsWildcard) {
                if (a is EmptyPredictionContext) return a
                if (b is EmptyPredictionContext) return b
            }

            // convert singleton so both are arrays to normalize
            if (a is SingletonPredictionContext) {
                a = ArrayPredictionContext(a)
            }
            if (b is SingletonPredictionContext) {
                b = ArrayPredictionContext((b as SingletonPredictionContext?)!!)
            }
            return mergeArrays(
                a as ArrayPredictionContext, b as ArrayPredictionContext,
                rootIsWildcard, mergeCache
            )
        }

        /**
         * Merge two [SingletonPredictionContext] instances.
         *
         *
         * Stack tops equal, parents merge is same; return left graph.<br></br>
         * <embed src="images/SingletonMerge_SameRootSamePar.svg" type="image/svg+xml"></embed>
         *
         *
         * Same stack top, parents differ; merge parents giving array node, then
         * remainders of those graphs. A new root node is created to point to the
         * merged parents.<br></br>
         * <embed src="images/SingletonMerge_SameRootDiffPar.svg" type="image/svg+xml"></embed>
         *
         *
         * Different stack tops pointing to same parent. Make array node for the
         * root where both element in the root point to the same (original)
         * parent.<br></br>
         * <embed src="images/SingletonMerge_DiffRootSamePar.svg" type="image/svg+xml"></embed>
         *
         *
         * Different stack tops pointing to different parents. Make array node for
         * the root where each element points to the corresponding original
         * parent.<br></br>
         * <embed src="images/SingletonMerge_DiffRootDiffPar.svg" type="image/svg+xml"></embed>
         *
         * @param a the first [SingletonPredictionContext]
         * @param b the second [SingletonPredictionContext]
         * @param rootIsWildcard `true` if this is a local-context merge,
         * otherwise false to indicate a full-context merge
         * @param mergeCache
         */
        fun mergeSingletons(
            a: SingletonPredictionContext,
            b: SingletonPredictionContext,
            rootIsWildcard: Boolean,
            mergeCache: DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext>?
        ): PredictionContext {
            if (mergeCache != null) {
                var previous = mergeCache!!.get(a, b)
                if (previous != null) return previous
                previous = mergeCache!!.get(b, a)
                if (previous != null) return previous
            }

            val rootMerge = mergeRoot(a, b, rootIsWildcard)
            if (rootMerge != null) {
                if (mergeCache != null) mergeCache!!.put(a, b, rootMerge)
                return rootMerge
            }

            if (a.returnState == b.returnState) { // a == b
                val parent = merge(a.parent, b.parent, rootIsWildcard, mergeCache)
                // if parent is same as existing a or b parent or reduced to a parent, return it
                if (parent === a.parent) return a // ax + bx = ax, if a=b
                if (parent === b.parent) return b // ax + bx = bx, if a=b
                // else: ax + ay = a'[x,y]
                // merge parents x and y, giving array node with x,y then remainders
                // of those graphs.  dup a, a' points at merged array
                // new joined parent so create new singleton pointing to it, a'
                val a_ = SingletonPredictionContext.create(parent, a.returnState)
                if (mergeCache != null) mergeCache!!.put(a, b, a_)
                return a_
            } else { // a != b payloads differ
                // see if we can collapse parents due to $+x parents if local ctx
                var singleParent: PredictionContext? = null
                if (a === b || a.parent != null && a.parent == b.parent) { // ax + bx = [a,b]x
                    singleParent = a.parent
                }
                if (singleParent != null) {    // parents are same
                    // sort payloads and use same parent
                    val payloads = intArrayOf(a.returnState, b.returnState)
                    if (a.returnState > b.returnState) {
                        payloads[0] = b.returnState
                        payloads[1] = a.returnState
                    }
                    val parents = arrayOf(singleParent, singleParent)
                    TODO()
                    //val a_ = ArrayPredictionContext(parents!!, payloads)
                    //if (mergeCache != null) mergeCache!!.put(a, b, a_)
                    //return a_
                }
                // parents differ and can't merge them. Just pack together
                // into array; can't merge.
                // ax + by = [ax,by]
                val payloads = intArrayOf(a.returnState, b.returnState)
                var parents = arrayOf<PredictionContext?>(a.parent, b.parent)
                if (a.returnState > b.returnState) { // sort by payload
                    payloads[0] = b.returnState
                    payloads[1] = a.returnState
                    parents = arrayOf(b.parent, a.parent)
                }
                val a_ = ArrayPredictionContext(parents, payloads)
                if (mergeCache != null) mergeCache!!.put(a, b, a_)
                return a_
            }
        }

        /**
         * Handle case where at least one of `a` or `b` is
         * [.EMPTY]. In the following diagrams, the symbol `$` is used
         * to represent [.EMPTY].
         *
         * <h2>Local-Context Merges</h2>
         *
         *
         * These local-context merge operations are used when `rootIsWildcard`
         * is true.
         *
         *
         * [.EMPTY] is superset of any graph; return [.EMPTY].<br></br>
         * <embed src="images/LocalMerge_EmptyRoot.svg" type="image/svg+xml"></embed>
         *
         *
         * [.EMPTY] and anything is `#EMPTY`, so merged parent is
         * `#EMPTY`; return left graph.<br></br>
         * <embed src="images/LocalMerge_EmptyParent.svg" type="image/svg+xml"></embed>
         *
         *
         * Special case of last merge if local context.<br></br>
         * <embed src="images/LocalMerge_DiffRoots.svg" type="image/svg+xml"></embed>
         *
         * <h2>Full-Context Merges</h2>
         *
         *
         * These full-context merge operations are used when `rootIsWildcard`
         * is false.
         *
         *
         * <embed src="images/FullMerge_EmptyRoots.svg" type="image/svg+xml"></embed>
         *
         *
         * Must keep all contexts; [.EMPTY] in array is a special value (and
         * null parent).<br></br>
         * <embed src="images/FullMerge_EmptyRoot.svg" type="image/svg+xml"></embed>
         *
         *
         * <embed src="images/FullMerge_SameRoot.svg" type="image/svg+xml"></embed>
         *
         * @param a the first [SingletonPredictionContext]
         * @param b the second [SingletonPredictionContext]
         * @param rootIsWildcard `true` if this is a local-context merge,
         * otherwise false to indicate a full-context merge
         */
        fun mergeRoot(
            a: SingletonPredictionContext,
            b: SingletonPredictionContext,
            rootIsWildcard: Boolean
        ): PredictionContext? {
            if (rootIsWildcard) {
                if (a === EMPTY) return EMPTY  // * + b = *
                if (b === EMPTY) return EMPTY  // a + * = *
            } else {
                if (a === EMPTY && b === EMPTY) return EMPTY // $ + $ = $

                if (a === EMPTY) { // $ + x = [x,$]
                    val payloads = intArrayOf(b.returnState, EMPTY_RETURN_STATE)
                    val parents = arrayOf(b.parent, null)
                    return ArrayPredictionContext(parents, payloads)
                }
                if (b === EMPTY) { // x + $ = [x,$] ($ is always last if present)
                    val payloads = intArrayOf(a.returnState, EMPTY_RETURN_STATE)
                    val parents = arrayOf(a.parent, null)
                    return ArrayPredictionContext(parents, payloads)
                }
            }
            return null
        }

        /**
         * Merge two [ArrayPredictionContext] instances.
         *
         *
         * Different tops, different parents.<br></br>
         * <embed src="images/ArrayMerge_DiffTopDiffPar.svg" type="image/svg+xml"></embed>
         *
         *
         * Shared top, same parents.<br></br>
         * <embed src="images/ArrayMerge_ShareTopSamePar.svg" type="image/svg+xml"></embed>
         *
         *
         * Shared top, different parents.<br></br>
         * <embed src="images/ArrayMerge_ShareTopDiffPar.svg" type="image/svg+xml"></embed>
         *
         *
         * Shared top, all shared parents.<br></br>
         * <embed src="images/ArrayMerge_ShareTopSharePar.svg" type="image/svg+xml"></embed>
         *
         *
         * Equal tops, merge parents and reduce top to
         * [SingletonPredictionContext].<br></br>
         * <embed src="images/ArrayMerge_EqualTop.svg" type="image/svg+xml"></embed>
         */
        fun mergeArrays(
            a: ArrayPredictionContext,
            b: ArrayPredictionContext,
            rootIsWildcard: Boolean,
            mergeCache: DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext>?
        ): PredictionContext {
            if (mergeCache != null) {
                var previous = mergeCache!!.get(a, b)
                if (previous != null) return previous
                previous = mergeCache!!.get(b, a)
                if (previous != null) return previous
            }

            // merge sorted payloads a + b => M
            var i = 0 // walks a
            var j = 0 // walks b
            var k = 0 // walks target M array

            var mergedReturnStates = IntArray(a.returnStates!!.size + b.returnStates!!.size)
            var mergedParents = arrayOfNulls<PredictionContext>(a.returnStates!!.size + b.returnStates.size)
            // walk and merge to yield mergedParents, mergedReturnStates
            while (i < a.returnStates!!.size && j < b.returnStates!!.size) {
                val a_parent = a.parents!![i]
                val b_parent = b.parents!![j]
                if (a.returnStates[i] == b.returnStates!![j]) {
                    // same payload (stack tops are equal), must yield merged singleton
                    val payload = a.returnStates[i]
                    // $+$ = $
                    val `both$` = payload == EMPTY_RETURN_STATE &&
                            a_parent == null && b_parent == null
                    val ax_ax = a_parent != null && b_parent != null && a_parent == b_parent // ax+ax -> ax
                    if (`both$` || ax_ax) {
                        mergedParents[k] = a_parent // choose left
                        mergedReturnStates[k] = payload
                    } else { // ax+ay -> a'[x,y]
                        val mergedParent = merge(a_parent, b_parent, rootIsWildcard, mergeCache)
                        mergedParents[k] = mergedParent
                        mergedReturnStates[k] = payload
                    }
                    i++ // hop over left one as usual
                    j++ // but also skip one in right side since we merge
                } else if (a.returnStates[i] < b.returnStates[j]) { // copy a[i] to M
                    mergedParents[k] = a_parent
                    mergedReturnStates[k] = a.returnStates[i]
                    i++
                } else { // b > a, copy b[j] to M
                    mergedParents[k] = b_parent
                    mergedReturnStates[k] = b.returnStates[j]
                    j++
                }
                k++
            }

            // copy over any payloads remaining in either array
            if (i < a.returnStates.size) {
                for (p in i until a.returnStates.size) {
                    mergedParents[k] = a.parents!![p]
                    mergedReturnStates[k] = a.returnStates[p]
                    k++
                }
            } else {
                for (p in j until b.returnStates!!.size) {
                    mergedParents[k] = b.parents!![p]
                    mergedReturnStates[k] = b.returnStates!![p]
                    k++
                }
            }

            // trim merged if we combined a few that had same stack tops
            if (k < mergedParents.size) { // write index < last position; trim
                if (k == 1) { // for just one merged element, return singleton top
                    val a_ = SingletonPredictionContext.create(
                        mergedParents[0],
                        mergedReturnStates[0]
                    )
                    if (mergeCache != null) mergeCache!!.put(a, b, a_)
                    return a_
                }
                mergedParents = Arrays.copyOf<PredictionContext?>(mergedParents, k)

                mergedReturnStates = mergedReturnStates.copyOf(k)
            }

            val M = ArrayPredictionContext(mergedParents, mergedReturnStates)

            // if we created same array as a or b, return that instead
            // TODO: track whether this is possible above during merge sort for speed
            if (M == a) {
                if (mergeCache != null) mergeCache!!.put(a, b, a)
                return a
            }
            if (M == b) {
                if (mergeCache != null) mergeCache!!.put(a, b, b)
                return b
            }

            //TODO efficiency
            combineCommonParents(mergedParents.filterNotNull().toTypedArray())

            if (mergeCache != null) mergeCache!!.put(a, b, M)
            return M
        }

        /**
         * Make pass over all *M* `parents`; merge any `equals()`
         * ones.
         */
        protected fun combineCommonParents(parents: Array<PredictionContext>) {
            val uniqueParents = HashMap<PredictionContext, PredictionContext>()

            for (p in parents.indices) {
                val parent = parents[p]
                if (!uniqueParents.containsKey(parent)) { // don't replace
                    uniqueParents.put(parent, parent)
                }
            }

            for (p in parents.indices) {
                parents[p] = uniqueParents[parents[p]]!!
            }
        }

        fun toDOTString(context: PredictionContext?): String {
            if (context == null) return ""
            val buf = StringBuilder()
            buf.append("digraph G {\n")
            buf.append("rankdir=LR;\n")

            val nodes = getAllContextNodes(context).sortedBy { it.id }

            for (current in nodes) {
                if (current is SingletonPredictionContext) {
                    val s = current.id.toString()
                    buf.append("  s").append(s)
                    var returnState = current.getReturnState(0).toString()
                    if (current is EmptyPredictionContext) returnState = "$"
                    buf.append(" [accessLabel=\"").append(returnState).append("\"];\n")
                    continue
                }
                val arr = current as ArrayPredictionContext
                buf.append("  s").append(arr.id)
                buf.append(" [shape=box, accessLabel=\"")
                buf.append("[")
                var first = true
                for (inv in arr!!.returnStates!!) {
                    if (!first) buf.append(", ")
                    if (inv == EMPTY_RETURN_STATE)
                        buf.append("$")
                    else
                        buf.append(inv)
                    first = false
                }
                buf.append("]")
                buf.append("\"];\n")
            }

            for (current in nodes) {
                if (current === EMPTY) continue
                for (i in 0 until current.size()) {
                    if (current.getParent(i) == null) continue
                    val s = current.id.toString()
                    buf.append("  s").append(s)
                    buf.append("->")
                    buf.append("s")
                    buf.append(current.getParent(i)!!.id)
                    if (current.size() > 1)
                        buf.append(" [accessLabel=\"parent[$i]\"];\n")
                    else
                        buf.append(";\n")
                }
            }

            buf.append("}\n")
            return buf.toString()
        }

        // From Sam
        fun getCachedContext(
            context: PredictionContext,
            contextCache: PredictionContextCache,
            visited: IdentityHashMap<PredictionContext, PredictionContext>
        ): PredictionContext {
            if (context.isEmpty) {
                return context
            }

            var existing: PredictionContext? = visited[context]
            if (existing != null) {
                return existing
            }

            existing = contextCache.get(context)
            if (existing != null) {
                visited.put(context, existing)
                return existing
            }

            var changed = false
            var parents = arrayOfNulls<PredictionContext>(context.size())
            for (i in parents.indices) {
                val parent = getCachedContext(context.getParent(i)!!, contextCache, visited)
                if (changed || parent !== context.getParent(i)) {
                    if (!changed) {
                        parents = arrayOfNulls(context.size())
                        for (j in 0 until context.size()) {
                            parents[j] = context.getParent(j)
                        }

                        changed = true
                    }

                    parents[i] = parent
                }
            }

            if (!changed) {
                contextCache.add(context)
                visited.put(context, context)
                return context
            }

            val updated: PredictionContext
            if (parents.size == 0) {
                updated = EMPTY
            } else if (parents.size == 1) {
                updated = SingletonPredictionContext.create(parents[0], context.getReturnState(0))
            } else {
                val arrayPredictionContext = context as ArrayPredictionContext
                updated = ArrayPredictionContext(parents, arrayPredictionContext.returnStates)
            }

            contextCache.add(updated)
            visited.put(updated, updated)
            visited.put(context, updated)

            return updated
        }

        //	// extra structures, but cut/paste/morphed works, so leave it.
        //	// seems to do a breadth-first walk
        //	public static List<PredictionContext> getAllNodes(PredictionContext context) {
        //		Map<PredictionContext, PredictionContext> visited =
        //			new IdentityHashMap<PredictionContext, PredictionContext>();
        //		Deque<PredictionContext> workList = new ArrayDeque<PredictionContext>();
        //		workList.add(context);
        //		visited.put(context, context);
        //		List<PredictionContext> nodes = new ArrayList<PredictionContext>();
        //		while (!workList.isEmpty()) {
        //			PredictionContext current = workList.pop();
        //			nodes.add(current);
        //			for (int i = 0; i < current.size(); i++) {
        //				PredictionContext parent = current.getParent(i);
        //				if ( parent!=null && visited.put(parent, parent) == null) {
        //					workList.push(parent);
        //				}
        //			}
        //		}
        //		return nodes;
        //	}

        // ter's recursive version of Sam's getAllNodes()
        fun getAllContextNodes(context: PredictionContext): List<PredictionContext> {
            val nodes = ArrayList<PredictionContext>()
            val visited = IdentityHashMap<PredictionContext, PredictionContext>()
            getAllContextNodes_(context, nodes, visited)
            return nodes
        }

        fun getAllContextNodes_(
            context: PredictionContext?,
            nodes: MutableList<PredictionContext>,
            visited: MutableMap<PredictionContext, PredictionContext>
        ) {
            if (context == null || visited.containsKey(context)) return
            visited.put(context, context)
            nodes.add(context)
            for (i in 0 until context.size()) {
                getAllContextNodes_(context.getParent(i), nodes, visited)
            }
        }
    }
}
