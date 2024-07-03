// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.atn

import kotlin.jvm.JvmField

/**
 * @author Sam Harwell
 */
public open class ATNDeserializationOptions {
  public companion object {
    @JvmField
    public val defaultOptions: ATNDeserializationOptions = ATNDeserializationOptions().also {
      it.makeReadOnly()
    }
  }

  private var readOnly = false
  private var verifyATN = false
  private var generateRuleBypassTransitions = false

  @Suppress("MemberVisibilityCanBePrivate")
  public open val isReadOnly: Boolean
    get() = readOnly

  public open var isVerifyATN: Boolean
    get() = verifyATN
    set(value) {
      throwIfReadOnly()
      verifyATN = value
    }

  public open var isGenerateRuleBypassTransitions: Boolean
    get() = generateRuleBypassTransitions
    set(value) {
      throwIfReadOnly()
      generateRuleBypassTransitions = value
    }

  public constructor() {
    verifyATN = true
    generateRuleBypassTransitions = false
  }

  public constructor(options: ATNDeserializationOptions) {
    verifyATN = options.verifyATN
    generateRuleBypassTransitions = options.generateRuleBypassTransitions
  }

  public open fun makeReadOnly() {
    readOnly = true
  }

  protected open fun throwIfReadOnly() {
    if (readOnly) {
      throw IllegalStateException("The object is read only.")
    }
  }
}
