package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.FamilyMatch;
import socialnetwork_base.Man;
import socialnetwork_base.Woman;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.family pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class FamilyProcessor implements IMatchProcessor<FamilyMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFather the value of pattern parameter father in the currently processed match
   * @param pMother the value of pattern parameter mother in the currently processed match
   * 
   */
  public abstract void process(final Man pFather, final Woman pMother);
  
  @Override
  public void process(final FamilyMatch match) {
    process(match.getFather(), match.getMother());
  }
}
