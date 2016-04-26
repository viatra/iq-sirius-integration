package org.eclipse.incquery.viewmodel.core.actions;

import org.eclipse.incquery.viewmodel.configuration.AttributeRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.AttributeRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.EObjectTarget;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;



public class AttributeRuleMatchAppeared<T extends AttributeRule<? extends AttributeRuleDescriptor>> extends
		RuleMatchProcessor<T> {

	public AttributeRuleMatchAppeared(T rule) {
		super(rule);
	}

	@Override
	public Trace doProcess(IPatternMatch match) {
		ElementRuleDescriptor ownerERD = rule.getRuleDescriptor().getOwnerElementRuleDescriptor();

		Object calculatedValue = match.get(rule.getRuleDescriptor().getCalculatedPatternParameterName());

		// Get Match for the 'owner element'
		IPatternMatch ownerElementRuleMatch = getPatternMatch(ownerERD.getPatternFQN(),
				getSourcesOfOwnerElement(match, rule.getRuleDescriptor()));

		// Get trace for the owner element
		Trace ownerTrace = traceabilityModelManager.getTrace(ownerElementRuleMatch, ownerERD.getId());
		if (ownerTrace ==  null) {
			throw new IllegalStateException("The appropriate Trace object can not be found!");
		}
		
		// Set the corresponding attribute in the target model
		ViewModelUtil.set(
				((EObjectTarget) ownerTrace.getTarget()).getTarget(),
				rule.getRuleDescriptor().getAttribute(),
				calculatedValue);
		
		// Create a new trace and add it to the Traceability model
		return traceabilityModelManager.createTrace(
				match,
				rule.getRuleDescriptor().getId(),
				getSourcesForMatch(match),
				(EObjectTarget) ownerTrace.getTarget(),
				calculatedValue,
				rule.getRuleDescriptor().getAttribute().getName());
	}
	
}
