package w3c.n3dev.parser;

import java.util.BitSet;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import wvw.utils.log.Log;

public class LogLexerErrorListener extends LexerErrorListener {

	public LogLexerErrorListener(String name) {
		super(name);
	}

	@Override
	public void syntaxError(Recognizer<?, ?> arg0, Object arg1, int arg2, int arg3, String arg4,
			RecognitionException arg5) {

		onError();

		Log.e(name + " [lexer] " + "(@" + arg2 + ":" + arg3 + ") syntaxError for " + arg1 + " - " + arg4 + " " + arg5);
	}

	@Override
	public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, BitSet arg5,
			ATNConfigSet arg6) {

		onError();

		Log.e(name + "[lexer]: " + "reportAmbiguity @" + arg2 + "-" + arg3 + " " + arg4 + " " + arg5 + " " + arg6);
	}

	@Override
	public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, BitSet arg4, ATNConfigSet arg5) {
		onError();

		Log.e(name + "[lexer]: " + "reportAttemptingFullContext @" + arg2 + "-" + arg3 + " " + arg4 + " " + arg5);
	}

	@Override
	public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2, int arg3, int arg4, ATNConfigSet arg5) {
		onError();

		Log.e(name + "[lexer]: " + "reportContextSensitivity @" + arg2 + "-" + arg3 + " " + arg4 + " " + arg5);
	}
}