package hu.bme.mit.inf.sirius.interpreter.incquery.evm;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;
import hu.bme.mit.inf.sirius.interpreter.incquery.IncQuerySiriusHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;

import com.google.common.collect.Lists;

public class NodeMatchAppeared extends SiriusMatchProcessor {
	
	private Map<String, List<AbstractNodeMapping>> nodeMappings;
	
	
	public NodeMatchAppeared(IncQuerySiriusHelper helper,
			Map<String, List<AbstractNodeMapping>> nodeMappings) throws Exception {
		super(helper);
		
		if (nodeMappings == null) {
			throw new IllegalArgumentException("The nodeMappings parameter can not be null!");
		}
		
		this.logger = LoggingUtils.getLogger(NodeMatchAppeared.class);
		
		this.nodeMappings = nodeMappings;
	}
	
	@Override
	public void process(IPatternMatch match) {
		logger.info("Match appeared::" + match);

		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				List<EObject> sourcesEObject = new ArrayList<EObject>();
				List<Object> sourcesJavaObject = new ArrayList<Object>();
				for (String parameterName : match.parameterNames()) {
					if (match.get(parameterName) instanceof EObject) {
						sourcesEObject.add((EObject) match.get(parameterName));
					} else {
						sourcesJavaObject.add(match.get(parameterName));
					}
				}

				EObject createdElement = null;
				for (AbstractNodeMapping mapping : nodeMappings.get(match.specification().getFullyQualifiedName())) {
					createdElement = targetModelFactory.create(getEClassByName(mapping.getDomainClass()));

					target.getContents().add(createdElement);
					
					traceabilityManager.createTrace(mapping.getName(), sourcesEObject,
							sourcesJavaObject, Lists.newArrayList(createdElement));
				}
			}
		});

		refreshDiagram();
	}
}
