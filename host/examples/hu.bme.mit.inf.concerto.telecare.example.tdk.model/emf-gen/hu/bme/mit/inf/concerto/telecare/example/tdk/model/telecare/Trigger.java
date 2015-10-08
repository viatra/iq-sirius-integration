/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Trigger#getTriggeredEvents <em>Triggered Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getTrigger()
 * @model abstract="true"
 * @generated
 */
public interface Trigger extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Triggered Events</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Event}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Event#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered Events</em>' containment reference list.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage#getTrigger_TriggeredEvents()
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Event#getTrigger
	 * @model opposite="trigger" containment="true"
	 * @generated
	 */
	EList<Event> getTriggeredEvents();

} // Trigger
