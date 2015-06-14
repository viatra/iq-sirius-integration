package org.eclipse.incquery.viewmodel.traceability.patterns.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate TraceTargetsMatcher in a type-safe way.
 * 
 * @see TraceTargetsMatcher
 * @see TraceTargetsMatch
 * 
 */
@SuppressWarnings("all")
final class TraceTargetsQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  private TraceTargetsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TraceTargetsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected IncQueryMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newEmptyMatch() {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newMatch(final Object... parameters) {
    throw new UnsupportedOperationException();
  }
  
  private static class LazyHolder {
    private final static TraceTargetsQuerySpecification INSTANCE = make();
    
    public static TraceTargetsQuerySpecification make() {
      return new TraceTargetsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TraceTargetsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.traceability.patterns.traceTargets";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("trace","target");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("trace", "org.eclipse.incquery.viewmodel.traceability.Trace"),new PParameter("target", "org.eclipse.emf.ecore.EObject"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_trace = body.getOrCreateVariableByName("trace");
      	PVariable var_target = body.getOrCreateVariableByName("target");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_trace, "trace"),
      				
      		new ExportedParameter(body, var_target, "target")
      	));
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
