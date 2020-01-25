package test;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import parser.n3AbstractLexerErrorListener;
import parser.n3AbstractParserErrorListener;
import parser.n3DefaultLexerErrorListener;
import parser.n3DefaultParserErrorListener;
import parser.n3PrefixErrorVisitor;
import parser.n3PrintVisitor;
import wvw.utils.log.Log;

public class N3TestGrammar extends N3Test {

	private static List<String> suppGrammars = Arrays.asList("turtle", "n3");

//	public static void main(String[] args) throws Exception {
//		System.out.println(new N3TestGrammar("n3", false)
//				.negativeTest(new File("tests/N3Tests/cwm_syntax/qname-as-prefix-in-decl.n3")));
//	}

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

		Method m = findParseMethod(cmp.getParser());
		if (m != null) {
			ParserRuleContext ctx = (ParserRuleContext) m.invoke(cmp.getParser());

			n3PrefixErrorVisitor v = createPrefixErrorVisitor(grammar, cmp.getParserListener());
			v.visit(ctx);

			if (printAST)
				createPrintVisitor(grammar).visit(ctx);

		} else
			System.err.println("error: could not find parser method for " + grammar);

		return cmp;
	}

	private Method findParseMethod(Parser parser) {
		Pattern p = Pattern.compile(".*Doc");
		for (Method m : parser.getClass().getMethods()) {

			if (p.matcher(m.getName()).matches())
				return m;
		}

		return null;
	}

	private MyParserCmp createGrammarComponents(String grammar, File file) throws Exception {
		Pair<Class<? extends Lexer>, Class<? extends Parser>> clss = getGrammarClasses(grammar);

		Lexer lexer = clss.getLeft().getConstructor(CharStream.class)
				.newInstance(CharStreams.fromPath(file.toPath(), Charset.forName("UTF-8")));

		// (antlr 4.4)
		// new ANTLRInputStream(new InputStreamReader(new FileInputStream(file),
		// Charset.forName("UTF-8"))));

//		lexer.removeErrorListeners();
		n3AbstractLexerErrorListener lexerListener = new n3DefaultLexerErrorListener(file.getName());
		lexer.addErrorListener(lexerListener);

		Parser parser = clss.getRight().getConstructor(TokenStream.class).newInstance(new CommonTokenStream(lexer));

//		parser.removeErrorListeners();
		n3AbstractParserErrorListener parserListener = new n3DefaultParserErrorListener(file.getName());
		parser.addErrorListener(parserListener);

		return new MyParserCmp(lexer, parser, lexerListener, parserListener);
	}

	private n3PrintVisitor createPrintVisitor(String grammar) throws Exception {
		return (n3PrintVisitor) Class.forName("parser." + grammar.toLowerCase() + "PrintVisitor").getConstructor()
				.newInstance();
	}

	private n3PrefixErrorVisitor createPrefixErrorVisitor(String grammar, n3AbstractParserErrorListener listener)
			throws Exception {

		return (n3PrefixErrorVisitor) Class.forName("parser." + grammar.toLowerCase() + "PrefixErrorVisitor")
				.getConstructor(n3AbstractParserErrorListener.class).newInstance(listener);
	}

	@SuppressWarnings("unchecked")
	private Pair<Class<? extends Lexer>, Class<? extends Parser>> getGrammarClasses(String grammar)
			throws ClassNotFoundException {

		return ImmutablePair.of((Class<? extends Lexer>) Class.forName("parser.antlr." + grammar + "Lexer"),
				(Class<? extends Parser>) Class.forName("parser.antlr." + grammar + "Parser"));
	}

	protected class MyParserCmp implements IParserCmp {

		private Lexer lexer;
		private Parser parser;
		private n3AbstractLexerErrorListener lexerListener;
		private n3AbstractParserErrorListener parserListener;

		public MyParserCmp(Lexer lexer, Parser parser, n3AbstractLexerErrorListener lexerListener,
				n3AbstractParserErrorListener parserListener) {

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

		public n3AbstractLexerErrorListener getLexerListener() {
			return lexerListener;
		}

		public void setLexerListener(n3AbstractLexerErrorListener lexerListener) {
			this.lexerListener = lexerListener;
		}

		public n3AbstractParserErrorListener getParserListener() {
			return parserListener;
		}

		public void setParserListener(n3AbstractParserErrorListener parserListener) {
			this.parserListener = parserListener;
		}

		// it seems that parser.getNumberOfSyntaxErrors does not (always?) count
		// lexer errors
		public int getNumErrors() {
			return lexerListener.getNumErrors() + parserListener.getNumErrors();
		}
	}
}
