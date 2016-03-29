package org.eclipse.incquery.viewmodel.traceability.util;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.viatra.query.runtime.api.GenericQuerySpecification;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;

import com.google.common.collect.Maps;

public abstract class HiddenParametersMatch extends BasePatternMatch {

	private HiddenParametersQuerySpecification specification = null;
	
	private Object[] parameters;
	
	
	private HiddenParametersMatch(HiddenParametersQuerySpecification specification, Object[] parameters) {
		super();
		this.specification = specification;
		this.parameters = parameters;
	}
	
	@Override
	public HiddenParametersQuerySpecification specification() {
		return specification;
	}

	@Override
	public Object get(String parameterName) {
        Integer index = specification.getPositionOfParameter(parameterName);
        return index == null ? null : parameters[index];
	}

    @Override
    public boolean set(String parameterName, Object newValue) {
    	if (!isMutable()) throw new UnsupportedOperationException();
        Integer index = specification.getPositionOfParameter(parameterName);
        if (index == null)
            return false;
        parameters[index] = newValue;
        return true;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(parameters, parameters.length);
    }

	@Override
	public IPatternMatch toImmutable() {
		return isMutable() ? newMatch(specification, parameters) : this;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        for (int i = 0; i < parameters.length; ++i)
            result = prime * result + ((parameters[i] == null) ? 0 : parameters[i].hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof HiddenParametersMatch)) { // this should be infrequent
	        if (obj == null)
	            return false;
	        if (!(obj instanceof IPatternMatch))
	            return false;
	        IPatternMatch other = (IPatternMatch) obj;
	        if (!specification().equals(other.specification()))
	            return false;
	        return Arrays.deepEquals(parameters, other.toArray());
        }
    	final HiddenParametersMatch other = (HiddenParametersMatch) obj;
		return specification().equals(other.specification()) && Arrays.deepEquals(parameters, other.parameters);
    }

    @Override
    public String prettyPrint() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < parameters.length; ++i) {
            if (i != 0)
                result.append(", ");
            result.append("\"" + parameterNames().get(i) + "\"=" + prettyPrintValue(parameters[i]));
        }
        return result.toString();
    }
    
	// TODO JAVADOC
	// TODO teszt
	public Map<String, Object> getVisibleParameters() {
		Map<String, Object> result = Maps.newHashMap();

		for (PParameter parameter : specification.getInternalQueryRepresentation().getVisibleParameters()) {
			result.put(parameter.getName(), get(parameter.getName()));
		}
		
		return result;
	}
	
	// TODO javadoc
	// TODO teszt
	public Map<String, Object> getHiddenParameters() {
		Map<String, Object> result = Maps.newHashMap();

		for (PParameter parameter : specification.getInternalQueryRepresentation().getHiddenParameters()) {
			result.put(parameter.getName(), get(parameter.getName()));
		}
		
		return result;
	}
    
    /**
     * Returns an empty, mutable match. 
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input. 
     * 
     * @return the empty match
     */
    public static HiddenParametersMatch newEmptyMatch(HiddenParametersQuerySpecification specification) {
  	  return new Mutable(specification, new Object[specification.getParameters().size()]);
    }

    /**
     * Returns a mutable (partial) match. 
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input. 
     * 
     * @param parameters
     *            the fixed value of pattern parameters, or null if not bound.
     * @return the new, mutable (partial) match object.
     */
    public static HiddenParametersMatch newMutableMatch(HiddenParametersQuerySpecification specification, Object... parameters) {
  	  return new Mutable(specification, parameters);
    }

    /**
     * Returns a new (partial) match. 
     * This can be used e.g. to call the matcher with a partial match. 
     * 
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch(GenericQuerySpecification)} to obtain a mutable match object.
     * 
     * @param parameters
     *            the fixed value of pattern parameters, or null if not bound.
     * @return the (partial) match object.
     */
    public static HiddenParametersMatch newMatch(HiddenParametersQuerySpecification specification, Object... parameters) {
  	  return new Immutable(specification, Arrays.copyOf(parameters, parameters.length));
    }    
    
    static final class Mutable extends HiddenParametersMatch {
		Mutable(HiddenParametersQuerySpecification specification, Object[] array) {
			super(specification, array);
		}

		@Override
		public boolean isMutable() {
			return true;
		}
    }
    static final class Immutable extends HiddenParametersMatch {
    	Immutable(HiddenParametersQuerySpecification specification, Object[] array) {
			super(specification, array);
		}

		@Override
		public boolean isMutable() {
			return false;
		}
    }
}
