package w3c.n3dev.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.lang3.StringUtils;

import w3c.n3dev.parser.Grammar.Grammars;
import wvw.utils.log.Log;
import wvw.utils.log.target.AggregateTarget;
import wvw.utils.log.target.FileTarget;
import wvw.utils.log.target.SystemOut;

public abstract class N3Test {

	// to be set by subclasses in process() method
	protected File file;

	private static List<String> extensions = Arrays.asList("ttl", "n3");
	private List<String> skipped;

	protected N3Test() {
		Log.setLevel(Log.D);
		Log.setTarget(new AggregateTarget(new SystemOut(), new FileTarget("test_out.txt", false)));
	}

	protected void run(String[] args) throws Exception {
		if (args.length < minArgLen()) {
			// @formatter:off
			String usage = 
					"usage: java -jar " + jarName() + " " + cmdUsage() + "\n" 
					+ "all output will be stored in ./test_out.txt";

			String cmdNote = cmdNote();
			if (cmdNote != null)
				usage += "\n\nnote: " + cmdNote;

			String cmdFlags = cmdFlags();
			
			usage += "\n\nflags:"
					+ "\n\n-pos/neg: whether tests should be run as positive (-pos) or negative (-neg) tests. "
					+ "This flag is needed when testing an individual file, or a folder without a manifest file. "
					+ "It will override any manifest found in a folder." 
					
					+ "\n\n-mf <file>: name of the manifest file within the given folder, "
					+ "if different from 'manifest.ttl' or 'manifest.n3'."
					
					+ (cmdFlags != null ? cmdFlags : "")
					
					+ "\n\nexample:\n\n" 
					+ examples();
			// @formatter:on

			System.out.println(usage);
			return;
		}

		List<String> flags = new ArrayList<>();
		for (int i = minArgLen(); i < args.length; i++)
			flags.add(args[i]);

		if (!process(args, flags))
			return;

		File mf = null;
		Boolean posTest = null;

		for (int i = 0; i < flags.size(); i++) {
			String flag = flags.get(i);

			if (flag.equals("-pos"))
				posTest = true;

			else if (flag.equals("-neg"))
				posTest = false;

			else if (flag.equals("-mf"))
				mf = new File(file, flags.get(++i));

			else
				Log.e("unknown flag: " + flag);
		}

		if (posTest == null) {
			if (file.isDirectory()) {
				if (mf == null)
					mf = new File(file, "manifest.ttl");

				if (!mf.exists()) {
					Log.e("no " + mf.getPath() + " found (alternatively, use -pos/neg flag, "
							+ "or use -mf flag to indicate other manifest file)");
					return;
				}

			} else {
				Log.e("expecting -pos/neg flag for an individual file test");
				return;
			}
		}

		Log.i("\n-- CONFIG");
		Log.i(describeConfig());

		if (file.isDirectory()) {
			Log.i("folder: " + file.getCanonicalPath());

			// pos/neg flag overrides any potential manifest in the folder
			if (posTest != null) {
				Log.i("running tests as " + (posTest ? "positive" : "negative"));

				Log.i("\n\n-- TESTS");
				testFolder(posTest, file.getPath() + "/");

			} else {
				Log.i("using manifest: " + mf.getPath());

				Log.i("\n\n-- TESTS");
				testManifest(file.getPath() + "/", mf, Grammars.n3);
			}

		} else {
			Log.i("file: " + file.getCanonicalPath());

			Log.i("\n\n-- TESTS");
			Log.i("\npass? " + (posTest ? positiveTest(file) : negativeTest(file)));
		}
	}

	protected String jarName() {
		return "n3Test" + StringUtils.capitalize(name()) + ".jar";
	}

	protected abstract String name();

	protected abstract int minArgLen();

	protected abstract String cmdUsage();

	protected abstract String cmdNote();

	protected abstract String cmdFlags();

	protected abstract String examples();

	// subclasses need to set "file" field from "args"
	// remove all processed flags from "flags"

	protected abstract boolean process(String[] args, List<String> flags);

	protected abstract String describeConfig();

	public void testManifest(String folder, File mf, Grammars type) throws Exception {
		RdfTestManifest manifest = new RdfTestManifest(folder, mf);

		skipped = new ArrayList<>();

		ManifestTestConsumer posFn = new ManifestTestConsumer(folder, true);
		manifest.forEachTest(true, type.getLng(), posFn);

		ManifestTestConsumer negFn = new ManifestTestConsumer(folder, false);
		manifest.forEachTest(false, type.getLng(), negFn);

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

			else if (extensions.stream().anyMatch(e -> file.getName().endsWith("." + e))) {
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
			Log.e("(" + file.getName() + "): " + e.getMessage());
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
			Log.e("(" + file.getName() + "): " + e.getMessage());

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
