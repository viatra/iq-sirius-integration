/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl;

import hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor;
import hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Server;
import hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.TdktelecareviewPackage;
import hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Tigger;
import hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.ViewModel;

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
 * An implementation of the model object '<em><b>View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ViewModelImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ViewModelImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ViewModelImpl#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewModelImpl extends MinimalEObjectImpl.Container implements ViewModel {
	/**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> servers;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Tigger> triggers;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdktelecareviewPackage.Literals.VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Server> getServers() {
		if (servers == null) {
			servers = new EObjectContainmentEList<Server>(Server.class, this, TdktelecareviewPackage.VIEW_MODEL__SERVERS);
		}
		return servers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Tigger>(Tigger.class, this, TdktelecareviewPackage.VIEW_MODEL__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, TdktelecareviewPackage.VIEW_MODEL__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TdktelecareviewPackage.VIEW_MODEL__SERVERS:
				return ((InternalEList<?>)getServers()).basicRemove(otherEnd, msgs);
			case TdktelecareviewPackage.VIEW_MODEL__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
			case TdktelecareviewPackage.VIEW_MODEL__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
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
			case TdktelecareviewPackage.VIEW_MODEL__SERVERS:
				return getServers();
			case TdktelecareviewPackage.VIEW_MODEL__TRIGGERS:
				return getTriggers();
			case TdktelecareviewPackage.VIEW_MODEL__SENSORS:
				return getSensors();
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
			case TdktelecareviewPackage.VIEW_MODEL__SERVERS:
				getServers().clear();
				getServers().addAll((Collection<? extends Server>)newValue);
				return;
			case TdktelecareviewPackage.VIEW_MODEL__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends Tigger>)newValue);
				return;
			case TdktelecareviewPackage.VIEW_MODEL__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
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
			case TdktelecareviewPackage.VIEW_MODEL__SERVERS:
				getServers().clear();
				return;
			case TdktelecareviewPackage.VIEW_MODEL__TRIGGERS:
				getTriggers().clear();
				return;
			case TdktelecareviewPackage.VIEW_MODEL__SENSORS:
				getSensors().clear();
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
			case TdktelecareviewPackage.VIEW_MODEL__SERVERS:
				return servers != null && !servers.isEmpty();
			case TdktelecareviewPackage.VIEW_MODEL__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
			case TdktelecareviewPackage.VIEW_MODEL__SENSORS:
				return sensors != null && !sensors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewModelImpl
