package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_sensor_triggeredByQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_sensor_triggeredBy pattern,
 * to be used in conjunction with {@link Ref_sensor_triggeredByMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Ref_sensor_triggeredByMatcher
 * @see Ref_sensor_triggeredByProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Ref_sensor_triggeredByMatch extends BasePatternMatch {
  private hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor fSensor;
  
  private hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger fTrigger;
  
  private static List<String> parameterNames = makeImmutableList("sensor", "trigger");
  
  private Ref_sensor_triggeredByMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
    this.fSensor = pSensor;
    this.fTrigger = pTrigger;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("sensor".equals(parameterName)) return this.fSensor;
    if ("trigger".equals(parameterName)) return this.fTrigger;
    return null;
  }
  
  public hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor getSensor() {
    return this.fSensor;
  }
  
  public hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger getTrigger() {
    return this.fTrigger;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("sensor".equals(parameterName) ) {
    	this.fSensor = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) newValue;
    	return true;
    }
    if ("trigger".equals(parameterName) ) {
    	this.fTrigger = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSensor(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSensor = pSensor;
  }
  
  public void setTrigger(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrigger = pTrigger;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_sensor_triggeredBy";
  }
  
  @Override
  public List<String> parameterNames() {
    return Ref_sensor_triggeredByMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSensor, fTrigger};
  }
  
  @Override
  public Ref_sensor_triggeredByMatch toImmutable() {
    return isMutable() ? newMatch(fSensor, fTrigger) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"sensor\"=" + prettyPrintValue(fSensor) + ", ");
    
    result.append("\"trigger\"=" + prettyPrintValue(fTrigger)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSensor == null) ? 0 : fSensor.hashCode());
    result = prime * result + ((fTrigger == null) ? 0 : fTrigger.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Ref_sensor_triggeredByMatch)) { // this should be infrequent
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
    Ref_sensor_triggeredByMatch other = (Ref_sensor_triggeredByMatch) obj;
    if (fSensor == null) {if (other.fSensor != null) return false;}
    else if (!fSensor.equals(other.fSensor)) return false;
    if (fTrigger == null) {if (other.fTrigger != null) return false;}
    else if (!fTrigger.equals(other.fTrigger)) return false;
    return true;
  }
  
  @Override
  public Ref_sensor_triggeredByQuerySpecification specification() {
    try {
    	return Ref_sensor_triggeredByQuerySpecification.instance();
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
  public static Ref_sensor_triggeredByMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Ref_sensor_triggeredByMatch newMutableMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
    return new Mutable(pSensor, pTrigger);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Ref_sensor_triggeredByMatch newMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
    return new Immutable(pSensor, pTrigger);
  }
  
  private static final class Mutable extends Ref_sensor_triggeredByMatch {
    Mutable(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
      super(pSensor, pTrigger);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Ref_sensor_triggeredByMatch {
    Immutable(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor pSensor, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger pTrigger) {
      super(pSensor, pTrigger);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
