package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_viewModel_triggersMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_viewModel_triggersMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_triggerQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_viewModelQuerySpecification;
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

/**
 * A pattern-specific query specification that can instantiate Ref_viewModel_triggersMatcher in a type-safe way.
 * 
 * @see Ref_viewModel_triggersMatcher
 * @see Ref_viewModel_triggersMatch
 * 
 */
@SuppressWarnings("all")
public final class Ref_viewModel_triggersQuerySpecification extends BaseGeneratedEMFQuerySpecification<Ref_viewModel_triggersMatcher> {
  private Ref_viewModel_triggersQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Ref_viewModel_triggersQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Ref_viewModel_triggersMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Ref_viewModel_triggersMatcher.on(engine);
  }
  
  @Override
  public Ref_viewModel_triggersMatch newEmptyMatch() {
    return Ref_viewModel_triggersMatch.newEmptyMatch();
  }
  
  @Override
  public Ref_viewModel_triggersMatch newMatch(final Object... parameters) {
    return Ref_viewModel_triggersMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) parameters[0], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static Ref_viewModel_triggersQuerySpecification INSTANCE = make();
    
    public static Ref_viewModel_triggersQuerySpecification make() {
      return new Ref_viewModel_triggersQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Ref_viewModel_triggersQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_triggers";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("telecareSystem","trigger");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("telecareSystem", ""),new PParameter("trigger", ""));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_telecareSystem = body.getOrCreateVariableByName("telecareSystem");
      	PVariable var_trigger = body.getOrCreateVariableByName("trigger");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_telecareSystem, "telecareSystem"),
      				
      		new ExportedParameter(body, var_trigger, "trigger")
      	));
      	new TypeConstraint(body, new FlatTuple(var_telecareSystem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "TelecareSystem")));
      	new TypeConstraint(body, new FlatTuple(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "FixedIntervalTrigger")));
      	new PositivePatternCall(body, new FlatTuple(var_telecareSystem), Element_viewModelQuerySpecification.instance().getInternalQueryRepresentation());
      	new PositivePatternCall(body, new FlatTuple(var_trigger), Element_triggerQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeConstraint(body, new FlatTuple(var_telecareSystem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "TelecareSystem")));
      	new TypeConstraint(body, new FlatTuple(var_telecareSystem, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "TelecareSystem", "triggers")));
      	new Equality(body, var__virtual_0_, var_trigger);
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
