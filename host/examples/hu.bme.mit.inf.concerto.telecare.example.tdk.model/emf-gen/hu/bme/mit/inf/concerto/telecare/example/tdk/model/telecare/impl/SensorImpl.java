/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl;

import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.SensorImpl#getMeasurementTypes <em>Measurement Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.SensorImpl#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends NamedElementImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getMeasurementTypes() <em>Measurement Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementType> measurementTypes;

	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected Gateway connectedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecarePackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementType> getMeasurementTypes() {
		if (measurementTypes == null) {
			measurementTypes = new EObjectContainmentWithInverseEList<MeasurementType>(MeasurementType.class, this, TelecarePackage.SENSOR__MEASUREMENT_TYPES, TelecarePackage.MEASUREMENT_TYPE__SENSOR);
		}
		return measurementTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway getConnectedTo() {
		if (connectedTo != null && connectedTo.eIsProxy()) {
			InternalEObject oldConnectedTo = (InternalEObject)connectedTo;
			connectedTo = (Gateway)eResolveProxy(oldConnectedTo);
			if (connectedTo != oldConnectedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TelecarePackage.SENSOR__CONNECTED_TO, oldConnectedTo, connectedTo));
			}
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway basicGetConnectedTo() {
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectedTo(Gateway newConnectedTo, NotificationChain msgs) {
		Gateway oldConnectedTo = connectedTo;
		connectedTo = newConnectedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecarePackage.SENSOR__CONNECTED_TO, oldConnectedTo, newConnectedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedTo(Gateway newConnectedTo) {
		if (newConnectedTo != connectedTo) {
			NotificationChain msgs = null;
			if (connectedTo != null)
				msgs = ((InternalEObject)connectedTo).eInverseRemove(this, TelecarePackage.GATEWAY__SENSORS, Gateway.class, msgs);
			if (newConnectedTo != null)
				msgs = ((InternalEObject)newConnectedTo).eInverseAdd(this, TelecarePackage.GATEWAY__SENSORS, Gateway.class, msgs);
			msgs = basicSetConnectedTo(newConnectedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecarePackage.SENSOR__CONNECTED_TO, newConnectedTo, newConnectedTo));
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
			case TelecarePackage.SENSOR__MEASUREMENT_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurementTypes()).basicAdd(otherEnd, msgs);
			case TelecarePackage.SENSOR__CONNECTED_TO:
				if (connectedTo != null)
					msgs = ((InternalEObject)connectedTo).eInverseRemove(this, TelecarePackage.GATEWAY__SENSORS, Gateway.class, msgs);
				return basicSetConnectedTo((Gateway)otherEnd, msgs);
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
			case TelecarePackage.SENSOR__MEASUREMENT_TYPES:
				return ((InternalEList<?>)getMeasurementTypes()).basicRemove(otherEnd, msgs);
			case TelecarePackage.SENSOR__CONNECTED_TO:
				return basicSetConnectedTo(null, msgs);
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
			case TelecarePackage.SENSOR__MEASUREMENT_TYPES:
				return getMeasurementTypes();
			case TelecarePackage.SENSOR__CONNECTED_TO:
				if (resolve) return getConnectedTo();
				return basicGetConnectedTo();
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
			case TelecarePackage.SENSOR__MEASUREMENT_TYPES:
				getMeasurementTypes().clear();
				getMeasurementTypes().addAll((Collection<? extends MeasurementType>)newValue);
				return;
			case TelecarePackage.SENSOR__CONNECTED_TO:
				setConnectedTo((Gateway)newValue);
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
			case TelecarePackage.SENSOR__MEASUREMENT_TYPES:
				getMeasurementTypes().clear();
				return;
			case TelecarePackage.SENSOR__CONNECTED_TO:
				setConnectedTo((Gateway)null);
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
			case TelecarePackage.SENSOR__MEASUREMENT_TYPES:
				return measurementTypes != null && !measurementTypes.isEmpty();
			case TelecarePackage.SENSOR__CONNECTED_TO:
				return connectedTo != null;
		}
		return super.eIsSet(featureID);
	}

} //SensorImpl
