package parser;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import wvw.utils.log.Log;

public class n3LogParserErrorListener extends n3ParserErrorListener {

	public n3LogParserErrorListener(String name) {
		super(name);
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {

		onError();

		Log.e(name + " [parser]: syntaxError for " + offendingSymbol + " @" + line + ":" + charPositionInLine + " - "
				+ msg);
	}

	@Override
	public void prefixError(String offendingPrefix, String context, n3PrefixException e) {
		onError();

		Log.e(name + " [parser]: prefixError: " + e.getMessage() + " (\"" + offendingPrefix + "\") in \"" + context
				+ "\"");
	}
}