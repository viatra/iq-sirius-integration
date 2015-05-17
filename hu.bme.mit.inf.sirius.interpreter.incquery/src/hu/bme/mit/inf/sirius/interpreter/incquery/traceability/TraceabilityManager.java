package hu.bme.mit.inf.sirius.interpreter.incquery.traceability;

import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns.GetSourceMatch;
import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns.GetSourceMatcher;
import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns.GetTargetByIDMatch;
import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns.GetTargetByIDMatcher;
import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns.GetTraceByIDMatch;
import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns.GetTraceByIDMatcher;
import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns.util.GetSourceQuerySpecification;
import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns.util.GetTargetByIDQuerySpecification;
import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.patterns.util.GetTraceByIDQuerySpecification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.Traceability;
import org.eclipse.incquery.viewmodel.traceability.TraceabilityUtil;

import com.google.common.collect.Sets;

public class TraceabilityManager {

	private Traceability traceability;
	
	private IncQueryEngine engine;
	
	
	public TraceabilityManager() throws IncQueryException {
		/*
		 * Initialize traceability model
		 */
		EPackage traceabilityModelPackage = EPackage.Registry.INSTANCE
				.getEPackage("http://org.eclipse.incquery/viewmodel/traceability/1.0");

		EFactory traceabilityModelFactory = EPackage.Registry.INSTANCE
				.getEFactory("http://org.eclipse.incquery/viewmodel/traceability/1.0");

		EClass rootType = (EClass) traceabilityModelPackage.eContents().get(0);

		traceability = (Traceability) traceabilityModelFactory.create(rootType);
		
		
		/*
		 * Instantiate IncQueryEngine on the traceability model
		 */
		engine = IncQueryEngine.on(new EMFScope(traceability));
	}
	
	
    public void createTrace(String id, Collection<EObject> sourcesEObject,
    		Collection<Object> sourcesJavaObject, Collection<EObject> targets) {

        Trace trace = TraceabilityUtil.createTraceEObject();
        traceability.getTraces().add(trace);

        if (sourcesEObject != null) {
	        for (EObject source : sourcesEObject) {
	            trace.getParams().add(source);
	        }
        }
        
        if (sourcesJavaObject != null) {
	        for (Object source : sourcesJavaObject) {
	            trace.getObjects().add(source);
	        }
        }

        trace.setId(id);
        
        if (targets != null) {
        	trace.getTargets().addAll(targets);
        }

    }
    
    // get the source elements from which the given target EObject was created
    public List<EObject> getSources(String id, EObject target) throws IncQueryException {
    	List<EObject> result = new ArrayList<EObject>();
    	
    	
    	GetSourceMatch getSourceMatch = GetSourceQuerySpecification.instance().newEmptyMatch();
    	if (id != null) {
    		getSourceMatch.setId(id);
    	}
    	getSourceMatch.setTarget(target);
    	
    	GetSourceMatcher getSourceMatcher = engine.getMatcher(GetSourceQuerySpecification.instance());
    	
    	for (GetSourceMatch match : getSourceMatcher.getAllMatches(getSourceMatch)) {
    		result.add(match.getSource());
    	}
    	
    	return result;
    }
    
    // Get the target element, which was created from the given source elements
    public EObject getTarget(String id, Set<EObject> sourcesEObject,
    		Set<Object> sourcesJavaObject) throws IncQueryException {
    	Set<EObject> traceSourcesEObject = null;
    	Set<Object> traceSourcesJavaObject = null;
    	
    	for (Trace trace : getTracesByID(id)) {
    		traceSourcesEObject = new HashSet<EObject>(trace.getParams());
    		traceSourcesJavaObject = new HashSet<Object>(trace.getObjects());
    		
    		if (sourcesEObject.equals(traceSourcesEObject) && sourcesJavaObject.equals(traceSourcesJavaObject)) {
    			return trace.getTargets().get(0);
    		}
    	}
    	
    	return null;
    }

    // Get targets by sirius' mapping id
    public List<EObject> getTargetsByID(String id) throws IncQueryException {
    	if (id == null) {
    		return null;
    	}
    	
    	List<EObject> result = new ArrayList<EObject>();
    	
    	GetTargetByIDMatch getTargetByIDMatch = GetTargetByIDQuerySpecification.instance().newEmptyMatch();
    	getTargetByIDMatch.setId(id);
    	
    	GetTargetByIDMatcher matcher = engine.getMatcher(GetTargetByIDQuerySpecification.instance());
    	
    	for (GetTargetByIDMatch match : matcher.getAllMatches(getTargetByIDMatch)) {
    		result.add(match.getTarget());
    	}
    	
    	return result;
    }
    
    // Get target by sirius' mapping id and match parameter
    public EObject getTarget(String id, EObject match) throws IncQueryException {
    	if (id == null || match == null) {
    		return null;
    	}
    	
    	Set<EObject> sourcesEObject = Sets.newHashSet(getSources(null, match));
    	Set<Object> sourcesJavaObject = Sets.newHashSet();
    	
    	return getTarget(id, sourcesEObject, sourcesJavaObject);
    }    

    // Delete traces by sirius mapping ID
    public void deleteTracesByID(String id) throws IncQueryException {
    	for (Trace trace : getTracesByID(id)) {
    		EcoreUtil.remove(trace);
    	}
    }
    
    // Delete trace by id and source objects
    public void deleteTraces(String id, Set<EObject> sourcesEObject,
    		Set<Object> sourcesJavaObject) throws IncQueryException {
    	Set<EObject> traceSourcesEObject = null;
    	Set<Object> traceSourcesJavaObject = null;
    	
    	for (Trace trace : getTracesByID(id)) {
    		traceSourcesEObject = new HashSet<EObject>(trace.getParams());
    		traceSourcesJavaObject = new HashSet<Object>(trace.getObjects());
    		
    		if (sourcesEObject.equals(traceSourcesEObject) && sourcesJavaObject.equals(traceSourcesJavaObject)) {
    			EcoreUtil.remove(trace);
    		}
    	}
    }
    
    // Get traces by sirius' mapping id
    private List<Trace> getTracesByID(String id) throws IncQueryException {
    	List<Trace> result = new ArrayList<Trace>();
    	
    	GetTraceByIDMatch getTraceByIDMatch = GetTraceByIDQuerySpecification.instance().newEmptyMatch();
    	getTraceByIDMatch.setId(id);
    	
    	GetTraceByIDMatcher matcher = engine.getMatcher(GetTraceByIDQuerySpecification.instance());
    	
    	for (GetTraceByIDMatch match : matcher.getAllMatches(getTraceByIDMatch)) {
    		result.add(match.getTrace());
    	}
    	
    	return result;
    }
}
