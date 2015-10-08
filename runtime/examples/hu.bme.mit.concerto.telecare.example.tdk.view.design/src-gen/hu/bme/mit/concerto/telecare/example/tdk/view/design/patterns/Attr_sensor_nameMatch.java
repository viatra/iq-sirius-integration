package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Attr_sensor_nameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_sensor_name pattern,
 * to be used in conjunction with {@link Attr_sensor_nameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Attr_sensor_nameMatcher
 * @see Attr_sensor_nameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Attr_sensor_nameMatch extends BasePatternMatch {
  private hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor fSensor;
  
  private String fValue;
  
  private static List<String> parameterNames = makeImmutableList("sensor", "value");
  
  private Attr_sensor_nameMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue) {
    this.fSensor = pSensor;
    this.fValue = pValue;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("sensor".equals(parameterName)) return this.fSensor;
    if ("value".equals(parameterName)) return this.fValue;
    return null;
  }
  
  public hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor getSensor() {
    return this.fSensor;
  }
  
  public String getValue() {
    return this.fValue;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("sensor".equals(parameterName) ) {
    	this.fSensor = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) newValue;
    	return true;
    }
    if ("value".equals(parameterName) ) {
    	this.fValue = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSensor(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSensor = pSensor;
  }
  
  public void setValue(final String pValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fValue = pValue;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_sensor_name";
  }
  
  @Override
  public List<String> parameterNames() {
    return Attr_sensor_nameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSensor, fValue};
  }
  
  @Override
  public Attr_sensor_nameMatch toImmutable() {
    return isMutable() ? newMatch(fSensor, fValue) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"sensor\"=" + prettyPrintValue(fSensor) + ", ");
    
    result.append("\"value\"=" + prettyPrintValue(fValue)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSensor == null) ? 0 : fSensor.hashCode());
    result = prime * result + ((fValue == null) ? 0 : fValue.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Attr_sensor_nameMatch)) { // this should be infrequent
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
    Attr_sensor_nameMatch other = (Attr_sensor_nameMatch) obj;
    if (fSensor == null) {if (other.fSensor != null) return false;}
    else if (!fSensor.equals(other.fSensor)) return false;
    if (fValue == null) {if (other.fValue != null) return false;}
    else if (!fValue.equals(other.fValue)) return false;
    return true;
  }
  
  @Override
  public Attr_sensor_nameQuerySpecification specification() {
    try {
    	return Attr_sensor_nameQuerySpecification.instance();
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
  public static Attr_sensor_nameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Attr_sensor_nameMatch newMutableMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue) {
    return new Mutable(pSensor, pValue);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Attr_sensor_nameMatch newMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue) {
    return new Immutable(pSensor, pValue);
  }
  
  private static final class Mutable extends Attr_sensor_nameMatch {
    Mutable(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue) {
      super(pSensor, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Attr_sensor_nameMatch {
    Immutable(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final String pValue) {
      super(pSensor, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
