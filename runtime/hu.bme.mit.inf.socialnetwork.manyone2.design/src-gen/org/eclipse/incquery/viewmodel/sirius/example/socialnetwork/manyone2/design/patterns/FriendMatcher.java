package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns;

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
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.FriendMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util.FriendQuerySpecification;
import socialnetwork_base.Man;
import socialnetwork_base.Woman;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.friend pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link FriendMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern friend(m1 : Man, w1 : Woman, m2 : Man, w2 : Woman) {
 * 	find differentFamilies(m1, w1, m2, w2);
 * 
 * 	find familyMember(m1, w1, fm_1);
 * 	find familyMember(m2, w2, fm_2);
 * 
 * 	Person.friends(fm_1, fm_2);
 * 	Person.friends(fm_2, fm_1);
 * }
 * </pre></code>
 * 
 * @see FriendMatch
 * @see FriendProcessor
 * @see FriendQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class FriendMatcher extends BaseMatcher<FriendMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static FriendMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    FriendMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new FriendMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_M1 = 0;
  
  private final static int POSITION_W1 = 1;
  
  private final static int POSITION_M2 = 2;
  
  private final static int POSITION_W2 = 3;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(FriendMatcher.class);
  
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
  public FriendMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public FriendMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pW1 the fixed value of pattern parameter w1, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param pW2 the fixed value of pattern parameter w2, or null if not bound.
   * @return matches represented as a FriendMatch object.
   * 
   */
  public Collection<FriendMatch> getAllMatches(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2) {
    return rawGetAllMatches(new Object[]{pM1, pW1, pM2, pW2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pW1 the fixed value of pattern parameter w1, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param pW2 the fixed value of pattern parameter w2, or null if not bound.
   * @return a match represented as a FriendMatch object, or null if no match is found.
   * 
   */
  public FriendMatch getOneArbitraryMatch(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2) {
    return rawGetOneArbitraryMatch(new Object[]{pM1, pW1, pM2, pW2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pW1 the fixed value of pattern parameter w1, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param pW2 the fixed value of pattern parameter w2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2) {
    return rawHasMatch(new Object[]{pM1, pW1, pM2, pW2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pW1 the fixed value of pattern parameter w1, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param pW2 the fixed value of pattern parameter w2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2) {
    return rawCountMatches(new Object[]{pM1, pW1, pM2, pW2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pW1 the fixed value of pattern parameter w1, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param pW2 the fixed value of pattern parameter w2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2, final IMatchProcessor<? super FriendMatch> processor) {
    rawForEachMatch(new Object[]{pM1, pW1, pM2, pW2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pW1 the fixed value of pattern parameter w1, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param pW2 the fixed value of pattern parameter w2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2, final IMatchProcessor<? super FriendMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pM1, pW1, pM2, pW2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pW1 the fixed value of pattern parameter w1, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param pW2 the fixed value of pattern parameter w2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public FriendMatch newMatch(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2) {
    return FriendMatch.newMatch(pM1, pW1, pM2, pW2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for m1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Man> rawAccumulateAllValuesOfm1(final Object[] parameters) {
    Set<Man> results = new HashSet<Man>();
    rawAccumulateAllValues(POSITION_M1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for m1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOfm1() {
    return rawAccumulateAllValuesOfm1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOfm1(final FriendMatch partialMatch) {
    return rawAccumulateAllValuesOfm1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOfm1(final Woman pW1, final Man pM2, final Woman pW2) {
    return rawAccumulateAllValuesOfm1(new Object[]{
    null, 
    pW1, 
    pM2, 
    pW2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for w1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Woman> rawAccumulateAllValuesOfw1(final Object[] parameters) {
    Set<Woman> results = new HashSet<Woman>();
    rawAccumulateAllValues(POSITION_W1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for w1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfw1() {
    return rawAccumulateAllValuesOfw1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for w1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfw1(final FriendMatch partialMatch) {
    return rawAccumulateAllValuesOfw1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for w1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfw1(final Man pM1, final Man pM2, final Woman pW2) {
    return rawAccumulateAllValuesOfw1(new Object[]{
    pM1, 
    null, 
    pM2, 
    pW2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for m2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Man> rawAccumulateAllValuesOfm2(final Object[] parameters) {
    Set<Man> results = new HashSet<Man>();
    rawAccumulateAllValues(POSITION_M2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for m2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOfm2() {
    return rawAccumulateAllValuesOfm2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOfm2(final FriendMatch partialMatch) {
    return rawAccumulateAllValuesOfm2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOfm2(final Man pM1, final Woman pW1, final Woman pW2) {
    return rawAccumulateAllValuesOfm2(new Object[]{
    pM1, 
    pW1, 
    null, 
    pW2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for w2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Woman> rawAccumulateAllValuesOfw2(final Object[] parameters) {
    Set<Woman> results = new HashSet<Woman>();
    rawAccumulateAllValues(POSITION_W2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for w2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfw2() {
    return rawAccumulateAllValuesOfw2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for w2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfw2(final FriendMatch partialMatch) {
    return rawAccumulateAllValuesOfw2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for w2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfw2(final Man pM1, final Woman pW1, final Man pM2) {
    return rawAccumulateAllValuesOfw2(new Object[]{
    pM1, 
    pW1, 
    pM2, 
    null
    });
  }
  
  @Override
  protected FriendMatch tupleToMatch(final Tuple t) {
    try {
    	return FriendMatch.newMatch((socialnetwork_base.Man) t.get(POSITION_M1), (socialnetwork_base.Woman) t.get(POSITION_W1), (socialnetwork_base.Man) t.get(POSITION_M2), (socialnetwork_base.Woman) t.get(POSITION_W2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected FriendMatch arrayToMatch(final Object[] match) {
    try {
    	return FriendMatch.newMatch((socialnetwork_base.Man) match[POSITION_M1], (socialnetwork_base.Woman) match[POSITION_W1], (socialnetwork_base.Man) match[POSITION_M2], (socialnetwork_base.Woman) match[POSITION_W2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected FriendMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return FriendMatch.newMutableMatch((socialnetwork_base.Man) match[POSITION_M1], (socialnetwork_base.Woman) match[POSITION_W1], (socialnetwork_base.Man) match[POSITION_M2], (socialnetwork_base.Woman) match[POSITION_W2]);
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
  public static IQuerySpecification<FriendMatcher> querySpecification() throws IncQueryException {
    return FriendQuerySpecification.instance();
  }
}
