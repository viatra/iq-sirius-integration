package org.eclipse.incquery.viewmodel.traceability.util;

import java.util.List;
import java.util.Set;

import org.eclipse.incquery.runtime.api.GenericPatternMatcher;
import org.eclipse.incquery.runtime.api.GenericQuerySpecification;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.scope.IncQueryScope;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.TraceBySourceAndRuleDescriptorIdQuerySpecification;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * This is a dynamically created {@link IQuerySpecification} instance. The instance
 * 	will be constructed from the given number of source parameters, and from the
 * 	traceBySourceAndRuleDescriptorId pattern.
 * 
 * The created pattern will match on those {@link Trace} instances, which has exactly
 * 	the given sources and id.
 * 
 * @author lengyela
 *
 */
public class TraceQuerySpecification extends
		GenericQuerySpecification<GenericPatternMatcher> {

	public TraceQuerySpecification(int numberOfSourceParameters) {
		this(new TracePQuery(numberOfSourceParameters));
	}
	
	private TraceQuerySpecification(PQuery wrappedPQuery) {
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
		
	public static class TracePQuery extends BaseGeneratedEMFPQuery {

		public static final String PARAMETER_TRACE = "trace";
		
		public static final String PARAMETER_RULE_DESCRIPTOR_ID = "ruleDescriptorId";
		
		public static final String SOURCE_PARAMETER_PREFIX = "source_";
		
		
		private List<PParameter> parameters;
		
		private List<PParameter> sourceParameters;
		
		private PParameter ruleDescriptorIdParameter;
		
		private PParameter traceParameter;

		
		public TracePQuery(int numberOfSourceParameters) {
			
			this.parameters = Lists.newArrayList();
			
			/* Create renamed source parameters with a prefix */
			this.sourceParameters = Lists.newArrayList();
			for (int i = 0; i < numberOfSourceParameters; i++) {
				this.sourceParameters.add(new PParameter(
						getSourceParameterName(i),
						"org.eclipse.emf.ecore.EObject"));
			}
			/* ********************************************** */
			
			/* Add all sourceParameters to the parameters List */
			this.parameters.addAll(this.sourceParameters);
			
			/* Create ruleDescriptor parameter and add it to parameters List */
			this.ruleDescriptorIdParameter = new PParameter("ruleDescriptorId", "java.lang.Long");
			this.parameters.add(this.ruleDescriptorIdParameter);
			/* ************************************************************* */
			
			/* Create trace parameter and add it to parameters List */
			this.traceParameter = new PParameter("trace", "org.eclipse.incquery.viewmodel.traceability.Trace");
			this.parameters.add(this.traceParameter);
			/* **************************************************** */
		}
		
		@Override
		public String getFullyQualifiedName() {
			return "org.eclipse.incquery.viewmodel.traceability.patterns.trace";
		}

		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}

		@Override
		protected Set<PBody> doGetContainedBodies()
				throws QueryInitializationException {
			PBody body = new PBody(this);

			try {
				PVariable var_trace = body.getOrCreateVariableByName(PARAMETER_TRACE);
				PVariable var_ruleDescriptorId = body.getOrCreateVariableByName(PARAMETER_RULE_DESCRIPTOR_ID);
				
				List<ExportedParameter> exportedParameters = Lists.newArrayList();
		
				PVariable var_source = null;
				for (PParameter sourceParameter : sourceParameters) {
					var_source = body.getOrCreateVariableByName(sourceParameter.getName());
					
					exportedParameters.add(new ExportedParameter(body, var_source, sourceParameter.getName()));
				}

				exportedParameters.add(new ExportedParameter(body, var_ruleDescriptorId, PARAMETER_RULE_DESCRIPTOR_ID));
				exportedParameters.add(new ExportedParameter(body, var_trace, PARAMETER_TRACE));
				
				body.setExportedParameters(exportedParameters);

				for (PParameter sourceParameter : sourceParameters) {
					var_source = body.getOrCreateVariableByName(sourceParameter.getName());
					
					new PositivePatternCall(
							body,
							new FlatTuple(var_source, var_ruleDescriptorId, var_trace),
							TraceBySourceAndRuleDescriptorIdQuerySpecification.instance().getInternalQueryRepresentation());
				}
			} catch (IncQueryException e) {
				throw new QueryInitializationException("Pattern initialization failed!", null, null, null);
			}

			return Sets.newHashSet(body);
		}

		public static String getSourceParameterName(int position) {
			return SOURCE_PARAMETER_PREFIX + position;
		}
	}
}
