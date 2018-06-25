import com.strumenta.minicalc.MiniCalcParser
import com.strumenta.minicalc.MiniCalcParserBaseListener
import org.antlr.v4.kotlinruntime.tree.ParseTree

/**
 * Copyright (c) Martin Gittins 2018.
 * User: martingittins
 * Date: 13/06/2018
 * Time: 09:52
 */
class LocalListener: MiniCalcParserBaseListener() {

    override fun exitMiniCalcFile(ctx: MiniCalcParser.MiniCalcFileContext) {

        ctx.children!!.forEach { line ->
            processLine(line)
        }
    }

    private fun processLine(line: ParseTree) {
        processStatement(line.getChild(0)!!)
    }

    private fun processStatement(statement: ParseTree) {
        val content = statement.getChild(0)!!
        when (statement) {
            is MiniCalcParser.InputDeclarationStatementContext -> processInputDeclStatement(content)
            is MiniCalcParser.VarDeclarationStatementContext -> processVarDeclStatement(content)
            is MiniCalcParser.AssignmentStatementContext -> processAssignmentStatement(content)
            is MiniCalcParser.PrintStatementContext -> processPrintStatement(content)
        }
    }

    private fun processPrintStatement(content: ParseTree) {
        println("called processPrintStatement")
    }

    private fun processAssignmentStatement(content: ParseTree) {
        println("called processAssignmentStatement")
    }

    private fun processVarDeclStatement(content: ParseTree) {
        println("called processVarDeclStatement")
    }

    private fun processInputDeclStatement(content: ParseTree) {
        println("called processInputDeclStatement")
    }
}