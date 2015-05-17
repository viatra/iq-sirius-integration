/**
 */
package socialnetwork_base.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import socialnetwork_base.Person;
import socialnetwork_base.Socialnetwork_basePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link socialnetwork_base.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link socialnetwork_base.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link socialnetwork_base.impl.PersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link socialnetwork_base.impl.PersonImpl#getFriends <em>Friends</em>}</li>
 *   <li>{@link socialnetwork_base.impl.PersonImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link socialnetwork_base.impl.PersonImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link socialnetwork_base.impl.PersonImpl#getLicensePlateNumber <em>License Plate Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFriends() <em>Friends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriends()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> friends;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> children;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicensePlateNumber() <em>License Plate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensePlateNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_PLATE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicensePlateNumber() <em>License Plate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensePlateNumber()
	 * @generated
	 * @ordered
	 */
	protected String licensePlateNumber = LICENSE_PLATE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Socialnetwork_basePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_basePackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_basePackage.PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_basePackage.PERSON__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getFriends() {
		if (friends == null) {
			friends = new EObjectResolvingEList<Person>(Person.class, this, Socialnetwork_basePackage.PERSON__FRIENDS);
		}
		return friends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Person>(Person.class, this, Socialnetwork_basePackage.PERSON__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_basePackage.PERSON__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensePlateNumber(String newLicensePlateNumber) {
		String oldLicensePlateNumber = licensePlateNumber;
		licensePlateNumber = newLicensePlateNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_basePackage.PERSON__LICENSE_PLATE_NUMBER, oldLicensePlateNumber, licensePlateNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Socialnetwork_basePackage.PERSON__FIRST_NAME:
				return getFirstName();
			case Socialnetwork_basePackage.PERSON__LAST_NAME:
				return getLastName();
			case Socialnetwork_basePackage.PERSON__AGE:
				return getAge();
			case Socialnetwork_basePackage.PERSON__FRIENDS:
				return getFriends();
			case Socialnetwork_basePackage.PERSON__CHILDREN:
				return getChildren();
			case Socialnetwork_basePackage.PERSON__ADDRESS:
				return getAddress();
			case Socialnetwork_basePackage.PERSON__LICENSE_PLATE_NUMBER:
				return getLicensePlateNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Socialnetwork_basePackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case Socialnetwork_basePackage.PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case Socialnetwork_basePackage.PERSON__AGE:
				setAge((Integer)newValue);
				return;
			case Socialnetwork_basePackage.PERSON__FRIENDS:
				getFriends().clear();
				getFriends().addAll((Collection<? extends Person>)newValue);
				return;
			case Socialnetwork_basePackage.PERSON__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Person>)newValue);
				return;
			case Socialnetwork_basePackage.PERSON__ADDRESS:
				setAddress((String)newValue);
				return;
			case Socialnetwork_basePackage.PERSON__LICENSE_PLATE_NUMBER:
				setLicensePlateNumber((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Socialnetwork_basePackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case Socialnetwork_basePackage.PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case Socialnetwork_basePackage.PERSON__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case Socialnetwork_basePackage.PERSON__FRIENDS:
				getFriends().clear();
				return;
			case Socialnetwork_basePackage.PERSON__CHILDREN:
				getChildren().clear();
				return;
			case Socialnetwork_basePackage.PERSON__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case Socialnetwork_basePackage.PERSON__LICENSE_PLATE_NUMBER:
				setLicensePlateNumber(LICENSE_PLATE_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Socialnetwork_basePackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case Socialnetwork_basePackage.PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case Socialnetwork_basePackage.PERSON__AGE:
				return age != AGE_EDEFAULT;
			case Socialnetwork_basePackage.PERSON__FRIENDS:
				return friends != null && !friends.isEmpty();
			case Socialnetwork_basePackage.PERSON__CHILDREN:
				return children != null && !children.isEmpty();
			case Socialnetwork_basePackage.PERSON__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case Socialnetwork_basePackage.PERSON__LICENSE_PLATE_NUMBER:
				return LICENSE_PLATE_NUMBER_EDEFAULT == null ? licensePlateNumber != null : !LICENSE_PLATE_NUMBER_EDEFAULT.equals(licensePlateNumber);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", age: ");
		result.append(age);
		result.append(", address: ");
		result.append(address);
		result.append(", licensePlateNumber: ");
		result.append(licensePlateNumber);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
