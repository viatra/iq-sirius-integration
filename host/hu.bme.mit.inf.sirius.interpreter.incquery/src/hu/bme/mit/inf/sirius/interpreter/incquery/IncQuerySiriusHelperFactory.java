package hu.bme.mit.inf.sirius.interpreter.incquery;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;

public class IncQuerySiriusHelperFactory {

	private static Map<DDiagram, IncQuerySiriusHelper> helpers =
			new HashMap<DDiagram, IncQuerySiriusHelper>();
	
//	private static Map<String, DDiagram> diagramIds =
//			new HashMap<String, DDiagram>();
	
	
	public static IncQuerySiriusHelper getHelper(DDiagram diagram) {
		if (helpers.containsKey(diagram)) {
			return helpers.get(diagram);
		}
		
		//String diagramID = getDiagramID(diagram); 
		
		helpers.put(diagram, new IncQuerySiriusHelper(diagram, null));

		//diagramIds.put(diagramID, diagram);
		
		return helpers.get(diagram);
	}
	
//	public static IncQuerySiriusHelper getHelper(String id) {
//		DDiagram diagram = diagramIds.get(id);
//		if (diagram != null) {
//			return helpers.get(diagram);
//		}
//		
//		return null;
//	}
	
//	private static String getDiagramID(DDiagram diagram) {
//		String result = null;
//		
//		if (diagram.eResource() instanceof XMIResource) {
//			result = ((XMIResource) diagram.eResource()).getID(diagram);
//		}
//		
//		if (result == null) {
//			SessionManager.INSTANCE.getSession(diagram).save(new NullProgressMonitor());
//
//			if (diagram.eResource() instanceof XMIResource) {
//				result = ((XMIResource) diagram.eResource()).getID(diagram);
//			}
//		}
//		
//		return result;
//	}
	
	public static void removeHelper(DDiagram diagram) {
		helpers.remove(diagram);
		
//		diagramIds.remove(getDiagramID(diagram));
	}
}
