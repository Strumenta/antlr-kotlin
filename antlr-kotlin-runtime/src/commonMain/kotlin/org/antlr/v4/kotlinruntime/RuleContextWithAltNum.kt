// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.atn.ATN

/**
 * A handy class for use with
 *
 * ```
 * options {
 *   contextSuperClass = org.antlr.v4.runtime.RuleContextWithAltNum;
 * }
 * ```
 *
 * that provides a backing field/impl for the outer alternative number
 * matched for an internal parse tree node.
 *
 * I'm only putting into Java runtime as I'm certain I'm the only one that
 * will really every use this.
 */
public class RuleContextWithAltNum : ParserRuleContext {
  override var altNumber: Int = 0

  public constructor() {
    altNumber = ATN.INVALID_ALT_NUMBER
  }

  public constructor(parent: ParserRuleContext, invokingStateNumber: Int) : super(parent, invokingStateNumber)
}
