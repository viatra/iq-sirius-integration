package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.util.Family_nameQuerySpecification;
import socialnetwork_base.Man;
import socialnetwork_base.Woman;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.family_name pattern,
 * to be used in conjunction with {@link Family_nameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Family_nameMatcher
 * @see Family_nameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Family_nameMatch extends BasePatternMatch {
  private Man fFather;
  
  private Woman fMother;
  
  private String fValue;
  
  private static List<String> parameterNames = makeImmutableList("father", "mother", "value");
  
  private Family_nameMatch(final Man pFather, final Woman pMother, final String pValue) {
    this.fFather = pFather;
    this.fMother = pMother;
    this.fValue = pValue;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("father".equals(parameterName)) return this.fFather;
    if ("mother".equals(parameterName)) return this.fMother;
    if ("value".equals(parameterName)) return this.fValue;
    return null;
  }
  
  public Man getFather() {
    return this.fFather;
  }
  
  public Woman getMother() {
    return this.fMother;
  }
  
  public String getValue() {
    return this.fValue;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("father".equals(parameterName) ) {
    	this.fFather = (socialnetwork_base.Man) newValue;
    	return true;
    }
    if ("mother".equals(parameterName) ) {
    	this.fMother = (socialnetwork_base.Woman) newValue;
    	return true;
    }
    if ("value".equals(parameterName) ) {
    	this.fValue = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setFather(final Man pFather) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fFather = pFather;
  }
  
  public void setMother(final Woman pMother) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMother = pMother;
  }
  
  public void setValue(final String pValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fValue = pValue;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.manyone2.design.patterns.family_name";
  }
  
  @Override
  public List<String> parameterNames() {
    return Family_nameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fFather, fMother, fValue};
  }
  
  @Override
  public Family_nameMatch toImmutable() {
    return isMutable() ? newMatch(fFather, fMother, fValue) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"father\"=" + prettyPrintValue(fFather) + ", ");
    
    result.append("\"mother\"=" + prettyPrintValue(fMother) + ", ");
    
    result.append("\"value\"=" + prettyPrintValue(fValue)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fFather == null) ? 0 : fFather.hashCode());
    result = prime * result + ((fMother == null) ? 0 : fMother.hashCode());
    result = prime * result + ((fValue == null) ? 0 : fValue.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Family_nameMatch)) { // this should be infrequent
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
    Family_nameMatch other = (Family_nameMatch) obj;
    if (fFather == null) {if (other.fFather != null) return false;}
    else if (!fFather.equals(other.fFather)) return false;
    if (fMother == null) {if (other.fMother != null) return false;}
    else if (!fMother.equals(other.fMother)) return false;
    if (fValue == null) {if (other.fValue != null) return false;}
    else if (!fValue.equals(other.fValue)) return false;
    return true;
  }
  
  @Override
  public Family_nameQuerySpecification specification() {
    try {
    	return Family_nameQuerySpecification.instance();
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
  public static Family_nameMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Family_nameMatch newMutableMatch(final Man pFather, final Woman pMother, final String pValue) {
    return new Mutable(pFather, pMother, pValue);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pFather the fixed value of pattern parameter father, or null if not bound.
   * @param pMother the fixed value of pattern parameter mother, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static Family_nameMatch newMatch(final Man pFather, final Woman pMother, final String pValue) {
    return new Immutable(pFather, pMother, pValue);
  }
  
  private static final class Mutable extends Family_nameMatch {
    Mutable(final Man pFather, final Woman pMother, final String pValue) {
      super(pFather, pMother, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Family_nameMatch {
    Immutable(final Man pFather, final Woman pMother, final String pValue) {
      super(pFather, pMother, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
