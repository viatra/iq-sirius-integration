package org.eclipse.incquery.viewmodel.sirius.inmemoryresource;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class InMemoryResourceImpl extends ResourceImpl {

	public static final String URI_SCHEME = "inmemoryresource:/";
	
	public static final String URI_SEGMENT_DIAGRAM = "diagram/";

	
    /*
     * URI format: URI_SCHEME/DIAGRAM_ID
     *  e.g.: inmemoryresource:/diagramID
     */
	public InMemoryResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		// Nothing to do...
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		// Nothing to do...
	}

}
