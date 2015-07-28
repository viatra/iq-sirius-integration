package hu.bme.mit.inf.dipterv1.incquery.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.dipterv1.incquery.patterns.Containment_socialNetwork_friendMatch;
import hu.bme.mit.inf.dipterv1.incquery.patterns.Containment_socialNetwork_friendMatcher;
import hu.bme.mit.inf.dipterv1.incquery.patterns.util.FriendQuerySpecification;
import hu.bme.mit.inf.dipterv1.incquery.patterns.util.SocialNetworkQuerySpecification;
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

/**
 * A pattern-specific query specification that can instantiate Containment_socialNetwork_friendMatcher in a type-safe way.
 * 
 * @see Containment_socialNetwork_friendMatcher
 * @see Containment_socialNetwork_friendMatch
 * 
 */
@SuppressWarnings("all")
public final class Containment_socialNetwork_friendQuerySpecification extends BaseGeneratedEMFQuerySpecification<Containment_socialNetwork_friendMatcher> {
  private Containment_socialNetwork_friendQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Containment_socialNetwork_friendQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Containment_socialNetwork_friendMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Containment_socialNetwork_friendMatcher.on(engine);
  }
  
  @Override
  public Containment_socialNetwork_friendMatch newEmptyMatch() {
    return Containment_socialNetwork_friendMatch.newEmptyMatch();
  }
  
  @Override
  public Containment_socialNetwork_friendMatch newMatch(final Object... parameters) {
    return Containment_socialNetwork_friendMatch.newMatch((socialnetwork_base.SocialNetwork) parameters[0], (socialnetwork_base.Man) parameters[1], (socialnetwork_base.Woman) parameters[2], (socialnetwork_base.Man) parameters[3], (socialnetwork_base.Woman) parameters[4]);
  }
  
  private static class LazyHolder {
    private final static Containment_socialNetwork_friendQuerySpecification INSTANCE = make();
    
    public static Containment_socialNetwork_friendQuerySpecification make() {
      return new Containment_socialNetwork_friendQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Containment_socialNetwork_friendQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dipterv1.incquery.patterns.containment_socialNetwork_friend";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sn","f1","m1","f2","m2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("sn", "socialnetwork_base.SocialNetwork"),new PParameter("f1", "socialnetwork_base.Man"),new PParameter("m1", "socialnetwork_base.Woman"),new PParameter("f2", "socialnetwork_base.Man"),new PParameter("m2", "socialnetwork_base.Woman"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_sn = body.getOrCreateVariableByName("sn");
      	PVariable var_f1 = body.getOrCreateVariableByName("f1");
      	PVariable var_m1 = body.getOrCreateVariableByName("m1");
      	PVariable var_f2 = body.getOrCreateVariableByName("f2");
      	PVariable var_m2 = body.getOrCreateVariableByName("m2");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_sn, "sn"),
      				
      		new ExportedParameter(body, var_f1, "f1"),
      				
      		new ExportedParameter(body, var_m1, "m1"),
      				
      		new ExportedParameter(body, var_f2, "f2"),
      				
      		new ExportedParameter(body, var_m2, "m2")
      	));
      	new TypeConstraint(body, new FlatTuple(var_sn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "SocialNetwork")));
      	new TypeConstraint(body, new FlatTuple(var_f1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_m1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_f2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_m2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.models/socialnetwork_base", "Woman")));
      	new PositivePatternCall(body, new FlatTuple(var_sn), SocialNetworkQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_f1, var_m1, var_f2, var_m2), FriendQuerySpecification.instance().getInternalQueryRepresentation());
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
