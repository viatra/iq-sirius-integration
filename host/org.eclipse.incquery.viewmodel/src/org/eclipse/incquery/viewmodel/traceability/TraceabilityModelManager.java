package org.eclipse.incquery.viewmodel.traceability;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.GenericPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.configuration.Configuration;
import org.eclipse.incquery.viewmodel.configuration.RuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.util.ConfigurationModelUtil;
import org.eclipse.incquery.viewmodel.traceability.util.TraceQuerySpecification;

import com.google.common.collect.Lists;

/**
 * This class manages the traceability model.
 * 
 * @author lengyela
 *
 */
public class TraceabilityModelManager {
	
	private IncQueryEngine engine;

	private Traceability traceability;
	
	
	public TraceabilityModelManager() throws IncQueryException {
		this.traceability = createTraceabilityEObject();
		
		this.engine = IncQueryEngine.on(new EMFScope(traceability));
	}
	
	
	public Trace createTrace(long ruleDescriptorId, Set<EObject> sources, Set<EObject> targets) {
		Trace result = createTraceEObject();
		
		result.setRuleDescriptorId(ruleDescriptorId);
		result.getSources().addAll(sources);
		result.getTargets().addAll(targets);
		
		traceability.getTraces().add(result);
		
		return result;
	}
	
	public Traceability createTraceabilityEObject() {
		return TraceabilityFactory.eINSTANCE.createTraceability();
	}
	
	public Trace createTraceEObject() {
		return TraceabilityFactory.eINSTANCE.createTrace();
	}
	
	public List<Trace> getTraces(Set<EObject> sources, Long ruleDescriptorId) {
		List<Trace> result = Lists.newArrayList();

		try {
			TraceQuerySpecification querySpecification = new TraceQuerySpecification(sources.size());

			int i = 0;
			GenericPatternMatch emptyMatch = querySpecification.newEmptyMatch();
			for (EObject eObject : sources) {
				emptyMatch.set(TraceQuerySpecification.TracePQuery.getSourceParameterName(i), eObject);
				i++;
			}
			
			if (ruleDescriptorId != null) {
				emptyMatch.set(TraceQuerySpecification.TracePQuery.PARAMETER_RULE_DESCRIPTOR_ID, ruleDescriptorId);
			}

			
			Collection<GenericPatternMatch> matches = querySpecification.getMatcher(engine).getAllMatches(emptyMatch);
			for (GenericPatternMatch match : matches) {
				result.add((Trace) match.get(TraceQuerySpecification.TracePQuery.PARAMETER_TRACE));
			}
		} catch (IncQueryException e) {
			// TODO hibakezelés...
		}
		
		return result;
	}
	
	public List<EObject> getTargets(Set<EObject> sources, Long ruleDescriptorId) {
		List<EObject> result = Lists.newArrayList();
		
		List<Trace> traces = getTraces(sources, ruleDescriptorId);
		for (Trace trace : traces) {
			result.addAll(trace.getTargets());
		}
		
		return result;
	}
	
	public List<EObject> getHiddenParameters(Configuration configurationModel, Trace trace) {
		List<EObject> result = new ArrayList<EObject>();
		
		RuleDescriptor ruleDescriptor = ConfigurationModelUtil.getRuleDescriptorById(
				configurationModel, trace.getRuleDescriptorId());
		
		// TODO
		
		return result;
	}
}
