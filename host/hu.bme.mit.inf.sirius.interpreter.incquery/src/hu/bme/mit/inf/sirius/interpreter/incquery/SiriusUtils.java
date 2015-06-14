package hu.bme.mit.inf.sirius.interpreter.incquery;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagram;

public class SiriusUtils {
	
	/*
	 * This method refreshes the given Sirius diagram
	 */
	public static void refreshDiagram(Session session, DDiagram diagram) {
		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		domain.getCommandStack().execute(new RefreshRepresentationsCommand(
				domain,	new NullProgressMonitor(), diagram));
	}
}
