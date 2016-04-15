package org.eclipse.incquery.viewmodel.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.incquery.viewmodel.configuration.RuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.ViewModelRule;


public class AbstractRuleProvider {

	protected Map<RuleDescriptor, ViewModelRule<? extends RuleDescriptor>> ruleDescriptorToRule = null;
	
	
	public AbstractRuleProvider() {
		this.ruleDescriptorToRule = new HashMap<RuleDescriptor, ViewModelRule<? extends RuleDescriptor>>();
	}
	
	public ViewModelRule<? extends RuleDescriptor> getRuleForDescriptor(RuleDescriptor ruleDescriptor) {
		return ruleDescriptorToRule.get(ruleDescriptor);
	}
	
}
