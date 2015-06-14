package org.eclipse.incquery.viewmodel.traceability.patterns;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.Trace2targetQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.viewmodel.traceability.patterns.trace2target pattern,
 * to be used in conjunction with {@link Trace2targetMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Trace2targetMatcher
 * @see Trace2targetProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Trace2targetMatch extends BasePatternMatch {
  private EObject fTarget;
  
  private Trace fTrace;
  
  private static List<String> parameterNames = makeImmutableList("target", "trace");
  
  private Trace2targetMatch(final EObject pTarget, final Trace pTrace) {
    this.fTarget = pTarget;
    this.fTrace = pTrace;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("target".equals(parameterName)) return this.fTarget;
    if ("trace".equals(parameterName)) return this.fTrace;
    return null;
  }
  
  public EObject getTarget() {
    return this.fTarget;
  }
  
  public Trace getTrace() {
    return this.fTrace;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("target".equals(parameterName) ) {
    	this.fTarget = (org.eclipse.emf.ecore.EObject) newValue;
    	return true;
    }
    if ("trace".equals(parameterName) ) {
    	this.fTrace = (org.eclipse.incquery.viewmodel.traceability.Trace) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTarget(final EObject pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
  }
  
  public void setTrace(final Trace pTrace) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrace = pTrace;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.viewmodel.traceability.patterns.trace2target";
  }
  
  @Override
  public List<String> parameterNames() {
    return Trace2targetMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTarget, fTrace};
  }
  
  @Override
  public Trace2targetMatch toImmutable() {
    return isMutable() ? newMatch(fTarget, fTrace) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
    
    result.append("\"trace\"=" + prettyPrintValue(fTrace)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    result = prime * result + ((fTrace == null) ? 0 : fTrace.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Trace2targetMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    Trace2targetMatch other = (Trace2targetMatch) obj;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    if (fTrace == null) {if (other.fTrace != null) return false;}
    else if (!fTrace.equals(other.fTrace)) return false;
    return true;
  }
  
  @Override
  public Trace2targetQuerySpecification specification() {
    try {
    	return Trace2targetQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static Trace2targetMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Trace2targetMatch newMutableMatch(final EObject pTarget, final Trace pTrace) {
    return new Mutable(pTarget, pTrace);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Trace2targetMatch newMatch(final EObject pTarget, final Trace pTrace) {
    return new Immutable(pTarget, pTrace);
  }
  
  private static final class Mutable extends Trace2targetMatch {
    Mutable(final EObject pTarget, final Trace pTrace) {
      super(pTarget, pTrace);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Trace2targetMatch {
    Immutable(final EObject pTarget, final Trace pTrace) {
      super(pTarget, pTrace);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
