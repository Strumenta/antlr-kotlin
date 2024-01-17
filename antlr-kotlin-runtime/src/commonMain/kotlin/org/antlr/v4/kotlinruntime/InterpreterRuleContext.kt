// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

/**
 * This class extends [ParserRuleContext] by allowing the value of
 * [ruleIndex] to be explicitly set for the context.
 *
 * [ParserRuleContext] does not include field storage for the rule index
 * since the context classes created by the code generator override the
 * [ruleIndex] method to return the correct value for that context.
 *
 * Since the parser interpreter does not use the context classes generated for a
 * parser, this class (with slightly more memory overhead per node) is used to
 * provide equivalent functionality.
 */
public class InterpreterRuleContext : ParserRuleContext {
  override val ruleIndex: Int

  public constructor() {
    ruleIndex = -1
  }

  /**
   * Constructs a new [InterpreterRuleContext] with the specified
   * parent, invoking state, and rule index.
   *
   * @param parent The parent context
   * @param invokingStateNumber The invoking state number
   * @param ruleIndex The rule index for the current context
   */
  public constructor(
    parent: ParserRuleContext?,
    invokingStateNumber: Int,
    ruleIndex: Int,
  ) : super(parent, invokingStateNumber) {
    this.ruleIndex = ruleIndex
  }
}
