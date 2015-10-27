package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_viewModel_sensorsMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_viewModel_sensorsQuerySpecification;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem;
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
 * Generated pattern matcher API of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_sensors pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Ref_viewModel_sensorsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern ref_viewModel_sensors(telecareSystem : TelecareSystem, sensor : Sensor) {
 * 	find element_viewModel(telecareSystem);
 * 	find element_sensor(sensor);
 * 	
 * 	TelecareSystem.sensors(telecareSystem, sensor);
 * }
 * </pre></code>
 * 
 * @see Ref_viewModel_sensorsMatch
 * @see Ref_viewModel_sensorsProcessor
 * @see Ref_viewModel_sensorsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Ref_viewModel_sensorsMatcher extends BaseMatcher<Ref_viewModel_sensorsMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Ref_viewModel_sensorsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Ref_viewModel_sensorsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Ref_viewModel_sensorsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TELECARESYSTEM = 0;
  
  private final static int POSITION_SENSOR = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Ref_viewModel_sensorsMatcher.class);
  
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
  public Ref_viewModel_sensorsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Ref_viewModel_sensorsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @return matches represented as a Ref_viewModel_sensorsMatch object.
   * 
   */
  public Collection<Ref_viewModel_sensorsMatch> getAllMatches(final TelecareSystem pTelecareSystem, final Sensor pSensor) {
    return rawGetAllMatches(new Object[]{pTelecareSystem, pSensor});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @return a match represented as a Ref_viewModel_sensorsMatch object, or null if no match is found.
   * 
   */
  public Ref_viewModel_sensorsMatch getOneArbitraryMatch(final TelecareSystem pTelecareSystem, final Sensor pSensor) {
    return rawGetOneArbitraryMatch(new Object[]{pTelecareSystem, pSensor});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TelecareSystem pTelecareSystem, final Sensor pSensor) {
    return rawHasMatch(new Object[]{pTelecareSystem, pSensor});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TelecareSystem pTelecareSystem, final Sensor pSensor) {
    return rawCountMatches(new Object[]{pTelecareSystem, pSensor});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TelecareSystem pTelecareSystem, final Sensor pSensor, final IMatchProcessor<? super Ref_viewModel_sensorsMatch> processor) {
    rawForEachMatch(new Object[]{pTelecareSystem, pSensor}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TelecareSystem pTelecareSystem, final Sensor pSensor, final IMatchProcessor<? super Ref_viewModel_sensorsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTelecareSystem, pSensor}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Ref_viewModel_sensorsMatch newMatch(final TelecareSystem pTelecareSystem, final Sensor pSensor) {
    return Ref_viewModel_sensorsMatch.newMatch(pTelecareSystem, pSensor);
  }
  
  /**
   * Retrieve the set of values that occur in matches for telecareSystem.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TelecareSystem> rawAccumulateAllValuesOftelecareSystem(final Object[] parameters) {
    Set<TelecareSystem> results = new HashSet<TelecareSystem>();
    rawAccumulateAllValues(POSITION_TELECARESYSTEM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for telecareSystem.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TelecareSystem> getAllValuesOftelecareSystem() {
    return rawAccumulateAllValuesOftelecareSystem(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for telecareSystem.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TelecareSystem> getAllValuesOftelecareSystem(final Ref_viewModel_sensorsMatch partialMatch) {
    return rawAccumulateAllValuesOftelecareSystem(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for telecareSystem.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TelecareSystem> getAllValuesOftelecareSystem(final Sensor pSensor) {
    return rawAccumulateAllValuesOftelecareSystem(new Object[]{
    null, 
    pSensor
    });
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
  public Set<Sensor> getAllValuesOfsensor(final Ref_viewModel_sensorsMatch partialMatch) {
    return rawAccumulateAllValuesOfsensor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Sensor> getAllValuesOfsensor(final TelecareSystem pTelecareSystem) {
    return rawAccumulateAllValuesOfsensor(new Object[]{
    pTelecareSystem, 
    null
    });
  }
  
  @Override
  protected Ref_viewModel_sensorsMatch tupleToMatch(final Tuple t) {
    try {
    	return Ref_viewModel_sensorsMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) t.get(POSITION_TELECARESYSTEM), (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) t.get(POSITION_SENSOR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Ref_viewModel_sensorsMatch arrayToMatch(final Object[] match) {
    try {
    	return Ref_viewModel_sensorsMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) match[POSITION_TELECARESYSTEM], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) match[POSITION_SENSOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Ref_viewModel_sensorsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Ref_viewModel_sensorsMatch.newMutableMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) match[POSITION_TELECARESYSTEM], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) match[POSITION_SENSOR]);
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
  public static IQuerySpecification<Ref_viewModel_sensorsMatcher> querySpecification() throws IncQueryException {
    return Ref_viewModel_sensorsQuerySpecification.instance();
  }
}
