package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import w3c.n3dev.parser.antlr.n3_nodropParser.BaseContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.BlankNodeContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.BlankNodePropertyListContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.CollectionContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.ExpressionContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.FormulaContentContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.FormulaContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.IriContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.IriPropertyListContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.LiteralContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.N3DirectiveContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.N3DocContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.N3StatementContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.NumericLiteralContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.ObjectContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.ObjectListContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.PathContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.PathItemContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.PredicateContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.PredicateObjectListContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.PrefixIDContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.PrefixedNameContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.QuickVarContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.RdfLiteralContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.SparqlBaseContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.SparqlDirectiveContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.SparqlPrefixContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.SubjectContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.TriplesContext;
import w3c.n3dev.parser.antlr.n3_nodropParser.VerbContext;

public class n3_dummyNoDropVisitor implements n3_nodropVisitor<Void>{

	@Override
	public Void visit(ParseTree tree) {
		return null;
	}

	@Override
	public Void visitChildren(RuleNode node) {
		return null;
	}

	@Override
	public Void visitTerminal(TerminalNode node) {
		return null;
	}

	@Override
	public Void visitErrorNode(ErrorNode node) {
		return null;
	}

	@Override
	public Void visitN3Doc(N3DocContext ctx) {
		return null;
	}

	@Override
	public Void visitN3Statement(N3StatementContext ctx) {
		return null;
	}

	@Override
	public Void visitN3Directive(N3DirectiveContext ctx) {
		return null;
	}

	@Override
	public Void visitSparqlDirective(SparqlDirectiveContext ctx) {
		return null;
	}

	@Override
	public Void visitSparqlBase(SparqlBaseContext ctx) {
		return null;
	}

	@Override
	public Void visitSparqlPrefix(SparqlPrefixContext ctx) {
		return null;
	}

	@Override
	public Void visitPrefixID(PrefixIDContext ctx) {
		return null;
	}

	@Override
	public Void visitBase(BaseContext ctx) {
		return null;
	}

	@Override
	public Void visitTriples(TriplesContext ctx) {
		return null;
	}

	@Override
	public Void visitPredicateObjectList(PredicateObjectListContext ctx) {
		return null;
	}

	@Override
	public Void visitObjectList(ObjectListContext ctx) {
		return null;
	}

	@Override
	public Void visitVerb(VerbContext ctx) {
		return null;
	}

	@Override
	public Void visitSubject(SubjectContext ctx) {
		return null;
	}

	@Override
	public Void visitPredicate(PredicateContext ctx) {
		return null;
	}

	@Override
	public Void visitObject(ObjectContext ctx) {
		return null;
	}

	@Override
	public Void visitExpression(ExpressionContext ctx) {
		return null;
	}

	@Override
	public Void visitPath(PathContext ctx) {
		return null;
	}

	@Override
	public Void visitPathItem(PathItemContext ctx) {
		return null;
	}

	@Override
	public Void visitLiteral(LiteralContext ctx) {
		return null;
	}

	@Override
	public Void visitBlankNodePropertyList(BlankNodePropertyListContext ctx) {
		return null;
	}

	@Override
	public Void visitIriPropertyList(IriPropertyListContext ctx) {
		return null;
	}

	@Override
	public Void visitCollection(CollectionContext ctx) {
		return null;
	}

	@Override
	public Void visitFormula(FormulaContext ctx) {
		return null;
	}

	@Override
	public Void visitFormulaContent(FormulaContentContext ctx) {
		return null;
	}

	@Override
	public Void visitNumericLiteral(NumericLiteralContext ctx) {
		return null;
	}

	@Override
	public Void visitRdfLiteral(RdfLiteralContext ctx) {
		return null;
	}

	@Override
	public Void visitIri(IriContext ctx) {
		return null;
	}

	@Override
	public Void visitPrefixedName(PrefixedNameContext ctx) {
		return null;
	}

	@Override
	public Void visitBlankNode(BlankNodeContext ctx) {
		return null;
	}

	@Override
	public Void visitQuickVar(QuickVarContext ctx) {
		return null;
	}

}
