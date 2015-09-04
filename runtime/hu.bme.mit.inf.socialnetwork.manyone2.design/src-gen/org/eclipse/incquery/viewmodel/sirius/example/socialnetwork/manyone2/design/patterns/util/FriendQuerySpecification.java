package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util;

import com.google.common.collect.Sets;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.FriendMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.FriendMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util.DifferentFamiliesQuerySpecification;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util.FamilyMemberQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate FriendMatcher in a type-safe way.
 * 
 * @see FriendMatcher
 * @see FriendMatch
 * 
 */
@SuppressWarnings("all")
public final class FriendQuerySpecification extends BaseGeneratedEMFQuerySpecification<FriendMatcher> {
  private FriendQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FriendQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected FriendMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FriendMatcher.on(engine);
  }
  
  @Override
  public FriendMatch newEmptyMatch() {
    return FriendMatch.newEmptyMatch();
  }
  
  @Override
  public FriendMatch newMatch(final Object... parameters) {
    return FriendMatch.newMatch((socialnetwork_base.Man) parameters[0], (socialnetwork_base.Woman) parameters[1], (socialnetwork_base.Man) parameters[2], (socialnetwork_base.Woman) parameters[3]);
  }
  
  private static class LazyHolder {
    private final static FriendQuerySpecification INSTANCE = make();
    
    public static FriendQuerySpecification make() {
      return new FriendQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FriendQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.friend";
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
      	PVariable var_fm_1 = body.getOrCreateVariableByName("fm_1");
      	PVariable var_fm_2 = body.getOrCreateVariableByName("fm_2");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_m1, "m1"),
      				
      		new ExportedParameter(body, var_w1, "w1"),
      				
      		new ExportedParameter(body, var_m2, "m2"),
      				
      		new ExportedParameter(body, var_w2, "w2")
      	));
      	new TypeConstraint(body, new FlatTuple(var_m1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_m2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_w2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new PositivePatternCall(body, new FlatTuple(var_m1, var_w1, var_m2, var_w2), DifferentFamiliesQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_m1, var_w1, var_fm_1), FamilyMemberQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_m2, var_w2, var_fm_2), FamilyMemberQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeConstraint(body, new FlatTuple(var_fm_1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_fm_1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person", "friends")));
      	new Equality(body, var__virtual_0_, var_fm_2);
      	new TypeConstraint(body, new FlatTuple(var_fm_2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_fm_2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person", "friends")));
      	new Equality(body, var__virtual_1_, var_fm_1);
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
