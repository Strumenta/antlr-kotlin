package com.strumenta.antlrkotlin.runtime

import kotlin.native.concurrent.ObsoleteWorkersApi
import kotlin.native.concurrent.TransferMode
import kotlin.native.concurrent.Worker
import kotlin.test.Test
import kotlin.test.assertEquals


private class State {
  val monitor = Any()
  var counter = 0
}

private fun increment(state: State) {
  synchronized(state.monitor) {
    synchronized(state.monitor) {
      state.counter++
    }
  }
}

const val WORKERS = 64
const val INCREMENTS = 10_000

@OptIn(ObsoleteWorkersApi::class)
class SynchronizedThreadTest {
  @Test
  fun synchronizesThreads() {
    repeat(5) {
      val state = State()
      val workers = List(WORKERS) { Worker.start() }

      try {
        workers.map { worker ->
          worker.execute(TransferMode.SAFE, { state }) { sharedState ->
            repeat(INCREMENTS) {
              increment(sharedState)
            }
          }
        }.forEach { it.result }
      } finally {
        workers.forEach { it.requestTermination().result }
      }
      assertEquals(WORKERS * INCREMENTS, state.counter)
    }
  }
}
