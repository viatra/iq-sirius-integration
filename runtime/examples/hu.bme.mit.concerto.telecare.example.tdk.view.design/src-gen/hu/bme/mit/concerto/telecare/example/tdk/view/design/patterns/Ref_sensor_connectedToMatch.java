package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_sensor_connectedToQuerySpecification;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_sensor_connectedTo pattern,
 * to be used in conjunction with {@link Ref_sensor_connectedToMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Ref_sensor_connectedToMatcher
 * @see Ref_sensor_connectedToProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Ref_sensor_connectedToMatch extends BasePatternMatch {
  private Sensor fSensor;
  
  private Host fHost;
  
  private static List<String> parameterNames = makeImmutableList("sensor", "host");
  
  private Ref_sensor_connectedToMatch(final Sensor pSensor, final Host pHost) {
    this.fSensor = pSensor;
    this.fHost = pHost;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("sensor".equals(parameterName)) return this.fSensor;
    if ("host".equals(parameterName)) return this.fHost;
    return null;
  }
  
  public Sensor getSensor() {
    return this.fSensor;
  }
  
  public Host getHost() {
    return this.fHost;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("sensor".equals(parameterName) ) {
    	this.fSensor = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor) newValue;
    	return true;
    }
    if ("host".equals(parameterName) ) {
    	this.fHost = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSensor(final Sensor pSensor) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSensor = pSensor;
  }
  
  public void setHost(final Host pHost) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fHost = pHost;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_sensor_connectedTo";
  }
  
  @Override
  public List<String> parameterNames() {
    return Ref_sensor_connectedToMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSensor, fHost};
  }
  
  @Override
  public Ref_sensor_connectedToMatch toImmutable() {
    return isMutable() ? newMatch(fSensor, fHost) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"sensor\"=" + prettyPrintValue(fSensor) + ", ");
    
    result.append("\"host\"=" + prettyPrintValue(fHost)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSensor == null) ? 0 : fSensor.hashCode());
    result = prime * result + ((fHost == null) ? 0 : fHost.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Ref_sensor_connectedToMatch)) { // this should be infrequent
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
    Ref_sensor_connectedToMatch other = (Ref_sensor_connectedToMatch) obj;
    if (fSensor == null) {if (other.fSensor != null) return false;}
    else if (!fSensor.equals(other.fSensor)) return false;
    if (fHost == null) {if (other.fHost != null) return false;}
    else if (!fHost.equals(other.fHost)) return false;
    return true;
  }
  
  @Override
  public Ref_sensor_connectedToQuerySpecification specification() {
    try {
    	return Ref_sensor_connectedToQuerySpecification.instance();
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
  public static Ref_sensor_connectedToMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Ref_sensor_connectedToMatch newMutableMatch(final Sensor pSensor, final Host pHost) {
    return new Mutable(pSensor, pHost);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Ref_sensor_connectedToMatch newMatch(final Sensor pSensor, final Host pHost) {
    return new Immutable(pSensor, pHost);
  }
  
  private static final class Mutable extends Ref_sensor_connectedToMatch {
    Mutable(final Sensor pSensor, final Host pHost) {
      super(pSensor, pHost);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Ref_sensor_connectedToMatch {
    Immutable(final Sensor pSensor, final Host pHost) {
      super(pSensor, pHost);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
