package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util.Containment_socialNetwork_personQuerySpecification;
import socialnetwork_base.Person;
import socialnetwork_base.SocialNetwork;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.containment_socialNetwork_person pattern,
 * to be used in conjunction with {@link Containment_socialNetwork_personMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Containment_socialNetwork_personMatcher
 * @see Containment_socialNetwork_personProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Containment_socialNetwork_personMatch extends BasePatternMatch {
  private SocialNetwork fSn;
  
  private Person fPerson;
  
  private static List<String> parameterNames = makeImmutableList("sn", "person");
  
  private Containment_socialNetwork_personMatch(final SocialNetwork pSn, final Person pPerson) {
    this.fSn = pSn;
    this.fPerson = pPerson;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("sn".equals(parameterName)) return this.fSn;
    if ("person".equals(parameterName)) return this.fPerson;
    return null;
  }
  
  public SocialNetwork getSn() {
    return this.fSn;
  }
  
  public Person getPerson() {
    return this.fPerson;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("sn".equals(parameterName) ) {
    	this.fSn = (socialnetwork_base.SocialNetwork) newValue;
    	return true;
    }
    if ("person".equals(parameterName) ) {
    	this.fPerson = (socialnetwork_base.Person) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSn(final SocialNetwork pSn) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSn = pSn;
  }
  
  public void setPerson(final Person pPerson) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPerson = pPerson;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.containment_socialNetwork_person";
  }
  
  @Override
  public List<String> parameterNames() {
    return Containment_socialNetwork_personMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSn, fPerson};
  }
  
  @Override
  public Containment_socialNetwork_personMatch toImmutable() {
    return isMutable() ? newMatch(fSn, fPerson) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"sn\"=" + prettyPrintValue(fSn) + ", ");
    
    result.append("\"person\"=" + prettyPrintValue(fPerson)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSn == null) ? 0 : fSn.hashCode());
    result = prime * result + ((fPerson == null) ? 0 : fPerson.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Containment_socialNetwork_personMatch)) { // this should be infrequent
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
    Containment_socialNetwork_personMatch other = (Containment_socialNetwork_personMatch) obj;
    if (fSn == null) {if (other.fSn != null) return false;}
    else if (!fSn.equals(other.fSn)) return false;
    if (fPerson == null) {if (other.fPerson != null) return false;}
    else if (!fPerson.equals(other.fPerson)) return false;
    return true;
  }
  
  @Override
  public Containment_socialNetwork_personQuerySpecification specification() {
    try {
    	return Containment_socialNetwork_personQuerySpecification.instance();
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
  public static Containment_socialNetwork_personMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Containment_socialNetwork_personMatch newMutableMatch(final SocialNetwork pSn, final Person pPerson) {
    return new Mutable(pSn, pPerson);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSn the fixed value of pattern parameter sn, or null if not bound.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Containment_socialNetwork_personMatch newMatch(final SocialNetwork pSn, final Person pPerson) {
    return new Immutable(pSn, pPerson);
  }
  
  private static final class Mutable extends Containment_socialNetwork_personMatch {
    Mutable(final SocialNetwork pSn, final Person pPerson) {
      super(pSn, pPerson);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Containment_socialNetwork_personMatch {
    Immutable(final SocialNetwork pSn, final Person pPerson) {
      super(pSn, pPerson);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
