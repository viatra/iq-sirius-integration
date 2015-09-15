package org.eclipse.incquery.viewmodel.core.actions;

import java.util.List;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.viewmodel.core.rules.ElementRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.EObjectTarget;
import org.eclipse.incquery.viewmodel.traceability.Trace;


public class ElementRuleMatchDisappeared extends RuleMatchProcessor<ElementRule> {

	public ElementRuleMatchDisappeared(ElementRule rule) {
		super(rule);
	}

	@Override
	public void doProcess(IPatternMatch match) {
		/* Get target EObjects */
		List<Trace> traces = traceabilityModelManager.getTraces(
				getSourcesForMatch(match), rule.getRuleDescriptor().getId());

		if (traces.size() != 1) {
			throw new IllegalStateException("Not exactly one trace belongs to the given match and ruleDescriptorId!");
		}
		
		/* Delete target from the view */
		ViewModelUtil.remove(((EObjectTarget) traces.get(0).getTarget()).getTarget());
		
		/* Delete trace */
		traceabilityModelManager.removeTrace(traces.get(0));
	}

}
