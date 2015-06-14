package org.eclipse.incquery.viewmodel.traceability.patterns.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.TraceMatch;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.traceability.patterns.trace pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TraceProcessor implements IMatchProcessor<TraceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSource the value of pattern parameter source in the currently processed match
   * @param pId the value of pattern parameter id in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * @param pTrace the value of pattern parameter trace in the currently processed match
   * @param pTraceabilityId the value of pattern parameter traceabilityId in the currently processed match
   * 
   */
  public abstract void process(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId);
  
  @Override
  public void process(final TraceMatch match) {
    process(match.getSource(), match.getId(), match.getTarget(), match.getTrace(), match.getTraceabilityId());
  }
}
