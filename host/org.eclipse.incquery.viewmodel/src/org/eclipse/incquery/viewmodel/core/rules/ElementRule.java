package org.eclipse.incquery.viewmodel.core.rules;

import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.ViewModelManager;
import org.eclipse.incquery.viewmodel.core.actions.ElementRuleMatchAppeared;
import org.eclipse.incquery.viewmodel.core.actions.ElementRuleMatchDisappeared;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.transformation.evm.api.ActivationLifeCycle;
import org.eclipse.viatra.transformation.evm.specific.Lifecycles;

/**
 * This class represents an EVM rule for elements.
 * 
 * @author lengyela
 *
 */
public class ElementRule extends ViewModelRule<ElementRuleDescriptor> {

	public ElementRule(ElementRuleDescriptor ruleDescriptor,
			ViewModelManager viewModelManager) {
		super(ruleDescriptor, viewModelManager);
	}

	@Override
	public IMatchProcessor<?> getAppearedAction() {
		return new ElementRuleMatchAppeared(this);
	}

	@Override
	public IMatchProcessor<?> getDisappearedAction() {
		return new ElementRuleMatchDisappeared(this);
	}

	@Override
	public ActivationLifeCycle getActivationLifeCycle() {
		return Lifecycles.getDefault(false, true);
	}

	@Override
	public int getPriority() {
		return DefaultRulePriority.ELEMENT_RULE.getPriorityValue();
	}
	
}
