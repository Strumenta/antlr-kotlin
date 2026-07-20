package com.strumenta.antlrkotlin.runtime

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.yield
import kotlin.concurrent.atomics.AtomicInt
import kotlin.concurrent.atomics.ExperimentalAtomicApi
import kotlin.concurrent.atomics.decrementAndFetch
import kotlin.concurrent.atomics.incrementAndFetch
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertSame

//this file lives here, because we need to make sure it behaves the same on all targets

private typealias ExpectedException = IllegalStateException
private typealias ExpectedThrowable = AssertionError

@OptIn(ExperimentalAtomicApi::class)
class SynchronizedTest {
  @Test
  fun returnsBlockResultAndInvokesItOnce() {
    var calls = 0

    val result = synchronized(Any()) {
      calls++
      42
    }

    assertEquals(42, result)
    assertEquals(1, calls)
  }

  @Test
  fun supportsNullResults() {
    assertNull(synchronized(Any()) { null })
  }

  @Test
  fun supportsNonLocalReturns() {
    val monitor = Any()

    assertEquals(42, nonLocalReturn(monitor))
    assertEquals(43, synchronized(monitor) { 43 })
  }

  @Test
  fun isReentrant() {
    val monitor = Any()

    assertEquals(42, synchronized(monitor) {
      synchronized(monitor) {
        42
      }
    })
  }

  @Test
  fun releasesNestedAcquisitionWhenItThrows() {
    val monitor = Any()

    assertEquals(42, synchronized(monitor) {
      assertFailsWith<ExpectedException> {
        synchronized(monitor) {
          throw ExpectedException()
        }
      }

      synchronized(monitor) { 42 }
    })
  }

  @Test
  fun propagatesTheSameExceptionAndReleasesTheMonitor() {
    val monitor = Any()
    val expected = ExpectedException()

    val actual = assertFailsWith<ExpectedException> {
      synchronized(monitor) {
        throw expected
      }
    }

    assertSame(expected, actual)
    assertEquals(42, synchronized(monitor) { 42 })
  }

  @Test
  fun propagatesArbitraryThrowablesAndReleasesTheMonitor() {
    val monitor = Any()
    val expected = ExpectedThrowable("expected")

    val actual = assertFailsWith<ExpectedThrowable> {
      synchronized(monitor) {
        throw expected
      }
    }

    assertSame(expected, actual)
    assertEquals(42, synchronized(monitor) { 42 })
  }

  @Test
  fun propagatesCancellationAndReleasesTheMonitor() {
    val monitor = Any()
    val expected = CancellationException("expected")

    val actual = assertFailsWith<CancellationException> {
      synchronized(monitor) {
        throw expected
      }
    }

    assertSame(expected, actual)
    assertEquals(42, synchronized(monitor) { 42 })
  }

  @Test
  fun supportsDeepReentrancy() {
    val monitor = Any()
    var calls = 0

    fun enter(depth: Int) {
      synchronized(monitor) {
        calls++
        if (depth > 0) {
          enter(depth - 1)
        }
      }
    }

    enter(REENTRANCY_DEPTH)
    assertEquals(REENTRANCY_DEPTH + 1, calls)
    assertEquals(42, synchronized(monitor) { 42 })
  }

  @Test
  fun repeatedlyAcquiresReleasedAndTransientMonitors() {
    val reusedMonitor = Any()
    var calls = 0

    repeat(MONITOR_CHURN) {
      synchronized(reusedMonitor) { calls++ }
      synchronized(Any()) { calls++ }
    }

    assertEquals(MONITOR_CHURN * 2, calls)
  }

  @Test
  fun doesNotInvokeMonitorEqualsOrHashCode() {
    val monitor = HostileMonitor()
    val otherMonitor = HostileMonitor()

    repeat(100) {
      synchronized(monitor) {
        synchronized(monitor) { }
        synchronized(otherMonitor) { }
      }
    }
  }

  @Test
  fun serializesContendingCoroutines() = runTest {
    val state = State()
    val inside = AtomicInt(0)

    coroutineScope {
      repeat(WORKERS) {
        launch(Dispatchers.Default) {
          repeat(INCREMENTS) { iteration ->
            if (iteration % YIELD_EVERY == 0) {
              yield()
            }

            synchronized(state.monitor) {
              assertEquals(1, inside.incrementAndFetch())
              try {
                synchronized(state.monitor) {
                  state.counter++
                }
              } finally {
                assertEquals(0, inside.decrementAndFetch())
              }
            }
          }
        }
      }
    }

    assertEquals(WORKERS * INCREMENTS, state.counter)
  }

  @Test
  fun releasesTheMonitorAfterExceptionsUnderContention() = runTest {
    val state = State()

    coroutineScope {
      repeat(WORKERS) {
        launch(Dispatchers.Default) {
          repeat(INCREMENTS) { iteration ->
            try {
              synchronized(state.monitor) {
                if (iteration % FAIL_EVERY == 0) {
                  throw ExpectedException()
                }

                state.counter++
              }
            } catch (_: ExpectedException) {
              // Expected.
            }
          }
        }
      }
    }

    val failuresPerWorker = (INCREMENTS + FAIL_EVERY - 1) / FAIL_EVERY
    assertEquals(WORKERS * (INCREMENTS - failuresPerWorker), state.counter)
  }

  @Test
  fun synchronizesMultipleMonitorIdentitiesIndependently() = runTest {
    val states = List(MONITORS) { State() }

    coroutineScope {
      repeat(WORKERS) { worker ->
        launch(Dispatchers.Default) {
          val state = states[worker % states.size]

          repeat(INCREMENTS) {
            synchronized(state.monitor) {
              state.counter++
            }
          }
        }
      }
    }

    val workersPerMonitor = WORKERS / MONITORS
    states.forEach { state ->
      assertEquals(workersPerMonitor * INCREMENTS, state.counter)
    }
  }

  private fun nonLocalReturn(monitor: Any): Int {
    synchronized(monitor) {
      return 42
    }
  }

  private class State {
    val monitor = Any()
    var counter = 0
  }

  private class HostileMonitor {
    override fun equals(other: Any?): Boolean = error("Monitor equality must not be used")

    override fun hashCode(): Int = error("Monitor hash code must not be used")
  }

  private companion object {
    const val WORKERS = 8
    const val MONITORS = 4
    const val INCREMENTS = 2_000
    const val YIELD_EVERY = 8
    const val FAIL_EVERY = 17
    const val REENTRANCY_DEPTH = 100
    const val MONITOR_CHURN = 2_000
  }
}
