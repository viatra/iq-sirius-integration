/**
 */
package socialnetwork_one_one;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see socialnetwork_one_one.Socialnetwork_one_onePackage
 * @generated
 */
public interface Socialnetwork_one_oneFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Socialnetwork_one_oneFactory eINSTANCE = socialnetwork_one_one.impl.Socialnetwork_one_oneFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Social Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Network</em>'.
	 * @generated
	 */
	SocialNetwork createSocialNetwork();

	/**
	 * Returns a new object of class '<em>Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child</em>'.
	 * @generated
	 */
	Child createChild();

	/**
	 * Returns a new object of class '<em>Adult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adult</em>'.
	 * @generated
	 */
	Adult createAdult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Socialnetwork_one_onePackage getSocialnetwork_one_onePackage();

} //Socialnetwork_one_oneFactory
