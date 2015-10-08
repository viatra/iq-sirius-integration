package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Attr_server_nameMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_server_name pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Attr_server_nameProcessor implements IMatchProcessor<Attr_server_nameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pHost the value of pattern parameter host in the currently processed match
   * @param pValue the value of pattern parameter value in the currently processed match
   * 
   */
  public abstract void process(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost, final String pValue);
  
  @Override
  public void process(final Attr_server_nameMatch match) {
    process(match.getHost(), match.getValue());
  }
}
