package hu.bme.mit.inf.sirius.interpreter.incquery.inmemoryresource;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class InMemoryResourceImpl extends ResourceImpl {

	public static final String URI_SCHEME = "inmemoryresource:/";
	
	

	

	public InMemoryResourceImpl(URI uri) {
		super(uri);
		
		// TODO lecserelni valami ertelmesebbre...
		EcoreFactory coreFactory = EcoreFactory.eINSTANCE;
		
		EPackage rootEPackage = coreFactory.createEPackage();
		rootEPackage.setName("RootPackage");
		rootEPackage.setNsPrefix("rootpackage");
		rootEPackage.setNsURI("http://hu.bme.mit.inf.sirius.interpreter.incquery.inmemoryresource.models/root");
		
		EClass rootEClass = coreFactory.createEClass();
		rootEClass.setName("Root");
		
		rootEPackage.getEClassifiers().add(rootEClass);
		
		EObject root = coreFactory.create(rootEClass);
		
		getContents().add(root);
		
		//Create Traceability model's root element
//		EPackage traceabilityModelPackage = EPackage.Registry.INSTANCE
//				.getEPackage("http://org.eclipse.incquery/viewmodel/traceability/1.0");
//		
//		EFactory traceabilityModelFactory = EPackage.Registry.INSTANCE
//				.getEFactory("http://org.eclipse.incquery/viewmodel/traceability/1.0");
//		
//		EClass rootType = (EClass) traceabilityModelPackage.eContents().get(0);
//		
//		EObject rootObject = (EObject) traceabilityModelFactory.create(rootType);
//		
//		getContents().add(rootObject);
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		super.save(options);
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		super.load(options);
	}

	
	
}
