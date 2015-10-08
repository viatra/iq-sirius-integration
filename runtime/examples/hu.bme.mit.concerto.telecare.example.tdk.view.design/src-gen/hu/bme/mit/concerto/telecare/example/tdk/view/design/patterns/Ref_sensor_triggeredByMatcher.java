package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_sensor_triggeredByMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_sensor_triggeredByQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_sensor_triggeredBy pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Ref_sensor_triggeredByMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern ref_sensor_triggeredBy(sensor : Sensor, trigger : FixedIntervalTrigger) {
 * 	find element_sensor(sensor);
 * 	find element_trigger(trigger);
 * 	
 * 	FixedIntervalTrigger.triggeredEvents(trigger, measurementEvent);
 * 	Measurement.measurementType.sensor(measurementEvent, sensor);
 * }
 * </pre></code>
 * 
 * @see Ref_sensor_triggeredByMatch
 * @see Ref_sensor_triggeredByProcessor
 * @see Ref_sensor_triggeredByQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Ref_sensor_triggeredByMatcher extends BaseMatcher<Ref_sensor_triggeredByMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Ref_sensor_triggeredByMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Ref_sensor_triggeredByMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Ref_sensor_triggeredByMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SENSOR = 0;
  
  private final static int POSITION_TRIGGER = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Ref_sensor_triggeredByMatcher.class);
  
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
  public Ref_sensor_triggeredByMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Ref_sensor_triggeredByMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return matches represented as a Ref_sensor_triggeredByMatch object.
   * 
   */
  public Collection<Ref_sensor_triggeredByMatch> getAllMatches(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
    return rawGetAllMatches(new Object[]{pSensor, pTrigger});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return a match represented as a Ref_sensor_triggeredByMatch object, or null if no match is found.
   * 
   */
  public Ref_sensor_triggeredByMatch getOneArbitraryMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
    return rawGetOneArbitraryMatch(new Object[]{pSensor, pTrigger});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
    return rawHasMatch(new Object[]{pSensor, pTrigger});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
    return rawCountMatches(new Object[]{pSensor, pTrigger});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger, final IMatchProcessor<? super Ref_sensor_triggeredByMatch> processor) {
    rawForEachMatch(new Object[]{pSensor, pTrigger}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger, final IMatchProcessor<? super Ref_sensor_triggeredByMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSensor, pTrigger}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Ref_sensor_triggeredByMatch newMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
    return Ref_sensor_triggeredByMatch.newMatch(pSensor, pTrigger);
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor> */Object rawAccumulateAllValuesOfsensor(final Object[] parameters) {
    Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor> results = new HashSet<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor>();
    rawAccumulateAllValues(POSITION_SENSOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor> */Object getAllValuesOfsensor() {
    return rawAccumulateAllValuesOfsensor(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor> */Object getAllValuesOfsensor(final Ref_sensor_triggeredByMatch partialMatch) {
    return rawAccumulateAllValuesOfsensor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor> */Object getAllValuesOfsensor(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
    return rawAccumulateAllValuesOfsensor(new Object[]{
    null, 
    pTrigger
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger> */Object rawAccumulateAllValuesOftrigger(final Object[] parameters) {
    Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger> results = new HashSet<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger>();
    rawAccumulateAllValues(POSITION_TRIGGER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger> */Object getAllValuesOftrigger() {
    return rawAccumulateAllValuesOftrigger(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger> */Object getAllValuesOftrigger(final Ref_sensor_triggeredByMatch partialMatch) {
    return rawAccumulateAllValuesOftrigger(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger> */Object getAllValuesOftrigger(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor) {
    return rawAccumulateAllValuesOftrigger(new Object[]{
    pSensor, 
    null
    });
  }
  
  @Override
  protected Ref_sensor_triggeredByMatch tupleToMatch(final Tuple t) {
    try {
    	return Ref_sensor_triggeredByMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) t.get(POSITION_SENSOR), (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) t.get(POSITION_TRIGGER));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Ref_sensor_triggeredByMatch arrayToMatch(final Object[] match) {
    try {
    	return Ref_sensor_triggeredByMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) match[POSITION_SENSOR], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) match[POSITION_TRIGGER]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Ref_sensor_triggeredByMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Ref_sensor_triggeredByMatch.newMutableMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) match[POSITION_SENSOR], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) match[POSITION_TRIGGER]);
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
  public static IQuerySpecification<Ref_sensor_triggeredByMatcher> querySpecification() throws IncQueryException {
    return Ref_sensor_triggeredByQuerySpecification.instance();
  }
}
