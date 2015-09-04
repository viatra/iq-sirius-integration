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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.FamilyMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.FamilyMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util.CommonChildQuerySpecification;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util.ParentQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate FamilyMatcher in a type-safe way.
 * 
 * @see FamilyMatcher
 * @see FamilyMatch
 * 
 */
@SuppressWarnings("all")
public final class FamilyQuerySpecification extends BaseGeneratedEMFQuerySpecification<FamilyMatcher> {
  private FamilyQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FamilyQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected FamilyMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FamilyMatcher.on(engine);
  }
  
  @Override
  public FamilyMatch newEmptyMatch() {
    return FamilyMatch.newEmptyMatch();
  }
  
  @Override
  public FamilyMatch newMatch(final Object... parameters) {
    return FamilyMatch.newMatch((socialnetwork_base.Man) parameters[0], (socialnetwork_base.Woman) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static FamilyQuerySpecification INSTANCE = make();
    
    public static FamilyQuerySpecification make() {
      return new FamilyQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FamilyQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.family";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("father","mother");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("father", "socialnetwork_base.Man"),new PParameter("mother", "socialnetwork_base.Woman"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_father = body.getOrCreateVariableByName("father");
      	PVariable var_mother = body.getOrCreateVariableByName("mother");
      	PVariable var_sn = body.getOrCreateVariableByName("sn");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_child = body.getOrCreateVariableByName("child");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var_commonChildren = body.getOrCreateVariableByName("commonChildren");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	PVariable var_fatherParents = body.getOrCreateVariableByName("fatherParents");
      	PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      	PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      	PVariable var_motherParents = body.getOrCreateVariableByName("motherParents");
      	PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      	PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_father, "father"),
      				
      		new ExportedParameter(body, var_mother, "mother")
      	));
      	new TypeConstraint(body, new FlatTuple(var_father), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_mother), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_sn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork")));
      	new TypeConstraint(body, new FlatTuple(var_sn, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork", "members")));
      	new Equality(body, var__virtual_0_, var_father);
      	new TypeConstraint(body, new FlatTuple(var_sn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork")));
      	new TypeConstraint(body, new FlatTuple(var_sn, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "SocialNetwork", "members")));
      	new Equality(body, var__virtual_1_, var_mother);
      	new TypeConstraint(body, new FlatTuple(var_father), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Man")));
      	new TypeConstraint(body, new FlatTuple(var_father, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person", "children")));
      	new Equality(body, var__virtual_2_, var_child);
      	new TypeConstraint(body, new FlatTuple(var_mother), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Woman")));
      	new TypeConstraint(body, new FlatTuple(var_mother, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_base", "Person", "children")));
      	new Equality(body, var__virtual_3_, var_child);
      	new PatternMatchCounter(body, new FlatTuple(var_father, var_mother, var___0_), CommonChildQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_4_);
      	new Equality(body, var_commonChildren, var__virtual_4_);
      	new PatternMatchCounter(body, new FlatTuple(var_father, var___1_), ParentQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_5_);
      	new Equality(body, var_fatherParents, var__virtual_5_);
      	new PatternMatchCounter(body, new FlatTuple(var_mother, var___2_), ParentQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_6_);
      	new Equality(body, var_motherParents, var__virtual_6_);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern family";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("commonChildren");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.Integer commonChildren = (java.lang.Integer) provider.getValue("commonChildren");
      			return evaluateExpression_1_1(commonChildren);
      		}
      
      },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern family";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("fatherParents");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.Integer fatherParents = (java.lang.Integer) provider.getValue("fatherParents");
      			return evaluateExpression_1_2(fatherParents);
      		}
      
      },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern family";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("motherParents");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.Integer motherParents = (java.lang.Integer) provider.getValue("motherParents");
      			return evaluateExpression_1_3(motherParents);
      		}
      
      },  null); 
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
  
  private static boolean evaluateExpression_1_1(final Integer commonChildren) {
    return ((commonChildren).intValue() > 0);
  }
  
  private static boolean evaluateExpression_1_2(final Integer fatherParents) {
    return ((fatherParents).intValue() == 0);
  }
  
  private static boolean evaluateExpression_1_3(final Integer motherParents) {
    return ((motherParents).intValue() == 0);
  }
}
