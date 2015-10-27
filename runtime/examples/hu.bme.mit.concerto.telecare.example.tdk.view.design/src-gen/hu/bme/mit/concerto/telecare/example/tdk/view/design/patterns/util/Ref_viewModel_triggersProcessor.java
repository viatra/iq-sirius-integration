package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_viewModel_triggersMatch;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_triggers pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Ref_viewModel_triggersProcessor implements IMatchProcessor<Ref_viewModel_triggersMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTelecareSystem the value of pattern parameter telecareSystem in the currently processed match
   * @param pTrigger the value of pattern parameter trigger in the currently processed match
   * 
   */
  public abstract void process(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger);
  
  @Override
  public void process(final Ref_viewModel_triggersMatch match) {
    process(match.getTelecareSystem(), match.getTrigger());
  }
}
