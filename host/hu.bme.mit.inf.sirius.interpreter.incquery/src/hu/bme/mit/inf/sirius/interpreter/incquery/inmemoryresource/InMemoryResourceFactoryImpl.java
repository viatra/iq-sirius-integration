package hu.bme.mit.inf.sirius.interpreter.incquery.inmemoryresource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class InMemoryResourceFactoryImpl extends ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new InMemoryResourceImpl(uri);
	}
	
}
