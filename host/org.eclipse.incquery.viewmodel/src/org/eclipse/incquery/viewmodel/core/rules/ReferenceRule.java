package org.eclipse.incquery.viewmodel.core.rules;

import org.eclipse.incquery.viewmodel.configuration.ReferenceRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.ViewModelManager;
import org.eclipse.incquery.viewmodel.core.actions.ReferenceRuleMatchAppeared;
import org.eclipse.incquery.viewmodel.core.actions.ReferenceRuleMatchDisappeared;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.transformation.evm.api.ActivationLifeCycle;
import org.eclipse.viatra.transformation.evm.specific.Lifecycles;

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
