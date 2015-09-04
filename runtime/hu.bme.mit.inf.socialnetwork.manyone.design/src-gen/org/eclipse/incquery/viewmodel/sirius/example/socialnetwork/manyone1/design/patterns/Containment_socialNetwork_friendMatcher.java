package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns;

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
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.Containment_socialNetwork_friendMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.Containment_socialNetwork_friendQuerySpecification;
import socialnetwork_base.Man;
import socialnetwork_base.SocialNetwork;
import socialnetwork_base.Woman;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.containment_socialNetwork_friend pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Containment_socialNetwork_friendMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern containment_socialNetwork_friend(sn : SocialNetwork, f1 : Man, m1 : Woman, f2 : Man, m2 : Woman) {
 * 	find socialNetwork(sn);
 * 	find friend(f1, m1, f2, m2);
 * }
 * </pre></code>
 * 
 * @see Containment_socialNetwork_friendMatch
 * @see Containment_socialNetwork_friendProcessor
 * @see Containment_socialNetwork_friendQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Containment_socialNetwork_friendMatcher extends BaseMatcher<Containment_socialNetwork_friendMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Containment_socialNetwork_friendMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Containment_socialNetwork_friendMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Containment_socialNetwork_friendMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SN = 0;
  
  private final static int POSITION_F1 = 1;
  
  private final static int POSITION_M1 = 2;
  
  private final static int POSITION_F2 = 3;
  
  private final static int POSITION_M2 = 4;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Containment_socialNetwork_friendMatcher.class);
  
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
  public Containment_socialNetwork_friendMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Containment_socialNetwork_friendMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pF1 the fixed value of pattern parameter f1, or null if not bound.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pF2 the fixed value of pattern parameter f2, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @return matches represented as a Containment_socialNetwork_friendMatch object.
   * 
   */
  public Collection<Containment_socialNetwork_friendMatch> getAllMatches(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
    return rawGetAllMatches(new Object[]{pSn, pF1, pM1, pF2, pM2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pF1 the fixed value of pattern parameter f1, or null if not bound.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pF2 the fixed value of pattern parameter f2, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @return a match represented as a Containment_socialNetwork_friendMatch object, or null if no match is found.
   * 
   */
  public Containment_socialNetwork_friendMatch getOneArbitraryMatch(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
    return rawGetOneArbitraryMatch(new Object[]{pSn, pF1, pM1, pF2, pM2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pF1 the fixed value of pattern parameter f1, or null if not bound.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pF2 the fixed value of pattern parameter f2, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
    return rawHasMatch(new Object[]{pSn, pF1, pM1, pF2, pM2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pF1 the fixed value of pattern parameter f1, or null if not bound.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pF2 the fixed value of pattern parameter f2, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
    return rawCountMatches(new Object[]{pSn, pF1, pM1, pF2, pM2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pF1 the fixed value of pattern parameter f1, or null if not bound.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pF2 the fixed value of pattern parameter f2, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2, final IMatchProcessor<? super Containment_socialNetwork_friendMatch> processor) {
    rawForEachMatch(new Object[]{pSn, pF1, pM1, pF2, pM2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pF1 the fixed value of pattern parameter f1, or null if not bound.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pF2 the fixed value of pattern parameter f2, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2, final IMatchProcessor<? super Containment_socialNetwork_friendMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSn, pF1, pM1, pF2, pM2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pF1 the fixed value of pattern parameter f1, or null if not bound.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pF2 the fixed value of pattern parameter f2, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Containment_socialNetwork_friendMatch newMatch(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
    return Containment_socialNetwork_friendMatch.newMatch(pSn, pF1, pM1, pF2, pM2);
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
  public Set<SocialNetwork> getAllValuesOfsn(final Containment_socialNetwork_friendMatch partialMatch) {
    return rawAccumulateAllValuesOfsn(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sn.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SocialNetwork> getAllValuesOfsn(final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
    return rawAccumulateAllValuesOfsn(new Object[]{
    null, 
    pF1, 
    pM1, 
    pF2, 
    pM2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for f1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Man> rawAccumulateAllValuesOff1(final Object[] parameters) {
    Set<Man> results = new HashSet<Man>();
    rawAccumulateAllValues(POSITION_F1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for f1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOff1() {
    return rawAccumulateAllValuesOff1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for f1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOff1(final Containment_socialNetwork_friendMatch partialMatch) {
    return rawAccumulateAllValuesOff1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for f1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOff1(final SocialNetwork pSn, final Woman pM1, final Man pF2, final Woman pM2) {
    return rawAccumulateAllValuesOff1(new Object[]{
    pSn, 
    null, 
    pM1, 
    pF2, 
    pM2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for m1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Woman> rawAccumulateAllValuesOfm1(final Object[] parameters) {
    Set<Woman> results = new HashSet<Woman>();
    rawAccumulateAllValues(POSITION_M1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for m1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfm1() {
    return rawAccumulateAllValuesOfm1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfm1(final Containment_socialNetwork_friendMatch partialMatch) {
    return rawAccumulateAllValuesOfm1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfm1(final SocialNetwork pSn, final Man pF1, final Man pF2, final Woman pM2) {
    return rawAccumulateAllValuesOfm1(new Object[]{
    pSn, 
    pF1, 
    null, 
    pF2, 
    pM2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for f2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Man> rawAccumulateAllValuesOff2(final Object[] parameters) {
    Set<Man> results = new HashSet<Man>();
    rawAccumulateAllValues(POSITION_F2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for f2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOff2() {
    return rawAccumulateAllValuesOff2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for f2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOff2(final Containment_socialNetwork_friendMatch partialMatch) {
    return rawAccumulateAllValuesOff2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for f2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOff2(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Woman pM2) {
    return rawAccumulateAllValuesOff2(new Object[]{
    pSn, 
    pF1, 
    pM1, 
    null, 
    pM2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for m2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Woman> rawAccumulateAllValuesOfm2(final Object[] parameters) {
    Set<Woman> results = new HashSet<Woman>();
    rawAccumulateAllValues(POSITION_M2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for m2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfm2() {
    return rawAccumulateAllValuesOfm2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfm2(final Containment_socialNetwork_friendMatch partialMatch) {
    return rawAccumulateAllValuesOfm2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfm2(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2) {
    return rawAccumulateAllValuesOfm2(new Object[]{
    pSn, 
    pF1, 
    pM1, 
    pF2, 
    null
    });
  }
  
  @Override
  protected Containment_socialNetwork_friendMatch tupleToMatch(final Tuple t) {
    try {
    	return Containment_socialNetwork_friendMatch.newMatch((socialnetwork_base.SocialNetwork) t.get(POSITION_SN), (socialnetwork_base.Man) t.get(POSITION_F1), (socialnetwork_base.Woman) t.get(POSITION_M1), (socialnetwork_base.Man) t.get(POSITION_F2), (socialnetwork_base.Woman) t.get(POSITION_M2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Containment_socialNetwork_friendMatch arrayToMatch(final Object[] match) {
    try {
    	return Containment_socialNetwork_friendMatch.newMatch((socialnetwork_base.SocialNetwork) match[POSITION_SN], (socialnetwork_base.Man) match[POSITION_F1], (socialnetwork_base.Woman) match[POSITION_M1], (socialnetwork_base.Man) match[POSITION_F2], (socialnetwork_base.Woman) match[POSITION_M2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Containment_socialNetwork_friendMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Containment_socialNetwork_friendMatch.newMutableMatch((socialnetwork_base.SocialNetwork) match[POSITION_SN], (socialnetwork_base.Man) match[POSITION_F1], (socialnetwork_base.Woman) match[POSITION_M1], (socialnetwork_base.Man) match[POSITION_F2], (socialnetwork_base.Woman) match[POSITION_M2]);
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
  public static IQuerySpecification<Containment_socialNetwork_friendMatcher> querySpecification() throws IncQueryException {
    return Containment_socialNetwork_friendQuerySpecification.instance();
  }
}
