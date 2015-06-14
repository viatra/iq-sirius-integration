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
import org.eclipse.incquery.viewmodel.traceability.patterns.TraceMatch;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.TraceQuerySpecification;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.viewmodel.traceability.patterns.trace pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TraceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern trace(source, id, target, trace, traceabilityId) {
 * 	Trace.params(trace, source);
 * 	Trace.targets(trace, target);
 * 	Trace.id(trace,id);
 * 	Traceability.id(traceability,traceabilityId);
 * 	Traceability.traces(traceability,trace);
 * } or {
 * 	Trace.objects(trace, source);
 * 	Trace.targets(trace, target);
 * 	Trace.id(trace,id);
 * 	Traceability.id(traceability,traceabilityId);
 * 	Traceability.traces(traceability,trace);
 * }
 * </pre></code>
 * 
 * @see TraceMatch
 * @see TraceProcessor
 * @see TraceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TraceMatcher extends BaseMatcher<TraceMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TraceMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    TraceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new TraceMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SOURCE = 0;
  
  private final static int POSITION_ID = 1;
  
  private final static int POSITION_TARGET = 2;
  
  private final static int POSITION_TRACE = 3;
  
  private final static int POSITION_TRACEABILITYID = 4;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(TraceMatcher.class);
  
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
  public TraceMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public TraceMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pTraceabilityId the fixed value of pattern parameter traceabilityId, or null if not bound.
   * @return matches represented as a TraceMatch object.
   * 
   */
  public Collection<TraceMatch> getAllMatches(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
    return rawGetAllMatches(new Object[]{pSource, pId, pTarget, pTrace, pTraceabilityId});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pTraceabilityId the fixed value of pattern parameter traceabilityId, or null if not bound.
   * @return a match represented as a TraceMatch object, or null if no match is found.
   * 
   */
  public TraceMatch getOneArbitraryMatch(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
    return rawGetOneArbitraryMatch(new Object[]{pSource, pId, pTarget, pTrace, pTraceabilityId});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pTraceabilityId the fixed value of pattern parameter traceabilityId, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
    return rawHasMatch(new Object[]{pSource, pId, pTarget, pTrace, pTraceabilityId});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pTraceabilityId the fixed value of pattern parameter traceabilityId, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
    return rawCountMatches(new Object[]{pSource, pId, pTarget, pTrace, pTraceabilityId});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pTraceabilityId the fixed value of pattern parameter traceabilityId, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId, final IMatchProcessor<? super TraceMatch> processor) {
    rawForEachMatch(new Object[]{pSource, pId, pTarget, pTrace, pTraceabilityId}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pTraceabilityId the fixed value of pattern parameter traceabilityId, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId, final IMatchProcessor<? super TraceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSource, pId, pTarget, pTrace, pTraceabilityId}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pTraceabilityId the fixed value of pattern parameter traceabilityId, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TraceMatch newMatch(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
    return TraceMatch.newMatch(pSource, pId, pTarget, pTrace, pTraceabilityId);
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfsource(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_SOURCE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfsource() {
    return rawAccumulateAllValuesOfsource(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfsource(final TraceMatch partialMatch) {
    return rawAccumulateAllValuesOfsource(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfsource(final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
    return rawAccumulateAllValuesOfsource(new Object[]{
    null, 
    pId, 
    pTarget, 
    pTrace, 
    pTraceabilityId
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
  public Set<String> getAllValuesOfid(final TraceMatch partialMatch) {
    return rawAccumulateAllValuesOfid(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfid(final Object pSource, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
    return rawAccumulateAllValuesOfid(new Object[]{
    pSource, 
    null, 
    pTarget, 
    pTrace, 
    pTraceabilityId
    });
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
  public Set<EObject> getAllValuesOftarget(final TraceMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOftarget(final Object pSource, final String pId, final Trace pTrace, final String pTraceabilityId) {
    return rawAccumulateAllValuesOftarget(new Object[]{
    pSource, 
    pId, 
    null, 
    pTrace, 
    pTraceabilityId
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
  public Set<Trace> getAllValuesOftrace(final TraceMatch partialMatch) {
    return rawAccumulateAllValuesOftrace(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Trace> getAllValuesOftrace(final Object pSource, final String pId, final EObject pTarget, final String pTraceabilityId) {
    return rawAccumulateAllValuesOftrace(new Object[]{
    pSource, 
    pId, 
    pTarget, 
    null, 
    pTraceabilityId
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for traceabilityId.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOftraceabilityId(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_TRACEABILITYID, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for traceabilityId.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOftraceabilityId() {
    return rawAccumulateAllValuesOftraceabilityId(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for traceabilityId.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOftraceabilityId(final TraceMatch partialMatch) {
    return rawAccumulateAllValuesOftraceabilityId(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for traceabilityId.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOftraceabilityId(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace) {
    return rawAccumulateAllValuesOftraceabilityId(new Object[]{
    pSource, 
    pId, 
    pTarget, 
    pTrace, 
    null
    });
  }
  
  @Override
  protected TraceMatch tupleToMatch(final Tuple t) {
    try {
    	return TraceMatch.newMatch((java.lang.Object) t.get(POSITION_SOURCE), (java.lang.String) t.get(POSITION_ID), (org.eclipse.emf.ecore.EObject) t.get(POSITION_TARGET), (org.eclipse.incquery.viewmodel.traceability.Trace) t.get(POSITION_TRACE), (java.lang.String) t.get(POSITION_TRACEABILITYID));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TraceMatch arrayToMatch(final Object[] match) {
    try {
    	return TraceMatch.newMatch((java.lang.Object) match[POSITION_SOURCE], (java.lang.String) match[POSITION_ID], (org.eclipse.emf.ecore.EObject) match[POSITION_TARGET], (org.eclipse.incquery.viewmodel.traceability.Trace) match[POSITION_TRACE], (java.lang.String) match[POSITION_TRACEABILITYID]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TraceMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return TraceMatch.newMutableMatch((java.lang.Object) match[POSITION_SOURCE], (java.lang.String) match[POSITION_ID], (org.eclipse.emf.ecore.EObject) match[POSITION_TARGET], (org.eclipse.incquery.viewmodel.traceability.Trace) match[POSITION_TRACE], (java.lang.String) match[POSITION_TRACEABILITYID]);
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
  public static IQuerySpecification<TraceMatcher> querySpecification() throws IncQueryException {
    return TraceQuerySpecification.instance();
  }
}
