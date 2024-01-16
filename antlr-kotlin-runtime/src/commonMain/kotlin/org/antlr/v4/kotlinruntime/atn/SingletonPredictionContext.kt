// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.antlrkotlin.runtime.assert

@Suppress("EqualsOrHashCode")
public open class SingletonPredictionContext internal constructor(
  public val parent: PredictionContext?,
  public val returnState: Int,
) : PredictionContext(if (parent != null) calculateHashCode(parent, returnState) else calculateEmptyHashCode()) {
  public companion object {
    public fun create(parent: PredictionContext?, returnState: Int): SingletonPredictionContext =
      if (returnState == EMPTY_RETURN_STATE && parent == null) {
        // Someone can pass in the bits of an array ctx that mean $
        EmptyPredictionContext.Instance
      } else {
        SingletonPredictionContext(parent, returnState)
      }
  }

  init {
    assert(returnState != ATNState.INVALID_STATE_NUMBER)
  }

  override fun size(): Int =
    1

  override fun getParent(index: Int): PredictionContext? {
    assert(index == 0)
    return parent
  }

  override fun getReturnState(index: Int): Int {
    assert(index == 0)
    return returnState
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) {
      return true
    }

    if (other !is SingletonPredictionContext) {
      return false
    }

    if (hashCode() != other.hashCode()) {
      // Can't be same if hash is different
      return false
    }

    return returnState == other.returnState && (parent != null && parent == other.parent)
  }

  override fun toString(): String {
    val up = parent?.toString() ?: ""
    return if (up.isEmpty()) {
      if (returnState == EMPTY_RETURN_STATE) {
        "$"
      } else {
        returnState.toString()
      }
    } else {
      "$returnState $up"
    }
  }
}
