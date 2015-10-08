package org.eclipse.incquery.viewmodel.traceability.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseQuerySpecification;
import org.eclipse.incquery.runtime.api.scope.IncQueryScope;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class HiddenParametersQuerySpecification extends BaseQuerySpecification<HiddenParametersPatternMatcher> {
	
	public HiddenParametersQuerySpecification(PBody body, int bodyIndex) {
		super(new HiddenParametersPQuery(body, bodyIndex));
	}

	@Override
	public HiddenParametersMatch newEmptyMatch() {
		return HiddenParametersMatch.newEmptyMatch(this);
	}

	@Override
	public HiddenParametersMatch newMatch(Object... parameters) {
		return HiddenParametersMatch.newMatch(this, parameters);
	}

	@Override
	public Class<? extends IncQueryScope> getPreferredScopeClass() {
		return EMFScope.class;
	}

	@Override
	protected HiddenParametersPatternMatcher instantiate(IncQueryEngine engine) throws IncQueryException {
		return HiddenParametersPatternMatcher.instantiate(engine, this);
	}
	
	@Override
	public HiddenParametersPQuery getInternalQueryRepresentation() {
		return (HiddenParametersPQuery) super.getInternalQueryRepresentation();
	}
	
	public static class HiddenParametersPQuery extends BaseGeneratedEMFPQuery {

		private static final String FQN_SUFFIX = "_hp";

		private int bodyIndex;

		private PBody body = null;

		private PBody originalBody = null;
		
		private List<PParameter> parameters = null;
		
		private List<PParameter> visibleParameters = null;
		
		private List<PParameter> hiddenParameters = null;

		private List<PVariable> hiddenParameterVariables = null;
		
		
		public HiddenParametersPQuery(PBody originalBody, int bodyIndex) {
			if (originalBody == null) {
				throw new IllegalArgumentException("The body parameter can not be null!");
			}
			
			this.originalBody = originalBody;
			
			this.bodyIndex = bodyIndex;
			
			this.body = new ExtendedPBodyCopier(originalBody, this).getCopiedBody();

			this.hiddenParameterVariables = getHiddenParameterVariables(this.body);
			
			this.visibleParameters = this.originalBody.getPattern().getParameters();
			
			this.hiddenParameters = Lists.newArrayList();
			for (PVariable variable : hiddenParameterVariables) {
				this.hiddenParameters.add(new PParameter(variable.getName()));
			}
			
			this.parameters = new ArrayList<PParameter>();
			this.parameters.addAll(visibleParameters);
			this.parameters.addAll(hiddenParameters);
		}
		
		@Override
		public String getFullyQualifiedName() {
			if (originalBody != null) {
				return originalBody.getPattern().getFullyQualifiedName() + FQN_SUFFIX + "_" + bodyIndex;
			}
			
			return null;
		}

		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}
		
		public List<PParameter> getVisibleParameters() {
			return visibleParameters;
		}
		
		public List<PParameter> getHiddenParameters() {
			return hiddenParameters;
		}

		@Override
		protected Set<PBody> doGetContainedBodies() throws QueryInitializationException {
			Set<PBody> result = Sets.newHashSet();
			
			List<ExportedParameter> exportedParameters = body.getSymbolicParameters();
			
			for (PVariable nonExportedVariable : hiddenParameterVariables) {
				exportedParameters.add(new ExportedParameter(body, nonExportedVariable, nonExportedVariable.getName()));
			}
			
			body.setExportedParameters(exportedParameters);

			result.add(body);

			return result;
		}
		
		// TODO javadoc
		private Set<PVariable> getExportedVariables(PBody body) {
			Set<PVariable> result = Sets.newHashSet();
			
			for (ExportedParameter exportedParameter : body.getSymbolicParameters()) {
				result.add(exportedParameter.getParameterVariable());
			}
			
			return result;
		}
		
		// TODO teszt
		// TODO javadoc
		private List<PVariable> getHiddenParameterVariables(PBody body) {
			List<PVariable> result = Lists.newArrayList();
			
			Set<PVariable> exportedVariables = getExportedVariables(body);
	
			Set<PVariable> hiddenParameterVariableCandidates = Sets.newHashSet();
			
			
			FlatTuple tuple = null;
			PVariable tupleVariable = null;
			for (TypeConstraint c : body.getConstraintsOfType(TypeConstraint.class)) {
				if (c.getVariablesTuple() instanceof FlatTuple) {
					tuple = (FlatTuple) c.getVariablesTuple();
					
					for (Object element : tuple.getElements()) {
						// TODO Mindig az?!
						if (element instanceof PVariable) {
							tupleVariable = (PVariable) element;
							
							if (!exportedVariables.contains(tupleVariable)) {
								hiddenParameterVariableCandidates.add(tupleVariable);
							}
						}
					}
				}
			}
			
			// Remove those hidden parameter candidates, which are equal to the originally exported variables
			for (PVariable exportedVariable : exportedVariables) {
				removeEqualVariables(exportedVariable, hiddenParameterVariableCandidates);
			}
			
			// Get variables for hidden parameters
			PVariable hiddenParameterVariable = null;
			while (!hiddenParameterVariableCandidates.isEmpty()) {
				hiddenParameterVariable = hiddenParameterVariableCandidates.iterator().next();
				
				result.add(hiddenParameterVariable);
				
				removeEqualVariables(hiddenParameterVariable, hiddenParameterVariableCandidates);
			}
			
			return result;
		}
		
		/**
		 * This method removes those variables from the list, which are equal to the given root variable
		 * 	(even transitively).
		 * @param rootVariable The variable, that we want to find the equals for.
		 * @param variables The list, where the equal variables are looked for.
		 */
		private void removeEqualVariables(PVariable rootVariable, Collection<PVariable> variables) {
			// Remove the given variable first
			variables.remove(rootVariable);
			
			// Find those variables, which are equal to the given root
			PVariable equalsTo = null;
			Set<PVariable> equalsToVariables = Sets.newHashSet();
			Set<Equality> equalities = rootVariable.getReferringConstraintsOfType(Equality.class);
			for (Equality equality : equalities) {
				if (equality.getWho().equals(rootVariable)) {
					equalsTo = equality.getWithWhom();
				} else {
					equalsTo = equality.getWho();
				}

				if (variables.contains(equalsTo)) {
					equalsToVariables.add(equalsTo);
					
					variables.remove(equalsTo);
				}
			}
			
			// Call this method recursively on the found variables
			for (PVariable variable : equalsToVariables) {
				removeEqualVariables(variable, variables);
			}
		}
	}
}