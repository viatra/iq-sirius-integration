package org.eclipse.incquery.viewmodel.core.actions;

import java.util.Set;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.viewmodel.core.rules.HiddenParametersRule;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.util.HiddenParametersMatch;

public class HiddenParametersRuleMatchAppeared extends RuleMatchProcessor<HiddenParametersRule> {

	public HiddenParametersRuleMatchAppeared(HiddenParametersRule rule) {
		super(rule);
	}

	@Override
	public void doProcess(IPatternMatch match) {
		// Get affected traces
		Set<Trace> traces = traceabilityModelManager.getTraces(
				((HiddenParametersMatch) match).getVisibleParameters(),
				rule.getRuleDescriptor().getTransformationRuleDescriptors());
		
		/* Add new hidden parameters for trace sources */
		for (Trace trace : traces) {
			traceabilityModelManager.addSources(
					trace,
					((HiddenParametersMatch) match).getHiddenParameters(),
					true);
		}
	}

}
