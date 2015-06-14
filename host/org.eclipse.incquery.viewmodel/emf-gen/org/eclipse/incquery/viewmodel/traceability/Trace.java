/**
 */
package org.eclipse.incquery.viewmodel.traceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.incquery.viewmodel.traceability.Trace#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.eclipse.incquery.viewmodel.traceability.Trace#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.incquery.viewmodel.traceability.Trace#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.incquery.viewmodel.traceability.Trace#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.incquery.viewmodel.traceability.TraceabilityPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.eclipse.incquery.viewmodel.traceability.TraceabilityPackage#getTrace_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<EObject> getTargets();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.incquery.viewmodel.traceability.TraceabilityPackage#getTrace_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.incquery.viewmodel.traceability.Trace#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' reference list.
	 * @see org.eclipse.incquery.viewmodel.traceability.TraceabilityPackage#getTrace_Params()
	 * @model
	 * @generated
	 */
	EList<EObject> getParams();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' attribute list.
	 * @see org.eclipse.incquery.viewmodel.traceability.TraceabilityPackage#getTrace_Objects()
	 * @model
	 * @generated
	 */
	EList<Object> getObjects();

} // Trace
