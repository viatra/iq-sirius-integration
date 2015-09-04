package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util;

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
 * A pattern-specific query specification that can instantiate ParentMatcher in a type-safe way.
 * 
 * @see ParentMatcher
 * @see ParentMatch
 * 
 */
@SuppressWarnings("all")
final class ParentQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  private ParentQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ParentQuerySpecification instance() throws IncQueryException {
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
    private final static ParentQuerySpecification INSTANCE = make();
    
    public static ParentQuerySpecification make() {
      return new ParentQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ParentQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.parent";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("person","parent");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("person", "socialnetwork_base.Person"),new PParameter("parent", "socialnetwork_base.Person"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_person = body.getOrCreateVariableByName("person");
      	PVariable var_parent = body.getOrCreateVariableByName("parent");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_person, "person"),
      				
      		new ExportedParameter(body, var_parent, "parent")
      	));
      	new TypeConstraint(body, new FlatTuple(var_person), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person", "children")));
      	new Equality(body, var__virtual_0_, var_person);
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
