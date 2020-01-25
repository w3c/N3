package parser;

import java.util.BitSet;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import wvw.utils.log.Log;

public class n3DefaultLexerErrorListener extends n3AbstractLexerErrorListener {

	private String fileName;
	private int errorCnt = 0;

	public n3DefaultLexerErrorListener(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, BitSet arg5,
			ATNConfigSet arg6) {

		errorCnt++;
		Log.e(fileName + "[lexer]: " + "reportAmbiguity @" + arg2 + "-" + arg3 + " " + arg4 + " " + arg5 + " " + arg6);
	}

	@Override
	public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, BitSet arg4, ATNConfigSet arg5) {

		errorCnt++;
		Log.e(fileName + "[lexer]: " + "reportAttemptingFullContext @" + arg2 + "-" + arg3 + " " + arg4 + " " + arg5);
	}

	@Override
	public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2, int arg3, int arg4, ATNConfigSet arg5) {
		errorCnt++;
		Log.e(fileName + "[lexer]: " + "reportContextSensitivity @" + arg2 + "-" + arg3 + " " + arg4 + " " + arg5);
	}

	@Override
	public void syntaxError(Recognizer<?, ?> arg0, Object arg1, int arg2, int arg3, String arg4,
			RecognitionException arg5) {

		errorCnt++;
		Log.e(fileName + " [lexer]: " + "syntaxError for " + arg1 + " @" + arg2 + ":" + arg3 + " - " + arg4 + " "
				+ arg5);
	}

	public int getNumErrors() {
		return errorCnt;
	}
}