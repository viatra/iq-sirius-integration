package org.eclipse.incquery.viewmodel.sirius;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;

public class SiriusTransformationManagerFactory {

	private static Map<DDiagram, SiriusTransformationManager> diagramToManagerMap = new HashMap<DDiagram, SiriusTransformationManager>();;
	
	private static Map<String, SiriusTransformationManager> diagramIdToManagerMap = new HashMap<String, SiriusTransformationManager>();

	
	
	public static SiriusTransformationManager getSiriusTransformationManager(DDiagram diagram) throws Exception {
		if (diagram.eResource() != null && 
				SessionManager.INSTANCE.getExistingSession(diagram.eResource().getURI()) != null) {
			
			if (!diagramToManagerMap.containsKey(diagram)) {
				String diagramId = getDiagramID(diagram);
				if (diagramId == null) {
					throw new Exception("There is no id for the diagram");
				}
				
				SiriusTransformationManager instance = new SiriusTransformationManager(diagram, diagramId);
				
				diagramToManagerMap.put(diagram, instance);
				diagramIdToManagerMap.put(diagramId, instance);
			}
			
			return diagramToManagerMap.get(diagram);
		}
		
		return null;
	}
	
	public static SiriusTransformationManager getSiriusTransformationManager(String diagramId) {
		return diagramIdToManagerMap.get(diagramId);
	}
	
	private static String getDiagramID(DDiagram diagram) {
		String result = null;

		if (diagram.eResource() instanceof XMLResource) {
			result = ((XMLResource) diagram.eResource()).getID(diagram);
			
			if (result == null) {
				try {
					diagram.eResource().save(null);
				} catch (IOException e) {
					// TODO
					e.printStackTrace();
				}

				result = ((XMLResource) diagram.eResource()).getID(diagram);
			}			
		}

		return result;
	}
}
