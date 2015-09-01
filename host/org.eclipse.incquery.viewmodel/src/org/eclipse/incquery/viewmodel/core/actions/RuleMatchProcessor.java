package org.eclipse.incquery.viewmodel.core.actions;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;

import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.viewmodel.configuration.PatternParameterMapping;
import org.eclipse.incquery.viewmodel.configuration.ReferenceRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.RuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.StructuralFeatureRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.ViewModelRule;
import org.eclipse.incquery.viewmodel.traceability.TraceabilityModelManager;

import com.google.common.collect.Sets;

public abstract class RuleMatchProcessor<T extends ViewModelRule<? extends RuleDescriptor>> implements
		IMatchProcessor<IPatternMatch> {

	private static final Logger logger = LoggingUtils.getLogger(RuleMatchProcessor.class);
	
	protected T rule;

	protected TraceabilityModelManager traceabilityModelManager;
	
	private TransactionalEditingDomain transactionalEditingDomain;

	
	public RuleMatchProcessor(T rule) {
		this.rule = rule;
		
		this.traceabilityModelManager = this.rule.getViewModelManager()
				.getTraceabilityModelManager();
		
		this.transactionalEditingDomain = this.rule.getViewModelManager()
				.getTargetTransactionalEditingDomain();
	}

	@Override
	public void process(final IPatternMatch match) {
		// TODO
		logger.info("Action: " + this.getClass().getSimpleName() + " Process match: " + match.prettyPrint());
		
		if (transactionalEditingDomain != null) {
			transactionalEditingDomain.getCommandStack().execute(
					new RecordingCommand(transactionalEditingDomain) {
	
				@Override
				protected void doExecute() {
					doProcess(match);
				}
				
			});
		} else {
			doProcess(match);
		}
	}
	
	public abstract void doProcess(IPatternMatch match);
	
	protected Set<EObject> getSourceEObjectsForElementRuleMatch(IPatternMatch match) {
		Set<EObject> result = Sets.newHashSet();
		for (String parameterName : match.parameterNames()) {
			if (match.get(parameterName) instanceof EObject) {
				result.add((EObject) match.get(parameterName));
			}
		}

		return result;
	}
	
	protected Set<EObject> getSourceEObjectsForStructuralFeatureRuleMatch(IPatternMatch match,
			StructuralFeatureRuleDescriptor descriptor) {
		Set<EObject> result = Sets.newHashSet();
		
		String sfRulePatternParameterName = null;
		for (PatternParameterMapping parameterMapping : descriptor.getSourceElementParameterMappings()) {
			sfRulePatternParameterName = parameterMapping.getSfRulePatternParameterName();
			
			if (match.get(sfRulePatternParameterName) instanceof EObject) {
				result.add((EObject) match.get(sfRulePatternParameterName));
			}
		}
		
		return result;
	}
	
	protected Set<EObject> getTargetEObjectsForReferenceRuleMatch(IPatternMatch match,
			ReferenceRuleDescriptor descriptor) {
		Set<EObject> result = Sets.newHashSet();
		
		String sfRulePatternParameterName = null;
		for (PatternParameterMapping parameterMapping : descriptor.getTargetElementParameterMappings()) {
			sfRulePatternParameterName = parameterMapping.getSfRulePatternParameterName();
			
			if (match.get(sfRulePatternParameterName) instanceof EObject) {
				result.add((EObject) match.get(sfRulePatternParameterName));
			}
		}
		
		return result;
	}
}
