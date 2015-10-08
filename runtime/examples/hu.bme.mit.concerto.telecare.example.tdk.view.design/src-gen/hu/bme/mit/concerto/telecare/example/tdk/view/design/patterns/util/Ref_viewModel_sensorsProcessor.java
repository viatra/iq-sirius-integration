package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_viewModel_sensorsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_sensors pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Ref_viewModel_sensorsProcessor implements IMatchProcessor<Ref_viewModel_sensorsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTelecareSystem the value of pattern parameter telecareSystem in the currently processed match
   * @param pSensor the value of pattern parameter sensor in the currently processed match
   * 
   */
  public abstract void process(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor);
  
  @Override
  public void process(final Ref_viewModel_sensorsMatch match) {
    process(match.getTelecareSystem(), match.getSensor());
  }
}
