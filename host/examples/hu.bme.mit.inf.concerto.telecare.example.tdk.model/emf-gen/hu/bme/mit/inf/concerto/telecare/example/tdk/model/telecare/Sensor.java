/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getMeasurementTypes <em>Measurement Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Measurement Types</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Types</em>' containment reference list.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getSensor_MeasurementTypes()
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getSensor
	 * @model opposite="sensor" containment="true" required="true"
	 * @generated
	 */
	EList<MeasurementType> getMeasurementTypes();

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference.
	 * @see #setConnectedTo(Gateway)
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getSensor_ConnectedTo()
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway#getSensors
	 * @model opposite="sensors"
	 * @generated
	 */
	Gateway getConnectedTo();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getConnectedTo <em>Connected To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected To</em>' reference.
	 * @see #getConnectedTo()
	 * @generated
	 */
	void setConnectedTo(Gateway value);

} // Sensor
