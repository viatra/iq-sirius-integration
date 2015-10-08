/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl;

import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Event;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.EventCompletedTrigger;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecarePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Completed Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.EventCompletedTriggerImpl#getTriggeredBy <em>Triggered By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventCompletedTriggerImpl extends TriggerImpl implements EventCompletedTrigger {
	/**
	 * The cached value of the '{@link #getTriggeredBy() <em>Triggered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> triggeredBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventCompletedTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecarePackage.Literals.EVENT_COMPLETED_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getTriggeredBy() {
		if (triggeredBy == null) {
			triggeredBy = new EObjectResolvingEList<Event>(Event.class, this, TelecarePackage.EVENT_COMPLETED_TRIGGER__TRIGGERED_BY);
		}
		return triggeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelecarePackage.EVENT_COMPLETED_TRIGGER__TRIGGERED_BY:
				return getTriggeredBy();
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
			case TelecarePackage.EVENT_COMPLETED_TRIGGER__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends Event>)newValue);
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
			case TelecarePackage.EVENT_COMPLETED_TRIGGER__TRIGGERED_BY:
				getTriggeredBy().clear();
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
			case TelecarePackage.EVENT_COMPLETED_TRIGGER__TRIGGERED_BY:
				return triggeredBy != null && !triggeredBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventCompletedTriggerImpl
