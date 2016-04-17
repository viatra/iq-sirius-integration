package org.eclipse.incquery.viewmodel.core.rules;

import org.eclipse.incquery.viewmodel.configuration.RuleDescriptor;
import org.eclipse.incquery.viewmodel.core.ViewModelManager;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.transformation.evm.api.ActivationLifeCycle;
import org.eclipse.viatra.transformation.evm.api.event.EventFilter;
import org.eclipse.viatra.transformation.evm.specific.Lifecycles;

/**
 * This class is an abstract ancestor for EVM rules.
 * 
 * @author lengyela
 *
 * @param <T>
 */
public abstract class ViewModelRule<T extends RuleDescriptor> {
	
	protected T ruleDescriptor;
	
	protected EventFilter<IPatternMatch> eventFilter;
	
	protected ViewModelManager viewModelManager;
	
	protected IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> querySpecification;

	
	public static enum DefaultRulePriority {
		DEFAULT(0),
		ELEMENT_RULE(1),
		REFERENCE_RULE(2),
		ATTRIBUTE_RULE(3),
		HIDDEN_PARAMETRS_RULE(10);
		
		private int priorityValue = 0;
		
		DefaultRulePriority(int priorityValue) {
			this.priorityValue = priorityValue;
		}
		
		public int getPriorityValue() {
			return this.priorityValue;
		}
	}
	
	
	public ViewModelRule(T ruleDescriptor, ViewModelManager viewModelManager) {
		this(ruleDescriptor, null, viewModelManager);
	}

	public ViewModelRule(T ruleDescriptor, EventFilter<IPatternMatch> eventFilter, ViewModelManager viewModelManager) {
		this.ruleDescriptor = ruleDescriptor;
		this.eventFilter = eventFilter;
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
	
	public EventFilter<IPatternMatch> getEventFilter() {
		return eventFilter;
	}
	
	public int getPriority() {
		return DefaultRulePriority.DEFAULT.getPriorityValue();
	}
	
	public IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> getQuerySpecification() {
		return querySpecification;
	}
	
	public T getRuleDescriptor() {
		return ruleDescriptor;
	}
	
	public ViewModelManager getViewModelManager() {
		return this.viewModelManager;
	}
	
	public void setEventFilter(EventFilter<IPatternMatch> eventFilter) {
		this.eventFilter = eventFilter;
	}
}
