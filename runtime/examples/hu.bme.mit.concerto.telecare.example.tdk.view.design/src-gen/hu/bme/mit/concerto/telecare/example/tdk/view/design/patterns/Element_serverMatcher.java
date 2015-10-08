package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.Element_serverMatch;
import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_serverQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_server pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Element_serverMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern element_server(host : Host) {
 * 	ReportingEvent.address(_, host);
 * }
 * </pre></code>
 * 
 * @see Element_serverMatch
 * @see Element_serverProcessor
 * @see Element_serverQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Element_serverMatcher extends BaseMatcher<Element_serverMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Element_serverMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Element_serverMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Element_serverMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_HOST = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Element_serverMatcher.class);
  
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
  public Element_serverMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Element_serverMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return matches represented as a Element_serverMatch object.
   * 
   */
  public Collection<Element_serverMatch> getAllMatches(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return rawGetAllMatches(new Object[]{pHost});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return a match represented as a Element_serverMatch object, or null if no match is found.
   * 
   */
  public Element_serverMatch getOneArbitraryMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return rawGetOneArbitraryMatch(new Object[]{pHost});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return rawHasMatch(new Object[]{pHost});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return rawCountMatches(new Object[]{pHost});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost, final IMatchProcessor<? super Element_serverMatch> processor) {
    rawForEachMatch(new Object[]{pHost}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost, final IMatchProcessor<? super Element_serverMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pHost}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Element_serverMatch newMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return Element_serverMatch.newMatch(pHost);
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
  
  @Override
  protected Element_serverMatch tupleToMatch(final Tuple t) {
    try {
    	return Element_serverMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) t.get(POSITION_HOST));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Element_serverMatch arrayToMatch(final Object[] match) {
    try {
    	return Element_serverMatch.newMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) match[POSITION_HOST]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Element_serverMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Element_serverMatch.newMutableMatch((hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) match[POSITION_HOST]);
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
  public static IQuerySpecification<Element_serverMatcher> querySpecification() throws IncQueryException {
    return Element_serverQuerySpecification.instance();
  }
}
