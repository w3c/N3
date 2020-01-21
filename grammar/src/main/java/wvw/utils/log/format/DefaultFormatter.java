package wvw.utils.log.format;

/**
 * @author wvw
 */

public class DefaultFormatter implements Formatter {

	public String format(String msg) {
		return msg;
	}

	public String format(Object obj) {
		return (obj == null ? "null" : obj.toString());
	}

	public String format(Exception e) {
		return "(" + e.getClass() + ") " + e.getMessage();
	}

	public String format(String ID, String msg) {
		return ID + ": " + msg;
	}

	public String format(Object obj, String msg) {
		return "[" + obj.getClass() + "]: " + msg;
	}

	public String format(Object obj, Exception e) {
		return "[" + obj.getClass() + "] Exception: (" + e.getClass() + ") "
				+ e.getMessage();
	}

	public String format(Object obj, String msg, Exception e) {
		return "[" + obj.getClass() + "]: " + msg + "; " + "Exception: ("
				+ e.getClass() + ") " + e.getMessage();
	}
}
