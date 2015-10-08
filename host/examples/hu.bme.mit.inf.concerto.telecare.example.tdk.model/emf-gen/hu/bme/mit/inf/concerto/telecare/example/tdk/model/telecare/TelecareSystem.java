/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem#getSensors <em>Sensors</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem#getHosts <em>Hosts</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getTelecareSystem()
 * @model
 * @generated
 */
public interface TelecareSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getTelecareSystem_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Hosts</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosts</em>' containment reference list.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getTelecareSystem_Hosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Host> getHosts();

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getTelecareSystem_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

} // TelecareSystem
