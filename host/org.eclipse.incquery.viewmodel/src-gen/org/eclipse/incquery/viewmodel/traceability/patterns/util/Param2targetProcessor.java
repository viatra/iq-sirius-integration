package org.eclipse.incquery.viewmodel.traceability.patterns.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.traceability.patterns.Param2targetMatch;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.traceability.patterns.param2target pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Param2targetProcessor implements IMatchProcessor<Param2targetMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pParam the value of pattern parameter param in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final EObject pParam, final EObject pTarget);
  
  @Override
  public void process(final Param2targetMatch match) {
    process(match.getParam(), match.getTarget());
  }
}
