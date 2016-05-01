package org.eclipse.incquery.viewmodel.core.schedulers;

import org.eclipse.viatra.transformation.evm.api.ScheduledExecution;
import org.eclipse.viatra.transformation.evm.api.Scheduler;

public class ManualScheduler extends Scheduler {

	protected ManualScheduler(ScheduledExecution execution) {
		super(execution);
	}

	public static class ManualSchedulerFactory implements ISchedulerFactory {

		@Override
		public Scheduler prepareScheduler(ScheduledExecution execution) {
			return new ManualScheduler(execution);
		}
	}
}
