package org.eclipse.incquery.viewmodel.traceability.patterns;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.Trace2objectQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.viewmodel.traceability.patterns.trace2object pattern,
 * to be used in conjunction with {@link Trace2objectMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Trace2objectMatcher
 * @see Trace2objectProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Trace2objectMatch extends BasePatternMatch {
  private Object fParam;
  
  private Trace fTrace;
  
  private String fId;
  
  private static List<String> parameterNames = makeImmutableList("param", "trace", "id");
  
  private Trace2objectMatch(final Object pParam, final Trace pTrace, final String pId) {
    this.fParam = pParam;
    this.fTrace = pTrace;
    this.fId = pId;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("param".equals(parameterName)) return this.fParam;
    if ("trace".equals(parameterName)) return this.fTrace;
    if ("id".equals(parameterName)) return this.fId;
    return null;
  }
  
  public Object getParam() {
    return this.fParam;
  }
  
  public Trace getTrace() {
    return this.fTrace;
  }
  
  public String getId() {
    return this.fId;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("param".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fParam = (java.lang.Object) newValue;
    	return true;
    }
    if ("trace".equals(parameterName) ) {
    	this.fTrace = (org.eclipse.incquery.viewmodel.traceability.Trace) newValue;
    	return true;
    }
    if ("id".equals(parameterName) ) {
    	this.fId = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setParam(final Object pParam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParam = pParam;
  }
  
  public void setTrace(final Trace pTrace) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrace = pTrace;
  }
  
  public void setId(final String pId) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fId = pId;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.viewmodel.traceability.patterns.trace2object";
  }
  
  @Override
  public List<String> parameterNames() {
    return Trace2objectMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParam, fTrace, fId};
  }
  
  @Override
  public Trace2objectMatch toImmutable() {
    return isMutable() ? newMatch(fParam, fTrace, fId) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"param\"=" + prettyPrintValue(fParam) + ", ");
    
    result.append("\"trace\"=" + prettyPrintValue(fTrace) + ", ");
    
    result.append("\"id\"=" + prettyPrintValue(fId)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fParam == null) ? 0 : fParam.hashCode());
    result = prime * result + ((fTrace == null) ? 0 : fTrace.hashCode());
    result = prime * result + ((fId == null) ? 0 : fId.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Trace2objectMatch)) { // this should be infrequent
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
    Trace2objectMatch other = (Trace2objectMatch) obj;
    if (fParam == null) {if (other.fParam != null) return false;}
    else if (!fParam.equals(other.fParam)) return false;
    if (fTrace == null) {if (other.fTrace != null) return false;}
    else if (!fTrace.equals(other.fTrace)) return false;
    if (fId == null) {if (other.fId != null) return false;}
    else if (!fId.equals(other.fId)) return false;
    return true;
  }
  
  @Override
  public Trace2objectQuerySpecification specification() {
    try {
    	return Trace2objectQuerySpecification.instance();
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
  public static Trace2objectMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Trace2objectMatch newMutableMatch(final Object pParam, final Trace pTrace, final String pId) {
    return new Mutable(pParam, pTrace, pId);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Trace2objectMatch newMatch(final Object pParam, final Trace pTrace, final String pId) {
    return new Immutable(pParam, pTrace, pId);
  }
  
  private static final class Mutable extends Trace2objectMatch {
    Mutable(final Object pParam, final Trace pTrace, final String pId) {
      super(pParam, pTrace, pId);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Trace2objectMatch {
    Immutable(final Object pParam, final Trace pTrace, final String pId) {
      super(pParam, pTrace, pId);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
