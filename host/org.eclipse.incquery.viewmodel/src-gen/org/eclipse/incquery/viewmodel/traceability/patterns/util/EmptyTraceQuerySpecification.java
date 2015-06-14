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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.viewmodel.traceability.patterns.EmptyTraceMatch;
import org.eclipse.incquery.viewmodel.traceability.patterns.EmptyTraceMatcher;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.TraceTargetsQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate EmptyTraceMatcher in a type-safe way.
 * 
 * @see EmptyTraceMatcher
 * @see EmptyTraceMatch
 * 
 */
@SuppressWarnings("all")
public final class EmptyTraceQuerySpecification extends BaseGeneratedEMFQuerySpecification<EmptyTraceMatcher> {
  private EmptyTraceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EmptyTraceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EmptyTraceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EmptyTraceMatcher.on(engine);
  }
  
  @Override
  public EmptyTraceMatch newEmptyMatch() {
    return EmptyTraceMatch.newEmptyMatch();
  }
  
  @Override
  public EmptyTraceMatch newMatch(final Object... parameters) {
    return EmptyTraceMatch.newMatch((org.eclipse.incquery.viewmodel.traceability.Trace) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static EmptyTraceQuerySpecification INSTANCE = make();
    
    public static EmptyTraceQuerySpecification make() {
      return new EmptyTraceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EmptyTraceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.traceability.patterns.emptyTrace";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("trace");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("trace", "org.eclipse.incquery.viewmodel.traceability.Trace"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_trace = body.getOrCreateVariableByName("trace");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_trace, "trace")
      	));
      	new TypeUnary(body, var_trace, getClassifierLiteral("http://org.eclipse.incquery/viewmodel/traceability/1.0", "Trace"), "http://org.eclipse.incquery/viewmodel/traceability/1.0/Trace");
      	new NegativePatternCall(body, new FlatTuple(var_trace, var___0_), TraceTargetsQuerySpecification.instance().getInternalQueryRepresentation());
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
