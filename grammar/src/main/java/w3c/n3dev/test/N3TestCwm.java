package w3c.n3dev.test;

import java.io.File;
import java.util.function.Function;

public class N3TestCwm extends N3TestExec {

	public static void main(String[] args) throws Exception {
		new N3TestCwm().run(args);
	}

	public N3TestCwm() {
		super("cwm");

		genCmd = new Function<File, String>() {

			public String apply(File file) {
				return "python " + execLoc.getAbsolutePath() + " --n3 file:///" + file.getAbsolutePath();
			}
		};
	}

	@Override
	protected boolean skipTest(File file) {
//		Log.i("skipTest? " + file.length() + "<>" + 100 * 1024);

		return file.length() > 100 * 1024;
	}

	@Override
	protected String name() {
		return "cwm";
	}
	
	@Override
	protected String cmdNote() {
		return "requires python to be installed";
	}
	
	@Override
	protected String cmdFlags() {
		return null;
	}

	@Override
	protected boolean foundError(String output) {
		return output.contains("Failed to parse file");
	}
}
