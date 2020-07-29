package w3c.n3dev.parser;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
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

public class Grammar {

	public enum Grammars {

		turtle, n3, n3ws("n3");

		private String lng;
		private String clsPrefix;

		private Grammars() {
			lng = toString();
			clsPrefix = toString();
		}

		private Grammars(String lng) {
			this.lng = lng;
			clsPrefix = toString();
		}

		public String getLng() {
			return lng;
		}

		public String getClsPrefix() {
			return clsPrefix;
		}

		public String describe() {
			return toString() + " (language: " + getLng() + ", parser: " + getClsPrefix() + ")";
		}
	}

	private Lexer lexer;
	private Parser parser;
	private LexerErrorListener lexerListener;
	private ParserErrorListener parserListener;

	public ParserRuleContext parse(File file, Grammars type) throws Exception {
		createGrammarComponents(type, file);

		Method m = findParseMethod(parser);
		if (m != null)
			return (ParserRuleContext) m.invoke(parser);

		else {
			System.err.println("error: could not find parser method for " + type);
			return null;
		}
	}

	public LexerErrorListener getLexerListener() {
		return lexerListener;
	}

	public ParserErrorListener getParserListener() {
		return parserListener;
	}

	public int getNumErrors() {
		return lexerListener.getNumErrors() + parserListener.getNumErrors();
	}

	private Method findParseMethod(Parser parser) {
		Pattern p = Pattern.compile(".*Doc");
		for (Method m : parser.getClass().getMethods()) {

			if (p.matcher(m.getName()).matches())
				return m;
		}

		return null;
	}

	private void createGrammarComponents(Grammars type, File file) throws Exception {
		Pair<Class<? extends Lexer>, Class<? extends Parser>> clss = getGrammarClasses(type);

		lexer = clss.getLeft().getConstructor(CharStream.class)
				.newInstance(CharStreams.fromPath(file.toPath(), Charset.forName("UTF-8")));

		// (antlr 4.4)
		// new ANTLRInputStream(new InputStreamReader(new FileInputStream(file),
		// Charset.forName("UTF-8"))));

//		lexer.removeErrorListeners();
		lexerListener = new LogLexerErrorListener(file.getName());
		lexer.addErrorListener(lexerListener);

		parser = clss.getRight().getConstructor(TokenStream.class).newInstance(new CommonTokenStream(lexer));

//		parser.removeErrorListeners();
		parserListener = new LogParserErrorListener(file.getName());
		parser.addErrorListener(parserListener);
	}

	@SuppressWarnings("unchecked")
	private Pair<Class<? extends Lexer>, Class<? extends Parser>> getGrammarClasses(Grammars type)
			throws ClassNotFoundException {

		return ImmutablePair.of(
				(Class<? extends Lexer>) Class.forName("w3c.n3dev.parser.antlr." + type.getClsPrefix() + "Lexer"),
				(Class<? extends Parser>) Class.forName("w3c.n3dev.parser.antlr." + type.getClsPrefix() + "Parser"));
	}
}
