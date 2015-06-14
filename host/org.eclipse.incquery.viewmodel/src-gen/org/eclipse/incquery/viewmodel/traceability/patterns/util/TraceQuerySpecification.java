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
import org.eclipse.incquery.viewmodel.traceability.patterns.TraceMatch;
import org.eclipse.incquery.viewmodel.traceability.patterns.TraceMatcher;

/**
 * A pattern-specific query specification that can instantiate TraceMatcher in a type-safe way.
 * 
 * @see TraceMatcher
 * @see TraceMatch
 * 
 */
@SuppressWarnings("all")
public final class TraceQuerySpecification extends BaseGeneratedEMFQuerySpecification<TraceMatcher> {
  private TraceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TraceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TraceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TraceMatcher.on(engine);
  }
  
  @Override
  public TraceMatch newEmptyMatch() {
    return TraceMatch.newEmptyMatch();
  }
  
  @Override
  public TraceMatch newMatch(final Object... parameters) {
    return TraceMatch.newMatch((java.lang.Object) parameters[0], (java.lang.String) parameters[1], (org.eclipse.emf.ecore.EObject) parameters[2], (org.eclipse.incquery.viewmodel.traceability.Trace) parameters[3], (java.lang.String) parameters[4]);
  }
  
  private static class LazyHolder {
    private final static TraceQuerySpecification INSTANCE = make();
    
    public static TraceQuerySpecification make() {
      return new TraceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TraceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.traceability.patterns.trace";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("source","id","target","trace","traceabilityId");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("source", "java.lang.Object"),new PParameter("id", "java.lang.String"),new PParameter("target", "org.eclipse.emf.ecore.EObject"),new PParameter("trace", "org.eclipse.incquery.viewmodel.traceability.Trace"),new PParameter("traceabilityId", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_source = body.getOrCreateVariableByName("source");
      	PVariable var_id = body.getOrCreateVariableByName("id");
      	PVariable var_target = body.getOrCreateVariableByName("target");
      	PVariable var_trace = body.getOrCreateVariableByName("trace");
      	PVariable var_traceabilityId = body.getOrCreateVariableByName("traceabilityId");
      	PVariable var_traceability = body.getOrCreateVariableByName("traceability");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_source, "source"),
      				
      		new ExportedParameter(body, var_id, "id"),
      				
      		new ExportedParameter(body, var_target, "target"),
      				
      		new ExportedParameter(body, var_trace, "trace"),
      				
      		new ExportedParameter(body, var_traceabilityId, "traceabilityId")
      	));
      	new TypeBinary(body, CONTEXT, var_trace, var_source, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace", "params"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace.params");
      	new TypeBinary(body, CONTEXT, var_trace, var_target, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace", "targets"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace.targets");
      	new TypeBinary(body, CONTEXT, var_trace, var_id, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace", "id"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace.id");
      	new TypeBinary(body, CONTEXT, var_traceability, var_traceabilityId, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Traceability", "id"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Traceability.id");
      	new TypeBinary(body, CONTEXT, var_traceability, var_trace, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Traceability", "traces"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Traceability.traces");
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_source = body.getOrCreateVariableByName("source");
      	PVariable var_id = body.getOrCreateVariableByName("id");
      	PVariable var_target = body.getOrCreateVariableByName("target");
      	PVariable var_trace = body.getOrCreateVariableByName("trace");
      	PVariable var_traceabilityId = body.getOrCreateVariableByName("traceabilityId");
      	PVariable var_traceability = body.getOrCreateVariableByName("traceability");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_source, "source"),
      				
      		new ExportedParameter(body, var_id, "id"),
      				
      		new ExportedParameter(body, var_target, "target"),
      				
      		new ExportedParameter(body, var_trace, "trace"),
      				
      		new ExportedParameter(body, var_traceabilityId, "traceabilityId")
      	));
      	new TypeBinary(body, CONTEXT, var_trace, var_source, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace", "objects"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace.objects");
      	new TypeBinary(body, CONTEXT, var_trace, var_target, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace", "targets"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace.targets");
      	new TypeBinary(body, CONTEXT, var_trace, var_id, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace", "id"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace.id");
      	new TypeBinary(body, CONTEXT, var_traceability, var_traceabilityId, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Traceability", "id"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Traceability.id");
      	new TypeBinary(body, CONTEXT, var_traceability, var_trace, getFeatureLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Traceability", "traces"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Traceability.traces");
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
