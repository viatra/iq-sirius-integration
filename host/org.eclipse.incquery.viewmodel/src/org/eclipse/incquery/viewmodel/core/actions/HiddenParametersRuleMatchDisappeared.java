package org.eclipse.incquery.viewmodel.core.actions;

import java.util.Set;

import org.eclipse.incquery.viewmodel.core.rules.HiddenParametersRule;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.util.HiddenParametersMatch;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;



public class HiddenParametersRuleMatchDisappeared extends RuleMatchProcessor<HiddenParametersRule> {

	public HiddenParametersRuleMatchDisappeared(HiddenParametersRule rule) {
		super(rule);
	}

	@Override
	public void doProcess(IPatternMatch match) {
		/* Get corresponding trace */
		Set<Trace> traces = traceabilityModelManager.getTraces(
				((HiddenParametersMatch) match).getVisibleParameters(),
				rule.getRuleDescriptor().getTransformationRuleDescriptors());
		
		/* Remove hidden parameters from trace sources */
		for (Trace trace : traces) {
			traceabilityModelManager.removeSources(
					trace,
					((HiddenParametersMatch) match).getHiddenParameters(),
					true);
		}
	}

}
