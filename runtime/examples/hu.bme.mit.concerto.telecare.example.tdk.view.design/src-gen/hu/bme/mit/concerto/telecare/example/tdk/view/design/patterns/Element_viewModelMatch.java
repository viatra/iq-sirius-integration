package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Element_viewModelQuerySpecification;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_viewModel pattern,
 * to be used in conjunction with {@link Element_viewModelMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Element_viewModelMatcher
 * @see Element_viewModelProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Element_viewModelMatch extends BasePatternMatch {
  private TelecareSystem fTelecareSystem;
  
  private static List<String> parameterNames = makeImmutableList("telecareSystem");
  
  private Element_viewModelMatch(final TelecareSystem pTelecareSystem) {
    this.fTelecareSystem = pTelecareSystem;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("telecareSystem".equals(parameterName)) return this.fTelecareSystem;
    return null;
  }
  
  public TelecareSystem getTelecareSystem() {
    return this.fTelecareSystem;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("telecareSystem".equals(parameterName) ) {
    	this.fTelecareSystem = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTelecareSystem(final TelecareSystem pTelecareSystem) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTelecareSystem = pTelecareSystem;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.element_viewModel";
  }
  
  @Override
  public List<String> parameterNames() {
    return Element_viewModelMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTelecareSystem};
  }
  
  @Override
  public Element_viewModelMatch toImmutable() {
    return isMutable() ? newMatch(fTelecareSystem) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"telecareSystem\"=" + prettyPrintValue(fTelecareSystem)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTelecareSystem == null) ? 0 : fTelecareSystem.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Element_viewModelMatch)) { // this should be infrequent
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
    Element_viewModelMatch other = (Element_viewModelMatch) obj;
    if (fTelecareSystem == null) {if (other.fTelecareSystem != null) return false;}
    else if (!fTelecareSystem.equals(other.fTelecareSystem)) return false;
    return true;
  }
  
  @Override
  public Element_viewModelQuerySpecification specification() {
    try {
    	return Element_viewModelQuerySpecification.instance();
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
  public static Element_viewModelMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Element_viewModelMatch newMutableMatch(final TelecareSystem pTelecareSystem) {
    return new Mutable(pTelecareSystem);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Element_viewModelMatch newMatch(final TelecareSystem pTelecareSystem) {
    return new Immutable(pTelecareSystem);
  }
  
  private static final class Mutable extends Element_viewModelMatch {
    Mutable(final TelecareSystem pTelecareSystem) {
      super(pTelecareSystem);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Element_viewModelMatch {
    Immutable(final TelecareSystem pTelecareSystem) {
      super(pTelecareSystem);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
