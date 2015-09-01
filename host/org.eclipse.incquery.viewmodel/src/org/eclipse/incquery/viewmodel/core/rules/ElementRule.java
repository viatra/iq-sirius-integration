package org.eclipse.incquery.viewmodel.core.rules;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.evm.api.ActivationLifeCycle;
import org.eclipse.incquery.runtime.evm.specific.Lifecycles;
import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.ViewModelManager;
import org.eclipse.incquery.viewmodel.core.actions.ElementRuleMatchAppeared;
import org.eclipse.incquery.viewmodel.core.actions.ElementRuleMatchDisappeared;

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
