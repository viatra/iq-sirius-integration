package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.Family_nameMatch;
import socialnetwork_base.Man;
import socialnetwork_base.Woman;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.family_name pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Family_nameProcessor implements IMatchProcessor<Family_nameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFather the value of pattern parameter father in the currently processed match
   * @param pMother the value of pattern parameter mother in the currently processed match
   * @param pValue the value of pattern parameter value in the currently processed match
   * 
   */
  public abstract void process(final Man pFather, final Woman pMother, final String pValue);
  
  @Override
  public void process(final Family_nameMatch match) {
    process(match.getFather(), match.getMother(), match.getValue());
  }
}
