package w3c.n3dev.test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import w3c.n3dev.parser.LogLexerErrorListener;
import w3c.n3dev.parser.LogParserErrorListener;
import w3c.n3dev.parser.ParserErrorListener;
import w3c.n3dev.parser.PrefixException;
import w3c.n3dev.parser.antlr.n3Lexer;
import w3c.n3dev.parser.antlr.n3Parser;
import w3c.n3dev.parser.event.n3EventHandler;
import wvw.utils.log.Log;

public class Test {

	public static void main(String[] args) throws IOException {
		File file = new File("../../eye-tests/test0.n3");
		Log.d(file.getAbsolutePath());

		n3Lexer lexer = new n3Lexer(CharStreams.fromPath(file.toPath(), Charset.forName("UTF-8")));
		lexer.removeErrorListeners();
		lexer.addErrorListener(new LogLexerErrorListener(file.getName()));

		n3Parser parser = new n3Parser(new CommonTokenStream(lexer));
		parser.removeErrorListeners();
		parser.addErrorListener(new LogParserErrorListener(file.getName()));

		parser.removeParseListeners();
		parser.addParseListener(new n3EventHandler("", new ParserErrorListener("") {

			public void prefixError(String offendingPrefix, String pname, PrefixException e) {
				onError();
				Log.e(offendingPrefix + " - " + pname + " - " + e.getMessage());
			}
		}));

		parser.n3Doc();
	}
}