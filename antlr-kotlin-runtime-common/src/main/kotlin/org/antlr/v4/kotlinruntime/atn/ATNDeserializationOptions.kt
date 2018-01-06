/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/**
 *
 * @author Sam Harwell
 */
class ATNDeserializationOptions {

    var isReadOnly: Boolean = false
        private set
    private var verifyATN: Boolean = false
    private var generateRuleBypassTransitions: Boolean = false

    var isVerifyATN: Boolean
        get() = verifyATN
        set(verifyATN) {
            throwIfReadOnly()
            this.verifyATN = verifyATN
        }

    var isGenerateRuleBypassTransitions: Boolean
        get() = generateRuleBypassTransitions
        set(generateRuleBypassTransitions) {
            throwIfReadOnly()
            this.generateRuleBypassTransitions = generateRuleBypassTransitions
        }

    constructor() {
        this.verifyATN = true
        this.generateRuleBypassTransitions = false
    }

    constructor(options: ATNDeserializationOptions) {
        this.verifyATN = options.verifyATN
        this.generateRuleBypassTransitions = options.generateRuleBypassTransitions
    }

    fun makeReadOnly() {
        isReadOnly = true
    }

    protected fun throwIfReadOnly() {
        if (isReadOnly) {
            throw IllegalStateException("The object is read only.")
        }
    }

    companion object {
        val defaultOptions: ATNDeserializationOptions

        init {
            defaultOptions = ATNDeserializationOptions()
            defaultOptions.makeReadOnly()
        }
    }
}
