package w3c.n3dev.parser;

import org.antlr.v4.runtime.BaseErrorListener;

public abstract class LexerErrorListener extends BaseErrorListener {

	protected int errorCnt = 0;

	protected String name;

	public LexerErrorListener(String name) {
		this.name = name;
	}

	protected void onError() {
		errorCnt++;
	}

	public int getNumErrors() {
		return errorCnt;
	}
}