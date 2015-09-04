package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util;

import com.google.common.collect.Sets;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.DescendantQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate FamilyMemberMatcher in a type-safe way.
 * 
 * @see FamilyMemberMatcher
 * @see FamilyMemberMatch
 * 
 */
@SuppressWarnings("all")
final class FamilyMemberQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  private FamilyMemberQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FamilyMemberQuerySpecification instance() throws IncQueryException {
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
    private final static FamilyMemberQuerySpecification INSTANCE = make();
    
    public static FamilyMemberQuerySpecification make() {
      return new FamilyMemberQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FamilyMemberQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.familyMember";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("m","w","fm");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("m", "socialnetwork_base.Man"),new PParameter("w", "socialnetwork_base.Woman"),new PParameter("fm", "socialnetwork_base.Person"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_m = body.getOrCreateVariableByName("m");
      	PVariable var_w = body.getOrCreateVariableByName("w");
      	PVariable var_fm = body.getOrCreateVariableByName("fm");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_m, "m"),
      				
      		new ExportedParameter(body, var_w, "w"),
      				
      		new ExportedParameter(body, var_fm, "fm")
      	));
      	new TypeConstraint(body, new FlatTuple(var_m), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_fm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_m), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_fm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new Equality(body, var_m, var_fm);
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_m = body.getOrCreateVariableByName("m");
      	PVariable var_w = body.getOrCreateVariableByName("w");
      	PVariable var_fm = body.getOrCreateVariableByName("fm");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_m, "m"),
      				
      		new ExportedParameter(body, var_w, "w"),
      				
      		new ExportedParameter(body, var_fm, "fm")
      	));
      	new TypeConstraint(body, new FlatTuple(var_m), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_fm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_m), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_fm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new Equality(body, var_w, var_fm);
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_m = body.getOrCreateVariableByName("m");
      	PVariable var_w = body.getOrCreateVariableByName("w");
      	PVariable var_fm = body.getOrCreateVariableByName("fm");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_m, "m"),
      				
      		new ExportedParameter(body, var_w, "w"),
      				
      		new ExportedParameter(body, var_fm, "fm")
      	));
      	new TypeConstraint(body, new FlatTuple(var_m), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_fm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_fm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new BinaryTransitiveClosure(body, new FlatTuple(var_m, var_fm), DescendantQuerySpecification.instance().getInternalQueryRepresentation());
      	new BinaryTransitiveClosure(body, new FlatTuple(var_w, var_fm), DescendantQuerySpecification.instance().getInternalQueryRepresentation());
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
