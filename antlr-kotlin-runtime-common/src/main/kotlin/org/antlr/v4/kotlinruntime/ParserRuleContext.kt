/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import com.strumenta.kotlinmultiplatform.Type
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import com.strumenta.kotlinmultiplatform.isInstance
import org.antlr.v4.kotlinruntime.ast.Position
import org.antlr.v4.kotlinruntime.ast.pos
import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.tree.*

//
///** A rule invocation record for parsing.
// *
// * Contains all of the information about the current rule not stored in the
// * RuleContext. It handles parse tree children list, Any ATN state
// * tracing, and the default values available for rule invocations:
// * start, stop, rule index, current alt number.
// *
// * Subclasses made for each rule and grammar track the parameters,
// * return values, locals, and labels specific to that rule. These
// * are the objects that are returned from rules.
// *
// * Note text is not an actual field of a rule return value; it is computed
// * from start and stop using the input stream's toString() method.  I
// * could add a ctor to this so that we can pass in and store the input
// * stream, but I'm not sure we want to do that.  It would seem to be undefined
// * to get the .text property anyway if the rule matches tokens from multiple
// * input streams.
// *
// * I do not use getters for fields of objects that are used simply to
// * group values such as this aggregate.  The getters/setters are there to
// * satisfy the superclass interface.
// */
open class ParserRuleContext : RuleContext {
//    override fun setParent(parent: RuleContext) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

        /** If we are debugging or building a parse tree for a visitor,
     * we need to track all of the tokens and rule invocations associated
     * with this rule's context. This is empty for parsing w/o tree constr.
     * operation because we don't the need to track the details about
     * how we parse this rule.
     */
    var children: MutableList<ParseTree>? = null

    val position: Position?
        get() = if (start != null && stop!!.endPoint() != null) Position(start!!.startPoint(), stop!!.endPoint()!!) else null
//
//    /** For debugging/tracing purposes, we want to track all of the nodes in
//     * the ATN traversed by the parser for a particular rule.
//     * This list indicates the sequence of ATN nodes used to match
//     * the elements of the children list. This list does not include
//     * ATN nodes and other rules used to match rule invocations. It
//     * traces the rule invocation node itself but nothing inside that
//     * other rule's ATN submachine.
//     *
//     * There is NOT a one-to-one correspondence between the children and
//     * states list. There are typically many nodes in the ATN traversed
//     * for each element in the children list. For example, for a rule
//     * invocation there is the invoking state and the following state.
//     *
//     * The parser setState() method updates field s and adds it to this list
//     * if we are debugging/tracing.
//     *
//     * This does not trace states visited during prediction.
//     */
//    //	public List<Integer> states;
//
    /**
     * Get the initial token in this context.
     * Note that the range from start to stop is inclusive, so for rules that do not consume anything
     * (for example, zero length or error productions) this token may exceed stop.
     */
    var start: Token? = null
    /**
     * Get the final token in this context.
     * Note that the range from start to stop is inclusive, so for rules that do not consume anything
     * (for example, zero length or error productions) this token may precede start.
     */
    var stop: Token? = null
//
//    /**
//     * The exception that forced this rule to return. If the rule successfully
//     * completed, this is `null`.
//     */
    var exception: RecognitionException? = null

            /** Override to make type more specific  */
//    var parent: ParserRuleContext? = null
//        get() = super.readParent() as ParserRuleContext?
//        set

    fun assignParent(value: ParserRuleContext?) {
        this.parent = value
    }

    override fun assignParent(value: ParseTree?) {
        assignParent(value as ParserRuleContext?)
    }

    override val childCount: Int
        get() = if (children != null) children!!.size else 0

    override// empty
    val sourceInterval: Interval
        get() {
            if (start == null) {
                return Interval.INVALID
            }
            return if (stop == null || stop!!.tokenIndex < start!!.tokenIndex) {
                Interval.of(start!!.tokenIndex, start!!.tokenIndex - 1)
            } else Interval.of(start!!.tokenIndex, stop!!.tokenIndex)
        }

    constructor() {}

    /** COPY a ctx (I'm deliberately not using copy constructor) to avoid
     * confusion with creating node with parent. Does not copy children
     * (except error leaves).
     *
     * This is used in the generated parser code to flip a generic XContext
     * node for rule X to a YContext for alt accessLabel Y. In that sense, it is
     * not really a generic copy function.
     *
     * If we do an error sync() at start of a rule, we might add error nodes
     * to the generic XContext so this function must copy those nodes to
     * the YContext as well else they are lost!
     */
    fun copyFrom(ctx: ParserRuleContext) {
        this.parent = ctx.parent
        this.invokingState = ctx.invokingState

        this.start = ctx.start
        this.stop = ctx.stop

        // copy any error nodes to alt accessLabel node
        if (ctx.children != null) {
            this.children = ArrayList()
            // reset parent pointer for any error nodes
            for (child in ctx.children!!) {
                if (child is ErrorNode) {
                    addChild(child as ErrorNode)
                }
            }
        }
    }

    constructor(parent: ParserRuleContext?, invokingStateNumber: Int) : super(parent, invokingStateNumber) {}

    // Double dispatch methods for listeners

    open fun enterRule(listener: ParseTreeListener) {}
    open fun exitRule(listener: ParseTreeListener) {}

    /** Add a parse tree node to this as a child.  Works for
     * internal and leaf nodes. Does not set parent link;
     * other add methods must do that. Other addChild methods
     * call this.
     *
     * We cannot set the parent pointer of the incoming node
     * because the existing interfaces do not have a setParent()
     * method and I don't want to break backward compatibility for this.
     *
     * @since 4.7
     */
    fun <T : ParseTree> addAnyChild(t: T): T {
        if (children == null) children = ArrayList()
        children!!.add(t)
        return t
    }

    fun addChild(ruleInvocation: RuleContext): RuleContext {
        return addAnyChild(ruleInvocation)
    }

    /** Add a token leaf node child and force its parent to be this node.  */
    fun addChild(t: TerminalNode): TerminalNode {
        t.assignParent(this)
        return addAnyChild(t)
    }

    /** Add an error node child and force its parent to be this node.
     *
     * @since 4.7
     */
    fun addErrorNode(errorNode: ErrorNode): ErrorNode {
        errorNode.assignParent(this)
        return addAnyChild(errorNode)
    }

    /** Add a child to this node based upon matchedToken. It
     * creates a TerminalNodeImpl rather than using
     * [Parser.createTerminalNode]. I'm leaving this
     * in for compatibility but the parser doesn't use this anymore.
     */
    @Deprecated("")
    fun addChild(matchedToken: Token): TerminalNode {
        val t = TerminalNodeImpl(matchedToken)
        addAnyChild<ParseTree>(t)
        t.assignParent(this)
        return t
    }

    /** Add a child to this node based upon badToken.  It
     * creates a ErrorNodeImpl rather than using
     * [Parser.createErrorNode]. I'm leaving this
     * in for compatibility but the parser doesn't use this anymore.
     */
    @Deprecated("")
    fun addErrorNode(badToken: Token): ErrorNode {
        val t = ErrorNodeImpl(badToken)
        addAnyChild<ParseTree>(t)
        t.assignParent(this)
        return t
    }
//
//    //	public void trace(int s) {
//    //		if ( states==null ) states = new ArrayList<Integer>();
//    //		states.add(s);
//    //	}
//
    /** Used by enterOuterAlt to toss out a RuleContext previously added as
     * we entered a rule. If we have # accessLabel, we will need to remove
     * generic ruleContext object.
     */
    fun removeLastChild() {
        if (children != null) {
            children!!.removeAt(children!!.size - 1)
        }
    }

    override fun getChild(i: Int): ParseTree? {
        return if (children != null && i >= 0 && i < children!!.size) children!![i] else null
    }

    fun <T : ParseTree> getChild(ctxType: Type, i: Int): T? {
        if (children == null || i < 0 || i >= children!!.size) {
            return null
        }

        var j = -1 // what element have we found with ctxType?
        for (o in children!!) {
            if (ctxType.isInstance(o)) {
                j++
                if (j == i) {
                    return o as T
                }
            }
        }
        return null
    }

    fun getToken(ttype: Int, i: Int): TerminalNode? {
        if (children == null || i < 0 || i >= children!!.size) {
            return null
        }

        var j = -1 // what token with ttype have we found?
        for (o in children!!) {
            if (o is TerminalNode) {
                val tnode = o as TerminalNode
                val symbol = tnode.symbol
                if (symbol!!.type == ttype) {
                    j++
                    if (j == i) {
                        return tnode
                    }
                }
            }
        }

        return null
    }

    fun getTokens(ttype: Int): List<TerminalNode> {
        if (children == null) {
            return emptyList()
        }

        var tokens: MutableList<TerminalNode>? = null
        for (o in children!!) {
            if (o is TerminalNode) {
                val tnode = o as TerminalNode
                val symbol = tnode.symbol
                if (symbol!!.type == ttype) {
                    if (tokens == null) {
                        tokens = ArrayList<TerminalNode>()
                    }
                    tokens.add(tnode)
                }
            }
        }

        return if (tokens == null) {
            emptyList()
        } else tokens

    }

    fun <T : ParserRuleContext> getRuleContext(ctxType: Type, i: Int): T? {
        return getChild(ctxType, i) as T?
    }

    fun <T : ParserRuleContext> getRuleContexts(ctxType: Type): List<T> {
        if (children == null) {
            return emptyList()
        }

        var contexts: MutableList<T>? = null
        for (o in children!!) {
            if (ctxType.isInstance(o)) {
                if (contexts == null) {
                    contexts = ArrayList()
                }

                contexts.add(o as T)
            }
        }

        return if (contexts == null) {
            emptyList()
        } else contexts

    }
//
//    /** Used for rule context info debugging during parse-time, not so much for ATN debugging  */
//    fun toInfoString(recognizer: Parser): String {
//        val rules = recognizer.getRuleInvocationStack(this)
//        Collections.reverse(rules)
//        return "ParserRuleContext" + rules + "{" +
//                "start=" + start +
//                ", stop=" + stop +
//                '}'
//    }
}

