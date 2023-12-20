package com.strumenta.kotlinmultiplatform

/**
 * Returns whether we are running in Node.js or not.
 *
 * @author Edoardo Luppi
 */
@Suppress("unused")
internal val isNode: Boolean = js(
  """
  (typeof process !== 'undefined'
      && process.versions != null
      && process.versions.node != null) ||
  (typeof window !== 'undefined'
      && typeof window.process !== 'undefined'
      && window.process.versions != null
      && window.process.versions.node != null)
  """
).unsafeCast<Boolean>()
