package org.eclipse.incquery.viewmodel.traceability.patterns;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.traceability.patterns.EmptyTraceMatcher;
import org.eclipse.incquery.viewmodel.traceability.patterns.Param2targetMatcher;
import org.eclipse.incquery.viewmodel.traceability.patterns.Trace2objectMatcher;
import org.eclipse.incquery.viewmodel.traceability.patterns.Trace2paramMatcher;
import org.eclipse.incquery.viewmodel.traceability.patterns.Trace2targetMatcher;
import org.eclipse.incquery.viewmodel.traceability.patterns.TraceMatcher;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.EmptyTraceQuerySpecification;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.Param2targetQuerySpecification;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.Trace2objectQuerySpecification;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.Trace2paramQuerySpecification;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.Trace2targetQuerySpecification;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.TraceQuerySpecification;

/**
 * A pattern group formed of all patterns defined in helpers.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file helpers.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.eclipse.incquery.viewmodel.traceability.patterns, the group contains the definition of the following patterns: <ul>
 * <li>emptyTrace</li>
 * <li>traceTargets</li>
 * <li>trace2target</li>
 * <li>trace2param</li>
 * <li>trace2object</li>
 * <li>param2target</li>
 * <li>trace</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Helpers extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Helpers instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Helpers();
    }
    return INSTANCE;
  }
  
  private static Helpers INSTANCE;
  
  private Helpers() throws IncQueryException {
    querySpecifications.add(EmptyTraceQuerySpecification.instance());
    querySpecifications.add(Trace2targetQuerySpecification.instance());
    querySpecifications.add(Trace2paramQuerySpecification.instance());
    querySpecifications.add(Trace2objectQuerySpecification.instance());
    querySpecifications.add(Param2targetQuerySpecification.instance());
    querySpecifications.add(TraceQuerySpecification.instance());
  }
  
  public EmptyTraceQuerySpecification getEmptyTrace() throws IncQueryException {
    return EmptyTraceQuerySpecification.instance();
  }
  
  public EmptyTraceMatcher getEmptyTrace(final IncQueryEngine engine) throws IncQueryException {
    return EmptyTraceMatcher.on(engine);
  }
  
  public Trace2targetQuerySpecification getTrace2target() throws IncQueryException {
    return Trace2targetQuerySpecification.instance();
  }
  
  public Trace2targetMatcher getTrace2target(final IncQueryEngine engine) throws IncQueryException {
    return Trace2targetMatcher.on(engine);
  }
  
  public Trace2paramQuerySpecification getTrace2param() throws IncQueryException {
    return Trace2paramQuerySpecification.instance();
  }
  
  public Trace2paramMatcher getTrace2param(final IncQueryEngine engine) throws IncQueryException {
    return Trace2paramMatcher.on(engine);
  }
  
  public Trace2objectQuerySpecification getTrace2object() throws IncQueryException {
    return Trace2objectQuerySpecification.instance();
  }
  
  public Trace2objectMatcher getTrace2object(final IncQueryEngine engine) throws IncQueryException {
    return Trace2objectMatcher.on(engine);
  }
  
  public Param2targetQuerySpecification getParam2target() throws IncQueryException {
    return Param2targetQuerySpecification.instance();
  }
  
  public Param2targetMatcher getParam2target(final IncQueryEngine engine) throws IncQueryException {
    return Param2targetMatcher.on(engine);
  }
  
  public TraceQuerySpecification getTrace() throws IncQueryException {
    return TraceQuerySpecification.instance();
  }
  
  public TraceMatcher getTrace(final IncQueryEngine engine) throws IncQueryException {
    return TraceMatcher.on(engine);
  }
}
