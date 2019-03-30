// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Cobol85PreprocessorParser}.
 */
interface Cobol85PreprocessorListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#startRule}.
	 * @param ctx the parse tree
	 */
	fun enterStartRule(ctx: Cobol85PreprocessorParser.StartRuleContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#startRule}.
	 * @param ctx the parse tree
	 */
	fun exitStartRule(ctx: Cobol85PreprocessorParser.StartRuleContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#compilerOptions}.
	 * @param ctx the parse tree
	 */
	fun enterCompilerOptions(ctx: Cobol85PreprocessorParser.CompilerOptionsContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#compilerOptions}.
	 * @param ctx the parse tree
	 */
	fun exitCompilerOptions(ctx: Cobol85PreprocessorParser.CompilerOptionsContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#compilerXOpts}.
	 * @param ctx the parse tree
	 */
	fun enterCompilerXOpts(ctx: Cobol85PreprocessorParser.CompilerXOptsContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#compilerXOpts}.
	 * @param ctx the parse tree
	 */
	fun exitCompilerXOpts(ctx: Cobol85PreprocessorParser.CompilerXOptsContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#compilerOption}.
	 * @param ctx the parse tree
	 */
	fun enterCompilerOption(ctx: Cobol85PreprocessorParser.CompilerOptionContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#compilerOption}.
	 * @param ctx the parse tree
	 */
	fun exitCompilerOption(ctx: Cobol85PreprocessorParser.CompilerOptionContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#execCicsStatement}.
	 * @param ctx the parse tree
	 */
	fun enterExecCicsStatement(ctx: Cobol85PreprocessorParser.ExecCicsStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#execCicsStatement}.
	 * @param ctx the parse tree
	 */
	fun exitExecCicsStatement(ctx: Cobol85PreprocessorParser.ExecCicsStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#execSqlStatement}.
	 * @param ctx the parse tree
	 */
	fun enterExecSqlStatement(ctx: Cobol85PreprocessorParser.ExecSqlStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#execSqlStatement}.
	 * @param ctx the parse tree
	 */
	fun exitExecSqlStatement(ctx: Cobol85PreprocessorParser.ExecSqlStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 */
	fun enterExecSqlImsStatement(ctx: Cobol85PreprocessorParser.ExecSqlImsStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 */
	fun exitExecSqlImsStatement(ctx: Cobol85PreprocessorParser.ExecSqlImsStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#copyStatement}.
	 * @param ctx the parse tree
	 */
	fun enterCopyStatement(ctx: Cobol85PreprocessorParser.CopyStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#copyStatement}.
	 * @param ctx the parse tree
	 */
	fun exitCopyStatement(ctx: Cobol85PreprocessorParser.CopyStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#copySource}.
	 * @param ctx the parse tree
	 */
	fun enterCopySource(ctx: Cobol85PreprocessorParser.CopySourceContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#copySource}.
	 * @param ctx the parse tree
	 */
	fun exitCopySource(ctx: Cobol85PreprocessorParser.CopySourceContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#copyLibrary}.
	 * @param ctx the parse tree
	 */
	fun enterCopyLibrary(ctx: Cobol85PreprocessorParser.CopyLibraryContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#copyLibrary}.
	 * @param ctx the parse tree
	 */
	fun exitCopyLibrary(ctx: Cobol85PreprocessorParser.CopyLibraryContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#replacingPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterReplacingPhrase(ctx: Cobol85PreprocessorParser.ReplacingPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#replacingPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitReplacingPhrase(ctx: Cobol85PreprocessorParser.ReplacingPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#replaceArea}.
	 * @param ctx the parse tree
	 */
	fun enterReplaceArea(ctx: Cobol85PreprocessorParser.ReplaceAreaContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#replaceArea}.
	 * @param ctx the parse tree
	 */
	fun exitReplaceArea(ctx: Cobol85PreprocessorParser.ReplaceAreaContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#replaceByStatement}.
	 * @param ctx the parse tree
	 */
	fun enterReplaceByStatement(ctx: Cobol85PreprocessorParser.ReplaceByStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#replaceByStatement}.
	 * @param ctx the parse tree
	 */
	fun exitReplaceByStatement(ctx: Cobol85PreprocessorParser.ReplaceByStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#replaceOffStatement}.
	 * @param ctx the parse tree
	 */
	fun enterReplaceOffStatement(ctx: Cobol85PreprocessorParser.ReplaceOffStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#replaceOffStatement}.
	 * @param ctx the parse tree
	 */
	fun exitReplaceOffStatement(ctx: Cobol85PreprocessorParser.ReplaceOffStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#replaceClause}.
	 * @param ctx the parse tree
	 */
	fun enterReplaceClause(ctx: Cobol85PreprocessorParser.ReplaceClauseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#replaceClause}.
	 * @param ctx the parse tree
	 */
	fun exitReplaceClause(ctx: Cobol85PreprocessorParser.ReplaceClauseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#directoryPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterDirectoryPhrase(ctx: Cobol85PreprocessorParser.DirectoryPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#directoryPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitDirectoryPhrase(ctx: Cobol85PreprocessorParser.DirectoryPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#familyPhrase}.
	 * @param ctx the parse tree
	 */
	fun enterFamilyPhrase(ctx: Cobol85PreprocessorParser.FamilyPhraseContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#familyPhrase}.
	 * @param ctx the parse tree
	 */
	fun exitFamilyPhrase(ctx: Cobol85PreprocessorParser.FamilyPhraseContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#replaceable}.
	 * @param ctx the parse tree
	 */
	fun enterReplaceable(ctx: Cobol85PreprocessorParser.ReplaceableContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#replaceable}.
	 * @param ctx the parse tree
	 */
	fun exitReplaceable(ctx: Cobol85PreprocessorParser.ReplaceableContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#replacement}.
	 * @param ctx the parse tree
	 */
	fun enterReplacement(ctx: Cobol85PreprocessorParser.ReplacementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#replacement}.
	 * @param ctx the parse tree
	 */
	fun exitReplacement(ctx: Cobol85PreprocessorParser.ReplacementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#ejectStatement}.
	 * @param ctx the parse tree
	 */
	fun enterEjectStatement(ctx: Cobol85PreprocessorParser.EjectStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#ejectStatement}.
	 * @param ctx the parse tree
	 */
	fun exitEjectStatement(ctx: Cobol85PreprocessorParser.EjectStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#skipStatement}.
	 * @param ctx the parse tree
	 */
	fun enterSkipStatement(ctx: Cobol85PreprocessorParser.SkipStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#skipStatement}.
	 * @param ctx the parse tree
	 */
	fun exitSkipStatement(ctx: Cobol85PreprocessorParser.SkipStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#titleStatement}.
	 * @param ctx the parse tree
	 */
	fun enterTitleStatement(ctx: Cobol85PreprocessorParser.TitleStatementContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#titleStatement}.
	 * @param ctx the parse tree
	 */
	fun exitTitleStatement(ctx: Cobol85PreprocessorParser.TitleStatementContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#pseudoText}.
	 * @param ctx the parse tree
	 */
	fun enterPseudoText(ctx: Cobol85PreprocessorParser.PseudoTextContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#pseudoText}.
	 * @param ctx the parse tree
	 */
	fun exitPseudoText(ctx: Cobol85PreprocessorParser.PseudoTextContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#charData}.
	 * @param ctx the parse tree
	 */
	fun enterCharData(ctx: Cobol85PreprocessorParser.CharDataContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#charData}.
	 * @param ctx the parse tree
	 */
	fun exitCharData(ctx: Cobol85PreprocessorParser.CharDataContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#charDataSql}.
	 * @param ctx the parse tree
	 */
	fun enterCharDataSql(ctx: Cobol85PreprocessorParser.CharDataSqlContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#charDataSql}.
	 * @param ctx the parse tree
	 */
	fun exitCharDataSql(ctx: Cobol85PreprocessorParser.CharDataSqlContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#charDataLine}.
	 * @param ctx the parse tree
	 */
	fun enterCharDataLine(ctx: Cobol85PreprocessorParser.CharDataLineContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#charDataLine}.
	 * @param ctx the parse tree
	 */
	fun exitCharDataLine(ctx: Cobol85PreprocessorParser.CharDataLineContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#cobolWord}.
	 * @param ctx the parse tree
	 */
	fun enterCobolWord(ctx: Cobol85PreprocessorParser.CobolWordContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#cobolWord}.
	 * @param ctx the parse tree
	 */
	fun exitCobolWord(ctx: Cobol85PreprocessorParser.CobolWordContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#literal}.
	 * @param ctx the parse tree
	 */
	fun enterLiteral(ctx: Cobol85PreprocessorParser.LiteralContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#literal}.
	 * @param ctx the parse tree
	 */
	fun exitLiteral(ctx: Cobol85PreprocessorParser.LiteralContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#filename}.
	 * @param ctx the parse tree
	 */
	fun enterFilename(ctx: Cobol85PreprocessorParser.FilenameContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#filename}.
	 * @param ctx the parse tree
	 */
	fun exitFilename(ctx: Cobol85PreprocessorParser.FilenameContext)
	/**
	 * Enter a parse tree produced by {@link Cobol85PreprocessorParser#charDataKeyword}.
	 * @param ctx the parse tree
	 */
	fun enterCharDataKeyword(ctx: Cobol85PreprocessorParser.CharDataKeywordContext)
	/**
	 * Exit a parse tree produced by {@link Cobol85PreprocessorParser#charDataKeyword}.
	 * @param ctx the parse tree
	 */
	fun exitCharDataKeyword(ctx: Cobol85PreprocessorParser.CharDataKeywordContext)
}