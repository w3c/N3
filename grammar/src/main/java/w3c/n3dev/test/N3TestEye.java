package w3c.n3dev.test;

import java.io.File;
import java.util.function.Function;

public class N3TestEye extends N3TestExec {

	public static void main(String[] args) throws Exception {
		new N3TestEye().run(args);
	}

	public N3TestEye() {
		super("eye");

		genCmd = new Function<File, String>() {

			public String apply(File file) {
				return execLoc.getAbsolutePath() + " --n3 " + file.getAbsolutePath();
			}
		};
	}

	@Override
	protected boolean foundError(String output) {
		return output.contains("** ERROR **");
	}
}
