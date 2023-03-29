// Generated from n3_nodrop.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link n3_nodropParser}.
 */
public interface n3_nodropListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#n3Doc}.
	 * @param ctx the parse tree
	 */
	void enterN3Doc(n3_nodropParser.N3DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#n3Doc}.
	 * @param ctx the parse tree
	 */
	void exitN3Doc(n3_nodropParser.N3DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#n3Statement}.
	 * @param ctx the parse tree
	 */
	void enterN3Statement(n3_nodropParser.N3StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#n3Statement}.
	 * @param ctx the parse tree
	 */
	void exitN3Statement(n3_nodropParser.N3StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#n3Directive}.
	 * @param ctx the parse tree
	 */
	void enterN3Directive(n3_nodropParser.N3DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#n3Directive}.
	 * @param ctx the parse tree
	 */
	void exitN3Directive(n3_nodropParser.N3DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#sparqlDirective}.
	 * @param ctx the parse tree
	 */
	void enterSparqlDirective(n3_nodropParser.SparqlDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#sparqlDirective}.
	 * @param ctx the parse tree
	 */
	void exitSparqlDirective(n3_nodropParser.SparqlDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void enterSparqlBase(n3_nodropParser.SparqlBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void exitSparqlBase(n3_nodropParser.SparqlBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSparqlPrefix(n3_nodropParser.SparqlPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSparqlPrefix(n3_nodropParser.SparqlPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void enterPrefixID(n3_nodropParser.PrefixIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void exitPrefixID(n3_nodropParser.PrefixIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(n3_nodropParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(n3_nodropParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#triples}.
	 * @param ctx the parse tree
	 */
	void enterTriples(n3_nodropParser.TriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#triples}.
	 * @param ctx the parse tree
	 */
	void exitTriples(n3_nodropParser.TriplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateObjectList(n3_nodropParser.PredicateObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateObjectList(n3_nodropParser.PredicateObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(n3_nodropParser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(n3_nodropParser.ObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(n3_nodropParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(n3_nodropParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(n3_nodropParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(n3_nodropParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(n3_nodropParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(n3_nodropParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(n3_nodropParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(n3_nodropParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(n3_nodropParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(n3_nodropParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(n3_nodropParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(n3_nodropParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#pathItem}.
	 * @param ctx the parse tree
	 */
	void enterPathItem(n3_nodropParser.PathItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#pathItem}.
	 * @param ctx the parse tree
	 */
	void exitPathItem(n3_nodropParser.PathItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(n3_nodropParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(n3_nodropParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(n3_nodropParser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(n3_nodropParser.BlankNodePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#iriPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterIriPropertyList(n3_nodropParser.IriPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#iriPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitIriPropertyList(n3_nodropParser.IriPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(n3_nodropParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(n3_nodropParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(n3_nodropParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(n3_nodropParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#formulaContent}.
	 * @param ctx the parse tree
	 */
	void enterFormulaContent(n3_nodropParser.FormulaContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#formulaContent}.
	 * @param ctx the parse tree
	 */
	void exitFormulaContent(n3_nodropParser.FormulaContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(n3_nodropParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(n3_nodropParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfLiteral(n3_nodropParser.RdfLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfLiteral(n3_nodropParser.RdfLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(n3_nodropParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(n3_nodropParser.IriContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedName(n3_nodropParser.PrefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedName(n3_nodropParser.PrefixedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void enterBlankNode(n3_nodropParser.BlankNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void exitBlankNode(n3_nodropParser.BlankNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link n3_nodropParser#quickVar}.
	 * @param ctx the parse tree
	 */
	void enterQuickVar(n3_nodropParser.QuickVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link n3_nodropParser#quickVar}.
	 * @param ctx the parse tree
	 */
	void exitQuickVar(n3_nodropParser.QuickVarContext ctx);
}