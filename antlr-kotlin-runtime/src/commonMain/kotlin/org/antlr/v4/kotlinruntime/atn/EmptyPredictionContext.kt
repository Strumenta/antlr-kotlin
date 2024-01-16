// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import kotlin.jvm.JvmStatic

@Suppress("EqualsOrHashCode")
public class EmptyPredictionContext : SingletonPredictionContext(null, EMPTY_RETURN_STATE) {
  public companion object {
    /**
     * Represents `$` in local context prediction, which means wildcard.
     * `*+x = *`.
     */
    @JvmStatic
    public val Instance: EmptyPredictionContext = EmptyPredictionContext()
  }

  override val isEmpty: Boolean =
    true

  override fun size(): Int =
    1

  override fun getParent(index: Int): PredictionContext? =
    null

  override fun getReturnState(index: Int): Int {
    // Note: it was 'return returnState'
    // Changed because of https://youtrack.jetbrains.com/issue/KT-22161
    // Do not change back!
    return EMPTY_RETURN_STATE
  }

  override fun equals(other: Any?): Boolean =
    this === other

  override fun toString(): String =
    "$"
}
