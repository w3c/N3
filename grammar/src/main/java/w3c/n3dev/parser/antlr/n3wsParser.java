// Generated from n3ws.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class n3wsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, COMMENT=28, BooleanLiteral=29, DefBoolLiteral=30, 
		AtBoolLiteral=31, String=32, IRIREF=33, PNAME_NS=34, PNAME_LN=35, BLANK_NODE_LABEL=36, 
		LANGTAG=37, INTEGER=38, DECIMAL=39, DOUBLE=40, EXPONENT=41, STRING_LITERAL_LONG_SINGLE_QUOTE=42, 
		STRING_LITERAL_LONG_QUOTE=43, STRING_LITERAL_QUOTE=44, STRING_LITERAL_SINGLE_QUOTE=45, 
		UCHAR=46, ECHAR=47, WS=48, ANON=49, QuickVarName=50, PN_CHARS_U=51, PN_CHARS_BASE=52, 
		PN_CHARS=53, BASE=54, PREFIX=55, PN_PREFIX=56, PN_LOCAL=57, PLX=58, PERCENT=59, 
		HEX=60, PN_LOCAL_ESC=61;
	public static final int
		RULE_n3Doc = 0, RULE_n3Statement = 1, RULE_n3Directive = 2, RULE_sparqlDirective = 3, 
		RULE_sparqlBase = 4, RULE_sparqlPrefix = 5, RULE_prefixID = 6, RULE_base = 7, 
		RULE_triples = 8, RULE_predicateObjectList = 9, RULE_objectList = 10, 
		RULE_verb = 11, RULE_subject = 12, RULE_predicate = 13, RULE_object = 14, 
		RULE_expression = 15, RULE_path = 16, RULE_pathItem = 17, RULE_literal = 18, 
		RULE_blankNodePropertyList = 19, RULE_collection = 20, RULE_formula = 21, 
		RULE_formulaContent = 22, RULE_numericLiteral = 23, RULE_rdfLiteral = 24, 
		RULE_iri = 25, RULE_iriList = 26, RULE_prefixedName = 27, RULE_blankNode = 28, 
		RULE_quickVar = 29, RULE_existential = 30, RULE_universal = 31, RULE_langTag = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"n3Doc", "n3Statement", "n3Directive", "sparqlDirective", "sparqlBase", 
			"sparqlPrefix", "prefixID", "base", "triples", "predicateObjectList", 
			"objectList", "verb", "subject", "predicate", "object", "expression", 
			"path", "pathItem", "literal", "blankNodePropertyList", "collection", 
			"formula", "formulaContent", "numericLiteral", "rdfLiteral", "iri", "iriList", 
			"prefixedName", "blankNode", "quickVar", "existential", "universal", 
			"langTag"
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
			null, null, null, null, "COMMENT", "BooleanLiteral", "DefBoolLiteral", 
			"AtBoolLiteral", "String", "IRIREF", "PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", 
			"LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", 
			"STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", 
			"UCHAR", "ECHAR", "WS", "ANON", "QuickVarName", "PN_CHARS_U", "PN_CHARS_BASE", 
			"PN_CHARS", "BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", 
			"HEX", "PN_LOCAL_ESC"
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
	public String getGrammarFileName() { return "n3ws.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public n3wsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class N3DocContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(n3wsParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterN3Doc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitN3Doc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitN3Doc(this);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(66);
				match(WS);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << BooleanLiteral) | (1L << String) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << ANON) | (1L << QuickVarName) | (1L << BASE) | (1L << PREFIX))) != 0)) {
				{
				{
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__18:
				case T__20:
				case T__22:
				case T__25:
				case T__26:
				case BooleanLiteral:
				case String:
				case IRIREF:
				case PNAME_NS:
				case PNAME_LN:
				case BLANK_NODE_LABEL:
				case INTEGER:
				case DECIMAL:
				case DOUBLE:
				case ANON:
				case QuickVarName:
					{
					setState(72);
					n3Statement();
					setState(73);
					match(T__0);
					}
					break;
				case BASE:
				case PREFIX:
					{
					setState(75);
					sparqlDirective();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(78);
					match(WS);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterN3Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitN3Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitN3Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N3StatementContext n3Statement() throws RecognitionException {
		N3StatementContext _localctx = new N3StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_n3Statement);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				n3Directive();
				}
				break;
			case T__18:
			case T__20:
			case T__22:
			case BooleanLiteral:
			case String:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case ANON:
			case QuickVarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				triples();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				existential();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public N3DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n3Directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterN3Directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitN3Directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitN3Directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N3DirectiveContext n3Directive() throws RecognitionException {
		N3DirectiveContext _localctx = new N3DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_n3Directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(97);
				prefixID();
				}
				break;
			case T__2:
				{
				setState(98);
				base();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(101);
				match(WS);
				}
				}
				setState(106);
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterSparqlDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitSparqlDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitSparqlDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparqlDirectiveContext sparqlDirective() throws RecognitionException {
		SparqlDirectiveContext _localctx = new SparqlDirectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sparqlDirective);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				sparqlBase();
				}
				break;
			case PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
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
		public TerminalNode BASE() { return getToken(n3wsParser.BASE, 0); }
		public TerminalNode IRIREF() { return getToken(n3wsParser.IRIREF, 0); }
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public SparqlBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterSparqlBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitSparqlBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitSparqlBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparqlBaseContext sparqlBase() throws RecognitionException {
		SparqlBaseContext _localctx = new SparqlBaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sparqlBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(BASE);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(112);
				match(WS);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
		public TerminalNode PREFIX() { return getToken(n3wsParser.PREFIX, 0); }
		public TerminalNode PNAME_NS() { return getToken(n3wsParser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(n3wsParser.IRIREF, 0); }
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public SparqlPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterSparqlPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitSparqlPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitSparqlPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparqlPrefixContext sparqlPrefix() throws RecognitionException {
		SparqlPrefixContext _localctx = new SparqlPrefixContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sparqlPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(PREFIX);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(121);
				match(WS);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(PNAME_NS);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(128);
				match(WS);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
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
		public TerminalNode PNAME_NS() { return getToken(n3wsParser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(n3wsParser.IRIREF, 0); }
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public PrefixIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterPrefixID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitPrefixID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitPrefixID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixIDContext prefixID() throws RecognitionException {
		PrefixIDContext _localctx = new PrefixIDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prefixID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__1);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(137);
				match(WS);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(PNAME_NS);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(144);
				match(WS);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
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
		public TerminalNode IRIREF() { return getToken(n3wsParser.IRIREF, 0); }
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__2);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(153);
				match(WS);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitTriples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitTriples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriplesContext triples() throws RecognitionException {
		TriplesContext _localctx = new TriplesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_triples);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			subject();
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					match(WS);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(168);
				match(WS);
				setState(169);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public PredicateObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateObjectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterPredicateObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitPredicateObjectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitPredicateObjectList(this);
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
			setState(172);
			verb();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(173);
				match(WS);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			objectList();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(180);
				match(T__3);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(181);
					match(WS);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << BooleanLiteral) | (1L << String) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << ANON) | (1L << QuickVarName))) != 0)) {
					{
					setState(187);
					verb();
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(188);
						match(WS);
						}
						}
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(194);
					objectList();
					}
				}

				}
				}
				setState(202);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitObjectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitObjectList(this);
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
			setState(203);
			object();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(204);
				match(WS);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(210);
				match(T__4);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(211);
					match(WS);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				object();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(218);
					match(WS);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class VerbContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitVerb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_verb);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__18:
			case T__20:
			case T__22:
			case BooleanLiteral:
			case String:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case ANON:
			case QuickVarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				predicate();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(T__7);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(233);
					match(WS);
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				expression();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				match(T__8);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(241);
					match(WS);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				expression();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(T__9);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(249);
					match(WS);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				expression();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(256);
					match(WS);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				match(T__11);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(265);
					match(WS);
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				expression();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(272);
					match(WS);
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 9);
				{
				setState(281);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 10);
				{
				setState(282);
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__20:
			case T__22:
			case BooleanLiteral:
			case String:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case ANON:
			case QuickVarName:
				{
				setState(287);
				expression();
				}
				break;
			case T__16:
				{
				setState(288);
				match(T__16);
				setState(289);
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		public List<PathItemContext> pathItem() {
			return getRuleContexts(PathItemContext.class);
		}
		public PathItemContext pathItem(int i) {
			return getRuleContext(PathItemContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			pathItem();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__17) {
				{
				{
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(298);
				pathItem();
				}
				}
				setState(303);
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

	public static class PathItemContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public QuickVarContext quickVar() {
			return getRuleContext(QuickVarContext.class,0);
		}
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterPathItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitPathItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitPathItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathItemContext pathItem() throws RecognitionException {
		PathItemContext _localctx = new PathItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pathItem);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				iri();
				}
				break;
			case BLANK_NODE_LABEL:
			case ANON:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				blankNode();
				}
				break;
			case QuickVarName:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				quickVar();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				collection();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				blankNodePropertyList();
				}
				break;
			case BooleanLiteral:
			case String:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				literal();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
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
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(n3wsParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				rdfLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				numericLiteral();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public BlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterBlankNodePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitBlankNodePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitBlankNodePropertyList(this);
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
			setState(318);
			match(T__18);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(319);
				match(WS);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			predicateObjectList();
			setState(326);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitCollection(this);
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
			setState(328);
			match(T__20);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(329);
				match(WS);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << BooleanLiteral) | (1L << String) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << ANON) | (1L << QuickVarName))) != 0)) {
				{
				{
				setState(335);
				object();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(336);
					match(WS);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public FormulaContentContext formulaContent() {
			return getRuleContext(FormulaContentContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitFormula(this);
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
			setState(349);
			match(T__22);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(350);
				match(WS);
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << BooleanLiteral) | (1L << String) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << ANON) | (1L << QuickVarName) | (1L << BASE) | (1L << PREFIX))) != 0)) {
				{
				setState(356);
				formulaContent();
				}
			}

			setState(359);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
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
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterFormulaContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitFormulaContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitFormulaContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContentContext formulaContent() throws RecognitionException {
		FormulaContentContext _localctx = new FormulaContentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formulaContent);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__18:
			case T__20:
			case T__22:
			case T__25:
			case T__26:
			case BooleanLiteral:
			case String:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case ANON:
			case QuickVarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				n3Statement();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(362);
					match(T__0);
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(363);
						match(WS);
						}
						}
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << BooleanLiteral) | (1L << String) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << ANON) | (1L << QuickVarName) | (1L << BASE) | (1L << PREFIX))) != 0)) {
						{
						setState(369);
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
				setState(374);
				sparqlDirective();
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(375);
					match(WS);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << BooleanLiteral) | (1L << String) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << BLANK_NODE_LABEL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << ANON) | (1L << QuickVarName) | (1L << BASE) | (1L << PREFIX))) != 0)) {
					{
					setState(381);
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(n3wsParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(n3wsParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(n3wsParser.DOUBLE, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DECIMAL) | (1L << DOUBLE))) != 0)) ) {
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

	public static class RdfLiteralContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(n3wsParser.String, 0); }
		public LangTagContext langTag() {
			return getRuleContext(LangTagContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RdfLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterRdfLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitRdfLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitRdfLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RdfLiteralContext rdfLiteral() throws RecognitionException {
		RdfLiteralContext _localctx = new RdfLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rdfLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(String);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(389);
				langTag();
				}
				break;
			case 2:
				{
				setState(390);
				match(T__24);
				setState(391);
				iri();
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

	public static class IriContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(n3wsParser.IRIREF, 0); }
		public PrefixedNameContext prefixedName() {
			return getRuleContext(PrefixedNameContext.class,0);
		}
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterIri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitIri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitIri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_iri);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public IriListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iriList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterIriList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitIriList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitIriList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IriListContext iriList() throws RecognitionException {
		IriListContext _localctx = new IriListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_iriList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			iri();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(399);
				match(WS);
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(405);
				match(T__4);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(406);
					match(WS);
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
				iri();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(413);
					match(WS);
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(423);
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
		public TerminalNode PNAME_NS() { return getToken(n3wsParser.PNAME_NS, 0); }
		public TerminalNode PNAME_LN() { return getToken(n3wsParser.PNAME_LN, 0); }
		public PrefixedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterPrefixedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitPrefixedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitPrefixedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixedNameContext prefixedName() throws RecognitionException {
		PrefixedNameContext _localctx = new PrefixedNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_prefixedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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

	public static class BlankNodeContext extends ParserRuleContext {
		public TerminalNode BLANK_NODE_LABEL() { return getToken(n3wsParser.BLANK_NODE_LABEL, 0); }
		public TerminalNode ANON() { return getToken(n3wsParser.ANON, 0); }
		public BlankNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterBlankNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitBlankNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitBlankNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankNodeContext blankNode() throws RecognitionException {
		BlankNodeContext _localctx = new BlankNodeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_blankNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(_la==BLANK_NODE_LABEL || _la==ANON) ) {
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

	public static class QuickVarContext extends ParserRuleContext {
		public TerminalNode QuickVarName() { return getToken(n3wsParser.QuickVarName, 0); }
		public QuickVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quickVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterQuickVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitQuickVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitQuickVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuickVarContext quickVar() throws RecognitionException {
		QuickVarContext _localctx = new QuickVarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_quickVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(QuickVarName);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public ExistentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existential; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterExistential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitExistential(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitExistential(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistentialContext existential() throws RecognitionException {
		ExistentialContext _localctx = new ExistentialContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_existential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__25);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(431);
				match(WS);
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
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
		public List<TerminalNode> WS() { return getTokens(n3wsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(n3wsParser.WS, i);
		}
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitUniversal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitUniversal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_universal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__26);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(440);
				match(WS);
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
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

	public static class LangTagContext extends ParserRuleContext {
		public TerminalNode LANGTAG() { return getToken(n3wsParser.LANGTAG, 0); }
		public TerminalNode AtBoolLiteral() { return getToken(n3wsParser.AtBoolLiteral, 0); }
		public LangTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_langTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).enterLangTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof n3wsListener ) ((n3wsListener)listener).exitLangTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof n3wsVisitor ) return ((n3wsVisitor<? extends T>)visitor).visitLangTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LangTagContext langTag() throws RecognitionException {
		LangTagContext _localctx = new LangTagContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_langTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << AtBoolLiteral) | (1L << LANGTAG))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u01c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\2\5\2O\n\2\3\2\7"+
		"\2R\n\2\f\2\16\2U\13\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\5\3b\n\3\3\4\3\4\5\4f\n\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\5\3\5\5\5p\n"+
		"\5\3\6\3\6\7\6t\n\6\f\6\16\6w\13\6\3\6\3\6\3\7\3\7\7\7}\n\7\f\7\16\7\u0080"+
		"\13\7\3\7\3\7\7\7\u0084\n\7\f\7\16\7\u0087\13\7\3\7\3\7\3\b\3\b\7\b\u008d"+
		"\n\b\f\b\16\b\u0090\13\b\3\b\3\b\7\b\u0094\n\b\f\b\16\b\u0097\13\b\3\b"+
		"\3\b\3\t\3\t\7\t\u009d\n\t\f\t\16\t\u00a0\13\t\3\t\3\t\3\n\3\n\7\n\u00a6"+
		"\n\n\f\n\16\n\u00a9\13\n\3\n\3\n\5\n\u00ad\n\n\3\13\3\13\7\13\u00b1\n"+
		"\13\f\13\16\13\u00b4\13\13\3\13\3\13\3\13\7\13\u00b9\n\13\f\13\16\13\u00bc"+
		"\13\13\3\13\3\13\7\13\u00c0\n\13\f\13\16\13\u00c3\13\13\3\13\3\13\5\13"+
		"\u00c7\n\13\7\13\u00c9\n\13\f\13\16\13\u00cc\13\13\3\f\3\f\7\f\u00d0\n"+
		"\f\f\f\16\f\u00d3\13\f\3\f\3\f\7\f\u00d7\n\f\f\f\16\f\u00da\13\f\3\f\3"+
		"\f\7\f\u00de\n\f\f\f\16\f\u00e1\13\f\7\f\u00e3\n\f\f\f\16\f\u00e6\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u00ed\n\r\f\r\16\r\u00f0\13\r\3\r\3\r\3\r\7\r"+
		"\u00f5\n\r\f\r\16\r\u00f8\13\r\3\r\3\r\3\r\7\r\u00fd\n\r\f\r\16\r\u0100"+
		"\13\r\3\r\3\r\7\r\u0104\n\r\f\r\16\r\u0107\13\r\3\r\3\r\3\r\3\r\7\r\u010d"+
		"\n\r\f\r\16\r\u0110\13\r\3\r\3\r\7\r\u0114\n\r\f\r\16\r\u0117\13\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u011e\n\r\3\16\3\16\3\17\3\17\3\17\5\17\u0125\n\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\7\22\u012e\n\22\f\22\16\22\u0131\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u013a\n\23\3\24\3\24\3\24"+
		"\5\24\u013f\n\24\3\25\3\25\7\25\u0143\n\25\f\25\16\25\u0146\13\25\3\25"+
		"\3\25\3\25\3\26\3\26\7\26\u014d\n\26\f\26\16\26\u0150\13\26\3\26\3\26"+
		"\7\26\u0154\n\26\f\26\16\26\u0157\13\26\7\26\u0159\n\26\f\26\16\26\u015c"+
		"\13\26\3\26\3\26\3\27\3\27\7\27\u0162\n\27\f\27\16\27\u0165\13\27\3\27"+
		"\5\27\u0168\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u016f\n\30\f\30\16\30\u0172"+
		"\13\30\3\30\5\30\u0175\n\30\5\30\u0177\n\30\3\30\3\30\7\30\u017b\n\30"+
		"\f\30\16\30\u017e\13\30\3\30\5\30\u0181\n\30\5\30\u0183\n\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\5\32\u018b\n\32\3\33\3\33\5\33\u018f\n\33\3\34\3"+
		"\34\7\34\u0193\n\34\f\34\16\34\u0196\13\34\3\34\3\34\7\34\u019a\n\34\f"+
		"\34\16\34\u019d\13\34\3\34\3\34\7\34\u01a1\n\34\f\34\16\34\u01a4\13\34"+
		"\7\34\u01a6\n\34\f\34\16\34\u01a9\13\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \7 \u01b3\n \f \16 \u01b6\13 \3 \3 \3!\3!\7!\u01bc\n!\f!\16!\u01bf"+
		"\13!\3!\3!\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@B\2\7\3\2\23\24\3\2(*\3\2$%\4\2&&\63\63\7\2\t\t"+
		"\13\13\16\17!!\'\'\2\u01ec\2G\3\2\2\2\4a\3\2\2\2\6e\3\2\2\2\bo\3\2\2\2"+
		"\nq\3\2\2\2\fz\3\2\2\2\16\u008a\3\2\2\2\20\u009a\3\2\2\2\22\u00a3\3\2"+
		"\2\2\24\u00ae\3\2\2\2\26\u00cd\3\2\2\2\30\u011d\3\2\2\2\32\u011f\3\2\2"+
		"\2\34\u0124\3\2\2\2\36\u0126\3\2\2\2 \u0128\3\2\2\2\"\u012a\3\2\2\2$\u0139"+
		"\3\2\2\2&\u013e\3\2\2\2(\u0140\3\2\2\2*\u014a\3\2\2\2,\u015f\3\2\2\2."+
		"\u0182\3\2\2\2\60\u0184\3\2\2\2\62\u0186\3\2\2\2\64\u018e\3\2\2\2\66\u0190"+
		"\3\2\2\28\u01aa\3\2\2\2:\u01ac\3\2\2\2<\u01ae\3\2\2\2>\u01b0\3\2\2\2@"+
		"\u01b9\3\2\2\2B\u01c2\3\2\2\2DF\7\62\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2HX\3\2\2\2IG\3\2\2\2JK\5\4\3\2KL\7\3\2\2LO\3\2\2\2MO\5\b\5\2"+
		"NJ\3\2\2\2NM\3\2\2\2OS\3\2\2\2PR\7\62\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2"+
		"\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VN\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2"+
		"\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\2\2\3\\\3\3\2\2\2]b\5\6\4\2^b\5\22\n\2_b\5"+
		"> \2`b\5@!\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\5\3\2\2\2cf\5\16"+
		"\b\2df\5\20\t\2ec\3\2\2\2ed\3\2\2\2fj\3\2\2\2gi\7\62\2\2hg\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2k\7\3\2\2\2lj\3\2\2\2mp\5\n\6\2np\5\f\7\2om"+
		"\3\2\2\2on\3\2\2\2p\t\3\2\2\2qu\78\2\2rt\7\62\2\2sr\3\2\2\2tw\3\2\2\2"+
		"us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7#\2\2y\13\3\2\2\2z~\79\2\2"+
		"{}\7\62\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0085\7$\2\2\u0082\u0084\7\62\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7#\2\2\u0089"+
		"\r\3\2\2\2\u008a\u008e\7\4\2\2\u008b\u008d\7\62\2\2\u008c\u008b\3\2\2"+
		"\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0095\7$\2\2\u0092\u0094\7\62\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7#\2\2\u0099"+
		"\17\3\2\2\2\u009a\u009e\7\5\2\2\u009b\u009d\7\62\2\2\u009c\u009b\3\2\2"+
		"\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7#\2\2\u00a2\21\3\2\2\2\u00a3"+
		"\u00a7\5\32\16\2\u00a4\u00a6\7\62\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\7\62\2\2\u00ab\u00ad\5\24\13\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00b2\5\30\r\2\u00af"+
		"\u00b1\7\62\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00ca\5\26\f\2\u00b6\u00ba\7\6\2\2\u00b7\u00b9\7\62\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00c6\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c1\5\30\r\2\u00be\u00c0\7"+
		"\62\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5\26"+
		"\f\2\u00c5\u00c7\3\2\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00b6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\25\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1"+
		"\5\36\20\2\u00ce\u00d0\7\62\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2"+
		"\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00e4\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d8\7\7\2\2\u00d5\u00d7\7\62\2\2\u00d6\u00d5\3\2\2\2"+
		"\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00df\5\36\20\2\u00dc\u00de\7\62\2"+
		"\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\27\3\2\2"+
		"\2\u00e6\u00e4\3\2\2\2\u00e7\u011e\5\34\17\2\u00e8\u011e\7\b\2\2\u00e9"+
		"\u011e\7\t\2\2\u00ea\u00ee\7\n\2\2\u00eb\u00ed\7\62\2\2\u00ec\u00eb\3"+
		"\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u011e\5 \21\2\u00f2\u00f6\7\13"+
		"\2\2\u00f3\u00f5\7\62\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u011e\5 \21\2\u00fa\u00fe\7\f\2\2\u00fb\u00fd\7\62\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0105\5 \21\2\u0102"+
		"\u0104\7\62\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7\r\2\2\u0109\u011e\3\2\2\2\u010a\u010e\7\16\2\2\u010b\u010d\7"+
		"\62\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0115\5 "+
		"\21\2\u0112\u0114\7\62\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u0119\7\17\2\2\u0119\u011e\3\2\2\2\u011a\u011e\7\20\2\2\u011b"+
		"\u011e\7\21\2\2\u011c\u011e\7\22\2\2\u011d\u00e7\3\2\2\2\u011d\u00e8\3"+
		"\2\2\2\u011d\u00e9\3\2\2\2\u011d\u00ea\3\2\2\2\u011d\u00f2\3\2\2\2\u011d"+
		"\u00fa\3\2\2\2\u011d\u010a\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011c\3\2\2\2\u011e\31\3\2\2\2\u011f\u0120\5 \21\2\u0120\33"+
		"\3\2\2\2\u0121\u0125\5 \21\2\u0122\u0123\7\23\2\2\u0123\u0125\5 \21\2"+
		"\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0125\35\3\2\2\2\u0126\u0127"+
		"\5 \21\2\u0127\37\3\2\2\2\u0128\u0129\5\"\22\2\u0129!\3\2\2\2\u012a\u012f"+
		"\5$\23\2\u012b\u012c\t\2\2\2\u012c\u012e\5$\23\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130#\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0132\u013a\5\64\33\2\u0133\u013a\5:\36\2\u0134\u013a"+
		"\5<\37\2\u0135\u013a\5*\26\2\u0136\u013a\5(\25\2\u0137\u013a\5&\24\2\u0138"+
		"\u013a\5,\27\2\u0139\u0132\3\2\2\2\u0139\u0133\3\2\2\2\u0139\u0134\3\2"+
		"\2\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a%\3\2\2\2\u013b\u013f\5\62\32\2\u013c\u013f\5\60\31"+
		"\2\u013d\u013f\7\37\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013d\3\2\2\2\u013f\'\3\2\2\2\u0140\u0144\7\25\2\2\u0141\u0143\7\62\2"+
		"\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\5\24\13\2"+
		"\u0148\u0149\7\26\2\2\u0149)\3\2\2\2\u014a\u014e\7\27\2\2\u014b\u014d"+
		"\7\62\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u015a\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0155"+
		"\5\36\20\2\u0152\u0154\7\62\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2"+
		"\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u0151\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\30"+
		"\2\2\u015e+\3\2\2\2\u015f\u0163\7\31\2\2\u0160\u0162\7\62\2\2\u0161\u0160"+
		"\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\5.\30\2\u0167\u0166\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7\32\2\2\u016a"+
		"-\3\2\2\2\u016b\u0176\5\4\3\2\u016c\u0170\7\3\2\2\u016d\u016f\7\62\2\2"+
		"\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\5.\30\2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u016c\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0183\3\2\2\2\u0178\u017c\5\b\5\2\u0179"+
		"\u017b\7\62\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3"+
		"\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0181\5.\30\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2"+
		"\2\2\u0182\u016b\3\2\2\2\u0182\u0178\3\2\2\2\u0183/\3\2\2\2\u0184\u0185"+
		"\t\3\2\2\u0185\61\3\2\2\2\u0186\u018a\7\"\2\2\u0187\u018b\5B\"\2\u0188"+
		"\u0189\7\33\2\2\u0189\u018b\5\64\33\2\u018a\u0187\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\63\3\2\2\2\u018c\u018f\7#\2\2\u018d"+
		"\u018f\58\35\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\65\3\2\2"+
		"\2\u0190\u0194\5\64\33\2\u0191\u0193\7\62\2\2\u0192\u0191\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u01a7\3\2"+
		"\2\2\u0196\u0194\3\2\2\2\u0197\u019b\7\7\2\2\u0198\u019a\7\62\2\2\u0199"+
		"\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a2\5\64\33\2\u019f"+
		"\u01a1\7\62\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3"+
		"\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u0197\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\67\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\t\4\2\2\u01ab9\3"+
		"\2\2\2\u01ac\u01ad\t\5\2\2\u01ad;\3\2\2\2\u01ae\u01af\7\64\2\2\u01af="+
		"\3\2\2\2\u01b0\u01b4\7\34\2\2\u01b1\u01b3\7\62\2\2\u01b2\u01b1\3\2\2\2"+
		"\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\5\66\34\2\u01b8?\3\2\2\2\u01b9"+
		"\u01bd\7\35\2\2\u01ba\u01bc\7\62\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3"+
		"\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c1\5\66\34\2\u01c1A\3\2\2\2\u01c2\u01c3\t\6\2"+
		"\2\u01c3C\3\2\2\2:GNSXaejou~\u0085\u008e\u0095\u009e\u00a7\u00ac\u00b2"+
		"\u00ba\u00c1\u00c6\u00ca\u00d1\u00d8\u00df\u00e4\u00ee\u00f6\u00fe\u0105"+
		"\u010e\u0115\u011d\u0124\u012f\u0139\u013e\u0144\u014e\u0155\u015a\u0163"+
		"\u0167\u0170\u0174\u0176\u017c\u0180\u0182\u018a\u018e\u0194\u019b\u01a2"+
		"\u01a7\u01b4\u01bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}