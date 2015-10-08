package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Attr_sensor_nameMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_sensor_name pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Attr_sensor_nameProcessor implements IMatchProcessor<Attr_sensor_nameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSensor the value of pattern parameter sensor in the currently processed match
   * @param pValue the value of pattern parameter value in the currently processed match
   * 
   */
  public abstract void process(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue);
  
  @Override
  public void process(final Attr_sensor_nameMatch match) {
    process(match.getSensor(), match.getValue());
  }
}
