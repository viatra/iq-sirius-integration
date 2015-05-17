package hu.bme.mit.inf.sirius.interpreter.incquery;

import hu.bme.mit.inf.eclipse.incquery.utils.IncQueryUtils;
import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;
import hu.bme.mit.inf.sirius.interpreter.incquery.IncQueryExpression.Parameter;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
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
	
	private Map<String, IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>> patterns = null;
	
	
	public IncQueryInterpreter() {
		logger.info("Constructor...");
		
		variables = new HashMap<String, Object>();
		
		acceptableExpressions = new HashSet<String>();
		
		patterns = new HashMap<String, IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>>();
		
		Set<IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>> querySpecifications =
				IncQueryUtils.loadPatternsFromExtensions();
		
		for (IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> querySpecification : querySpecifications) {
			patterns.put(querySpecification.getFullyQualifiedName(), querySpecification);
			
			acceptableExpressions.add(IncQueryInterpreterConstants.PREFIX + querySpecification.getFullyQualifiedName());
		}
		
		// TODO
		acceptableExpressions.add(IncQueryInterpreterConstants.PREFIX + "init");
		
		logger.info(acceptableExpressions.toString());
	}
	
	public Set<String> getAcceptableExpressions() {
		return acceptableExpressions;
	}
	
	private IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> getQuerySpecification(String expression) {
//		logger.info("getQuerySpecification::expression:" + expression);
		
		expression = expression.replace(IncQueryInterpreterConstants.PREFIX, "");
		
		return patterns.get(expression);
	}
	
	@Override
	public boolean provides(String expression) {
		if (expression.contains(IncQueryInterpreterConstants.PREFIX)) {
//			logger.info("provides::expression:" + expression);
			
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
		
		try {
			logger.info("evaluateCollection::context:" + context.toString() + "::expression:" + expression);

			// TODO
			List<EObject> result = IncQuerySiriusHelperFactory.getHelper(getDiagramVariable())
					.getElements(IncQueryExpression.parse(expression), context);
			
			logger.info("" + result);
			
			return result;
		} catch (Exception e) {
			// TODO
			e.printStackTrace();
		}
		
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
			// TODO hibaüzenet?
			
			return null;
		}

		try {
			IncQueryExpression incQueryExpression = IncQueryExpression.parse(expression);
			if (incQueryExpression == null) {
				// TODO hibakezeles?
				
				return null;
			}
			
			IncQuerySiriusHelperFactory.getHelper(getDiagramVariable())
					.init(context, incQueryExpression.getParameter(Parameter.packageNS));
		} catch (Exception e) {
			e.printStackTrace();
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
		// TODO
//		logger.info("setVariable::name:" + name + "::value:" + value.toString());
		
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
