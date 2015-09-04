package org.eclipse.incquery.viewmodel.core.rules;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.evm.api.ActivationLifeCycle;
import org.eclipse.incquery.runtime.evm.specific.Lifecycles;
import org.eclipse.incquery.viewmodel.configuration.RuleDescriptor;
import org.eclipse.incquery.viewmodel.core.ViewModelManager;

/**
 * This class is an abstract ancestor for EVM rules.
 * 
 * @author lengyela
 *
 * @param <T>
 */
public abstract class ViewModelRule<T extends RuleDescriptor> {
	
	protected T ruleDescriptor;
	
	protected ViewModelManager viewModelManager;
	
	protected IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> querySpecification;
	
	
	public static enum DefaultRulePriority {
		DEFAULT(0),
		ELEMENT_RULE(1),
		REFERENCE_RULE(2),
		ATTRIBUTE_RULE(3);
		
		private int priorityValue = 0;
		
		DefaultRulePriority(int priorityValue) {
			this.priorityValue = priorityValue;
		}
		
		public int getPriorityValue() {
			return this.priorityValue;
		}
	}
	
	
	public ViewModelRule(T ruleDescriptor, ViewModelManager viewModelManager) {
		this.ruleDescriptor = ruleDescriptor;
		this.viewModelManager = viewModelManager;
		this.querySpecification = this.viewModelManager.getQuerySpecification(this.ruleDescriptor.getPatternFQN());
	}
	
	public IMatchProcessor<?> getAppearedAction() {
		return null;
	}
	
	public IMatchProcessor<?> getDisappearedAction() {
		return null;
	}
	
	public IMatchProcessor<?> getUpdatedAction() {
		return null;
	}
	
	public ActivationLifeCycle getActivationLifeCycle() {
		return Lifecycles.getDefault(false, false);
	}
	
	public int getPriority() {
		return DefaultRulePriority.DEFAULT.getPriorityValue();
	}
	
	public T getRuleDescriptor() {
		return ruleDescriptor;
	}
	
	public IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> getQuerySpecification() {
		return querySpecification;
	}
	
	public ViewModelManager getViewModelManager() {
		return this.viewModelManager;
	}
}
