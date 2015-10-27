package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_viewModel_triggersMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_viewModel_triggersQuerySpecification;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger;
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
 * Generated pattern matcher API of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_triggers pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Ref_viewModel_triggersMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern ref_viewModel_triggers(telecareSystem : TelecareSystem, trigger : FixedIntervalTrigger) {
 * 	find element_viewModel(telecareSystem);
 * 	find element_trigger(trigger);
 * 	
 * 	TelecareSystem.gateways.triggers(telecareSystem, trigger);
 * }
 * </pre></code>
 * 
 * @see Ref_viewModel_triggersMatch
 * @see Ref_viewModel_triggersProcessor
 * @see Ref_viewModel_triggersQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Ref_viewModel_triggersMatcher extends BaseMatcher<Ref_viewModel_triggersMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Ref_viewModel_triggersMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Ref_viewModel_triggersMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Ref_viewModel_triggersMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TELECARESYSTEM = 0;
  
  private final static int POSITION_TRIGGER = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Ref_viewModel_triggersMatcher.class);
  
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
  public Ref_viewModel_triggersMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Ref_viewModel_triggersMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return matches represented as a Ref_viewModel_triggersMatch object.
   * 
   */
  public Collection<Ref_viewModel_triggersMatch> getAllMatches(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger) {
    return rawGetAllMatches(new Object[]{pTelecareSystem, pTrigger});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return a match represented as a Ref_viewModel_triggersMatch object, or null if no match is found.
   * 
   */
  public Ref_viewModel_triggersMatch getOneArbitraryMatch(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger) {
    return rawGetOneArbitraryMatch(new Object[]{pTelecareSystem, pTrigger});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger) {
    return rawHasMatch(new Object[]{pTelecareSystem, pTrigger});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger) {
    return rawCountMatches(new Object[]{pTelecareSystem, pTrigger});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger, final IMatchProcessor<? super Ref_viewModel_triggersMatch> processor) {
    rawForEachMatch(new Object[]{pTelecareSystem, pTrigger}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger, final IMatchProcessor<? super Ref_viewModel_triggersMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTelecareSystem, pTrigger}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Ref_viewModel_triggersMatch newMatch(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger) {
    return Ref_viewModel_triggersMatch.newMatch(pTelecareSystem, pTrigger);
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
  public Set<TelecareSystem> getAllValuesOftelecareSystem(final Ref_viewModel_triggersMatch partialMatch) {
    return rawAccumulateAllValuesOftelecareSystem(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for telecareSystem.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TelecareSystem> getAllValuesOftelecareSystem(final FixedIntervalTrigger pTrigger) {
    return rawAccumulateAllValuesOftelecareSystem(new Object[]{
    null, 
    pTrigger
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<FixedIntervalTrigger> rawAccumulateAllValuesOftrigger(final Object[] parameters) {
    Set<FixedIntervalTrigger> results = new HashSet<FixedIntervalTrigger>();
    rawAccumulateAllValues(POSITION_TRIGGER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<FixedIntervalTrigger> getAllValuesOftrigger() {
    return rawAccumulateAllValuesOftrigger(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<FixedIntervalTrigger> getAllValuesOftrigger(final Ref_viewModel_triggersMatch partialMatch) {
    return rawAccumulateAllValuesOftrigger(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trigger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<FixedIntervalTrigger> getAllValuesOftrigger(final TelecareSystem pTelecareSystem) {
    return rawAccumulateAllValuesOftrigger(new Object[]{
    pTelecareSystem, 
    null
    });
  }
  
  @Override
  protected Ref_viewModel_triggersMatch tupleToMatch(final Tuple t) {
    try {
    	return Ref_viewModel_triggersMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) t.get(POSITION_TELECARESYSTEM), (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) t.get(POSITION_TRIGGER));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Ref_viewModel_triggersMatch arrayToMatch(final Object[] match) {
    try {
    	return Ref_viewModel_triggersMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) match[POSITION_TELECARESYSTEM], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) match[POSITION_TRIGGER]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Ref_viewModel_triggersMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Ref_viewModel_triggersMatch.newMutableMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) match[POSITION_TELECARESYSTEM], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) match[POSITION_TRIGGER]);
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
  public static IQuerySpecification<Ref_viewModel_triggersMatcher> querySpecification() throws IncQueryException {
    return Ref_viewModel_triggersQuerySpecification.instance();
  }
}
