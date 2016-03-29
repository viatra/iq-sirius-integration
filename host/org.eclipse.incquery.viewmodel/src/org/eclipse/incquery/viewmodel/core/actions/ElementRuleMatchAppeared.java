package org.eclipse.incquery.viewmodel.core.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.viewmodel.core.rules.ElementRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

public class ElementRuleMatchAppeared extends RuleMatchProcessor<ElementRule> {


	public ElementRuleMatchAppeared(ElementRule rule) {
		super(rule);
	}

	@Override
	public void doProcess(IPatternMatch match) {
		/* Create new element in the target model */
		EObject createdElement = ViewModelUtil.create(rule.getRuleDescriptor().getElementType());
		
		ViewModelUtil.add(
				createdElement,
				rule.getRuleDescriptor().getConfiguration().getTargetModel());
		/* ************************************** */
		
		/* Create new trace */
		traceabilityModelManager.createTrace(
				rule.getRuleDescriptor().getId(),
				getSourcesForMatch(match),
				createdElement);
	}

}
