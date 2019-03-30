// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jvmBasicParser}.
 */
interface jvmBasicListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#prog}.
	 * @param ctx the parse tree
	 */
	fun enterProg(ctx: jvmBasicParser.ProgContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#prog}.
	 * @param ctx the parse tree
	 */
	fun exitProg(ctx: jvmBasicParser.ProgContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#line}.
	 * @param ctx the parse tree
	 */
	fun enterLine(ctx: jvmBasicParser.LineContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#line}.
	 * @param ctx the parse tree
	 */
	fun exitLine(ctx: jvmBasicParser.LineContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#amperoper}.
	 * @param ctx the parse tree
	 */
	fun enterAmperoper(ctx: jvmBasicParser.AmperoperContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#amperoper}.
	 * @param ctx the parse tree
	 */
	fun exitAmperoper(ctx: jvmBasicParser.AmperoperContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#linenumber}.
	 * @param ctx the parse tree
	 */
	fun enterLinenumber(ctx: jvmBasicParser.LinenumberContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#linenumber}.
	 * @param ctx the parse tree
	 */
	fun exitLinenumber(ctx: jvmBasicParser.LinenumberContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#amprstmt}.
	 * @param ctx the parse tree
	 */
	fun enterAmprstmt(ctx: jvmBasicParser.AmprstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#amprstmt}.
	 * @param ctx the parse tree
	 */
	fun exitAmprstmt(ctx: jvmBasicParser.AmprstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#statement}.
	 * @param ctx the parse tree
	 */
	fun enterStatement(ctx: jvmBasicParser.StatementContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#statement}.
	 * @param ctx the parse tree
	 */
	fun exitStatement(ctx: jvmBasicParser.StatementContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#vardecl}.
	 * @param ctx the parse tree
	 */
	fun enterVardecl(ctx: jvmBasicParser.VardeclContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#vardecl}.
	 * @param ctx the parse tree
	 */
	fun exitVardecl(ctx: jvmBasicParser.VardeclContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#printstmt1}.
	 * @param ctx the parse tree
	 */
	fun enterPrintstmt1(ctx: jvmBasicParser.Printstmt1Context)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#printstmt1}.
	 * @param ctx the parse tree
	 */
	fun exitPrintstmt1(ctx: jvmBasicParser.Printstmt1Context)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#printlist}.
	 * @param ctx the parse tree
	 */
	fun enterPrintlist(ctx: jvmBasicParser.PrintlistContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#printlist}.
	 * @param ctx the parse tree
	 */
	fun exitPrintlist(ctx: jvmBasicParser.PrintlistContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#getstmt}.
	 * @param ctx the parse tree
	 */
	fun enterGetstmt(ctx: jvmBasicParser.GetstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#getstmt}.
	 * @param ctx the parse tree
	 */
	fun exitGetstmt(ctx: jvmBasicParser.GetstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#letstmt}.
	 * @param ctx the parse tree
	 */
	fun enterLetstmt(ctx: jvmBasicParser.LetstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#letstmt}.
	 * @param ctx the parse tree
	 */
	fun exitLetstmt(ctx: jvmBasicParser.LetstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#variableassignment}.
	 * @param ctx the parse tree
	 */
	fun enterVariableassignment(ctx: jvmBasicParser.VariableassignmentContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#variableassignment}.
	 * @param ctx the parse tree
	 */
	fun exitVariableassignment(ctx: jvmBasicParser.VariableassignmentContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#relop}.
	 * @param ctx the parse tree
	 */
	fun enterRelop(ctx: jvmBasicParser.RelopContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#relop}.
	 * @param ctx the parse tree
	 */
	fun exitRelop(ctx: jvmBasicParser.RelopContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#neq}.
	 * @param ctx the parse tree
	 */
	fun enterNeq(ctx: jvmBasicParser.NeqContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#neq}.
	 * @param ctx the parse tree
	 */
	fun exitNeq(ctx: jvmBasicParser.NeqContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	fun enterIfstmt(ctx: jvmBasicParser.IfstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	fun exitIfstmt(ctx: jvmBasicParser.IfstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#forstmt1}.
	 * @param ctx the parse tree
	 */
	fun enterForstmt1(ctx: jvmBasicParser.Forstmt1Context)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#forstmt1}.
	 * @param ctx the parse tree
	 */
	fun exitForstmt1(ctx: jvmBasicParser.Forstmt1Context)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#forstmt2}.
	 * @param ctx the parse tree
	 */
	fun enterForstmt2(ctx: jvmBasicParser.Forstmt2Context)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#forstmt2}.
	 * @param ctx the parse tree
	 */
	fun exitForstmt2(ctx: jvmBasicParser.Forstmt2Context)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#nextstmt}.
	 * @param ctx the parse tree
	 */
	fun enterNextstmt(ctx: jvmBasicParser.NextstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#nextstmt}.
	 * @param ctx the parse tree
	 */
	fun exitNextstmt(ctx: jvmBasicParser.NextstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#inputstmt}.
	 * @param ctx the parse tree
	 */
	fun enterInputstmt(ctx: jvmBasicParser.InputstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#inputstmt}.
	 * @param ctx the parse tree
	 */
	fun exitInputstmt(ctx: jvmBasicParser.InputstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#readstmt}.
	 * @param ctx the parse tree
	 */
	fun enterReadstmt(ctx: jvmBasicParser.ReadstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#readstmt}.
	 * @param ctx the parse tree
	 */
	fun exitReadstmt(ctx: jvmBasicParser.ReadstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#dimstmt}.
	 * @param ctx the parse tree
	 */
	fun enterDimstmt(ctx: jvmBasicParser.DimstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#dimstmt}.
	 * @param ctx the parse tree
	 */
	fun exitDimstmt(ctx: jvmBasicParser.DimstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#gotostmt}.
	 * @param ctx the parse tree
	 */
	fun enterGotostmt(ctx: jvmBasicParser.GotostmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#gotostmt}.
	 * @param ctx the parse tree
	 */
	fun exitGotostmt(ctx: jvmBasicParser.GotostmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#gosubstmt}.
	 * @param ctx the parse tree
	 */
	fun enterGosubstmt(ctx: jvmBasicParser.GosubstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#gosubstmt}.
	 * @param ctx the parse tree
	 */
	fun exitGosubstmt(ctx: jvmBasicParser.GosubstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#pokestmt}.
	 * @param ctx the parse tree
	 */
	fun enterPokestmt(ctx: jvmBasicParser.PokestmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#pokestmt}.
	 * @param ctx the parse tree
	 */
	fun exitPokestmt(ctx: jvmBasicParser.PokestmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#callstmt}.
	 * @param ctx the parse tree
	 */
	fun enterCallstmt(ctx: jvmBasicParser.CallstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#callstmt}.
	 * @param ctx the parse tree
	 */
	fun exitCallstmt(ctx: jvmBasicParser.CallstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#hplotstmt}.
	 * @param ctx the parse tree
	 */
	fun enterHplotstmt(ctx: jvmBasicParser.HplotstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#hplotstmt}.
	 * @param ctx the parse tree
	 */
	fun exitHplotstmt(ctx: jvmBasicParser.HplotstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#vplotstmt}.
	 * @param ctx the parse tree
	 */
	fun enterVplotstmt(ctx: jvmBasicParser.VplotstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#vplotstmt}.
	 * @param ctx the parse tree
	 */
	fun exitVplotstmt(ctx: jvmBasicParser.VplotstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#plotstmt}.
	 * @param ctx the parse tree
	 */
	fun enterPlotstmt(ctx: jvmBasicParser.PlotstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#plotstmt}.
	 * @param ctx the parse tree
	 */
	fun exitPlotstmt(ctx: jvmBasicParser.PlotstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#ongotostmt}.
	 * @param ctx the parse tree
	 */
	fun enterOngotostmt(ctx: jvmBasicParser.OngotostmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#ongotostmt}.
	 * @param ctx the parse tree
	 */
	fun exitOngotostmt(ctx: jvmBasicParser.OngotostmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#ongosubstmt}.
	 * @param ctx the parse tree
	 */
	fun enterOngosubstmt(ctx: jvmBasicParser.OngosubstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#ongosubstmt}.
	 * @param ctx the parse tree
	 */
	fun exitOngosubstmt(ctx: jvmBasicParser.OngosubstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#vtabstmnt}.
	 * @param ctx the parse tree
	 */
	fun enterVtabstmnt(ctx: jvmBasicParser.VtabstmntContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#vtabstmnt}.
	 * @param ctx the parse tree
	 */
	fun exitVtabstmnt(ctx: jvmBasicParser.VtabstmntContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#htabstmnt}.
	 * @param ctx the parse tree
	 */
	fun enterHtabstmnt(ctx: jvmBasicParser.HtabstmntContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#htabstmnt}.
	 * @param ctx the parse tree
	 */
	fun exitHtabstmnt(ctx: jvmBasicParser.HtabstmntContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#himemstmt}.
	 * @param ctx the parse tree
	 */
	fun enterHimemstmt(ctx: jvmBasicParser.HimemstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#himemstmt}.
	 * @param ctx the parse tree
	 */
	fun exitHimemstmt(ctx: jvmBasicParser.HimemstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#lomemstmt}.
	 * @param ctx the parse tree
	 */
	fun enterLomemstmt(ctx: jvmBasicParser.LomemstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#lomemstmt}.
	 * @param ctx the parse tree
	 */
	fun exitLomemstmt(ctx: jvmBasicParser.LomemstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#datastmt}.
	 * @param ctx the parse tree
	 */
	fun enterDatastmt(ctx: jvmBasicParser.DatastmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#datastmt}.
	 * @param ctx the parse tree
	 */
	fun exitDatastmt(ctx: jvmBasicParser.DatastmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#datum}.
	 * @param ctx the parse tree
	 */
	fun enterDatum(ctx: jvmBasicParser.DatumContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#datum}.
	 * @param ctx the parse tree
	 */
	fun exitDatum(ctx: jvmBasicParser.DatumContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#waitstmt}.
	 * @param ctx the parse tree
	 */
	fun enterWaitstmt(ctx: jvmBasicParser.WaitstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#waitstmt}.
	 * @param ctx the parse tree
	 */
	fun exitWaitstmt(ctx: jvmBasicParser.WaitstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#xdrawstmt}.
	 * @param ctx the parse tree
	 */
	fun enterXdrawstmt(ctx: jvmBasicParser.XdrawstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#xdrawstmt}.
	 * @param ctx the parse tree
	 */
	fun exitXdrawstmt(ctx: jvmBasicParser.XdrawstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#drawstmt}.
	 * @param ctx the parse tree
	 */
	fun enterDrawstmt(ctx: jvmBasicParser.DrawstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#drawstmt}.
	 * @param ctx the parse tree
	 */
	fun exitDrawstmt(ctx: jvmBasicParser.DrawstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#defstmt}.
	 * @param ctx the parse tree
	 */
	fun enterDefstmt(ctx: jvmBasicParser.DefstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#defstmt}.
	 * @param ctx the parse tree
	 */
	fun exitDefstmt(ctx: jvmBasicParser.DefstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#tabstmt}.
	 * @param ctx the parse tree
	 */
	fun enterTabstmt(ctx: jvmBasicParser.TabstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#tabstmt}.
	 * @param ctx the parse tree
	 */
	fun exitTabstmt(ctx: jvmBasicParser.TabstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#speedstmt}.
	 * @param ctx the parse tree
	 */
	fun enterSpeedstmt(ctx: jvmBasicParser.SpeedstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#speedstmt}.
	 * @param ctx the parse tree
	 */
	fun exitSpeedstmt(ctx: jvmBasicParser.SpeedstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#rotstmt}.
	 * @param ctx the parse tree
	 */
	fun enterRotstmt(ctx: jvmBasicParser.RotstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#rotstmt}.
	 * @param ctx the parse tree
	 */
	fun exitRotstmt(ctx: jvmBasicParser.RotstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#scalestmt}.
	 * @param ctx the parse tree
	 */
	fun enterScalestmt(ctx: jvmBasicParser.ScalestmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#scalestmt}.
	 * @param ctx the parse tree
	 */
	fun exitScalestmt(ctx: jvmBasicParser.ScalestmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#colorstmt}.
	 * @param ctx the parse tree
	 */
	fun enterColorstmt(ctx: jvmBasicParser.ColorstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#colorstmt}.
	 * @param ctx the parse tree
	 */
	fun exitColorstmt(ctx: jvmBasicParser.ColorstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#hcolorstmt}.
	 * @param ctx the parse tree
	 */
	fun enterHcolorstmt(ctx: jvmBasicParser.HcolorstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#hcolorstmt}.
	 * @param ctx the parse tree
	 */
	fun exitHcolorstmt(ctx: jvmBasicParser.HcolorstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#hlinstmt}.
	 * @param ctx the parse tree
	 */
	fun enterHlinstmt(ctx: jvmBasicParser.HlinstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#hlinstmt}.
	 * @param ctx the parse tree
	 */
	fun exitHlinstmt(ctx: jvmBasicParser.HlinstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#vlinstmt}.
	 * @param ctx the parse tree
	 */
	fun enterVlinstmt(ctx: jvmBasicParser.VlinstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#vlinstmt}.
	 * @param ctx the parse tree
	 */
	fun exitVlinstmt(ctx: jvmBasicParser.VlinstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#onerrstmt}.
	 * @param ctx the parse tree
	 */
	fun enterOnerrstmt(ctx: jvmBasicParser.OnerrstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#onerrstmt}.
	 * @param ctx the parse tree
	 */
	fun exitOnerrstmt(ctx: jvmBasicParser.OnerrstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#prstmt}.
	 * @param ctx the parse tree
	 */
	fun enterPrstmt(ctx: jvmBasicParser.PrstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#prstmt}.
	 * @param ctx the parse tree
	 */
	fun exitPrstmt(ctx: jvmBasicParser.PrstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#instmt}.
	 * @param ctx the parse tree
	 */
	fun enterInstmt(ctx: jvmBasicParser.InstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#instmt}.
	 * @param ctx the parse tree
	 */
	fun exitInstmt(ctx: jvmBasicParser.InstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#storestmt}.
	 * @param ctx the parse tree
	 */
	fun enterStorestmt(ctx: jvmBasicParser.StorestmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#storestmt}.
	 * @param ctx the parse tree
	 */
	fun exitStorestmt(ctx: jvmBasicParser.StorestmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#recallstmt}.
	 * @param ctx the parse tree
	 */
	fun enterRecallstmt(ctx: jvmBasicParser.RecallstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#recallstmt}.
	 * @param ctx the parse tree
	 */
	fun exitRecallstmt(ctx: jvmBasicParser.RecallstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#liststmt}.
	 * @param ctx the parse tree
	 */
	fun enterListstmt(ctx: jvmBasicParser.ListstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#liststmt}.
	 * @param ctx the parse tree
	 */
	fun exitListstmt(ctx: jvmBasicParser.ListstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#popstmt}.
	 * @param ctx the parse tree
	 */
	fun enterPopstmt(ctx: jvmBasicParser.PopstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#popstmt}.
	 * @param ctx the parse tree
	 */
	fun exitPopstmt(ctx: jvmBasicParser.PopstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#amptstmt}.
	 * @param ctx the parse tree
	 */
	fun enterAmptstmt(ctx: jvmBasicParser.AmptstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#amptstmt}.
	 * @param ctx the parse tree
	 */
	fun exitAmptstmt(ctx: jvmBasicParser.AmptstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#includestmt}.
	 * @param ctx the parse tree
	 */
	fun enterIncludestmt(ctx: jvmBasicParser.IncludestmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#includestmt}.
	 * @param ctx the parse tree
	 */
	fun exitIncludestmt(ctx: jvmBasicParser.IncludestmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#endstmt}.
	 * @param ctx the parse tree
	 */
	fun enterEndstmt(ctx: jvmBasicParser.EndstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#endstmt}.
	 * @param ctx the parse tree
	 */
	fun exitEndstmt(ctx: jvmBasicParser.EndstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	fun enterReturnstmt(ctx: jvmBasicParser.ReturnstmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	fun exitReturnstmt(ctx: jvmBasicParser.ReturnstmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#restorestmt}.
	 * @param ctx the parse tree
	 */
	fun enterRestorestmt(ctx: jvmBasicParser.RestorestmtContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#restorestmt}.
	 * @param ctx the parse tree
	 */
	fun exitRestorestmt(ctx: jvmBasicParser.RestorestmtContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#number}.
	 * @param ctx the parse tree
	 */
	fun enterNumber(ctx: jvmBasicParser.NumberContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#number}.
	 * @param ctx the parse tree
	 */
	fun exitNumber(ctx: jvmBasicParser.NumberContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#func}.
	 * @param ctx the parse tree
	 */
	fun enterFunc(ctx: jvmBasicParser.FuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#func}.
	 * @param ctx the parse tree
	 */
	fun exitFunc(ctx: jvmBasicParser.FuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#signExpression}.
	 * @param ctx the parse tree
	 */
	fun enterSignExpression(ctx: jvmBasicParser.SignExpressionContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#signExpression}.
	 * @param ctx the parse tree
	 */
	fun exitSignExpression(ctx: jvmBasicParser.SignExpressionContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#exponentExpression}.
	 * @param ctx the parse tree
	 */
	fun enterExponentExpression(ctx: jvmBasicParser.ExponentExpressionContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#exponentExpression}.
	 * @param ctx the parse tree
	 */
	fun exitExponentExpression(ctx: jvmBasicParser.ExponentExpressionContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	fun enterMultiplyingExpression(ctx: jvmBasicParser.MultiplyingExpressionContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	fun exitMultiplyingExpression(ctx: jvmBasicParser.MultiplyingExpressionContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#addingExpression}.
	 * @param ctx the parse tree
	 */
	fun enterAddingExpression(ctx: jvmBasicParser.AddingExpressionContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#addingExpression}.
	 * @param ctx the parse tree
	 */
	fun exitAddingExpression(ctx: jvmBasicParser.AddingExpressionContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	fun enterRelationalExpression(ctx: jvmBasicParser.RelationalExpressionContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	fun exitRelationalExpression(ctx: jvmBasicParser.RelationalExpressionContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#expression}.
	 * @param ctx the parse tree
	 */
	fun enterExpression(ctx: jvmBasicParser.ExpressionContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#expression}.
	 * @param ctx the parse tree
	 */
	fun exitExpression(ctx: jvmBasicParser.ExpressionContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#var}.
	 * @param ctx the parse tree
	 */
	fun enterVar(ctx: jvmBasicParser.VarContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#var}.
	 * @param ctx the parse tree
	 */
	fun exitVar(ctx: jvmBasicParser.VarContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#varname}.
	 * @param ctx the parse tree
	 */
	fun enterVarname(ctx: jvmBasicParser.VarnameContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#varname}.
	 * @param ctx the parse tree
	 */
	fun exitVarname(ctx: jvmBasicParser.VarnameContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#varsuffix}.
	 * @param ctx the parse tree
	 */
	fun enterVarsuffix(ctx: jvmBasicParser.VarsuffixContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#varsuffix}.
	 * @param ctx the parse tree
	 */
	fun exitVarsuffix(ctx: jvmBasicParser.VarsuffixContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#varlist}.
	 * @param ctx the parse tree
	 */
	fun enterVarlist(ctx: jvmBasicParser.VarlistContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#varlist}.
	 * @param ctx the parse tree
	 */
	fun exitVarlist(ctx: jvmBasicParser.VarlistContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#exprlist}.
	 * @param ctx the parse tree
	 */
	fun enterExprlist(ctx: jvmBasicParser.ExprlistContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#exprlist}.
	 * @param ctx the parse tree
	 */
	fun exitExprlist(ctx: jvmBasicParser.ExprlistContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#sqrfunc}.
	 * @param ctx the parse tree
	 */
	fun enterSqrfunc(ctx: jvmBasicParser.SqrfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#sqrfunc}.
	 * @param ctx the parse tree
	 */
	fun exitSqrfunc(ctx: jvmBasicParser.SqrfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#chrfunc}.
	 * @param ctx the parse tree
	 */
	fun enterChrfunc(ctx: jvmBasicParser.ChrfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#chrfunc}.
	 * @param ctx the parse tree
	 */
	fun exitChrfunc(ctx: jvmBasicParser.ChrfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#lenfunc}.
	 * @param ctx the parse tree
	 */
	fun enterLenfunc(ctx: jvmBasicParser.LenfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#lenfunc}.
	 * @param ctx the parse tree
	 */
	fun exitLenfunc(ctx: jvmBasicParser.LenfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#ascfunc}.
	 * @param ctx the parse tree
	 */
	fun enterAscfunc(ctx: jvmBasicParser.AscfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#ascfunc}.
	 * @param ctx the parse tree
	 */
	fun exitAscfunc(ctx: jvmBasicParser.AscfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#midfunc}.
	 * @param ctx the parse tree
	 */
	fun enterMidfunc(ctx: jvmBasicParser.MidfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#midfunc}.
	 * @param ctx the parse tree
	 */
	fun exitMidfunc(ctx: jvmBasicParser.MidfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#pdlfunc}.
	 * @param ctx the parse tree
	 */
	fun enterPdlfunc(ctx: jvmBasicParser.PdlfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#pdlfunc}.
	 * @param ctx the parse tree
	 */
	fun exitPdlfunc(ctx: jvmBasicParser.PdlfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#peekfunc}.
	 * @param ctx the parse tree
	 */
	fun enterPeekfunc(ctx: jvmBasicParser.PeekfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#peekfunc}.
	 * @param ctx the parse tree
	 */
	fun exitPeekfunc(ctx: jvmBasicParser.PeekfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#intfunc}.
	 * @param ctx the parse tree
	 */
	fun enterIntfunc(ctx: jvmBasicParser.IntfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#intfunc}.
	 * @param ctx the parse tree
	 */
	fun exitIntfunc(ctx: jvmBasicParser.IntfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#spcfunc}.
	 * @param ctx the parse tree
	 */
	fun enterSpcfunc(ctx: jvmBasicParser.SpcfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#spcfunc}.
	 * @param ctx the parse tree
	 */
	fun exitSpcfunc(ctx: jvmBasicParser.SpcfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#frefunc}.
	 * @param ctx the parse tree
	 */
	fun enterFrefunc(ctx: jvmBasicParser.FrefuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#frefunc}.
	 * @param ctx the parse tree
	 */
	fun exitFrefunc(ctx: jvmBasicParser.FrefuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#posfunc}.
	 * @param ctx the parse tree
	 */
	fun enterPosfunc(ctx: jvmBasicParser.PosfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#posfunc}.
	 * @param ctx the parse tree
	 */
	fun exitPosfunc(ctx: jvmBasicParser.PosfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#usrfunc}.
	 * @param ctx the parse tree
	 */
	fun enterUsrfunc(ctx: jvmBasicParser.UsrfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#usrfunc}.
	 * @param ctx the parse tree
	 */
	fun exitUsrfunc(ctx: jvmBasicParser.UsrfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#leftfunc}.
	 * @param ctx the parse tree
	 */
	fun enterLeftfunc(ctx: jvmBasicParser.LeftfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#leftfunc}.
	 * @param ctx the parse tree
	 */
	fun exitLeftfunc(ctx: jvmBasicParser.LeftfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#rightfunc}.
	 * @param ctx the parse tree
	 */
	fun enterRightfunc(ctx: jvmBasicParser.RightfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#rightfunc}.
	 * @param ctx the parse tree
	 */
	fun exitRightfunc(ctx: jvmBasicParser.RightfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#strfunc}.
	 * @param ctx the parse tree
	 */
	fun enterStrfunc(ctx: jvmBasicParser.StrfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#strfunc}.
	 * @param ctx the parse tree
	 */
	fun exitStrfunc(ctx: jvmBasicParser.StrfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#fnfunc}.
	 * @param ctx the parse tree
	 */
	fun enterFnfunc(ctx: jvmBasicParser.FnfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#fnfunc}.
	 * @param ctx the parse tree
	 */
	fun exitFnfunc(ctx: jvmBasicParser.FnfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#valfunc}.
	 * @param ctx the parse tree
	 */
	fun enterValfunc(ctx: jvmBasicParser.ValfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#valfunc}.
	 * @param ctx the parse tree
	 */
	fun exitValfunc(ctx: jvmBasicParser.ValfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#scrnfunc}.
	 * @param ctx the parse tree
	 */
	fun enterScrnfunc(ctx: jvmBasicParser.ScrnfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#scrnfunc}.
	 * @param ctx the parse tree
	 */
	fun exitScrnfunc(ctx: jvmBasicParser.ScrnfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#sinfunc}.
	 * @param ctx the parse tree
	 */
	fun enterSinfunc(ctx: jvmBasicParser.SinfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#sinfunc}.
	 * @param ctx the parse tree
	 */
	fun exitSinfunc(ctx: jvmBasicParser.SinfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#cosfunc}.
	 * @param ctx the parse tree
	 */
	fun enterCosfunc(ctx: jvmBasicParser.CosfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#cosfunc}.
	 * @param ctx the parse tree
	 */
	fun exitCosfunc(ctx: jvmBasicParser.CosfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#tanfunc}.
	 * @param ctx the parse tree
	 */
	fun enterTanfunc(ctx: jvmBasicParser.TanfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#tanfunc}.
	 * @param ctx the parse tree
	 */
	fun exitTanfunc(ctx: jvmBasicParser.TanfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#atnfunc}.
	 * @param ctx the parse tree
	 */
	fun enterAtnfunc(ctx: jvmBasicParser.AtnfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#atnfunc}.
	 * @param ctx the parse tree
	 */
	fun exitAtnfunc(ctx: jvmBasicParser.AtnfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#rndfunc}.
	 * @param ctx the parse tree
	 */
	fun enterRndfunc(ctx: jvmBasicParser.RndfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#rndfunc}.
	 * @param ctx the parse tree
	 */
	fun exitRndfunc(ctx: jvmBasicParser.RndfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#sgnfunc}.
	 * @param ctx the parse tree
	 */
	fun enterSgnfunc(ctx: jvmBasicParser.SgnfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#sgnfunc}.
	 * @param ctx the parse tree
	 */
	fun exitSgnfunc(ctx: jvmBasicParser.SgnfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#expfunc}.
	 * @param ctx the parse tree
	 */
	fun enterExpfunc(ctx: jvmBasicParser.ExpfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#expfunc}.
	 * @param ctx the parse tree
	 */
	fun exitExpfunc(ctx: jvmBasicParser.ExpfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#logfunc}.
	 * @param ctx the parse tree
	 */
	fun enterLogfunc(ctx: jvmBasicParser.LogfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#logfunc}.
	 * @param ctx the parse tree
	 */
	fun exitLogfunc(ctx: jvmBasicParser.LogfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#absfunc}.
	 * @param ctx the parse tree
	 */
	fun enterAbsfunc(ctx: jvmBasicParser.AbsfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#absfunc}.
	 * @param ctx the parse tree
	 */
	fun exitAbsfunc(ctx: jvmBasicParser.AbsfuncContext)
	/**
	 * Enter a parse tree produced by {@link jvmBasicParser#tabfunc}.
	 * @param ctx the parse tree
	 */
	fun enterTabfunc(ctx: jvmBasicParser.TabfuncContext)
	/**
	 * Exit a parse tree produced by {@link jvmBasicParser#tabfunc}.
	 * @param ctx the parse tree
	 */
	fun exitTabfunc(ctx: jvmBasicParser.TabfuncContext)
}