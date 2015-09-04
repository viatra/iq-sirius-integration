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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.Containment_socialNetwork_familyMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.Containment_socialNetwork_familyMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.FamilyQuerySpecification;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.SocialNetworkQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate Containment_socialNetwork_familyMatcher in a type-safe way.
 * 
 * @see Containment_socialNetwork_familyMatcher
 * @see Containment_socialNetwork_familyMatch
 * 
 */
@SuppressWarnings("all")
public final class Containment_socialNetwork_familyQuerySpecification extends BaseGeneratedEMFQuerySpecification<Containment_socialNetwork_familyMatcher> {
  private Containment_socialNetwork_familyQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Containment_socialNetwork_familyQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Containment_socialNetwork_familyMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Containment_socialNetwork_familyMatcher.on(engine);
  }
  
  @Override
  public Containment_socialNetwork_familyMatch newEmptyMatch() {
    return Containment_socialNetwork_familyMatch.newEmptyMatch();
  }
  
  @Override
  public Containment_socialNetwork_familyMatch newMatch(final Object... parameters) {
    return Containment_socialNetwork_familyMatch.newMatch((socialnetwork_base.SocialNetwork) parameters[0], (socialnetwork_base.Man) parameters[1], (socialnetwork_base.Woman) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static Containment_socialNetwork_familyQuerySpecification INSTANCE = make();
    
    public static Containment_socialNetwork_familyQuerySpecification make() {
      return new Containment_socialNetwork_familyQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Containment_socialNetwork_familyQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.containment_socialNetwork_family";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sn","f","m");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("sn", "socialnetwork_base.SocialNetwork"),new PParameter("f", "socialnetwork_base.Man"),new PParameter("m", "socialnetwork_base.Woman"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_sn = body.getOrCreateVariableByName("sn");
      	PVariable var_f = body.getOrCreateVariableByName("f");
      	PVariable var_m = body.getOrCreateVariableByName("m");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_sn, "sn"),
      				
      		new ExportedParameter(body, var_f, "f"),
      				
      		new ExportedParameter(body, var_m, "m")
      	));
      	new TypeConstraint(body, new FlatTuple(var_sn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork")));
      	new TypeConstraint(body, new FlatTuple(var_f), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_m), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new PositivePatternCall(body, new FlatTuple(var_sn), SocialNetworkQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_f, var_m), FamilyQuerySpecification.instance().getInternalQueryRepresentation());
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
