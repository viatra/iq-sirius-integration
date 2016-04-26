package org.eclipse.incquery.viewmodel.core.actions;

import org.eclipse.incquery.viewmodel.configuration.AttributeRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.AttributeRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.EObjectTarget;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;



public class AttributeRuleMatchDisappeared<T extends AttributeRule<? extends AttributeRuleDescriptor>> extends
		RuleMatchProcessor<T> {

	public AttributeRuleMatchDisappeared(T rule) {
		super(rule);
	}

	@Override
	public Trace doProcess(IPatternMatch match) {
		ElementRuleDescriptor ownerERD = rule.getRuleDescriptor().getOwnerElementRuleDescriptor();

		Object calculatedValue = match.get(rule.getRuleDescriptor().getCalculatedPatternParameterName());

		// Get Match for the 'owner element'
		IPatternMatch ownerElementRuleMatch = getPatternMatch(ownerERD.getPatternFQN(),
				getSourcesOfOwnerElement(match, rule.getRuleDescriptor()));
		
		Trace ownerTrace = traceabilityModelManager.getTrace(ownerElementRuleMatch, ownerERD.getId());

		// Unset the corresponding attribute in the target model
		if (ownerTrace != null) {
			ViewModelUtil.unset(
					((EObjectTarget) ownerTrace.getTarget()).getTarget(),
					rule.getRuleDescriptor().getAttribute(),
					calculatedValue);
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
