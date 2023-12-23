/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

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
