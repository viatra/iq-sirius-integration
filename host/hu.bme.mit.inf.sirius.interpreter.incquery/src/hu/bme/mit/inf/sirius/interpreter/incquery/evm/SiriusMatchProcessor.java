package hu.bme.mit.inf.sirius.interpreter.incquery.evm;

import hu.bme.mit.inf.sirius.interpreter.incquery.IncQuerySiriusHelper;
import hu.bme.mit.inf.sirius.interpreter.incquery.SiriusUtils;
import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.TraceabilityManager;

import java.util.logging.Logger;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.evm.api.ExecutionSchema;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagram;

public abstract class SiriusMatchProcessor implements IMatchProcessor<IPatternMatch> {
	
	protected Logger logger;
	
	private ExecutionSchema executionSchema;
	
	protected Session session;

	protected DDiagram diagram;

	protected Resource target;

	protected EPackage targetModelPackage;

	protected EFactory targetModelFactory;
	
	protected TraceabilityManager traceabilityManager;

	
	public SiriusMatchProcessor(IncQuerySiriusHelper helper, ExecutionSchema executionSchema) throws Exception {
		this.executionSchema = executionSchema;
		
		this.session = helper.getSession();
		this.diagram = helper.getDiagram();
		this.target = helper.getTarget();
		this.targetModelPackage = helper.getTargetModelPackage();
		this.targetModelFactory = helper.getTargetModelFactory();
		this.traceabilityManager = helper.getTraceabilityManager();
		
		if (this.executionSchema == null
				|| this.session == null
				|| this.diagram == null
				|| this.target == null
				|| this.targetModelPackage == null
				|| this.targetModelFactory == null
				|| this.traceabilityManager == null) {
			
			throw new Exception("The executionSchema parameter and session, diagram, target, targetModelPackage, targetModelFactory"
					+ " and traceabilityManager attributes of the helper must be initialized before the call of SiriusEVM's constructor!");
		}
	}
	
	protected abstract void doProcess(IPatternMatch match);
	
	protected EClass getEClassByName(String name) {
		if (name == null) {
			return null;
		}

		String[] nameParts = name.split("\\.");

		Object element = null;
		TreeIterator<EObject> iterator = targetModelPackage.eAllContents();
		while (iterator.hasNext()) {
			element = iterator.next();

			if (element instanceof EClass 
					&& nameParts[nameParts.length - 1].equals(((EClass) element).getName())) {
				return ((EClass) element);
			}
		}

		return null;
	}

	@Override
	public void process(IPatternMatch match) {
		doProcess(match);
		
		// If all the activations have been processed, we call refreshDiagram method
		if (executionSchema.getConflictingActivations().isEmpty()) {
			SiriusUtils.refreshDiagram(session, diagram);
		}
	}
	
	
}
