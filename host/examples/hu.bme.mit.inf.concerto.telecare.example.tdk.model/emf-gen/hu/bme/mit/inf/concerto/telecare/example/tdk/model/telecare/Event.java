/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Event#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Trigger#getTriggeredEvents <em>Triggered Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' container reference.
	 * @see #setTrigger(Trigger)
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getEvent_Trigger()
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Trigger#getTriggeredEvents
	 * @model opposite="triggeredEvents" required="true" transient="false"
	 * @generated
	 */
	Trigger getTrigger();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Event#getTrigger <em>Trigger</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' container reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Trigger value);

} // Event
