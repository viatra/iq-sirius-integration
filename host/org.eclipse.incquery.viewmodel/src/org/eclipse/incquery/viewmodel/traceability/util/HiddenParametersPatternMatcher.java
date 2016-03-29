package org.eclipse.incquery.viewmodel.traceability.util;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;

public class HiddenParametersPatternMatcher extends BaseMatcher<HiddenParametersMatch> {

	/**
	 * Initializes the pattern matcher within an existing EMF-IncQuery engine.
	 * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
	 * The match set will be incrementally refreshed upon updates.
	 * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
	 * @throws IncQueryException if an error occurs during pattern matcher creation
	 * 
	 */
	public static HiddenParametersPatternMatcher instantiate(final ViatraQueryEngine engine, final HiddenParametersQuerySpecification specification) throws ViatraQueryException {
		// check if matcher already exists
		HiddenParametersPatternMatcher matcher = engine.getExistingMatcher(specification);
		if (matcher == null) {
			matcher = new HiddenParametersPatternMatcher(engine, specification);
			// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
		}
		return matcher;
	}
	
	protected HiddenParametersPatternMatcher(ViatraQueryEngine engine,
			HiddenParametersQuerySpecification specification) throws ViatraQueryException {
		super(engine, specification);
	}

	@Override
	protected HiddenParametersMatch arrayToMatch(Object[] parameters) {
		return HiddenParametersMatch.newMatch((HiddenParametersQuerySpecification) getSpecification(), parameters);
	}

	@Override
	protected HiddenParametersMatch arrayToMatchMutable(Object[] parameters) {
		return HiddenParametersMatch.newMutableMatch((HiddenParametersQuerySpecification) getSpecification(), parameters);
	}

	@Override
	protected HiddenParametersMatch tupleToMatch(Tuple t) {
		return new HiddenParametersMatch.Immutable((HiddenParametersQuerySpecification) getSpecification(), t.getElements());
	}
}
