// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.ast.Position
import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.tree.ErrorNode
import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import kotlin.jvm.JvmStatic
import kotlin.reflect.KClass

/**
 * A rule invocation record for parsing.
 *
 * Contains all the information about the current rule not stored in the
 * RuleContext. It handles parse-tree children list, any ATN state
 * tracing, and the default values available for rule invocations:
 * start, stop, rule index, current alt number.
 *
 * Subclasses made for each rule and grammar track the parameters,
 * return values, locals, and labels specific to that rule. These
 * are the objects that are returned from rules.
 *
 * Note text is not an actual field of a rule return value; it is computed
 * from [start] and [stop] using the input stream's `toString()` method.
 * I could add a ctor to this so that we can pass in and store the input
 * stream, but I'm not sure if we want to do that. It would seem to be undefined
 * to get the [text] property anyway if the rule matches tokens from multiple
 * input streams.
 *
 * I do not use getters for fields of objects that are used simply to
 * group values such as this aggregate. The getters/setters are there to
 * satisfy the superclass interface.
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class ParserRuleContext : RuleContext {
  public companion object {
    @JvmStatic
    public val EMPTY: ParserRuleContext = ParserRuleContext()
  }

  /**
   * If we are debugging or building a parse tree for a visitor,
   * we need to track all the tokens and rule invocations associated
   * with this rule's context. This is empty for parsing w/o tree constr.
   * operation because we don't have the need to track the details about
   * how we parse this rule.
   */
  public var children: MutableList<ParseTree>? = null

  // This does not exist in the Java runtime
  public val position: Position?
    get() = if (start != null && stop?.endPoint() != null) {
      Position(start!!.startPoint(), stop!!.endPoint()!!)
    } else {
      null
    }

  /**
   * The initial token in this context.
   *
   * Note that the range from [start] to [stop] is inclusive, so for rules
   * that do not consume anything (for example, zero length or error productions)
   * this token may exceed stop.
   */
  public var start: Token? = null

  /**
   * The final token in this context.
   *
   * Note that the range from [start] to [stop] is inclusive, so for rules
   * that do not consume anything (for example, zero length or error productions)
   * this token may precede start.
   */
  public var stop: Token? = null

  /**
   * The exception that forced this rule to return.
   *
   * If the rule successfully completed, this is `null`.
   */
  public var exception: RecognitionException? = null

  override val childCount: Int
    get() = children?.size ?: 0

  override val sourceInterval: Interval
    get() {
      val tempStart = start ?: return Interval.INVALID
      val tempStop = stop

      return if (tempStop == null || tempStop.tokenIndex < tempStart.tokenIndex) {
        Interval.of(tempStart.tokenIndex, tempStart.tokenIndex - 1)
      } else {
        Interval.of(tempStart.tokenIndex, tempStop.tokenIndex)
      }
    }

  public constructor()
  public constructor(parent: ParserRuleContext?, invokingStateNumber: Int) : super(parent, invokingStateNumber)

  override fun readParent(): ParserRuleContext? =
    super.readParent() as ParserRuleContext?

  /**
   * Copy a context (I'm deliberately not using copy constructor) to avoid
   * confusion with creating node with parent. Does not copy children
   * (except error leaves).
   *
   * This is used in the generated parser code to flip a generic `XContext`
   * node for rule `X` to a `YContext` for alt label `Y`. In that sense, it is
   * not really a generic copy function.
   *
   * If we do an error `sync()` at start of a rule, we might add error nodes
   * to the generic `XContext` so this function must copy those nodes to
   * the `YContext` as well else they are lost!
   */
  public open fun copyFrom(ctx: ParserRuleContext) {
    parent = ctx.parent
    invokingState = ctx.invokingState

    start = ctx.start
    stop = ctx.stop

    // Copy any error nodes to alt label node
    val otherChildren = ctx.children

    if (otherChildren != null) {
      children = ArrayList()

      // Reset parent pointer for any error nodes
      for (child in otherChildren) {
        if (child is ErrorNode) {
          addChild(child)
        }
      }
    }
  }

  // Double dispatch methods for listeners
  public open fun enterRule(listener: ParseTreeListener) {}
  public open fun exitRule(listener: ParseTreeListener) {}

  /**
   * Add a parse tree node to this as a child.
   *
   * Works for internal and leaf nodes.
   *
   * Does not set parent link. Other add methods must do that.
   *
   * Other [addChild] methods call this.
   *
   * We cannot set the parent pointer of the incoming node
   * because the existing interfaces do not have a [assignParent]
   * method and I don't want to break backward compatibility for this.
   *
   * @since 4.7
   */
  public fun <T : ParseTree> addAnyChild(t: T): T {
    var childrenTemp = children

    if (childrenTemp == null) {
      childrenTemp = ArrayList()
      children = childrenTemp
    }

    childrenTemp.add(t)
    return t
  }

  public fun addChild(ruleInvocation: RuleContext): RuleContext =
    addAnyChild(ruleInvocation)

  /**
   * Add a token leaf node child and force its parent to be this node.
   */
  public fun addChild(t: TerminalNode): TerminalNode {
    t.assignParent(this)
    return addAnyChild(t)
  }

  /**
   * Add an error node child and force its parent to be this node.
   *
   * @since 4.7
   */
  public fun addErrorNode(errorNode: ErrorNode): ErrorNode {
    errorNode.assignParent(this)
    return addAnyChild(errorNode)
  }

  /**
   * Used by `enterOuterAlt` to toss out a [RuleContext] previously added as
   * we entered a rule.
   *
   * If we have `# label`, we will need to remove generic `ruleContext` object.
   */
  public fun removeLastChild() {
    val tempChildren = children
    tempChildren?.removeAt(tempChildren.size - 1)
  }

  override fun getChild(i: Int): ParseTree? {
    val tempChildren = children
    return if (tempChildren != null && i >= 0 && i < tempChildren.size) {
      tempChildren[i]
    } else {
      null
    }
  }

  public fun <T : ParseTree> getChild(ctxType: KClass<T>, i: Int): T? {
    val tempChildren = children

    if (tempChildren == null || i < 0 || i >= tempChildren.size) {
      return null
    }

    // What element have we found with ctxType?
    var j = -1

    for (o in tempChildren) {
      if (ctxType.isInstance(o)) {
        j++

        if (j == i) {
          @Suppress("UNCHECKED_CAST")
          return o as T
        }
      }
    }

    return null
  }

  public fun getToken(ttype: Int, i: Int): TerminalNode? {
    val tempChildren = children

    if (tempChildren == null || i < 0 || i >= tempChildren.size) {
      return null
    }

    // What token with ttype have we found?
    var j = -1

    for (o in tempChildren) {
      if (o is TerminalNode) {
        val symbol = o.symbol

        if (symbol.type == ttype) {
          j++

          if (j == i) {
            return o
          }
        }
      }
    }

    return null
  }

  public fun getTokens(ttype: Int): List<TerminalNode> {
    val tempChildren = children ?: return emptyList()
    val tokens = ArrayList<TerminalNode>()

    for (o in tempChildren) {
      if (o is TerminalNode) {
        val symbol = o.symbol

        if (symbol.type == ttype) {
          tokens.add(o)
        }
      }
    }

    return tokens
  }

  public fun <T : ParserRuleContext> getRuleContext(ctxType: KClass<T>, i: Int): T? =
    getChild(ctxType, i)

  public fun <T : ParserRuleContext> getRuleContexts(ctxType: KClass<T>): List<T> {
    val tempChildren = children ?: return emptyList()
    val contexts = ArrayList<T>()

    for (o in tempChildren) {
      if (ctxType.isInstance(o)) {
        @Suppress("UNCHECKED_CAST")
        contexts.add(o as T)
      }
    }

    return contexts
  }

  /**
   * Used for rule context info debugging during parse-time, not so much for ATN debugging.
   */
  public fun toInfoString(recognizer: Parser): String {
    val rules = recognizer.getRuleInvocationStack(this).toMutableList()
    rules.reverse()
    return "ParserRuleContext$rules{start=$start, stop=$stop}"
  }
}
