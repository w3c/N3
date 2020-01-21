package wvw.utils.log.target;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import wvw.utils.log.format.Formatter;

public class FileTarget extends FormattedLogTarget {

	// private int cnt = 0;
	// private int limit = 10;

	private FileWriter writer;

	public FileTarget(String path) {
		this(path, true);
	}

	public FileTarget(String path, boolean append) {
		createWriter(path, append);
	}

	public FileTarget(String path, Formatter formatter) {
		this(path, true, formatter);
	}

	public FileTarget(String path, boolean append, Formatter formatter) {
		super(formatter);

		createWriter(path, append);
	}

	private void createWriter(String path, boolean append) {
		try {
			writer = new FileWriter(new File(path), append);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void out(String msg) {
		try {
			writer.write(msg + "\n");

			// if (++cnt == limit) {
			writer.flush();

			// cnt = 0;
			// }

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void done() {
		try {
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}