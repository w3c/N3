package wvw.utils.log.target;

import wvw.utils.log.format.Formatter;

public class AggregateTarget extends FormattedLogTarget {

	private FormattedLogTarget[] targets;

	public AggregateTarget(FormattedLogTarget... targets) {
		this.targets = targets;
	}

	public AggregateTarget(Formatter formatter, FormattedLogTarget... targets) {
		super(formatter);

		this.targets = targets;
	}

	protected void out(String msg) {
		for (FormattedLogTarget target : targets)

			target.out(msg);
	}

	public void done() {
		for (LogTarget target : targets)
			target.done();
	}
}