// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.misc.IntegerStack

/**
 * An iterative (read: non-recursive) pre-order and post-order tree walker that
 * doesn't use the thread stack but heap-based stacks. Makes it possible to
 * process deeply nested parse trees.
 */
public class IterativeParseTreeWalker : ParseTreeWalker() {
  override fun walk(listener: ParseTreeListener, t: ParseTree) {
    val nodeStack = ArrayDeque<ParseTree>()
    val indexStack = IntegerStack()
    var currentNode: ParseTree? = t
    var currentIndex = 0

    while (currentNode != null) {
      // Pre-order visit
      when (currentNode) {
        is ErrorNode -> listener.visitErrorNode(currentNode)
        is TerminalNode -> listener.visitTerminal(currentNode)
        else -> enterRule(listener, currentNode as RuleNode)
      }

      // Move down to first child, if exists
      if (currentNode.childCount > 0) {
        nodeStack.addFirst(currentNode)
        indexStack.push(currentIndex)
        currentIndex = 0
        currentNode = currentNode.getChild(0)
        continue
      }

      // No child nodes, so walk tree
      do {
        // Post-order visit
        if (currentNode is RuleNode) {
          exitRule(listener, currentNode)
        }

        // No parent, so no siblings
        if (nodeStack.isEmpty()) {
          currentNode = null
          currentIndex = 0
          break
        }

        // Move to next sibling if possible
        currentNode = nodeStack.first().getChild(++currentIndex)

        if (currentNode != null) {
          break
        }

        // No next, sibling, so move up
        currentNode = nodeStack.removeFirst()
        currentIndex = indexStack.pop()
      } while (currentNode != null)
    }
  }
}
