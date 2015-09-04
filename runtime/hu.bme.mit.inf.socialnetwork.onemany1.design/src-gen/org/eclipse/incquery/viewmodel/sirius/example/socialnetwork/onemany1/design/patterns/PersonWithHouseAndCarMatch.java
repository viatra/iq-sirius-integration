package org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.util.PersonWithHouseAndCarQuerySpecification;
import socialnetwork_base.Person;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.personWithHouseAndCar pattern,
 * to be used in conjunction with {@link PersonWithHouseAndCarMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PersonWithHouseAndCarMatcher
 * @see PersonWithHouseAndCarProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PersonWithHouseAndCarMatch extends BasePatternMatch {
  private Person fPerson;
  
  private static List<String> parameterNames = makeImmutableList("person");
  
  private PersonWithHouseAndCarMatch(final Person pPerson) {
    this.fPerson = pPerson;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("person".equals(parameterName)) return this.fPerson;
    return null;
  }
  
  public Person getPerson() {
    return this.fPerson;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("person".equals(parameterName) ) {
    	this.fPerson = (socialnetwork_base.Person) newValue;
    	return true;
    }
    return false;
  }
  
  public void setPerson(final Person pPerson) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPerson = pPerson;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.onemany1.design.patterns.personWithHouseAndCar";
  }
  
  @Override
  public List<String> parameterNames() {
    return PersonWithHouseAndCarMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPerson};
  }
  
  @Override
  public PersonWithHouseAndCarMatch toImmutable() {
    return isMutable() ? newMatch(fPerson) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"person\"=" + prettyPrintValue(fPerson)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPerson == null) ? 0 : fPerson.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PersonWithHouseAndCarMatch)) { // this should be infrequent
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
    PersonWithHouseAndCarMatch other = (PersonWithHouseAndCarMatch) obj;
    if (fPerson == null) {if (other.fPerson != null) return false;}
    else if (!fPerson.equals(other.fPerson)) return false;
    return true;
  }
  
  @Override
  public PersonWithHouseAndCarQuerySpecification specification() {
    try {
    	return PersonWithHouseAndCarQuerySpecification.instance();
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
  public static PersonWithHouseAndCarMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PersonWithHouseAndCarMatch newMutableMatch(final Person pPerson) {
    return new Mutable(pPerson);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static PersonWithHouseAndCarMatch newMatch(final Person pPerson) {
    return new Immutable(pPerson);
  }
  
  private static final class Mutable extends PersonWithHouseAndCarMatch {
    Mutable(final Person pPerson) {
      super(pPerson);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PersonWithHouseAndCarMatch {
    Immutable(final Person pPerson) {
      super(pPerson);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
