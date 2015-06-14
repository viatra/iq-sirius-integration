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
import org.eclipse.incquery.viewmodel.traceability.patterns.Trace2paramMatch;
import org.eclipse.incquery.viewmodel.traceability.patterns.Trace2paramMatcher;

/**
 * A pattern-specific query specification that can instantiate Trace2paramMatcher in a type-safe way.
 * 
 * @see Trace2paramMatcher
 * @see Trace2paramMatch
 * 
 */
@SuppressWarnings("all")
public final class Trace2paramQuerySpecification extends BaseGeneratedEMFQuerySpecification<Trace2paramMatcher> {
  private Trace2paramQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Trace2paramQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Trace2paramMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Trace2paramMatcher.on(engine);
  }
  
  @Override
  public Trace2paramMatch newEmptyMatch() {
    return Trace2paramMatch.newEmptyMatch();
  }
  
  @Override
  public Trace2paramMatch newMatch(final Object... parameters) {
    return Trace2paramMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (org.eclipse.incquery.viewmodel.traceability.Trace) parameters[1], (java.lang.String) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static Trace2paramQuerySpecification INSTANCE = make();
    
    public static Trace2paramQuerySpecification make() {
      return new Trace2paramQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Trace2paramQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.traceability.patterns.trace2param";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("param","trace","id");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("param", "org.eclipse.emf.ecore.EObject"),new PParameter("trace", "org.eclipse.incquery.viewmodel.traceability.Trace"),new PParameter("id", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_param = body.getOrCreateVariableByName("param");
      	PVariable var_trace = body.getOrCreateVariableByName("trace");
      	PVariable var_id = body.getOrCreateVariableByName("id");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_param, "param"),
      				
      		new ExportedParameter(body, var_trace, "trace"),
      				
      		new ExportedParameter(body, var_id, "id")
      	));
      	new TypeBinary(body, CONTEXT, var_trace, var_param, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace", "params"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace.params");
      	new TypeBinary(body, CONTEXT, var_trace, var_id, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace", "id"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace.id");
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
