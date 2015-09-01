package org.eclipse.incquery.viewmodel.core.actions;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.ReferenceRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;

public class ReferenceRuleMatchDisappeared extends
		RuleMatchProcessor<ReferenceRule> {

	public ReferenceRuleMatchDisappeared(ReferenceRule rule) {
		super(rule);
	}

	@Override
	public void doProcess(IPatternMatch match) {
		ElementRuleDescriptor ownerERD = rule.getRuleDescriptor().getOwnerElementRuleDescriptor();
		ElementRuleDescriptor targetERD = rule.getRuleDescriptor().getTargetElementRuleDescriptor();
		
		Set<EObject> sourcesOfReferenceStartPoint = getSourceEObjectsForStructuralFeatureRuleMatch(match, rule.getRuleDescriptor());
		Set<EObject> sourcesOfReferenceEndPoint = getTargetEObjectsForReferenceRuleMatch(match, rule.getRuleDescriptor());
		
		List<EObject> startPoints = traceabilityModelManager.getTargets(sourcesOfReferenceStartPoint, ownerERD.getId());
		List<EObject> endPoints = traceabilityModelManager.getTargets(sourcesOfReferenceEndPoint, targetERD.getId());
		
		for (EObject startPoint : startPoints) {
			for (EObject endPoint : endPoints) {
				ViewModelUtil.unset(startPoint, rule.getRuleDescriptor().getReference(), endPoint);
			}
		}
	}

}
