package hu.bme.mit.inf.eclipse.incquery.utils;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.extensibility.QuerySpecificationRegistry;

public class IncQueryUtils {

	private static final String RUNTIME_QUERY_SPECIFICATION_EXTENSION_ID = "org.eclipse.incquery.runtime.queryspecification";
	private static final Object QUERY_SPECIFICATION_GROUP_ELEMENT = "group";
	private static final String QUERY_SPECIFICATION_GROUP_ATTRIBUTE_ID = "id";
	
	private static final Logger logger = LoggingUtils.getLogger(IncQueryUtils.class, Level.INFO);

	
	public static Set<IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>> loadPatternsFromExtensions() {
		Set<IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>> result = 
				new HashSet<IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>>();
		
		Set<String> classFQNs = new HashSet<String>();
		Set<String> duplicateFQNs = new HashSet<String>();
		
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = extensionRegistry.getExtensionPoint(RUNTIME_QUERY_SPECIFICATION_EXTENSION_ID);
		
		for (IExtension extension : extensionPoint.getExtensions()) {
			for (IConfigurationElement configurationElement : extension.getConfigurationElements()) {
				processQuerySpecificationConfigurationElement(configurationElement, result, classFQNs, duplicateFQNs);
			}
		}

		// Logging duplicate FQNs
		for (String fqn : duplicateFQNs) {
			logger.info("Duplicate FQN: " + fqn);
		}
		
		return result;
	}
	
	
	private static void processQuerySpecificationConfigurationElement(IConfigurationElement configurationElement,
			Set<IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>> querySpecifications,
			Set<String> classFQNs, Set<String> duplicateFQNs) {
		
		if (configurationElement.getName().equals(QUERY_SPECIFICATION_GROUP_ELEMENT)) {
			String id = configurationElement.getAttribute(QUERY_SPECIFICATION_GROUP_ATTRIBUTE_ID);
			
			if (id != null) {
				// TODO getPackageFrom id?????!!!!
				String[] idParts = id.split("\\.");
				String packageName = id.replace("." + idParts[idParts.length-1], "");
				
				Set<IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>> newQuerySpecifications = 
						QuerySpecificationRegistry.getPatternGroup(packageName);
				
				mergeQuerySpecifications(querySpecifications, newQuerySpecifications, classFQNs, duplicateFQNs);
			}
		}		
	}
	
	private static void mergeQuerySpecifications(
			Set<IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>> querySpecifications,
			Set<IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>>> newQuerySpecifications,
			Set<String> classFQNs, Set<String> duplicateFQNs) {
		
		String fqn = null;
		for (IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> querySpec : newQuerySpecifications) {
			fqn = querySpec.getFullyQualifiedName();
			
			if (!classFQNs.contains(fqn)) {
				classFQNs.add(fqn);
				
				querySpecifications.add(querySpec);
			} else {
				duplicateFQNs.add(fqn);
			}
		}
	}
}