// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Cobol85PreprocessorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface Cobol85PreprocessorVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStartRule(ctx : Cobol85PreprocessorParser.StartRuleContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#compilerOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompilerOptions(ctx : Cobol85PreprocessorParser.CompilerOptionsContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#compilerXOpts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompilerXOpts(ctx : Cobol85PreprocessorParser.CompilerXOptsContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#compilerOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCompilerOption(ctx : Cobol85PreprocessorParser.CompilerOptionContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#execCicsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExecCicsStatement(ctx : Cobol85PreprocessorParser.ExecCicsStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#execSqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExecSqlStatement(ctx : Cobol85PreprocessorParser.ExecSqlStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#execSqlImsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExecSqlImsStatement(ctx : Cobol85PreprocessorParser.ExecSqlImsStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#copyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCopyStatement(ctx : Cobol85PreprocessorParser.CopyStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#copySource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCopySource(ctx : Cobol85PreprocessorParser.CopySourceContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#copyLibrary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCopyLibrary(ctx : Cobol85PreprocessorParser.CopyLibraryContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#replacingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReplacingPhrase(ctx : Cobol85PreprocessorParser.ReplacingPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#replaceArea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReplaceArea(ctx : Cobol85PreprocessorParser.ReplaceAreaContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#replaceByStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReplaceByStatement(ctx : Cobol85PreprocessorParser.ReplaceByStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#replaceOffStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReplaceOffStatement(ctx : Cobol85PreprocessorParser.ReplaceOffStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#replaceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReplaceClause(ctx : Cobol85PreprocessorParser.ReplaceClauseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#directoryPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDirectoryPhrase(ctx : Cobol85PreprocessorParser.DirectoryPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#familyPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFamilyPhrase(ctx : Cobol85PreprocessorParser.FamilyPhraseContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#replaceable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReplaceable(ctx : Cobol85PreprocessorParser.ReplaceableContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#replacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReplacement(ctx : Cobol85PreprocessorParser.ReplacementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#ejectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEjectStatement(ctx : Cobol85PreprocessorParser.EjectStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#skipStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSkipStatement(ctx : Cobol85PreprocessorParser.SkipStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#titleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTitleStatement(ctx : Cobol85PreprocessorParser.TitleStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#pseudoText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPseudoText(ctx : Cobol85PreprocessorParser.PseudoTextContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#charData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCharData(ctx : Cobol85PreprocessorParser.CharDataContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#charDataSql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCharDataSql(ctx : Cobol85PreprocessorParser.CharDataSqlContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#charDataLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCharDataLine(ctx : Cobol85PreprocessorParser.CharDataLineContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#cobolWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCobolWord(ctx : Cobol85PreprocessorParser.CobolWordContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteral(ctx : Cobol85PreprocessorParser.LiteralContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFilename(ctx : Cobol85PreprocessorParser.FilenameContext) : T
	/**
	 * Visit a parse tree produced by {@link Cobol85PreprocessorParser#charDataKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCharDataKeyword(ctx : Cobol85PreprocessorParser.CharDataKeywordContext) : T
}