package wvw.utils.log.target;

import wvw.utils.log.format.DefaultFormatter;
import wvw.utils.log.format.Formatter;

/**
 * @author wvw
 */

public abstract class FormattedLogTarget implements LogTarget {

	private Formatter formatter;

	public FormattedLogTarget() {
		this.formatter = new DefaultFormatter();
	}

	public FormattedLogTarget(Formatter formatter) {
		this.formatter = formatter;
	}

	public void d(String tag, Object msg) {
		out(formatter.format(msg));
	}

	public void v(String tag, Object msg) {
		out(formatter.format(msg));
	}

	public void i(String tag, Object msg) {
		out(formatter.format(msg));
	}

	public void w(String tag, Object msg) {
		out(formatter.format(msg));
	}

	public void e(String tag, Object msg) {
		out(formatter.format(msg));
	}

	public void e(String tag, Object msg, Exception e) {
		out(formatter.format(msg, e));
	}

	public void l(String tag, Object msg) {
		out(formatter.format(msg));
	}

	public void l(String tag, Object msg, Exception e) {
		out(formatter.format(msg, e));
	}

	protected abstract void out(String msg);
}