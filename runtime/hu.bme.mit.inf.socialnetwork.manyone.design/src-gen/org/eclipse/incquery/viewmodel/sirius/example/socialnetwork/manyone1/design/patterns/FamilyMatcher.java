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
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.FamilyMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.FamilyQuerySpecification;
import socialnetwork_base.Man;
import socialnetwork_base.Woman;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.family pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link FamilyMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern family(father : Man, mother : Woman) {
 * 	SocialNetwork.members(sn, father);
 * 	SocialNetwork.members(sn, mother);
 * 	
 * 	Man.children(father, child);
 * 	Woman.children(mother, child);
 * 	
 * 	commonChildren == count find commonChild(father, mother, _);
 * 	
 * 	fatherParents == count find parent(father, _);
 * 	
 * 	motherParents == count find parent(mother, _);
 * 	
 * 	check(commonChildren {@literal >} 0);
 * 	
 * 	check(fatherParents == 0);
 * 	
 * 	check(motherParents == 0);
 * }
 * </pre></code>
 * 
 * @see FamilyMatch
 * @see FamilyProcessor
 * @see FamilyQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class FamilyMatcher extends BaseMatcher<FamilyMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static FamilyMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    FamilyMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new FamilyMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_FATHER = 0;
  
  private final static int POSITION_MOTHER = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(FamilyMatcher.class);
  
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
  public FamilyMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public FamilyMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @return matches represented as a FamilyMatch object.
   * 
   */
  public Collection<FamilyMatch> getAllMatches(final Man pFather, final Woman pMother) {
    return rawGetAllMatches(new Object[]{pFather, pMother});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @return a match represented as a FamilyMatch object, or null if no match is found.
   * 
   */
  public FamilyMatch getOneArbitraryMatch(final Man pFather, final Woman pMother) {
    return rawGetOneArbitraryMatch(new Object[]{pFather, pMother});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Man pFather, final Woman pMother) {
    return rawHasMatch(new Object[]{pFather, pMother});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Man pFather, final Woman pMother) {
    return rawCountMatches(new Object[]{pFather, pMother});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Man pFather, final Woman pMother, final IMatchProcessor<? super FamilyMatch> processor) {
    rawForEachMatch(new Object[]{pFather, pMother}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Man pFather, final Woman pMother, final IMatchProcessor<? super FamilyMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pFather, pMother}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public FamilyMatch newMatch(final Man pFather, final Woman pMother) {
    return FamilyMatch.newMatch(pFather, pMother);
  }
  
  /**
   * Retrieve the set of values that occur in matches for father.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Man> rawAccumulateAllValuesOffather(final Object[] parameters) {
    Set<Man> results = new HashSet<Man>();
    rawAccumulateAllValues(POSITION_FATHER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for father.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOffather() {
    return rawAccumulateAllValuesOffather(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for father.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOffather(final FamilyMatch partialMatch) {
    return rawAccumulateAllValuesOffather(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for father.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOffather(final Woman pMother) {
    return rawAccumulateAllValuesOffather(new Object[]{
    null, 
    pMother
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for mother.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Woman> rawAccumulateAllValuesOfmother(final Object[] parameters) {
    Set<Woman> results = new HashSet<Woman>();
    rawAccumulateAllValues(POSITION_MOTHER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for mother.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfmother() {
    return rawAccumulateAllValuesOfmother(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mother.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfmother(final FamilyMatch partialMatch) {
    return rawAccumulateAllValuesOfmother(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mother.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfmother(final Man pFather) {
    return rawAccumulateAllValuesOfmother(new Object[]{
    pFather, 
    null
    });
  }
  
  @Override
  protected FamilyMatch tupleToMatch(final Tuple t) {
    try {
    	return FamilyMatch.newMatch((socialnetwork_base.Man) t.get(POSITION_FATHER), (socialnetwork_base.Woman) t.get(POSITION_MOTHER));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected FamilyMatch arrayToMatch(final Object[] match) {
    try {
    	return FamilyMatch.newMatch((socialnetwork_base.Man) match[POSITION_FATHER], (socialnetwork_base.Woman) match[POSITION_MOTHER]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected FamilyMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return FamilyMatch.newMutableMatch((socialnetwork_base.Man) match[POSITION_FATHER], (socialnetwork_base.Woman) match[POSITION_MOTHER]);
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
  public static IQuerySpecification<FamilyMatcher> querySpecification() throws IncQueryException {
    return FamilyQuerySpecification.instance();
  }
}
