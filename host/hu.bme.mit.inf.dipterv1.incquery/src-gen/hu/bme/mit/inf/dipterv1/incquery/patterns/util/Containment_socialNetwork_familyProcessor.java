package hu.bme.mit.inf.dipterv1.incquery.patterns.util;

import hu.bme.mit.inf.dipterv1.incquery.patterns.Containment_socialNetwork_familyMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import socialnetwork_base.Man;
import socialnetwork_base.SocialNetwork;
import socialnetwork_base.Woman;

/**
 * A match processor tailored for the hu.bme.mit.inf.dipterv1.incquery.patterns.containment_socialNetwork_family pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Containment_socialNetwork_familyProcessor implements IMatchProcessor<Containment_socialNetwork_familyMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSn the value of pattern parameter sn in the currently processed match
   * @param pF the value of pattern parameter f in the currently processed match
   * @param pM the value of pattern parameter m in the currently processed match
   * 
   */
  public abstract void process(final SocialNetwork pSn, final Man pF, final Woman pM);
  
  @Override
  public void process(final Containment_socialNetwork_familyMatch match) {
    process(match.getSn(), match.getF(), match.getM());
  }
}
