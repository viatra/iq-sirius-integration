package org.eclipse.incquery.viewmodel.sirius.interpreter;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.incquery.viewmodel.sirius.SiriusTransformationManager;
import org.eclipse.incquery.viewmodel.sirius.SiriusTransformationManagerFactory;
import org.eclipse.incquery.viewmodel.sirius.interpreter.IncQueryExpression.Parameter;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterContext;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterStatus;
import org.eclipse.sirius.common.tools.api.interpreter.IVariableStatusListener;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.ecore.extender.business.api.accessor.MetamodelDescriptor;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;

public class IncQueryInterpreter implements IInterpreter {
	
	private static final Logger logger = LoggingUtils.getLogger(IncQueryInterpreter.class);
	
	private Map<String, Object> variables = null;
	
	private Set<String> acceptableExpressions = null;
	
	
	public IncQueryInterpreter() {
		logger.info("Constructor...");
		
		variables = new HashMap<String, Object>();
		
		acceptableExpressions = new HashSet<String>();
		acceptableExpressions.add(IncQueryInterpreterConstants.PREFIX + IncQueryInterpreterConstants.EXPRESSION_INIT_TRANSFORMATION);
	}
	
	public Set<String> getAcceptableExpressions() {
		return acceptableExpressions;
	}
	
	@Override
	public boolean provides(String expression) {
		if (expression.startsWith(IncQueryInterpreterConstants.PREFIX)) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean supportsValidation() {
		return false;
	}

	@Override
	public Collection<IInterpreterStatus> validateExpression(
			IInterpreterContext context, String expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Collection<EObject> evaluateCollection(EObject context,
			String expression) throws EvaluationException {
		return null;
	}

	@Override
	public Object evaluate(EObject target, String expression)
			throws EvaluationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean evaluateBoolean(EObject context, String expression)
			throws EvaluationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EObject evaluateEObject(EObject context, String expression)
			throws EvaluationException {
		logger.info("evaluateEObject::context:" + context + "::expression:" + expression);
		
		if (expression == null) {
			throw new EvaluationException("The rootExpression field must be filled!");
		}
		
		IncQueryExpression incQueryExpression = IncQueryExpression.parse(expression);
		if (incQueryExpression != null && incQueryExpression.isInitTransformationExpression()) {
			// TODO
			try {
				SiriusTransformationManager manager = SiriusTransformationManagerFactory.getSiriusTransformationManager(getDiagramVariable());
				
				if (manager != null) {
					return manager.initialize(context, URI.createURI(incQueryExpression.getParameter(Parameter.configModelURI), true));
				} else {
					return context;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return context;
	}

	@Override
	public String evaluateString(EObject context, String expression)
			throws EvaluationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer evaluateInteger(EObject context, String expression)
			throws EvaluationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearImports() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addImport(String dependency) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setProperty(Object key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVariable(String name, Object value) {
		variables.put(name, value);
	}

	@Override
	public void unSetVariable(String name) {
		variables.remove(name);
	}

	@Override
	public Object getVariable(String name) {
		return variables.get(name);
	}

	@Override
	public void clearVariables() {
		variables.clear();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addVariableStatusListener(IVariableStatusListener newListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariableStatusListener(IVariableStatusListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, ?> getVariables() {
		return variables;
	}

	@Override
	public void setModelAccessor(ModelAccessor modelAccessor) {
		// TODO Auto-generated method stub
//		logger.info("setModelAccessor::modelAccessor:" + modelAccessor);
	}

	@Override
	public String getPrefix() {
		return IncQueryInterpreterConstants.PREFIX;
	}

	@Override
	public String getVariablePrefix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCrossReferencer(ECrossReferenceAdapter crossReferencer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<String> getImports() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeImport(String dependency) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activateMetamodels(Collection<MetamodelDescriptor> metamodels) {
		// TODO Auto-generated method stub
//		logger.info("" + metamodels);
	}

	private DDiagram getDiagramVariable() {
		return (DDiagram) getVariable("diagram");
	}
}
