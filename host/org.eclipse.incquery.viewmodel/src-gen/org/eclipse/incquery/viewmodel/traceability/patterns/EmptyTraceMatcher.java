package org.eclipse.incquery.viewmodel.traceability.patterns;

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
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.EmptyTraceMatch;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.EmptyTraceQuerySpecification;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.viewmodel.traceability.patterns.emptyTrace pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EmptyTraceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern emptyTrace(trace) {
 * 	Trace(trace);
 * 	neg find traceTargets(trace,_);
 * }
 * </pre></code>
 * 
 * @see EmptyTraceMatch
 * @see EmptyTraceProcessor
 * @see EmptyTraceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EmptyTraceMatcher extends BaseMatcher<EmptyTraceMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EmptyTraceMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EmptyTraceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EmptyTraceMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TRACE = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(EmptyTraceMatcher.class);
  
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
  public EmptyTraceMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EmptyTraceMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return matches represented as a EmptyTraceMatch object.
   * 
   */
  public Collection<EmptyTraceMatch> getAllMatches(final Trace pTrace) {
    return rawGetAllMatches(new Object[]{pTrace});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return a match represented as a EmptyTraceMatch object, or null if no match is found.
   * 
   */
  public EmptyTraceMatch getOneArbitraryMatch(final Trace pTrace) {
    return rawGetOneArbitraryMatch(new Object[]{pTrace});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Trace pTrace) {
    return rawHasMatch(new Object[]{pTrace});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Trace pTrace) {
    return rawCountMatches(new Object[]{pTrace});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Trace pTrace, final IMatchProcessor<? super EmptyTraceMatch> processor) {
    rawForEachMatch(new Object[]{pTrace}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Trace pTrace, final IMatchProcessor<? super EmptyTraceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTrace}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EmptyTraceMatch newMatch(final Trace pTrace) {
    return EmptyTraceMatch.newMatch(pTrace);
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
  
  @Override
  protected EmptyTraceMatch tupleToMatch(final Tuple t) {
    try {
    	return EmptyTraceMatch.newMatch((org.eclipse.incquery.viewmodel.traceability.Trace) t.get(POSITION_TRACE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EmptyTraceMatch arrayToMatch(final Object[] match) {
    try {
    	return EmptyTraceMatch.newMatch((org.eclipse.incquery.viewmodel.traceability.Trace) match[POSITION_TRACE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EmptyTraceMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EmptyTraceMatch.newMutableMatch((org.eclipse.incquery.viewmodel.traceability.Trace) match[POSITION_TRACE]);
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
  public static IQuerySpecification<EmptyTraceMatcher> querySpecification() throws IncQueryException {
    return EmptyTraceQuerySpecification.instance();
  }
}
