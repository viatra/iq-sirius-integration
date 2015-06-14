package org.eclipse.incquery.viewmodel.traceability.patterns;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.Param2targetQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.viewmodel.traceability.patterns.param2target pattern,
 * to be used in conjunction with {@link Param2targetMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Param2targetMatcher
 * @see Param2targetProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Param2targetMatch extends BasePatternMatch {
  private EObject fParam;
  
  private EObject fTarget;
  
  private static List<String> parameterNames = makeImmutableList("param", "target");
  
  private Param2targetMatch(final EObject pParam, final EObject pTarget) {
    this.fParam = pParam;
    this.fTarget = pTarget;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("param".equals(parameterName)) return this.fParam;
    if ("target".equals(parameterName)) return this.fTarget;
    return null;
  }
  
  public EObject getParam() {
    return this.fParam;
  }
  
  public EObject getTarget() {
    return this.fTarget;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("param".equals(parameterName) ) {
    	this.fParam = (org.eclipse.emf.ecore.EObject) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (org.eclipse.emf.ecore.EObject) newValue;
    	return true;
    }
    return false;
  }
  
  public void setParam(final EObject pParam) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParam = pParam;
  }
  
  public void setTarget(final EObject pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.viewmodel.traceability.patterns.param2target";
  }
  
  @Override
  public List<String> parameterNames() {
    return Param2targetMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParam, fTarget};
  }
  
  @Override
  public Param2targetMatch toImmutable() {
    return isMutable() ? newMatch(fParam, fTarget) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"param\"=" + prettyPrintValue(fParam) + ", ");
    
    result.append("\"target\"=" + prettyPrintValue(fTarget)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fParam == null) ? 0 : fParam.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Param2targetMatch)) { // this should be infrequent
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
    Param2targetMatch other = (Param2targetMatch) obj;
    if (fParam == null) {if (other.fParam != null) return false;}
    else if (!fParam.equals(other.fParam)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public Param2targetQuerySpecification specification() {
    try {
    	return Param2targetQuerySpecification.instance();
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
  public static Param2targetMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Param2targetMatch newMutableMatch(final EObject pParam, final EObject pTarget) {
    return new Mutable(pParam, pTarget);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParam the fixed value of pattern parameter param, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Param2targetMatch newMatch(final EObject pParam, final EObject pTarget) {
    return new Immutable(pParam, pTarget);
  }
  
  private static final class Mutable extends Param2targetMatch {
    Mutable(final EObject pParam, final EObject pTarget) {
      super(pParam, pTarget);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Param2targetMatch {
    Immutable(final EObject pParam, final EObject pTarget) {
      super(pParam, pTarget);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
