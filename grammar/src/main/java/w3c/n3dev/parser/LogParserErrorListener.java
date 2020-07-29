package w3c.n3dev.parser;

import java.util.BitSet;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import wvw.utils.log.Log;

public class LogParserErrorListener extends ParserErrorListener {

	public LogParserErrorListener(String name) {
		super(name);
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {

		onError();

		Log.e(name + " [parser] " + "(@" + line + ":" + charPositionInLine + ") syntaxError for " + offendingSymbol
				+ " - " + msg);
	}

	@Override
	public void prefixError(String offendingPrefix, String context, PrefixException e) {
		onError();

		Log.e(name + " [parser]: prefixError: " + e.getMessage() + " (\"" + offendingPrefix + "\") in \"" + context
				+ "\"");
	}

	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
			BitSet ambigAlts, ATNConfigSet configs) {

		onError();

		Log.e(name + "[parser]: " + "reportAmbiguity @" + startIndex + "-" + stopIndex + ", exact: " + exact
				+ ", ambigAlts: " + ambigAlts); // + ", configs: " + configs);
	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
			BitSet conflictingAlts, ATNConfigSet configs) {

		onError();

		Log.e(name + "[parser]: " + "reportAttemptingFullContext @" + startIndex + "-" + stopIndex
				+ ", conflictingAlts: " + conflictingAlts + ", configs " + configs);
	}

	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
			ATNConfigSet configs) {

		onError();

		Log.e(name + "[lexer]: " + "reportContextSensitivity @" + startIndex + "-" + stopIndex + ", prediction: "
				+ prediction + ", configs: " + configs);
	}
}