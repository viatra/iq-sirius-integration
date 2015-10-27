package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_sensor_connectedToMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_sensor_connectedToQuerySpecification;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor;
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

/**
 * Generated pattern matcher API of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_sensor_connectedTo pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Ref_sensor_connectedToMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern ref_sensor_connectedTo(sensor : Sensor, host : Host) {
 * 	find element_sensor(sensor);
 * 	find element_server(host);
 * 
 * 	Sensor.measurementTypes.measurement(sensor, measurement);
 * 	
 * 	EventCompletedTrigger.triggeredBy(ect, measurement);
 * 	ReportingEvent.trigger(re, ect);
 * 	ReportingEvent.address(re, host);
 * }
 * </pre></code>
 * 
 * @see Ref_sensor_connectedToMatch
 * @see Ref_sensor_connectedToProcessor
 * @see Ref_sensor_connectedToQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Ref_sensor_connectedToMatcher extends BaseMatcher<Ref_sensor_connectedToMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Ref_sensor_connectedToMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Ref_sensor_connectedToMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Ref_sensor_connectedToMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SENSOR = 0;
  
  private final static int POSITION_HOST = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Ref_sensor_connectedToMatcher.class);
  
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
  public Ref_sensor_connectedToMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Ref_sensor_connectedToMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return matches represented as a Ref_sensor_connectedToMatch object.
   * 
   */
  public Collection<Ref_sensor_connectedToMatch> getAllMatches(final Sensor pSensor, final Host pHost) {
    return rawGetAllMatches(new Object[]{pSensor, pHost});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return a match represented as a Ref_sensor_connectedToMatch object, or null if no match is found.
   * 
   */
  public Ref_sensor_connectedToMatch getOneArbitraryMatch(final Sensor pSensor, final Host pHost) {
    return rawGetOneArbitraryMatch(new Object[]{pSensor, pHost});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Sensor pSensor, final Host pHost) {
    return rawHasMatch(new Object[]{pSensor, pHost});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Sensor pSensor, final Host pHost) {
    return rawCountMatches(new Object[]{pSensor, pHost});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Sensor pSensor, final Host pHost, final IMatchProcessor<? super Ref_sensor_connectedToMatch> processor) {
    rawForEachMatch(new Object[]{pSensor, pHost}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Sensor pSensor, final Host pHost, final IMatchProcessor<? super Ref_sensor_connectedToMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSensor, pHost}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Ref_sensor_connectedToMatch newMatch(final Sensor pSensor, final Host pHost) {
    return Ref_sensor_connectedToMatch.newMatch(pSensor, pHost);
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Sensor> rawAccumulateAllValuesOfsensor(final Object[] parameters) {
    Set<Sensor> results = new HashSet<Sensor>();
    rawAccumulateAllValues(POSITION_SENSOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Sensor> getAllValuesOfsensor() {
    return rawAccumulateAllValuesOfsensor(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Sensor> getAllValuesOfsensor(final Ref_sensor_connectedToMatch partialMatch) {
    return rawAccumulateAllValuesOfsensor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Sensor> getAllValuesOfsensor(final Host pHost) {
    return rawAccumulateAllValuesOfsensor(new Object[]{
    null, 
    pHost
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Host> rawAccumulateAllValuesOfhost(final Object[] parameters) {
    Set<Host> results = new HashSet<Host>();
    rawAccumulateAllValues(POSITION_HOST, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Host> getAllValuesOfhost() {
    return rawAccumulateAllValuesOfhost(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Host> getAllValuesOfhost(final Ref_sensor_connectedToMatch partialMatch) {
    return rawAccumulateAllValuesOfhost(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Host> getAllValuesOfhost(final Sensor pSensor) {
    return rawAccumulateAllValuesOfhost(new Object[]{
    pSensor, 
    null
    });
  }
  
  @Override
  protected Ref_sensor_connectedToMatch tupleToMatch(final Tuple t) {
    try {
    	return Ref_sensor_connectedToMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) t.get(POSITION_SENSOR), (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) t.get(POSITION_HOST));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Ref_sensor_connectedToMatch arrayToMatch(final Object[] match) {
    try {
    	return Ref_sensor_connectedToMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) match[POSITION_SENSOR], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) match[POSITION_HOST]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Ref_sensor_connectedToMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Ref_sensor_connectedToMatch.newMutableMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) match[POSITION_SENSOR], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) match[POSITION_HOST]);
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
  public static IQuerySpecification<Ref_sensor_connectedToMatcher> querySpecification() throws IncQueryException {
    return Ref_sensor_connectedToQuerySpecification.instance();
  }
}
