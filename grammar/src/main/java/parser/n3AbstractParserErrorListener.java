package parser;

import org.antlr.v4.runtime.BaseErrorListener;

public abstract class n3AbstractParserErrorListener extends BaseErrorListener {

	public abstract void prefixError(String offendingPrefix, String pname, n3PrefixException e);

	public abstract int getNumErrors();
}