package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util;

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
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.Containment_socialNetwork_personMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.Containment_socialNetwork_personMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util.PersonWithHouseAndCarQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate Containment_socialNetwork_personMatcher in a type-safe way.
 * 
 * @see Containment_socialNetwork_personMatcher
 * @see Containment_socialNetwork_personMatch
 * 
 */
@SuppressWarnings("all")
public final class Containment_socialNetwork_personQuerySpecification extends BaseGeneratedEMFQuerySpecification<Containment_socialNetwork_personMatcher> {
  private Containment_socialNetwork_personQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Containment_socialNetwork_personQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Containment_socialNetwork_personMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Containment_socialNetwork_personMatcher.on(engine);
  }
  
  @Override
  public Containment_socialNetwork_personMatch newEmptyMatch() {
    return Containment_socialNetwork_personMatch.newEmptyMatch();
  }
  
  @Override
  public Containment_socialNetwork_personMatch newMatch(final Object... parameters) {
    return Containment_socialNetwork_personMatch.newMatch((socialnetwork_base.SocialNetwork) parameters[0], (socialnetwork_base.Person) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static Containment_socialNetwork_personQuerySpecification INSTANCE = make();
    
    public static Containment_socialNetwork_personQuerySpecification make() {
      return new Containment_socialNetwork_personQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Containment_socialNetwork_personQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.containment_socialNetwork_person";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sn","person");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("sn", "socialnetwork_base.SocialNetwork"),new PParameter("person", "socialnetwork_base.Person"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_sn = body.getOrCreateVariableByName("sn");
      	PVariable var_person = body.getOrCreateVariableByName("person");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_sn, "sn"),
      				
      		new ExportedParameter(body, var_person, "person")
      	));
      	new TypeConstraint(body, new FlatTuple(var_sn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork")));
      	new TypeConstraint(body, new FlatTuple(var_person), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_sn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork")));
      	new PositivePatternCall(body, new FlatTuple(var_person), PersonWithHouseAndCarQuerySpecification.instance().getInternalQueryRepresentation());
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
