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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
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
      return Arrays.asList(new PParameter("sensor", ""));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_sensor = body.getOrCreateVariableByName("sensor");
      	PVariable var_mt1 = body.getOrCreateVariableByName("mt1");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_mt2 = body.getOrCreateVariableByName("mt2");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_sensor, "sensor")
      	));
      	new TypeConstraint(body, new FlatTuple(var_sensor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor")));
      	new TypeConstraint(body, new FlatTuple(var_sensor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor")));
      	new TypeConstraint(body, new FlatTuple(var_sensor, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor", "measurementTypes")));
      	new Equality(body, var__virtual_0_, var_mt1);
      	new TypeConstraint(body, new FlatTuple(var_sensor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor")));
      	new TypeConstraint(body, new FlatTuple(var_sensor, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor", "measurementTypes")));
      	new Equality(body, var__virtual_1_, var_mt2);
      	new Inequality(body, var_mt1, var_mt2);
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
