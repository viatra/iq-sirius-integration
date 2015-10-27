package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Attr_trigger_nameMatch;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_trigger_name pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Attr_trigger_nameProcessor implements IMatchProcessor<Attr_trigger_nameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTrigger the value of pattern parameter trigger in the currently processed match
   * @param pValue the value of pattern parameter value in the currently processed match
   * 
   */
  public abstract void process(final FixedIntervalTrigger pTrigger, final String pValue);
  
  @Override
  public void process(final Attr_trigger_nameMatch match) {
    process(match.getTrigger(), match.getValue());
  }
}
