// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import kotlinx.atomicfu.locks.ReentrantLock
import kotlinx.atomicfu.locks.reentrantLock
import kotlinx.atomicfu.locks.withLock
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

internal class Monitor(
  private val instance: Any,
) {
  private var refCount: Int = 0
  private val lock: ReentrantLock = reentrantLock()

  companion object {
    private val registryLock = reentrantLock()
    private val registry = ArrayList<Monitor>()

    /**
     * Acquires a [Monitor] for the given [instance]. If one exists (i.e. if it is held by another thread), this call blocks until the monitor is released.
     * Otherwise, it creates a new monitor and acquires it.
     */
    fun acquire(instance: Any): Monitor = registryLock.withLock {
      // Linear search keeps things simple. Could be optimized using a custom TreeSet or similar to reduce complexity to O(log(n))
      // but how critical is this really in the hot path and how many workers will realistically cause contention?!
      // This added complexity (since we cannot use hashCode or equals, but we'll need to compare identity)
      // will be worth it only if we go into the thousands of concurrent accesses in a performance-critical hot path
      (registry.firstOrNull { it.instance === instance }
      // create if not found
        ?: Monitor(instance).also(registry::add)
        ).apply { refCount++ } //increment ref count in any case
    }.apply { lock.lock() /*lock OUTSIDE registry lock to avoid deadlocks*/ }

  }

  //this lives below companion, so the source code flows nicely: first acquire, below release
  /**
   * Releases the held lock and cleans up the registry if necessary, freeing
   */
  fun release() {
    // FIRST we release the held lock
    lock.unlock()
    // only THEN we decrement the ref count and clean up if necessary, INSIDE the registry lock
    registryLock.withLock {
      // Fail hard and notify
      checkWithReport(refCount > 0) { BODY_RELEASE }

      if (--refCount == 0) free()
    }
  }

  //Yes, this is noisy, and yes, this changes nothing functionally, but all of this is sensitive code and the interplay
  //between functions is delicate, so being explicit is worth it for clarity: No hidden behaviour; every minute detail
  //of every nuance of every step is clearly visible here; self-contained in a single file across 65 LoC including
  //comments
  @Suppress("NOTHING_TO_INLINE")
  private inline fun free() {
    val index = registry.indexOfFirst { it === this }
    // Fail hard and notify
    checkWithReport(index >= 0) { BODY_FREE } //fail hard!
    registry.removeAt(index)
  }
}


@OptIn(ExperimentalContracts::class)
internal actual inline fun <R> synchronized(lock: Any, block: () -> R): R {
  contract {
    callsInPlace(block, InvocationKind.EXACTLY_ONCE)
  }
  val monitor = Monitor.acquire(lock)
  try {
    return block()
  } finally {
    monitor.release()
  }
}

//The easier it is to report, the more likely people will do it

@Suppress("NOTHING_TO_INLINE")
private inline fun checkWithReport(value: Boolean, body: () -> String): Unit = check(value) {
  "Please report this bug at https://github.com/Strumenta/antlr-kotlin/issues/new?title=$ISSUE_TITLE&body=${body()}"
}

private const val ISSUE_TITLE = "Native%20synchronized%20inconsistent%20state"
private const val BODY_FREE = "Freeing%20a%20monitor%20produces%20an%20inconsistent%20state." +
  "%0A%0ASteps%20to%20reproduce%3A%0A%60%60%60kotlin%0A%2F%2Fyour%20reproducer%20here%0A%60%60%60%0A%0A" +
  "%40JesusMcCloud%20PTAL.%0A" //this last newline is so that IDEA will not add the next line to the clickable link
private const val BODY_RELEASE = "Releasing%20a%20monitor%20produces%20an%20inconsistent%20state." +
  "%0A%0ASteps%20to%20reproduce%3A%0A%60%60%60kotlin%0A%2F%2Fyour%20reproducer%20here%0A%60%60%60%0A%0A" +
  "%40JesusMcCloud%20PTAL.%0A" //this last newline is so that IDEA will not add the next line to the clickable link
