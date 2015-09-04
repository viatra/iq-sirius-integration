/**
 */
package socialnetwork_many_one_2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import socialnetwork_many_one_2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Socialnetwork_many_one_2FactoryImpl extends EFactoryImpl implements Socialnetwork_many_one_2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Socialnetwork_many_one_2Factory init() {
		try {
			Socialnetwork_many_one_2Factory theSocialnetwork_many_one_2Factory = (Socialnetwork_many_one_2Factory)EPackage.Registry.INSTANCE.getEFactory(Socialnetwork_many_one_2Package.eNS_URI);
			if (theSocialnetwork_many_one_2Factory != null) {
				return theSocialnetwork_many_one_2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Socialnetwork_many_one_2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socialnetwork_many_one_2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK: return createSocialNetwork();
			case Socialnetwork_many_one_2Package.FAMILY: return createFamily();
			case Socialnetwork_many_one_2Package.FRIEND: return createFriend();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetwork createSocialNetwork() {
		SocialNetworkImpl socialNetwork = new SocialNetworkImpl();
		return socialNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family createFamily() {
		FamilyImpl family = new FamilyImpl();
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Friend createFriend() {
		FriendImpl friend = new FriendImpl();
		return friend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socialnetwork_many_one_2Package getSocialnetwork_many_one_2Package() {
		return (Socialnetwork_many_one_2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Socialnetwork_many_one_2Package getPackage() {
		return Socialnetwork_many_one_2Package.eINSTANCE;
	}

} //Socialnetwork_many_one_2FactoryImpl
