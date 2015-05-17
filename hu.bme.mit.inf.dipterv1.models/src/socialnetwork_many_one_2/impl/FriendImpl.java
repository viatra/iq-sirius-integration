/**
 */
package socialnetwork_many_one_2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import socialnetwork_many_one_2.Family;
import socialnetwork_many_one_2.Friend;
import socialnetwork_many_one_2.Socialnetwork_many_one_2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Friend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link socialnetwork_many_one_2.impl.FriendImpl#getSource <em>Source</em>}</li>
 *   <li>{@link socialnetwork_many_one_2.impl.FriendImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link socialnetwork_many_one_2.impl.FriendImpl#getSince <em>Since</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FriendImpl extends MinimalEObjectImpl.Container implements Friend {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Family source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Family target;

	/**
	 * The default value of the '{@link #getSince() <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSince()
	 * @generated
	 * @ordered
	 */
	protected static final int SINCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSince() <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSince()
	 * @generated
	 * @ordered
	 */
	protected int since = SINCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FriendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Socialnetwork_many_one_2Package.Literals.FRIEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Family)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Socialnetwork_many_one_2Package.FRIEND__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Family newSource) {
		Family oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_many_one_2Package.FRIEND__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Family)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Socialnetwork_many_one_2Package.FRIEND__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Family newTarget) {
		Family oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_many_one_2Package.FRIEND__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSince() {
		return since;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSince(int newSince) {
		int oldSince = since;
		since = newSince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Socialnetwork_many_one_2Package.FRIEND__SINCE, oldSince, since));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Socialnetwork_many_one_2Package.FRIEND__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Socialnetwork_many_one_2Package.FRIEND__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Socialnetwork_many_one_2Package.FRIEND__SINCE:
				return getSince();
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
			case Socialnetwork_many_one_2Package.FRIEND__SOURCE:
				setSource((Family)newValue);
				return;
			case Socialnetwork_many_one_2Package.FRIEND__TARGET:
				setTarget((Family)newValue);
				return;
			case Socialnetwork_many_one_2Package.FRIEND__SINCE:
				setSince((Integer)newValue);
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
			case Socialnetwork_many_one_2Package.FRIEND__SOURCE:
				setSource((Family)null);
				return;
			case Socialnetwork_many_one_2Package.FRIEND__TARGET:
				setTarget((Family)null);
				return;
			case Socialnetwork_many_one_2Package.FRIEND__SINCE:
				setSince(SINCE_EDEFAULT);
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
			case Socialnetwork_many_one_2Package.FRIEND__SOURCE:
				return source != null;
			case Socialnetwork_many_one_2Package.FRIEND__TARGET:
				return target != null;
			case Socialnetwork_many_one_2Package.FRIEND__SINCE:
				return since != SINCE_EDEFAULT;
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
		result.append(" (since: ");
		result.append(since);
		result.append(')');
		return result.toString();
	}

} //FriendImpl
