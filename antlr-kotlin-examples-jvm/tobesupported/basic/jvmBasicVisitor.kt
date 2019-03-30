// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jvmBasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface jvmBasicVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProg(ctx : jvmBasicParser.ProgContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLine(ctx : jvmBasicParser.LineContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#amperoper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAmperoper(ctx : jvmBasicParser.AmperoperContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#linenumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLinenumber(ctx : jvmBasicParser.LinenumberContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#amprstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAmprstmt(ctx : jvmBasicParser.AmprstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatement(ctx : jvmBasicParser.StatementContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVardecl(ctx : jvmBasicParser.VardeclContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#printstmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPrintstmt1(ctx : jvmBasicParser.Printstmt1Context) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#printlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPrintlist(ctx : jvmBasicParser.PrintlistContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#getstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGetstmt(ctx : jvmBasicParser.GetstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#letstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLetstmt(ctx : jvmBasicParser.LetstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#variableassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVariableassignment(ctx : jvmBasicParser.VariableassignmentContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelop(ctx : jvmBasicParser.RelopContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#neq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNeq(ctx : jvmBasicParser.NeqContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfstmt(ctx : jvmBasicParser.IfstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#forstmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForstmt1(ctx : jvmBasicParser.Forstmt1Context) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#forstmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitForstmt2(ctx : jvmBasicParser.Forstmt2Context) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#nextstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNextstmt(ctx : jvmBasicParser.NextstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#inputstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInputstmt(ctx : jvmBasicParser.InputstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#readstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReadstmt(ctx : jvmBasicParser.ReadstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#dimstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDimstmt(ctx : jvmBasicParser.DimstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#gotostmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGotostmt(ctx : jvmBasicParser.GotostmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#gosubstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGosubstmt(ctx : jvmBasicParser.GosubstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#pokestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPokestmt(ctx : jvmBasicParser.PokestmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCallstmt(ctx : jvmBasicParser.CallstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#hplotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHplotstmt(ctx : jvmBasicParser.HplotstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#vplotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVplotstmt(ctx : jvmBasicParser.VplotstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#plotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPlotstmt(ctx : jvmBasicParser.PlotstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#ongotostmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOngotostmt(ctx : jvmBasicParser.OngotostmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#ongosubstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOngosubstmt(ctx : jvmBasicParser.OngosubstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#vtabstmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVtabstmnt(ctx : jvmBasicParser.VtabstmntContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#htabstmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHtabstmnt(ctx : jvmBasicParser.HtabstmntContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#himemstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHimemstmt(ctx : jvmBasicParser.HimemstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#lomemstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLomemstmt(ctx : jvmBasicParser.LomemstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#datastmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDatastmt(ctx : jvmBasicParser.DatastmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#datum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDatum(ctx : jvmBasicParser.DatumContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#waitstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWaitstmt(ctx : jvmBasicParser.WaitstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#xdrawstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitXdrawstmt(ctx : jvmBasicParser.XdrawstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#drawstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDrawstmt(ctx : jvmBasicParser.DrawstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#defstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDefstmt(ctx : jvmBasicParser.DefstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#tabstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTabstmt(ctx : jvmBasicParser.TabstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#speedstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSpeedstmt(ctx : jvmBasicParser.SpeedstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#rotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRotstmt(ctx : jvmBasicParser.RotstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#scalestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScalestmt(ctx : jvmBasicParser.ScalestmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#colorstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitColorstmt(ctx : jvmBasicParser.ColorstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#hcolorstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHcolorstmt(ctx : jvmBasicParser.HcolorstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#hlinstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitHlinstmt(ctx : jvmBasicParser.HlinstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#vlinstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVlinstmt(ctx : jvmBasicParser.VlinstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#onerrstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOnerrstmt(ctx : jvmBasicParser.OnerrstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#prstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPrstmt(ctx : jvmBasicParser.PrstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#instmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInstmt(ctx : jvmBasicParser.InstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#storestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStorestmt(ctx : jvmBasicParser.StorestmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#recallstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRecallstmt(ctx : jvmBasicParser.RecallstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#liststmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitListstmt(ctx : jvmBasicParser.ListstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#popstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPopstmt(ctx : jvmBasicParser.PopstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#amptstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAmptstmt(ctx : jvmBasicParser.AmptstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#includestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIncludestmt(ctx : jvmBasicParser.IncludestmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#endstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEndstmt(ctx : jvmBasicParser.EndstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitReturnstmt(ctx : jvmBasicParser.ReturnstmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#restorestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRestorestmt(ctx : jvmBasicParser.RestorestmtContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumber(ctx : jvmBasicParser.NumberContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunc(ctx : jvmBasicParser.FuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#signExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSignExpression(ctx : jvmBasicParser.SignExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#exponentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExponentExpression(ctx : jvmBasicParser.ExponentExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMultiplyingExpression(ctx : jvmBasicParser.MultiplyingExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#addingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAddingExpression(ctx : jvmBasicParser.AddingExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRelationalExpression(ctx : jvmBasicParser.RelationalExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpression(ctx : jvmBasicParser.ExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVar(ctx : jvmBasicParser.VarContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVarname(ctx : jvmBasicParser.VarnameContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#varsuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVarsuffix(ctx : jvmBasicParser.VarsuffixContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVarlist(ctx : jvmBasicParser.VarlistContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExprlist(ctx : jvmBasicParser.ExprlistContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#sqrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSqrfunc(ctx : jvmBasicParser.SqrfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#chrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitChrfunc(ctx : jvmBasicParser.ChrfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#lenfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLenfunc(ctx : jvmBasicParser.LenfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#ascfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAscfunc(ctx : jvmBasicParser.AscfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#midfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMidfunc(ctx : jvmBasicParser.MidfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#pdlfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPdlfunc(ctx : jvmBasicParser.PdlfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#peekfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPeekfunc(ctx : jvmBasicParser.PeekfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#intfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIntfunc(ctx : jvmBasicParser.IntfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#spcfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSpcfunc(ctx : jvmBasicParser.SpcfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#frefunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFrefunc(ctx : jvmBasicParser.FrefuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#posfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPosfunc(ctx : jvmBasicParser.PosfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#usrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUsrfunc(ctx : jvmBasicParser.UsrfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#leftfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLeftfunc(ctx : jvmBasicParser.LeftfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#rightfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRightfunc(ctx : jvmBasicParser.RightfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#strfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStrfunc(ctx : jvmBasicParser.StrfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#fnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFnfunc(ctx : jvmBasicParser.FnfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#valfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitValfunc(ctx : jvmBasicParser.ValfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#scrnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScrnfunc(ctx : jvmBasicParser.ScrnfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#sinfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSinfunc(ctx : jvmBasicParser.SinfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#cosfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCosfunc(ctx : jvmBasicParser.CosfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#tanfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTanfunc(ctx : jvmBasicParser.TanfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#atnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAtnfunc(ctx : jvmBasicParser.AtnfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#rndfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRndfunc(ctx : jvmBasicParser.RndfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#sgnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSgnfunc(ctx : jvmBasicParser.SgnfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#expfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpfunc(ctx : jvmBasicParser.ExpfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#logfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLogfunc(ctx : jvmBasicParser.LogfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#absfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAbsfunc(ctx : jvmBasicParser.AbsfuncContext) : T
	/**
	 * Visit a parse tree produced by {@link jvmBasicParser#tabfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitTabfunc(ctx : jvmBasicParser.TabfuncContext) : T
}