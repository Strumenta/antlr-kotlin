// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.antlrkotlin.runtime.assert

@Suppress("EqualsOrHashCode")
public class ArrayPredictionContext(
  /**
   * Parent can be `null` only if full ctx mode, and we make an array
   * from `EMPTY` and non-empty. We merge `EMPTY` by using `null` parent
   * and `returnState ==` [PredictionContext.EMPTY_RETURN_STATE].
   */
  public val parents: Array<PredictionContext?>,

  /**
   * Sorted for merge, no duplicates.
   *
   * If present, [PredictionContext.EMPTY_RETURN_STATE] is always last.
   */
  public val returnStates: IntArray,
) : PredictionContext(calculateHashCode(parents, returnStates)) {
  // Since EMPTY_RETURN_STATE can only appear in the last position,
  // we don't need to verify that size == 1
  override val isEmpty: Boolean
    get() = returnStates[0] == EMPTY_RETURN_STATE

  public constructor(a: SingletonPredictionContext) : this(arrayOf(a.parent), intArrayOf(a.returnState))

  init {
    assert(parents.isNotEmpty())
    assert(returnStates.isNotEmpty())
  }

  override fun size(): Int =
    returnStates.size

  override fun getParent(index: Int): PredictionContext? =
    parents[index]

  override fun getReturnState(index: Int): Int =
    returnStates[index]

  override fun equals(other: Any?): Boolean {
    if (this === other) {
      return true
    }

    if (other !is ArrayPredictionContext) {
      return false
    }

    if (hashCode() != other.hashCode()) {
      // Can't be same if hash is different
      return false
    }

    return returnStates.contentEquals(other.returnStates) && parents.contentEquals(other.parents)
  }

  override fun toString(): String {
    if (isEmpty) {
      return "[]"
    }

    val buf = StringBuilder()
    buf.append("[")

    for (i in returnStates.indices) {
      if (i > 0) {
        buf.append(", ")
      }

      if (returnStates[i] == EMPTY_RETURN_STATE) {
        buf.append("$")
        continue
      }

      buf.append(returnStates[i])

      if (parents[i] != null) {
        buf.append(" ")
        buf.append(parents[i].toString())
      } else {
        buf.append("null")
      }
    }

    buf.append("]")
    return buf.toString()
  }
}
