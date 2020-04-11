package test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import parser.n3ParserErrorListener;
import parser.n3Grammar;
import parser.visitor.n3PrefixErrorVisitor;
import parser.visitor.n3PrintVisitor;
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

	private String grammarLabel;
	private n3Grammar grammar;

	private boolean printAST = false;

	public N3TestGrammar(String grammar, boolean printAST) {
		this.grammarLabel = grammar;
		this.printAST = printAST;
	}

	public ITestResult parse(File file) throws Exception {
		grammar = new n3Grammar();
		ParserRuleContext ctx = grammar.parse(file, grammarLabel);

		n3PrefixErrorVisitor v = createPrefixErrorVisitor(grammarLabel, grammar.getParserListener());
		v.visit(ctx);

		if (printAST)
			createPrintVisitor(grammarLabel).visit(ctx);

		return new N3TestResult(grammar.getNumErrors());
	}

	private n3PrintVisitor createPrintVisitor(String grammar) throws Exception {
		return (n3PrintVisitor) Class.forName("parser.visitor." + grammar.toLowerCase() + "PrintVisitor")
				.getConstructor().newInstance();
	}

	private n3PrefixErrorVisitor createPrefixErrorVisitor(String grammar, n3ParserErrorListener listener)
			throws Exception {

		return (n3PrefixErrorVisitor) Class.forName("parser.visitor." + grammar.toLowerCase() + "PrefixErrorVisitor")
				.getConstructor(n3ParserErrorListener.class).newInstance(listener);
	}

	protected class N3TestResult implements ITestResult {

		private int numErrors;

		public N3TestResult(int numErrors) {
			this.numErrors = numErrors;
		}

		@Override
		public int getNumErrors() {
			return numErrors;
		}
	}
}