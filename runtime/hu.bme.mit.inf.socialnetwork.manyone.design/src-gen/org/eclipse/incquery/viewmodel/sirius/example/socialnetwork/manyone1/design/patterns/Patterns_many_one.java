package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.Containment_socialNetwork_familyMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.Containment_socialNetwork_friendMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.FamilyMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.Family_nameMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.FriendMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.SocialNetworkMatcher;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.Containment_socialNetwork_familyQuerySpecification;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.Containment_socialNetwork_friendQuerySpecification;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.FamilyQuerySpecification;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.Family_nameQuerySpecification;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.FriendQuerySpecification;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.SocialNetworkQuerySpecification;

/**
 * A pattern group formed of all patterns defined in patterns_many_one.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file patterns_many_one.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns, the group contains the definition of the following patterns: <ul>
 * <li>socialNetwork</li>
 * <li>family</li>
 * <li>family_name</li>
 * <li>friend</li>
 * <li>containment_socialNetwork_family</li>
 * <li>containment_socialNetwork_friend</li>
 * <li>familyMember</li>
 * <li>descendant</li>
 * <li>commonChild</li>
 * <li>parent</li>
 * <li>differentFamilies</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Patterns_many_one extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Patterns_many_one instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Patterns_many_one();
    }
    return INSTANCE;
  }
  
  private static Patterns_many_one INSTANCE;
  
  private Patterns_many_one() throws IncQueryException {
    querySpecifications.add(SocialNetworkQuerySpecification.instance());
    querySpecifications.add(FamilyQuerySpecification.instance());
    querySpecifications.add(Family_nameQuerySpecification.instance());
    querySpecifications.add(FriendQuerySpecification.instance());
    querySpecifications.add(Containment_socialNetwork_familyQuerySpecification.instance());
    querySpecifications.add(Containment_socialNetwork_friendQuerySpecification.instance());
  }
  
  public SocialNetworkQuerySpecification getSocialNetwork() throws IncQueryException {
    return SocialNetworkQuerySpecification.instance();
  }
  
  public SocialNetworkMatcher getSocialNetwork(final IncQueryEngine engine) throws IncQueryException {
    return SocialNetworkMatcher.on(engine);
  }
  
  public FamilyQuerySpecification getFamily() throws IncQueryException {
    return FamilyQuerySpecification.instance();
  }
  
  public FamilyMatcher getFamily(final IncQueryEngine engine) throws IncQueryException {
    return FamilyMatcher.on(engine);
  }
  
  public Family_nameQuerySpecification getFamily_name() throws IncQueryException {
    return Family_nameQuerySpecification.instance();
  }
  
  public Family_nameMatcher getFamily_name(final IncQueryEngine engine) throws IncQueryException {
    return Family_nameMatcher.on(engine);
  }
  
  public FriendQuerySpecification getFriend() throws IncQueryException {
    return FriendQuerySpecification.instance();
  }
  
  public FriendMatcher getFriend(final IncQueryEngine engine) throws IncQueryException {
    return FriendMatcher.on(engine);
  }
  
  public Containment_socialNetwork_familyQuerySpecification getContainment_socialNetwork_family() throws IncQueryException {
    return Containment_socialNetwork_familyQuerySpecification.instance();
  }
  
  public Containment_socialNetwork_familyMatcher getContainment_socialNetwork_family(final IncQueryEngine engine) throws IncQueryException {
    return Containment_socialNetwork_familyMatcher.on(engine);
  }
  
  public Containment_socialNetwork_friendQuerySpecification getContainment_socialNetwork_friend() throws IncQueryException {
    return Containment_socialNetwork_friendQuerySpecification.instance();
  }
  
  public Containment_socialNetwork_friendMatcher getContainment_socialNetwork_friend(final IncQueryEngine engine) throws IncQueryException {
    return Containment_socialNetwork_friendMatcher.on(engine);
  }
}
