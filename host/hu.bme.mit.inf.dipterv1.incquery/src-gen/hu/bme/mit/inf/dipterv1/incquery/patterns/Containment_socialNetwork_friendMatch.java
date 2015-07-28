package hu.bme.mit.inf.dipterv1.incquery.patterns;

import hu.bme.mit.inf.dipterv1.incquery.patterns.util.Containment_socialNetwork_friendQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import socialnetwork_base.Man;
import socialnetwork_base.SocialNetwork;
import socialnetwork_base.Woman;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.dipterv1.incquery.patterns.containment_socialNetwork_friend pattern,
 * to be used in conjunction with {@link Containment_socialNetwork_friendMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Containment_socialNetwork_friendMatcher
 * @see Containment_socialNetwork_friendProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Containment_socialNetwork_friendMatch extends BasePatternMatch {
  private SocialNetwork fSn;
  
  private Man fF1;
  
  private Woman fM1;
  
  private Man fF2;
  
  private Woman fM2;
  
  private static List<String> parameterNames = makeImmutableList("sn", "f1", "m1", "f2", "m2");
  
  private Containment_socialNetwork_friendMatch(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
    this.fSn = pSn;
    this.fF1 = pF1;
    this.fM1 = pM1;
    this.fF2 = pF2;
    this.fM2 = pM2;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("sn".equals(parameterName)) return this.fSn;
    if ("f1".equals(parameterName)) return this.fF1;
    if ("m1".equals(parameterName)) return this.fM1;
    if ("f2".equals(parameterName)) return this.fF2;
    if ("m2".equals(parameterName)) return this.fM2;
    return null;
  }
  
  public SocialNetwork getSn() {
    return this.fSn;
  }
  
  public Man getF1() {
    return this.fF1;
  }
  
  public Woman getM1() {
    return this.fM1;
  }
  
  public Man getF2() {
    return this.fF2;
  }
  
  public Woman getM2() {
    return this.fM2;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("sn".equals(parameterName) ) {
    	this.fSn = (socialnetwork_base.SocialNetwork) newValue;
    	return true;
    }
    if ("f1".equals(parameterName) ) {
    	this.fF1 = (socialnetwork_base.Man) newValue;
    	return true;
    }
    if ("m1".equals(parameterName) ) {
    	this.fM1 = (socialnetwork_base.Woman) newValue;
    	return true;
    }
    if ("f2".equals(parameterName) ) {
    	this.fF2 = (socialnetwork_base.Man) newValue;
    	return true;
    }
    if ("m2".equals(parameterName) ) {
    	this.fM2 = (socialnetwork_base.Woman) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSn(final SocialNetwork pSn) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSn = pSn;
  }
  
  public void setF1(final Man pF1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fF1 = pF1;
  }
  
  public void setM1(final Woman pM1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fM1 = pM1;
  }
  
  public void setF2(final Man pF2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fF2 = pF2;
  }
  
  public void setM2(final Woman pM2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fM2 = pM2;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.dipterv1.incquery.patterns.containment_socialNetwork_friend";
  }
  
  @Override
  public List<String> parameterNames() {
    return Containment_socialNetwork_friendMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSn, fF1, fM1, fF2, fM2};
  }
  
  @Override
  public Containment_socialNetwork_friendMatch toImmutable() {
    return isMutable() ? newMatch(fSn, fF1, fM1, fF2, fM2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"sn\"=" + prettyPrintValue(fSn) + ", ");
    
    result.append("\"f1\"=" + prettyPrintValue(fF1) + ", ");
    
    result.append("\"m1\"=" + prettyPrintValue(fM1) + ", ");
    
    result.append("\"f2\"=" + prettyPrintValue(fF2) + ", ");
    
    result.append("\"m2\"=" + prettyPrintValue(fM2)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSn == null) ? 0 : fSn.hashCode());
    result = prime * result + ((fF1 == null) ? 0 : fF1.hashCode());
    result = prime * result + ((fM1 == null) ? 0 : fM1.hashCode());
    result = prime * result + ((fF2 == null) ? 0 : fF2.hashCode());
    result = prime * result + ((fM2 == null) ? 0 : fM2.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Containment_socialNetwork_friendMatch)) { // this should be infrequent
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
    Containment_socialNetwork_friendMatch other = (Containment_socialNetwork_friendMatch) obj;
    if (fSn == null) {if (other.fSn != null) return false;}
    else if (!fSn.equals(other.fSn)) return false;
    if (fF1 == null) {if (other.fF1 != null) return false;}
    else if (!fF1.equals(other.fF1)) return false;
    if (fM1 == null) {if (other.fM1 != null) return false;}
    else if (!fM1.equals(other.fM1)) return false;
    if (fF2 == null) {if (other.fF2 != null) return false;}
    else if (!fF2.equals(other.fF2)) return false;
    if (fM2 == null) {if (other.fM2 != null) return false;}
    else if (!fM2.equals(other.fM2)) return false;
    return true;
  }
  
  @Override
  public Containment_socialNetwork_friendQuerySpecification specification() {
    try {
    	return Containment_socialNetwork_friendQuerySpecification.instance();
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
  public static Containment_socialNetwork_friendMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pF1 the fixed value of pattern parameter f1, or null if not bound.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pF2 the fixed value of pattern parameter f2, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Containment_socialNetwork_friendMatch newMutableMatch(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
    return new Mutable(pSn, pF1, pM1, pF2, pM2);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pF1 the fixed value of pattern parameter f1, or null if not bound.
   * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
   * @param pF2 the fixed value of pattern parameter f2, or null if not bound.
   * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Containment_socialNetwork_friendMatch newMatch(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
    return new Immutable(pSn, pF1, pM1, pF2, pM2);
  }
  
  private static final class Mutable extends Containment_socialNetwork_friendMatch {
    Mutable(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
      super(pSn, pF1, pM1, pF2, pM2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Containment_socialNetwork_friendMatch {
    Immutable(final SocialNetwork pSn, final Man pF1, final Woman pM1, final Man pF2, final Woman pM2) {
      super(pSn, pF1, pM1, pF2, pM2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
