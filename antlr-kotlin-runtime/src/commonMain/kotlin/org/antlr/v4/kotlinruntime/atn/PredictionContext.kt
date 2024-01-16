// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.antlrkotlin.runtime.IdentityHashMap
import com.strumenta.antlrkotlin.runtime.System
import com.strumenta.antlrkotlin.runtime.assert
import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.Recognizer
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.misc.DoubleKeyMap
import org.antlr.v4.kotlinruntime.misc.MurmurHash

@Suppress("EqualsOrHashCode", "MemberVisibilityCanBePrivate")
public abstract class PredictionContext protected constructor(
  /**
   * Stores the computed hash code of this [PredictionContext].
   *
   * The hash code is computed in parts to match the following reference algorithm.
   *
   * ```
   * private fun referenceHashCode(): Int {
   *   val hash = MurmurHash.initialize(INITIAL_HASH)
   *
   *   for (i in 0..<size) {
   *     hash = MurmurHash.update(hash, getParent(i))
   *   }
   *
   *   for (i in 0..<size) {
   *     hash = MurmurHash.update(hash, getReturnState(i))
   *   }
   *
   *   hash = MurmurHash.finish(hash, 2 * size)
   *   return hash
   * }
   * ```
   */
  public val cachedHashCode: Int,
) {
  public companion object {
    private const val INITIAL_HASH = 1

    /**
     * Represents `$` in an array in full context mode, when `$`
     * doesn't mean wildcard: `$ + x = [$,x]`.
     *
     * Here, `$` = [EMPTY_RETURN_STATE].
     */
    public const val EMPTY_RETURN_STATE: Int = Int.MAX_VALUE

    /**
     * Convert a [RuleContext] tree to a [PredictionContext] graph.
     *
     * Return [EmptyPredictionContext.Instance] if [outerContext] is empty or `null`.
     */
    public fun fromRuleContext(atn: ATN, outerContext: RuleContext?): PredictionContext {
      val tempOuterContext = outerContext ?: ParserRuleContext.EMPTY

      // If we are in RuleContext of start rule, s, then PredictionContext
      // is EMPTY. Nobody called us. (if we are empty, return empty)
      if (tempOuterContext.parent == null || tempOuterContext === ParserRuleContext.EMPTY) {
        return EmptyPredictionContext.Instance
      }

      // If we have a parent, convert it to a PredictionContext graph
      val parent = fromRuleContext(atn, tempOuterContext.readParent())
      val state = atn.states[tempOuterContext.invokingState]
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

    // Dispatch
    public fun merge(
      a: PredictionContext?,
      b: PredictionContext?,
      rootIsWildcard: Boolean,
      mergeCache: DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext>?,
    ): PredictionContext {
      var aa = a
      var bb = b

      // Must be empty context, never null
      assert(aa != null && bb != null)

      // Share same graph if both same
      if (a === b || aa == bb) {
        return aa
      }

      if (aa is SingletonPredictionContext && bb is SingletonPredictionContext) {
        return mergeSingletons(aa, bb, rootIsWildcard, mergeCache)
      }

      // At least one of a or b is array
      // If one is $ and rootIsWildcard, return $ as * wildcard
      if (rootIsWildcard) {
        if (aa is EmptyPredictionContext) {
          return aa
        }

        if (bb is EmptyPredictionContext) {
          return bb
        }
      }

      // Convert singleton so both are arrays to normalize
      if (aa is SingletonPredictionContext) {
        aa = ArrayPredictionContext(aa)
      }

      if (bb is SingletonPredictionContext) {
        bb = ArrayPredictionContext(bb)
      }

      return mergeArrays(
        aa as ArrayPredictionContext,
        bb as ArrayPredictionContext,
        rootIsWildcard,
        mergeCache,
      )
    }

    /**
     * Merge two [SingletonPredictionContext] instances.
     *
     * Stack tops equal, parents merge is same; return left graph.
     *
     * <embed src="images/SingletonMerge_SameRootSamePar.svg" type="image/svg+xml"></embed>
     *
     * Same stack top, parents differ; merge parents giving array node, then
     * remainders of those graphs. A new root node is created to point to the
     * merged parents.
     *
     * <embed src="images/SingletonMerge_SameRootDiffPar.svg" type="image/svg+xml"></embed>
     *
     * Different stack tops pointing to same parent. Make array node for the
     * root where both element in the root point to the same (original)
     * parent.
     *
     * <embed src="images/SingletonMerge_DiffRootSamePar.svg" type="image/svg+xml"></embed>
     *
     * Different stack tops pointing to different parents. Make array node for
     * the root where each element points to the corresponding original
     * parent.
     *
     * <embed src="images/SingletonMerge_DiffRootDiffPar.svg" type="image/svg+xml"></embed>
     *
     * @param a The first [SingletonPredictionContext]
     * @param b The second [SingletonPredictionContext]
     * @param rootIsWildcard `true` if this is a local-context merge,
     *   otherwise `false` to indicate a full-context merge
     * @param mergeCache
     */
    public fun mergeSingletons(
      a: SingletonPredictionContext,
      b: SingletonPredictionContext,
      rootIsWildcard: Boolean,
      mergeCache: DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext>?,
    ): PredictionContext {
      if (mergeCache != null) {
        var previous = mergeCache[a, b]

        if (previous != null) {
          return previous
        }

        previous = mergeCache[b, a]

        if (previous != null) {
          return previous
        }
      }

      val rootMerge = mergeRoot(a, b, rootIsWildcard)

      if (rootMerge != null) {
        mergeCache?.put(a, b, rootMerge)
        return rootMerge
      }

      // a == b
      if (a.returnState == b.returnState) {
        val parent = merge(a.parent, b.parent, rootIsWildcard, mergeCache)

        // If parent is same as existing a or b parent or reduced to a parent, return it
        // ax + bx = ax, if a=b
        if (parent === a.parent) {
          return a
        }

        // ax + bx = bx, if a=b
        if (parent === b.parent) {
          return b
        }

        // Else: ax + ay = a'[x,y]
        // merge parents x and y, giving array node with x,y then remainders
        // of those graphs. dup a, a' points at merged array
        // new joined parent so create new singleton pointing to it, a'
        @Suppress("LocalVariableName")
        val a_ = SingletonPredictionContext.create(parent, a.returnState)
        mergeCache?.put(a, b, a_)
        return a_
      }

      // a != b payloads differ
      // see if we can collapse parents due to $+x parents if local ctx
      var singleParent: PredictionContext? = null

      // ax + bx = [a,b]x
      if (a === b || a.parent != null && a.parent == b.parent) {
        singleParent = a.parent
      }

      if (singleParent != null) {
        // Parents are same.
        // Sort payloads and use same parent
        val payloads = intArrayOf(a.returnState, b.returnState)

        if (a.returnState > b.returnState) {
          payloads[0] = b.returnState
          payloads[1] = a.returnState
        }

        val parents: Array<PredictionContext?> = arrayOf(singleParent, singleParent)

        @Suppress("LocalVariableName")
        val a_ = ArrayPredictionContext(parents, payloads)
        mergeCache?.put(a, b, a_)
        return a_
      }

      // Parents differ and can't merge them. Just pack together
      // into array; can't merge.
      // ax + by = [ax,by]
      val payloads = intArrayOf(a.returnState, b.returnState)
      var parents = arrayOf(a.parent, b.parent)

      // Sort by payload
      if (a.returnState > b.returnState) {
        payloads[0] = b.returnState
        payloads[1] = a.returnState
        parents = arrayOf(b.parent, a.parent)
      }

      @Suppress("LocalVariableName")
      val a_ = ArrayPredictionContext(parents, payloads)
      mergeCache?.put(a, b, a_)
      return a_
    }

    /**
     * Handle case where at least one of [a] or [b] is [EmptyPredictionContext.Instance].
     *
     * In the following diagrams, the symbol `$` is used to represent [EmptyPredictionContext.Instance].
     *
     * ### Local-Context Merges
     *
     * These local-context merge operations are used when [rootIsWildcard] is true.
     *
     * [EmptyPredictionContext.Instance] is superset of any graph; return [EmptyPredictionContext.Instance].
     *
     * <embed src="images/LocalMerge_EmptyRoot.svg" type="image/svg+xml"></embed>
     *
     * [EmptyPredictionContext.Instance] and anything is `#EMPTY`, so merged parent is `#EMPTY`; return left graph.
     *
     * <embed src="images/LocalMerge_EmptyParent.svg" type="image/svg+xml"></embed>
     *
     * Special case of last merge if local context.
     *
     * <embed src="images/LocalMerge_DiffRoots.svg" type="image/svg+xml"></embed>
     *
     * ### Full-Context Merges
     *
     * These full-context merge operations are used when [rootIsWildcard] is false.
     *
     * <embed src="images/FullMerge_EmptyRoots.svg" type="image/svg+xml"></embed>
     *
     * Must keep all contexts; [EmptyPredictionContext.Instance] in array is a special value (and `null` parent).
     *
     * <embed src="images/FullMerge_EmptyRoot.svg" type="image/svg+xml"></embed>
     *
     * <embed src="images/FullMerge_SameRoot.svg" type="image/svg+xml"></embed>
     *
     * @param a The first [SingletonPredictionContext]
     * @param b The second [SingletonPredictionContext]
     * @param rootIsWildcard `true` if this is a local-context merge,
     *   otherwise false to indicate a full-context merge
     */
    public fun mergeRoot(
      a: SingletonPredictionContext,
      b: SingletonPredictionContext,
      rootIsWildcard: Boolean,
    ): PredictionContext? {
      if (rootIsWildcard) {
        if (a === EmptyPredictionContext.Instance) {
          // * + b = *
          return EmptyPredictionContext.Instance
        }

        if (b === EmptyPredictionContext.Instance) {
          // a + * = *
          return EmptyPredictionContext.Instance
        }
      } else {
        if (a === EmptyPredictionContext.Instance && b === EmptyPredictionContext.Instance) {
          // $ + $ = $
          return EmptyPredictionContext.Instance
        }

        if (a === EmptyPredictionContext.Instance) {
          // $ + x = [x,$]
          val payloads = intArrayOf(b.returnState, EMPTY_RETURN_STATE)
          val parents = arrayOf(b.parent, null)
          return ArrayPredictionContext(parents, payloads)
        }

        if (b === EmptyPredictionContext.Instance) {
          // x + $ = [x,$] ($ is always last if present)
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
     * Different tops, different parents.
     *
     * <embed src="images/ArrayMerge_DiffTopDiffPar.svg" type="image/svg+xml"></embed>
     *
     * Shared top, same parents.
     *
     * <embed src="images/ArrayMerge_ShareTopSamePar.svg" type="image/svg+xml"></embed>
     *
     * Shared top, different parents.
     *
     * <embed src="images/ArrayMerge_ShareTopDiffPar.svg" type="image/svg+xml"></embed>
     *
     * Shared top, all shared parents.
     *
     * <embed src="images/ArrayMerge_ShareTopSharePar.svg" type="image/svg+xml"></embed>
     *
     * Equal tops, merge parents and reduce top to [SingletonPredictionContext].
     *
     * <embed src="images/ArrayMerge_EqualTop.svg" type="image/svg+xml"></embed>
     */
    public fun mergeArrays(
      a: ArrayPredictionContext,
      b: ArrayPredictionContext,
      rootIsWildcard: Boolean,
      mergeCache: DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext>?,
    ): PredictionContext {
      if (mergeCache != null) {
        var previous = mergeCache[a, b]

        if (previous != null) {
          if (ParserATNSimulator.trace_atn_sim) {
            System.out.println("mergeArrays a=$a,b=$b -> previous")
          }

          return previous
        }

        previous = mergeCache[b, a]

        if (previous != null) {
          if (ParserATNSimulator.trace_atn_sim) {
            System.out.println("mergeArrays a=$a,b=$b -> previous")
          }

          return previous
        }
      }

      // Merge sorted payloads a + b => M
      var i = 0 // Walks a
      var j = 0 // Walks b
      var k = 0 // Walks target M array

      var mergedReturnStates = IntArray(a.returnStates.size + b.returnStates.size)
      var mergedParents = arrayOfNulls<PredictionContext>(a.returnStates.size + b.returnStates.size)

      // Walk and merge to yield mergedParents, mergedReturnStates
      while (i < a.returnStates.size && j < b.returnStates.size) {
        val aParent = a.parents[i]
        val bParent = b.parents[j]

        if (a.returnStates[i] == b.returnStates[j]) {
          // Same payload (stack tops are equal), must yield merged singleton
          val payload = a.returnStates[i]

          // $+$ = $
          val both = payload == EMPTY_RETURN_STATE && aParent == null && bParent == null

          // ax+ax -> ax
          @Suppress("LocalVariableName")
          val ax_ax = aParent != null && bParent != null && aParent == bParent

          if (both || ax_ax) {
            mergedParents[k] = aParent // choose left
            mergedReturnStates[k] = payload
          } else {
            // ax+ay -> a'[x,y]
            val mergedParent = merge(aParent, bParent, rootIsWildcard, mergeCache)
            mergedParents[k] = mergedParent
            mergedReturnStates[k] = payload
          }

          i++ // Hop over left one as usual
          j++ // But also skip one in right side since we merge
        } else if (a.returnStates[i] < b.returnStates[j]) {
          // copy a[i] to M
          mergedParents[k] = aParent
          mergedReturnStates[k] = a.returnStates[i]
          i++
        } else {
          // b > a, copy b[j] to M
          mergedParents[k] = bParent
          mergedReturnStates[k] = b.returnStates[j]
          j++
        }

        k++
      }

      // Copy over any payloads remaining in either array
      if (i < a.returnStates.size) {
        for (p in i..<a.returnStates.size) {
          mergedParents[k] = a.parents[p]
          mergedReturnStates[k] = a.returnStates[p]
          k++
        }
      } else {
        for (p in j..<b.returnStates.size) {
          mergedParents[k] = b.parents[p]
          mergedReturnStates[k] = b.returnStates[p]
          k++
        }
      }

      // Trim merged if we combined a few that had same stack tops
      // Write index < last position; trim
      if (k < mergedParents.size) {
        // For just one merged element, return singleton top
        if (k == 1) {
          @Suppress("LocalVariableName")
          val a_ = SingletonPredictionContext.create(mergedParents[0], mergedReturnStates[0])
          mergeCache?.put(a, b, a_)
          return a_
        }

        mergedParents = mergedParents.copyOf(k)
        mergedReturnStates = mergedReturnStates.copyOf(k)
      }

      @Suppress("LocalVariableName")
      val M = ArrayPredictionContext(mergedParents, mergedReturnStates)

      // If we created same array as a or b, return that instead
      // TODO: track whether this is possible above during merge sort for speed
      if (M == a) {
        mergeCache?.put(a, b, a)

        if (ParserATNSimulator.trace_atn_sim) {
          System.out.println("mergeArrays a=$a,b=$b -> a")
        }

        return a
      }

      if (M == b) {
        mergeCache?.put(a, b, b)

        if (ParserATNSimulator.trace_atn_sim) {
          System.out.println("mergeArrays a=$a,b=$b -> b")
        }

        return b
      }

      // Note(Edoardo): we should be sure there are no null elements inside this array
      @Suppress("UNCHECKED_CAST")
      combineCommonParents(mergedParents as Array<PredictionContext>)
      mergeCache?.put(a, b, M)

      if (ParserATNSimulator.trace_atn_sim) {
        System.out.println("mergeArrays a=$a,b=$b -> $M")
      }

      return M
    }

    /**
     * Make pass over all *M* [parents].
     *
     * Merge any `equals()` ones.
     */
    protected fun combineCommonParents(parents: Array<PredictionContext>) {
      val uniqueParents = HashMap<PredictionContext, PredictionContext>()

      for (p in parents.indices) {
        val parent = parents[p]

        // Don't replace
        if (!uniqueParents.containsKey(parent)) {
          uniqueParents[parent] = parent
        }
      }

      for (p in parents.indices) {
        parents[p] = uniqueParents[parents[p]]!!
      }
    }

    // TODO(Edoardo): needs AtomicFU 0.24.0
    // public fun toDOTString(context: PredictionContext?): String

    // From Sam
    public fun getCachedContext(
      context: PredictionContext,
      contextCache: PredictionContextCache,
      visited: IdentityHashMap<PredictionContext, PredictionContext>,
    ): PredictionContext {
      if (context.isEmpty) {
        return context
      }

      var existing = visited[context]

      if (existing != null) {
        return existing
      }

      existing = contextCache[context]

      if (existing != null) {
        visited[context] = existing
        return existing
      }

      var changed = false
      var parents = arrayOfNulls<PredictionContext>(context.size())

      for (i in parents.indices) {
        val parent = getCachedContext(context.getParent(i)!!, contextCache, visited)

        if (changed || parent !== context.getParent(i)) {
          if (!changed) {
            parents = arrayOfNulls(context.size())

            for (j in 0..<context.size()) {
              parents[j] = context.getParent(j)
            }

            changed = true
          }

          parents[i] = parent
        }
      }

      if (!changed) {
        contextCache.add(context)
        visited[context] = context
        return context
      }

      val updated = if (parents.isEmpty()) {
        EmptyPredictionContext.Instance
      } else if (parents.size == 1) {
        SingletonPredictionContext.create(parents[0], context.getReturnState(0))
      } else {
        val arrayPredictionContext = context as ArrayPredictionContext
        ArrayPredictionContext(parents, arrayPredictionContext.returnStates)
      }

      contextCache.add(updated)
      visited[updated] = updated
      visited[context] = updated

      return updated
    }

    // ter's recursive version of Sam's getAllNodes()
    public fun getAllContextNodes(context: PredictionContext): List<PredictionContext> {
      val nodes = ArrayList<PredictionContext>()
      val visited = IdentityHashMap<PredictionContext, PredictionContext>()
      getAllContextNodes_(context, nodes, visited)
      return nodes
    }

    @Suppress("FunctionName")
    public fun getAllContextNodes_(
      context: PredictionContext?,
      nodes: MutableList<PredictionContext>,
      visited: MutableMap<PredictionContext, PredictionContext>,
    ) {
      if (context == null || visited.containsKey(context)) {
        return
      }

      visited[context] = context
      nodes.add(context)

      for (i in 0..<context.size()) {
        getAllContextNodes_(context.getParent(i), nodes, visited)
      }
    }
  }

  /**
   * This means only the [EmptyPredictionContext.Instance]
   * (wildcard? not sure) context is in set.
   */
  public open val isEmpty: Boolean
    get() = this === EmptyPredictionContext.Instance

  public abstract fun size(): Int
  public abstract fun getParent(index: Int): PredictionContext?
  public abstract fun getReturnState(index: Int): Int
  public abstract override fun equals(other: Any?): Boolean

  public fun hasEmptyPath(): Boolean =
    // Since EMPTY_RETURN_STATE can only appear in the last position, we check last one
    getReturnState(size() - 1) == EMPTY_RETURN_STATE

  public open fun toString(recog: Recognizer<*, *>): String =
    toString()

  public open fun toStrings(recognizer: Recognizer<*, *>, currentState: Int): Array<String> =
    toStrings(recognizer, EmptyPredictionContext.Instance, currentState)

  // From Sam
  public open fun toStrings(recognizer: Recognizer<*, *>?, stop: PredictionContext, currentState: Int): Array<String> {
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
          index = (perm shr offset) and mask
          last = last and (index >= p.size() - 1)

          if (index >= p.size()) {
            perm++
            continue@outer
          }

          offset += bits
        }

        if (recognizer != null) {
          if (localBuffer.length > 1) {
            // First char is '[', if more than that this isn't the first rule
            localBuffer.append(" ")
          }

          val atn = recognizer.atn
          val s = atn.states[stateNumber]
          val ruleName = recognizer.ruleNames[s!!.ruleIndex]
          localBuffer.append(ruleName)
        } else if (p.getReturnState(index) != EMPTY_RETURN_STATE) {
          if (!p.isEmpty) {
            if (localBuffer.length > 1) {
              // First char is '[', if more than that this isn't the first rule
              localBuffer.append(" ")
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

  override fun hashCode(): Int =
    cachedHashCode
}
