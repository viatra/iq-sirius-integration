package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Ref_viewModel_serversMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_viewModel_serversQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_servers pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Ref_viewModel_serversMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern ref_viewModel_servers(telecareSystem : TelecareSystem, host : Host) {
 * 	find element_viewModel(telecareSystem);
 * 	find element_server(host);
 * 	
 * 	TelecareSystem.hosts(telecareSystem, host);
 * }
 * </pre></code>
 * 
 * @see Ref_viewModel_serversMatch
 * @see Ref_viewModel_serversProcessor
 * @see Ref_viewModel_serversQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Ref_viewModel_serversMatcher extends BaseMatcher<Ref_viewModel_serversMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Ref_viewModel_serversMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Ref_viewModel_serversMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Ref_viewModel_serversMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TELECARESYSTEM = 0;
  
  private final static int POSITION_HOST = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Ref_viewModel_serversMatcher.class);
  
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
  public Ref_viewModel_serversMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Ref_viewModel_serversMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return matches represented as a Ref_viewModel_serversMatch object.
   * 
   */
  public Collection<Ref_viewModel_serversMatch> getAllMatches(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return rawGetAllMatches(new Object[]{pTelecareSystem, pHost});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return a match represented as a Ref_viewModel_serversMatch object, or null if no match is found.
   * 
   */
  public Ref_viewModel_serversMatch getOneArbitraryMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return rawGetOneArbitraryMatch(new Object[]{pTelecareSystem, pHost});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return rawHasMatch(new Object[]{pTelecareSystem, pHost});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return rawCountMatches(new Object[]{pTelecareSystem, pHost});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost, final IMatchProcessor<? super Ref_viewModel_serversMatch> processor) {
    rawForEachMatch(new Object[]{pTelecareSystem, pHost}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost, final IMatchProcessor<? super Ref_viewModel_serversMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTelecareSystem, pHost}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Ref_viewModel_serversMatch newMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return Ref_viewModel_serversMatch.newMatch(pTelecareSystem, pHost);
  }
  
  /**
   * Retrieve the set of values that occur in matches for telecareSystem.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem> */Object rawAccumulateAllValuesOftelecareSystem(final Object[] parameters) {
    Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem> results = new HashSet<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem>();
    rawAccumulateAllValues(POSITION_TELECARESYSTEM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for telecareSystem.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem> */Object getAllValuesOftelecareSystem() {
    return rawAccumulateAllValuesOftelecareSystem(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for telecareSystem.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem> */Object getAllValuesOftelecareSystem(final Ref_viewModel_serversMatch partialMatch) {
    return rawAccumulateAllValuesOftelecareSystem(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for telecareSystem.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem> */Object getAllValuesOftelecareSystem(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return rawAccumulateAllValuesOftelecareSystem(new Object[]{
    null, 
    pHost
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host> */Object rawAccumulateAllValuesOfhost(final Object[] parameters) {
    Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host> results = new HashSet<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host>();
    rawAccumulateAllValues(POSITION_HOST, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host> */Object getAllValuesOfhost() {
    return rawAccumulateAllValuesOfhost(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host> */Object getAllValuesOfhost(final Ref_viewModel_serversMatch partialMatch) {
    return rawAccumulateAllValuesOfhost(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public /* Set<hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host> */Object getAllValuesOfhost(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem) {
    return rawAccumulateAllValuesOfhost(new Object[]{
    pTelecareSystem, 
    null
    });
  }
  
  @Override
  protected Ref_viewModel_serversMatch tupleToMatch(final Tuple t) {
    try {
    	return Ref_viewModel_serversMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) t.get(POSITION_TELECARESYSTEM), (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) t.get(POSITION_HOST));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Ref_viewModel_serversMatch arrayToMatch(final Object[] match) {
    try {
    	return Ref_viewModel_serversMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) match[POSITION_TELECARESYSTEM], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) match[POSITION_HOST]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Ref_viewModel_serversMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Ref_viewModel_serversMatch.newMutableMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) match[POSITION_TELECARESYSTEM], (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) match[POSITION_HOST]);
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
  public static IQuerySpecification<Ref_viewModel_serversMatcher> querySpecification() throws IncQueryException {
    return Ref_viewModel_serversQuerySpecification.instance();
  }
}
