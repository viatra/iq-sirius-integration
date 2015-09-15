package org.eclipse.incquery.viewmodel.traceability;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
	
	private void addSources(Trace trace, Map<String, Object> sources) {
		if (trace == null || sources == null) {
			throw new IllegalArgumentException("The trace and sources parameters can not be null!");
		}
		
		for (Entry<String, Object> entry : sources.entrySet()) {
			if (entry.getValue() instanceof EObject) {
				// If the parameter is an EObject
				
				trace.getSources().add(
						createEObjectSource(false, entry.getKey(), (EObject) entry.getValue()));
			} else {
				// If the parameter is an Object
				
				trace.getSources().add(
						createJavaObjectSource(false, entry.getKey(), entry.getValue()));
			}
		}
	}
	
	public EObjectSource createEObjectSource(boolean hidden, String patternParameterName, EObject source) {
		EObjectSource result = createEObjectSourceEObject();
		result.setHidden(hidden);
		result.setPatternParameterName(patternParameterName);
		result.setSource(source);
		
		return result;
	}
	
	public JavaObjectSource createJavaObjectSource(boolean hidden, String patternParameterName, Object source) {
		JavaObjectSource result = createJavaObjectSourceEObject();
		result.setHidden(hidden);
		result.setPatternParameterName(patternParameterName);
		result.setSource(source);
		
		return result;
	}
	
	public Trace createTrace(long ruleDescriptorId, Map<String, Object> sources, EObject targetEObject) {
		Trace result = createTraceEObject();

		result.setRuleDescriptorId(ruleDescriptorId);
		
		addSources(result, sources);
		
		EObjectTarget eObjectTarget = createEObjectTargetEObject();
		eObjectTarget.setTarget(targetEObject);
			
		result.setTarget(eObjectTarget);

		traceability.getTraces().add(result);

		return result;
	}	
	
	public Trace createTrace(long ruleDescriptorId, Map<String, Object> sources, EObjectTarget owner, EObjectTarget target, String referenceName) {
		Trace result = createTraceEObject();
		
		result.setRuleDescriptorId(ruleDescriptorId);
		
		addSources(result, sources);
		
		ReferenceTarget referenceTarget = createReferenceTargetEObject();
		referenceTarget.setOwner(owner);
		referenceTarget.setTarget(target);
		referenceTarget.setReferenceName(referenceName);
		
		result.setTarget(referenceTarget);
		
		traceability.getTraces().add(result);
		
		return result;
	}
	
	public Trace createTrace(long ruleDescriptorId, Map<String, Object> sources, EObjectTarget owner, Object target, String attributeName) {
		Trace result = createTraceEObject();
		
		result.setRuleDescriptorId(ruleDescriptorId);
		
		addSources(result, sources);
		
		AttributeTarget attributeTarget = createAttributeTargetEObject();
		attributeTarget.setOwner(owner);
		attributeTarget.setTarget(target);
		attributeTarget.setAttributeName(attributeName);
		
		result.setTarget(attributeTarget);
		
		traceability.getTraces().add(result);
		
		return result;
	}
	
	public Traceability createTraceabilityEObject() {
		return TraceabilityFactory.eINSTANCE.createTraceability();
	}
	
	public Trace createTraceEObject() {
		return TraceabilityFactory.eINSTANCE.createTrace();
	}
	
	public EObjectSource createEObjectSourceEObject() {
		return TraceabilityFactory.eINSTANCE.createEObjectSource();
	}
	
	public JavaObjectSource createJavaObjectSourceEObject() {
		return TraceabilityFactory.eINSTANCE.createJavaObjectSource();
	}
	
	public ReferenceSource createReferenceSourceEObject() {
		return TraceabilityFactory.eINSTANCE.createReferenceSource();
	}
	
	public AttributeSource createAttributeSourceEObject() {
		return TraceabilityFactory.eINSTANCE.createAttributeSource();
	}
	
	public EObjectTarget createEObjectTargetEObject() {
		return TraceabilityFactory.eINSTANCE.createEObjectTarget();
	}
	
	public ReferenceTarget createReferenceTargetEObject() {
		return TraceabilityFactory.eINSTANCE.createReferenceTarget();
	}
	
	public AttributeTarget createAttributeTargetEObject() {
		return TraceabilityFactory.eINSTANCE.createAttributeTarget();
	}
	
	/**
	 * Get Trace instances from the traceability model by ruleDescriptorId and sources.
	 * @param sources The source Objects / EObjects, that belong to the trace
	 * @param ruleDescriptorId The id of the RuleDescriptor instance, that created the Trace
	 * @return Trace instances, which have the given id and sources
	 */
	// TODO TESZT
	public List<Trace> getTraces(Map<String, Object> sources, Long ruleDescriptorId) {
		List<Trace> result = Lists.newArrayList();

		try {
			TraceQuerySpecification querySpecification = new TraceQuerySpecification(sources.size());
			
			int i = 0;
			GenericPatternMatch emptyMatch = querySpecification.newEmptyMatch();
			for (Entry<String, Object> source : sources.entrySet()) {
				emptyMatch.set(TraceQuerySpecification.TracePQuery.getSourceParameterName(i), source.getValue());
				emptyMatch.set(TraceQuerySpecification.TracePQuery.getPatternParameterNameParameterName(i), source.getKey());
				
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
	
	/**
	 * Get TraceTarget instances of the matching traces.
	 * @param sources Source objects of the trace
	 * @param ruleDescriptorId Id of the RuleDescriptor instance, that created the trace
	 * @return TraceTarget instances of the matching traces
	 */
	// TODO TESZT
	public List<TraceTarget> getTargets(Map<String, Object> sources, Long ruleDescriptorId) {
		List<TraceTarget> result = Lists.newArrayList();
		
		List<Trace> traces = getTraces(sources, ruleDescriptorId);
		for (Trace trace : traces) {
			result.add(trace.getTarget());
		}
		
		return result;
	}
	
	// TODO
	public List<EObject> getHiddenParameters(Configuration configurationModel, Trace trace) {
		List<EObject> result = new ArrayList<EObject>();
		
		RuleDescriptor ruleDescriptor = ConfigurationModelUtil.getRuleDescriptorById(
				configurationModel, trace.getRuleDescriptorId());
		
		// TODO
		
		return result;
	}
	
	/**
	 * Removes the given Trace instance from the traceability model.
	 * @param trace The Trace instance to remove
	 */
	public void removeTrace(Trace trace) {
		EcoreUtil.remove(trace);
	}
}
