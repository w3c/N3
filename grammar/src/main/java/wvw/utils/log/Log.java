package wvw.utils.log;

import wvw.utils.log.target.LogTarget;
import wvw.utils.log.target.SystemOut;

public class Log {

	private static String tag;
	private static LogTarget target = new SystemOut();

	public static final int NO_LOG = -1;
	public static final int D = 0;
	public static final int V = 1;
	public static final int I = 2;
	public static final int W = 3;
	public static final int E = 4;

	// NOTE change level here directly to ensure dead-code detection
	// (see TestDeadCode)

	// at least, it avoids the (X >= LVL) check ..
	// make sure to comment *all* Log.d statements (jena-core/NOTES)

	private static int LVL = D;
	public static final int OFF = 255;

	public static void setTag(String tag) {
		Log.tag = tag;
	}

	public static void setTarget(LogTarget target) {
		Log.target = target;
	}

	public static void setLevel(int lvl) {
		Log.LVL = lvl;
	}

	public static void d(Object msg) {
		if (D >= LVL)
			target.d(tag, msg);
	}

	public static void v(Object msg) {
		if (V >= LVL)
			target.v(tag, msg);
	}

	public static void i(Object msg) {
		if (I >= LVL)
			target.i(tag, msg);
	}

	public static void w(Object msg) {
		if (W >= LVL)
			target.w(tag, "WARNING: " + msg);
	}

	public static void e(Object msg) {
		if (E >= LVL)
			target.e(tag, "ERROR: " + msg);
	}

	public static void e(Object msg, Exception e) {
		if (E >= LVL)
			target.e(tag, "ERROR: " + msg, e);
	}

	public static void l(Object msg, int lvl) {
		if (lvl >= LVL)
			target.l(tag, msg);
	}

	public static void l(Object msg, Exception e, int lvl) {
		if (lvl >= LVL)
			target.l(tag, msg, e);
	}

	public static void done() {
		target.done();
	}
}
