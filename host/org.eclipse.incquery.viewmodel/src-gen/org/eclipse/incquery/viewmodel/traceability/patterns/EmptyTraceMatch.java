package org.eclipse.incquery.viewmodel.traceability.patterns;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.EmptyTraceQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.viewmodel.traceability.patterns.emptyTrace pattern,
 * to be used in conjunction with {@link EmptyTraceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EmptyTraceMatcher
 * @see EmptyTraceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EmptyTraceMatch extends BasePatternMatch {
  private Trace fTrace;
  
  private static List<String> parameterNames = makeImmutableList("trace");
  
  private EmptyTraceMatch(final Trace pTrace) {
    this.fTrace = pTrace;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("trace".equals(parameterName)) return this.fTrace;
    return null;
  }
  
  public Trace getTrace() {
    return this.fTrace;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("trace".equals(parameterName) ) {
    	this.fTrace = (org.eclipse.incquery.viewmodel.traceability.Trace) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTrace(final Trace pTrace) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrace = pTrace;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.viewmodel.traceability.patterns.emptyTrace";
  }
  
  @Override
  public List<String> parameterNames() {
    return EmptyTraceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTrace};
  }
  
  @Override
  public EmptyTraceMatch toImmutable() {
    return isMutable() ? newMatch(fTrace) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"trace\"=" + prettyPrintValue(fTrace)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTrace == null) ? 0 : fTrace.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EmptyTraceMatch)) { // this should be infrequent
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
    EmptyTraceMatch other = (EmptyTraceMatch) obj;
    if (fTrace == null) {if (other.fTrace != null) return false;}
    else if (!fTrace.equals(other.fTrace)) return false;
    return true;
  }
  
  @Override
  public EmptyTraceQuerySpecification specification() {
    try {
    	return EmptyTraceQuerySpecification.instance();
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
  public static EmptyTraceMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EmptyTraceMatch newMutableMatch(final Trace pTrace) {
    return new Mutable(pTrace);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EmptyTraceMatch newMatch(final Trace pTrace) {
    return new Immutable(pTrace);
  }
  
  private static final class Mutable extends EmptyTraceMatch {
    Mutable(final Trace pTrace) {
      super(pTrace);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EmptyTraceMatch {
    Immutable(final Trace pTrace) {
      super(pTrace);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
