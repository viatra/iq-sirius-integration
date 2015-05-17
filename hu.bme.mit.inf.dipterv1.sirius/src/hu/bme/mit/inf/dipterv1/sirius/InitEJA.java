package hu.bme.mit.inf.dipterv1.sirius;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;

import java.util.Collection;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class InitEJA implements IExternalJavaAction {

	private static final Logger logger = LoggingUtils.getLogger(InitEJA.class);
	
	
	public InitEJA() {
		// TODO Auto-generated constructor stub
		logger.info("Constructor...");
	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		logger.info("execute::selections:" + selections + "::parameters:" + parameters);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		logger.info("canExecute...::selections:" + selections);
		
		return false;
	}

}
