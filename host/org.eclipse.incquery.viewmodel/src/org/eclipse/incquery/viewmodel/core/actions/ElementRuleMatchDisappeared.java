package org.eclipse.incquery.viewmodel.core.actions;

import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.ElementRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.EObjectTarget;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;


public class ElementRuleMatchDisappeared<T extends ElementRule<? extends ElementRuleDescriptor>> extends RuleMatchProcessor<T> {

	public ElementRuleMatchDisappeared(T rule) {
		super(rule);
	}

	@Override
	public Trace doProcess(IPatternMatch match) {
		Trace trace = traceabilityModelManager.getTrace(match, rule.getRuleDescriptor().getId());
		if (trace == null) {
			throw new IllegalStateException("Trace for the given match can not be found!");
		}
		
		/* Delete target from the view */
		ViewModelUtil.remove(((EObjectTarget) trace.getTarget()).getTarget());
		
		/* Delete trace */
		traceabilityModelManager.removeTrace(match, rule.getRuleDescriptor().getId(), trace);
		
		return trace;
	}

}
