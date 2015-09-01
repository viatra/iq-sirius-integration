package org.eclipse.incquery.viewmodel.core.actions;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.AttributeRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;

public class AttributeRuleMatchDisappeared extends
		RuleMatchProcessor<AttributeRule> {

	public AttributeRuleMatchDisappeared(AttributeRule rule) {
		super(rule);
	}

	@Override
	public void doProcess(IPatternMatch match) {
		ElementRuleDescriptor ownerERD = rule.getRuleDescriptor().getOwnerElementRuleDescriptor();

		Set<EObject> sourcesOfOwnerElement = getSourceEObjectsForStructuralFeatureRuleMatch(match, rule.getRuleDescriptor());
		
		Object calculatedValue = match.get(rule.getRuleDescriptor().getCalculatedPatternParameterName());
		List<EObject> ownerElements = traceabilityModelManager.getTargets(sourcesOfOwnerElement, ownerERD.getId());
		for (EObject ownerElement : ownerElements) {
			ViewModelUtil.unset(ownerElement, rule.getRuleDescriptor().getAttribute(), calculatedValue);
		}
	}
	
}
