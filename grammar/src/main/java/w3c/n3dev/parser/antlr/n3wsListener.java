// Generated from n3ws.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link n3wsParser}.
 */
public interface n3wsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link n3wsParser#n3Doc}.
	 * @param ctx the parse tree
	 */
	void enterN3Doc(n3wsParser.N3DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#n3Doc}.
	 * @param ctx the parse tree
	 */
	void exitN3Doc(n3wsParser.N3DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#n3Statement}.
	 * @param ctx the parse tree
	 */
	void enterN3Statement(n3wsParser.N3StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#n3Statement}.
	 * @param ctx the parse tree
	 */
	void exitN3Statement(n3wsParser.N3StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#n3Directive}.
	 * @param ctx the parse tree
	 */
	void enterN3Directive(n3wsParser.N3DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#n3Directive}.
	 * @param ctx the parse tree
	 */
	void exitN3Directive(n3wsParser.N3DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#sparqlDirective}.
	 * @param ctx the parse tree
	 */
	void enterSparqlDirective(n3wsParser.SparqlDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#sparqlDirective}.
	 * @param ctx the parse tree
	 */
	void exitSparqlDirective(n3wsParser.SparqlDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void enterSparqlBase(n3wsParser.SparqlBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void exitSparqlBase(n3wsParser.SparqlBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSparqlPrefix(n3wsParser.SparqlPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSparqlPrefix(n3wsParser.SparqlPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void enterPrefixID(n3wsParser.PrefixIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void exitPrefixID(n3wsParser.PrefixIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(n3wsParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(n3wsParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#triples}.
	 * @param ctx the parse tree
	 */
	void enterTriples(n3wsParser.TriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#triples}.
	 * @param ctx the parse tree
	 */
	void exitTriples(n3wsParser.TriplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateObjectList(n3wsParser.PredicateObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateObjectList(n3wsParser.PredicateObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(n3wsParser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(n3wsParser.ObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(n3wsParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(n3wsParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(n3wsParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(n3wsParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(n3wsParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(n3wsParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(n3wsParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(n3wsParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(n3wsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(n3wsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(n3wsParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(n3wsParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#pathItem}.
	 * @param ctx the parse tree
	 */
	void enterPathItem(n3wsParser.PathItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#pathItem}.
	 * @param ctx the parse tree
	 */
	void exitPathItem(n3wsParser.PathItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(n3wsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(n3wsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(n3wsParser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(n3wsParser.BlankNodePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(n3wsParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(n3wsParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(n3wsParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(n3wsParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#formulaContent}.
	 * @param ctx the parse tree
	 */
	void enterFormulaContent(n3wsParser.FormulaContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#formulaContent}.
	 * @param ctx the parse tree
	 */
	void exitFormulaContent(n3wsParser.FormulaContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(n3wsParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(n3wsParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfLiteral(n3wsParser.RdfLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfLiteral(n3wsParser.RdfLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(n3wsParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(n3wsParser.IriContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#iriList}.
	 * @param ctx the parse tree
	 */
	void enterIriList(n3wsParser.IriListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#iriList}.
	 * @param ctx the parse tree
	 */
	void exitIriList(n3wsParser.IriListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedName(n3wsParser.PrefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedName(n3wsParser.PrefixedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void enterBlankNode(n3wsParser.BlankNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void exitBlankNode(n3wsParser.BlankNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#quickVar}.
	 * @param ctx the parse tree
	 */
	void enterQuickVar(n3wsParser.QuickVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#quickVar}.
	 * @param ctx the parse tree
	 */
	void exitQuickVar(n3wsParser.QuickVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#existential}.
	 * @param ctx the parse tree
	 */
	void enterExistential(n3wsParser.ExistentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#existential}.
	 * @param ctx the parse tree
	 */
	void exitExistential(n3wsParser.ExistentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#universal}.
	 * @param ctx the parse tree
	 */
	void enterUniversal(n3wsParser.UniversalContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#universal}.
	 * @param ctx the parse tree
	 */
	void exitUniversal(n3wsParser.UniversalContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3wsParser#langTag}.
	 * @param ctx the parse tree
	 */
	void enterLangTag(n3wsParser.LangTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3wsParser#langTag}.
	 * @param ctx the parse tree
	 */
	void exitLangTag(n3wsParser.LangTagContext ctx);
}