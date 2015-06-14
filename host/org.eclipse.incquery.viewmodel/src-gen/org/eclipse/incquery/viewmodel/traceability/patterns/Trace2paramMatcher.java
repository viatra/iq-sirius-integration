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
import org.eclipse.incquery.viewmodel.traceability.patterns.Trace2paramMatch;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.Trace2paramQuerySpecification;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.viewmodel.traceability.patterns.trace2param pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Trace2paramMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern trace2param(param, trace, id) {
 * 	Trace.params(trace, param);
 * 	Trace.id(trace, id);
 * }
 * </pre></code>
 * 
 * @see Trace2paramMatch
 * @see Trace2paramProcessor
 * @see Trace2paramQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Trace2paramMatcher extends BaseMatcher<Trace2paramMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Trace2paramMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Trace2paramMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Trace2paramMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PARAM = 0;
  
  private final static int POSITION_TRACE = 1;
  
  private final static int POSITION_ID = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Trace2paramMatcher.class);
  
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
  public Trace2paramMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Trace2paramMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return matches represented as a Trace2paramMatch object.
   * 
   */
  public Collection<Trace2paramMatch> getAllMatches(final EObject pParam, final Trace pTrace, final String pId) {
    return rawGetAllMatches(new Object[]{pParam, pTrace, pId});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return a match represented as a Trace2paramMatch object, or null if no match is found.
   * 
   */
  public Trace2paramMatch getOneArbitraryMatch(final EObject pParam, final Trace pTrace, final String pId) {
    return rawGetOneArbitraryMatch(new Object[]{pParam, pTrace, pId});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EObject pParam, final Trace pTrace, final String pId) {
    return rawHasMatch(new Object[]{pParam, pTrace, pId});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EObject pParam, final Trace pTrace, final String pId) {
    return rawCountMatches(new Object[]{pParam, pTrace, pId});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EObject pParam, final Trace pTrace, final String pId, final IMatchProcessor<? super Trace2paramMatch> processor) {
    rawForEachMatch(new Object[]{pParam, pTrace, pId}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EObject pParam, final Trace pTrace, final String pId, final IMatchProcessor<? super Trace2paramMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pParam, pTrace, pId}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Trace2paramMatch newMatch(final EObject pParam, final Trace pTrace, final String pId) {
    return Trace2paramMatch.newMatch(pParam, pTrace, pId);
  }
  
  /**
   * Retrieve the set of values that occur in matches for param.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfparam(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_PARAM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for param.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfparam() {
    return rawAccumulateAllValuesOfparam(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for param.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfparam(final Trace2paramMatch partialMatch) {
    return rawAccumulateAllValuesOfparam(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for param.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfparam(final Trace pTrace, final String pId) {
    return rawAccumulateAllValuesOfparam(new Object[]{
    null, 
    pTrace, 
    pId
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
  public Set<Trace> getAllValuesOftrace(final Trace2paramMatch partialMatch) {
    return rawAccumulateAllValuesOftrace(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Trace> getAllValuesOftrace(final EObject pParam, final String pId) {
    return rawAccumulateAllValuesOftrace(new Object[]{
    pParam, 
    null, 
    pId
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfid(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_ID, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfid() {
    return rawAccumulateAllValuesOfid(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfid(final Trace2paramMatch partialMatch) {
    return rawAccumulateAllValuesOfid(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfid(final EObject pParam, final Trace pTrace) {
    return rawAccumulateAllValuesOfid(new Object[]{
    pParam, 
    pTrace, 
    null
    });
  }
  
  @Override
  protected Trace2paramMatch tupleToMatch(final Tuple t) {
    try {
    	return Trace2paramMatch.newMatch((org.eclipse.emf.ecore.EObject) t.get(POSITION_PARAM), (org.eclipse.incquery.viewmodel.traceability.Trace) t.get(POSITION_TRACE), (java.lang.String) t.get(POSITION_ID));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Trace2paramMatch arrayToMatch(final Object[] match) {
    try {
    	return Trace2paramMatch.newMatch((org.eclipse.emf.ecore.EObject) match[POSITION_PARAM], (org.eclipse.incquery.viewmodel.traceability.Trace) match[POSITION_TRACE], (java.lang.String) match[POSITION_ID]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Trace2paramMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Trace2paramMatch.newMutableMatch((org.eclipse.emf.ecore.EObject) match[POSITION_PARAM], (org.eclipse.incquery.viewmodel.traceability.Trace) match[POSITION_TRACE], (java.lang.String) match[POSITION_ID]);
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
  public static IQuerySpecification<Trace2paramMatcher> querySpecification() throws IncQueryException {
    return Trace2paramQuerySpecification.instance();
  }
}
