package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util.SocialNetworkQuerySpecification;
import socialnetwork_base.SocialNetwork;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.socialNetwork pattern,
 * to be used in conjunction with {@link SocialNetworkMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SocialNetworkMatcher
 * @see SocialNetworkProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SocialNetworkMatch extends BasePatternMatch {
  private SocialNetwork fSn;
  
  private static List<String> parameterNames = makeImmutableList("sn");
  
  private SocialNetworkMatch(final SocialNetwork pSn) {
    this.fSn = pSn;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("sn".equals(parameterName)) return this.fSn;
    return null;
  }
  
  public SocialNetwork getSn() {
    return this.fSn;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("sn".equals(parameterName) ) {
    	this.fSn = (socialnetwork_base.SocialNetwork) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSn(final SocialNetwork pSn) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSn = pSn;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.socialNetwork";
  }
  
  @Override
  public List<String> parameterNames() {
    return SocialNetworkMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSn};
  }
  
  @Override
  public SocialNetworkMatch toImmutable() {
    return isMutable() ? newMatch(fSn) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"sn\"=" + prettyPrintValue(fSn)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSn == null) ? 0 : fSn.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SocialNetworkMatch)) { // this should be infrequent
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
    SocialNetworkMatch other = (SocialNetworkMatch) obj;
    if (fSn == null) {if (other.fSn != null) return false;}
    else if (!fSn.equals(other.fSn)) return false;
    return true;
  }
  
  @Override
  public SocialNetworkQuerySpecification specification() {
    try {
    	return SocialNetworkQuerySpecification.instance();
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
  public static SocialNetworkMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SocialNetworkMatch newMutableMatch(final SocialNetwork pSn) {
    return new Mutable(pSn);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SocialNetworkMatch newMatch(final SocialNetwork pSn) {
    return new Immutable(pSn);
  }
  
  private static final class Mutable extends SocialNetworkMatch {
    Mutable(final SocialNetwork pSn) {
      super(pSn);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SocialNetworkMatch {
    Immutable(final SocialNetwork pSn) {
      super(pSn);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
