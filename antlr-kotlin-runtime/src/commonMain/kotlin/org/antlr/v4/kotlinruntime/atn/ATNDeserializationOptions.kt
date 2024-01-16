// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * @author Sam Harwell
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class ATNDeserializationOptions {
  public companion object {
    public val defaultOptions: ATNDeserializationOptions = ATNDeserializationOptions()

    init {
      defaultOptions.makeReadOnly()
    }
  }

  private var verifyATN = false
  private var generateRuleBypassTransitions = false

  public var isReadOnly: Boolean = false
    private set

  public var isVerifyATN: Boolean
    get() = verifyATN
    set(verifyATN) {
      throwIfReadOnly()
      this.verifyATN = verifyATN
    }

  public var isGenerateRuleBypassTransitions: Boolean
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
    isReadOnly = true
  }

  protected open fun throwIfReadOnly() {
    if (isReadOnly) {
      throw IllegalStateException("The object is read only.")
    }
  }
}
