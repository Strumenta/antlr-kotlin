package com.strumenta.antlrkotlin.runtime

@Suppress("unused")
internal actual val isNode: Boolean = js(
  """
  (typeof process !== 'undefined'
      && process.versions != null
      && process.versions.node != null) ||
  (typeof window !== 'undefined'
      && typeof window.process !== 'undefined'
      && window.process.versions != null
      && window.process.versions.node != null)
  """
)
