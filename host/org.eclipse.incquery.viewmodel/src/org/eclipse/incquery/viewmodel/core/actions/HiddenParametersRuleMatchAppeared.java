package org.eclipse.incquery.viewmodel.core.actions;

import java.util.Set;

import org.eclipse.incquery.viewmodel.configuration.HiddenParametersRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.HiddenParametersRule;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.util.HiddenParametersMatch;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;



public class HiddenParametersRuleMatchAppeared<T extends HiddenParametersRule<? extends HiddenParametersRuleDescriptor>> extends RuleMatchProcessor<T> {

	public HiddenParametersRuleMatchAppeared(T rule) {
		super(rule);
	}

	@Override
	public Trace doProcess(IPatternMatch match) {
		// Get affected traces
		Set<Trace> traces = traceabilityModelManager.getTraces(
				rule.getViewModelManager(),
				((HiddenParametersMatch) match).getVisibleParameters(),
				rule.getRuleDescriptor().getTransformationRuleDescriptors());
		
		/* Add new hidden parameters for trace sources */
		for (Trace trace : traces) {
			traceabilityModelManager.addSources(
					trace,
					((HiddenParametersMatch) match).getHiddenParameters(),
					true);
		}
		
		return null;
	}

}
