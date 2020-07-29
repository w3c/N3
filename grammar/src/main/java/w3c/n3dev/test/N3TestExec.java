package w3c.n3dev.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Function;

import wvw.utils.log.Log;

public abstract class N3TestExec extends N3Test {

	protected String name;
	protected File execLoc;

	protected Function<File, String> genCmd;

	public N3TestExec(String name) {
		this.name = name;
	}

	@Override
	protected int minArgLen() {
		return 2;
	}

	protected String cmdUsage() {
		return "<location of executable> <file or folder>";
	}

	@Override
	protected String examples() {
		// @formatter:off
		return "java -jar " + jarName() + " <path to executable> ../tests/N3Tests\n"
				+ "tests files inside the 'N3Tests' folder, as listed in its 'manifest.ttl', as " + name + " test cases.\n\n" 
				
				+ "java -jar " + jarName() + " <path to executable> ../tests/N3Tests -mf manifest.n3\n"
				+ "tests files inside the 'N3Tests' folder, as listed in its 'manifest.n3', as " + name + " test cases.";
		// @formatter:on
	}

	protected boolean process(String[] args, List<String> flags) {
		execLoc = new File(args[0]);
		if (!execLoc.exists()) {
			Log.e("cannot find executable at " + execLoc.getPath());
			return false;
		}

		file = new File(args[1]);

		return true;
	}

	protected String describeConfig() {
		return "system: " + name + " (" + execLoc.getAbsolutePath() + ")";
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
			// cmd = "bash -c " + cmd;
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
