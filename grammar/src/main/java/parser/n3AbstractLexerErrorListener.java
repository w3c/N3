package parser;

import org.antlr.v4.runtime.BaseErrorListener;

public abstract class n3AbstractLexerErrorListener extends BaseErrorListener {

	public abstract int getNumErrors();
}