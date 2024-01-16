// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.antlrkotlin.runtime.IdentityHashMap
import com.strumenta.antlrkotlin.runtime.synchronized
import org.antlr.v4.kotlinruntime.dfa.DFA
import org.antlr.v4.kotlinruntime.dfa.DFAState

public abstract class ATNSimulator(
  public val atn: ATN,

  /**
   * The context cache maps all [PredictionContext] objects that are `equals()`
   * to a single cached copy. This cache is shared across all contexts
   * in all [ATNConfig]s in all [DFA] states. We rebuild each [ATNConfigSet]
   * to use only cached nodes/graphs in `addDFAState()`. We don't want to
   * fill this during `closure()` since there are lots of contexts that
   * pop up but are not used ever again. It also greatly slows down `closure()`.
   *
   * This cache makes a huge difference in memory and a little bit in speed.
   * For the Java grammar on java.*, it dropped the memory requirements
   * at the end from 25M to 16M. We don't store any of the full context
   * graphs in the DFA because they are limited to local context only,
   * but apparently there's a lot of repetition there as well. We optimize
   * the config contexts before storing the config set in the DFA states
   * by literally rebuilding them with cached sub-graphs only.
   *
   * I tried a cache for use during closure operations, that was
   * whacked after each `adaptivePredict()`. It cost a little bit
   * more time I think and doesn't save on the overall footprint,
   * so it's not worth the complexity.
   */
  public val sharedContextCache: PredictionContextCache?,
) {
  public companion object {
    /**
     * Must distinguish between missing edge and edge we know leads nowhere.
     */
    public val ERROR: DFAState = DFAState(ATNConfigSet()).also {
      it.stateNumber = Int.MAX_VALUE
    }
  }

  public abstract fun reset()

  /**
   * Clear the DFA cache used by the current instance. Since the DFA cache may
   * be shared by multiple ATN simulators, this method may affect the
   * performance (but not accuracy) of other parsers which are being used
   * concurrently.
   *
   * @throws UnsupportedOperationException If the current instance does not
   *   support clearing the DFA
   *
   * @since 4.3
   */
  public open fun clearDFA(): Unit =
    throw UnsupportedOperationException("This ATN simulator does not support clearing the DFA.")

  public open fun getCachedContext(context: PredictionContext): PredictionContext {
    if (sharedContextCache == null) {
      return context
    }

    synchronized(sharedContextCache) {
      val visited = IdentityHashMap<PredictionContext, PredictionContext>()
      return PredictionContext.getCachedContext(
        context,
        sharedContextCache,
        visited,
      )
    }
  }
}
