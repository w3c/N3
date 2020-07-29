package w3c.n3dev.test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import w3c.n3dev.parser.Grammar;
import w3c.n3dev.parser.Grammar.Grammars;
import w3c.n3dev.parser.ParserErrorListener;
import wvw.utils.log.Log;

public class N3TestGrammar extends N3Test {

//	public static void main(String[] args) throws Exception {
//		System.out.println(new N3TestGrammar(Grammars.n3ws, false).positiveTest(new File("tests/N3Tests/01etc/skos-rules.n3")));
//	}

	public static void main(String[] args) throws Exception {
		new N3TestGrammar().run(args);
	}

	private Grammars type;
	private boolean printAST = false;

	private Grammar grammar;

	public N3TestGrammar() {
	}

	public N3TestGrammar(Grammars type, boolean printAST) {
		this.type = type;
		this.printAST = printAST;
	}

	@Override
	protected String name() {
		return "grammar";
	}

	@Override
	protected int minArgLen() {
		return 2;
	}

	@Override
	protected String cmdUsage() {
		return "<grammar> <file or folder>";
	}

	@Override
	protected String cmdNote() {
		return "grammar = n3, n3ws or turtle";
	}

	@Override
	protected String cmdFlags() {
		return "\n\n-printAST: when given for a file, the resulting AST will be printed.";
	}

	@Override
	protected String examples() {
		return "java -jar " + jarName() + " n3 ../tests/N3Tests\n"
				+ "tests files inside the 'N3Tests' folder, as listed in its 'manifest.ttl', as N3 test cases.\n\n"
				+ "java -jar " + jarName() + " n3ws ../tests/N3Tests -mf manifest.n3 \n"
				+ "tests files inside the 'N3Tests' folder, as listed in its 'manifest.n3', as N3 (WS) test cases.\n\n"
				+ "java -jar n3TestGrammar.jar turtle ../tests/TurtleTests -pos\n"
				+ "tests all files inside the 'TurtleTests' folder as positive Turtle test cases.\n\n"
				+ "java -jar n3TestGrammar.jar n3 ../tests/N3Tests/01etc/food-query.n3 -pos -printAST\n"
				+ "tests the 'a.n3' file as a positive test case and prints its AST.";
	}

	@Override
	protected boolean process(String[] args, List<String> flags) {
		type = Grammars.valueOf(args[0]);
		if (type == null) {
			Log.e("expected one of " + Arrays.toString(Grammars.values()) + " grammars");
			return false;
		}

		file = new File(args[1]);

		printAST = (flags.remove("-printAST") && !file.isDirectory());

		return true;
	}

	@Override
	protected String describeConfig() {
		return type.describe();
	}

	public ITestResult parse(File file) throws Exception {
		grammar = new Grammar();
		ParserRuleContext ctx = grammar.parse(file, type);

		createPrefixErrorVisitor(type, grammar.getParserListener()).visit(ctx);

		if (printAST)
			createPrintVisitor(type).visit(ctx);

		return new N3TestResult(grammar.getNumErrors());
	}

	@SuppressWarnings("unchecked")
	private AbstractParseTreeVisitor<Void> createPrintVisitor(Grammars type) throws Exception {
		String prefix = type.getClsPrefix();

		return (AbstractParseTreeVisitor<Void>) Class
				.forName("w3c.n3dev.parser.visitor." + prefix + "." + prefix + "PrintVisitor").getConstructor()
				.newInstance();
	}

	@SuppressWarnings("unchecked")
	private AbstractParseTreeVisitor<Void> createPrefixErrorVisitor(Grammars type, ParserErrorListener listener)
			throws Exception {

		String prefix = type.getClsPrefix();

		return (AbstractParseTreeVisitor<Void>) Class
				.forName("w3c.n3dev.parser.visitor." + prefix + "." + prefix + "PrefixErrorVisitor")
				.getConstructor(ParserErrorListener.class).newInstance(listener);
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