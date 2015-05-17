package hu.bme.mit.inf.sirius.interpreter.incquery.evm;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;
import hu.bme.mit.inf.sirius.interpreter.incquery.IncQueryExpression;
import hu.bme.mit.inf.sirius.interpreter.incquery.IncQuerySiriusHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.evm.api.ExecutionSchema;
import org.eclipse.incquery.runtime.evm.api.Job;
import org.eclipse.incquery.runtime.evm.api.RuleSpecification;
import org.eclipse.incquery.runtime.evm.specific.ExecutionSchemas;
import org.eclipse.incquery.runtime.evm.specific.Jobs;
import org.eclipse.incquery.runtime.evm.specific.Rules;
import org.eclipse.incquery.runtime.evm.specific.Schedulers;
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryActivationStateEnum;
import org.eclipse.incquery.runtime.evm.specific.lifecycle.DefaultActivationLifeCycle;
import org.eclipse.incquery.runtime.evm.specific.resolver.FixedPriorityConflictResolver;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;

import com.google.common.collect.Sets;

public class SiriusEVM {

	private static final int JOB_PRIORITY_NODE = 0;

	private static final int JOB_PRIORITY_EDGE = 10;
	
	private static final Logger logger = LoggingUtils.getLogger(SiriusEVM.class);

	private IncQuerySiriusHelper helper;
	
	private IncQueryEngine engine;

	private ExecutionSchema executionSchema;
	
	private Map<String, List<AbstractNodeMapping>> nodeMappings;
	
	private Map<String, List<EdgeMapping>> edgeMappings;
	
	private boolean started;
	
	
	public SiriusEVM(IncQuerySiriusHelper helper) throws Exception {
		if (helper == null) {
			throw new IllegalArgumentException("The helper parameter can not be null!");
		}
		
		if (helper.getSession() == null
				|| helper.getSource() == null
				|| helper.getDiagram() == null) {
			throw new Exception("The session, source and diagram attributes of the helper must be initialized before the call of SiriusEVM's constructor!");
		}
		
		this.helper = helper;
			
		this.nodeMappings = new HashMap<String, List<AbstractNodeMapping>>();
		this.edgeMappings = new HashMap<String, List<EdgeMapping>>();
		
		this.engine = IncQueryEngine.on(new EMFScope(helper.getSource()));
		this.executionSchema = ExecutionSchemas.createIncQueryExecutionSchema(
				engine, Schedulers.getTransactionSchedulerFactory(
						helper.getSession().getTransactionalEditingDomain()));
		
		this.started = false;
		
		// Initialize
		init(helper.getDiagram());
	}
	
	private void init(DDiagram diagram) {
	}

	public void addNodeMapping(String patternFQN, AbstractNodeMapping mapping) {
		if (started) {
			logger.severe("The SiriusEVM has already started! You can't add further mappings after start!");
			
			return;
		}
		
		if (!nodeMappings.containsKey(patternFQN)) {
			nodeMappings.put(patternFQN, new ArrayList<AbstractNodeMapping>());
		}
		
		nodeMappings.get(patternFQN).add(mapping);
	}
	
	public void addEdgeMapping(String patternFQN, EdgeMapping mapping) {
		if (started) {
			logger.severe("The SiriusEVM has already started! You can't add further mappings after start!");
			
			return;
		}

		if (!edgeMappings.containsKey(patternFQN)) {
			edgeMappings.put(patternFQN, new ArrayList<EdgeMapping>());
		}
		
		edgeMappings.get(patternFQN).add(mapping);
	}
	
	public void start() throws Exception {
		if (!started) {
			RuleSpecification ruleSpec = null;
			FixedPriorityConflictResolver conflictResolver = new FixedPriorityConflictResolver();
			
			for (String patternFQN : nodeMappings.keySet()) {
				ruleSpec = createRuleSpecificationForNode(
						(IncQueryMatcher<IPatternMatch>) engine.getMatcher(patternFQN));
				
				executionSchema.addRule(ruleSpec);
				
				conflictResolver.setPriority(ruleSpec, JOB_PRIORITY_NODE);				
			}
			
			for (String patternFQN : edgeMappings.keySet()) {
				ruleSpec = createRuleSpecificationForEdge(
						(IncQueryMatcher<IPatternMatch>) engine.getMatcher(patternFQN));
				
				executionSchema.addRule(ruleSpec);
				
				conflictResolver.setPriority(ruleSpec, JOB_PRIORITY_EDGE);				
			}
			
			executionSchema.setConflictResolver(conflictResolver);
			
			started = true;
		}
	}
	
	private RuleSpecification createRuleSpecificationForNode(
			IncQueryMatcher<IPatternMatch> matcher) throws Exception {
		
		Job<IPatternMatch> matchAppeared = Jobs.newStatelessJob(
				IncQueryActivationStateEnum.APPEARED, new NodeMatchAppeared(helper, nodeMappings));

		Job<IPatternMatch> matchDisappeared = Jobs.newStatelessJob(
				IncQueryActivationStateEnum.DISAPPEARED, new NodeMatchDisappeared(helper, nodeMappings));

		DefaultActivationLifeCycle lifecycle = DefaultActivationLifeCycle.DEFAULT_NO_UPDATE;

		return Rules.newMatcherRuleSpecification(matcher, lifecycle,
				Sets.newHashSet(matchAppeared, matchDisappeared));
	}

	private RuleSpecification createRuleSpecificationForEdge(
			IncQueryMatcher<IPatternMatch> matcher) throws Exception {
		
		Job<IPatternMatch> matchAppeared = Jobs.newStatelessJob(
				IncQueryActivationStateEnum.APPEARED, new EdgeMatchAppeared(helper, edgeMappings));

		Job<IPatternMatch> matchDisappeared = Jobs.newStatelessJob(
				IncQueryActivationStateEnum.DISAPPEARED, new EdgeMatchDisappeared(helper, edgeMappings));

		DefaultActivationLifeCycle lifecycle = DefaultActivationLifeCycle.DEFAULT_NO_UPDATE;

		return Rules.newMatcherRuleSpecification(matcher, lifecycle,
				Sets.newHashSet(matchAppeared, matchDisappeared));
	}
}
