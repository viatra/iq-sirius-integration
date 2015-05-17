/**
 */
package socialnetwork_base.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import socialnetwork_base.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Socialnetwork_baseFactoryImpl extends EFactoryImpl implements Socialnetwork_baseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Socialnetwork_baseFactory init() {
		try {
			Socialnetwork_baseFactory theSocialnetwork_baseFactory = (Socialnetwork_baseFactory)EPackage.Registry.INSTANCE.getEFactory(Socialnetwork_basePackage.eNS_URI);
			if (theSocialnetwork_baseFactory != null) {
				return theSocialnetwork_baseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Socialnetwork_baseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socialnetwork_baseFactoryImpl() {
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
			case Socialnetwork_basePackage.SOCIAL_NETWORK: return createSocialNetwork();
			case Socialnetwork_basePackage.MAN: return createMan();
			case Socialnetwork_basePackage.WOMAN: return createWoman();
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
	public Man createMan() {
		ManImpl man = new ManImpl();
		return man;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Woman createWoman() {
		WomanImpl woman = new WomanImpl();
		return woman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socialnetwork_basePackage getSocialnetwork_basePackage() {
		return (Socialnetwork_basePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Socialnetwork_basePackage getPackage() {
		return Socialnetwork_basePackage.eINSTANCE;
	}

} //Socialnetwork_baseFactoryImpl
