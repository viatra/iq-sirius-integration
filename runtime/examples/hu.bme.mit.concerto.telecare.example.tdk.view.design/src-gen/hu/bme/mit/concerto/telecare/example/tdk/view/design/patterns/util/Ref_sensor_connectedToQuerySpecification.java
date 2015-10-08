package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_sensor_connectedToMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_sensor_connectedToMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_sensorQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_serverQuerySpecification;
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
 * A pattern-specific query specification that can instantiate Ref_sensor_connectedToMatcher in a type-safe way.
 * 
 * @see Ref_sensor_connectedToMatcher
 * @see Ref_sensor_connectedToMatch
 * 
 */
@SuppressWarnings("all")
public final class Ref_sensor_connectedToQuerySpecification extends BaseGeneratedEMFQuerySpecification<Ref_sensor_connectedToMatcher> {
  private Ref_sensor_connectedToQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Ref_sensor_connectedToQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Ref_sensor_connectedToMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Ref_sensor_connectedToMatcher.on(engine);
  }
  
  @Override
  public Ref_sensor_connectedToMatch newEmptyMatch() {
    return Ref_sensor_connectedToMatch.newEmptyMatch();
  }
  
  @Override
  public Ref_sensor_connectedToMatch newMatch(final Object... parameters) {
    return Ref_sensor_connectedToMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) parameters[0], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static Ref_sensor_connectedToQuerySpecification INSTANCE = make();
    
    public static Ref_sensor_connectedToQuerySpecification make() {
      return new Ref_sensor_connectedToQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Ref_sensor_connectedToQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_sensor_connectedTo";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sensor","host");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("sensor", ""),new PParameter("host", ""));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_sensor = body.getOrCreateVariableByName("sensor");
      	PVariable var_host = body.getOrCreateVariableByName("host");
      	PVariable var_measurement = body.getOrCreateVariableByName("measurement");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_ect = body.getOrCreateVariableByName("ect");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var_re = body.getOrCreateVariableByName("re");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_sensor, "sensor"),
      				
      		new ExportedParameter(body, var_host, "host")
      	));
      	new TypeConstraint(body, new FlatTuple(var_sensor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor")));
      	new TypeConstraint(body, new FlatTuple(var_host), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Host")));
      	new PositivePatternCall(body, new FlatTuple(var_sensor), Element_sensorQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_host), Element_serverQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeConstraint(body, new FlatTuple(var_sensor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor")));
      	new TypeConstraint(body, new FlatTuple(var_sensor, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor", "measurementTypes")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "MeasurementType", "measurement")));
      	new Equality(body, var__virtual_1_, var_measurement);
      	new TypeConstraint(body, new FlatTuple(var_ect), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "EventCompletedTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_ect, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "EventCompletedTrigger", "triggeredBy")));
      	new Equality(body, var__virtual_2_, var_measurement);
      	new TypeConstraint(body, new FlatTuple(var_re), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "ReportingEvent")));
      	new TypeConstraint(body, new FlatTuple(var_re, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Event", "trigger")));
      	new Equality(body, var__virtual_3_, var_ect);
      	new TypeConstraint(body, new FlatTuple(var_re), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "ReportingEvent")));
      	new TypeConstraint(body, new FlatTuple(var_re, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "ReportingEvent", "address")));
      	new Equality(body, var__virtual_4_, var_host);
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
