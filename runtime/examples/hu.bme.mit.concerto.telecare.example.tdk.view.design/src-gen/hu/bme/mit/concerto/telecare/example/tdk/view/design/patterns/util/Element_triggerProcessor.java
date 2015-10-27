package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_triggerMatch;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_trigger pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Element_triggerProcessor implements IMatchProcessor<Element_triggerMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTrigger the value of pattern parameter trigger in the currently processed match
   * 
   */
  public abstract void process(final FixedIntervalTrigger pTrigger);
  
  @Override
  public void process(final Element_triggerMatch match) {
    process(match.getTrigger());
  }
}
