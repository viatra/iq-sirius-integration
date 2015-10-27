package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_sensorMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_sensorMatcher;
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
 * A pattern-specific query specification that can instantiate Element_sensorMatcher in a type-safe way.
 * 
 * @see Element_sensorMatcher
 * @see Element_sensorMatch
 * 
 */
@SuppressWarnings("all")
public final class Element_sensorQuerySpecification extends BaseGeneratedEMFQuerySpecification<Element_sensorMatcher> {
  private Element_sensorQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Element_sensorQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Element_sensorMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Element_sensorMatcher.on(engine);
  }
  
  @Override
  public Element_sensorMatch newEmptyMatch() {
    return Element_sensorMatch.newEmptyMatch();
  }
  
  @Override
  public Element_sensorMatch newMatch(final Object... parameters) {
    return Element_sensorMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static Element_sensorQuerySpecification INSTANCE = make();
    
    public static Element_sensorQuerySpecification make() {
      return new Element_sensorQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Element_sensorQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_sensor";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sensor");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("sensor", "hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_sensor = body.getOrCreateVariableByName("sensor");
      	PVariable var_gateway = body.getOrCreateVariableByName("gateway");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_ect = body.getOrCreateVariableByName("ect");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_fit = body.getOrCreateVariableByName("fit");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var_re = body.getOrCreateVariableByName("re");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	PVariable var_measurement = body.getOrCreateVariableByName("measurement");
      	PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      	PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      	PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      	PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_sensor, "sensor")
      	));
      	new TypeConstraint(body, new FlatTuple(var_sensor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor")));
      	new TypeConstraint(body, new FlatTuple(var_sensor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor")));
      	new TypeConstraint(body, new FlatTuple(var_sensor, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor", "connectedTo")));
      	new Equality(body, var__virtual_0_, var_gateway);
      	new TypeConstraint(body, new FlatTuple(var_gateway), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Gateway")));
      	new TypeConstraint(body, new FlatTuple(var_gateway, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Gateway", "triggers")));
      	new Equality(body, var__virtual_1_, var_ect);
      	new TypeConstraint(body, new FlatTuple(var_gateway), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Gateway")));
      	new TypeConstraint(body, new FlatTuple(var_gateway, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Gateway", "triggers")));
      	new Equality(body, var__virtual_2_, var_fit);
      	new TypeConstraint(body, new FlatTuple(var_ect), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "EventCompletedTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_ect, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Trigger", "triggeredEvents")));
      	new Equality(body, var__virtual_3_, var_re);
      	new TypeConstraint(body, new FlatTuple(var_re), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "ReportingEvent")));
      	new TypeConstraint(body, new FlatTuple(var_re, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "ReportingEvent", "address")));
      	new Equality(body, var__virtual_4_, var___0_);
      	new TypeConstraint(body, new FlatTuple(var_fit), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "FixedIntervalTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_fit, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Trigger", "triggeredEvents")));
      	new Equality(body, var__virtual_5_, var_measurement);
      	new TypeConstraint(body, new FlatTuple(var_ect), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "EventCompletedTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_ect, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "EventCompletedTrigger", "triggeredBy")));
      	new Equality(body, var__virtual_6_, var_measurement);
      	new TypeConstraint(body, new FlatTuple(var_measurement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Measurement")));
      	new TypeConstraint(body, new FlatTuple(var_measurement, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Measurement", "measurementType")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_7_, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "MeasurementType", "sensor")));
      	new Equality(body, var__virtual_8_, var_sensor);
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
