package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;

import rdf.util.NS;
import wvw.utils.log.Log;
import wvw.utils.log.target.AggregateTarget;
import wvw.utils.log.target.FileTarget;
import wvw.utils.log.target.SystemOut;

public abstract class N3Test {

	private static List<String> suppExts = Arrays.asList("ttl", "n3");

	private String base = null;
	private List<String> skipped;

	protected N3Test() {
		Log.setLevel(Log.D);
		Log.setTarget(new AggregateTarget(new SystemOut(), new FileTarget("test_out.txt")));
	}

	public void testManifest(String folder) throws Exception {
		Model manifest = readManifest(folder);

		int totalNr = 0;
		skipped = new ArrayList<>();
		List<String> posFailed = new ArrayList<>();
		List<String> negFailed = new ArrayList<>();

		totalNr += doSyntaxTests(manifest.createResource(NS.uri("rdft:TestTurtlePositiveSyntax")), (test, name) -> {
			if (!positiveTest(test))
				posFailed.add(name);

		}, folder, manifest);

		totalNr += doSyntaxTests(manifest.createResource(NS.uri("rdft:TestTurtleNegativeSyntax")), (test, name) -> {
			if (!negativeTest(test))
				negFailed.add(name);

		}, folder, manifest);

		printFailed(totalNr, posFailed, negFailed);
	}

	protected Model readManifest(String folder) throws Exception {
		Log.i("parsing manifest.ttl");

		getBase(folder + "manifest.ttl");
		return ModelFactory.createDefaultModel().read(new FileInputStream(folder + "manifest.ttl"), null, "TURTLE");
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
			base = "file://" + System.getProperty("user.dir") + "/";

		Log.i("assuming base = " + base);
	}

	protected int doSyntaxTests(Resource type, BiConsumer<File, String> fn, String folder, Model manifest) {
		int nr = 0;

		StmtIterator stmtIt = manifest.listStatements(null, manifest.createProperty(NS.uri("rdf:type")), type);
		while (stmtIt.hasNext()) {
			Statement stmt = stmtIt.next();
			Resource testCase = stmt.getSubject();

			if (!testCase.getProperty(manifest.createProperty(NS.uri("rdft", "approval"))).getObject().asResource()
					.getURI().equals(NS.uri("rdft", "Approved")))

				continue;

			Statement actionStmt = testCase.getProperty(manifest.createProperty(NS.uri("mf", "action")));
			if (actionStmt != null) {
				String test = actionStmt.getObject().asResource().getURI();
				test = test.substring(base.length());

				File f = new File(folder + test);
				if (!skipTest(f)) {
					fn.accept(new File(folder + test), test);
					nr++;

				} else
					skipped.add(test);

			} else
				System.err.println("could not find action for " + testCase);
		}

		return nr;
	}

	public void testFolder(boolean pos, String folder) {
		skipped = new ArrayList<>();
		List<String> failed = new ArrayList<>();

		int totalNr = testFolder(pos, folder, "", failed);
		if (pos)
			printFailed(totalNr, failed, null);
		else
			printFailed(totalNr, null, failed);
	}

	public int testFolder(boolean pos, String folder, String prefix, List<String> failed) {
		int nr = 0;

		for (File file : new File(folder).listFiles()) {
			if (file.isDirectory())
				nr += testFolder(pos, file.getPath(), prefix + file.getName() + "/", failed);

			else if (suppExts.stream().anyMatch(e -> file.getName().endsWith("." + e))) {
				String name = prefix + file.getName();

				if (!skipTest(file)) {
					try {
						boolean success = (pos ? positiveTest(file, name) : negativeTest(file, name));
						if (!success)
							failed.add(name);

						nr++;

					} catch (Exception e) {
						e.printStackTrace();
					}

				} else
					skipped.add(name);
			}
		}

		return nr;

	}

	public boolean positiveTest(File file) {
		return positiveTest(file, file.getName());
	}

	public boolean positiveTest(File file, String name) {
		Log.i("testing (positive): " + file.getPath());
		try {
			IParserCmp cmp = parse(file);
			return (cmp.getNumErrors() == 0);

		} catch (Exception e) {
			System.err.println("error (" + file.getName() + "): " + e.getMessage());
			e.printStackTrace();

			return false;
		}
	}

	public boolean negativeTest(File file) {
		return negativeTest(file, file.getName());
	}

	public boolean negativeTest(File file, String name) {
		Log.i("testing (negative): " + name);
		try {
			IParserCmp cmp = parse(file);
			return (cmp.getNumErrors() > 0);

		} catch (Exception e) {
			System.err.println("error (" + file.getName() + "): " + e.getMessage());

			return false;
		}
	}

	protected void printFailed(int totalNr, List<String> posFailed, List<String> negFailed) {
		Log.i("\n\n-- RESULTS");
		Log.i("total # tests = " + totalNr);

		if (posFailed != null) {
			Log.i("\n> positive tests:");

			Log.i("# failed = " + posFailed.size());
			Log.i("failed: " + posFailed);
		}

		if (negFailed != null) {
			Log.i("\n> negative tests:");

			Log.i("# failed = " + negFailed.size());
			Log.i("failed: " + negFailed);
		}

		Log.i("\n> skipped tests:");

		Log.i("# skipped = " + skipped.size());
		Log.i("skipped: " + skipped);
	}

	protected abstract IParserCmp parse(File file) throws Exception;

	protected boolean skipTest(File file) {
		return false;
	}

	protected interface IParserCmp {

		public int getNumErrors();
	}
}
