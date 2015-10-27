package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Attr_trigger_nameQuerySpecification;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_trigger_name pattern,
 * to be used in conjunction with {@link Attr_trigger_nameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Attr_trigger_nameMatcher
 * @see Attr_trigger_nameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Attr_trigger_nameMatch extends BasePatternMatch {
  private FixedIntervalTrigger fTrigger;
  
  private String fValue;
  
  private static List<String> parameterNames = makeImmutableList("trigger", "value");
  
  private Attr_trigger_nameMatch(final FixedIntervalTrigger pTrigger, final String pValue) {
    this.fTrigger = pTrigger;
    this.fValue = pValue;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("trigger".equals(parameterName)) return this.fTrigger;
    if ("value".equals(parameterName)) return this.fValue;
    return null;
  }
  
  public FixedIntervalTrigger getTrigger() {
    return this.fTrigger;
  }
  
  public String getValue() {
    return this.fValue;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("trigger".equals(parameterName) ) {
    	this.fTrigger = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) newValue;
    	return true;
    }
    if ("value".equals(parameterName) ) {
    	this.fValue = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTrigger(final FixedIntervalTrigger pTrigger) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrigger = pTrigger;
  }
  
  public void setValue(final String pValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fValue = pValue;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_trigger_name";
  }
  
  @Override
  public List<String> parameterNames() {
    return Attr_trigger_nameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTrigger, fValue};
  }
  
  @Override
  public Attr_trigger_nameMatch toImmutable() {
    return isMutable() ? newMatch(fTrigger, fValue) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"trigger\"=" + prettyPrintValue(fTrigger) + ", ");
    
    result.append("\"value\"=" + prettyPrintValue(fValue)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTrigger == null) ? 0 : fTrigger.hashCode());
    result = prime * result + ((fValue == null) ? 0 : fValue.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Attr_trigger_nameMatch)) { // this should be infrequent
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
    Attr_trigger_nameMatch other = (Attr_trigger_nameMatch) obj;
    if (fTrigger == null) {if (other.fTrigger != null) return false;}
    else if (!fTrigger.equals(other.fTrigger)) return false;
    if (fValue == null) {if (other.fValue != null) return false;}
    else if (!fValue.equals(other.fValue)) return false;
    return true;
  }
  
  @Override
  public Attr_trigger_nameQuerySpecification specification() {
    try {
    	return Attr_trigger_nameQuerySpecification.instance();
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
  public static Attr_trigger_nameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Attr_trigger_nameMatch newMutableMatch(final FixedIntervalTrigger pTrigger, final String pValue) {
    return new Mutable(pTrigger, pValue);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Attr_trigger_nameMatch newMatch(final FixedIntervalTrigger pTrigger, final String pValue) {
    return new Immutable(pTrigger, pValue);
  }
  
  private static final class Mutable extends Attr_trigger_nameMatch {
    Mutable(final FixedIntervalTrigger pTrigger, final String pValue) {
      super(pTrigger, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Attr_trigger_nameMatch {
    Immutable(final FixedIntervalTrigger pTrigger, final String pValue) {
      super(pTrigger, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
