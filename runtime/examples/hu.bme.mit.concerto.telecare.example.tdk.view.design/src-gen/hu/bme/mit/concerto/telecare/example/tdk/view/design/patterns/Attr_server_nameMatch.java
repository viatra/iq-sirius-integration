package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Attr_server_nameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_server_name pattern,
 * to be used in conjunction with {@link Attr_server_nameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Attr_server_nameMatcher
 * @see Attr_server_nameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Attr_server_nameMatch extends BasePatternMatch {
  private hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host fHost;
  
  private String fValue;
  
  private static List<String> parameterNames = makeImmutableList("host", "value");
  
  private Attr_server_nameMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost, final String pValue) {
    this.fHost = pHost;
    this.fValue = pValue;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("host".equals(parameterName)) return this.fHost;
    if ("value".equals(parameterName)) return this.fValue;
    return null;
  }
  
  public hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host getHost() {
    return this.fHost;
  }
  
  public String getValue() {
    return this.fValue;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("host".equals(parameterName) ) {
    	this.fHost = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) newValue;
    	return true;
    }
    if ("value".equals(parameterName) ) {
    	this.fValue = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setHost(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fHost = pHost;
  }
  
  public void setValue(final String pValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fValue = pValue;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.attr_server_name";
  }
  
  @Override
  public List<String> parameterNames() {
    return Attr_server_nameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fHost, fValue};
  }
  
  @Override
  public Attr_server_nameMatch toImmutable() {
    return isMutable() ? newMatch(fHost, fValue) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"host\"=" + prettyPrintValue(fHost) + ", ");
    
    result.append("\"value\"=" + prettyPrintValue(fValue)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fHost == null) ? 0 : fHost.hashCode());
    result = prime * result + ((fValue == null) ? 0 : fValue.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Attr_server_nameMatch)) { // this should be infrequent
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
    Attr_server_nameMatch other = (Attr_server_nameMatch) obj;
    if (fHost == null) {if (other.fHost != null) return false;}
    else if (!fHost.equals(other.fHost)) return false;
    if (fValue == null) {if (other.fValue != null) return false;}
    else if (!fValue.equals(other.fValue)) return false;
    return true;
  }
  
  @Override
  public Attr_server_nameQuerySpecification specification() {
    try {
    	return Attr_server_nameQuerySpecification.instance();
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
  public static Attr_server_nameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Attr_server_nameMatch newMutableMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost, final String pValue) {
    return new Mutable(pHost, pValue);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Attr_server_nameMatch newMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost, final String pValue) {
    return new Immutable(pHost, pValue);
  }
  
  private static final class Mutable extends Attr_server_nameMatch {
    Mutable(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost, final String pValue) {
      super(pHost, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Attr_server_nameMatch {
    Immutable(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost, final String pValue) {
      super(pHost, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
