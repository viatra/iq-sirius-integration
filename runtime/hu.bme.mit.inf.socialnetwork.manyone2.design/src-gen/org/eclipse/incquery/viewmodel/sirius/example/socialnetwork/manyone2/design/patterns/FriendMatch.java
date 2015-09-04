package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util.FriendQuerySpecification;
import socialnetwork_base.Man;
import socialnetwork_base.Woman;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.friend pattern,
 * to be used in conjunction with {@link FriendMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see FriendMatcher
 * @see FriendProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class FriendMatch extends BasePatternMatch {
  private Man fM1;
  
  private Woman fW1;
  
  private Man fM2;
  
  private Woman fW2;
  
  private static List<String> parameterNames = makeImmutableList("m1", "w1", "m2", "w2");
  
  private FriendMatch(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2) {
    this.fM1 = pM1;
    this.fW1 = pW1;
    this.fM2 = pM2;
    this.fW2 = pW2;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("m1".equals(parameterName)) return this.fM1;
    if ("w1".equals(parameterName)) return this.fW1;
    if ("m2".equals(parameterName)) return this.fM2;
    if ("w2".equals(parameterName)) return this.fW2;
    return null;
  }
  
  public Man getM1() {
    return this.fM1;
  }
  
  public Woman getW1() {
    return this.fW1;
  }
  
  public Man getM2() {
    return this.fM2;
  }
  
  public Woman getW2() {
    return this.fW2;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("m1".equals(parameterName) ) {
    	this.fM1 = (socialnetwork_base.Man) newValue;
    	return true;
    }
    if ("w1".equals(parameterName) ) {
    	this.fW1 = (socialnetwork_base.Woman) newValue;
    	return true;
    }
    if ("m2".equals(parameterName) ) {
    	this.fM2 = (socialnetwork_base.Man) newValue;
    	return true;
    }
    if ("w2".equals(parameterName) ) {
    	this.fW2 = (socialnetwork_base.Woman) newValue;
    	return true;
    }
    return false;
  }
  
  public void setM1(final Man pM1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fM1 = pM1;
  }
  
  public void setW1(final Woman pW1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fW1 = pW1;
  }
  
  public void setM2(final Man pM2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fM2 = pM2;
  }
  
  public void setW2(final Woman pW2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fW2 = pW2;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.friend";
  }
  
  @Override
  public List<String> parameterNames() {
    return FriendMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fM1, fW1, fM2, fW2};
  }
  
  @Override
  public FriendMatch toImmutable() {
    return isMutable() ? newMatch(fM1, fW1, fM2, fW2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"m1\"=" + prettyPrintValue(fM1) + ", ");
    
    result.append("\"w1\"=" + prettyPrintValue(fW1) + ", ");
    
    result.append("\"m2\"=" + prettyPrintValue(fM2) + ", ");
    
    result.append("\"w2\"=" + prettyPrintValue(fW2)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fM1 == null) ? 0 : fM1.hashCode());
    result = prime * result + ((fW1 == null) ? 0 : fW1.hashCode());
    result = prime * result + ((fM2 == null) ? 0 : fM2.hashCode());
    result = prime * result + ((fW2 == null) ? 0 : fW2.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof FriendMatch)) { // this should be infrequent
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
    FriendMatch other = (FriendMatch) obj;
    if (fM1 == null) {if (other.fM1 != null) return false;}
    else if (!fM1.equals(other.fM1)) return false;
    if (fW1 == null) {if (other.fW1 != null) return false;}
    else if (!fW1.equals(other.fW1)) return false;
    if (fM2 == null) {if (other.fM2 != null) return false;}
    else if (!fM2.equals(other.fM2)) return false;
    if (fW2 == null) {if (other.fW2 != null) return false;}
    else if (!fW2.equals(other.fW2)) return false;
    return true;
  }
  
  @Override
  public FriendQuerySpecification specification() {
    try {
    	return FriendQuerySpecification.instance();
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
  public static FriendMatch newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pW1 the fixed value of pattern parameter w1, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param pW2 the fixed value of pattern parameter w2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static FriendMatch newMutableMatch(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2) {
    return new Mutable(pM1, pW1, pM2, pW2);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pW1 the fixed value of pattern parameter w1, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @param pW2 the fixed value of pattern parameter w2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static FriendMatch newMatch(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2) {
    return new Immutable(pM1, pW1, pM2, pW2);
  }
  
  private static final class Mutable extends FriendMatch {
    Mutable(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2) {
      super(pM1, pW1, pM2, pW2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends FriendMatch {
    Immutable(final Man pM1, final Woman pW1, final Man pM2, final Woman pW2) {
      super(pM1, pW1, pM2, pW2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
