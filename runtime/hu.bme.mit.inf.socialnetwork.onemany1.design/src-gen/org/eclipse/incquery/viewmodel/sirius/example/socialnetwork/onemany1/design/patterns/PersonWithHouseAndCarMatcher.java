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
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.PersonWithHouseAndCarMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util.PersonWithHouseAndCarQuerySpecification;
import socialnetwork_base.Person;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.personWithHouseAndCar pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PersonWithHouseAndCarMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern personWithHouseAndCar(person : Person) {
 * 	SocialNetwork.members(_, person);
 * 	
 * 	Person.address(person, address);
 * 	Person.licensePlateNumber(person, lpn);
 * 	
 * 	false == eval (address.isEmpty());
 * 	false == eval (lpn.isEmpty());
 * }
 * </pre></code>
 * 
 * @see PersonWithHouseAndCarMatch
 * @see PersonWithHouseAndCarProcessor
 * @see PersonWithHouseAndCarQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PersonWithHouseAndCarMatcher extends BaseMatcher<PersonWithHouseAndCarMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PersonWithHouseAndCarMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PersonWithHouseAndCarMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PersonWithHouseAndCarMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PERSON = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PersonWithHouseAndCarMatcher.class);
  
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
  public PersonWithHouseAndCarMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public PersonWithHouseAndCarMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return matches represented as a PersonWithHouseAndCarMatch object.
   * 
   */
  public Collection<PersonWithHouseAndCarMatch> getAllMatches(final Person pPerson) {
    return rawGetAllMatches(new Object[]{pPerson});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return a match represented as a PersonWithHouseAndCarMatch object, or null if no match is found.
   * 
   */
  public PersonWithHouseAndCarMatch getOneArbitraryMatch(final Person pPerson) {
    return rawGetOneArbitraryMatch(new Object[]{pPerson});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Person pPerson) {
    return rawHasMatch(new Object[]{pPerson});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Person pPerson) {
    return rawCountMatches(new Object[]{pPerson});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Person pPerson, final IMatchProcessor<? super PersonWithHouseAndCarMatch> processor) {
    rawForEachMatch(new Object[]{pPerson}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Person pPerson, final IMatchProcessor<? super PersonWithHouseAndCarMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPerson}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PersonWithHouseAndCarMatch newMatch(final Person pPerson) {
    return PersonWithHouseAndCarMatch.newMatch(pPerson);
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
  
  @Override
  protected PersonWithHouseAndCarMatch tupleToMatch(final Tuple t) {
    try {
    	return PersonWithHouseAndCarMatch.newMatch((socialnetwork_base.Person) t.get(POSITION_PERSON));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PersonWithHouseAndCarMatch arrayToMatch(final Object[] match) {
    try {
    	return PersonWithHouseAndCarMatch.newMatch((socialnetwork_base.Person) match[POSITION_PERSON]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PersonWithHouseAndCarMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return PersonWithHouseAndCarMatch.newMutableMatch((socialnetwork_base.Person) match[POSITION_PERSON]);
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
  public static IQuerySpecification<PersonWithHouseAndCarMatcher> querySpecification() throws IncQueryException {
    return PersonWithHouseAndCarQuerySpecification.instance();
  }
}
