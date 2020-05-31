package w3c.n3dev.parser;

import org.antlr.v4.runtime.BaseErrorListener;

public abstract class n3ParserErrorListener extends BaseErrorListener {

	protected int errorCnt = 0;

	protected String name;

	public n3ParserErrorListener(String name) {
		this.name = name;
	}

	public abstract void prefixError(String offendingPrefix, String context, n3PrefixException e);

	protected void onError() {
		errorCnt++;
	}

	public int getNumErrors() {
		return errorCnt;
	}
}