package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Attr_sensor_nameMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Attr_sensor_nameMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_sensorQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate Attr_sensor_nameMatcher in a type-safe way.
 * 
 * @see Attr_sensor_nameMatcher
 * @see Attr_sensor_nameMatch
 * 
 */
@SuppressWarnings("all")
public final class Attr_sensor_nameQuerySpecification extends BaseGeneratedEMFQuerySpecification<Attr_sensor_nameMatcher> {
  private Attr_sensor_nameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Attr_sensor_nameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Attr_sensor_nameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Attr_sensor_nameMatcher.on(engine);
  }
  
  @Override
  public Attr_sensor_nameMatch newEmptyMatch() {
    return Attr_sensor_nameMatch.newEmptyMatch();
  }
  
  @Override
  public Attr_sensor_nameMatch newMatch(final Object... parameters) {
    return Attr_sensor_nameMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static Attr_sensor_nameQuerySpecification INSTANCE = make();
    
    public static Attr_sensor_nameQuerySpecification make() {
      return new Attr_sensor_nameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Attr_sensor_nameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_sensor_name";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sensor","value");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("sensor", ""),new PParameter("value", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_sensor = body.getOrCreateVariableByName("sensor");
      	PVariable var_value = body.getOrCreateVariableByName("value");
      	PVariable var_name = body.getOrCreateVariableByName("name");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_sensor, "sensor"),
      				
      		new ExportedParameter(body, var_value, "value")
      	));
      	new TypeConstraint(body, new FlatTuple(var_sensor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor")));
      	new PositivePatternCall(body, new FlatTuple(var_sensor), Element_sensorQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeConstraint(body, new FlatTuple(var_sensor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Sensor")));
      	new TypeConstraint(body, new FlatTuple(var_sensor, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "NamedElement", "name")));
      	new Equality(body, var__virtual_0_, var_name);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern attr_sensor_name";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("name");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.String name = (java.lang.String) provider.getValue("name");
      			return evaluateExpression_1_1(name);
      		}
      
      },  var__virtual_1_ ); 
      	new Equality(body, var_value, var__virtual_1_);
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
  
  private static String evaluateExpression_1_1(final String name) {
    return ("Sensor::" + name);
  }
}
