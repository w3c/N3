package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;

import rdf.util.NS;

public class Test {

	private static List<String> suppGrammars = Arrays.asList("turtle", "n3");
	private static List<String> suppPosNeg = Arrays.asList("pos", "neg");

	public static void main(String[] args) throws Exception {
		if (args.length < 2 || args.length > 3) {
			System.out.println("usage: java -jar n3Grammar.jar <grammar> <file or folder> (<pos/neg>)");
			return;
		}

		String grammar = args[0];
		if (!suppGrammars.contains(grammar)) {
			System.err.println("error: expected one of " + suppGrammars + " grammars");
			return;
		}

		Test t = new Test();

		String file = args[1];
		// String folder = "tests/";
		String folder = ".";
		File f = new File(folder, file);

		if (!f.exists()) {
			System.err.println("error: cannot find file " + f.getAbsolutePath());
			return;
		}

		boolean pos = false;
		if (grammar.equals("n3") || !f.isDirectory()) {
			if (args.length < 3 || !suppPosNeg.contains(args[2])) {
				System.err.println("error: expecting <pos/neg> for all n3 tests or any file test");
				return;
			}

			pos = (args[2].equals("pos"));
		}

		System.out.println("-- CONFIG");
		System.out.println("grammar: " + grammar);

		if (f.isDirectory()) {
			System.out.println("folder: " + f.getAbsolutePath());

			System.out.println("\n\n-- TESTS");
			if (grammar.equals("turtle"))
				t.testManifest("n3", f.getPath() + "/");
			else
				t.testFolder(pos, grammar, f.getPath() + "/");

		} else {
			System.out.println("file: " + f.getAbsolutePath());

			System.out.println("\n\n-- TESTS");
			System.out.println("\npass? " + (pos ? t.positiveTest(grammar, f) : t.negativeTest(grammar, f)));
		}
	}

	public void testManifest(String grammar, String folder) throws Exception {
		Model manifest = readManifest(folder);

		List<String> posFailed = new ArrayList<>();
		List<String> negFailed = new ArrayList<>();

		doSyntaxTests(manifest.createResource(NS.uri("rdft:TestTurtlePositiveSyntax")), test -> {
			if (!positiveTest(grammar, test))
				posFailed.add(test.getName());
		}, folder, manifest);

		doSyntaxTests(manifest.createResource(NS.uri("rdft:TestTurtleNegativeSyntax")), test -> {
			if (!negativeTest(grammar, test))
				negFailed.add(test.getName());
		}, folder, manifest);

		System.out.println("\n\nfailed (positive): " + posFailed);
		System.out.println("failed (negative): " + negFailed);
	}

	private Model readManifest(String folder) throws Exception {
		System.out.println("parsing manifest.ttl");
		return ModelFactory.createDefaultModel().read(new FileInputStream(folder + "manifest.ttl"), "", "TURTLE");
	}

	private void doSyntaxTests(Resource type, Consumer<File> fn, String folder, Model manifest) {
		manifest.listStatements(null, manifest.createProperty(NS.uri("rdf:type")), type)

				.forEachRemaining(stmt -> {
					Resource testCase = stmt.getSubject();

					Statement actionStmt = testCase.getProperty(manifest.createProperty(NS.uri("mf", "action")));
					if (actionStmt != null) {
						String test = NS.localName(actionStmt.getObject().asResource().getURI());

						fn.accept(new File(folder + test));

					} else
						System.err.println("could not find action for " + testCase);
				});
	}

	public void testFolder(boolean pos, String grammar, String folder) {
		List<String> failed = new ArrayList<>();

		testFolder(pos, grammar, folder, "", failed);
		System.out.println("\n\nfailed (" + (pos ? "positive" : "negative") + "): " + failed);
	}

	public void testFolder(boolean pos, String grammar, String folder, String prefix, List<String> failed) {
		for (File file : new File(folder).listFiles()) {
			if (file.isDirectory())
				testFolder(pos, grammar, file.getPath(), prefix + file.getName() + "/", failed);

			else {
				String name = prefix + file.getName();
				try {
					boolean success = (pos ? positiveTest(grammar, file, name) : negativeTest(grammar, file, name));
					if (!success)
						failed.add(name);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public boolean positiveTest(String grammar, File file) {
		return positiveTest(grammar, file, file.getName());
	}

	public boolean positiveTest(String grammar, File file, String name) {
		System.out.println("testing (positive): " + name);
		try {
			MyParserCmp cmp = parse(grammar, file);
			return (cmp.getNumErrors() == 0);

		} catch (Exception e) {
			System.err.println("error (" + file.getName() + "): " + e.getMessage());

			return false;
		}
	}

	public boolean negativeTest(String grammar, File file) {
		return negativeTest(grammar, file, file.getName());
	}

	public boolean negativeTest(String grammar, File file, String name) {
		System.out.println("testing (negative): " + name);
		try {
			MyParserCmp cmp = parse(grammar, file);
			return (cmp.getNumErrors() > 0);

		} catch (Exception e) {
			System.err.println("error (" + file.getName() + "): " + e.getMessage());

			return false;
		}
	}

	public MyParserCmp parse(String grammar, File file) throws Exception {
		MyParserCmp cmp = createGrammarComponents(grammar, file);

		boolean found = false;
		Pattern p = Pattern.compile(".*Doc");
		for (Method m : cmp.getParser().getClass().getMethods()) {

			if (p.matcher(m.getName()).matches()) {
				found = true;
				m.invoke(cmp.getParser());

				break;
			}
		}

		if (!found)
			System.err.println("error: could not find parser method for " + grammar);

		return cmp;
	}

	public void checkTokens(String grammar, File file) {
		System.out.println("checkTokens (" + grammar + "): " + file.getName());

		try {
			MyParserCmp cmp = createGrammarComponents(grammar, file);
			CommonTokenStream tokens = new CommonTokenStream(cmp.getLexer());

			while (true) {
				Token tk = tokens.LT(1);

				if (tk.getType() == -1)
					break;

				System.out.println(tk + " - " + cmp.getParser().getTokenNames()[tk.getType()]);

				tokens.consume();
			}

		} catch (Exception e) {
			System.err.println("error in " + file.getName() + ": " + e.getMessage());
		}
	}

	private MyParserCmp createGrammarComponents(String grammar, File file) throws Exception {
		Pair<Class<? extends Lexer>, Class<? extends Parser>> clss = getGrammarClasses(grammar);

		Lexer lexer = clss.getLeft().getConstructor(CharStream.class).newInstance(
				new ANTLRInputStream(new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8"))));

		lexer.removeErrorListeners();
		MyLexerErrorListener lexerListener = new MyLexerErrorListener(file.getName());
		lexer.addErrorListener(lexerListener);

		Parser parser = clss.getRight().getConstructor(TokenStream.class).newInstance(new CommonTokenStream(lexer));

		parser.removeErrorListeners();
		MyParserErrorListener parserListener = new MyParserErrorListener(file.getName());
		parser.addErrorListener(parserListener);

		// CharStreams.fromPath(Paths.get("D:/git/n3dev/grammar/n3/n3/examples",
		// "test.n3")));

		return new MyParserCmp(lexer, parser, lexerListener, parserListener);
	}

	@SuppressWarnings("unchecked")
	private Pair<Class<? extends Lexer>, Class<? extends Parser>> getGrammarClasses(String grammar)
			throws ClassNotFoundException {

		return ImmutablePair.of((Class<? extends Lexer>) Class.forName(grammar + "Lexer"),
				(Class<? extends Parser>) Class.forName(grammar + "Parser"));
	}

	private class MyParserCmp {

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
