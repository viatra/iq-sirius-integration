package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_viewModelMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_viewModelMatcher;
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

/**
 * A pattern-specific query specification that can instantiate Element_viewModelMatcher in a type-safe way.
 * 
 * @see Element_viewModelMatcher
 * @see Element_viewModelMatch
 * 
 */
@SuppressWarnings("all")
public final class Element_viewModelQuerySpecification extends BaseGeneratedEMFQuerySpecification<Element_viewModelMatcher> {
  private Element_viewModelQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Element_viewModelQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Element_viewModelMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Element_viewModelMatcher.on(engine);
  }
  
  @Override
  public Element_viewModelMatch newEmptyMatch() {
    return Element_viewModelMatch.newEmptyMatch();
  }
  
  @Override
  public Element_viewModelMatch newMatch(final Object... parameters) {
    return Element_viewModelMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static Element_viewModelQuerySpecification INSTANCE = make();
    
    public static Element_viewModelQuerySpecification make() {
      return new Element_viewModelQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Element_viewModelQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_viewModel";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("telecareSystem");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("telecareSystem", ""));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_telecareSystem = body.getOrCreateVariableByName("telecareSystem");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_telecareSystem, "telecareSystem")
      	));
      	new TypeConstraint(body, new FlatTuple(var_telecareSystem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "TelecareSystem")));
      	new TypeConstraint(body, new FlatTuple(var_telecareSystem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0", "TelecareSystem")));
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
