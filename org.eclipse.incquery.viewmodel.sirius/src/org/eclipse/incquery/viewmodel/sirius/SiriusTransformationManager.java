package org.eclipse.incquery.viewmodel.sirius;


import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewmodel.configuration.Configuration;
import org.eclipse.incquery.viewmodel.core.ViewModelManager;
import org.eclipse.incquery.viewmodel.sirius.inmemoryresource.InMemoryResourceImpl;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.tools.api.command.semantic.RemoveSemanticResourceCommand;
import org.eclipse.viatra.emf.runtime.transformation.eventdriven.InconsistentEventSemanticsException;

public class SiriusTransformationManager {

	private DDiagram diagram;

	private String diagramId;
	
	private Session session;

	private URI targetResourceURI;

	private boolean initialized = false;

	private ViewModelManager viewModelManager;
	
	
	public SiriusTransformationManager(DDiagram diagram, String diagramId) {
		this.diagram = diagram;
		
		this.diagramId = diagramId;
		
		this.targetResourceURI = URI.createURI(InMemoryResourceImpl.URI_SCHEME + diagramId);
	}
	
	public EObject initialize(EObject sourceRoot, URI configModelURI) throws IncQueryException, InconsistentEventSemanticsException {
		// TODO
		if (!initialized) {
			session = SessionManager.INSTANCE.getSession(sourceRoot);
			
			removeInMemoryResourceFromSession();
			
			ResourceSet rset = new ResourceSetImpl();
			Resource configModelResource = rset.getResource(configModelURI, true);
			
			Resource targetResource = createInMemoryResource();
			
			Configuration configuration = (Configuration) configModelResource.getContents().get(0);
			configuration.setSourceModel(sourceRoot.eResource());
			configuration.setTargetModel(targetResource);
			
			viewModelManager = new ViewModelManager(configuration);
			
			viewModelManager.initialize();
			
			addInMemoryResourceToSession();
			
			this.initialized = true;
		}

		// Return with the root of the target model as the new root of the Sirius diagrams
		return getViewModelManager().getConfigurationModel().getTargetModel().getContents().get(0);
	}
	
	private void addInMemoryResourceToSession() {
		AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(
				session, targetResourceURI, new NullProgressMonitor());
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(addCommandToSession);
	}
	
	private Resource createInMemoryResource() {
		ResourceSet rset = session.getTransactionalEditingDomain().getResourceSet();
		if (rset != null) {
			return rset.createResource(targetResourceURI);
		}
		
		return null;
	}
	
	private void removeInMemoryResourceFromSession() {
		Resource resourceToRemove = null;
		for (Resource resource : session.getTransactionalEditingDomain().getResourceSet().getResources()) {
			if (resource.getURI().equals(targetResourceURI)) {
				resourceToRemove = resource;
				
				break;
			}
		}
		
		if (resourceToRemove != null) {
			RemoveSemanticResourceCommand removeSemanticResourceCommand = new RemoveSemanticResourceCommand(
					session, resourceToRemove, new NullProgressMonitor(), true);
			session.getTransactionalEditingDomain().getCommandStack()
					.execute(removeSemanticResourceCommand);
		}
	}
	
	public ViewModelManager getViewModelManager() {
		return this.viewModelManager;
	}
}
