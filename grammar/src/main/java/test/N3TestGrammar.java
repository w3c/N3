package test;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import wvw.utils.log.Log;

public class N3TestGrammar extends N3Test {

	private static List<String> suppGrammars = Arrays.asList("turtle", "n3");

	public static void main(String[] args) throws Exception {
		if (args.length < 2) {
			System.out.println("usage: java -jar n3TestGrammar.jar <grammar> <file or folder>\n"
					+ "all output will be stored in ./out.txt" + "\n\nflags:\n\n"
					+ "-pos/neg: whether tests should be run as positive (-pos) or negative (-neg) tests. "
					+ "This flag is needed when testing an individual file, or a folder without a manifest file. "
					+ "It will override any manifest found in a folder.\n\n"
					+ "-printAST: when given for a file, the resulting AST will be printed." + "\n\nexamples:\n\n"
					+ "java -jar n3TestGrammar.jar n3 ../tests/N3Tests\n"
					+ "tests files inside the 'N3Tests' folder, as listed in its 'manifest.ttl', as N3 test cases.\n\n"
					+ "java -jar n3TestGrammar.jar n3 ../tests/TurtleTests -pos\n"
					+ "tests all files inside the 'TurtleTests' folder as positive Turtle test cases.\n\n"
					+ "java -jar n3TestGrammar.jar n3 ../tests/N3Tests/01etc/food-query.n3 -pos -printAST\n"
					+ "tests the 'a.n3' file as a positive N3 test case and prints its AST.");
			return;
		}

		List<String> flags = new ArrayList<>();
		for (int i = 2; i < args.length; i++)
			flags.add(args[i]);

		String grammar = args[0];
		if (!suppGrammars.contains(grammar)) {
			System.err.println("error: expected one of " + suppGrammars + " grammars");
			return;
		}

		String file = args[1];
		String folder = ".";

		File f = new File(folder, file);
		if (!f.exists()) {
			System.err.println("error: cannot find " + f.getPath());
			return;
		}

		File manifest = new File(f, "manifest.ttl");

		Boolean posTest = null;
		if (flags.contains("-pos") || flags.contains("-neg"))
			posTest = flags.contains("-pos");

		else {
			if (!f.isDirectory()) {
				System.err.println("error: expecting -pos/neg flag for an individual file test");
				return;

			} else if (!manifest.exists()) {
				System.err.println("error: no " + f.getPath() + "\\manifest.ttl found so need -pos/neg flag");
				return;
			}
		}

		boolean printAST = (!f.isDirectory() && flags.contains("-printAST"));

		N3TestGrammar t = new N3TestGrammar(grammar, printAST);

		Log.i("-- CONFIG");
		Log.i("grammar: " + grammar);

		if (f.isDirectory()) {
			Log.i("folder: " + f.getCanonicalPath());

			// pos/neg flag overrides any potential manifest in the folder
			if (posTest != null) {
				Log.i("running tests as " + (posTest ? "positive" : "negative"));

				Log.i("\n\n-- TESTS");
				t.testFolder(posTest, f.getPath() + "/");

			} else {
				Log.i("using manifest");

				Log.i("\n\n-- TESTS");
				t.testManifest(f.getPath() + "/");
			}

		} else {
			Log.i("file: " + f.getCanonicalPath());

			Log.i("\n\n-- TESTS");
			Log.i("\npass? " + (posTest ? t.positiveTest(f) : t.negativeTest(f)));
		}
	}

	private String grammar;
	private boolean printAST = false;

	public N3TestGrammar(String grammar, boolean printAST) {
		this.grammar = grammar;
		this.printAST = printAST;
	}

	public IParserCmp parse(File file) throws Exception {
		MyParserCmp cmp = createGrammarComponents(grammar, file);

		boolean found = false;
		Pattern p = Pattern.compile(".*Doc");
		for (Method m : cmp.getParser().getClass().getMethods()) {

			if (p.matcher(m.getName()).matches()) {
				found = true;

				ParserRuleContext ctx = (ParserRuleContext) m.invoke(cmp.getParser());
				if (printAST)
					createVisitor(grammar).visit(ctx);

				break;
			}
		}

		if (!found)
			System.err.println("error: could not find parser method for " + grammar);

		return cmp;
	}

	private MyParserCmp createGrammarComponents(String grammar, File file) throws Exception {
		Pair<Class<? extends Lexer>, Class<? extends Parser>> clss = getGrammarClasses(grammar);

		Lexer lexer = clss.getLeft().getConstructor(CharStream.class)
				.newInstance(CharStreams.fromPath(file.toPath(), Charset.forName("UTF-8")));

		// (antlr 4.4)
		// new ANTLRInputStream(new InputStreamReader(new FileInputStream(file),
		// Charset.forName("UTF-8"))));

//		lexer.removeErrorListeners();
		MyLexerErrorListener lexerListener = new MyLexerErrorListener(file.getName());
		lexer.addErrorListener(lexerListener);

		Parser parser = clss.getRight().getConstructor(TokenStream.class).newInstance(new CommonTokenStream(lexer));

//		parser.removeErrorListeners();
		MyParserErrorListener parserListener = new MyParserErrorListener(file.getName());
		parser.addErrorListener(parserListener);

		return new MyParserCmp(lexer, parser, lexerListener, parserListener);
	}

	@SuppressWarnings("rawtypes")
	private AbstractParseTreeVisitor createVisitor(String grammar) throws Exception {
		return (AbstractParseTreeVisitor) Class.forName("test.visitor." + grammar + "VisitorPrinter").getConstructor()
				.newInstance();
	}

	@SuppressWarnings("unchecked")
	private Pair<Class<? extends Lexer>, Class<? extends Parser>> getGrammarClasses(String grammar)
			throws ClassNotFoundException {

		return ImmutablePair.of((Class<? extends Lexer>) Class.forName("parser." + grammar + "Lexer"),
				(Class<? extends Parser>) Class.forName("parser." + grammar + "Parser"));
	}

	protected class MyParserCmp implements IParserCmp {

		private Lexer lexer;
		private Parser parser;
		private MyLexerErrorListener lexerListener;
		private MyParserErrorListener parserListener;

		public MyParserCmp(Lexer lexer, Parser parser, MyLexerErrorListener lexerListener,
				MyParserErrorListener parserListener) {

			this.lexer = lexer;
			this.parser = parser;
			this.lexerListener = lexerListener;
			this.parserListener = parserListener;
		}

		public Lexer getLexer() {
			return lexer;
		}

		public Parser getParser() {
			return parser;
		}

		// it seems that parser.getNumberOfSyntaxErrors does not (always?) count
		// lexer errors
		public int getNumErrors() {
			return lexerListener.getNumErrors() + parserListener.getNumErrors();
		}
	}

	private class MyLexerErrorListener implements ANTLRErrorListener {

		private String name;
		private int errorCnt = 0;

		public MyLexerErrorListener(String name) {
			this.name = name;
		}

		@Override
		public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, BitSet arg5,
				ATNConfigSet arg6) {

			errorCnt++;
			System.err.println(name + "[lexer]: " + "reportAmbiguity @" + arg2 + "-" + arg3 + " " + arg4 + " " + arg5
					+ " " + arg6);
		}

		@Override
		public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, BitSet arg4,
				ATNConfigSet arg5) {

			errorCnt++;
			System.err.println(
					name + "[lexer]: " + "reportAttemptingFullContext @" + arg2 + "-" + arg3 + " " + arg4 + " " + arg5);
		}

		@Override
		public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2, int arg3, int arg4, ATNConfigSet arg5) {
			errorCnt++;
			System.err.println(
					name + "[lexer]: " + "reportContextSensitivity @" + arg2 + "-" + arg3 + " " + arg4 + " " + arg5);
		}

		@Override
		public void syntaxError(Recognizer<?, ?> arg0, Object arg1, int arg2, int arg3, String arg4,
				RecognitionException arg5) {

			errorCnt++;
			System.err.println(name + " [lexer]: " + "syntaxError for " + arg1 + " @" + arg2 + ":" + arg3 + " - " + arg4
					+ " " + arg5);
		}

		public int getNumErrors() {
			return errorCnt;
		}
	}

	private class MyParserErrorListener extends BaseErrorListener {

		private String name;
		private int errorCnt = 0;

		public MyParserErrorListener(String name) {
			this.name = name;
		}

		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
				String msg, RecognitionException e) {

			errorCnt++;
			System.err.println(name + " [parser]: " + "syntaxError for " + offendingSymbol + " @" + line + ":"
					+ charPositionInLine + " - " + msg);
		}

		public int getNumErrors() {
			return errorCnt;
		}
	}
}
