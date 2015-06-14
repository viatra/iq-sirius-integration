package org.eclipse.incquery.viewmodel.traceability.patterns;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.Trace2targetMatch;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.Trace2targetQuerySpecification;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.viewmodel.traceability.patterns.trace2target pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Trace2targetMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern trace2target(target, trace : Trace) {
 * 	Trace.targets(trace, target);
 * }
 * </pre></code>
 * 
 * @see Trace2targetMatch
 * @see Trace2targetProcessor
 * @see Trace2targetQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Trace2targetMatcher extends BaseMatcher<Trace2targetMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Trace2targetMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Trace2targetMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Trace2targetMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TARGET = 0;
  
  private final static int POSITION_TRACE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Trace2targetMatcher.class);
  
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
  public Trace2targetMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Trace2targetMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return matches represented as a Trace2targetMatch object.
   * 
   */
  public Collection<Trace2targetMatch> getAllMatches(final EObject pTarget, final Trace pTrace) {
    return rawGetAllMatches(new Object[]{pTarget, pTrace});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return a match represented as a Trace2targetMatch object, or null if no match is found.
   * 
   */
  public Trace2targetMatch getOneArbitraryMatch(final EObject pTarget, final Trace pTrace) {
    return rawGetOneArbitraryMatch(new Object[]{pTarget, pTrace});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EObject pTarget, final Trace pTrace) {
    return rawHasMatch(new Object[]{pTarget, pTrace});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EObject pTarget, final Trace pTrace) {
    return rawCountMatches(new Object[]{pTarget, pTrace});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EObject pTarget, final Trace pTrace, final IMatchProcessor<? super Trace2targetMatch> processor) {
    rawForEachMatch(new Object[]{pTarget, pTrace}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EObject pTarget, final Trace pTrace, final IMatchProcessor<? super Trace2targetMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTarget, pTrace}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Trace2targetMatch newMatch(final EObject pTarget, final Trace pTrace) {
    return Trace2targetMatch.newMatch(pTarget, pTrace);
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOftarget(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_TARGET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOftarget() {
    return rawAccumulateAllValuesOftarget(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOftarget(final Trace2targetMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOftarget(final Trace pTrace) {
    return rawAccumulateAllValuesOftarget(new Object[]{
    null, 
    pTrace
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Trace> rawAccumulateAllValuesOftrace(final Object[] parameters) {
    Set<Trace> results = new HashSet<Trace>();
    rawAccumulateAllValues(POSITION_TRACE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Trace> getAllValuesOftrace() {
    return rawAccumulateAllValuesOftrace(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Trace> getAllValuesOftrace(final Trace2targetMatch partialMatch) {
    return rawAccumulateAllValuesOftrace(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Trace> getAllValuesOftrace(final EObject pTarget) {
    return rawAccumulateAllValuesOftrace(new Object[]{
    pTarget, 
    null
    });
  }
  
  @Override
  protected Trace2targetMatch tupleToMatch(final Tuple t) {
    try {
    	return Trace2targetMatch.newMatch((org.eclipse.emf.ecore.EObject) t.get(POSITION_TARGET), (org.eclipse.incquery.viewmodel.traceability.Trace) t.get(POSITION_TRACE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Trace2targetMatch arrayToMatch(final Object[] match) {
    try {
    	return Trace2targetMatch.newMatch((org.eclipse.emf.ecore.EObject) match[POSITION_TARGET], (org.eclipse.incquery.viewmodel.traceability.Trace) match[POSITION_TRACE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Trace2targetMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Trace2targetMatch.newMutableMatch((org.eclipse.emf.ecore.EObject) match[POSITION_TARGET], (org.eclipse.incquery.viewmodel.traceability.Trace) match[POSITION_TRACE]);
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
  public static IQuerySpecification<Trace2targetMatcher> querySpecification() throws IncQueryException {
    return Trace2targetQuerySpecification.instance();
  }
}
