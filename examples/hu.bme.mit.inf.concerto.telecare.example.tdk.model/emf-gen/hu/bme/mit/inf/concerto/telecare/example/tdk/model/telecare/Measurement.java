/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement#getMeasurementType <em>Measurement Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends Event {
	/**
	 * Returns the value of the '<em><b>Measurement Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Type</em>' reference.
	 * @see #setMeasurementType(MeasurementType)
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getMeasurement_MeasurementType()
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getMeasurement
	 * @model opposite="measurement" required="true"
	 * @generated
	 */
	MeasurementType getMeasurementType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement#getMeasurementType <em>Measurement Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Type</em>' reference.
	 * @see #getMeasurementType()
	 * @generated
	 */
	void setMeasurementType(MeasurementType value);

} // Measurement
