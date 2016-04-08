package org.eclipse.incquery.viewmodel.core.schedulers;

import org.eclipse.viatra.transformation.evm.api.Executor;
import org.eclipse.viatra.transformation.evm.api.Scheduler;

public class ManualScheduler extends Scheduler {

	protected ManualScheduler(Executor executor) {
		super(executor);
	}

	public static class ManualSchedulerFactory implements ISchedulerFactory {

		@Override
		public Scheduler prepareScheduler(Executor executor) {
			return new ManualScheduler(executor);
		}
	}
}
