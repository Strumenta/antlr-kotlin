// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * To be used internally instead of a `null` assignment to a [CharStream] property.
 *
 * @author Edoardo Luppi
 */
internal object DummyCharStream : CharStream {
  override val sourceName: String
    get() = throw UnsupportedOperationException()

  override fun getText(interval: Interval): String =
    throw UnsupportedOperationException()

  override fun consume() =
    throw UnsupportedOperationException()

  override fun LA(i: Int): Int =
    throw UnsupportedOperationException()

  override fun mark(): Int =
    throw UnsupportedOperationException()

  override fun release(marker: Int): Unit =
    throw UnsupportedOperationException()

  override fun index(): Int =
    throw UnsupportedOperationException()

  override fun seek(index: Int) {
    // Noop
  }

  override fun size(): Int =
    0
}
