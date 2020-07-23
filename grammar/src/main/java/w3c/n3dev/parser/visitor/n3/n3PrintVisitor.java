package w3c.n3dev.parser.visitor.n3;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.antlr.n3Parser;
import wvw.utils.log.Log;

public class n3PrintVisitor extends n3DefaultVisitor {

	private int lvl = 0;

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitN3Doc(n3Parser.N3DocContext ctx) {
		print("N3Doc");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitN3Statement(n3Parser.N3StatementContext ctx) {
		print("N3Statement");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitN3Directive(n3Parser.N3DirectiveContext ctx) {
		print("N3Directive");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitSparqlDirective(n3Parser.SparqlDirectiveContext ctx) {
		print("SparqlDirective");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitSparqlBase(n3Parser.SparqlBaseContext ctx) {
		print("SparqlBase");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitSparqlPrefix(n3Parser.SparqlPrefixContext ctx) {
		print("SparqlPrefix");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitPrefixID(n3Parser.PrefixIDContext ctx) {
		print("PrefixID");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitBase(n3Parser.BaseContext ctx) {
		print("Base");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitTriples(n3Parser.TriplesContext ctx) {
		print("Triples");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitPredicateObjectList(n3Parser.PredicateObjectListContext ctx) {
		print("PredicateObjectList");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitObjectList(n3Parser.ObjectListContext ctx) {
		print("ObjectList");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitVerb(n3Parser.VerbContext ctx) {
		print("Verb");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitSubject(n3Parser.SubjectContext ctx) {
		print("Subject");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitPredicate(n3Parser.PredicateContext ctx) {
		print("Predicate");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitObject(n3Parser.ObjectContext ctx) {
		print("Object");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitExpression(n3Parser.ExpressionContext ctx) {
		print("Expression");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitPath(n3Parser.PathContext ctx) {
		print("Path");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitPathItem(n3Parser.PathItemContext ctx) {
		print("PathItem");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitLiteral(n3Parser.LiteralContext ctx) {
		print("Literal");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitBlankNodePropertyList(n3Parser.BlankNodePropertyListContext ctx) {
		print("BlankNodePropertyList");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitCollection(n3Parser.CollectionContext ctx) {
		print("Collection");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitFormula(n3Parser.FormulaContext ctx) {
		print("Formula");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitFormulaContent(n3Parser.FormulaContentContext ctx) {
		print("FormulaContent");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitRdfLiteral(n3Parser.RdfLiteralContext ctx) {
		print("RdfLiteral");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitIri(n3Parser.IriContext ctx) {
		print("Iri");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitIriList(n3Parser.IriListContext ctx) {
		print("IriList");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitPrefixedName(n3Parser.PrefixedNameContext ctx) {
		print("PrefixedName");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitExistential(n3Parser.ExistentialContext ctx) {
		print("Existential");
		return doVisitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Void visitUniversal(n3Parser.UniversalContext ctx) {
		print("Universal");
		return doVisitChildren(ctx);
	}

	private void print(String element) {
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < lvl; i++)
			str.append(" ");

		str.append(element);
		Log.i(str);
	}

	private Void doVisitChildren(RuleNode ctx) {
		lvl++;
		Void ret = visitChildren(ctx);
		lvl--;

		return ret;
	}

	@Override
	public Void visitChildren(RuleNode node) {
		Void result = defaultResult();
		int n = node.getChildCount();
		for (int i = 0; i < n; i++) {
			if (!shouldVisitNextChild(node, result)) {
				break;
			}

			ParseTree c = node.getChild(i);
			if (c instanceof TerminalNode) {
				TerminalNode t = (TerminalNode) c;
				String out = c.toString();
				int type = t.getSymbol().getType();
				if (type != -1)
					out += " (" + n3Parser.tokenNames[type] + ")";
				print(out);

			} else {
				Void childResult = c.accept(this);
				result = aggregateResult(result, childResult);
			}
		}

		return result;
	}
}
