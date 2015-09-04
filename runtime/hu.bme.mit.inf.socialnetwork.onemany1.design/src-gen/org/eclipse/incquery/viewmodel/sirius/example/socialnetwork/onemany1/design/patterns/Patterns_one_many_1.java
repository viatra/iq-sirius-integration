package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.Containment_socialNetwork_personMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.PersonWithHouseAndCarMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.SocialNetworkMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util.Containment_socialNetwork_personQuerySpecification;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util.PersonWithHouseAndCarQuerySpecification;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util.SocialNetworkQuerySpecification;

/**
 * A pattern group formed of all patterns defined in patterns_one_many_1.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file patterns_one_many_1.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns, the group contains the definition of the following patterns: <ul>
 * <li>socialNetwork</li>
 * <li>containment_socialNetwork_person</li>
 * <li>personWithHouseAndCar</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Patterns_one_many_1 extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Patterns_one_many_1 instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Patterns_one_many_1();
    }
    return INSTANCE;
  }
  
  private static Patterns_one_many_1 INSTANCE;
  
  private Patterns_one_many_1() throws IncQueryException {
    querySpecifications.add(SocialNetworkQuerySpecification.instance());
    querySpecifications.add(Containment_socialNetwork_personQuerySpecification.instance());
    querySpecifications.add(PersonWithHouseAndCarQuerySpecification.instance());
  }
  
  public SocialNetworkQuerySpecification getSocialNetwork() throws IncQueryException {
    return SocialNetworkQuerySpecification.instance();
  }
  
  public SocialNetworkMatcher getSocialNetwork(final IncQueryEngine engine) throws IncQueryException {
    return SocialNetworkMatcher.on(engine);
  }
  
  public Containment_socialNetwork_personQuerySpecification getContainment_socialNetwork_person() throws IncQueryException {
    return Containment_socialNetwork_personQuerySpecification.instance();
  }
  
  public Containment_socialNetwork_personMatcher getContainment_socialNetwork_person(final IncQueryEngine engine) throws IncQueryException {
    return Containment_socialNetwork_personMatcher.on(engine);
  }
  
  public PersonWithHouseAndCarQuerySpecification getPersonWithHouseAndCar() throws IncQueryException {
    return PersonWithHouseAndCarQuerySpecification.instance();
  }
  
  public PersonWithHouseAndCarMatcher getPersonWithHouseAndCar(final IncQueryEngine engine) throws IncQueryException {
    return PersonWithHouseAndCarMatcher.on(engine);
  }
}
