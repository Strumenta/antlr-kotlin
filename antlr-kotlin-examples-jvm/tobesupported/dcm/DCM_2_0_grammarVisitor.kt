// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DCM_2_0_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface DCM_2_0_grammarVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#konservierung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKonservierung(ctx : DCM_2_0_grammarParser.KonservierungContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kons_kopf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKons_kopf(ctx : DCM_2_0_grammarParser.Kons_kopfContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#modulkopf_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitModulkopf_info(ctx : DCM_2_0_grammarParser.Modulkopf_infoContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#mod_zeile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMod_zeile(ctx : DCM_2_0_grammarParser.Mod_zeileContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#mod_anf_zeile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMod_anf_zeile(ctx : DCM_2_0_grammarParser.Mod_anf_zeileContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#mod_fort_zeile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMod_fort_zeile(ctx : DCM_2_0_grammarParser.Mod_fort_zeileContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#mod_ele_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMod_ele_name(ctx : DCM_2_0_grammarParser.Mod_ele_nameContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#mod_ele_wert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMod_ele_wert(ctx : DCM_2_0_grammarParser.Mod_ele_wertContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#funktionsdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunktionsdef(ctx : DCM_2_0_grammarParser.FunktionsdefContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#funktionszeile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunktionszeile(ctx : DCM_2_0_grammarParser.FunktionszeileContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#fkt_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFkt_version(ctx : DCM_2_0_grammarParser.Fkt_versionContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#fkt_langname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFkt_langname(ctx : DCM_2_0_grammarParser.Fkt_langnameContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#variantendef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVariantendef(ctx : DCM_2_0_grammarParser.VariantendefContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#variantenkrit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVariantenkrit(ctx : DCM_2_0_grammarParser.VariantenkritContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#krit_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKrit_name(ctx : DCM_2_0_grammarParser.Krit_nameContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#krit_wert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKrit_wert(ctx : DCM_2_0_grammarParser.Krit_wertContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kons_rumpf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKons_rumpf(ctx : DCM_2_0_grammarParser.Kons_rumpfContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kenngroesse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKenngroesse(ctx : DCM_2_0_grammarParser.KenngroesseContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kennwert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKennwert(ctx : DCM_2_0_grammarParser.KennwertContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kennwerteblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKennwerteblock(ctx : DCM_2_0_grammarParser.KennwerteblockContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kennlinie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKennlinie(ctx : DCM_2_0_grammarParser.KennlinieContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kennfeld}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKennfeld(ctx : DCM_2_0_grammarParser.KennfeldContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#gruppenstuetzstellen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGruppenstuetzstellen(ctx : DCM_2_0_grammarParser.GruppenstuetzstellenContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kenntext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKenntext(ctx : DCM_2_0_grammarParser.KenntextContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kgr_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKgr_info(ctx : DCM_2_0_grammarParser.Kgr_infoContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#einheit_x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEinheit_x(ctx : DCM_2_0_grammarParser.Einheit_xContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#einheit_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEinheit_y(ctx : DCM_2_0_grammarParser.Einheit_yContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#einheit_w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEinheit_w(ctx : DCM_2_0_grammarParser.Einheit_wContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#langname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLangname(ctx : DCM_2_0_grammarParser.LangnameContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#displayname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDisplayname(ctx : DCM_2_0_grammarParser.DisplaynameContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#var_abhangigkeiten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVar_abhangigkeiten(ctx : DCM_2_0_grammarParser.Var_abhangigkeitenContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#var_abh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitVar_abh(ctx : DCM_2_0_grammarParser.Var_abhContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#funktionszugehorigkeit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunktionszugehorigkeit(ctx : DCM_2_0_grammarParser.FunktionszugehorigkeitContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#anzahl_x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAnzahl_x(ctx : DCM_2_0_grammarParser.Anzahl_xContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#anzahl_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAnzahl_y(ctx : DCM_2_0_grammarParser.Anzahl_yContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#werteliste}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWerteliste(ctx : DCM_2_0_grammarParser.WertelisteContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#werteliste_kwb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWerteliste_kwb(ctx : DCM_2_0_grammarParser.Werteliste_kwbContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#sst_liste_x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSst_liste_x(ctx : DCM_2_0_grammarParser.Sst_liste_xContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKf_zeile_liste(ctx : DCM_2_0_grammarParser.Kf_zeile_listeContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKf_zeile_liste_r(ctx : DCM_2_0_grammarParser.Kf_zeile_liste_rContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste_tx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitKf_zeile_liste_tx(ctx : DCM_2_0_grammarParser.Kf_zeile_liste_txContext) : T
	/**
	 * Visit a parse tree produced by {@link DCM_2_0_grammarParser#realzahl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRealzahl(ctx : DCM_2_0_grammarParser.RealzahlContext) : T
}