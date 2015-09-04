/**
 */
package socialnetwork_many_one_2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialnetwork_many_one_2.SocialNetwork#getMembers <em>Members</em>}</li>
 *   <li>{@link socialnetwork_many_one_2.SocialNetwork#getFriends <em>Friends</em>}</li>
 * </ul>
 *
 * @see socialnetwork_many_one_2.Socialnetwork_many_one_2Package#getSocialNetwork()
 * @model
 * @generated
 */
public interface SocialNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link socialnetwork_many_one_2.Family}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see socialnetwork_many_one_2.Socialnetwork_many_one_2Package#getSocialNetwork_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Family> getMembers();

	/**
	 * Returns the value of the '<em><b>Friends</b></em>' containment reference list.
	 * The list contents are of type {@link socialnetwork_many_one_2.Friend}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friends</em>' containment reference list.
	 * @see socialnetwork_many_one_2.Socialnetwork_many_one_2Package#getSocialNetwork_Friends()
	 * @model containment="true"
	 * @generated
	 */
	EList<Friend> getFriends();

} // SocialNetwork
