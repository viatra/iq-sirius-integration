/**
 */
package socialnetwork_one_one;

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
 *   <li>{@link socialnetwork_one_one.SocialNetwork#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see socialnetwork_one_one.Socialnetwork_one_onePackage#getSocialNetwork()
 * @model
 * @generated
 */
public interface SocialNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link socialnetwork_one_one.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see socialnetwork_one_one.Socialnetwork_one_onePackage#getSocialNetwork_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getMembers();

} // SocialNetwork
