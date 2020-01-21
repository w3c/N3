package wvw.utils.log.target;

/**
 * @author wvw
 */

public interface LogTarget {

	public void d(String tag, Object msg);

	public void v(String tag, Object msg);

	public void i(String tag, Object msg);

	public void w(String tag, Object msg);

	public void e(String tag, Object msg);

	public void e(String tag, Object msg, Exception e);

	public void l(String tag, Object msg);

	public void l(String tag, Object msg, Exception e);
	
	public void done();
}