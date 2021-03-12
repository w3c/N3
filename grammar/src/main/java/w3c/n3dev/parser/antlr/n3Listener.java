// Generated from n3.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link n3Parser}.
 */
public interface n3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link n3Parser#n3Doc}.
	 * @param ctx the parse tree
	 */
	void enterN3Doc(n3Parser.N3DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#n3Doc}.
	 * @param ctx the parse tree
	 */
	void exitN3Doc(n3Parser.N3DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#n3Statement}.
	 * @param ctx the parse tree
	 */
	void enterN3Statement(n3Parser.N3StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#n3Statement}.
	 * @param ctx the parse tree
	 */
	void exitN3Statement(n3Parser.N3StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#n3Directive}.
	 * @param ctx the parse tree
	 */
	void enterN3Directive(n3Parser.N3DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#n3Directive}.
	 * @param ctx the parse tree
	 */
	void exitN3Directive(n3Parser.N3DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#sparqlDirective}.
	 * @param ctx the parse tree
	 */
	void enterSparqlDirective(n3Parser.SparqlDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#sparqlDirective}.
	 * @param ctx the parse tree
	 */
	void exitSparqlDirective(n3Parser.SparqlDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void enterSparqlBase(n3Parser.SparqlBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void exitSparqlBase(n3Parser.SparqlBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSparqlPrefix(n3Parser.SparqlPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSparqlPrefix(n3Parser.SparqlPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#prefixID}.
	 * @param ctx the parse tree
	 */
	void enterPrefixID(n3Parser.PrefixIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#prefixID}.
	 * @param ctx the parse tree
	 */
	void exitPrefixID(n3Parser.PrefixIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(n3Parser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(n3Parser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#triples}.
	 * @param ctx the parse tree
	 */
	void enterTriples(n3Parser.TriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#triples}.
	 * @param ctx the parse tree
	 */
	void exitTriples(n3Parser.TriplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateObjectList(n3Parser.PredicateObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateObjectList(n3Parser.PredicateObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(n3Parser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(n3Parser.ObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(n3Parser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(n3Parser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(n3Parser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(n3Parser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(n3Parser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(n3Parser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(n3Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(n3Parser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(n3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(n3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(n3Parser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(n3Parser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#pathItem}.
	 * @param ctx the parse tree
	 */
	void enterPathItem(n3Parser.PathItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#pathItem}.
	 * @param ctx the parse tree
	 */
	void exitPathItem(n3Parser.PathItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(n3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(n3Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(n3Parser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(n3Parser.BlankNodePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(n3Parser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(n3Parser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(n3Parser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(n3Parser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#formulaContent}.
	 * @param ctx the parse tree
	 */
	void enterFormulaContent(n3Parser.FormulaContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#formulaContent}.
	 * @param ctx the parse tree
	 */
	void exitFormulaContent(n3Parser.FormulaContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(n3Parser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(n3Parser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfLiteral(n3Parser.RdfLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfLiteral(n3Parser.RdfLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(n3Parser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(n3Parser.IriContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedName(n3Parser.PrefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedName(n3Parser.PrefixedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#blankNode}.
	 * @param ctx the parse tree
	 */
	void enterBlankNode(n3Parser.BlankNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#blankNode}.
	 * @param ctx the parse tree
	 */
	void exitBlankNode(n3Parser.BlankNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3Parser#quickVar}.
	 * @param ctx the parse tree
	 */
	void enterQuickVar(n3Parser.QuickVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3Parser#quickVar}.
	 * @param ctx the parse tree
	 */
	void exitQuickVar(n3Parser.QuickVarContext ctx);
}