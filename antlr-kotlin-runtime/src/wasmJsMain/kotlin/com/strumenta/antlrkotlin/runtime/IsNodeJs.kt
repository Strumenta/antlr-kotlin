package com.strumenta.antlrkotlin.runtime

/**
 * Returns whether we are running on Node.js, or not.
 */
internal fun isNodeJs(): Boolean =
  js(
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
