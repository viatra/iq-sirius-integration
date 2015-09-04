/**
 */
package socialnetwork_one_many_1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import socialnetwork_one_many_1.Car;
import socialnetwork_one_many_1.House;
import socialnetwork_one_many_1.Person;
import socialnetwork_one_many_1.Socialnetwork_one_many_1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link socialnetwork_one_many_1.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link socialnetwork_one_many_1.impl.PersonImpl#getHouse <em>House</em>}</li>
 *   <li>{@link socialnetwork_one_many_1.impl.PersonImpl#getCar <em>Car</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHouse() <em>House</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse()
	 * @generated
	 * @ordered
	 */
	protected House house;

	/**
	 * The cached value of the '{@link #getCar() <em>Car</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar()
	 * @generated
	 * @ordered
	 */
	protected Car car;

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
		return Socialnetwork_one_many_1Package.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_one_many_1Package.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House getHouse() {
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHouse(House newHouse, NotificationChain msgs) {
		House oldHouse = house;
		house = newHouse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Socialnetwork_one_many_1Package.PERSON__HOUSE, oldHouse, newHouse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouse(House newHouse) {
		if (newHouse != house) {
			NotificationChain msgs = null;
			if (house != null)
				msgs = ((InternalEObject)house).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Socialnetwork_one_many_1Package.PERSON__HOUSE, null, msgs);
			if (newHouse != null)
				msgs = ((InternalEObject)newHouse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Socialnetwork_one_many_1Package.PERSON__HOUSE, null, msgs);
			msgs = basicSetHouse(newHouse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_one_many_1Package.PERSON__HOUSE, newHouse, newHouse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Car getCar() {
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCar(Car newCar, NotificationChain msgs) {
		Car oldCar = car;
		car = newCar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Socialnetwork_one_many_1Package.PERSON__CAR, oldCar, newCar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCar(Car newCar) {
		if (newCar != car) {
			NotificationChain msgs = null;
			if (car != null)
				msgs = ((InternalEObject)car).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Socialnetwork_one_many_1Package.PERSON__CAR, null, msgs);
			if (newCar != null)
				msgs = ((InternalEObject)newCar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Socialnetwork_one_many_1Package.PERSON__CAR, null, msgs);
			msgs = basicSetCar(newCar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_one_many_1Package.PERSON__CAR, newCar, newCar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Socialnetwork_one_many_1Package.PERSON__HOUSE:
				return basicSetHouse(null, msgs);
			case Socialnetwork_one_many_1Package.PERSON__CAR:
				return basicSetCar(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Socialnetwork_one_many_1Package.PERSON__NAME:
				return getName();
			case Socialnetwork_one_many_1Package.PERSON__HOUSE:
				return getHouse();
			case Socialnetwork_one_many_1Package.PERSON__CAR:
				return getCar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Socialnetwork_one_many_1Package.PERSON__NAME:
				setName((String)newValue);
				return;
			case Socialnetwork_one_many_1Package.PERSON__HOUSE:
				setHouse((House)newValue);
				return;
			case Socialnetwork_one_many_1Package.PERSON__CAR:
				setCar((Car)newValue);
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
			case Socialnetwork_one_many_1Package.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Socialnetwork_one_many_1Package.PERSON__HOUSE:
				setHouse((House)null);
				return;
			case Socialnetwork_one_many_1Package.PERSON__CAR:
				setCar((Car)null);
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
			case Socialnetwork_one_many_1Package.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Socialnetwork_one_many_1Package.PERSON__HOUSE:
				return house != null;
			case Socialnetwork_one_many_1Package.PERSON__CAR:
				return car != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
