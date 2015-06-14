package org.eclipse.incquery.viewmodel.traceability.patterns.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.viewmodel.traceability.patterns.Param2targetMatch;
import org.eclipse.incquery.viewmodel.traceability.patterns.Param2targetMatcher;

/**
 * A pattern-specific query specification that can instantiate Param2targetMatcher in a type-safe way.
 * 
 * @see Param2targetMatcher
 * @see Param2targetMatch
 * 
 */
@SuppressWarnings("all")
public final class Param2targetQuerySpecification extends BaseGeneratedEMFQuerySpecification<Param2targetMatcher> {
  private Param2targetQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Param2targetQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Param2targetMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Param2targetMatcher.on(engine);
  }
  
  @Override
  public Param2targetMatch newEmptyMatch() {
    return Param2targetMatch.newEmptyMatch();
  }
  
  @Override
  public Param2targetMatch newMatch(final Object... parameters) {
    return Param2targetMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static Param2targetQuerySpecification INSTANCE = make();
    
    public static Param2targetQuerySpecification make() {
      return new Param2targetQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Param2targetQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.traceability.patterns.param2target";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("param","target");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("param", "org.eclipse.emf.ecore.EObject"),new PParameter("target", "org.eclipse.emf.ecore.EObject"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_param = body.getOrCreateVariableByName("param");
      	PVariable var_target = body.getOrCreateVariableByName("target");
      	PVariable var_trace = body.getOrCreateVariableByName("trace");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_param, "param"),
      				
      		new ExportedParameter(body, var_target, "target")
      	));
      	new TypeBinary(body, CONTEXT, var_trace, var_param, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace", "params"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace.params");
      	new TypeBinary(body, CONTEXT, var_trace, var_target, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace", "targets"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace.targets");
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
