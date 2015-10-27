package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_sensor_connectedToMatch;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_sensor_connectedTo pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Ref_sensor_connectedToProcessor implements IMatchProcessor<Ref_sensor_connectedToMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSensor the value of pattern parameter sensor in the currently processed match
   * @param pHost the value of pattern parameter host in the currently processed match
   * 
   */
  public abstract void process(final Sensor pSensor, final Host pHost);
  
  @Override
  public void process(final Ref_sensor_connectedToMatch match) {
    process(match.getSensor(), match.getHost());
  }
}
