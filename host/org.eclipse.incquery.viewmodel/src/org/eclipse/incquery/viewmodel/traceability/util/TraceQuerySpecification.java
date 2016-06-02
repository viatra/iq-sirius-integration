package org.eclipse.incquery.viewmodel.traceability.util;

import java.util.List;
import java.util.Set;

import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.patterns.util.TraceBySourceAndRuleDescriptorIdQuerySpecification;
import org.eclipse.viatra.query.runtime.api.GenericPatternMatcher;
import org.eclipse.viatra.query.runtime.api.GenericQuerySpecification;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.scope.QueryScope;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * This is a dynamically created {@link IQuerySpecification} instance. The instance
 * 	will be constructed from the given number of source parameters, and from the
 * 	traceBySourceAndRuleDescriptorId pattern.
 * 
 * The created pattern will match on those {@link Trace} instances, which have the given id
 * 	and have all the given sources.
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
	public Class<? extends QueryScope> getPreferredScopeClass() {
		return EMFScope.class;
	}

	@Override
	protected GenericPatternMatcher instantiate(ViatraQueryEngine engine)
			throws ViatraQueryException {
		GenericPatternMatcher matcher = defaultInstantiate(engine);
        return matcher;
	}
		
	public static class TracePQuery extends BaseGeneratedEMFPQuery {

		public static final String PARAMETER_TRACE = "trace";
		
		public static final String PARAMETER_RULE_DESCRIPTOR_ID = "ruleDescriptorId";

		public static final String PARAMETER_SOURCE_PREFIX = "source_";
		
		public static final String PARAMETER_PATTERN_PARAMETER_NAME_PREFIX = "patternParameterName_";
		
		
		private int numberOfSources;
		
		private List<PParameter> parameters;
		
		private List<PParameter> dynamicParameters;
		
		private List<PParameter> sourceParameters;
		
		private List<PParameter> patternParamaterNameParamaters;
		
		private PParameter ruleDescriptorIdParameter;
		
		private PParameter traceParameter;

		
		public TracePQuery(int numberOfSources) {
			this.numberOfSources = numberOfSources;
			
			this.parameters = Lists.newArrayList();
			
			/* Create renamed dynamic parameters with a prefix */
			PParameter createdPParameter = null;
			this.dynamicParameters = Lists.newArrayList();
			this.sourceParameters = Lists.newArrayList();
			this.patternParamaterNameParamaters = Lists.newArrayList();
			for (int i = 0; i < numberOfSources; i++) {
				createdPParameter = new PParameter(getSourceParameterName(i), "java.lang.Object");
				this.dynamicParameters.add(createdPParameter);
				this.sourceParameters.add(createdPParameter);
				
				createdPParameter = new PParameter(getPatternParameterNameParameterName(i), "java.lang.Object");
				this.dynamicParameters.add(createdPParameter);
				this.patternParamaterNameParamaters.add(createdPParameter);
			}
			/* *********************************************** */
			
			/* Add all traceSourceParameters to the parameters List */
			this.parameters.addAll(this.dynamicParameters);
			
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
		
				PVariable var_dynamicParameter = null;
				for (PParameter dynamicParameter : dynamicParameters) {
					var_dynamicParameter = body.getOrCreateVariableByName(dynamicParameter.getName());
					
					exportedParameters.add(new ExportedParameter(body, var_dynamicParameter, dynamicParameter.getName()));
				}

				exportedParameters.add(new ExportedParameter(body, var_ruleDescriptorId, PARAMETER_RULE_DESCRIPTOR_ID));
				exportedParameters.add(new ExportedParameter(body, var_trace, PARAMETER_TRACE));
				
				body.setSymbolicParameters(exportedParameters);

				PVariable var_source = null;
				PVariable var_patternParameterName = null;
				for (int i = 0; i < numberOfSources; i++) {
					var_source = body.getOrCreateVariableByName(sourceParameters.get(i).getName());
					var_patternParameterName = body.getOrCreateVariableByName(patternParamaterNameParamaters.get(i).getName());
					
					new PositivePatternCall(
							body,
							new FlatTuple(var_source, var_patternParameterName, var_ruleDescriptorId, var_trace),
							TraceBySourceAndRuleDescriptorIdQuerySpecification.instance().getInternalQueryRepresentation());
				}
			} catch (ViatraQueryException e) {
				throw new QueryInitializationException("Pattern initialization failed!", null, null, null);
			}

			return Sets.newHashSet(body);
		}

		public static String getSourceParameterName(int position) {
			return PARAMETER_SOURCE_PREFIX + position;
		}
		
		public static String getPatternParameterNameParameterName(int position) {
			return PARAMETER_PATTERN_PARAMETER_NAME_PREFIX + position;
		}
	}
}
