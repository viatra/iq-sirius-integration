package org.eclipse.incquery.viewmodel.traceability.patterns.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.Trace2targetMatch;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.traceability.patterns.trace2target pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Trace2targetProcessor implements IMatchProcessor<Trace2targetMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTarget the value of pattern parameter target in the currently processed match
   * @param pTrace the value of pattern parameter trace in the currently processed match
   * 
   */
  public abstract void process(final EObject pTarget, final Trace pTrace);
  
  @Override
  public void process(final Trace2targetMatch match) {
    process(match.getTarget(), match.getTrace());
  }
}
