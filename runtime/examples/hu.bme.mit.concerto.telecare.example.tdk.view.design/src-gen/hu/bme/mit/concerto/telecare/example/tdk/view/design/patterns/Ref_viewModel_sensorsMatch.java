package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_viewModel_sensorsQuerySpecification;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_sensors pattern,
 * to be used in conjunction with {@link Ref_viewModel_sensorsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Ref_viewModel_sensorsMatcher
 * @see Ref_viewModel_sensorsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Ref_viewModel_sensorsMatch extends BasePatternMatch {
  private TelecareSystem fTelecareSystem;
  
  private Sensor fSensor;
  
  private static List<String> parameterNames = makeImmutableList("telecareSystem", "sensor");
  
  private Ref_viewModel_sensorsMatch(final TelecareSystem pTelecareSystem, final Sensor pSensor) {
    this.fTelecareSystem = pTelecareSystem;
    this.fSensor = pSensor;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("telecareSystem".equals(parameterName)) return this.fTelecareSystem;
    if ("sensor".equals(parameterName)) return this.fSensor;
    return null;
  }
  
  public TelecareSystem getTelecareSystem() {
    return this.fTelecareSystem;
  }
  
  public Sensor getSensor() {
    return this.fSensor;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("telecareSystem".equals(parameterName) ) {
    	this.fTelecareSystem = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) newValue;
    	return true;
    }
    if ("sensor".equals(parameterName) ) {
    	this.fSensor = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTelecareSystem(final TelecareSystem pTelecareSystem) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTelecareSystem = pTelecareSystem;
  }
  
  public void setSensor(final Sensor pSensor) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSensor = pSensor;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_sensors";
  }
  
  @Override
  public List<String> parameterNames() {
    return Ref_viewModel_sensorsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTelecareSystem, fSensor};
  }
  
  @Override
  public Ref_viewModel_sensorsMatch toImmutable() {
    return isMutable() ? newMatch(fTelecareSystem, fSensor) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"telecareSystem\"=" + prettyPrintValue(fTelecareSystem) + ", ");
    
    result.append("\"sensor\"=" + prettyPrintValue(fSensor)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTelecareSystem == null) ? 0 : fTelecareSystem.hashCode());
    result = prime * result + ((fSensor == null) ? 0 : fSensor.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Ref_viewModel_sensorsMatch)) { // this should be infrequent
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
    Ref_viewModel_sensorsMatch other = (Ref_viewModel_sensorsMatch) obj;
    if (fTelecareSystem == null) {if (other.fTelecareSystem != null) return false;}
    else if (!fTelecareSystem.equals(other.fTelecareSystem)) return false;
    if (fSensor == null) {if (other.fSensor != null) return false;}
    else if (!fSensor.equals(other.fSensor)) return false;
    return true;
  }
  
  @Override
  public Ref_viewModel_sensorsQuerySpecification specification() {
    try {
    	return Ref_viewModel_sensorsQuerySpecification.instance();
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
  public static Ref_viewModel_sensorsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Ref_viewModel_sensorsMatch newMutableMatch(final TelecareSystem pTelecareSystem, final Sensor pSensor) {
    return new Mutable(pTelecareSystem, pSensor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Ref_viewModel_sensorsMatch newMatch(final TelecareSystem pTelecareSystem, final Sensor pSensor) {
    return new Immutable(pTelecareSystem, pSensor);
  }
  
  private static final class Mutable extends Ref_viewModel_sensorsMatch {
    Mutable(final TelecareSystem pTelecareSystem, final Sensor pSensor) {
      super(pTelecareSystem, pSensor);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Ref_viewModel_sensorsMatch {
    Immutable(final TelecareSystem pTelecareSystem, final Sensor pSensor) {
      super(pTelecareSystem, pSensor);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
