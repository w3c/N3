package w3c.n3dev.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;

import rdf.util.NS;
import wvw.utils.log.Log;

public class RdfTestManifest {

	private String base = null;
	private Model manifest;

	public RdfTestManifest(String folder, File mf) throws Exception {
		this.manifest = readManifest(folder, mf);
	}

	protected Model readManifest(String folder, File mf) throws Exception {
		Log.i("parsing " + mf.getPath());

		getBase(mf.getPath());
		Log.i("");

		return ModelFactory.createDefaultModel().read(new FileInputStream(mf.getPath()), null, "TURTLE");
	}

	public void forEachTest(boolean positive, String lang, Consumer<String> fn) {
		lang = StringUtils.capitalize(lang);
		String posNeg = (positive ? "Positive" : "Negative");

		Resource type = manifest.createResource(NS.uri("test:Test" + lang + posNeg + "Syntax"));

		StmtIterator stmtIt = manifest.listStatements(null, manifest.createProperty(NS.uri("rdf:type")), type);
		while (stmtIt.hasNext()) {
			Statement stmt = stmtIt.next();
			Resource testCase = stmt.getSubject();

			Statement status = testCase.getProperty(manifest.createProperty(NS.uri("rdft", "approval")));
			if (status != null && status.getObject().asResource().getURI().equals(NS.uri("rdft", "Rejected"))) {
				Log.i("skipping (rejected): " + testCase);

				continue;
			}

			Statement actionStmt = testCase.getProperty(manifest.createProperty(NS.uri("mf:action")));
			if (actionStmt != null) {
				String test = actionStmt.getObject().asResource().getURI();

				test = test.substring(base.length());
				if (test.startsWith("/") || test.startsWith("\\"))
					test = test.substring(1);

				fn.accept(test);

			} else
				System.err.println("could not find action for " + testCase);
		}
	}

	protected void getBase(String path) throws IOException {
		Pattern p = Pattern.compile("\\s*@base\\s*<(.*?)>\\s*\\.\\s*");

		BufferedReader br = new BufferedReader(new FileReader(path));
		String line = null;
		while ((line = br.readLine()) != null) {
			Matcher m = p.matcher(line);
			if (m.matches()) {
				base = m.group(1);
				break;
			}
		}
		br.close();

		if (base == null)
//			base = "file:\\\\\\" + System.getProperty("user.dir") + "\\";
			base = "file:\\\\" + System.getProperty("user.dir") + "\\";

		Log.i("assuming base = " + base);
	}
}
