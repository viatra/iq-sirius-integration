package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_viewModel_triggersQuerySpecification;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_triggers pattern,
 * to be used in conjunction with {@link Ref_viewModel_triggersMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Ref_viewModel_triggersMatcher
 * @see Ref_viewModel_triggersProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Ref_viewModel_triggersMatch extends BasePatternMatch {
  private TelecareSystem fTelecareSystem;
  
  private FixedIntervalTrigger fTrigger;
  
  private static List<String> parameterNames = makeImmutableList("telecareSystem", "trigger");
  
  private Ref_viewModel_triggersMatch(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger) {
    this.fTelecareSystem = pTelecareSystem;
    this.fTrigger = pTrigger;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("telecareSystem".equals(parameterName)) return this.fTelecareSystem;
    if ("trigger".equals(parameterName)) return this.fTrigger;
    return null;
  }
  
  public TelecareSystem getTelecareSystem() {
    return this.fTelecareSystem;
  }
  
  public FixedIntervalTrigger getTrigger() {
    return this.fTrigger;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("telecareSystem".equals(parameterName) ) {
    	this.fTelecareSystem = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) newValue;
    	return true;
    }
    if ("trigger".equals(parameterName) ) {
    	this.fTrigger = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTelecareSystem(final TelecareSystem pTelecareSystem) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTelecareSystem = pTelecareSystem;
  }
  
  public void setTrigger(final FixedIntervalTrigger pTrigger) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrigger = pTrigger;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_triggers";
  }
  
  @Override
  public List<String> parameterNames() {
    return Ref_viewModel_triggersMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTelecareSystem, fTrigger};
  }
  
  @Override
  public Ref_viewModel_triggersMatch toImmutable() {
    return isMutable() ? newMatch(fTelecareSystem, fTrigger) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"telecareSystem\"=" + prettyPrintValue(fTelecareSystem) + ", ");
    
    result.append("\"trigger\"=" + prettyPrintValue(fTrigger)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTelecareSystem == null) ? 0 : fTelecareSystem.hashCode());
    result = prime * result + ((fTrigger == null) ? 0 : fTrigger.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Ref_viewModel_triggersMatch)) { // this should be infrequent
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
    Ref_viewModel_triggersMatch other = (Ref_viewModel_triggersMatch) obj;
    if (fTelecareSystem == null) {if (other.fTelecareSystem != null) return false;}
    else if (!fTelecareSystem.equals(other.fTelecareSystem)) return false;
    if (fTrigger == null) {if (other.fTrigger != null) return false;}
    else if (!fTrigger.equals(other.fTrigger)) return false;
    return true;
  }
  
  @Override
  public Ref_viewModel_triggersQuerySpecification specification() {
    try {
    	return Ref_viewModel_triggersQuerySpecification.instance();
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
  public static Ref_viewModel_triggersMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Ref_viewModel_triggersMatch newMutableMatch(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger) {
    return new Mutable(pTelecareSystem, pTrigger);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Ref_viewModel_triggersMatch newMatch(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger) {
    return new Immutable(pTelecareSystem, pTrigger);
  }
  
  private static final class Mutable extends Ref_viewModel_triggersMatch {
    Mutable(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger) {
      super(pTelecareSystem, pTrigger);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Ref_viewModel_triggersMatch {
    Immutable(final TelecareSystem pTelecareSystem, final FixedIntervalTrigger pTrigger) {
      super(pTelecareSystem, pTrigger);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
