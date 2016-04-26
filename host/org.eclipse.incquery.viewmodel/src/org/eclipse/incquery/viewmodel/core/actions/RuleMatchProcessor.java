package org.eclipse.incquery.viewmodel.core.actions;

import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.incquery.viewmodel.configuration.PatternParameterMapping;
import org.eclipse.incquery.viewmodel.configuration.ReferenceRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.RuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.StructuralFeatureRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.ViewModelRule;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.TraceabilityModelManager;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;

import com.google.common.collect.Maps;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;

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
	
	public abstract Trace doProcess(IPatternMatch match);

	/**
	 * Returns the name - parameter pairs, which belong to the given rule.
	 * @param match The current IPatternMatch instance
	 * @return The name - parameter pairs, which belong to the given rule
	 */	
	protected Map<String, Object> getSourcesForMatch(IPatternMatch match) {
		Map<String, Object> result = Maps.newHashMap();

		for (String parameterName : match.parameterNames()) {
			result.put(parameterName, match.get(parameterName));
		}
		
		return result;
	}
	
	/**
	 * Returns the name - parameter pairs of the StrucutralFeature's owner.
	 * @param match The current IPatternMatch instance
	 * @param descriptor The StructuralFeatureRuleDescriptor which belongs to the given match
	 * @return The name - parameter pairs of the StrucutralFeature's owner
	 */
	protected Map<String, Object> getSourcesOfOwnerElement(IPatternMatch match,
			StructuralFeatureRuleDescriptor descriptor) {
		Map<String, Object> result = Maps.newHashMap();
		
		for (PatternParameterMapping parameterMapping : descriptor.getSourceElementParameterMappings()) {
			result.put(
					parameterMapping.getERulePatternParameterName(),
					match.get(parameterMapping.getSfRulePatternParameterName()));
		}
		
		return result;
	}
	
	/**
	 * Returns the name - parameter pairs of the ReferenceRules's target.
	 * @param match The current IPatternMatch instance
	 * @param descriptor The ReferenceRuleDescriptor which belongs to the given match
	 * @return The name - parameter pairs of the ReferenceRules's target
	 */
	protected Map<String, Object> getSourcesOfTargetElement(IPatternMatch match,
			ReferenceRuleDescriptor descriptor) {
		Map<String, Object> result = Maps.newHashMap();
		
		for (PatternParameterMapping parameterMapping : descriptor.getTargetElementParameterMappings()) {
			result.put(
					parameterMapping.getERulePatternParameterName(),
					match.get(parameterMapping.getSfRulePatternParameterName()));
		}
		
		return result;
	}
	
	/**
	 * Returns an {@link IPatternMatch} instance for the given patternFQN and sets
	 *  the parameters for the given values.
	 * @param patternFQN Identifies the pattern for which the {@link IPatternMatch} instance will be created
	 * @param parameters Specifies the parameter values of the created {@link IPatternMatch} instance
	 * @return An {@link IPatternMatch} instance for the pattern identified by the fully-qualified name and
	 * 	sets the parameters of it for the given values.
	 */
	protected IPatternMatch getPatternMatch(String patternFQN, Map<String, Object> parameters) {
		IPatternMatch result = null;
		
		IQuerySpecification<?> querySpecification = rule.getViewModelManager().getQuerySpecification(patternFQN);
		
		result = querySpecification.newEmptyMatch();
		for (Entry<String, Object> entry : parameters.entrySet()) {
			result.set(entry.getKey(), entry.getValue());
		}
		
		return result;
	}
}
