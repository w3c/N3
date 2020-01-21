package wvw.utils.log.format;

/**
	@author wvw
 */

public interface Formatter {

	public String format(String msg);
	
	public String format(Object obj);
	
	public String format(Exception e);
	
	public String format(String ID, String msg);

	public String format(Object obj, String msg);
    
    public String format(Object obj, Exception e);

    public String format(Object obj, String msg, Exception e);
}
