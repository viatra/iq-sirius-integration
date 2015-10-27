/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl;

import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementTypeImpl#getMinInterval <em>Min Interval</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementTypeImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementTypeImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementTypeImpl extends NamedElementImpl implements MeasurementType {
	/**
	 * The default value of the '{@link #getMinInterval() <em>Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterval()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_INTERVAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMinInterval() <em>Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterval()
	 * @generated
	 * @ordered
	 */
	protected long minInterval = MIN_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecarePackage.Literals.MEASUREMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMinInterval() {
		return minInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInterval(long newMinInterval) {
		long oldMinInterval = minInterval;
		minInterval = newMinInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecarePackage.MEASUREMENT_TYPE__MIN_INTERVAL, oldMinInterval, minInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurement() {
		if (measurement == null) {
			measurement = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, TelecarePackage.MEASUREMENT_TYPE__MEASUREMENT, TelecarePackage.MEASUREMENT__MEASUREMENT_TYPE);
		}
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getSensor() {
		if (eContainerFeatureID() != TelecarePackage.MEASUREMENT_TYPE__SENSOR) return null;
		return (Sensor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensor(Sensor newSensor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSensor, TelecarePackage.MEASUREMENT_TYPE__SENSOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(Sensor newSensor) {
		if (newSensor != eInternalContainer() || (eContainerFeatureID() != TelecarePackage.MEASUREMENT_TYPE__SENSOR && newSensor != null)) {
			if (EcoreUtil.isAncestor(this, newSensor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSensor != null)
				msgs = ((InternalEObject)newSensor).eInverseAdd(this, TelecarePackage.SENSOR__MEASUREMENT_TYPES, Sensor.class, msgs);
			msgs = basicSetSensor(newSensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecarePackage.MEASUREMENT_TYPE__SENSOR, newSensor, newSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecarePackage.MEASUREMENT_TYPE__MEASUREMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurement()).basicAdd(otherEnd, msgs);
			case TelecarePackage.MEASUREMENT_TYPE__SENSOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSensor((Sensor)otherEnd, msgs);
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
			case TelecarePackage.MEASUREMENT_TYPE__MEASUREMENT:
				return ((InternalEList<?>)getMeasurement()).basicRemove(otherEnd, msgs);
			case TelecarePackage.MEASUREMENT_TYPE__SENSOR:
				return basicSetSensor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TelecarePackage.MEASUREMENT_TYPE__SENSOR:
				return eInternalContainer().eInverseRemove(this, TelecarePackage.SENSOR__MEASUREMENT_TYPES, Sensor.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelecarePackage.MEASUREMENT_TYPE__MIN_INTERVAL:
				return getMinInterval();
			case TelecarePackage.MEASUREMENT_TYPE__MEASUREMENT:
				return getMeasurement();
			case TelecarePackage.MEASUREMENT_TYPE__SENSOR:
				return getSensor();
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
			case TelecarePackage.MEASUREMENT_TYPE__MIN_INTERVAL:
				setMinInterval((Long)newValue);
				return;
			case TelecarePackage.MEASUREMENT_TYPE__MEASUREMENT:
				getMeasurement().clear();
				getMeasurement().addAll((Collection<? extends Measurement>)newValue);
				return;
			case TelecarePackage.MEASUREMENT_TYPE__SENSOR:
				setSensor((Sensor)newValue);
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
			case TelecarePackage.MEASUREMENT_TYPE__MIN_INTERVAL:
				setMinInterval(MIN_INTERVAL_EDEFAULT);
				return;
			case TelecarePackage.MEASUREMENT_TYPE__MEASUREMENT:
				getMeasurement().clear();
				return;
			case TelecarePackage.MEASUREMENT_TYPE__SENSOR:
				setSensor((Sensor)null);
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
			case TelecarePackage.MEASUREMENT_TYPE__MIN_INTERVAL:
				return minInterval != MIN_INTERVAL_EDEFAULT;
			case TelecarePackage.MEASUREMENT_TYPE__MEASUREMENT:
				return measurement != null && !measurement.isEmpty();
			case TelecarePackage.MEASUREMENT_TYPE__SENSOR:
				return getSensor() != null;
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
		result.append(" (minInterval: ");
		result.append(minInterval);
		result.append(')');
		return result.toString();
	}

} //MeasurementTypeImpl
