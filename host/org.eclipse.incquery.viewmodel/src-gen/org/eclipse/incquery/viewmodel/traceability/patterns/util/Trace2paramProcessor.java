package org.eclipse.incquery.viewmodel.traceability.patterns.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.Trace2paramMatch;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.traceability.patterns.trace2param pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Trace2paramProcessor implements IMatchProcessor<Trace2paramMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pParam the value of pattern parameter param in the currently processed match
   * @param pTrace the value of pattern parameter trace in the currently processed match
   * @param pId the value of pattern parameter id in the currently processed match
   * 
   */
  public abstract void process(final EObject pParam, final Trace pTrace, final String pId);
  
  @Override
  public void process(final Trace2paramMatch match) {
    process(match.getParam(), match.getTrace(), match.getId());
  }
}
