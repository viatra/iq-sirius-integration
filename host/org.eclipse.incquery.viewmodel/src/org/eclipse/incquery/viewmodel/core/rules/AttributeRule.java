package org.eclipse.incquery.viewmodel.core.rules;

import org.eclipse.incquery.viewmodel.configuration.AttributeRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.ViewModelManager;
import org.eclipse.incquery.viewmodel.core.actions.AttributeRuleMatchAppeared;
import org.eclipse.incquery.viewmodel.core.actions.AttributeRuleMatchDisappeared;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.transformation.evm.api.ActivationLifeCycle;
import org.eclipse.viatra.transformation.evm.api.event.EventFilter;
import org.eclipse.viatra.transformation.evm.specific.Lifecycles;

/**
 * This class represents an EVM rule for attributes.
 * 
 * @author lengyela
 *
 */
public class AttributeRule<T extends AttributeRuleDescriptor> extends ViewModelRule<T> {

	public AttributeRule(T ruleDescriptor,
			ViewModelManager viewModelManager) {
		super(ruleDescriptor, viewModelManager);
	}
	
	public AttributeRule(T ruleDescriptor, EventFilter<IPatternMatch> eventFilter,
			ViewModelManager viewModelManager) {
		super(ruleDescriptor, eventFilter, viewModelManager);
	}

	@Override
	public IMatchProcessor<?> getAppearedAction() {
		return new AttributeRuleMatchAppeared(this);
	}

	@Override
	public IMatchProcessor<?> getDisappearedAction() {
		return new AttributeRuleMatchDisappeared(this);
	}
	
	@Override
	public ActivationLifeCycle getActivationLifeCycle() {
		return Lifecycles.getDefault(false, true);
	}

	@Override
	public int getPriority() {
		return DefaultRulePriority.ATTRIBUTE_RULE.getPriorityValue();
	}
	
}
