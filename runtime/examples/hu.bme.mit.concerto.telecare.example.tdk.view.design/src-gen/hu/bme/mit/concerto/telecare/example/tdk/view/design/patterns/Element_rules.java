package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_sensorMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_serverMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_triggerMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_viewModelMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_sensorQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_serverQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_triggerQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_viewModelQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in element_rules.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file element_rules.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns, the group contains the definition of the following patterns: <ul>
 * <li>element_viewModel</li>
 * <li>element_server</li>
 * <li>element_trigger</li>
 * <li>element_sensor</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Element_rules extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Element_rules instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Element_rules();
    }
    return INSTANCE;
  }
  
  private static Element_rules INSTANCE;
  
  private Element_rules() throws IncQueryException {
    querySpecifications.add(Element_viewModelQuerySpecification.instance());
    querySpecifications.add(Element_serverQuerySpecification.instance());
    querySpecifications.add(Element_triggerQuerySpecification.instance());
    querySpecifications.add(Element_sensorQuerySpecification.instance());
  }
  
  public Element_viewModelQuerySpecification getElement_viewModel() throws IncQueryException {
    return Element_viewModelQuerySpecification.instance();
  }
  
  public Element_viewModelMatcher getElement_viewModel(final IncQueryEngine engine) throws IncQueryException {
    return Element_viewModelMatcher.on(engine);
  }
  
  public Element_serverQuerySpecification getElement_server() throws IncQueryException {
    return Element_serverQuerySpecification.instance();
  }
  
  public Element_serverMatcher getElement_server(final IncQueryEngine engine) throws IncQueryException {
    return Element_serverMatcher.on(engine);
  }
  
  public Element_triggerQuerySpecification getElement_trigger() throws IncQueryException {
    return Element_triggerQuerySpecification.instance();
  }
  
  public Element_triggerMatcher getElement_trigger(final IncQueryEngine engine) throws IncQueryException {
    return Element_triggerMatcher.on(engine);
  }
  
  public Element_sensorQuerySpecification getElement_sensor() throws IncQueryException {
    return Element_sensorQuerySpecification.instance();
  }
  
  public Element_sensorMatcher getElement_sensor(final IncQueryEngine engine) throws IncQueryException {
    return Element_sensorMatcher.on(engine);
  }
}
