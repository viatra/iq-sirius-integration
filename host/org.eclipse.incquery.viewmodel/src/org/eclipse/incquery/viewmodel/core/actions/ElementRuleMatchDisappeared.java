package org.eclipse.incquery.viewmodel.core.actions;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.viewmodel.core.rules.ElementRule;
import org.eclipse.incquery.viewmodel.core.util.ViewModelUtil;
import org.eclipse.incquery.viewmodel.traceability.Trace;


public class ElementRuleMatchDisappeared extends RuleMatchProcessor<ElementRule> {

	public ElementRuleMatchDisappeared(ElementRule rule) {
		super(rule);
	}

	@Override
	public void doProcess(IPatternMatch match) {
		/* Get source EObjects from the match */
		Set<EObject> sources = getSourceEObjectsForElementRuleMatch(match);	
		
		/* Get target EObjects */
		List<Trace> traces = traceabilityModelManager.getTraces(sources, rule.getRuleDescriptor().getId());
		if ( traces.size() == 1) {
			Collection<EObject> targets = traces.get(0).getTargets();
			
			/* Delete targets */
			for (EObject target : targets) {
				ViewModelUtil.remove(target);
			}
			
			/* Delete trace */
			EcoreUtil.remove(traces.get(0));
		}
	}

}
