package org.eclipse.incquery.viewmodel.core.rules;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.evm.api.ActivationLifeCycle;
import org.eclipse.incquery.runtime.evm.specific.Lifecycles;
import org.eclipse.incquery.viewmodel.configuration.ReferenceRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.ViewModelManager;
import org.eclipse.incquery.viewmodel.core.actions.ReferenceRuleMatchAppeared;
import org.eclipse.incquery.viewmodel.core.actions.ReferenceRuleMatchDisappeared;

/**
 * This class represents an EVM rule for references.
 * 
 * @author lengyela
 *
 */
public class ReferenceRule extends ViewModelRule<ReferenceRuleDescriptor> {

	public ReferenceRule(ReferenceRuleDescriptor ruleDescriptor,
			ViewModelManager viewModelManager) {
		super(ruleDescriptor, viewModelManager);
	}

	@Override
	public IMatchProcessor<?> getAppearedAction() {
		return new ReferenceRuleMatchAppeared(this);
	}

	@Override
	public IMatchProcessor<?> getDisappearedAction() {
		return new ReferenceRuleMatchDisappeared(this);
	}
	
	@Override
	public ActivationLifeCycle getActivationLifeCycle() {
		return Lifecycles.getDefault(false, true);
	}

	@Override
	public int getPriority() {
		return DefaultRulePriority.REFERENCE_RULE.getPriorityValue();
	}

}
