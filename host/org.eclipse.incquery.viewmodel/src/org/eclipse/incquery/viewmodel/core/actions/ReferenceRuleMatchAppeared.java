package org.eclipse.incquery.viewmodel.core.actions;

import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.ReferenceRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.ReferenceRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.EObjectTarget;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;



public class ReferenceRuleMatchAppeared<T extends ReferenceRule<? extends ReferenceRuleDescriptor>> extends
		RuleMatchProcessor<T> {

	public ReferenceRuleMatchAppeared(T rule) {
		super(rule);
	}

	@Override
	public Trace doProcess(IPatternMatch match) {
		ElementRuleDescriptor ownerERD = rule.getRuleDescriptor().getOwnerElementRuleDescriptor();
		ElementRuleDescriptor targetERD = rule.getRuleDescriptor().getTargetElementRuleDescriptor();
		
		// Get Match instances for 'owner element' and 'target element'
		IPatternMatch ownerElementRuleMatch = getPatternMatch(ownerERD.getPatternFQN(),
				getSourcesOfOwnerElement(match, rule.getRuleDescriptor()));
		IPatternMatch targetElementRuleMatch = getPatternMatch(targetERD.getPatternFQN(),
				getSourcesOfTargetElement(match, rule.getRuleDescriptor()));
		
		Trace ownerTrace = traceabilityModelManager.getTrace(ownerElementRuleMatch, ownerERD.getId());
		Trace targetTrace = traceabilityModelManager.getTrace(targetElementRuleMatch, targetERD.getId());
		
		if (ownerTrace ==  null) {
			throw new IllegalStateException("The appropriate Trace object can not be found for the 'owner element'!");
		}
		if (targetTrace ==  null) {
			throw new IllegalStateException("The appropriate Trace object can not be found for the 'target element'!");
		}
		
		
		// Set the corresponding reference in the target model
		ViewModelUtil.set(
				((EObjectTarget) ownerTrace.getTarget()).getTarget(),
				rule.getRuleDescriptor().getReference(),
				((EObjectTarget) targetTrace.getTarget()).getTarget());
		
		// Create new trace
		return traceabilityModelManager.createTrace(
				match,
				rule.getRuleDescriptor().getId(),
				getSourcesForMatch(match),
				(EObjectTarget) ownerTrace.getTarget(),
				(EObjectTarget) targetTrace.getTarget(),
				rule.getRuleDescriptor().getReference().getName());
	}

}
