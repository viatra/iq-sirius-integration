package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_sensor_triggeredByMatch;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_sensor_triggeredBy pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Ref_sensor_triggeredByProcessor implements IMatchProcessor<Ref_sensor_triggeredByMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSensor the value of pattern parameter sensor in the currently processed match
   * @param pTrigger the value of pattern parameter trigger in the currently processed match
   * 
   */
  public abstract void process(final Sensor pSensor, final FixedIntervalTrigger pTrigger);
  
  @Override
  public void process(final Ref_sensor_triggeredByMatch match) {
    process(match.getSensor(), match.getTrigger());
  }
}
