package org.eclipse.incquery.viewmodel.configuration.util;

import org.eclipse.incquery.viewmodel.configuration.Configuration;
import org.eclipse.incquery.viewmodel.configuration.RuleDescriptor;

public class ConfigurationModelUtil {

	// TODO lehetne IncQueryvel
	public static RuleDescriptor getRuleDescriptorById(Configuration configurationModel, long id) {
		for (RuleDescriptor ruleDescriptor : configurationModel.getRuleDescriptors()) {
			if (ruleDescriptor.getId() == id) {
				return ruleDescriptor;
			}
		}
		
		return null;
	}
	
}
