package w3c.n3dev.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import wvw.utils.log.Log;
import wvw.utils.log.target.AggregateTarget;
import wvw.utils.log.target.FileTarget;
import wvw.utils.log.target.SystemOut;

public abstract class N3Test {

	private static List<String> suppExts = Arrays.asList("ttl", "n3");

	private List<String> skipped;

	protected N3Test() {
		Log.setLevel(Log.D);
		Log.setTarget(new AggregateTarget(new SystemOut(), new FileTarget("test_out.txt")));
	}

	public void testManifest(String folder, String grammar) throws Exception {
		RdfTestManifest manifest = new RdfTestManifest(folder);

		skipped = new ArrayList<>();

		ManifestTestConsumer posFn = new ManifestTestConsumer(folder, true);
		manifest.forEachTest(true, grammar, posFn);

		ManifestTestConsumer negFn = new ManifestTestConsumer(folder, false);
		manifest.forEachTest(false, grammar, negFn);

		printFailed(posFn.getCount() + negFn.getCount(), posFn.getFailed(), negFn.getFailed());
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
			ITestResult cmp = parse(file);
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
			ITestResult cmp = parse(file);
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

	protected abstract ITestResult parse(File file) throws Exception;

	protected boolean skipTest(File file) {
		return false;
	}

	protected interface ITestResult {

		public int getNumErrors();
	}

	protected class ManifestTestConsumer implements Consumer<String> {

		private String folder;
		private boolean positive;

		private int count = 0;
		private List<String> failed = new ArrayList<>();

		public ManifestTestConsumer(String folder, boolean positive) {
			this.folder = folder;
			this.positive = positive;
		}

		@Override
		public void accept(String test) {
			File file = new File(folder, test);

			if (!skipTest(file)) {
				if ((positive && !positiveTest(file)) || (!positive && !negativeTest(file)))
					failed.add(test);

				count++;

			} else
				skipped.add(test);
		}

		public int getCount() {
			return count;
		}

		public List<String> getFailed() {
			return failed;
		}
	}
}
