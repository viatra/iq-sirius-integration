package org.eclipse.incquery.viewmodel.core.actions;

import java.util.List;
import java.util.Map;

import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.ReferenceRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.EObjectTarget;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.TraceTarget;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;


public class ReferenceRuleMatchDisappeared extends
		RuleMatchProcessor<ReferenceRule> {

	public ReferenceRuleMatchDisappeared(ReferenceRule rule) {
		super(rule);
	}

	@Override
	public void doProcess(IPatternMatch match) {
		ElementRuleDescriptor ownerERD = rule.getRuleDescriptor().getOwnerElementRuleDescriptor();
		ElementRuleDescriptor targetERD = rule.getRuleDescriptor().getTargetElementRuleDescriptor();
		
		Map<String, Object> sourcesOfReferenceOwner = getSourcesOfOwnerElement(match, rule.getRuleDescriptor());
		Map<String, Object> sourcesOfReferenceTarget = getSourcesOfTargetElement(match, rule.getRuleDescriptor());
		
		// TODO Ebből pontosan egy darab lehet minden esetben, még akkor is, ha a használt minta egyszerűsítve van
		// TODO egyszerűsített mintákból készíteni kell egy olyat, ami ki van eglszítve a hiányzó source illetve target paraméterekkel
		List<TraceTarget> owners = traceabilityModelManager.getTargets(sourcesOfReferenceOwner, ownerERD.getId());
		List<TraceTarget> targets = traceabilityModelManager.getTargets(sourcesOfReferenceTarget, targetERD.getId());
		
		if (owners.size() > 1 || targets.size() > 1) {
			throw new IllegalStateException("More than one owner or target belongs to the given match and ruleDescriptorId!");
		}
		
		// Remove reference from the target model
		if (owners.size() == 1 && targets.size() == 1) {
			ViewModelUtil.unset(
					((EObjectTarget) owners.get(0)).getTarget(),
					rule.getRuleDescriptor().getReference(),
					((EObjectTarget) targets.get(0)).getTarget());
		}
		
		/* Remove trace */
		List<Trace> traces = traceabilityModelManager.getTraces(
				getSourcesForMatch(match), rule.getRuleDescriptor().getId());
		
		if (traces.size() != 1) {
			throw new IllegalStateException("Not exactly one trace belongs to the given match and ruleDescriptorId!");
		}
		
		traceabilityModelManager.removeTrace(traces.get(0));
		/* ************ */
	}

}
