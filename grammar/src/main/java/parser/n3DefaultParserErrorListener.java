package parser;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import wvw.utils.log.Log;

public class n3DefaultParserErrorListener extends n3AbstractParserErrorListener {

	private String fileName;
	private int errorCnt = 0;

	public n3DefaultParserErrorListener(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {

		errorCnt++;
		Log.e(fileName + " [parser]: syntaxError for " + offendingSymbol + " @" + line + ":" + charPositionInLine
				+ " - " + msg);
	}

	public void prefixError(String offendingPrefix, String context, n3PrefixException e) {
		errorCnt++;

		Log.e(fileName + " [parser]: prefixError: " + e.getMessage() + " (\"" + offendingPrefix + "\") in \"" + context
				+ "\"");
	}

	public int getNumErrors() {
		return errorCnt;
	}
}