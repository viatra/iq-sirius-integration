/**
 */
package org.eclipse.incquery.viewmodel.traceability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.incquery.viewmodel.traceability.Trace;
import org.eclipse.incquery.viewmodel.traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.incquery.viewmodel.traceability.impl.TraceImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.eclipse.incquery.viewmodel.traceability.impl.TraceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.incquery.viewmodel.traceability.impl.TraceImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.incquery.viewmodel.traceability.impl.TraceImpl#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> targets;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> params;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> objects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<EObject>(EObject.class, this, TraceabilityPackage.TRACE__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getParams() {
		if (params == null) {
			params = new EObjectResolvingEList<EObject>(EObject.class, this, TraceabilityPackage.TRACE__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getObjects() {
		if (objects == null) {
			objects = new EDataTypeUniqueEList<Object>(Object.class, this, TraceabilityPackage.TRACE__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.TRACE__TARGETS:
				return getTargets();
			case TraceabilityPackage.TRACE__ID:
				return getId();
			case TraceabilityPackage.TRACE__PARAMS:
				return getParams();
			case TraceabilityPackage.TRACE__OBJECTS:
				return getObjects();
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
			case TraceabilityPackage.TRACE__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends EObject>)newValue);
				return;
			case TraceabilityPackage.TRACE__ID:
				setId((String)newValue);
				return;
			case TraceabilityPackage.TRACE__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends EObject>)newValue);
				return;
			case TraceabilityPackage.TRACE__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends Object>)newValue);
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
			case TraceabilityPackage.TRACE__TARGETS:
				getTargets().clear();
				return;
			case TraceabilityPackage.TRACE__ID:
				setId(ID_EDEFAULT);
				return;
			case TraceabilityPackage.TRACE__PARAMS:
				getParams().clear();
				return;
			case TraceabilityPackage.TRACE__OBJECTS:
				getObjects().clear();
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
			case TraceabilityPackage.TRACE__TARGETS:
				return targets != null && !targets.isEmpty();
			case TraceabilityPackage.TRACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TraceabilityPackage.TRACE__PARAMS:
				return params != null && !params.isEmpty();
			case TraceabilityPackage.TRACE__OBJECTS:
				return objects != null && !objects.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", objects: ");
		result.append(objects);
		result.append(')');
		return result.toString();
	}

} //TraceImpl
