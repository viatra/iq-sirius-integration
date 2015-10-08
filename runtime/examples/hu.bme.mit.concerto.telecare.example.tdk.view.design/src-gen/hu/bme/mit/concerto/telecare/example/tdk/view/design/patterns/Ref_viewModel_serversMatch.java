package hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns;

import hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.util.Ref_viewModel_serversQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_servers pattern,
 * to be used in conjunction with {@link Ref_viewModel_serversMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Ref_viewModel_serversMatcher
 * @see Ref_viewModel_serversProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Ref_viewModel_serversMatch extends BasePatternMatch {
  private hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem fTelecareSystem;
  
  private hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host fHost;
  
  private static List<String> parameterNames = makeImmutableList("telecareSystem", "host");
  
  private Ref_viewModel_serversMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    this.fTelecareSystem = pTelecareSystem;
    this.fHost = pHost;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("telecareSystem".equals(parameterName)) return this.fTelecareSystem;
    if ("host".equals(parameterName)) return this.fHost;
    return null;
  }
  
  public hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem getTelecareSystem() {
    return this.fTelecareSystem;
  }
  
  public hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host getHost() {
    return this.fHost;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("telecareSystem".equals(parameterName) ) {
    	this.fTelecareSystem = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem) newValue;
    	return true;
    }
    if ("host".equals(parameterName) ) {
    	this.fHost = (hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTelecareSystem(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTelecareSystem = pTelecareSystem;
  }
  
  public void setHost(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fHost = pHost;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.concerto.telecare.example.tdk.view.design.patterns.ref_viewModel_servers";
  }
  
  @Override
  public List<String> parameterNames() {
    return Ref_viewModel_serversMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTelecareSystem, fHost};
  }
  
  @Override
  public Ref_viewModel_serversMatch toImmutable() {
    return isMutable() ? newMatch(fTelecareSystem, fHost) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"telecareSystem\"=" + prettyPrintValue(fTelecareSystem) + ", ");
    
    result.append("\"host\"=" + prettyPrintValue(fHost)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTelecareSystem == null) ? 0 : fTelecareSystem.hashCode());
    result = prime * result + ((fHost == null) ? 0 : fHost.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Ref_viewModel_serversMatch)) { // this should be infrequent
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
    Ref_viewModel_serversMatch other = (Ref_viewModel_serversMatch) obj;
    if (fTelecareSystem == null) {if (other.fTelecareSystem != null) return false;}
    else if (!fTelecareSystem.equals(other.fTelecareSystem)) return false;
    if (fHost == null) {if (other.fHost != null) return false;}
    else if (!fHost.equals(other.fHost)) return false;
    return true;
  }
  
  @Override
  public Ref_viewModel_serversQuerySpecification specification() {
    try {
    	return Ref_viewModel_serversQuerySpecification.instance();
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
  public static Ref_viewModel_serversMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Ref_viewModel_serversMatch newMutableMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return new Mutable(pTelecareSystem, pHost);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTelecareSystem the fixed value of pattern parameter telecareSystem, or null if not bound.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Ref_viewModel_serversMatch newMatch(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
    return new Immutable(pTelecareSystem, pHost);
  }
  
  private static final class Mutable extends Ref_viewModel_serversMatch {
    Mutable(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
      super(pTelecareSystem, pHost);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Ref_viewModel_serversMatch {
    Immutable(final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem pTelecareSystem, final hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host pHost) {
      super(pTelecareSystem, pHost);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
