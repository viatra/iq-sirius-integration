package org.eclipse.incquery.viewmodel.traceability.patterns;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.TraceQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.viewmodel.traceability.patterns.trace pattern,
 * to be used in conjunction with {@link TraceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TraceMatcher
 * @see TraceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TraceMatch extends BasePatternMatch {
  private Object fSource;
  
  private String fId;
  
  private EObject fTarget;
  
  private Trace fTrace;
  
  private String fTraceabilityId;
  
  private static List<String> parameterNames = makeImmutableList("source", "id", "target", "trace", "traceabilityId");
  
  private TraceMatch(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
    this.fSource = pSource;
    this.fId = pId;
    this.fTarget = pTarget;
    this.fTrace = pTrace;
    this.fTraceabilityId = pTraceabilityId;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("source".equals(parameterName)) return this.fSource;
    if ("id".equals(parameterName)) return this.fId;
    if ("target".equals(parameterName)) return this.fTarget;
    if ("trace".equals(parameterName)) return this.fTrace;
    if ("traceabilityId".equals(parameterName)) return this.fTraceabilityId;
    return null;
  }
  
  public Object getSource() {
    return this.fSource;
  }
  
  public String getId() {
    return this.fId;
  }
  
  public EObject getTarget() {
    return this.fTarget;
  }
  
  public Trace getTrace() {
    return this.fTrace;
  }
  
  public String getTraceabilityId() {
    return this.fTraceabilityId;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("source".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fSource = (java.lang.Object) newValue;
    	return true;
    }
    if ("id".equals(parameterName) ) {
    	this.fId = (java.lang.String) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (org.eclipse.emf.ecore.EObject) newValue;
    	return true;
    }
    if ("trace".equals(parameterName) ) {
    	this.fTrace = (org.eclipse.incquery.viewmodel.traceability.Trace) newValue;
    	return true;
    }
    if ("traceabilityId".equals(parameterName) ) {
    	this.fTraceabilityId = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSource(final Object pSource) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSource = pSource;
  }
  
  public void setId(final String pId) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fId = pId;
  }
  
  public void setTarget(final EObject pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
  }
  
  public void setTrace(final Trace pTrace) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrace = pTrace;
  }
  
  public void setTraceabilityId(final String pTraceabilityId) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTraceabilityId = pTraceabilityId;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.viewmodel.traceability.patterns.trace";
  }
  
  @Override
  public List<String> parameterNames() {
    return TraceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSource, fId, fTarget, fTrace, fTraceabilityId};
  }
  
  @Override
  public TraceMatch toImmutable() {
    return isMutable() ? newMatch(fSource, fId, fTarget, fTrace, fTraceabilityId) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
    
    result.append("\"id\"=" + prettyPrintValue(fId) + ", ");
    
    result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
    
    result.append("\"trace\"=" + prettyPrintValue(fTrace) + ", ");
    
    result.append("\"traceabilityId\"=" + prettyPrintValue(fTraceabilityId)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSource == null) ? 0 : fSource.hashCode());
    result = prime * result + ((fId == null) ? 0 : fId.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    result = prime * result + ((fTrace == null) ? 0 : fTrace.hashCode());
    result = prime * result + ((fTraceabilityId == null) ? 0 : fTraceabilityId.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TraceMatch)) { // this should be infrequent
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
    TraceMatch other = (TraceMatch) obj;
    if (fSource == null) {if (other.fSource != null) return false;}
    else if (!fSource.equals(other.fSource)) return false;
    if (fId == null) {if (other.fId != null) return false;}
    else if (!fId.equals(other.fId)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    if (fTrace == null) {if (other.fTrace != null) return false;}
    else if (!fTrace.equals(other.fTrace)) return false;
    if (fTraceabilityId == null) {if (other.fTraceabilityId != null) return false;}
    else if (!fTraceabilityId.equals(other.fTraceabilityId)) return false;
    return true;
  }
  
  @Override
  public TraceQuerySpecification specification() {
    try {
    	return TraceQuerySpecification.instance();
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
  public static TraceMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pTraceabilityId the fixed value of pattern parameter traceabilityId, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TraceMatch newMutableMatch(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
    return new Mutable(pSource, pId, pTarget, pTrace, pTraceabilityId);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pTraceabilityId the fixed value of pattern parameter traceabilityId, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TraceMatch newMatch(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
    return new Immutable(pSource, pId, pTarget, pTrace, pTraceabilityId);
  }
  
  private static final class Mutable extends TraceMatch {
    Mutable(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
      super(pSource, pId, pTarget, pTrace, pTraceabilityId);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TraceMatch {
    Immutable(final Object pSource, final String pId, final EObject pTarget, final Trace pTrace, final String pTraceabilityId) {
      super(pSource, pId, pTarget, pTrace, pTraceabilityId);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
