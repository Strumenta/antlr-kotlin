/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

/**
 * This class extends [ParserRuleContext] by allowing the value of
 * [.getRuleIndex] to be explicitly set for the context.
 *
 *
 *
 * [ParserRuleContext] does not include field storage for the rule index
 * since the context classes created by the code generator override the
 * [.getRuleIndex] method to return the correct value for that context.
 * Since the parser interpreter does not use the context classes generated for a
 * parser, this class (with slightly more memory overhead per node) is used to
 * provide equivalent functionality.
 */
class InterpreterRuleContext : ParserRuleContext {
    /** This is the backing field for [.getRuleIndex].  */
    override var ruleIndex = -1
        set(value: Int) {
            super.ruleIndex = value
        }

    constructor() {}

    /**
     * Constructs a new [InterpreterRuleContext] with the specified
     * parent, invoking state, and rule index.
     *
     * @param parent The parent context.
     * @param invokingStateNumber The invoking state number.
     * @param ruleIndex The rule index for the current context.
     */
    constructor(parent: ParserRuleContext,
                invokingStateNumber: Int,
                ruleIndex: Int) : super(parent, invokingStateNumber) {
        this.ruleIndex = ruleIndex
    }
}
