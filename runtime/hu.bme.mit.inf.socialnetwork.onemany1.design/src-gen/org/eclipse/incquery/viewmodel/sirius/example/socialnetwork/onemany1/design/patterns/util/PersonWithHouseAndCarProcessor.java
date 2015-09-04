package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.PersonWithHouseAndCarMatch;
import socialnetwork_base.Person;

/**
 * A match processor tailored for the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.personWithHouseAndCar pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PersonWithHouseAndCarProcessor implements IMatchProcessor<PersonWithHouseAndCarMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPerson the value of pattern parameter person in the currently processed match
   * 
   */
  public abstract void process(final Person pPerson);
  
  @Override
  public void process(final PersonWithHouseAndCarMatch match) {
    process(match.getPerson());
  }
}
