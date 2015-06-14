package org.eclipse.incquery.viewmodel.traceability.patterns.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.EmptyTraceMatch;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.traceability.patterns.emptyTrace pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EmptyTraceProcessor implements IMatchProcessor<EmptyTraceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTrace the value of pattern parameter trace in the currently processed match
   * 
   */
  public abstract void process(final Trace pTrace);
  
  @Override
  public void process(final EmptyTraceMatch match) {
    process(match.getTrace());
  }
}
