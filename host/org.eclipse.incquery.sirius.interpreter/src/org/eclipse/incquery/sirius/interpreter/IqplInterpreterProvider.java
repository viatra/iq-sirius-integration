package org.eclipse.incquery.sirius.interpreter;

import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;

public class IqplInterpreterProvider implements IInterpreterProvider {
	
	@Override
	public boolean provides(String expression) {
		if (expression != null
				&& expression.startsWith(IqplInterpreterConstants.PREFIX)) {
			return true;
		}
		
		return false;
	}

	@Override
	public IInterpreter createInterpreter() {
		// TODO
		System.out.println("IqplInterpreterProvider:createInterpreter");
		
		return new IqplInterpreter();
	}

}
