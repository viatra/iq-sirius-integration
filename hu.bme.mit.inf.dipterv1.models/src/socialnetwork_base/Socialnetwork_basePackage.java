/**
 */
package socialnetwork_base;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see socialnetwork_base.Socialnetwork_baseFactory
 * @model kind="package"
 * @generated
 */
public interface Socialnetwork_basePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "socialnetwork_base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.bme.mit.inf.models/socialnetwork_base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "socialnetwork_base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Socialnetwork_basePackage eINSTANCE = socialnetwork_base.impl.Socialnetwork_basePackageImpl.init();

	/**
	 * The meta object id for the '{@link socialnetwork_base.impl.SocialNetworkImpl <em>Social Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialnetwork_base.impl.SocialNetworkImpl
	 * @see socialnetwork_base.impl.Socialnetwork_basePackageImpl#getSocialNetwork()
	 * @generated
	 */
	int SOCIAL_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>Social Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Social Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialnetwork_base.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialnetwork_base.impl.PersonImpl
	 * @see socialnetwork_base.impl.Socialnetwork_basePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = 2;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FRIENDS = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CHILDREN = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>License Plate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LICENSE_PLATE_NUMBER = 6;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialnetwork_base.impl.ManImpl <em>Man</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialnetwork_base.impl.ManImpl
	 * @see socialnetwork_base.impl.Socialnetwork_basePackageImpl#getMan()
	 * @generated
	 */
	int MAN = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__FRIENDS = PERSON__FRIENDS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__CHILDREN = PERSON__CHILDREN;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>License Plate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__LICENSE_PLATE_NUMBER = PERSON__LICENSE_PLATE_NUMBER;

	/**
	 * The number of structural features of the '<em>Man</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Man</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link socialnetwork_base.impl.WomanImpl <em>Woman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialnetwork_base.impl.WomanImpl
	 * @see socialnetwork_base.impl.Socialnetwork_basePackageImpl#getWoman()
	 * @generated
	 */
	int WOMAN = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__FRIENDS = PERSON__FRIENDS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__CHILDREN = PERSON__CHILDREN;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>License Plate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN__LICENSE_PLATE_NUMBER = PERSON__LICENSE_PLATE_NUMBER;

	/**
	 * The number of structural features of the '<em>Woman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Woman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOMAN_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link socialnetwork_base.SocialNetwork <em>Social Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Network</em>'.
	 * @see socialnetwork_base.SocialNetwork
	 * @generated
	 */
	EClass getSocialNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link socialnetwork_base.SocialNetwork#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see socialnetwork_base.SocialNetwork#getMembers()
	 * @see #getSocialNetwork()
	 * @generated
	 */
	EReference getSocialNetwork_Members();

	/**
	 * Returns the meta object for class '{@link socialnetwork_base.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see socialnetwork_base.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link socialnetwork_base.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see socialnetwork_base.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link socialnetwork_base.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see socialnetwork_base.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link socialnetwork_base.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see socialnetwork_base.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the reference list '{@link socialnetwork_base.Person#getFriends <em>Friends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Friends</em>'.
	 * @see socialnetwork_base.Person#getFriends()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Friends();

	/**
	 * Returns the meta object for the reference list '{@link socialnetwork_base.Person#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see socialnetwork_base.Person#getChildren()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Children();

	/**
	 * Returns the meta object for the attribute '{@link socialnetwork_base.Person#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see socialnetwork_base.Person#getAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Address();

	/**
	 * Returns the meta object for the attribute '{@link socialnetwork_base.Person#getLicensePlateNumber <em>License Plate Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Plate Number</em>'.
	 * @see socialnetwork_base.Person#getLicensePlateNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LicensePlateNumber();

	/**
	 * Returns the meta object for class '{@link socialnetwork_base.Man <em>Man</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Man</em>'.
	 * @see socialnetwork_base.Man
	 * @generated
	 */
	EClass getMan();

	/**
	 * Returns the meta object for class '{@link socialnetwork_base.Woman <em>Woman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Woman</em>'.
	 * @see socialnetwork_base.Woman
	 * @generated
	 */
	EClass getWoman();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Socialnetwork_baseFactory getSocialnetwork_baseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link socialnetwork_base.impl.SocialNetworkImpl <em>Social Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialnetwork_base.impl.SocialNetworkImpl
		 * @see socialnetwork_base.impl.Socialnetwork_basePackageImpl#getSocialNetwork()
		 * @generated
		 */
		EClass SOCIAL_NETWORK = eINSTANCE.getSocialNetwork();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_NETWORK__MEMBERS = eINSTANCE.getSocialNetwork_Members();

		/**
		 * The meta object literal for the '{@link socialnetwork_base.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialnetwork_base.impl.PersonImpl
		 * @see socialnetwork_base.impl.Socialnetwork_basePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Friends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__FRIENDS = eINSTANCE.getPerson_Friends();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CHILDREN = eINSTANCE.getPerson_Children();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ADDRESS = eINSTANCE.getPerson_Address();

		/**
		 * The meta object literal for the '<em><b>License Plate Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LICENSE_PLATE_NUMBER = eINSTANCE.getPerson_LicensePlateNumber();

		/**
		 * The meta object literal for the '{@link socialnetwork_base.impl.ManImpl <em>Man</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialnetwork_base.impl.ManImpl
		 * @see socialnetwork_base.impl.Socialnetwork_basePackageImpl#getMan()
		 * @generated
		 */
		EClass MAN = eINSTANCE.getMan();

		/**
		 * The meta object literal for the '{@link socialnetwork_base.impl.WomanImpl <em>Woman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialnetwork_base.impl.WomanImpl
		 * @see socialnetwork_base.impl.Socialnetwork_basePackageImpl#getWoman()
		 * @generated
		 */
		EClass WOMAN = eINSTANCE.getWoman();

	}

} //Socialnetwork_basePackage
