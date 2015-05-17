/**
 */
package socialnetwork_many_one_2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see socialnetwork_many_one_2.Socialnetwork_many_one_2Package
 * @generated
 */
public interface Socialnetwork_many_one_2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Socialnetwork_many_one_2Factory eINSTANCE = socialnetwork_many_one_2.impl.Socialnetwork_many_one_2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Social Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Network</em>'.
	 * @generated
	 */
	SocialNetwork createSocialNetwork();

	/**
	 * Returns a new object of class '<em>Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family</em>'.
	 * @generated
	 */
	Family createFamily();

	/**
	 * Returns a new object of class '<em>Friend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Friend</em>'.
	 * @generated
	 */
	Friend createFriend();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Socialnetwork_many_one_2Package getSocialnetwork_many_one_2Package();

} //Socialnetwork_many_one_2Factory
