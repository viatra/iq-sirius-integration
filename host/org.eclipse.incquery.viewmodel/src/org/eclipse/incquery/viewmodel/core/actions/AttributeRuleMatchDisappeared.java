package org.eclipse.incquery.viewmodel.core.actions;

import java.util.List;
import java.util.Map;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.AttributeRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.EObjectTarget;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.TraceTarget;

public class AttributeRuleMatchDisappeared extends
		RuleMatchProcessor<AttributeRule> {

	public AttributeRuleMatchDisappeared(AttributeRule rule) {
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
		
		if (owners.size() > 1) {
			throw new IllegalStateException("More than one owner belongs to the given match and ruleDescriptorId!");
		}

		// Unset the corresponding attribute in the target model
		if (owners.size() == 1) {
			ViewModelUtil.unset(
					((EObjectTarget) owners.get(0)).getTarget(),
					rule.getRuleDescriptor().getAttribute(),
					calculatedValue);
		}
		
		/* Remove trace */
		List<Trace> traces = traceabilityModelManager.getTraces(getSourcesForMatch(match), rule.getRuleDescriptor().getId());
		
		if (traces.size() != 1) {
			throw new IllegalStateException("Not exactly one trace belongs to the given match and ruleDescriptorId!");
		}
		
		traceabilityModelManager.removeTrace(traces.get(0));
		/* ************ */
	}
	
}
