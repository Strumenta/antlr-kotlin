/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/**
 * Used to cache [PredictionContext] objects.
 *
 * It's used for the shared context cash associated with contexts in DFA states.
 *
 * This cache can be used for both lexers and parsers.
 */
public open class PredictionContextCache {
  protected val cache: MutableMap<PredictionContext, PredictionContext> = HashMap()

  /**
   * Add a context to the cache and return it.
   *
   * If the context already exists, return that one instead and
   * do not add a new context to the cache.
   *
   * Protect shared cache from unsafe thread access.
   */
  public open fun add(ctx: PredictionContext): PredictionContext {
    if (ctx === EmptyPredictionContext.Instance) {
      return EmptyPredictionContext.Instance
    }

    val existing = cache[ctx]

    if (existing != null) {
      return existing
    }

    cache[ctx] = ctx
    return ctx
  }

  public open operator fun get(ctx: PredictionContext): PredictionContext? =
    cache[ctx]

  public open fun size(): Int =
    cache.size
}
