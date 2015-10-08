package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Attr_sensor_nameMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Attr_server_nameMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Attr_trigger_nameMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Attr_sensor_nameQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Attr_server_nameQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Attr_trigger_nameQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in attribute_rules.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file attribute_rules.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns, the group contains the definition of the following patterns: <ul>
 * <li>attr_server_name</li>
 * <li>attr_trigger_name</li>
 * <li>attr_sensor_name</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Attribute_rules extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Attribute_rules instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Attribute_rules();
    }
    return INSTANCE;
  }
  
  private static Attribute_rules INSTANCE;
  
  private Attribute_rules() throws IncQueryException {
    querySpecifications.add(Attr_server_nameQuerySpecification.instance());
    querySpecifications.add(Attr_trigger_nameQuerySpecification.instance());
    querySpecifications.add(Attr_sensor_nameQuerySpecification.instance());
  }
  
  public Attr_server_nameQuerySpecification getAttr_server_name() throws IncQueryException {
    return Attr_server_nameQuerySpecification.instance();
  }
  
  public Attr_server_nameMatcher getAttr_server_name(final IncQueryEngine engine) throws IncQueryException {
    return Attr_server_nameMatcher.on(engine);
  }
  
  public Attr_trigger_nameQuerySpecification getAttr_trigger_name() throws IncQueryException {
    return Attr_trigger_nameQuerySpecification.instance();
  }
  
  public Attr_trigger_nameMatcher getAttr_trigger_name(final IncQueryEngine engine) throws IncQueryException {
    return Attr_trigger_nameMatcher.on(engine);
  }
  
  public Attr_sensor_nameQuerySpecification getAttr_sensor_name() throws IncQueryException {
    return Attr_sensor_nameQuerySpecification.instance();
  }
  
  public Attr_sensor_nameMatcher getAttr_sensor_name(final IncQueryEngine engine) throws IncQueryException {
    return Attr_sensor_nameMatcher.on(engine);
  }
}
