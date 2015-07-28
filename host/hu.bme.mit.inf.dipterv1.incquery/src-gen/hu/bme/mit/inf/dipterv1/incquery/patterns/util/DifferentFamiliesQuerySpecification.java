package hu.bme.mit.inf.dipterv1.incquery.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.dipterv1.incquery.patterns.util.FamilyQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate DifferentFamiliesMatcher in a type-safe way.
 * 
 * @see DifferentFamiliesMatcher
 * @see DifferentFamiliesMatch
 * 
 */
@SuppressWarnings("all")
final class DifferentFamiliesQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  private DifferentFamiliesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DifferentFamiliesQuerySpecification instance() throws IncQueryException {
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
    private final static DifferentFamiliesQuerySpecification INSTANCE = make();
    
    public static DifferentFamiliesQuerySpecification make() {
      return new DifferentFamiliesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DifferentFamiliesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dipterv1.incquery.patterns.differentFamilies";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("m1","w1","m2","w2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("m1", "socialnetwork_base.Man"),new PParameter("w1", "socialnetwork_base.Woman"),new PParameter("m2", "socialnetwork_base.Man"),new PParameter("w2", "socialnetwork_base.Woman"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_m1 = body.getOrCreateVariableByName("m1");
      	PVariable var_w1 = body.getOrCreateVariableByName("w1");
      	PVariable var_m2 = body.getOrCreateVariableByName("m2");
      	PVariable var_w2 = body.getOrCreateVariableByName("w2");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_m1, "m1"),
      				
      		new ExportedParameter(body, var_w1, "w1"),
      				
      		new ExportedParameter(body, var_m2, "m2"),
      				
      		new ExportedParameter(body, var_w2, "w2")
      	));
      	new TypeConstraint(body, new FlatTuple(var_m1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_m2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Woman")));
      	new PositivePatternCall(body, new FlatTuple(var_m1, var_w1), FamilyQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_m2, var_w2), FamilyQuerySpecification.instance().getInternalQueryRepresentation());
      	new Inequality(body, var_m1, var_m2);
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_m1 = body.getOrCreateVariableByName("m1");
      	PVariable var_w1 = body.getOrCreateVariableByName("w1");
      	PVariable var_m2 = body.getOrCreateVariableByName("m2");
      	PVariable var_w2 = body.getOrCreateVariableByName("w2");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_m1, "m1"),
      				
      		new ExportedParameter(body, var_w1, "w1"),
      				
      		new ExportedParameter(body, var_m2, "m2"),
      				
      		new ExportedParameter(body, var_w2, "w2")
      	));
      	new TypeConstraint(body, new FlatTuple(var_m1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_m2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Woman")));
      	new PositivePatternCall(body, new FlatTuple(var_m1, var_w1), FamilyQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_m2, var_w2), FamilyQuerySpecification.instance().getInternalQueryRepresentation());
      	new Inequality(body, var_w1, var_w2);
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
