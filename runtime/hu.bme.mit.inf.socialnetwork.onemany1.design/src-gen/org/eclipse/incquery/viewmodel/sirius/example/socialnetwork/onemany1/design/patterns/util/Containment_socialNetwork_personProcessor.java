package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.Containment_socialNetwork_personMatch;
import socialnetwork_base.Person;
import socialnetwork_base.SocialNetwork;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.containment_socialNetwork_person pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Containment_socialNetwork_personProcessor implements IMatchProcessor<Containment_socialNetwork_personMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSn the value of pattern parameter sn in the currently processed match
   * @param pPerson the value of pattern parameter person in the currently processed match
   * 
   */
  public abstract void process(final SocialNetwork pSn, final Person pPerson);
  
  @Override
  public void process(final Containment_socialNetwork_personMatch match) {
    process(match.getSn(), match.getPerson());
  }
}
