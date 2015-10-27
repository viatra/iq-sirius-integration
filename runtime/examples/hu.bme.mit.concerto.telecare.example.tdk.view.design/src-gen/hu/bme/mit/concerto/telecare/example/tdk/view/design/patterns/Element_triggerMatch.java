package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_triggerQuerySpecification;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_trigger pattern,
 * to be used in conjunction with {@link Element_triggerMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Element_triggerMatcher
 * @see Element_triggerProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Element_triggerMatch extends BasePatternMatch {
  private FixedIntervalTrigger fTrigger;
  
  private static List<String> parameterNames = makeImmutableList("trigger");
  
  private Element_triggerMatch(final FixedIntervalTrigger pTrigger) {
    this.fTrigger = pTrigger;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("trigger".equals(parameterName)) return this.fTrigger;
    return null;
  }
  
  public FixedIntervalTrigger getTrigger() {
    return this.fTrigger;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("trigger".equals(parameterName) ) {
    	this.fTrigger = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTrigger(final FixedIntervalTrigger pTrigger) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrigger = pTrigger;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_trigger";
  }
  
  @Override
  public List<String> parameterNames() {
    return Element_triggerMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTrigger};
  }
  
  @Override
  public Element_triggerMatch toImmutable() {
    return isMutable() ? newMatch(fTrigger) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"trigger\"=" + prettyPrintValue(fTrigger)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTrigger == null) ? 0 : fTrigger.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Element_triggerMatch)) { // this should be infrequent
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
    Element_triggerMatch other = (Element_triggerMatch) obj;
    if (fTrigger == null) {if (other.fTrigger != null) return false;}
    else if (!fTrigger.equals(other.fTrigger)) return false;
    return true;
  }
  
  @Override
  public Element_triggerQuerySpecification specification() {
    try {
    	return Element_triggerQuerySpecification.instance();
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
  public static Element_triggerMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Element_triggerMatch newMutableMatch(final FixedIntervalTrigger pTrigger) {
    return new Mutable(pTrigger);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Element_triggerMatch newMatch(final FixedIntervalTrigger pTrigger) {
    return new Immutable(pTrigger);
  }
  
  private static final class Mutable extends Element_triggerMatch {
    Mutable(final FixedIntervalTrigger pTrigger) {
      super(pTrigger);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Element_triggerMatch {
    Immutable(final FixedIntervalTrigger pTrigger) {
      super(pTrigger);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
