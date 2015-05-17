/**
 */
package socialnetwork_many_one_2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Friend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link socialnetwork_many_one_2.Friend#getSource <em>Source</em>}</li>
 *   <li>{@link socialnetwork_many_one_2.Friend#getTarget <em>Target</em>}</li>
 *   <li>{@link socialnetwork_many_one_2.Friend#getSince <em>Since</em>}</li>
 * </ul>
 * </p>
 *
 * @see socialnetwork_many_one_2.Socialnetwork_many_one_2Package#getFriend()
 * @model
 * @generated
 */
public interface Friend extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Family)
	 * @see socialnetwork_many_one_2.Socialnetwork_many_one_2Package#getFriend_Source()
	 * @model required="true"
	 * @generated
	 */
	Family getSource();

	/**
	 * Sets the value of the '{@link socialnetwork_many_one_2.Friend#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Family value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Family)
	 * @see socialnetwork_many_one_2.Socialnetwork_many_one_2Package#getFriend_Target()
	 * @model required="true"
	 * @generated
	 */
	Family getTarget();

	/**
	 * Sets the value of the '{@link socialnetwork_many_one_2.Friend#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Family value);

	/**
	 * Returns the value of the '<em><b>Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Since</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Since</em>' attribute.
	 * @see #setSince(int)
	 * @see socialnetwork_many_one_2.Socialnetwork_many_one_2Package#getFriend_Since()
	 * @model
	 * @generated
	 */
	int getSince();

	/**
	 * Sets the value of the '{@link socialnetwork_many_one_2.Friend#getSince <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Since</em>' attribute.
	 * @see #getSince()
	 * @generated
	 */
	void setSince(int value);

} // Friend
