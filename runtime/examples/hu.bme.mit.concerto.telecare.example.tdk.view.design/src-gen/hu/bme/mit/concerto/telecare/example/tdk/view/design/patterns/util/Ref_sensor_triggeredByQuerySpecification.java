package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_sensor_triggeredByMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_sensor_triggeredByMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_sensorQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_triggerQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate Ref_sensor_triggeredByMatcher in a type-safe way.
 * 
 * @see Ref_sensor_triggeredByMatcher
 * @see Ref_sensor_triggeredByMatch
 * 
 */
@SuppressWarnings("all")
public final class Ref_sensor_triggeredByQuerySpecification extends BaseGeneratedEMFQuerySpecification<Ref_sensor_triggeredByMatcher> {
  private Ref_sensor_triggeredByQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Ref_sensor_triggeredByQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Ref_sensor_triggeredByMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Ref_sensor_triggeredByMatcher.on(engine);
  }
  
  @Override
  public Ref_sensor_triggeredByMatch newEmptyMatch() {
    return Ref_sensor_triggeredByMatch.newEmptyMatch();
  }
  
  @Override
  public Ref_sensor_triggeredByMatch newMatch(final Object... parameters) {
    return Ref_sensor_triggeredByMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) parameters[0], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static Ref_sensor_triggeredByQuerySpecification INSTANCE = make();
    
    public static Ref_sensor_triggeredByQuerySpecification make() {
      return new Ref_sensor_triggeredByQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Ref_sensor_triggeredByQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_sensor_triggeredBy";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sensor","trigger");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("sensor", "hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor"),new PParameter("trigger", "hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_sensor = body.getOrCreateVariableByName("sensor");
      	PVariable var_trigger = body.getOrCreateVariableByName("trigger");
      	PVariable var_measurementEvent = body.getOrCreateVariableByName("measurementEvent");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_sensor, "sensor"),
      				
      		new ExportedParameter(body, var_trigger, "trigger")
      	));
      	new TypeConstraint(body, new FlatTuple(var_sensor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor")));
      	new TypeConstraint(body, new FlatTuple(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "FixedIntervalTrigger")));
      	new PositivePatternCall(body, new FlatTuple(var_sensor), Element_sensorQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_trigger), Element_triggerQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeConstraint(body, new FlatTuple(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "FixedIntervalTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_trigger, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Trigger", "triggeredEvents")));
      	new Equality(body, var__virtual_0_, var_measurementEvent);
      	new TypeConstraint(body, new FlatTuple(var_measurementEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Measurement")));
      	new TypeConstraint(body, new FlatTuple(var_measurementEvent, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Measurement", "measurementType")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "MeasurementType", "sensor")));
      	new Equality(body, var__virtual_2_, var_sensor);
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
