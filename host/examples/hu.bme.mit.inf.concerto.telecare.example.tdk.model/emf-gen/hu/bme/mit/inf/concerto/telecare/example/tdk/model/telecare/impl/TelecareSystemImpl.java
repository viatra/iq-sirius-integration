/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl;

import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecareSystemImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecareSystemImpl#getHosts <em>Hosts</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecareSystemImpl#getGateways <em>Gateways</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TelecareSystemImpl extends MinimalEObjectImpl.Container implements TelecareSystem {
	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * The cached value of the '{@link #getHosts() <em>Hosts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Host> hosts;

	/**
	 * The cached value of the '{@link #getGateways() <em>Gateways</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateways()
	 * @generated
	 * @ordered
	 */
	protected EList<Gateway> gateways;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelecareSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecarePackage.Literals.TELECARE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, TelecarePackage.TELECARE_SYSTEM__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Host> getHosts() {
		if (hosts == null) {
			hosts = new EObjectContainmentEList<Host>(Host.class, this, TelecarePackage.TELECARE_SYSTEM__HOSTS);
		}
		return hosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gateway> getGateways() {
		if (gateways == null) {
			gateways = new EObjectContainmentEList<Gateway>(Gateway.class, this, TelecarePackage.TELECARE_SYSTEM__GATEWAYS);
		}
		return gateways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecarePackage.TELECARE_SYSTEM__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
			case TelecarePackage.TELECARE_SYSTEM__HOSTS:
				return ((InternalEList<?>)getHosts()).basicRemove(otherEnd, msgs);
			case TelecarePackage.TELECARE_SYSTEM__GATEWAYS:
				return ((InternalEList<?>)getGateways()).basicRemove(otherEnd, msgs);
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
			case TelecarePackage.TELECARE_SYSTEM__SENSORS:
				return getSensors();
			case TelecarePackage.TELECARE_SYSTEM__HOSTS:
				return getHosts();
			case TelecarePackage.TELECARE_SYSTEM__GATEWAYS:
				return getGateways();
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
			case TelecarePackage.TELECARE_SYSTEM__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case TelecarePackage.TELECARE_SYSTEM__HOSTS:
				getHosts().clear();
				getHosts().addAll((Collection<? extends Host>)newValue);
				return;
			case TelecarePackage.TELECARE_SYSTEM__GATEWAYS:
				getGateways().clear();
				getGateways().addAll((Collection<? extends Gateway>)newValue);
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
			case TelecarePackage.TELECARE_SYSTEM__SENSORS:
				getSensors().clear();
				return;
			case TelecarePackage.TELECARE_SYSTEM__HOSTS:
				getHosts().clear();
				return;
			case TelecarePackage.TELECARE_SYSTEM__GATEWAYS:
				getGateways().clear();
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
			case TelecarePackage.TELECARE_SYSTEM__SENSORS:
				return sensors != null && !sensors.isEmpty();
			case TelecarePackage.TELECARE_SYSTEM__HOSTS:
				return hosts != null && !hosts.isEmpty();
			case TelecarePackage.TELECARE_SYSTEM__GATEWAYS:
				return gateways != null && !gateways.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TelecareSystemImpl
