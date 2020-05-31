package w3c.n3dev.parser;

public class n3PrefixException extends Exception {

	private static final long serialVersionUID = 1L;

	public static enum PrefixErrors {

		/* REDEF_PREFIX("redefining existing prefix"), */ UNKNOWN_PREFIX("referencing unknown prefix");

		private String msg;

		private PrefixErrors(String msg) {
			this.msg = msg;
		}

		public String getMsg() {
			return msg;
		}
	}

	private PrefixErrors type;

	public n3PrefixException(PrefixErrors type) {
		super(type.getMsg());

		this.type = type;
	}

	public n3PrefixException(PrefixErrors type, String e) {
		super(e);

		this.type = type;
	}

	public PrefixErrors getType() {
		return type;
	}
}
