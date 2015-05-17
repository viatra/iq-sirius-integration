package hu.bme.mit.inf.sirius.interpreter.incquery;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;

public class IncQueryInterpreterProvider implements IInterpreterProvider {

	private static final Logger logger = LoggingUtils.getLogger(IncQueryInterpreterProvider.class);
	
	private IncQueryInterpreter interpreter = null;
	
	
	public IncQueryInterpreterProvider() {
		interpreter = new IncQueryInterpreter();
	}

	@Override
	public IInterpreter createInterpreter() {
		logger.info("Create interpreter...");
		
		return interpreter;
	}

	@Override
	public boolean provides(String expression) {
		if (interpreter != null) {
			return interpreter.provides(expression);
		} else {
			return false;
		}
	}
}
