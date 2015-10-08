package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_sensor_connectedToMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_sensor_triggeredByMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_viewModel_sensorsMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_viewModel_serversMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_viewModel_triggersMatcher;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_sensor_connectedToQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_sensor_triggeredByQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_viewModel_sensorsQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_viewModel_serversQuerySpecification;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_viewModel_triggersQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in reference_rules.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file reference_rules.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns, the group contains the definition of the following patterns: <ul>
 * <li>ref_viewModel_servers</li>
 * <li>ref_viewModel_triggers</li>
 * <li>ref_viewModel_sensors</li>
 * <li>ref_sensor_connectedTo</li>
 * <li>ref_sensor_triggeredBy</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Reference_rules extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Reference_rules instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Reference_rules();
    }
    return INSTANCE;
  }
  
  private static Reference_rules INSTANCE;
  
  private Reference_rules() throws IncQueryException {
    querySpecifications.add(Ref_viewModel_serversQuerySpecification.instance());
    querySpecifications.add(Ref_viewModel_triggersQuerySpecification.instance());
    querySpecifications.add(Ref_viewModel_sensorsQuerySpecification.instance());
    querySpecifications.add(Ref_sensor_connectedToQuerySpecification.instance());
    querySpecifications.add(Ref_sensor_triggeredByQuerySpecification.instance());
  }
  
  public Ref_viewModel_serversQuerySpecification getRef_viewModel_servers() throws IncQueryException {
    return Ref_viewModel_serversQuerySpecification.instance();
  }
  
  public Ref_viewModel_serversMatcher getRef_viewModel_servers(final IncQueryEngine engine) throws IncQueryException {
    return Ref_viewModel_serversMatcher.on(engine);
  }
  
  public Ref_viewModel_triggersQuerySpecification getRef_viewModel_triggers() throws IncQueryException {
    return Ref_viewModel_triggersQuerySpecification.instance();
  }
  
  public Ref_viewModel_triggersMatcher getRef_viewModel_triggers(final IncQueryEngine engine) throws IncQueryException {
    return Ref_viewModel_triggersMatcher.on(engine);
  }
  
  public Ref_viewModel_sensorsQuerySpecification getRef_viewModel_sensors() throws IncQueryException {
    return Ref_viewModel_sensorsQuerySpecification.instance();
  }
  
  public Ref_viewModel_sensorsMatcher getRef_viewModel_sensors(final IncQueryEngine engine) throws IncQueryException {
    return Ref_viewModel_sensorsMatcher.on(engine);
  }
  
  public Ref_sensor_connectedToQuerySpecification getRef_sensor_connectedTo() throws IncQueryException {
    return Ref_sensor_connectedToQuerySpecification.instance();
  }
  
  public Ref_sensor_connectedToMatcher getRef_sensor_connectedTo(final IncQueryEngine engine) throws IncQueryException {
    return Ref_sensor_connectedToMatcher.on(engine);
  }
  
  public Ref_sensor_triggeredByQuerySpecification getRef_sensor_triggeredBy() throws IncQueryException {
    return Ref_sensor_triggeredByQuerySpecification.instance();
  }
  
  public Ref_sensor_triggeredByMatcher getRef_sensor_triggeredBy(final IncQueryEngine engine) throws IncQueryException {
    return Ref_sensor_triggeredByMatcher.on(engine);
  }
}
