package wvw.utils.log.target;

import wvw.utils.log.format.Formatter;

/**
 * @author wvw
 */

public class SystemOut extends FormattedLogTarget {

	public SystemOut() {
		super();
	}
	
	public SystemOut(Formatter formatter) {
		super(formatter);
	}
	
	protected void out(String msg) {
		System.out.println(msg);
	}

	public void done() {}
}