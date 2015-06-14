package hu.bme.mit.inf.sirius.interpreter.incquery.evm;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;
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
import org.eclipse.incquery.runtime.evm.api.ExecutionSchema;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;

public class NodeMatchDisappeared extends SiriusMatchProcessor {

	private Map<String, List<AbstractNodeMapping>> nodeMappings;
	

	public NodeMatchDisappeared(IncQuerySiriusHelper helper, ExecutionSchema executionSchema,
			Map<String, List<AbstractNodeMapping>> nodeMappings) throws Exception {
		super(helper, executionSchema);

		if (nodeMappings == null) {
			throw new IllegalArgumentException("The nodeMappings parameter can not be null!");
		}
		
		this.logger = LoggingUtils.getLogger(this.getClass());
		
		this.nodeMappings = nodeMappings;
	}

	@Override
	public void doProcess(IPatternMatch match) {
		logger.info("Match disappeared::" + match);

		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				Set<EObject> sourcesEObject = new HashSet<EObject>();
				Set<Object> sourcesJavaObject = new HashSet<Object>();
				
				
				try {
					for (String parameterName : match.parameterNames()) {
						if (match.get(parameterName) instanceof EObject) {
							sourcesEObject.add((EObject) match.get(parameterName));
						} else {
							sourcesJavaObject.add(match.get(parameterName));
						}
					}
					
					EObject target = null;
					for (AbstractNodeMapping mapping : nodeMappings.get(match.specification().getFullyQualifiedName())) {
						target = traceabilityManager.getTarget(mapping.getName(), sourcesEObject, sourcesJavaObject);
						if (target != null) {
							EcoreUtil.remove(target);
						}
						
						traceabilityManager.deleteTraces(mapping.getName(), sourcesEObject, sourcesJavaObject);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
