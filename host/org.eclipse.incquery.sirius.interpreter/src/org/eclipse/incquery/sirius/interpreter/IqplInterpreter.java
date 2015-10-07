package org.eclipse.incquery.sirius.interpreter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.incquery.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.incquery.patternlanguage.emf.ui.internal.EMFPatternLanguageActivator;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.patternlanguage.patternLanguage.PatternModel;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.base.api.BaseIndexOptions;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterContext;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterStatus;
import org.eclipse.sirius.common.tools.api.interpreter.IVariableStatusListener;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.ecore.extender.business.api.accessor.MetamodelDescriptor;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;

import com.google.common.collect.Sets;
import com.google.inject.Injector;

public class IqplInterpreter implements IInterpreter {
	private static final String RESOURCE_URI = "dummy:/queries.eiq";

	private static final String ANNOTATION_BIND = "Bind";

	private static final String ANNOTATION_RETURN = "Return";
	
	private static final String ANNOTATION_PARAMETER_RESULT = "result";
	
	private Map<String, Object> variables = null;
	
	private List<String> importedMetamodels = null;
	
	private Map<Resource, AdvancedIncQueryEngine> engines = null;
	
	private HashMap<String, IQuerySpecification<?>> expressionToQuerySpecificationMap = null;

	
	public IqplInterpreter() {
		variables = new HashMap<String, Object>();
		
		importedMetamodels = new ArrayList<String>();
		
		engines = new HashMap<Resource, AdvancedIncQueryEngine>();
		
		expressionToQuerySpecificationMap = new HashMap<String, IQuerySpecification<?>>();
	}
	
	@Override
	public boolean provides(String expression) {
		if (expression != null
				&& expression.startsWith(IqplInterpreterConstants.PREFIX)) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean supportsValidation() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Collection<IInterpreterStatus> validateExpression(IInterpreterContext context, String expression) {
		// TODO Auto-generated method stub
		System.out.println("IqplInterpreter:validateExpression:" + expression);
		return null;
	}

	@Override
	public Collection<EObject> evaluateCollection(EObject context, String expression) throws EvaluationException {
		List<EObject> result = new ArrayList<EObject>();
		
		Set<Object> items = getResults(context, expression);
		if (items != null) {
			for (Object item : items) {
				if (item instanceof EObject) {
					result.add((EObject) item);
				}
			}
		}
		
		return result;
	}

	@Override
	public Object evaluate(EObject target, String expression) throws EvaluationException {
		return getResult(target, expression);
	}

	@Override
	public boolean evaluateBoolean(EObject context, String expression) throws EvaluationException {
		Object result = getResult(context, expression);
		if (result instanceof Boolean) {
			return (Boolean) result;
		}
		
		return false;
	}

	@Override
	public EObject evaluateEObject(EObject context, String expression) throws EvaluationException {
		Object result = getResult(context, expression);
		if (result instanceof EObject) {
			return (EObject) result;
		}
		
		return null;
	}

	@Override
	public String evaluateString(EObject context, String expression) throws EvaluationException {
		Object result = getResult(context, expression);
		if (result instanceof String) {
			return (String) result;
		}
		
		return null;
	}

	@Override
	public Integer evaluateInteger(EObject context, String expression) throws EvaluationException {
		Object result = getResult(context, expression);
		if (result instanceof Integer) {
			return (Integer) result;
		}
		
		return null;
	}

	@Override
	public void clearImports() {
		// TODO Auto-generated method stub
		System.out.println("IqplInterpreter::clearImports");		
	}

	@Override
	public void addImport(String dependency) {
		// TODO Auto-generated method stub
		System.out.println("IqplInterpreter::addImport:"+dependency);
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
		for (Entry<Resource, AdvancedIncQueryEngine> entry : engines.entrySet()) {
			entry.getValue().dispose();
		}
		
		engines.clear();
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
		
	}

	@Override
	public String getPrefix() {
		return IqplInterpreterConstants.PREFIX;
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
		
	}
	
	/**
	 * This method creates a PartialMatch instance, and sets the corresponding parameters
	 * 	according to the Bind annotation.
	 * @param querySpecification The IQuerySpecification instance, that is used to create the PartialMatch
	 * @return A PartialMatch instance
	 */
	private IPatternMatch createPartialMatch(IQuerySpecification<?> querySpecification) {
		if (querySpecification == null) {
			return null;
		}
		
		IPatternMatch result = querySpecification.newEmptyMatch();
		
		PAnnotation bindAnnotation = querySpecification.getFirstAnnotationByName(ANNOTATION_BIND);
		
		if (bindAnnotation != null) {
			for (Entry<String, Object> entry : bindAnnotation.getAllValues()) {
				// TODO validation! Value biztosan String?
				if (entry.getValue() instanceof String) {
					result.set(entry.getKey(), variables.get(entry.getValue()));
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Returns the first result from the matches.
	 * @param context The context of the expression (EObject)
	 * @param expression The IQPL expression
	 * @return The first result from the matches
	 */
	private Object getResult(EObject context, String expression) {
		Set<Object> results = getResults(context, expression);
		
		if (results != null && !results.isEmpty()) {
			return results.iterator().next();
		}
		
		return null;
	}
	
	/**
	 * Returns a set of results from the matches.
	 * @param context The context of the expression (EObject)
	 * @param expression The IQPL expression
	 * @return Returns a set of results from the matches
	 */
	private Set<Object> getResults(EObject context, String expression) {
		Set<Object> result = null;
		
		try {
			setVariable("self", context);
			
			IncQueryMatcher<IPatternMatch> matcher = null;
			
			IQuerySpecification<?> querySpecification = getQuerySpecification(context, expression);
			
			matcher = (IncQueryMatcher<IPatternMatch>) querySpecification.getMatcher(getEngine(context));
			
			if (matcher != null) {
				String resultParameterName = getResultParameterName(querySpecification);
				
				IPatternMatch partialMatch = createPartialMatch(querySpecification);
				
				result = matcher.getAllValues(resultParameterName, partialMatch);
			}
		} catch (IncQueryException e) {
			// TODO
			e.printStackTrace();
		} finally {
			unSetVariable("self");
		}
		
		return result;
	}
	
	private IProject getContextProject(EObject eobject){
		URI uri = eobject.eResource().getURI();
		String path = uri.toPlatformString(true);
		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path)).getProject();
	}
	
	private ResourceSet createResourceSet(IProject project){
		Injector injector = EMFPatternLanguageActivator.getInstance().getInjector(EMFPatternLanguageActivator.ORG_ECLIPSE_INCQUERY_PATTERNLANGUAGE_EMF_EMFPATTERNLANGUAGE);
		ResourceSet resourceSet = injector.getInstance(XtextResourceSetProvider.class).get(project);
//		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		return resourceSet;
	}
	
	private ClassLoader getClassLoader(IProject project) throws CoreException, MalformedURLException {
		IJavaProject jp = JavaCore.create(project);
		String[] classPathEntries = JavaRuntime.computeDefaultRuntimeClassPath(jp);
		List<URL> classURLs = getClassesAsURLs(classPathEntries);
		URL[] urls = (URL[]) classURLs.toArray(new URL[classURLs.size()]);
		URLClassLoader loader = URLClassLoader.newInstance(urls, jp.getClass().getClassLoader());
		return loader;
    }
	
    private List<URL> getClassesAsURLs(String[] classPathEntries) throws MalformedURLException {
        List<URL> urlList = new ArrayList<URL>();
        for (int i = 0; i < classPathEntries.length; i++) {
            String entry = classPathEntries[i];
            IPath path = new Path(entry);
            URL url = path.toFile().toURI().toURL();
            urlList.add(url);
        }
        return urlList;
    }
	
	/**
	 * Get IQuerySpecification from the given expression
	 * @param context The context on which the expression is called
	 * @param expression The IQPL expression
	 * @return IQuerySpecification created from the given IQPL expression
	 */
	private IQuerySpecification<?> getQuerySpecification(EObject context, String expression) {
		String originalExpression = expression;
		if (expressionToQuerySpecificationMap.containsKey(expression)) {
			return expressionToQuerySpecificationMap.get(expression);
		}
		
		// Remove the prefix from the expression
		expression = expression.replace(IqplInterpreterConstants.PREFIX, "");

		/* Load imports from DiagramDescription */
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("package org.eclipse.incquery.sirius.generated\n");
		
		for (EPackage ePackage : getImportedMetamodels(context)) {
			stringBuilder
				.append("import \"")
				.append(ePackage.getNsURI())
				.append("\"\n");
		}
		
		stringBuilder.append("\n");
		stringBuilder.append(expression);
		
		expression = stringBuilder.toString();
		/* ************************************ */
		
		
	    InputStream is = new ByteArrayInputStream( expression.getBytes() );
	    try {
	    	//TODO extract project from context
			//IProject contextProject = getContextProject(context);
	    	IProject contextProject = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.incquery.examples.cps.viewpoint");
			ResourceSet resourceSet = createResourceSet(contextProject);
//			URI uri = URI.createURI(RESOURCE_URI);
			URI uri = URI.createPlatformResourceURI("/"+contextProject.getName()+"/src/org.eclipse/incquery/sirius/generated/pattern"+expression.hashCode()+".eiq", true);
			Resource resource = resourceSet.createResource(uri);
			SpecificationBuilder specificationBuilder = new SpecificationBuilder();
	    	
		    // Load Resource from the given expression
	    	resource.load(is, null);
			
	    	// If the parsing of the expression was successfull
		    if (resource.getErrors().size() == 0 && resource.getContents().size() >= 1) {
		    	
		    	// The root of the Resource must be a non-empty PatternModel element
		    	EObject topElement = resource.getContents().get(0);
				if (topElement instanceof PatternModel) {
					PatternModel patternModel = (PatternModel) topElement;
					
					if (patternModel.getPatterns() == null) {
						return null;
					}
					
					List<IQuerySpecification<?>> querySpecifications = new ArrayList<IQuerySpecification<?>>();
					for (Pattern pattern : patternModel.getPatterns()) {
						querySpecifications.add(specificationBuilder.getOrCreateSpecification(pattern));
					}
					
					IQuerySpecification<?> querySpecification = getQuerySpecificationForReturn(querySpecifications);
					expressionToQuerySpecificationMap.put(originalExpression, querySpecification);
					
					return querySpecification;
				}
		    }
		} catch (IOException | IncQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Returns that IQuerySpecification instance from the given list, which will provide the result(s).
	 * @param querySpecifications The IQuerySpecification instances which were created from the given IQPL expression
	 * @return Returns that IQuerySpecification instance from the given list, which will provide the result(s)
	 */
	private IQuerySpecification<?> getQuerySpecificationForReturn(List<IQuerySpecification<?>> querySpecifications) {
		if (querySpecifications == null) {
			return null;
		}
		
		if (querySpecifications.size() == 0) {
			return null;
		} else if (querySpecifications.size() == 1) {
			return querySpecifications.get(0);
		} else {
			PAnnotation returnAnnotation = null;
			for (IQuerySpecification<?> querySpecification : querySpecifications) {
				// TODO validation!!!! Mi van, ha elírja a paramétert...
				returnAnnotation = querySpecification.getFirstAnnotationByName(ANNOTATION_RETURN);
				
				if (returnAnnotation != null) {
					return querySpecification;
				}
			}
			
			return querySpecifications.get(0);
		}
	}
	
	/**
	 * Get the name of that parameter, which will contain the result.
	 * @param querySpecification The IQuerySpecification instance, which were created from the givel IQPL expression
	 * @return The name of that parameter, which will contain the result
	 */
	private String getResultParameterName(IQuerySpecification<?> querySpecification) {
		if (querySpecification == null || querySpecification.getParameterNames().isEmpty()) {
			return null;
		}
		
		PAnnotation returnAnnotation = querySpecification.getFirstAnnotationByName(ANNOTATION_RETURN);
		
		if (returnAnnotation != null) {
			// TODO validation itt is!!!! MI van ha nem Stringet irt be...
			return (String) returnAnnotation.getFirstValue(ANNOTATION_PARAMETER_RESULT);
		}
		
		return querySpecification.getParameterNames().get(0);
	}
	
	/**
	 * Get or create an AdvancedIncQueryEngine instance based on the given context.
	 * @param context The context of the IQPL expression
	 * @return an AdvancedIncQueryEngine instance
	 */
	private AdvancedIncQueryEngine getEngine(EObject context) {
		if (context != null) {
			Resource resource = context.eResource();
			
			if (resource != null) {
				try {
					if (!engines.containsKey(resource)) {
						engines.put(resource, AdvancedIncQueryEngine.createUnmanagedEngine(new EMFScope(resource, new BaseIndexOptions(false, true))));
					}
					
					return engines.get(resource);
				} catch (IncQueryException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
	
	/**
	 * Get the value of the "diagram" variable.
	 * @return Get the value of the "diagram" variable
	 */
	private DDiagram getDiagram() {
		if (variables != null) {
			return (DDiagram) variables.get("diagram");
		}
		
		return null;
	}
	
	private Set<EPackage> getImportedMetamodels(EObject context) {
		Set<EPackage> result = null;
		
		result = getImportedMetamodelsFromVariables();
		
		if (result != null) {
			return result;
		}
		
		result = getImportedMetamodelsFromSession(context);
		
		if (result != null) {
			return result;
		}
		
		return null;
	}
	
	private Set<EPackage> getImportedMetamodelsFromSession(EObject context) {
		Set<EPackage> result = Sets.newHashSet();
		
		Session session = SessionManager.INSTANCE.getSession(context);
		
		if (session != null) {
			DiagramDescription description = null;
			for (DRepresentation representation : DialectManager.INSTANCE.getAllRepresentations(session)) {
				if (representation instanceof DDiagram) {
					description = ((DDiagram) representation).getDescription();
					
					result.addAll(description.getMetamodel());
				}
			}
		}

		return result;
	}

	private Set<EPackage> getImportedMetamodelsFromVariables() {
		if (getDiagram() != null) {
			return Sets.newHashSet(getDiagram().getDescription().getMetamodel());
		} else {
			for (Object variable : variables.values()) {
				if (variable instanceof DDiagramElement) {
					return Sets.newHashSet(((DDiagramElement) variable).getParentDiagram().getDescription().getMetamodel());
				}
			}
		}
		
		return null;
	}
}
