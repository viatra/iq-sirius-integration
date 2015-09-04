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
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.PersonWithHouseAndCarMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.PersonWithHouseAndCarMatcher;

/**
 * A pattern-specific query specification that can instantiate PersonWithHouseAndCarMatcher in a type-safe way.
 * 
 * @see PersonWithHouseAndCarMatcher
 * @see PersonWithHouseAndCarMatch
 * 
 */
@SuppressWarnings("all")
public final class PersonWithHouseAndCarQuerySpecification extends BaseGeneratedEMFQuerySpecification<PersonWithHouseAndCarMatcher> {
  private PersonWithHouseAndCarQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PersonWithHouseAndCarQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PersonWithHouseAndCarMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PersonWithHouseAndCarMatcher.on(engine);
  }
  
  @Override
  public PersonWithHouseAndCarMatch newEmptyMatch() {
    return PersonWithHouseAndCarMatch.newEmptyMatch();
  }
  
  @Override
  public PersonWithHouseAndCarMatch newMatch(final Object... parameters) {
    return PersonWithHouseAndCarMatch.newMatch((socialnetwork_base.Person) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static PersonWithHouseAndCarQuerySpecification INSTANCE = make();
    
    public static PersonWithHouseAndCarQuerySpecification make() {
      return new PersonWithHouseAndCarQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static PersonWithHouseAndCarQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.personWithHouseAndCar";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("person");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("person", "socialnetwork_base.Person"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_person = body.getOrCreateVariableByName("person");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_address = body.getOrCreateVariableByName("address");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_lpn = body.getOrCreateVariableByName("lpn");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      	PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_person, "person")
      	));
      	new TypeConstraint(body, new FlatTuple(var_person), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var___0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork")));
      	new TypeConstraint(body, new FlatTuple(var___0_, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork", "members")));
      	new Equality(body, var__virtual_0_, var_person);
      	new TypeConstraint(body, new FlatTuple(var_person), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_person, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person", "address")));
      	new Equality(body, var__virtual_1_, var_address);
      	new TypeConstraint(body, new FlatTuple(var_person), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_person, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person", "licensePlateNumber")));
      	new Equality(body, var__virtual_2_, var_lpn);
      	new ConstantValue(body, var__virtual_3_, false);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern personWithHouseAndCar";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("address");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.String address = (java.lang.String) provider.getValue("address");
      			return evaluateExpression_1_1(address);
      		}
      
      },  var__virtual_4_ ); 
      	new Equality(body, var__virtual_3_, var__virtual_4_);
      	new ConstantValue(body, var__virtual_5_, false);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern personWithHouseAndCar";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("lpn");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.String lpn = (java.lang.String) provider.getValue("lpn");
      			return evaluateExpression_1_2(lpn);
      		}
      
      },  var__virtual_6_ ); 
      	new Equality(body, var__virtual_5_, var__virtual_6_);
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
  
  private static boolean evaluateExpression_1_1(final String address) {
    boolean _isEmpty = address.isEmpty();
    return _isEmpty;
  }
  
  private static boolean evaluateExpression_1_2(final String lpn) {
    boolean _isEmpty = lpn.isEmpty();
    return _isEmpty;
  }
}
