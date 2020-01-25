// Generated from n3.g4 by ANTLR 4.7.2

    package parser.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class n3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, COMMENT=28, NumericLiteral=29, BooleanLiteral=30, 
		String=31, BlankNode=32, QuickVar=33, IRIREF=34, PNAME_NS=35, PNAME_LN=36, 
		BLANK_NODE_LABEL=37, LANGTAG=38, INTEGER=39, DECIMAL=40, DOUBLE=41, EXPONENT=42, 
		STRING_LITERAL_LONG_SINGLE_QUOTE=43, STRING_LITERAL_LONG_QUOTE=44, STRING_LITERAL_QUOTE=45, 
		STRING_LITERAL_SINGLE_QUOTE=46, UCHAR=47, ECHAR=48, WS=49, ANON=50, PN_CHARS_BASE=51, 
		PN_CHARS_U=52, PN_CHARS=53, BASE=54, PREFIX=55, PN_PREFIX=56, PN_LOCAL=57, 
		PLX=58, PERCENT=59, HEX=60, PN_LOCAL_ESC=61;
	public static final int
		RULE_n3Doc = 0, RULE_n3Statement = 1, RULE_n3Directive = 2, RULE_sparqlDirective = 3, 
		RULE_sparqlBase = 4, RULE_sparqlPrefix = 5, RULE_prefixID = 6, RULE_base = 7, 
		RULE_triples = 8, RULE_predicateObjectList = 9, RULE_objectList = 10, 
		RULE_verb = 11, RULE_subject = 12, RULE_predicate = 13, RULE_object = 14, 
		RULE_expression = 15, RULE_path = 16, RULE_pathItem = 17, RULE_literal = 18, 
		RULE_blankNodePropertyList = 19, RULE_collection = 20, RULE_formula = 21, 
		RULE_formulaContent = 22, RULE_rdfLiteral = 23, RULE_iri = 24, RULE_iriList = 25, 
		RULE_prefixedName = 26, RULE_existential = 27, RULE_universal = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"n3Doc", "n3Statement", "n3Directive", "sparqlDirective", "sparqlBase", 
			"sparqlPrefix", "prefixID", "base", "triples", "predicateObjectList", 
			"objectList", "verb", "subject", "predicate", "object", "expression", 
			"path", "pathItem", "literal", "blankNodePropertyList", "collection", 
			"formula", "formulaContent", "rdfLiteral", "iri", "iriList", "prefixedName", 
			"existential", "universal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@prefix'", "'@base'", "';'", "','", "'a'", "'@a'", "'has'", 
			"'@has'", "'is'", "'of'", "'@is'", "'@of'", "'='", "'<='", "'=>'", "'^'", 
			"'!'", "'['", "']'", "'('", "')'", "'{'", "'}'", "'^^'", "'@forSome'", 
			"'@forAll'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "COMMENT", "NumericLiteral", "BooleanLiteral", 
			"String", "BlankNode", "QuickVar", "IRIREF", "PNAME_NS", "PNAME_LN", 
			"BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", 
			"STRING_LITERAL_LONG_SINGLE_QUOTE", "STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", 
			"STRING_LITERAL_SINGLE_QUOTE", "UCHAR", "ECHAR", "WS", "ANON", "PN_CHARS_BASE", 
			"PN_CHARS_U", "PN_CHARS", "BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", 
			"PLX", "PERCENT", "HEX", "PN_LOCAL_ESC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "n3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public n3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class N3DocContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(n3Parser.EOF, 0); }
		public List<N3StatementContext> n3Statement() {
			return getRuleContexts(N3StatementContext.class);
		}
		public N3StatementContext n3Statement(int i) {
			return getRuleContext(N3StatementContext.class,i);
		}
		public List<SparqlDirectiveContext> sparqlDirective() {
			return getRuleContexts(SparqlDirectiveContext.class);
		}
		public SparqlDirectiveContext sparqlDirective(int i) {
			return getRuleContext(SparqlDirectiveContext.class,i);
		}
		public N3DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n3Doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterN3Doc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitN3Doc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitN3Doc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N3DocContext n3Doc() throws RecognitionException {
		N3DocContext _localctx = new N3DocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_n3Doc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << String) | (1L << BlankNode) | (1L << QuickVar) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BASE) | (1L << PREFIX))) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__18:
				case T__20:
				case T__22:
				case T__25:
				case T__26:
				case NumericLiteral:
				case BooleanLiteral:
				case String:
				case BlankNode:
				case QuickVar:
				case IRIREF:
				case PNAME_NS:
				case PNAME_LN:
					{
					setState(58);
					n3Statement();
					setState(59);
					match(T__0);
					}
					break;
				case BASE:
				case PREFIX:
					{
					setState(61);
					sparqlDirective();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class N3StatementContext extends ParserRuleContext {
		public N3DirectiveContext n3Directive() {
			return getRuleContext(N3DirectiveContext.class,0);
		}
		public TriplesContext triples() {
			return getRuleContext(TriplesContext.class,0);
		}
		public ExistentialContext existential() {
			return getRuleContext(ExistentialContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public N3StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n3Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterN3Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitN3Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitN3Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N3StatementContext n3Statement() throws RecognitionException {
		N3StatementContext _localctx = new N3StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_n3Statement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				n3Directive();
				}
				break;
			case T__18:
			case T__20:
			case T__22:
			case NumericLiteral:
			case BooleanLiteral:
			case String:
			case BlankNode:
			case QuickVar:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				triples();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				existential();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				universal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class N3DirectiveContext extends ParserRuleContext {
		public PrefixIDContext prefixID() {
			return getRuleContext(PrefixIDContext.class,0);
		}
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public N3DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n3Directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterN3Directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitN3Directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitN3Directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N3DirectiveContext n3Directive() throws RecognitionException {
		N3DirectiveContext _localctx = new N3DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_n3Directive);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				prefixID();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				base();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SparqlDirectiveContext extends ParserRuleContext {
		public SparqlBaseContext sparqlBase() {
			return getRuleContext(SparqlBaseContext.class,0);
		}
		public SparqlPrefixContext sparqlPrefix() {
			return getRuleContext(SparqlPrefixContext.class,0);
		}
		public SparqlDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterSparqlDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitSparqlDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitSparqlDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparqlDirectiveContext sparqlDirective() throws RecognitionException {
		SparqlDirectiveContext _localctx = new SparqlDirectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sparqlDirective);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				sparqlBase();
				}
				break;
			case PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				sparqlPrefix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SparqlBaseContext extends ParserRuleContext {
		public TerminalNode BASE() { return getToken(n3Parser.BASE, 0); }
		public TerminalNode IRIREF() { return getToken(n3Parser.IRIREF, 0); }
		public SparqlBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterSparqlBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitSparqlBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitSparqlBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparqlBaseContext sparqlBase() throws RecognitionException {
		SparqlBaseContext _localctx = new SparqlBaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sparqlBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(BASE);
			setState(84);
			match(IRIREF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SparqlPrefixContext extends ParserRuleContext {
		public TerminalNode PREFIX() { return getToken(n3Parser.PREFIX, 0); }
		public TerminalNode PNAME_NS() { return getToken(n3Parser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(n3Parser.IRIREF, 0); }
		public SparqlPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterSparqlPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitSparqlPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitSparqlPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparqlPrefixContext sparqlPrefix() throws RecognitionException {
		SparqlPrefixContext _localctx = new SparqlPrefixContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sparqlPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(PREFIX);
			setState(87);
			match(PNAME_NS);
			setState(88);
			match(IRIREF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixIDContext extends ParserRuleContext {
		public TerminalNode PNAME_NS() { return getToken(n3Parser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(n3Parser.IRIREF, 0); }
		public PrefixIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterPrefixID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitPrefixID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitPrefixID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixIDContext prefixID() throws RecognitionException {
		PrefixIDContext _localctx = new PrefixIDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prefixID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__1);
			setState(91);
			match(PNAME_NS);
			setState(92);
			match(IRIREF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(n3Parser.IRIREF, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__2);
			setState(95);
			match(IRIREF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriplesContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public TriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitTriples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitTriples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriplesContext triples() throws RecognitionException {
		TriplesContext _localctx = new TriplesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_triples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(97);
				subject();
				}
				break;
			case 2:
				{
				setState(98);
				blankNodePropertyList();
				}
				break;
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << String) | (1L << BlankNode) | (1L << QuickVar) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN))) != 0)) {
				{
				setState(101);
				predicateObjectList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateObjectListContext extends ParserRuleContext {
		public List<VerbContext> verb() {
			return getRuleContexts(VerbContext.class);
		}
		public VerbContext verb(int i) {
			return getRuleContext(VerbContext.class,i);
		}
		public List<ObjectListContext> objectList() {
			return getRuleContexts(ObjectListContext.class);
		}
		public ObjectListContext objectList(int i) {
			return getRuleContext(ObjectListContext.class,i);
		}
		public PredicateObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateObjectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterPredicateObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitPredicateObjectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitPredicateObjectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateObjectListContext predicateObjectList() throws RecognitionException {
		PredicateObjectListContext _localctx = new PredicateObjectListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicateObjectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			verb();
			setState(105);
			objectList();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(106);
				match(T__3);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << String) | (1L << BlankNode) | (1L << QuickVar) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN))) != 0)) {
					{
					setState(107);
					verb();
					setState(108);
					objectList();
					}
				}

				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectListContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitObjectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitObjectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			object();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(118);
				match(T__4);
				setState(119);
				object();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitVerb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_verb);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__18:
			case T__20:
			case T__22:
			case NumericLiteral:
			case BooleanLiteral:
			case String:
			case BlankNode:
			case QuickVar:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				predicate();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(T__7);
				setState(129);
				expression();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(T__8);
				setState(131);
				expression();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(T__9);
				setState(133);
				expression();
				setState(134);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				match(T__11);
				setState(137);
				expression();
				setState(138);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__20:
			case T__22:
			case NumericLiteral:
			case BooleanLiteral:
			case String:
			case BlankNode:
			case QuickVar:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				{
				setState(147);
				expression();
				}
				break;
			case T__16:
				{
				setState(148);
				match(T__16);
				setState(149);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public PathItemContext pathItem() {
			return getRuleContext(PathItemContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			pathItem();
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(157);
				match(T__17);
				setState(158);
				path();
				}
				break;
			case 2:
				{
				setState(159);
				match(T__16);
				setState(160);
				path();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathItemContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode BlankNode() { return getToken(n3Parser.BlankNode, 0); }
		public TerminalNode QuickVar() { return getToken(n3Parser.QuickVar, 0); }
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public PathItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterPathItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitPathItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitPathItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathItemContext pathItem() throws RecognitionException {
		PathItemContext _localctx = new PathItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pathItem);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				iri();
				}
				break;
			case BlankNode:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(BlankNode);
				}
				break;
			case QuickVar:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(QuickVar);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				collection();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				blankNodePropertyList();
				}
				break;
			case NumericLiteral:
			case BooleanLiteral:
			case String:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				literal();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				formula();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public TerminalNode NumericLiteral() { return getToken(n3Parser.NumericLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(n3Parser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				rdfLiteral();
				}
				break;
			case NumericLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(NumericLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(BooleanLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlankNodePropertyListContext extends ParserRuleContext {
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public BlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterBlankNodePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitBlankNodePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitBlankNodePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankNodePropertyListContext blankNodePropertyList() throws RecognitionException {
		BlankNodePropertyListContext _localctx = new BlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blankNodePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__18);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << String) | (1L << BlankNode) | (1L << QuickVar) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN))) != 0)) {
				{
				setState(178);
				predicateObjectList();
				}
			}

			setState(181);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__20);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << String) | (1L << BlankNode) | (1L << QuickVar) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN))) != 0)) {
				{
				{
				setState(184);
				object();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaContext extends ParserRuleContext {
		public FormulaContentContext formulaContent() {
			return getRuleContext(FormulaContentContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__22);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << String) | (1L << BlankNode) | (1L << QuickVar) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BASE) | (1L << PREFIX))) != 0)) {
				{
				setState(193);
				formulaContent();
				}
			}

			setState(196);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaContentContext extends ParserRuleContext {
		public N3StatementContext n3Statement() {
			return getRuleContext(N3StatementContext.class,0);
		}
		public FormulaContentContext formulaContent() {
			return getRuleContext(FormulaContentContext.class,0);
		}
		public SparqlDirectiveContext sparqlDirective() {
			return getRuleContext(SparqlDirectiveContext.class,0);
		}
		public FormulaContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterFormulaContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitFormulaContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitFormulaContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContentContext formulaContent() throws RecognitionException {
		FormulaContentContext _localctx = new FormulaContentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formulaContent);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__18:
			case T__20:
			case T__22:
			case T__25:
			case T__26:
			case NumericLiteral:
			case BooleanLiteral:
			case String:
			case BlankNode:
			case QuickVar:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				n3Statement();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(199);
					match(T__0);
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << String) | (1L << BlankNode) | (1L << QuickVar) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BASE) | (1L << PREFIX))) != 0)) {
						{
						setState(200);
						formulaContent();
						}
					}

					}
				}

				}
				break;
			case BASE:
			case PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				sparqlDirective();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << String) | (1L << BlankNode) | (1L << QuickVar) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BASE) | (1L << PREFIX))) != 0)) {
					{
					setState(206);
					formulaContent();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RdfLiteralContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(n3Parser.String, 0); }
		public TerminalNode LANGTAG() { return getToken(n3Parser.LANGTAG, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RdfLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterRdfLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitRdfLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitRdfLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RdfLiteralContext rdfLiteral() throws RecognitionException {
		RdfLiteralContext _localctx = new RdfLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rdfLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(String);
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGTAG:
				{
				setState(212);
				match(LANGTAG);
				}
				break;
			case T__24:
				{
				setState(213);
				match(T__24);
				setState(214);
				iri();
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case NumericLiteral:
			case BooleanLiteral:
			case String:
			case BlankNode:
			case QuickVar:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IriContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(n3Parser.IRIREF, 0); }
		public PrefixedNameContext prefixedName() {
			return getRuleContext(PrefixedNameContext.class,0);
		}
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterIri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitIri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitIri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_iri);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				prefixedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IriListContext extends ParserRuleContext {
		public List<IriContext> iri() {
			return getRuleContexts(IriContext.class);
		}
		public IriContext iri(int i) {
			return getRuleContext(IriContext.class,i);
		}
		public IriListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iriList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterIriList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitIriList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitIriList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IriListContext iriList() throws RecognitionException {
		IriListContext _localctx = new IriListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_iriList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			iri();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(222);
				match(T__4);
				setState(223);
				iri();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixedNameContext extends ParserRuleContext {
		public TerminalNode PNAME_NS() { return getToken(n3Parser.PNAME_NS, 0); }
		public TerminalNode PNAME_LN() { return getToken(n3Parser.PNAME_LN, 0); }
		public PrefixedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterPrefixedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitPrefixedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitPrefixedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixedNameContext prefixedName() throws RecognitionException {
		PrefixedNameContext _localctx = new PrefixedNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_prefixedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==PNAME_NS || _la==PNAME_LN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistentialContext extends ParserRuleContext {
		public IriListContext iriList() {
			return getRuleContext(IriListContext.class,0);
		}
		public ExistentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existential; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterExistential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitExistential(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitExistential(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistentialContext existential() throws RecognitionException {
		ExistentialContext _localctx = new ExistentialContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_existential);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__25);
			setState(232);
			iriList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniversalContext extends ParserRuleContext {
		public IriListContext iriList() {
			return getRuleContext(IriListContext.class,0);
		}
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3Listener ) ((n3Listener)listener).exitUniversal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3Visitor ) return ((n3Visitor<? extends T>)visitor).visitUniversal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__26);
			setState(235);
			iriList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\5\4P\n\4"+
		"\3\5\3\5\5\5T\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\5\nf\n\n\3\n\5\ni\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"q\n\13\7\13s\n\13\f\13\16\13v\13\13\3\f\3\f\3\f\7\f{\n\f\f\f\16\f~\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0092\n\r\3\16\3\16\3\17\3\17\3\17\5\17\u0099\n\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a4\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00ad\n\23\3\24\3\24\3\24\5\24\u00b2\n\24\3\25\3"+
		"\25\5\25\u00b6\n\25\3\25\3\25\3\26\3\26\7\26\u00bc\n\26\f\26\16\26\u00bf"+
		"\13\26\3\26\3\26\3\27\3\27\5\27\u00c5\n\27\3\27\3\27\3\30\3\30\3\30\5"+
		"\30\u00cc\n\30\5\30\u00ce\n\30\3\30\3\30\5\30\u00d2\n\30\5\30\u00d4\n"+
		"\30\3\31\3\31\3\31\3\31\5\31\u00da\n\31\3\32\3\32\5\32\u00de\n\32\3\33"+
		"\3\33\3\33\7\33\u00e3\n\33\f\33\16\33\u00e6\13\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\3\3\2%&\2\u00fd\2B\3\2\2\2\4K\3\2\2\2\6O\3\2"+
		"\2\2\bS\3\2\2\2\nU\3\2\2\2\fX\3\2\2\2\16\\\3\2\2\2\20`\3\2\2\2\22e\3\2"+
		"\2\2\24j\3\2\2\2\26w\3\2\2\2\30\u0091\3\2\2\2\32\u0093\3\2\2\2\34\u0098"+
		"\3\2\2\2\36\u009a\3\2\2\2 \u009c\3\2\2\2\"\u009e\3\2\2\2$\u00ac\3\2\2"+
		"\2&\u00b1\3\2\2\2(\u00b3\3\2\2\2*\u00b9\3\2\2\2,\u00c2\3\2\2\2.\u00d3"+
		"\3\2\2\2\60\u00d5\3\2\2\2\62\u00dd\3\2\2\2\64\u00df\3\2\2\2\66\u00e7\3"+
		"\2\2\28\u00e9\3\2\2\2:\u00ec\3\2\2\2<=\5\4\3\2=>\7\3\2\2>A\3\2\2\2?A\5"+
		"\b\5\2@<\3\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3"+
		"\2\2\2EF\7\2\2\3F\3\3\2\2\2GL\5\6\4\2HL\5\22\n\2IL\58\35\2JL\5:\36\2K"+
		"G\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MP\5\16\b\2NP\5\20\t"+
		"\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QT\5\n\6\2RT\5\f\7\2SQ\3\2\2\2SR\3\2"+
		"\2\2T\t\3\2\2\2UV\78\2\2VW\7$\2\2W\13\3\2\2\2XY\79\2\2YZ\7%\2\2Z[\7$\2"+
		"\2[\r\3\2\2\2\\]\7\4\2\2]^\7%\2\2^_\7$\2\2_\17\3\2\2\2`a\7\5\2\2ab\7$"+
		"\2\2b\21\3\2\2\2cf\5\32\16\2df\5(\25\2ec\3\2\2\2ed\3\2\2\2fh\3\2\2\2g"+
		"i\5\24\13\2hg\3\2\2\2hi\3\2\2\2i\23\3\2\2\2jk\5\30\r\2kt\5\26\f\2lp\7"+
		"\6\2\2mn\5\30\r\2no\5\26\f\2oq\3\2\2\2pm\3\2\2\2pq\3\2\2\2qs\3\2\2\2r"+
		"l\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\25\3\2\2\2vt\3\2\2\2w|\5\36\20"+
		"\2xy\7\7\2\2y{\5\36\20\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\27\3"+
		"\2\2\2~|\3\2\2\2\177\u0092\5\34\17\2\u0080\u0092\7\b\2\2\u0081\u0092\7"+
		"\t\2\2\u0082\u0083\7\n\2\2\u0083\u0092\5 \21\2\u0084\u0085\7\13\2\2\u0085"+
		"\u0092\5 \21\2\u0086\u0087\7\f\2\2\u0087\u0088\5 \21\2\u0088\u0089\7\r"+
		"\2\2\u0089\u0092\3\2\2\2\u008a\u008b\7\16\2\2\u008b\u008c\5 \21\2\u008c"+
		"\u008d\7\17\2\2\u008d\u0092\3\2\2\2\u008e\u0092\7\20\2\2\u008f\u0092\7"+
		"\21\2\2\u0090\u0092\7\22\2\2\u0091\177\3\2\2\2\u0091\u0080\3\2\2\2\u0091"+
		"\u0081\3\2\2\2\u0091\u0082\3\2\2\2\u0091\u0084\3\2\2\2\u0091\u0086\3\2"+
		"\2\2\u0091\u008a\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\31\3\2\2\2\u0093\u0094\5 \21\2\u0094\33\3\2\2\2\u0095"+
		"\u0099\5 \21\2\u0096\u0097\7\23\2\2\u0097\u0099\5 \21\2\u0098\u0095\3"+
		"\2\2\2\u0098\u0096\3\2\2\2\u0099\35\3\2\2\2\u009a\u009b\5 \21\2\u009b"+
		"\37\3\2\2\2\u009c\u009d\5\"\22\2\u009d!\3\2\2\2\u009e\u00a3\5$\23\2\u009f"+
		"\u00a0\7\24\2\2\u00a0\u00a4\5\"\22\2\u00a1\u00a2\7\23\2\2\u00a2\u00a4"+
		"\5\"\22\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4#\3\2\2\2\u00a5\u00ad\5\62\32\2\u00a6\u00ad\7\"\2\2\u00a7\u00ad"+
		"\7#\2\2\u00a8\u00ad\5*\26\2\u00a9\u00ad\5(\25\2\u00aa\u00ad\5&\24\2\u00ab"+
		"\u00ad\5,\27\2\u00ac\u00a5\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2"+
		"\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad%\3\2\2\2\u00ae\u00b2\5\60\31\2\u00af\u00b2\7\37\2"+
		"\2\u00b0\u00b2\7 \2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\'\3\2\2\2\u00b3\u00b5\7\25\2\2\u00b4\u00b6\5\24\13\2\u00b5"+
		"\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\26"+
		"\2\2\u00b8)\3\2\2\2\u00b9\u00bd\7\27\2\2\u00ba\u00bc\5\36\20\2\u00bb\u00ba"+
		"\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\30\2\2\u00c1+\3\2\2\2"+
		"\u00c2\u00c4\7\31\2\2\u00c3\u00c5\5.\30\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\32\2\2\u00c7-\3\2\2\2\u00c8"+
		"\u00cd\5\4\3\2\u00c9\u00cb\7\3\2\2\u00ca\u00cc\5.\30\2\u00cb\u00ca\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d4\3\2\2\2\u00cf\u00d1\5\b\5\2\u00d0\u00d2\5."+
		"\30\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00c8\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4/\3\2\2\2\u00d5\u00d9\7!\2\2\u00d6"+
		"\u00da\7(\2\2\u00d7\u00d8\7\33\2\2\u00d8\u00da\5\62\32\2\u00d9\u00d6\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\61\3\2\2\2\u00db"+
		"\u00de\7$\2\2\u00dc\u00de\5\66\34\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3"+
		"\2\2\2\u00de\63\3\2\2\2\u00df\u00e4\5\62\32\2\u00e0\u00e1\7\7\2\2\u00e1"+
		"\u00e3\5\62\32\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\65\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\t\2\2\2\u00e8\67\3\2\2\2\u00e9\u00ea\7\34\2\2\u00ea\u00eb\5\64"+
		"\33\2\u00eb9\3\2\2\2\u00ec\u00ed\7\35\2\2\u00ed\u00ee\5\64\33\2\u00ee"+
		";\3\2\2\2\33@BKOSehpt|\u0091\u0098\u00a3\u00ac\u00b1\u00b5\u00bd\u00c4"+
		"\u00cb\u00cd\u00d1\u00d3\u00d9\u00dd\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}