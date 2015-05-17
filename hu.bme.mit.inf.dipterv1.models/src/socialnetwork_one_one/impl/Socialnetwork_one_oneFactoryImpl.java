/**
 */
package socialnetwork_one_one.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import socialnetwork_one_one.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Socialnetwork_one_oneFactoryImpl extends EFactoryImpl implements Socialnetwork_one_oneFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Socialnetwork_one_oneFactory init() {
		try {
			Socialnetwork_one_oneFactory theSocialnetwork_one_oneFactory = (Socialnetwork_one_oneFactory)EPackage.Registry.INSTANCE.getEFactory(Socialnetwork_one_onePackage.eNS_URI);
			if (theSocialnetwork_one_oneFactory != null) {
				return theSocialnetwork_one_oneFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Socialnetwork_one_oneFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socialnetwork_one_oneFactoryImpl() {
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
			case Socialnetwork_one_onePackage.SOCIAL_NETWORK: return createSocialNetwork();
			case Socialnetwork_one_onePackage.CHILD: return createChild();
			case Socialnetwork_one_onePackage.ADULT: return createAdult();
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
	public Child createChild() {
		ChildImpl child = new ChildImpl();
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adult createAdult() {
		AdultImpl adult = new AdultImpl();
		return adult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socialnetwork_one_onePackage getSocialnetwork_one_onePackage() {
		return (Socialnetwork_one_onePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Socialnetwork_one_onePackage getPackage() {
		return Socialnetwork_one_onePackage.eINSTANCE;
	}

} //Socialnetwork_one_oneFactoryImpl
