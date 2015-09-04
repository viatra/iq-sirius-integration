package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.Containment_socialNetwork_personMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util.Containment_socialNetwork_personQuerySpecification;
import socialnetwork_base.Person;
import socialnetwork_base.SocialNetwork;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.containment_socialNetwork_person pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Containment_socialNetwork_personMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern containment_socialNetwork_person(sn : SocialNetwork, person : Person) {
 * 	SocialNetwork(sn);
 * 	find personWithHouseAndCar(person);
 * }
 * </pre></code>
 * 
 * @see Containment_socialNetwork_personMatch
 * @see Containment_socialNetwork_personProcessor
 * @see Containment_socialNetwork_personQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Containment_socialNetwork_personMatcher extends BaseMatcher<Containment_socialNetwork_personMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Containment_socialNetwork_personMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Containment_socialNetwork_personMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Containment_socialNetwork_personMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SN = 0;
  
  private final static int POSITION_PERSON = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Containment_socialNetwork_personMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public Containment_socialNetwork_personMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public Containment_socialNetwork_personMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return matches represented as a Containment_socialNetwork_personMatch object.
   * 
   */
  public Collection<Containment_socialNetwork_personMatch> getAllMatches(final SocialNetwork pSn, final Person pPerson) {
    return rawGetAllMatches(new Object[]{pSn, pPerson});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return a match represented as a Containment_socialNetwork_personMatch object, or null if no match is found.
   * 
   */
  public Containment_socialNetwork_personMatch getOneArbitraryMatch(final SocialNetwork pSn, final Person pPerson) {
    return rawGetOneArbitraryMatch(new Object[]{pSn, pPerson});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SocialNetwork pSn, final Person pPerson) {
    return rawHasMatch(new Object[]{pSn, pPerson});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SocialNetwork pSn, final Person pPerson) {
    return rawCountMatches(new Object[]{pSn, pPerson});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SocialNetwork pSn, final Person pPerson, final IMatchProcessor<? super Containment_socialNetwork_personMatch> processor) {
    rawForEachMatch(new Object[]{pSn, pPerson}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SocialNetwork pSn, final Person pPerson, final IMatchProcessor<? super Containment_socialNetwork_personMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSn, pPerson}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Containment_socialNetwork_personMatch newMatch(final SocialNetwork pSn, final Person pPerson) {
    return Containment_socialNetwork_personMatch.newMatch(pSn, pPerson);
  }
  
  /**
   * Retrieve the set of values that occur in matches for sn.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SocialNetwork> rawAccumulateAllValuesOfsn(final Object[] parameters) {
    Set<SocialNetwork> results = new HashSet<SocialNetwork>();
    rawAccumulateAllValues(POSITION_SN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sn.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SocialNetwork> getAllValuesOfsn() {
    return rawAccumulateAllValuesOfsn(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sn.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SocialNetwork> getAllValuesOfsn(final Containment_socialNetwork_personMatch partialMatch) {
    return rawAccumulateAllValuesOfsn(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sn.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SocialNetwork> getAllValuesOfsn(final Person pPerson) {
    return rawAccumulateAllValuesOfsn(new Object[]{
    null, 
    pPerson
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for person.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Person> rawAccumulateAllValuesOfperson(final Object[] parameters) {
    Set<Person> results = new HashSet<Person>();
    rawAccumulateAllValues(POSITION_PERSON, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for person.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfperson() {
    return rawAccumulateAllValuesOfperson(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for person.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfperson(final Containment_socialNetwork_personMatch partialMatch) {
    return rawAccumulateAllValuesOfperson(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for person.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfperson(final SocialNetwork pSn) {
    return rawAccumulateAllValuesOfperson(new Object[]{
    pSn, 
    null
    });
  }
  
  @Override
  protected Containment_socialNetwork_personMatch tupleToMatch(final Tuple t) {
    try {
    	return Containment_socialNetwork_personMatch.newMatch((socialnetwork_base.SocialNetwork) t.get(POSITION_SN), (socialnetwork_base.Person) t.get(POSITION_PERSON));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Containment_socialNetwork_personMatch arrayToMatch(final Object[] match) {
    try {
    	return Containment_socialNetwork_personMatch.newMatch((socialnetwork_base.SocialNetwork) match[POSITION_SN], (socialnetwork_base.Person) match[POSITION_PERSON]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Containment_socialNetwork_personMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Containment_socialNetwork_personMatch.newMutableMatch((socialnetwork_base.SocialNetwork) match[POSITION_SN], (socialnetwork_base.Person) match[POSITION_PERSON]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<Containment_socialNetwork_personMatcher> querySpecification() throws IncQueryException {
    return Containment_socialNetwork_personQuerySpecification.instance();
  }
}
