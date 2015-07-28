package hu.bme.mit.inf.dipterv1.incquery.patterns.util;

import hu.bme.mit.inf.dipterv1.incquery.patterns.SocialNetworkMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import socialnetwork_base.SocialNetwork;

/**
 * A match processor tailored for the hu.bme.mit.inf.dipterv1.incquery.patterns.socialNetwork pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SocialNetworkProcessor implements IMatchProcessor<SocialNetworkMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSn the value of pattern parameter sn in the currently processed match
   * 
   */
  public abstract void process(final SocialNetwork pSn);
  
  @Override
  public void process(final SocialNetworkMatch match) {
    process(match.getSn());
  }
}
