/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getMinInterval <em>Min Interval</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getSensor <em>Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getMeasurementType()
 * @model
 * @generated
 */
public interface MeasurementType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Min Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Interval</em>' attribute.
	 * @see #setMinInterval(long)
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getMeasurementType_MinInterval()
	 * @model required="true"
	 * @generated
	 */
	long getMinInterval();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getMinInterval <em>Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Interval</em>' attribute.
	 * @see #getMinInterval()
	 * @generated
	 */
	void setMinInterval(long value);

	/**
	 * Returns the value of the '<em><b>Measurement</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement#getMeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement</em>' reference list.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getMeasurementType_Measurement()
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement#getMeasurementType
	 * @model opposite="measurementType"
	 * @generated
	 */
	EList<Measurement> getMeasurement();

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getMeasurementTypes <em>Measurement Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' container reference.
	 * @see #setSensor(Sensor)
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getMeasurementType_Sensor()
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getMeasurementTypes
	 * @model opposite="measurementTypes" required="true" transient="false"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getSensor <em>Sensor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' container reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // MeasurementType
