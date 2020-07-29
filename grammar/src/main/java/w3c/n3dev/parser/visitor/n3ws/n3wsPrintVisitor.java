package w3c.n3dev.parser.visitor.n3ws;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.antlr.n3wsParser;
import wvw.utils.log.Log;

public class n3wsPrintVisitor extends n3wsDefaultVisitor {

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
	public Void visitN3Doc(n3wsParser.N3DocContext ctx) {
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
	public Void visitN3Statement(n3wsParser.N3StatementContext ctx) {
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
	public Void visitN3Directive(n3wsParser.N3DirectiveContext ctx) {
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
	public Void visitSparqlDirective(n3wsParser.SparqlDirectiveContext ctx) {
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
	public Void visitSparqlBase(n3wsParser.SparqlBaseContext ctx) {
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
	public Void visitSparqlPrefix(n3wsParser.SparqlPrefixContext ctx) {
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
	public Void visitPrefixID(n3wsParser.PrefixIDContext ctx) {
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
	public Void visitBase(n3wsParser.BaseContext ctx) {
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
	public Void visitTriples(n3wsParser.TriplesContext ctx) {
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
	public Void visitPredicateObjectList(n3wsParser.PredicateObjectListContext ctx) {
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
	public Void visitObjectList(n3wsParser.ObjectListContext ctx) {
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
	public Void visitVerb(n3wsParser.VerbContext ctx) {
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
	public Void visitSubject(n3wsParser.SubjectContext ctx) {
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
	public Void visitPredicate(n3wsParser.PredicateContext ctx) {
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
	public Void visitObject(n3wsParser.ObjectContext ctx) {
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
	public Void visitExpression(n3wsParser.ExpressionContext ctx) {
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
	public Void visitPath(n3wsParser.PathContext ctx) {
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
	public Void visitPathItem(n3wsParser.PathItemContext ctx) {
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
	public Void visitLiteral(n3wsParser.LiteralContext ctx) {
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
	public Void visitBlankNodePropertyList(n3wsParser.BlankNodePropertyListContext ctx) {
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
	public Void visitCollection(n3wsParser.CollectionContext ctx) {
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
	public Void visitFormula(n3wsParser.FormulaContext ctx) {
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
	public Void visitFormulaContent(n3wsParser.FormulaContentContext ctx) {
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
	public Void visitRdfLiteral(n3wsParser.RdfLiteralContext ctx) {
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
	public Void visitIri(n3wsParser.IriContext ctx) {
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
	public Void visitIriList(n3wsParser.IriListContext ctx) {
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
	public Void visitPrefixedName(n3wsParser.PrefixedNameContext ctx) {
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
	public Void visitExistential(n3wsParser.ExistentialContext ctx) {
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
	public Void visitUniversal(n3wsParser.UniversalContext ctx) {
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
					out += " (" + n3wsParser.tokenNames[type] + ")";
				print(out);

			} else {
				Void childResult = c.accept(this);
				result = aggregateResult(result, childResult);
			}
		}

		return result;
	}
}