package w3c.n3dev.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;

import wvw.utils.log.Log;

public abstract class N3TestExec extends N3Test {

	protected String name;
	protected File execLoc;

	protected Function<File, String> genCmd;

	public N3TestExec(String name) {
		this.name = name;
	}

	protected void run(String[] args) throws Exception {
		if (args.length < 2) {
			String jarName = "n3Test" + StringUtils.capitalize(name) + ".jar";
			String usage = "usage: java -jar " + jarName + " <location of executable> <file or folder>\n"
					+ "all output will be stored in ./out.txt";

			String note = getCmdNote();
			if (note != null)
				usage += "\n\nnote: " + note;

			usage += "\n\nflags:\n\n"
					+ "-pos/neg: whether tests should be run as positive (-pos) or negative (-neg) tests. "
					+ "This flag is needed when testing an individual file, or a folder without a manifest file. "
					+ "It will override any manifest found in a folder." + "\n\nexample:\n\n" + "java -jar " + jarName
					+ " C:/<path to executable> ../tests/N3Tests\n"
					+ "tests files inside the 'N3Tests' folder, as listed in its 'manifest.ttl', as " + name
					+ " test cases.";

			System.out.println(usage);

			return;
		}

		List<String> flags = new ArrayList<>();
		for (int i = 2; i < args.length; i++)
			flags.add(args[i]);

		execLoc = new File(args[0]);
		if (!execLoc.exists()) {
			System.err.println("error: cannot find executable at " + execLoc.getPath());
			return;
		}

		File file = new File(args[1]);
		if (!file.exists()) {
			System.err.println("error: cannot find " + file.getPath());
			return;
		}

		File manifest = new File(file, "manifest.ttl");

		Boolean posTest = null;
		if (flags.contains("-pos") || flags.contains("-neg"))
			posTest = flags.contains("-pos");

		else {
			if (!file.isDirectory()) {
				System.err.println("error: expecting -pos/neg flag for an individual file test");
				return;

			} else if (!manifest.exists()) {
				System.err.println("error: no " + file.getPath() + "\\manifest.ttl found so need -pos/neg flag");
				return;
			}
		}

		Log.i("-- CONFIG");
		Log.i("system: " + name + " (" + execLoc.getAbsolutePath() + ")");

		if (file.isDirectory()) {
			Log.i("folder: " + file.getCanonicalPath());

			// pos/neg flag overrides any potential manifest in the folder
			if (posTest != null) {
				Log.i("running tests as " + (posTest ? "positive" : "negative"));

				Log.i("\n\n-- TESTS");
				testFolder(posTest, file.getPath() + "/");
			} else {
				Log.i("using manifest");

				Log.i("\n\n-- TESTS");
				testManifest(file.getPath() + "/", "n3");
			}

		} else {
			Log.i("file: " + file.getCanonicalPath());

			Log.i("\n\n-- TESTS");
			Log.i("\npass? " + (posTest ? positiveTest(file) : negativeTest(file)));
		}
	}

	@Override
	public ITestResult parse(File file) throws Exception {
		String cmd = genCmd.apply(file);
//		Log.i("cmd: " + cmd);

		try {
			Process process = executeCmd(cmd);

			String output = collectOutput(process);
//			Log.i(output);

			process.waitFor();

//			int exitVal = process.waitFor();
//			if (exitVal == 0) {
			boolean error = foundError(output);
			if (error)
				Log.i(output);

			return new ExecTestResult(error);

//			} else {
//				System.err.println("abnormal exit value: " + exitVal);
//				Log.i(output);
//			}

		} catch (IOException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return new ExecTestResult(true);
	}

	private Process executeCmd(String cmd) throws IOException {
		switch (DetectOS.detect()) {

		case WIN:
			cmd = "cmd.exe /c " + cmd;
			break;

		case MAC:
			cmd = "/bin/sh -c " + cmd;
			break;

		case NIX:
			//cmd = "bash -c " + cmd;
			break;
		}

		return Runtime.getRuntime().exec(cmd);
	}

	private String collectOutput(Process process) throws IOException {
		return "in: " + collectOutput(process.getInputStream()) + "\nerror: " + collectOutput(process.getErrorStream());
	}

	private String collectOutput(InputStream in) throws IOException {
		StringBuilder output = new StringBuilder();

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		String line;
		while ((line = reader.readLine()) != null)
			output.append(line + "\n");

		return output.toString();
	}

	protected String getCmdNote() {
		return null;
	}

	protected abstract boolean foundError(String output);

	protected class ExecTestResult implements ITestResult {

		private boolean error;

		public ExecTestResult(boolean error) {
			this.error = error;
		}

		@Override
		public int getNumErrors() {
			return (error ? 1 : 0);
		}
	}

	protected static class DetectOS {

		private enum OS {
			WIN, MAC, NIX
		}

		public static OS detect() {
			String os = System.getProperty("os.name").toLowerCase();
//			Log.i("os: " + os);

			if (os.indexOf("win") >= 0)
				return OS.WIN;

			if (os.indexOf("mac") >= 0)
				return OS.MAC;

			if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0)
				return OS.NIX;

			return null;
		}
	}
}
