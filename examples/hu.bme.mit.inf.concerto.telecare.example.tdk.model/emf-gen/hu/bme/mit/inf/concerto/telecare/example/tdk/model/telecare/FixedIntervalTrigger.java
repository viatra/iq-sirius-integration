/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Interval Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger#getInterval <em>Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getFixedIntervalTrigger()
 * @model
 * @generated
 */
public interface FixedIntervalTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(long)
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getFixedIntervalTrigger_Interval()
	 * @model default="0" unique="false" required="true" ordered="false"
	 * @generated
	 */
	long getInterval();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(long value);

} // FixedIntervalTrigger
