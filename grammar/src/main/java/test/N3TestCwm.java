package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class N3TestCwm extends N3Test {

	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			System.out.println("usage: java -jar n3TestCwm.jar <file or folder>\n\n" + "flags:\n"
					+ "-pos/neg: whether tests should be run as positive (-pos) or negative (-neg) tests. "
					+ "This flag is needed when testing an individual file, or a folder without a manifest file. "
					+ "It will override any manifest found in a folder.");
			return;
		}

		List<String> flags = new ArrayList<>();
		for (int i = 1; i < args.length; i++)
			flags.add(args[i]);

		String file = args[0];

		File f = new File(file);
		if (!f.exists()) {
			System.err.println("error: cannot find " + f.getPath());
			return;
		}

		File manifest = new File(f, "manifest.ttl");

		Boolean posTest = null;
		if (flags.contains("-pos") || flags.contains("-neg"))
			posTest = flags.contains("-pos");

		else {
			if (!f.isDirectory()) {
				System.err.println("error: expecting -pos/neg flag for an individual file test");
				return;

			} else if (!manifest.exists()) {
				System.err.println("error: no " + f.getPath() + "\\manifest.ttl found so need -pos/neg flag");
				return;
			}
		}

		N3TestCwm t = new N3TestCwm();

		System.out.println("-- CONFIG");

		if (f.isDirectory()) {
			System.out.println("folder: " + f.getCanonicalPath());

			// pos/neg flag overrides any potential manifest in the folder
			if (posTest != null) {
				System.out.println("running tests as " + (posTest ? "positive" : "negative"));

				System.out.println("\n\n-- TESTS");
				t.testFolder(posTest, f.getPath() + "/");
			} else {
				System.out.println("using manifest");

				System.out.println("\n\n-- TESTS");
				t.testManifest(f.getPath() + "/");
			}

		} else {
			System.out.println("file: " + f.getCanonicalPath());

			System.out.println("\n\n-- TESTS");
			System.out.println("\npass? " + (posTest ? t.positiveTest(f) : t.negativeTest(f)));
		}
	}

	@Override
	public IParserCmp parse(File file) throws Exception {
		String cmd = "python C:/cwm/cwm-1.2.1/build/scripts-2.7/cwm --n3 file:///" + file.getAbsolutePath();
//		System.out.println("cmd: " + cmd);

		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("cmd.exe", "/c", cmd);

		try {
			Process process = processBuilder.start();
			String output = collectOutput(process);

			int exitVal = process.waitFor();
			if (exitVal == 0) {
				boolean error = output.contains("Failed to parse file");
				return new MyParserCmp(error);

			} else {
				System.err.println("abnormal exit value: " + exitVal);
				System.out.println(output);
			}

		} catch (IOException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return new MyParserCmp(true);
	}

	private String collectOutput(Process process) throws IOException {
		StringBuilder output = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

		String line;
		while ((line = reader.readLine()) != null)
			output.append(line + "\n");

		return output.toString();
	}

	@Override
	protected boolean skipTest(File file) {
//		System.out.println("skipTest? " + file.length() + "<>" + 100 * 1024);

		return file.length() > 100 * 1024;
	}

	private class MyParserCmp implements IParserCmp {

		private boolean error;

		public MyParserCmp(boolean error) {
			this.error = error;
		}

		@Override
		public int getNumErrors() {
			return (error ? 1 : 0);
		}
	}
}
