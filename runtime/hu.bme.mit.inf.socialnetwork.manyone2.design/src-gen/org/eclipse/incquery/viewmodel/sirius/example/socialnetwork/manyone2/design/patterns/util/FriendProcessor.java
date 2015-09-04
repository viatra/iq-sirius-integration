package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.FriendMatch;
import socialnetwork_base.Man;
import socialnetwork_base.Woman;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.friend pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class FriendProcessor implements IMatchProcessor<FriendMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pM1 the value of pattern parameter m1 in the currently processed match
   * @param pW1 the value of pattern parameter w1 in the currently processed match
   * @param pM2 the value of pattern parameter m2 in the currently processed match
   * @param pW2 the value of pattern parameter w2 in the currently processed match
   * 
   */
  public abstract void process(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2);
  
  @Override
  public void process(final FriendMatch match) {
    process(match.getM1(), match.getW1(), match.getM2(), match.getW2());
  }
}
