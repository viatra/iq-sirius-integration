/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends NamedElement {
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
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getGateway_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' reference list.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getGateway_Sensors()
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getConnectedTo
	 * @model opposite="connectedTo"
	 * @generated
	 */
	EList<Sensor> getSensors();

} // Gateway
