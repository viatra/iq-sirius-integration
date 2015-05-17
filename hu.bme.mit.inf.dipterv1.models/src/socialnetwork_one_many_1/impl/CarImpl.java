/**
 */
package socialnetwork_one_many_1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import socialnetwork_one_many_1.Car;
import socialnetwork_one_many_1.Socialnetwork_one_many_1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link socialnetwork_one_many_1.impl.CarImpl#getLicensePlateNumber <em>License Plate Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarImpl extends MinimalEObjectImpl.Container implements Car {
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
	protected CarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Socialnetwork_one_many_1Package.Literals.CAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_one_many_1Package.CAR__LICENSE_PLATE_NUMBER, oldLicensePlateNumber, licensePlateNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Socialnetwork_one_many_1Package.CAR__LICENSE_PLATE_NUMBER:
				return getLicensePlateNumber();
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
			case Socialnetwork_one_many_1Package.CAR__LICENSE_PLATE_NUMBER:
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
			case Socialnetwork_one_many_1Package.CAR__LICENSE_PLATE_NUMBER:
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
			case Socialnetwork_one_many_1Package.CAR__LICENSE_PLATE_NUMBER:
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
		result.append(" (licensePlateNumber: ");
		result.append(licensePlateNumber);
		result.append(')');
		return result.toString();
	}

} //CarImpl
