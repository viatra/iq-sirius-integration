package org.eclipse.incquery.viewmodel.traceability.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.incquery.runtime.api.GenericPatternMatcher;
import org.eclipse.incquery.runtime.api.GenericQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.scope.IncQueryScope;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.psystem.rewriters.PBodyCopier;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class HiddenParametersQuerySpecification extends GenericQuerySpecification<GenericPatternMatcher> {

	
	public HiddenParametersQuerySpecification(PQuery wrappedPQuery) {
		super(wrappedPQuery);
	}

	@Override
	public Class<? extends IncQueryScope> getPreferredScopeClass() {
		return EMFScope.class;
	}

	@Override
	protected GenericPatternMatcher instantiate(IncQueryEngine engine)
			throws IncQueryException {
		GenericPatternMatcher matcher = defaultInstantiate(engine);
        return matcher;
	}
	
	public static class HiddenParametersPQuery extends BaseGeneratedEMFPQuery {

		private static final String FQN_SUFFIX = "_hp";

		private int index;

		private PBody body = null;
		
		private List<PParameter> parameters = null;
		
		private List<PVariable> nonExportedVariables = null;
		
		
		public HiddenParametersPQuery(PBody body, int index) {
			if (body == null) {
				throw new IllegalArgumentException("The body parameter can not be null!");
			}
			
			this.body = body;
			
			this.index = index;
			
			this.nonExportedVariables = getNonExportedVariables();
			
			this.parameters = new ArrayList<PParameter>();
			this.parameters.addAll(this.body.getPattern().getParameters());
			for (PVariable variable : nonExportedVariables) {
				this.parameters.add(new PParameter(variable.getName()));
			}
		}
		
		@Override
		public String getFullyQualifiedName() {
			if (body != null) {
				return body.getPattern().getFullyQualifiedName() + FQN_SUFFIX + "_" + index;
			}
			
			return null;
		}

		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}

		@Override
		protected Set<PBody> doGetContainedBodies() throws QueryInitializationException {
			Set<PBody> result = Sets.newHashSet();

			PBody newBody = new PBodyCopier(body).getCopiedBody();
			
			List<ExportedParameter> exportedParameters = newBody.getSymbolicParameters();
			for (PVariable variable : nonExportedVariables) {
				exportedParameters.add(new ExportedParameter(newBody, variable, variable.getName()));
			}
			
			newBody.setExportedParameters(exportedParameters);

			result.add(newBody);

			return result;
		}
		
		private List<PVariable> getNonExportedVariables() {
			List<PVariable> variables = Lists.newArrayList(body.getAllVariables());
			variables.removeAll(body.getSymbolicParameterVariables());
			
			PVariable variable = null;
			Iterator<PVariable> iterator = variables.iterator();
			while (iterator.hasNext()) {
				variable = iterator.next();
				
				if (variable.isVirtual() || !variable.isDeducable()) {
					iterator.remove();
				}
			}
			
			return variables;
		}
	}
}