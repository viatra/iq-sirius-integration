package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.Containment_socialNetwork_friendMatch;
import socialnetwork_base.Man;
import socialnetwork_base.SocialNetwork;
import socialnetwork_base.Woman;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.containment_socialNetwork_friend pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Containment_socialNetwork_friendProcessor implements IMatchProcessor<Containment_socialNetwork_friendMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSn the value of pattern parameter sn in the currently processed match
   * @param pF1 the value of pattern parameter f1 in the currently processed match
   * @param pM1 the value of pattern parameter m1 in the currently processed match
   * @param pF2 the value of pattern parameter f2 in the currently processed match
   * @param pM2 the value of pattern parameter m2 in the currently processed match
   * 
   */
  public abstract void process(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2);
  
  @Override
  public void process(final Containment_socialNetwork_friendMatch match) {
    process(match.getSn(), match.getF1(), match.getM1(), match.getF2(), match.getM2());
  }
}
