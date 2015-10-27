package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_serverMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_serverMatcher;
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
 * A pattern-specific query specification that can instantiate Element_serverMatcher in a type-safe way.
 * 
 * @see Element_serverMatcher
 * @see Element_serverMatch
 * 
 */
@SuppressWarnings("all")
public final class Element_serverQuerySpecification extends BaseGeneratedEMFQuerySpecification<Element_serverMatcher> {
  private Element_serverQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Element_serverQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Element_serverMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Element_serverMatcher.on(engine);
  }
  
  @Override
  public Element_serverMatch newEmptyMatch() {
    return Element_serverMatch.newEmptyMatch();
  }
  
  @Override
  public Element_serverMatch newMatch(final Object... parameters) {
    return Element_serverMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static Element_serverQuerySpecification INSTANCE = make();
    
    public static Element_serverQuerySpecification make() {
      return new Element_serverQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Element_serverQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_server";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("host");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("host", "hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_host = body.getOrCreateVariableByName("host");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	PVariable var_gateway = body.getOrCreateVariableByName("gateway");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_ect = body.getOrCreateVariableByName("ect");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_re = body.getOrCreateVariableByName("re");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_host, "host")
      	));
      	new TypeConstraint(body, new FlatTuple(var_host), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Host")));
      	new TypeConstraint(body, new FlatTuple(var___0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "TelecareSystem")));
      	new TypeConstraint(body, new FlatTuple(var___0_, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "TelecareSystem", "gateways")));
      	new Equality(body, var__virtual_0_, var_gateway);
      	new TypeConstraint(body, new FlatTuple(var_gateway), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Gateway")));
      	new TypeConstraint(body, new FlatTuple(var_gateway, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Gateway", "triggers")));
      	new Equality(body, var__virtual_1_, var_ect);
      	new TypeConstraint(body, new FlatTuple(var_ect), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "EventCompletedTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_ect), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "EventCompletedTrigger")));
      	new TypeConstraint(body, new FlatTuple(var_ect, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "Trigger", "triggeredEvents")));
      	new Equality(body, var__virtual_2_, var_re);
      	new TypeConstraint(body, new FlatTuple(var_re), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "ReportingEvent")));
      	new TypeConstraint(body, new FlatTuple(var_re, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "ReportingEvent", "address")));
      	new Equality(body, var__virtual_3_, var_host);
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
