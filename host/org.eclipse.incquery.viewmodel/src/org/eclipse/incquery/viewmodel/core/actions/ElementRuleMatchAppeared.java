package org.eclipse.incquery.viewmodel.core.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.ElementRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

public class ElementRuleMatchAppeared<T extends ElementRule<? extends ElementRuleDescriptor>> extends RuleMatchProcessor<T> {


	public ElementRuleMatchAppeared(T rule) {
		super(rule);
	}

	@Override
	public Trace doProcess(IPatternMatch match) {
		/* Create new element in the target model */
		EObject createdElement = ViewModelUtil.create(rule.getRuleDescriptor().getElementType());
		
		ViewModelUtil.add(
				createdElement,
				rule.getRuleDescriptor().getConfiguration().getTargetModel());
		/* ************************************** */
		
		/* Create new trace */
		return traceabilityModelManager.createTrace(
				match,
				rule.getRuleDescriptor().getId(),
				getSourcesForMatch(match),
				createdElement);
	}

}
