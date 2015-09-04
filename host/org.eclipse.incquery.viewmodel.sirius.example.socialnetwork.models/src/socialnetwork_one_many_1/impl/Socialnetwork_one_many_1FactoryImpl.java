/**
 */
package socialnetwork_one_many_1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import socialnetwork_one_many_1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Socialnetwork_one_many_1FactoryImpl extends EFactoryImpl implements Socialnetwork_one_many_1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Socialnetwork_one_many_1Factory init() {
		try {
			Socialnetwork_one_many_1Factory theSocialnetwork_one_many_1Factory = (Socialnetwork_one_many_1Factory)EPackage.Registry.INSTANCE.getEFactory(Socialnetwork_one_many_1Package.eNS_URI);
			if (theSocialnetwork_one_many_1Factory != null) {
				return theSocialnetwork_one_many_1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Socialnetwork_one_many_1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socialnetwork_one_many_1FactoryImpl() {
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
			case Socialnetwork_one_many_1Package.SOCIAL_NETWORK: return createSocialNetwork();
			case Socialnetwork_one_many_1Package.PERSON: return createPerson();
			case Socialnetwork_one_many_1Package.HOUSE: return createHouse();
			case Socialnetwork_one_many_1Package.CAR: return createCar();
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
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Car createCar() {
		CarImpl car = new CarImpl();
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socialnetwork_one_many_1Package getSocialnetwork_one_many_1Package() {
		return (Socialnetwork_one_many_1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Socialnetwork_one_many_1Package getPackage() {
		return Socialnetwork_one_many_1Package.eINSTANCE;
	}

} //Socialnetwork_one_many_1FactoryImpl
