package org.eclipse.incquery.viewmodel.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.incquery.viewmodel.configuration.AttributeRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.Configuration;
import org.eclipse.incquery.viewmodel.configuration.ConfigurationFactory;
import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.HiddenParametersRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.ReferenceRuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.RuleDescriptor;
import org.eclipse.incquery.viewmodel.configuration.TransformationRuleDescriptor;
import org.eclipse.incquery.viewmodel.core.rules.AttributeRule;
import org.eclipse.incquery.viewmodel.core.rules.ElementRule;
import org.eclipse.incquery.viewmodel.core.rules.HiddenParametersRule;
import org.eclipse.incquery.viewmodel.core.rules.ReferenceRule;
import org.eclipse.incquery.viewmodel.core.rules.ViewModelRule;
import org.eclipse.incquery.viewmodel.core.schedulers.ManualScheduler;
import org.eclipse.incquery.viewmodel.traceability.TraceabilityModelManager;
import org.eclipse.incquery.viewmodel.traceability.util.HiddenParametersQuerySpecification;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.transformation.evm.api.ActivationLifeCycle;
import org.eclipse.viatra.transformation.evm.api.ExecutionSchema;
import org.eclipse.viatra.transformation.evm.api.Job;
import org.eclipse.viatra.transformation.evm.api.RuleSpecification;
import org.eclipse.viatra.transformation.evm.api.ScheduledExecution;
import org.eclipse.viatra.transformation.evm.api.Scheduler;
import org.eclipse.viatra.transformation.evm.specific.ConflictResolvers;
import org.eclipse.viatra.transformation.evm.specific.ExecutionSchemas;
import org.eclipse.viatra.transformation.evm.specific.Jobs;
import org.eclipse.viatra.transformation.evm.specific.Lifecycles;
import org.eclipse.viatra.transformation.evm.specific.Rules;
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum;
import org.eclipse.viatra.transformation.evm.specific.event.ViatraQueryEventRealm;
import org.eclipse.viatra.transformation.evm.specific.resolver.FixedPriorityConflictResolver;
import org.eclipse.viatra.transformation.evm.specific.scheduler.UpdateCompleteBasedScheduler;
import org.eclipse.viatra.transformation.evm.transactions.specific.TransactionalSchedulers;
import org.eclipse.viatra.transformation.evm.update.QueryEngineUpdateCompleteProvider;
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.InconsistentEventSemanticsException;

import com.google.common.collect.Lists;

/**
 * Manager class which do the necessary steps for the transformation: initializes the transformation
 * 	engine and the traceability model manager, and build the transformation rules based on the given
 * 	configuration model.
 * 
 * If the ConfigurationModel is serialized, the {@link ViewModelManager#ViewModelManager(URI)} constructor
 * 	can be used to instantiate the manager. In this case the {@link Configuration#getSourceModelURI()}, and
 * 	{@link Configuration#getTargetModelURI()} methods have to return a valid URI instance pointing at the
 * 	corresponding source and target models.
 * 
 * If the ConfigurationModel is not serialized (or it has been loaded previously), the {@link ViewModelManager#ViewModelManager(Configuration)}
 * 	constructor can be used to initialize the manager. In this case, if the {@link Configuration#getSourceModel()} or
 * 	{@link Configuration#getTargetModel()} method returns null, the corresponding URI instance will be used to
 * 	initialize the source and target models if it's possible, otherwise an Exception will be thrown.
 * 
 * @author lengyela
 *
 */
public class ViewModelManager {
	
	// The root of the configuration model
	private Configuration configurationModel;
	
	// Rule provider instance
	private AbstractRuleProvider ruleProvider;
	
	// ViatraQueryEngine for the transformation
	private ViatraQueryEngine viatraQueryEngine;

	// Transformation initializer instance
	private TransformationInitializer transformationInitializer;
	
	// Manager for the traceability model
	private TraceabilityModelManager traceabilityModelManager;
	
	// ExecutionSchema for the transformation
	private ExecutionSchema executionSchema;
	
	// Transactional editing domain for the source model (if it exists)
	private TransactionalEditingDomain sourceTransactionalEditingDomain;
	
	// Transactional editing domain for the target model (if it exists)
	private TransactionalEditingDomain targetTransactionalEditingDomain;
	
	// Loaded IQuerySpecification instances
	private Map<String, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> querySpecifications;


	
	
	/**
	 * If the ConfigurationModel is serialized, the {@link ViewModelManager#ViewModelManager(URI)} constructor
	 * 	can be used to instantiate the manager. In this case the {@link Configuration#getSourceModelURI()}, and
	 * 	{@link Configuration#getTargetModelURI()} methods have to return a valid URI instance pointing at the
	 * 	corresponding source and target models.
	 * 
	 * TODO
	 * Not implemented yet.
	 * @param configurationModelURI
	 */
	public ViewModelManager(URI configurationModelURI) {
		// TODO implement...
		throw new UnsupportedOperationException();
		
//		ResourceSet rset = new ResourceSetImpl();
//		Resource res = rset.getResource(configurationModelURI, true);
//		
//		if (res.getContents().isEmpty() || !(res.getContents().get(0) instanceof Configuration)) {
//			throw new IllegalArgumentException("The configuration model can not be empty and the root of the model have to be a Configuration element!");
//		}
//		
//		Configuration configuration = (Configuration) res.getContents().get(0);
//		configuration.setSourceModel(null);
//		configuration.setTargetModel(null);
//		
//		if (configuration.getSourceModelURI() == null || configuration.getTargetModelURI() == null) {
//			throw new IllegalArgumentException("The 'SourceModelURI' and 'TargetModelURI' attribute of the Configuration element must be set!");
//		}
	}
	
	// TODO: javadoc
	public ViewModelManager(Configuration configurationModel) throws ViatraQueryException {
		this(configurationModel, null);
	}
	
	/**
	 * If the ConfigurationModel is not serialized (or it has been loaded previously), the {@link ViewModelManager#ViewModelManager(Configuration)}
	 * 	constructor can be used to initialize the manager. In this case, if the {@link Configuration#getSourceModel()} or
	 * 	{@link Configuration#getTargetModel()} method returns null, the corresponding URI instance will be used to
	 * 	initialize the source and target models if it's possible, otherwise an Exception will be thrown.
	 * 
	 * TODO
	 * Ha a target-hez van TED, akkor az egyes action-ök abban futnak
	 *  (később a CommandStack-et javítani kell a visszavonások miatt), egyébként pedig sima getter/setter hívásokat használok a target modellen.
	 */
	public ViewModelManager(Configuration configurationModel,
			TransformationInitializer transformationInitializer) throws ViatraQueryException {
		if (configurationModel == null) {
			throw new IllegalArgumentException("The 'configurationModel' parameter can not be null!");
		}
		
		this.configurationModel = configurationModel;
		
		this.ruleProvider = null;
		
		this.viatraQueryEngine = null;
		
		this.transformationInitializer = transformationInitializer;
		
		this.traceabilityModelManager = new TraceabilityModelManager();

		this.querySpecifications = new HashMap<String, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>();
		
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// If the sourceModel attribute is null, we try to load the source model based on the sourceModelURI attribute
		if (this.configurationModel.getSourceModel() == null) {
			if (this.configurationModel.getSourceModelURI() == null) {
				throw new IllegalArgumentException("If the sourceModel attribute is null, the sourceModelURI attribute must not be null!");
			}

			this.configurationModel.setSourceModel(resourceSet.getResource(
					URI.createURI(this.configurationModel.getSourceModelURI(), true), true));
			
			if (this.configurationModel.getSourceModel() == null) {
				throw new IllegalArgumentException("The given sourceModelURI is not correct!");
			}
		}

		// If the targetModel attribute is null, we try to load the target model based on the targetModelURI attribute
		if (this.configurationModel.getTargetModel() == null) {
			if (this.configurationModel.getTargetModelURI() == null) {
				throw new IllegalArgumentException("If the sourceModel attribute is null, the sourceModelURI attribute must not be null!");
			}

			this.configurationModel.setTargetModel(resourceSet.getResource(
					URI.createURI(this.configurationModel.getTargetModelURI(), true), true));
			
			if (this.configurationModel.getTargetModel() == null) {
				throw new IllegalArgumentException("The given sourceModelURI is not correct!");
			}
		}
		
		// Load pattern resources
		if (this.configurationModel.getPatternResourceURIs() != null) {
			ResourceSet eiqResourceSet = new ResourceSetImpl();
			
			URI patternResourceURI = null;
			Resource patternResource =  null;
			for (String uri : this.configurationModel.getPatternResourceURIs()) {
				patternResourceURI = URI.createURI(uri, true);
				
				if (patternResourceURI != null
						&& this.configurationModel.getPatternResources() != null
						&& !containsResourceWithURI(this.configurationModel.getPatternResources(), patternResourceURI)) {
					patternResource = eiqResourceSet.getResource(patternResourceURI, true);
					
					this.configurationModel.getPatternResources().add(patternResource);
				}
			}
		}
		
		// Create IQuerySpecification instances from pattern resources
		PatternModel patternModel = null;
		IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> querySpecification = null;
		SpecificationBuilder specificationBuilder = new SpecificationBuilder();
		for (Resource resource : this.configurationModel.getPatternResources()) {
			if (!resource.getContents().isEmpty() && (resource.getContents().get(0) instanceof PatternModel)) {
				patternModel = (PatternModel) resource.getContents().get(0);

				for (Pattern pattern : patternModel.getPatterns()) {
					querySpecification = (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) specificationBuilder.getOrCreateSpecification(pattern);
					
					querySpecifications.put(querySpecification.getFullyQualifiedName(), querySpecification);
				}
			}
		}
		
		
		this.sourceTransactionalEditingDomain = TransactionUtil.getEditingDomain(
				configurationModel.getSourceModel());
		
		this.targetTransactionalEditingDomain = TransactionUtil.getEditingDomain(
				configurationModel.getTargetModel());
	}
	
	/**
	 * Initialize the manager
	 * @throws InconsistentEventSemanticsException
	 * @throws IncQueryException
	 */
	public void initialize() throws InconsistentEventSemanticsException, ViatraQueryException {
		// Run custom initialization if it's needed
		if (transformationInitializer != null) {
			transformationInitializer.beforeInitialize(this);
		}
		
		if (viatraQueryEngine == null) {
			viatraQueryEngine = ViatraQueryEngine.on(new EMFScope(configurationModel.getSourceModel()));
		}
		
		FixedPriorityConflictResolver conflictResolver = ConflictResolvers.createFixedPriorityResolver();

		
		switch (configurationModel.getScheduler()) {
		case UPDATE_COMPLETE_BASED:
			executionSchema = ExecutionSchemas.createViatraQueryExecutionSchema(viatraQueryEngine,
					new UpdateCompleteBasedScheduler.UpdateCompleteBasedSchedulerFactory(new QueryEngineUpdateCompleteProvider(viatraQueryEngine)));
			
			break;
			
		case TRANSACTIONAL:
			executionSchema = ExecutionSchemas.createViatraQueryExecutionSchema(viatraQueryEngine,
					TransactionalSchedulers.getTransactionSchedulerFactory(sourceTransactionalEditingDomain));
			
			break;
			
		case MANUAL:
	        ViatraQueryEventRealm eventRealm = ViatraQueryEventRealm.create(viatraQueryEngine);
	        ScheduledExecution scheduledExecution = new ScheduledExecution(eventRealm);
	        Scheduler scheduler = (new ManualScheduler.ManualSchedulerFactory()) .prepareScheduler(scheduledExecution);
	        executionSchema = ExecutionSchema.create(scheduler);
			
			break;
		}
		
		// Set ConflictResolver for RuleEngine
		executionSchema.setConflictResolver(conflictResolver);

		RuleSpecification<IPatternMatch> ruleSpecification = null;
		ViewModelRule<? extends RuleDescriptor> rule = null;
		for (ElementRuleDescriptor ruleDescriptor : configurationModel.getElementRuleDescriptors()) {
			if (ruleProvider != null && ruleProvider.getRuleForDescriptor(ruleDescriptor) != null) {
				rule = ruleProvider.getRuleForDescriptor(ruleDescriptor);
			} else {
				rule = new ElementRule<ElementRuleDescriptor>(ruleDescriptor, this);
			}

			ruleSpecification = createRuleSpecification(rule);
			
			if (rule.getEventFilter() == null) {
				executionSchema.addRule(ruleSpecification);
			} else {
				executionSchema.addRule(ruleSpecification, rule.getEventFilter());
			}
			
			conflictResolver.setPriority(ruleSpecification, rule.getPriority());
		}

		for (ReferenceRuleDescriptor ruleDescriptor : configurationModel.getReferenceRuleDescriptors()) {
			if (ruleProvider != null && ruleProvider.getRuleForDescriptor(ruleDescriptor) != null) {
				rule = ruleProvider.getRuleForDescriptor(ruleDescriptor);
			} else {
				rule = new ReferenceRule<ReferenceRuleDescriptor>(ruleDescriptor, this);
			}

			ruleSpecification = createRuleSpecification(rule);
			
			if (rule.getEventFilter() == null) {
				executionSchema.addRule(ruleSpecification);
			} else {
				executionSchema.addRule(ruleSpecification, rule.getEventFilter());
			}

			conflictResolver.setPriority(ruleSpecification, rule.getPriority());
		}

		for (AttributeRuleDescriptor ruleDescriptor : configurationModel.getAttributeRuleDescriptors()) {
			if (ruleProvider != null && ruleProvider.getRuleForDescriptor(ruleDescriptor) != null) {
				rule = ruleProvider.getRuleForDescriptor(ruleDescriptor);
			} else {
				rule = new AttributeRule<AttributeRuleDescriptor>(ruleDescriptor, this);
			}

			ruleSpecification = createRuleSpecification(rule);
			
			if (rule.getEventFilter() == null) {
				executionSchema.addRule(ruleSpecification);
			} else {
				executionSchema.addRule(ruleSpecification, rule.getEventFilter());
			}

			conflictResolver.setPriority(ruleSpecification, rule.getPriority());
		}

		if (configurationModel.isEnableDetailedTraceability()) {
			// Creating HiddenParametersRuleDescriptors
			createHiddenParametersRuleDescriptors();
			for (HiddenParametersRuleDescriptor ruleDescriptor : configurationModel.getHiddenParametersRuleDescriptors()) {
				rule = new HiddenParametersRule<HiddenParametersRuleDescriptor>(ruleDescriptor, this);
	
				ruleSpecification = createRuleSpecification(rule);
				
				if (rule.getEventFilter() == null) {
					executionSchema.addRule(ruleSpecification);
				} else {
					executionSchema.addRule(ruleSpecification, rule.getEventFilter());
				}
	
				conflictResolver.setPriority(ruleSpecification, rule.getPriority());
			}
		}
		
		// Run custom initialization if it's needed
		if (transformationInitializer != null) {
			transformationInitializer.afterInitialize(this);
		}
	}
	
	/**
	 * Disposer method for the manager.
	 */
	public void dispose() {
		if (executionSchema != null) {
			executionSchema.dispose();
		}
	}
	
	/**
	 * 
	 * @return The configuration model instance
	 */
	public Configuration getConfigurationModel() {
		return this.configurationModel;
	}
	
	/**
	 * 
	 * @param patternFQN The fully qualified name of the pattern
	 * @return An IQuerySpecification instance with the given FQN or NULL if it doesn't exist
	 */
	public IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> getQuerySpecification(String patternFQN) {
		if (querySpecifications != null) {
			return querySpecifications.get(patternFQN);
		}
		
		return null;
	}
	
	/**
	 * 
	 * @return The {@link TransactionalEditingDomain} for the target model if it's exist,
	 * 	otherwise null
	 */
	public TransactionalEditingDomain getTargetTransactionalEditingDomain() {
		return this.targetTransactionalEditingDomain;
	}
	
	/**
	 * 
	 * @return The {@link TraceabilityModelManager} instance if it's exist,
	 * 	otherwise null
	 */
	public TraceabilityModelManager getTraceabilityModelManager() {
		return this.traceabilityModelManager;
	}
	
	/**
	 * 
	 * @return The {@link ExecutionSchema} instance.
	 */
	public ExecutionSchema getExecutionSchema() {
		return this.executionSchema;
	}

	/**
	 * Setter for RuleProvider
	 * @param ruleProvider
	 */
	public void setRuleProvider(AbstractRuleProvider ruleProvider) {
		this.ruleProvider = ruleProvider;
	}

	/**
	 * 
	 * @return a fully qualified name (FQN) -> IQuerySpecification map, which contains those
	 * 	IQuerySpecification instances, that are used by the transformation. Basically the
	 * 	{@link ViewModelManager} cares with this (loads the query specifications based on
	 * 	the configuration model, etc.), but this map can be modified if it's really necessary.
	 * 	Use it with caution!
	 */
	public Map<String, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> getQuerySpecifications() {
		return querySpecifications;
	}
	
	public ViatraQueryEngine getViatraQueryEngine() {
		return viatraQueryEngine;
	}
	
	public void setViatraQueryEngine(ViatraQueryEngine viatraQueryEngine) {
		this.viatraQueryEngine = viatraQueryEngine;
	}

	// TODO comment
	private void createHiddenParametersRuleDescriptors() {
		if (configurationModel == null) {
			throw new IllegalStateException("ConfigurationModel can not be null while creating HiddenParameterRuleDescriptors!");
		}
		
		// TODO csak akkor csináljunk, ha feltétlenül szükséges
		// TODO ha OR van az eredeti mintában, akkor több HiddenParametersRuleDescriptors példány szükséges...
		List<String> processedPatternFQNs = Lists.newArrayList();
		HiddenParametersRuleDescriptor hiddenParametersRuleDescriptor = null;
		IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> transformationRuleQuerySpecification = null;
		IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hiddenParametersRuleQuerySpecification = null;
		for (TransformationRuleDescriptor transformationRuleDescriptor : configurationModel.getTransformationRuleDescriptors()) {
			// If the given FQN has been processed, we skip it...
			if (processedPatternFQNs.contains(transformationRuleDescriptor.getPatternFQN())) {
				continue;
			}
			
			// TODO teszt OR!!!!
			// If the given QuerySpecification contains more than one body...
			transformationRuleQuerySpecification = querySpecifications.get(transformationRuleDescriptor.getPatternFQN());
//			if (transformationRuleQuerySpecification == null
//					|| transformationRuleQuerySpecification.getInternalQueryRepresentation().getDisjunctBodies().getBodies().size() > 1) {
//				throw new IllegalStateException("Disjunct bodies in the transformation patterns are not supported!");
//			}
			
			int bodyIndex = 0;
			for (PBody body : transformationRuleQuerySpecification.getInternalQueryRepresentation().getDisjunctBodies().getBodies()) {
				hiddenParametersRuleQuerySpecification = new HiddenParametersQuerySpecification(
						body,
						bodyIndex);
			
				querySpecifications.put(hiddenParametersRuleQuerySpecification.getFullyQualifiedName(), hiddenParametersRuleQuerySpecification);
				
				hiddenParametersRuleDescriptor = ConfigurationFactory.eINSTANCE.createHiddenParametersRuleDescriptor();
				hiddenParametersRuleDescriptor.setOriginalPatternFQN(transformationRuleDescriptor.getPatternFQN());
				hiddenParametersRuleDescriptor.setPatternFQN(hiddenParametersRuleQuerySpecification.getFullyQualifiedName());
				
				configurationModel.getRuleDescriptors().add(hiddenParametersRuleDescriptor);
				
				bodyIndex++;
			}
			
			// Add current FQN to the processed list
			processedPatternFQNs.add(transformationRuleDescriptor.getPatternFQN());
		}
	}

	/**
	 * Builds the transformation rules based on the given configuration model.
	 * @param rule The {@link ViewModelRule} instance which will be built
	 * @return {@link EventDrivenTransformationRule} instance
	 * @throws InconsistentEventSemanticsException
	 */
	@SuppressWarnings("unchecked")
	private RuleSpecification<IPatternMatch> createRuleSpecification(ViewModelRule<? extends RuleDescriptor> rule)
			throws InconsistentEventSemanticsException {

		Set<Job<IPatternMatch>> jobs = new HashSet<Job<IPatternMatch>>();
		ActivationLifeCycle alc = rule.getActivationLifeCycle();
		if (Lifecycles.getDefault(false, false).equals(alc)) {
			jobs.add((Job<IPatternMatch>) Jobs.newStatelessJob(CRUDActivationStateEnum.CREATED, rule.getAppearedAction()));
		} else if (Lifecycles.getDefault(true, false).equals(alc)) {
			jobs.add((Job<IPatternMatch>) Jobs.newStatelessJob(CRUDActivationStateEnum.CREATED, rule.getAppearedAction()));
			jobs.add((Job<IPatternMatch>) Jobs.newStatelessJob(CRUDActivationStateEnum.UPDATED, rule.getUpdatedAction()));
		} else if (Lifecycles.getDefault(false, true).equals(alc)) {
			jobs.add((Job<IPatternMatch>) Jobs.newStatelessJob(CRUDActivationStateEnum.CREATED, rule.getAppearedAction()));
			jobs.add((Job<IPatternMatch>) Jobs.newStatelessJob(CRUDActivationStateEnum.DELETED, rule.getDisappearedAction()));
		} else if (Lifecycles.getDefault(true, true).equals(alc)) {
			jobs.add((Job<IPatternMatch>) Jobs.newStatelessJob(CRUDActivationStateEnum.CREATED, rule.getAppearedAction()));
			jobs.add((Job<IPatternMatch>) Jobs.newStatelessJob(CRUDActivationStateEnum.DELETED, rule.getDisappearedAction()));
			jobs.add((Job<IPatternMatch>) Jobs.newStatelessJob(CRUDActivationStateEnum.UPDATED, rule.getUpdatedAction()));
		}

		return Rules.newMatcherRuleSpecification((IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) rule.getQuerySpecification(), alc, jobs);
	}	
	
	private boolean containsResourceWithURI(Collection<Resource> resources, URI uri) {
		if (resources == null || uri == null) {
			throw new IllegalArgumentException("Parameters must not be null!");
		}
		
		for (Resource resource : resources) {
			if (resource.getURI() != null && resource.getURI().equals(uri)) {
				return true;
			}
		}
		
		return false;
	}
	
	// TODO JAVADOC
	// TODO kell ez?
	private void refreshTransformationRuleDescriptorIds() {
		if (configurationModel == null) {
			throw new IllegalStateException("ConfigurationModel can not be null!");
		}
		
		for (int i = 0; i < configurationModel.getTransformationRuleDescriptors().size(); i++) {
			configurationModel.getTransformationRuleDescriptors().get(i).setId(i);
		}
	}
}
