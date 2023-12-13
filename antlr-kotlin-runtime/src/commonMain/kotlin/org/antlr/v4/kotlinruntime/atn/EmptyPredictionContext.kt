/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

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
