/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl;

import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementImpl#getMeasurementType <em>Measurement Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementImpl extends EventImpl implements Measurement {
	/**
	 * The cached value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementType()
	 * @generated
	 * @ordered
	 */
	protected MeasurementType measurementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecarePackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementType getMeasurementType() {
		if (measurementType != null && measurementType.eIsProxy()) {
			InternalEObject oldMeasurementType = (InternalEObject)measurementType;
			measurementType = (MeasurementType)eResolveProxy(oldMeasurementType);
			if (measurementType != oldMeasurementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TelecarePackage.MEASUREMENT__MEASUREMENT_TYPE, oldMeasurementType, measurementType));
			}
		}
		return measurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementType basicGetMeasurementType() {
		return measurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementType(MeasurementType newMeasurementType, NotificationChain msgs) {
		MeasurementType oldMeasurementType = measurementType;
		measurementType = newMeasurementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecarePackage.MEASUREMENT__MEASUREMENT_TYPE, oldMeasurementType, newMeasurementType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementType(MeasurementType newMeasurementType) {
		if (newMeasurementType != measurementType) {
			NotificationChain msgs = null;
			if (measurementType != null)
				msgs = ((InternalEObject)measurementType).eInverseRemove(this, TelecarePackage.MEASUREMENT_TYPE__MEASUREMENT, MeasurementType.class, msgs);
			if (newMeasurementType != null)
				msgs = ((InternalEObject)newMeasurementType).eInverseAdd(this, TelecarePackage.MEASUREMENT_TYPE__MEASUREMENT, MeasurementType.class, msgs);
			msgs = basicSetMeasurementType(newMeasurementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecarePackage.MEASUREMENT__MEASUREMENT_TYPE, newMeasurementType, newMeasurementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecarePackage.MEASUREMENT__MEASUREMENT_TYPE:
				if (measurementType != null)
					msgs = ((InternalEObject)measurementType).eInverseRemove(this, TelecarePackage.MEASUREMENT_TYPE__MEASUREMENT, MeasurementType.class, msgs);
				return basicSetMeasurementType((MeasurementType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecarePackage.MEASUREMENT__MEASUREMENT_TYPE:
				return basicSetMeasurementType(null, msgs);
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
			case TelecarePackage.MEASUREMENT__MEASUREMENT_TYPE:
				if (resolve) return getMeasurementType();
				return basicGetMeasurementType();
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
			case TelecarePackage.MEASUREMENT__MEASUREMENT_TYPE:
				setMeasurementType((MeasurementType)newValue);
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
			case TelecarePackage.MEASUREMENT__MEASUREMENT_TYPE:
				setMeasurementType((MeasurementType)null);
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
			case TelecarePackage.MEASUREMENT__MEASUREMENT_TYPE:
				return measurementType != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasurementImpl
