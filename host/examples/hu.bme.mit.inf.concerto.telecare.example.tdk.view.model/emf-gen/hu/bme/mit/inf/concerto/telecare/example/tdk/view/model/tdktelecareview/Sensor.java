/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.TdktelecareviewPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Server}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.TdktelecareviewPackage#getSensor_ConnectedTo()
	 * @model
	 * @generated
	 */
	EList<Server> getConnectedTo();

	/**
	 * Returns the value of the '<em><b>Triggered By</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Tigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered By</em>' reference list.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.TdktelecareviewPackage#getSensor_TriggeredBy()
	 * @model
	 * @generated
	 */
	EList<Tigger> getTriggeredBy();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.TdktelecareviewPackage#getSensor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Sensor
