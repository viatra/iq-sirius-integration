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
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.Family_nameMatch;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.util.Family_nameQuerySpecification;
import socialnetwork_base.Man;
import socialnetwork_base.Woman;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone1.design.patterns.family_name pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Family_nameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern family_name(father : Man, mother : Woman, value) {
 * 	Person.lastName(father, fLastName);
 * 	Person.lastName(mother, mLastName);
 * 	
 * 	find family(father, mother);
 * 	
 * 	value == eval(fLastName + "&" + mLastName);
 * }
 * </pre></code>
 * 
 * @see Family_nameMatch
 * @see Family_nameProcessor
 * @see Family_nameQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Family_nameMatcher extends BaseMatcher<Family_nameMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Family_nameMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Family_nameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Family_nameMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_FATHER = 0;
  
  private final static int POSITION_MOTHER = 1;
  
  private final static int POSITION_VALUE = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Family_nameMatcher.class);
  
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
  public Family_nameMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Family_nameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return matches represented as a Family_nameMatch object.
   * 
   */
  public Collection<Family_nameMatch> getAllMatches(final Man pFather, final Woman pMother, final String pValue) {
    return rawGetAllMatches(new Object[]{pFather, pMother, pValue});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return a match represented as a Family_nameMatch object, or null if no match is found.
   * 
   */
  public Family_nameMatch getOneArbitraryMatch(final Man pFather, final Woman pMother, final String pValue) {
    return rawGetOneArbitraryMatch(new Object[]{pFather, pMother, pValue});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Man pFather, final Woman pMother, final String pValue) {
    return rawHasMatch(new Object[]{pFather, pMother, pValue});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Man pFather, final Woman pMother, final String pValue) {
    return rawCountMatches(new Object[]{pFather, pMother, pValue});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Man pFather, final Woman pMother, final String pValue, final IMatchProcessor<? super Family_nameMatch> processor) {
    rawForEachMatch(new Object[]{pFather, pMother, pValue}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Man pFather, final Woman pMother, final String pValue, final IMatchProcessor<? super Family_nameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pFather, pMother, pValue}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Family_nameMatch newMatch(final Man pFather, final Woman pMother, final String pValue) {
    return Family_nameMatch.newMatch(pFather, pMother, pValue);
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
  public Set<Man> getAllValuesOffather(final Family_nameMatch partialMatch) {
    return rawAccumulateAllValuesOffather(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for father.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Man> getAllValuesOffather(final Woman pMother, final String pValue) {
    return rawAccumulateAllValuesOffather(new Object[]{
    null, 
    pMother, 
    pValue
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
  public Set<Woman> getAllValuesOfmother(final Family_nameMatch partialMatch) {
    return rawAccumulateAllValuesOfmother(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mother.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Woman> getAllValuesOfmother(final Man pFather, final String pValue) {
    return rawAccumulateAllValuesOfmother(new Object[]{
    pFather, 
    null, 
    pValue
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfvalue(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_VALUE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfvalue() {
    return rawAccumulateAllValuesOfvalue(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfvalue(final Family_nameMatch partialMatch) {
    return rawAccumulateAllValuesOfvalue(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfvalue(final Man pFather, final Woman pMother) {
    return rawAccumulateAllValuesOfvalue(new Object[]{
    pFather, 
    pMother, 
    null
    });
  }
  
  @Override
  protected Family_nameMatch tupleToMatch(final Tuple t) {
    try {
    	return Family_nameMatch.newMatch((socialnetwork_base.Man) t.get(POSITION_FATHER), (socialnetwork_base.Woman) t.get(POSITION_MOTHER), (java.lang.String) t.get(POSITION_VALUE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Family_nameMatch arrayToMatch(final Object[] match) {
    try {
    	return Family_nameMatch.newMatch((socialnetwork_base.Man) match[POSITION_FATHER], (socialnetwork_base.Woman) match[POSITION_MOTHER], (java.lang.String) match[POSITION_VALUE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Family_nameMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Family_nameMatch.newMutableMatch((socialnetwork_base.Man) match[POSITION_FATHER], (socialnetwork_base.Woman) match[POSITION_MOTHER], (java.lang.String) match[POSITION_VALUE]);
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
  public static IQuerySpecification<Family_nameMatcher> querySpecification() throws IncQueryException {
    return Family_nameQuerySpecification.instance();
  }
}
