// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import org.antlr.v4.kotlinruntime.tree.RuleNode
import org.antlr.v4.kotlinruntime.tree.Trees

/**
 * A rule context is a record of a single rule invocation.
 *
 * We form a stack of these context objects using the parent
 * pointer. A parent pointer of `null` indicates that the current
 * context is the bottom of the stack. The ParserRuleContext subclass
 * as a children list so that we can turn this data structure into a
 * tree.
 *
 * The root node always has a `null` pointer and [invokingState] of `-1`.
 *
 * Upon entry to parsing, the first invoked rule function creates a
 * context object (a subclass specialized for that rule such as
 * `SContext`) and makes it the root of a parse tree, recorded by field
 * `Parser.context`.
 *
 * ```
 * @Throws(RecognitionException::class)
 * public fun s(): SContext {
 *   val _localctx = SContext(context, state)  // create new node
 *   enterRule(_localctx, 0, RULE_s)           // push it
 *   ...
 *   exitRule()                                // pop back to _localctx
 *   return _localctx
 * }
 * ```
 *
 * A subsequent rule invocation of `r` from the start rule `s` pushes a
 * new context object for `r` whose parent points at `s` and use invoking
 * state is the state with `r` emanating as edge label.
 *
 * The [invokingState] fields from a context object to the root
 * together form a stack of rule indication states where the root
 * (bottom of the stack) has a `-1` sentinel value. If we invoke start
 * symbol `s` then call `r1`, which calls `r2`, they would look like this:
 *
 * ```
 * SContext[-1]   <- root node (bottom of the stack)
 * R1Context[p]   <- p in rule s called r1
 * R2Context[q]   <- q in rule r1 called r2
 * ```
 *
 * So the top of the stack, `context`, represents a call to the current
 * rule, and it holds the return address from another rule that invoke
 * to this rule. To invoke a rule, we must always have a current context.
 *
 * The parent contexts are useful for computing lookahead sets and
 * getting error information.
 *
 * These objects are used during parsing and prediction.
 * For the special case of parsers, we use the subclass [ParserRuleContext].
 *
 * @see ParserRuleContext
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class RuleContext : RuleNode {
  /**
   * What context invoked this rule?
   */
  public var parent: RuleContext? = null

  /**
   * What state invoked the rule associated with this context?
   * The "return address" is the `followState` of `invokingState`.
   *
   * If [parent] is `null`, this should be `-1` as this context
   * object represents the start rule.
   */
  public var invokingState: Int = -1

  /**
   * A context is empty if there is no invoking state,
   * meaning nobody called current context.
   */
  public val isEmpty: Boolean
    get() = invokingState == -1

  override val sourceInterval: Interval =
    Interval.INVALID

  override val ruleContext: RuleContext
    get() = this

  override val payload: RuleContext
    get() = this

  /**
   * Return the combined text of all child nodes.
   *
   * This method only considers tokens which have been added to the parse tree.
   *
   * Since tokens on hidden channels (e.g. whitespace or comments) are not
   * added to the parse trees, they will not appear in the output of this
   * method.
   */
  override val text: String
    get() {
      if (childCount == 0) {
        return ""
      }

      val builder = StringBuilder()

      for (i in 0..<childCount) {
        builder.append(getChild(i)!!.text)
      }

      return builder.toString()
    }

  /**
   * The default value `-1` represents an invalid rule index.
   *
   * Each subclass may override this field to provide a valid index.
   */
  public open val ruleIndex: Int = -1

  /**
   * For rule associated with this parse tree internal node, return
   * the outer alternative number used to match the input.
   *
   * Default implementation does not compute nor store this alt num.
   *
   * Create a subclass of [ParserRuleContext] with backing field and
   * set option `contextSuperClass`.
   *
   * @since 4.5.3
   */
  public open var altNumber: Int
    get() = ATN.INVALID_ALT_NUMBER
    // Default implementation does nothing to avoid backing field
    // overhead for trees that don't need it
    set(@Suppress("UNUSED_PARAMETER") value) {}

  override val childCount: Int = 0

  public constructor() : super()
  public constructor(parent: RuleContext?, invokingState: Int) : super() {
    this.parent = parent
    this.invokingState = invokingState
  }

  override fun readParent(): RuleContext? =
    parent

  override fun assignParent(value: RuleContext?) {
    parent = value
  }

  public fun depth(): Int {
    var n = 0
    var p: RuleContext? = this

    while (p != null) {
      p = p.parent
      n++
    }

    return n
  }

  override fun getChild(i: Int): ParseTree? =
    null

  override fun <T> accept(visitor: ParseTreeVisitor<out T>): T? =
    visitor.visitChildren(this)

  /**
   * Print out a whole tree, not just a node, in LISP format (`root child1..childN`).
   *
   * Print just a node if this is a leaf.
   *
   * We have to know the recognizer, so we can get rule names.
   */
  override fun toStringTree(parser: Parser): String =
    Trees.toStringTree(this, parser)

  /**
   * Print out a whole tree, not just a node, in LISP format (`root child1..childN`).
   *
   * Print just a node if this is a leaf.
   */
  public fun toStringTree(ruleNames: List<String>?): String =
    Trees.toStringTree(this, ruleNames)

  override fun toStringTree(): String =
    toStringTree(ruleNames = null)

  override fun toString(): String =
    toString(ruleNames = null, stop = null)

  // recog null unless ParserRuleContext, in which case we use subclass toString(...)
  public fun toString(recog: Recognizer<*, *>?, stop: RuleContext = ParserRuleContext.EMPTY): String {
    val ruleNames = recog?.ruleNames
    val ruleNamesList = if (ruleNames != null) {
      listOf(*ruleNames)
    } else {
      null
    }

    return toString(ruleNamesList, stop)
  }

  public fun toString(ruleNames: List<String>?, stop: RuleContext? = null): String {
    val buf = StringBuilder()
    var p: RuleContext? = this
    buf.append("[")

    while (p != null && p !== stop) {
      if (ruleNames == null) {
        if (!p.isEmpty) {
          buf.append(p.invokingState)
        }
      } else {
        val ruleIndex = p.ruleIndex
        val ruleName = if (ruleIndex >= 0 && ruleIndex < ruleNames.size) {
          ruleNames[ruleIndex]
        } else {
          ruleIndex.toString()
        }

        buf.append(ruleName)
      }

      if (p.parent != null && (ruleNames != null || !p.parent!!.isEmpty)) {
        buf.append(" ")
      }

      p = p.parent
    }

    buf.append("]")
    return buf.toString()
  }
}
