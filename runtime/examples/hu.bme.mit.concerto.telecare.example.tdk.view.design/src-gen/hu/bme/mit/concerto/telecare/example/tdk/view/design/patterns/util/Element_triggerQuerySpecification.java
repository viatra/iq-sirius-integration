package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_triggerMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_triggerMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate Element_triggerMatcher in a type-safe way.
 * 
 * @see Element_triggerMatcher
 * @see Element_triggerMatch
 * 
 */
@SuppressWarnings("all")
public final class Element_triggerQuerySpecification extends BaseGeneratedEMFQuerySpecification<Element_triggerMatcher> {
  private Element_triggerQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Element_triggerQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Element_triggerMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Element_triggerMatcher.on(engine);
  }
  
  @Override
  public Element_triggerMatch newEmptyMatch() {
    return Element_triggerMatch.newEmptyMatch();
  }
  
  @Override
  public Element_triggerMatch newMatch(final Object... parameters) {
    return Element_triggerMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static Element_triggerQuerySpecification INSTANCE = make();
    
    public static Element_triggerQuerySpecification make() {
      return new Element_triggerQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Element_triggerQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_trigger";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("trigger");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("trigger", ""));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_trigger = body.getOrCreateVariableByName("trigger");
      	PVariable var_measurementEvent = body.getOrCreateVariableByName("measurementEvent");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_ecTrigger = body.getOrCreateVariableByName("ecTrigger");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_reportingEvent = body.getOrCreateVariableByName("reportingEvent");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_trigger, "trigger")
      	));
      	new TypeConstraint(body, new FlatTuple(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "FixedIntervalTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "FixedIntervalTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_trigger, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Trigger", "triggeredEvents")));
      	new Equality(body, var__virtual_0_, var_measurementEvent);
      	new TypeConstraint(body, new FlatTuple(var_measurementEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Measurement")));
      	new TypeConstraint(body, new FlatTuple(var_ecTrigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "EventCompletedTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_ecTrigger, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "EventCompletedTrigger", "triggeredBy")));
      	new Equality(body, var__virtual_1_, var_measurementEvent);
      	new TypeConstraint(body, new FlatTuple(var_ecTrigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "EventCompletedTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_ecTrigger, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Trigger", "triggeredEvents")));
      	new Equality(body, var__virtual_2_, var_reportingEvent);
      	new TypeConstraint(body, new FlatTuple(var_reportingEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "ReportingEvent")));
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
