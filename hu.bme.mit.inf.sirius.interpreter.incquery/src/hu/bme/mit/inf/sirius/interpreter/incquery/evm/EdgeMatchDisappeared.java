package hu.bme.mit.inf.sirius.interpreter.incquery.evm;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;
import hu.bme.mit.inf.sirius.interpreter.incquery.IncQueryExpression;
import hu.bme.mit.inf.sirius.interpreter.incquery.IncQueryExpression.Parameter;
import hu.bme.mit.inf.sirius.interpreter.incquery.IncQuerySiriusHelper;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryEngineManager;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;

public class EdgeMatchDisappeared extends SiriusMatchProcessor {

	private Map<String, List<EdgeMapping>> edgeMappings;

	public EdgeMatchDisappeared(IncQuerySiriusHelper helper,
			Map<String, List<EdgeMapping>> edgeMappings) throws Exception {
		super(helper);
		
		if (edgeMappings == null) {
			throw new IllegalArgumentException("The edgeMappings parameter can not be null!");
		}
		
		this.logger = LoggingUtils.getLogger(this.getClass());		
		
		this.edgeMappings = edgeMappings;
	}

	@Override
	public void process(IPatternMatch match) {
		logger.info("Match disappeared::" + match);
		
		if (IncQueryEngineManager.getInstance().getExistingIncQueryEngines().size() == 0) {
			logger.severe("There is no existing IncQueryEngine...");
			
			return;
		}
		
		IncQueryEngine engine = IncQueryEngineManager.getInstance().getExistingIncQueryEngines().iterator().next();

		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				for (EdgeMapping mapping : edgeMappings.get(match.specification().getFullyQualifiedName())) {
					try {

						if (mapping.getDomainClass() == null) {
							// It's for Relation Based Edge
							// TODO hibakezeles?!
							// TODO hibakezeles?!
							IncQueryExpression mappingExpression = IncQueryExpression.parse(mapping.getTargetFinderExpression());
							if (mappingExpression == null) {
								// TODO és még más egyéb esetek...
								logger.severe("Not appropriate TargetFinderExpression at EdgeMapping => ID: " + mapping.getName());
								
								return;
							}
							
							// TODO nem biztos h node van a mappingben....
							AbstractNodeMapping sourceMapping = (AbstractNodeMapping) mapping.getSourceMapping().get(0);
							AbstractNodeMapping targetMapping = (AbstractNodeMapping) mapping.getTargetMapping().get(0);
							
							IncQueryExpression smExpression = IncQueryExpression.parse(sourceMapping.getSemanticCandidatesExpression());
							IncQueryExpression tmExpression = IncQueryExpression.parse(targetMapping.getSemanticCandidatesExpression());
							
							if (smExpression == null || tmExpression == null) {
								logger.severe("Not appropriate expression for source or target mapping at the following EdgeMapping => ID: " + mapping.getName());
								
								return;
							}
							
							int numberOfSourceParams = engine.getMatcher(smExpression.getExpression()).getSpecification().getParameters().size();
							int numberOfTargetParams = engine.getMatcher(tmExpression.getExpression()).getSpecification().getParameters().size();
							
							EObject sourceElement = null;
							EObject targetElement = null;
							
							Set<EObject> sourcesEObject = null;
							Set<Object> sourcesJavaObject = null;
							
							sourcesEObject = new HashSet<EObject>();
							sourcesJavaObject = new HashSet<Object>();
							for (int i = 0; i < numberOfSourceParams; i++) {
								if (match.get(i) instanceof EObject) {
									sourcesEObject.add((EObject) match.get(i));
								} else {
									sourcesJavaObject.add(match.get(i));
								}
							}
							sourceElement = traceabilityManager.getTarget(sourceMapping.getName(), sourcesEObject, sourcesJavaObject);
							
							sourcesEObject = new HashSet<EObject>();
							sourcesJavaObject = new HashSet<Object>();
							for (int i = numberOfSourceParams; i < (numberOfSourceParams + numberOfTargetParams); i++) {
								if (match.get(i) instanceof EObject) {
									sourcesEObject.add((EObject) match.get(i));
								} else {
									sourcesJavaObject.add(match.get(i));
								}
							}
							targetElement = traceabilityManager.getTarget(targetMapping.getName(), sourcesEObject, sourcesJavaObject);
							
							if (sourceElement != null) {
								session.getModelAccessor().eRemove(sourceElement, mappingExpression.getParameter(Parameter.ref), targetElement);
							}
						} else {
							// It's for Element Based Edge
							Set<EObject> sourcesEObject = new HashSet<EObject>();
							Set<Object> sourcesJavaObject = new HashSet<Object>();
							
							
							for (String parameterName : match.parameterNames()) {
								if (match.get(parameterName) instanceof EObject) {
									sourcesEObject.add((EObject) match.get(parameterName));
								} else {
									sourcesJavaObject.add(match.get(parameterName));
								}
							}
							
							EObject target = traceabilityManager.getTarget(mapping.getName(), sourcesEObject, sourcesJavaObject);
							if (target != null) {
								EcoreUtil.remove(target);
							}
							
							traceabilityManager.deleteTraces(mapping.getName(), sourcesEObject, sourcesJavaObject);
						}
					} catch (IncQueryException e) {
						e.printStackTrace();
					}
				}
			}
		});

		refreshDiagram();
	}

}
