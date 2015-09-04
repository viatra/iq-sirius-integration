/**
 */
package socialnetwork_one_one;

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
 * @see socialnetwork_one_one.Socialnetwork_one_oneFactory
 * @model kind="package"
 * @generated
 */
public interface Socialnetwork_one_onePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "socialnetwork_one_one";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.incquery.viewmodel.sirius.example.socialnetwork.models/socialnetwork_one_one";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "socialnetwork_one_one";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Socialnetwork_one_onePackage eINSTANCE = socialnetwork_one_one.impl.Socialnetwork_one_onePackageImpl.init();

	/**
	 * The meta object id for the '{@link socialnetwork_one_one.impl.SocialNetworkImpl <em>Social Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialnetwork_one_one.impl.SocialNetworkImpl
	 * @see socialnetwork_one_one.impl.Socialnetwork_one_onePackageImpl#getSocialNetwork()
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
	 * The meta object id for the '{@link socialnetwork_one_one.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialnetwork_one_one.impl.PersonImpl
	 * @see socialnetwork_one_one.impl.Socialnetwork_one_onePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialnetwork_one_one.impl.ChildImpl <em>Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialnetwork_one_one.impl.ChildImpl
	 * @see socialnetwork_one_one.impl.Socialnetwork_one_onePackageImpl#getChild()
	 * @generated
	 */
	int CHILD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__NAME = PERSON__NAME;

	/**
	 * The number of structural features of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link socialnetwork_one_one.impl.AdultImpl <em>Adult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialnetwork_one_one.impl.AdultImpl
	 * @see socialnetwork_one_one.impl.Socialnetwork_one_onePackageImpl#getAdult()
	 * @generated
	 */
	int ADULT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT__NAME = PERSON__NAME;

	/**
	 * The number of structural features of the '<em>Adult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link socialnetwork_one_one.SocialNetwork <em>Social Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Network</em>'.
	 * @see socialnetwork_one_one.SocialNetwork
	 * @generated
	 */
	EClass getSocialNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link socialnetwork_one_one.SocialNetwork#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see socialnetwork_one_one.SocialNetwork#getMembers()
	 * @see #getSocialNetwork()
	 * @generated
	 */
	EReference getSocialNetwork_Members();

	/**
	 * Returns the meta object for class '{@link socialnetwork_one_one.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see socialnetwork_one_one.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link socialnetwork_one_one.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see socialnetwork_one_one.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link socialnetwork_one_one.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child</em>'.
	 * @see socialnetwork_one_one.Child
	 * @generated
	 */
	EClass getChild();

	/**
	 * Returns the meta object for class '{@link socialnetwork_one_one.Adult <em>Adult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adult</em>'.
	 * @see socialnetwork_one_one.Adult
	 * @generated
	 */
	EClass getAdult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Socialnetwork_one_oneFactory getSocialnetwork_one_oneFactory();

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
		 * The meta object literal for the '{@link socialnetwork_one_one.impl.SocialNetworkImpl <em>Social Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialnetwork_one_one.impl.SocialNetworkImpl
		 * @see socialnetwork_one_one.impl.Socialnetwork_one_onePackageImpl#getSocialNetwork()
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
		 * The meta object literal for the '{@link socialnetwork_one_one.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialnetwork_one_one.impl.PersonImpl
		 * @see socialnetwork_one_one.impl.Socialnetwork_one_onePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link socialnetwork_one_one.impl.ChildImpl <em>Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialnetwork_one_one.impl.ChildImpl
		 * @see socialnetwork_one_one.impl.Socialnetwork_one_onePackageImpl#getChild()
		 * @generated
		 */
		EClass CHILD = eINSTANCE.getChild();

		/**
		 * The meta object literal for the '{@link socialnetwork_one_one.impl.AdultImpl <em>Adult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialnetwork_one_one.impl.AdultImpl
		 * @see socialnetwork_one_one.impl.Socialnetwork_one_onePackageImpl#getAdult()
		 * @generated
		 */
		EClass ADULT = eINSTANCE.getAdult();

	}

} //Socialnetwork_one_onePackage
