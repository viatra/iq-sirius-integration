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
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.Family_nameMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.Family_nameMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util.FamilyQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate Family_nameMatcher in a type-safe way.
 * 
 * @see Family_nameMatcher
 * @see Family_nameMatch
 * 
 */
@SuppressWarnings("all")
public final class Family_nameQuerySpecification extends BaseGeneratedEMFQuerySpecification<Family_nameMatcher> {
  private Family_nameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Family_nameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Family_nameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Family_nameMatcher.on(engine);
  }
  
  @Override
  public Family_nameMatch newEmptyMatch() {
    return Family_nameMatch.newEmptyMatch();
  }
  
  @Override
  public Family_nameMatch newMatch(final Object... parameters) {
    return Family_nameMatch.newMatch((socialnetwork_base.Man) parameters[0], (socialnetwork_base.Woman) parameters[1], (java.lang.String) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static Family_nameQuerySpecification INSTANCE = make();
    
    public static Family_nameQuerySpecification make() {
      return new Family_nameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Family_nameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.family_name";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("father","mother","value");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("father", "socialnetwork_base.Man"),new PParameter("mother", "socialnetwork_base.Woman"),new PParameter("value", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_father = body.getOrCreateVariableByName("father");
      	PVariable var_mother = body.getOrCreateVariableByName("mother");
      	PVariable var_value = body.getOrCreateVariableByName("value");
      	PVariable var_fLastName = body.getOrCreateVariableByName("fLastName");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_mLastName = body.getOrCreateVariableByName("mLastName");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_father, "father"),
      				
      		new ExportedParameter(body, var_mother, "mother"),
      				
      		new ExportedParameter(body, var_value, "value")
      	));
      	new TypeConstraint(body, new FlatTuple(var_father), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_mother), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_father), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_father, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person", "lastName")));
      	new Equality(body, var__virtual_0_, var_fLastName);
      	new TypeConstraint(body, new FlatTuple(var_mother), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person")));
      	new TypeConstraint(body, new FlatTuple(var_mother, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person", "lastName")));
      	new Equality(body, var__virtual_1_, var_mLastName);
      	new PositivePatternCall(body, new FlatTuple(var_father, var_mother), FamilyQuerySpecification.instance().getInternalQueryRepresentation());
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern family_name";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("fLastName", "mLastName");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.String fLastName = (java.lang.String) provider.getValue("fLastName");
      			java.lang.String mLastName = (java.lang.String) provider.getValue("mLastName");
      			return evaluateExpression_1_1(fLastName, mLastName);
      		}
      
      },  var__virtual_2_ ); 
      	new Equality(body, var_value, var__virtual_2_);
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
  
  private static String evaluateExpression_1_1(final String fLastName, final String mLastName) {
    return ((fLastName + "&") + mLastName);
  }
}
