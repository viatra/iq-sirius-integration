package org.eclipse.incquery.viewmodel.core.rules;

import org.eclipse.incquery.viewmodel.configuration.HiddenParametersRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.ViewModelManager;
import org.eclipse.incquery.viewmodel.core.actions.HiddenParametersRuleMatchAppeared;
import org.eclipse.incquery.viewmodel.core.actions.HiddenParametersRuleMatchDisappeared;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.transformation.evm.api.ActivationLifeCycle;
import org.eclipse.viatra.transformation.evm.specific.Lifecycles;

/**
 * This class represents an EVM rule, that manages the hidden parameters for a match.
 *  
 * @author lengyela
 *
 */
public class HiddenParametersRule extends ViewModelRule<HiddenParametersRuleDescriptor> {

	public HiddenParametersRule(HiddenParametersRuleDescriptor ruleDescriptor, ViewModelManager viewModelManager) {
		super(ruleDescriptor, viewModelManager);
	}

	@Override
	public IMatchProcessor<?> getAppearedAction() {
		return new HiddenParametersRuleMatchAppeared(this);
	}

	@Override
	public IMatchProcessor<?> getDisappearedAction() {
		return new HiddenParametersRuleMatchDisappeared(this);
	}
	
	@Override
	public ActivationLifeCycle getActivationLifeCycle() {
		return Lifecycles.getDefault(false, true);
	}

	@Override
	public int getPriority() {
		return DefaultRulePriority.HIDDEN_PARAMETRS_RULE.getPriorityValue();
	}
}
