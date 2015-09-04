package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.SocialNetworkMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.SocialNetworkMatcher;

/**
 * A pattern-specific query specification that can instantiate SocialNetworkMatcher in a type-safe way.
 * 
 * @see SocialNetworkMatcher
 * @see SocialNetworkMatch
 * 
 */
@SuppressWarnings("all")
public final class SocialNetworkQuerySpecification extends BaseGeneratedEMFQuerySpecification<SocialNetworkMatcher> {
  private SocialNetworkQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SocialNetworkQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SocialNetworkMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SocialNetworkMatcher.on(engine);
  }
  
  @Override
  public SocialNetworkMatch newEmptyMatch() {
    return SocialNetworkMatch.newEmptyMatch();
  }
  
  @Override
  public SocialNetworkMatch newMatch(final Object... parameters) {
    return SocialNetworkMatch.newMatch((socialnetwork_base.SocialNetwork) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static SocialNetworkQuerySpecification INSTANCE = make();
    
    public static SocialNetworkQuerySpecification make() {
      return new SocialNetworkQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SocialNetworkQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.socialNetwork";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sn");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("sn", "socialnetwork_base.SocialNetwork"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_sn = body.getOrCreateVariableByName("sn");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_sn, "sn")
      	));
      	new TypeConstraint(body, new FlatTuple(var_sn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork")));
      	new TypeConstraint(body, new FlatTuple(var_sn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork")));
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
