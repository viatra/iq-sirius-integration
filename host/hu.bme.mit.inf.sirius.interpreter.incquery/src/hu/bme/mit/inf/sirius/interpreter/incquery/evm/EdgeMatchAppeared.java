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
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryEngineManager;
import org.eclipse.incquery.runtime.evm.api.ExecutionSchema;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.FeatureNotFoundException;
import org.eclipse.sirius.ecore.extender.business.api.permission.exception.LockedInstanceException;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class EdgeMatchAppeared extends SiriusMatchProcessor {

	private Map<String, List<EdgeMapping>> edgeMappings;

	
	public EdgeMatchAppeared(IncQuerySiriusHelper helper, ExecutionSchema executionSchema,
			Map<String, List<EdgeMapping>> edgeMappings) throws Exception {
		super(helper, executionSchema);
		
		if (edgeMappings == null) {
			throw new IllegalArgumentException("The edgeMappings parameter can not be null!");
		}
		
		this.logger = LoggingUtils.getLogger(this.getClass());
		
		this.edgeMappings = edgeMappings;
	}

	@Override
	public void doProcess(IPatternMatch match) {
		logger.info("Match appeared::" + match);

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
							
							session.getModelAccessor().eSet(sourceElement, mappingExpression.getParameter(Parameter.ref), targetElement);
						} else {
							// It's for Element Based Edge
							
							IncQueryExpression mappingExpression = IncQueryExpression.parse(mapping.getSemanticCandidatesExpression());
							if (mappingExpression == null) {
								// TODO és még más egyéb esetek...
								logger.severe("Not appropriate SemanticCandidatesExpression at EdgeMapping => ID: " + mapping.getName());
								
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
							
							Set<EObject> allSourcesEObject = Sets.newHashSet();
							Set<Object> allSourcesJavaObject = Sets.newHashSet();
							
							sourcesEObject = new HashSet<EObject>();
							sourcesJavaObject = new HashSet<Object>();
							for (int i = 0; i < numberOfSourceParams; i++) {
								if (match.get(i) instanceof EObject) {
									sourcesEObject.add((EObject) match.get(i));
								} else {
									sourcesJavaObject.add(match.get(i));
								}
							}
							allSourcesEObject.addAll(sourcesEObject);
							allSourcesJavaObject.addAll(sourcesJavaObject);
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
							allSourcesEObject.addAll(sourcesEObject);
							allSourcesJavaObject.addAll(sourcesJavaObject);
							targetElement = traceabilityManager.getTarget(targetMapping.getName(), sourcesEObject, sourcesJavaObject);
							
							// Create model element
							EObject createdElement = targetModelFactory.create(getEClassByName(mapping.getDomainClass()));
							target.getContents().add(createdElement);
							traceabilityManager.createTrace(mapping.getName(), allSourcesEObject, allSourcesJavaObject, Lists.newArrayList(createdElement));
							
							// Setting source and target references
							session.getModelAccessor().eSet(createdElement, getReferenceName(mapping.getSourceFinderExpression()), sourceElement);
							session.getModelAccessor().eSet(createdElement, getReferenceName(mapping.getTargetFinderExpression()), targetElement);
						}
					} catch (IncQueryException e) {
						e.printStackTrace();
					} catch (LockedInstanceException e) {
						e.printStackTrace();
					} catch (FeatureNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		});
	}

	/*
	 * Get the name of the reference from a SourceReferenceExpression or a TargetReferenceExpression.
	 * 	The expression can be Acceleo, OCL or feature:-type
	 */
	private String getReferenceName(String expression) {
		if (expression.contains("[") && expression.contains("/]")) {
			// if it's an Acceleo expression
			return expression
					.replace("[", "")
					.replace("/]", "")
					.replace(" ", "")
					.replace("\t", "")
					.replace("self.", "");
		} else if (expression.startsWith("ocl:")) {
			// if it's an OCL expression
			
			return expression
					.replace("ocl:", "")
					.replace(" ", "")
					.replace("\t", "")
					.replace("self.", "");
		} else if (expression.startsWith("feature:")) {
			// if it's a feature:-type expression
			return expression.replace("feature:", "");
		}

		return null;
	}
}
