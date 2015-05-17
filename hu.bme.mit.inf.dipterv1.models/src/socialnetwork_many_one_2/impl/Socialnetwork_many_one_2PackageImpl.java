/**
 */
package socialnetwork_many_one_2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import socialnetwork_many_one_2.Family;
import socialnetwork_many_one_2.Friend;
import socialnetwork_many_one_2.SocialNetwork;
import socialnetwork_many_one_2.Socialnetwork_many_one_2Factory;
import socialnetwork_many_one_2.Socialnetwork_many_one_2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Socialnetwork_many_one_2PackageImpl extends EPackageImpl implements Socialnetwork_many_one_2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass friendEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see socialnetwork_many_one_2.Socialnetwork_many_one_2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Socialnetwork_many_one_2PackageImpl() {
		super(eNS_URI, Socialnetwork_many_one_2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Socialnetwork_many_one_2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Socialnetwork_many_one_2Package init() {
		if (isInited) return (Socialnetwork_many_one_2Package)EPackage.Registry.INSTANCE.getEPackage(Socialnetwork_many_one_2Package.eNS_URI);

		// Obtain or create and register package
		Socialnetwork_many_one_2PackageImpl theSocialnetwork_many_one_2Package = (Socialnetwork_many_one_2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Socialnetwork_many_one_2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Socialnetwork_many_one_2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSocialnetwork_many_one_2Package.createPackageContents();

		// Initialize created meta-data
		theSocialnetwork_many_one_2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSocialnetwork_many_one_2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Socialnetwork_many_one_2Package.eNS_URI, theSocialnetwork_many_one_2Package);
		return theSocialnetwork_many_one_2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialNetwork() {
		return socialNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocialNetwork_Members() {
		return (EReference)socialNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocialNetwork_Friends() {
		return (EReference)socialNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamily() {
		return familyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFamily_Name() {
		return (EAttribute)familyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFriend() {
		return friendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriend_Source() {
		return (EReference)friendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriend_Target() {
		return (EReference)friendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFriend_Since() {
		return (EAttribute)friendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socialnetwork_many_one_2Factory getSocialnetwork_many_one_2Factory() {
		return (Socialnetwork_many_one_2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		socialNetworkEClass = createEClass(SOCIAL_NETWORK);
		createEReference(socialNetworkEClass, SOCIAL_NETWORK__MEMBERS);
		createEReference(socialNetworkEClass, SOCIAL_NETWORK__FRIENDS);

		familyEClass = createEClass(FAMILY);
		createEAttribute(familyEClass, FAMILY__NAME);

		friendEClass = createEClass(FRIEND);
		createEReference(friendEClass, FRIEND__SOURCE);
		createEReference(friendEClass, FRIEND__TARGET);
		createEAttribute(friendEClass, FRIEND__SINCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(socialNetworkEClass, SocialNetwork.class, "SocialNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSocialNetwork_Members(), this.getFamily(), null, "members", null, 0, -1, SocialNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSocialNetwork_Friends(), this.getFriend(), null, "friends", null, 0, -1, SocialNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familyEClass, Family.class, "Family", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFamily_Name(), ecorePackage.getEString(), "name", null, 0, 1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(friendEClass, Friend.class, "Friend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFriend_Source(), this.getFamily(), null, "source", null, 1, 1, Friend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFriend_Target(), this.getFamily(), null, "target", null, 1, 1, Friend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFriend_Since(), ecorePackage.getEInt(), "since", null, 0, 1, Friend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Socialnetwork_many_one_2PackageImpl
