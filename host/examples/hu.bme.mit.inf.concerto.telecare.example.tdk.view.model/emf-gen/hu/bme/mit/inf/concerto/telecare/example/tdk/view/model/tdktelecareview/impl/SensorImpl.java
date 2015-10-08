/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl;

import hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor;
import hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Server;
import hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.TdktelecareviewPackage;
import hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Tigger;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.SensorImpl#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.SensorImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.SensorImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends MinimalEObjectImpl.Container implements Sensor {
	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> connectedTo;

	/**
	 * The cached value of the '{@link #getTriggeredBy() <em>Triggered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Tigger> triggeredBy;

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
		return TdktelecareviewPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Server> getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectResolvingEList<Server>(Server.class, this, TdktelecareviewPackage.SENSOR__CONNECTED_TO);
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tigger> getTriggeredBy() {
		if (triggeredBy == null) {
			triggeredBy = new EObjectResolvingEList<Tigger>(Tigger.class, this, TdktelecareviewPackage.SENSOR__TRIGGERED_BY);
		}
		return triggeredBy;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdktelecareviewPackage.SENSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TdktelecareviewPackage.SENSOR__CONNECTED_TO:
				return getConnectedTo();
			case TdktelecareviewPackage.SENSOR__TRIGGERED_BY:
				return getTriggeredBy();
			case TdktelecareviewPackage.SENSOR__NAME:
				return getName();
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
			case TdktelecareviewPackage.SENSOR__CONNECTED_TO:
				getConnectedTo().clear();
				getConnectedTo().addAll((Collection<? extends Server>)newValue);
				return;
			case TdktelecareviewPackage.SENSOR__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends Tigger>)newValue);
				return;
			case TdktelecareviewPackage.SENSOR__NAME:
				setName((String)newValue);
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
			case TdktelecareviewPackage.SENSOR__CONNECTED_TO:
				getConnectedTo().clear();
				return;
			case TdktelecareviewPackage.SENSOR__TRIGGERED_BY:
				getTriggeredBy().clear();
				return;
			case TdktelecareviewPackage.SENSOR__NAME:
				setName(NAME_EDEFAULT);
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
			case TdktelecareviewPackage.SENSOR__CONNECTED_TO:
				return connectedTo != null && !connectedTo.isEmpty();
			case TdktelecareviewPackage.SENSOR__TRIGGERED_BY:
				return triggeredBy != null && !triggeredBy.isEmpty();
			case TdktelecareviewPackage.SENSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //SensorImpl
