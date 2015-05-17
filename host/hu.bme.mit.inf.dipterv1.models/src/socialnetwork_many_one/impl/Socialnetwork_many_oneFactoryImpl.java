/**
 */
package socialnetwork_many_one.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import socialnetwork_many_one.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Socialnetwork_many_oneFactoryImpl extends EFactoryImpl implements Socialnetwork_many_oneFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Socialnetwork_many_oneFactory init() {
		try {
			Socialnetwork_many_oneFactory theSocialnetwork_many_oneFactory = (Socialnetwork_many_oneFactory)EPackage.Registry.INSTANCE.getEFactory(Socialnetwork_many_onePackage.eNS_URI);
			if (theSocialnetwork_many_oneFactory != null) {
				return theSocialnetwork_many_oneFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Socialnetwork_many_oneFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socialnetwork_many_oneFactoryImpl() {
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
			case Socialnetwork_many_onePackage.SOCIAL_NETWORK: return createSocialNetwork();
			case Socialnetwork_many_onePackage.FAMILY: return createFamily();
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
	public Socialnetwork_many_onePackage getSocialnetwork_many_onePackage() {
		return (Socialnetwork_many_onePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Socialnetwork_many_onePackage getPackage() {
		return Socialnetwork_many_onePackage.eINSTANCE;
	}

} //Socialnetwork_many_oneFactoryImpl
