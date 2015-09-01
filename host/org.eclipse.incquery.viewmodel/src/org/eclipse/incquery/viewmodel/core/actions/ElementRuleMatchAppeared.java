package org.eclipse.incquery.viewmodel.core.actions;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.viewmodel.core.rules.ElementRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;

import com.google.common.collect.Sets;

public class ElementRuleMatchAppeared extends RuleMatchProcessor<ElementRule> {


	public ElementRuleMatchAppeared(ElementRule rule) {
		super(rule);
	}

	@Override
	public void doProcess(IPatternMatch match) {
		/* Collect source EObjects from match */
		Set<EObject> sources = getSourceEObjectsForElementRuleMatch(match);

		/* Create new element in the target model */
		Set<EObject> targets = Sets.newHashSet();

		EObject createdElement = ViewModelUtil.create(rule.getRuleDescriptor().getElementType());
		
		ViewModelUtil.add(
				createdElement,
				rule.getRuleDescriptor().getConfiguration().getTargetModel());

		targets.add(createdElement);
		/* ************************************** */
		
		/* Create new trace */
		traceabilityModelManager.createTrace(rule.getRuleDescriptor().getId(), sources, targets);
	}

}
