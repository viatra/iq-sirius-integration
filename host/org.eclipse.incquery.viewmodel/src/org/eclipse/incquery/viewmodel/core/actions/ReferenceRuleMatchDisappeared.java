package org.eclipse.incquery.viewmodel.core.actions;

import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.ReferenceRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.ReferenceRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.EObjectTarget;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;


public class ReferenceRuleMatchDisappeared<T extends ReferenceRule<? extends ReferenceRuleDescriptor>> extends
		RuleMatchProcessor<T> {

	public ReferenceRuleMatchDisappeared(T rule) {
		super(rule);
	}

	@Override
	public Trace doProcess(IPatternMatch match) {
		ElementRuleDescriptor ownerERD = rule.getRuleDescriptor().getOwnerElementRuleDescriptor();
		ElementRuleDescriptor targetERD = rule.getRuleDescriptor().getTargetElementRuleDescriptor();
		
		// Get Match instances for the 'owner element' and 'target element'
		IPatternMatch ownerElementRuleMatch = getPatternMatch(ownerERD.getPatternFQN(),
				getSourcesOfOwnerElement(match, rule.getRuleDescriptor()));
		IPatternMatch targetElementRuleMatch = getPatternMatch(targetERD.getPatternFQN(),
				getSourcesOfTargetElement(match, rule.getRuleDescriptor()));
		
		Trace ownerTrace = traceabilityModelManager.getTrace(ownerElementRuleMatch, ownerERD.getId());
		Trace targetTrace = traceabilityModelManager.getTrace(targetElementRuleMatch, targetERD.getId());

		
		// Remove reference from the target model
		if (ownerTrace != null && targetTrace != null) {
			ViewModelUtil.unset(
					((EObjectTarget) ownerTrace.getTarget()).getTarget(),
					rule.getRuleDescriptor().getReference(),
					((EObjectTarget) targetTrace.getTarget()).getTarget());
		}
		
		/* Remove trace */
		Trace trace = traceabilityModelManager.getTrace(match, rule.getRuleDescriptor().getId());
		if (trace == null) {
			throw new IllegalStateException("Trace for the given match can not be found!");
		}

		traceabilityModelManager.removeTrace(match, rule.getRuleDescriptor().getId(), trace);
		
		return trace;
		/* ************ */
	}

}
