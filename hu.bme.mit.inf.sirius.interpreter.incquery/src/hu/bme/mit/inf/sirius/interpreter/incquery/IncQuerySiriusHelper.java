package hu.bme.mit.inf.sirius.interpreter.incquery;

import hu.bme.mit.inf.sirius.interpreter.incquery.IncQueryExpression.Command;
import hu.bme.mit.inf.sirius.interpreter.incquery.IncQueryExpression.Parameter;
import hu.bme.mit.inf.sirius.interpreter.incquery.evm.SiriusEVM;
import hu.bme.mit.inf.sirius.interpreter.incquery.inmemoryresource.InMemoryResourceImpl;
import hu.bme.mit.inf.sirius.interpreter.incquery.traceability.TraceabilityManager;

import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;

import com.google.common.collect.Lists;

public class IncQuerySiriusHelper {
	private String diagramID = null;

	private boolean initialized = false;

	private Session session = null;

	private DDiagram diagram = null;

	private Resource source = null;

	private Resource target = null;

	private EPackage targetModelPackage = null;

	private EFactory targetModelFactory = null;
	
	private SiriusEVM siriusEVM = null;
	
	private TraceabilityManager traceabilityManager;
	


	public IncQuerySiriusHelper(DDiagram diagram, String diagramID) {
		this.diagram = diagram;

		this.diagramID = diagramID;

		this.initialized = false;
	}

	public void init(EObject root, String targetMetamodelPackageNS)
			throws Exception {
		if (!initialized) {
			source = root.eResource();

			targetModelPackage = EPackage.Registry.INSTANCE
					.getEPackage(targetMetamodelPackageNS);

			targetModelFactory = EPackage.Registry.INSTANCE
					.getEFactory(targetMetamodelPackageNS);

			session = SessionManager.INSTANCE.getSession(source);
			
			initializeTargetResource();
			
			traceabilityManager = new TraceabilityManager();

			initializeRules();
			
			initialized = true;
		}
	}
	
	public List<EObject> getElements(IncQueryExpression incQueryExpression, EObject context)
			throws Exception {
		if (!initialized) {
			throw new Exception("The IncQuerySeriusHelper is not initialized!");
		}
		
		if (incQueryExpression == null) {
			throw new IllegalArgumentException("The incQueryExpression parameter can not be null!");
		}

		if (incQueryExpression.getCommand() == Command.SEMANTIC_CANDIDATES_EXPRESSION) {
			if (incQueryExpression.getParameter(Parameter.match) == null) {
				return traceabilityManager.getTargetsByID(incQueryExpression.getId());
			} else {
				return Lists.newArrayList(traceabilityManager.getTarget(incQueryExpression.getId(), context));
			}
		} else if (incQueryExpression.getCommand() == Command.ASSOCIATED_ELEMENTS_EXPRESSION) {
			return traceabilityManager.getSources(incQueryExpression.getId(), context);
		} else if (incQueryExpression.getCommand() == Command.TARGET_ELEMENTS_EXPRESSION) {
			Object result = session.getModelAccessor().eGet(context, incQueryExpression.getParameter(Parameter.ref));
			
			if (result instanceof List) {
				return (List) result;
			} else {
				return Lists.newArrayList((EObject) result);
			}
		} else {
			throw new Exception("Unkonown command: " + incQueryExpression.getCommand());
		}
	}

	public boolean isInitialized() {
		return initialized;
	}

	public Session getSession() {
		return session;
	}

	public DDiagram getDiagram() {
		return diagram;
	}

	public Resource getTargetResource() {
		return target;
	}

	public Resource getSource() {
		return source;
	}

	public Resource getTarget() {
		return target;
	}

	public EPackage getTargetModelPackage() {
		return targetModelPackage;
	}

	public EFactory getTargetModelFactory() {
		return targetModelFactory;
	}

	public TraceabilityManager getTraceabilityManager() {
		return traceabilityManager;
	}

	private void initializeTargetResource() {
		URI uri = URI.createURI(InMemoryResourceImpl.URI_SCHEME + diagramID);

		// Load resource if it exists
		for (Resource resource : session.getSemanticResources()) {
			if (resource.getURI().toString().equals(uri.toString())) {
				target = resource;
			}
		}

		// If target resource does not exist
		if (target == null) {
			AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(
					session, uri, new NullProgressMonitor());
			session.getTransactionalEditingDomain().getCommandStack()
					.execute(addCommandToSession);
			session.save(new NullProgressMonitor());

			for (Resource resource : session.getSemanticResources()) {
				if (resource.getURI().toString().equals(uri.toString())) {
					target = resource;

					break;
				}
			}
		}
		
		// Set root element on targetResource
		target.eSetDeliver(false);

		EClass rootType = (EClass) targetModelPackage.eContents().get(0);

		EObject rootElement = targetModelFactory.create(rootType);

		EcoreUtil.remove(target.getContents().get(0));

		target.getContents().add(rootElement);

		target.eSetDeliver(true);
	}

	private void initializeRules() throws Exception {
		siriusEVM = new SiriusEVM(this);
		
		DiagramDescription description = diagram.getDescription();
		
		for (NodeMapping mapping : description.getAllNodeMappings()) {
			processNodeMapping(mapping);
		}

		for (ContainerMapping mapping : description.getAllContainerMappings()) {
			processContainerMapping(mapping);
		}
		
		for (EdgeMapping mapping : description.getAllEdgeMappings()) {
			processEdgeMapping(mapping);
		}
		
		siriusEVM.start();
	}
	
	private void processNodeMapping(NodeMapping mapping) {
		IncQueryExpression incQueryExpression = IncQueryExpression.parse(mapping.getSemanticCandidatesExpression());
		
		if (incQueryExpression != null && incQueryExpression.isPatternExpression()) {
			siriusEVM.addNodeMapping(incQueryExpression.getExpression(), mapping);
			
			if (!incQueryExpression.isProcessed()) {
				setSemanticCandidatesExpression(mapping);
				setSemanticElements(mapping);
			}
		}
	}
	
	private void processContainerMapping(ContainerMapping mapping) {
		IncQueryExpression incQueryExpression = IncQueryExpression.parse(mapping.getSemanticCandidatesExpression());

		if (incQueryExpression != null && incQueryExpression.isPatternExpression()) {
			siriusEVM.addNodeMapping(incQueryExpression.getExpression(), mapping);
			
			if (!incQueryExpression.isProcessed()) {
				setSemanticCandidatesExpression(mapping);
				setSemanticElements(mapping);
			}
			
			
			for (ContainerMapping cm : mapping.getSubContainerMappings()) {
				processContainerMapping(cm);
			}
			
			for (NodeMapping nm : mapping.getBorderedNodeMappings()) {
				processNodeMapping(nm);
			}
			
			for (NodeMapping nm : mapping.getSubNodeMappings()) {
				processNodeMapping(nm);
			}
		}
	}
	
	private void processEdgeMapping(EdgeMapping mapping) {
		IncQueryExpression incQueryExpression = IncQueryExpression.parse(mapping.getSemanticCandidatesExpression());
		
		if (incQueryExpression != null && incQueryExpression.isPatternExpression()) {
			siriusEVM.addEdgeMapping(incQueryExpression.getExpression(), mapping);
			
			if (!incQueryExpression.isProcessed()) {
				if (mapping.getDomainClass() == null) {
					// If it's a RelationBasedEdge
					setTargetFinderExpression(mapping);
				} else {
					// If it's an ElementBasedEdge
					setSemanticCandidatesExpression(mapping);
				}
			}
		}
	}
	
	private void setSemanticCandidatesExpression(DiagramElementMapping mapping) {
		mapping.setSemanticCandidatesExpression(
				mapping.getSemanticCandidatesExpression()
				+ "/"
				+ IncQueryExpression.Command.SEMANTIC_CANDIDATES_EXPRESSION
				+ "/" + mapping.getName());
	}
	
	private void setSemanticElements(DiagramElementMapping mapping) {
		mapping.setSemanticElements(
				IncQueryInterpreterConstants.PREFIX
				+ "/"
				+ IncQueryExpression.Command.ASSOCIATED_ELEMENTS_EXPRESSION
				+ "/" + mapping.getName());
	}
	
	private void setTargetFinderExpression(EdgeMapping mapping) {
		mapping.setTargetFinderExpression(
				mapping.getTargetFinderExpression()
				+ "/"
				+ IncQueryExpression.Command.TARGET_ELEMENTS_EXPRESSION
				+ "/" + mapping.getName());
	}
}
