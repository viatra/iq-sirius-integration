package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_serverMatch;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_server pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Element_serverProcessor implements IMatchProcessor<Element_serverMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pHost the value of pattern parameter host in the currently processed match
   * 
   */
  public abstract void process(final Host pHost);
  
  @Override
  public void process(final Element_serverMatch match) {
    process(match.getHost());
  }
}
