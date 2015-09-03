package org.eclipse.incquery.viewmodel.core.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

public final class ViewModelUtil {

    // Disable constructor
    private ViewModelUtil() {}

    
    public static void add(EObject eObject, Resource target) {
		target.getContents().add(eObject);
    }
    
	public static EObject create(EClass eClass) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(eClass.getEPackage().getNsURI());
	
		return ePackage.getEFactoryInstance().create(eClass);
    }
    
	@SuppressWarnings("unchecked")
	public static void set(EObject source, EAttribute attribute, Object value) {
		attribute = (EAttribute) source.eClass().getEStructuralFeature(attribute.getName());
		
    	// TODO erre a feltételre igazából nincs szükség, ha van validáció!!!
    	if (source.eClass().getEAllAttributes().contains(attribute)) {
    		if (attribute.isMany()) {
    			((EList<Object>) source.eGet(attribute)).add(value);
    		} else {
    			source.eSet(attribute, value);
    		}
    	}
    }
	
    @SuppressWarnings("unchecked")
	public static void set(EObject source, EReference reference, EObject target) {
    	reference = (EReference) source.eClass().getEStructuralFeature(reference.getName());
    	
    	// TODO erre a feltételre igazából nincs szükség, ha van validáció!!!
    	if (source.eClass().getEAllReferences().contains(reference)) {
    		if (reference.isMany()) {
    			((EList<EObject>) source.eGet(reference)).add(target);
    		} else {
    			source.eSet(reference, target);
    		}
    	}
    }
    
    @SuppressWarnings("unchecked")
	public static void unset(EObject source, EAttribute attribute, Object value) {
		attribute = (EAttribute) source.eClass().getEStructuralFeature(attribute.getName());
    	
    	// TODO erre a feltételre igazából nincs szükség, ha van validáció!!!
    	if (source.eClass().getEAllAttributes().contains(attribute)) {
    		if (attribute.isMany()) {
    			((EList<Object>) source.eGet(attribute)).remove(value);
    		} else if (source.eGet(attribute).equals(value)) {
    			source.eUnset(attribute);
    		}
    	}
    }
    
    @SuppressWarnings("unchecked")
	public static void unset(EObject source, EReference reference, EObject target) {
    	reference = (EReference) source.eClass().getEStructuralFeature(reference.getName());
    	
    	// TODO erre a feltételre igazából nincs szükség, ha van validáció!!!
    	if (source.eClass().getEAllReferences().contains(reference)) {
    		if (reference.isMany()) {
    			((EList<EObject>) source.eGet(reference)).remove(target);
    		} else {
    			source.eUnset(reference);
    		}
    	}
    }
    
    public static void remove(EObject eObject) {
		EcoreUtil.remove(eObject);
    }
    
}
