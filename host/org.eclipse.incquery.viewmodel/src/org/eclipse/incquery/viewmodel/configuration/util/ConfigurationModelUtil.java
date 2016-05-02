package org.eclipse.incquery.viewmodel.configuration.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.viewmodel.configuration.Configuration;
import org.eclipse.incquery.viewmodel.configuration.ConfigurationFactory;
import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.PatternParameterMapping;
import org.eclipse.incquery.viewmodel.configuration.ReferenceRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.RuleDescriptor;

// TODO kell ez?
public class ConfigurationModelUtil {

//	// TODO lehetne IncQueryvel
//	public static TransformationRuleDescriptor getTransformationRuleDescriptorById(Configuration configurationModel, long id) {
//		for (TransformationRuleDescriptor ruleDescriptor : configurationModel.getTransformationRuleDescriptors()) {
//			if (ruleDescriptor.getId() == id) {
//				return ruleDescriptor;
//			}
//		}
//		
//		return null;
//	}
//
//	// TODO lehetne mintával (minta már kész)
//	public static List<TransformationRuleDescriptor> getTransformationRuleDescriptorsByPatternFQN(Configuration configurationModel, String patternFQN) {
//		List<TransformationRuleDescriptor> result = Lists.newArrayList();
//		
//		for (TransformationRuleDescriptor ruleDescriptor : configurationModel.getTransformationRuleDescriptors()) {
//			if (ruleDescriptor.getPatternFQN().equals(patternFQN)) {
//				result.add(ruleDescriptor);
//			}
//		}
//		
//		return result;
//	}
	
	/**
	 * Creates an ElementRuleDescriptor instance from the given parameters.
	 * @param id
	 * @param elementType
	 * @param patternFQN
	 * @return
	 */
	public static ElementRuleDescriptor createElementRuleDescriptor(long id, EClass elementType, String patternFQN) {
        ElementRuleDescriptor ruleDescriptor = ConfigurationFactory.eINSTANCE.createElementRuleDescriptor();
        ruleDescriptor.setId(id);
        ruleDescriptor.setElementType(elementType);
        ruleDescriptor.setPatternFQN(patternFQN);

        return ruleDescriptor;
	}
	
	/**
	 * Creates a ReferenceRuleDescriptor instance from the given parameters.
	 * @param id
	 * @param reference
	 * @param patternFQN
	 * @param owner
	 * @param target
	 * @return
	 */
	public static ReferenceRuleDescriptor createReferenceRuleDescriptor(long id, EReference reference, String patternFQN, ElementRuleDescriptor owner, ElementRuleDescriptor target) {
        ReferenceRuleDescriptor ruleDescriptor = ConfigurationFactory.eINSTANCE.createReferenceRuleDescriptor();
        ruleDescriptor.setId(id);
        ruleDescriptor.setOwnerElementRuleDescriptor(owner);
        ruleDescriptor.setTargetElementRuleDescriptor(target);
        ruleDescriptor.setReference(reference);
        ruleDescriptor.setPatternFQN(patternFQN);

        return ruleDescriptor;
	}

	/**
	 * Creates a {@link PatternParameterMapping} instance from the given parameters.
	 * @param elementRulePatternParameterName
	 * @param structuralFeatureRuleParameterName
	 * @return
	 */
	public static PatternParameterMapping createPatternParameterMapping(String elementRulePatternParameterName, String structuralFeatureRuleParameterName) {
		PatternParameterMapping patternParameterMapping = ConfigurationFactory.eINSTANCE.createPatternParameterMapping();
        patternParameterMapping.setERulePatternParameterName(elementRulePatternParameterName);
        patternParameterMapping.setSfRulePatternParameterName(structuralFeatureRuleParameterName);
		
		return patternParameterMapping;
	}
	
	/**
	 * Refreshes the ID of the {@link RuleDescriptor} instances to be UNIQUE.
	 * @param configurationModel
	 */
    public static void refreshTransformationRuleDescriptorIds(Configuration configurationModel) {
        for (int i = 0; i < configurationModel.getTransformationRuleDescriptors().size(); i++) {
            configurationModel.getTransformationRuleDescriptors().get(i).setId(i);
        }
    }
}
