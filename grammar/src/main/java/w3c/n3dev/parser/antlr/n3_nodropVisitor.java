// Generated from n3_nodrop.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link n3_nodropParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface n3_nodropVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#n3Doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN3Doc(n3_nodropParser.N3DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#n3Statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN3Statement(n3_nodropParser.N3StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#n3Directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN3Directive(n3_nodropParser.N3DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#sparqlDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlDirective(n3_nodropParser.SparqlDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#sparqlBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlBase(n3_nodropParser.SparqlBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlPrefix(n3_nodropParser.SparqlPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#prefixID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixID(n3_nodropParser.PrefixIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(n3_nodropParser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#triples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriples(n3_nodropParser.TriplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#predicateObjectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateObjectList(n3_nodropParser.PredicateObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#objectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectList(n3_nodropParser.ObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(n3_nodropParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(n3_nodropParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(n3_nodropParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(n3_nodropParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(n3_nodropParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(n3_nodropParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#pathItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathItem(n3_nodropParser.PathItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(n3_nodropParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNodePropertyList(n3_nodropParser.BlankNodePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#iriPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIriPropertyList(n3_nodropParser.IriPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(n3_nodropParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(n3_nodropParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#formulaContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormulaContent(n3_nodropParser.FormulaContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(n3_nodropParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#rdfLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdfLiteral(n3_nodropParser.RdfLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(n3_nodropParser.IriContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#prefixedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedName(n3_nodropParser.PrefixedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#blankNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNode(n3_nodropParser.BlankNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link n3_nodropParser#quickVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuickVar(n3_nodropParser.QuickVarContext ctx);
}