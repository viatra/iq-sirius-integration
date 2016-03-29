package org.eclipse.incquery.viewmodel.core.actions;

import java.util.List;
import java.util.Map;

import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.AttributeRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.EObjectTarget;
import org.eclipse.incquery.viewmodel.traceability.TraceTarget;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;



public class AttributeRuleMatchAppeared extends
		RuleMatchProcessor<AttributeRule> {

	public AttributeRuleMatchAppeared(AttributeRule rule) {
		super(rule);
	}

	@Override
	public void doProcess(IPatternMatch match) {
		ElementRuleDescriptor ownerERD = rule.getRuleDescriptor().getOwnerElementRuleDescriptor();

		Map<String, Object> sourcesOfOwnerElement = getSourcesOfOwnerElement(match, rule.getRuleDescriptor());
		
		Object calculatedValue = match.get(rule.getRuleDescriptor().getCalculatedPatternParameterName());
		
		// TODO Ebből pontosan egy darab lehet minden esetben, még akkor is, ha a használt minta egyszerűsítve van
		// TODO egyszerűsített mintákból készíteni kell egy olyat, ami ki van eglszítve a hiányzó source illetve target paraméterekkel
		List<TraceTarget> owners = traceabilityModelManager.getTargets(sourcesOfOwnerElement, ownerERD.getId());

		if (owners.size() != 1) {
			throw new IllegalStateException("Not exactly one owner belongs to the given match and ruleDescriptorId!(" + owners.toString() + ")");
		}
		
		// Set the corresponding attribute in the target model
		ViewModelUtil.set(
				((EObjectTarget) owners.get(0)).getTarget(),
				rule.getRuleDescriptor().getAttribute(),
				calculatedValue);
		
		// Create a new trace
		traceabilityModelManager.createTrace(
				rule.getRuleDescriptor().getId(),
				getSourcesForMatch(match),
				(EObjectTarget) owners.get(0),
				calculatedValue,
				rule.getRuleDescriptor().getAttribute().getName());
	}
	
}
