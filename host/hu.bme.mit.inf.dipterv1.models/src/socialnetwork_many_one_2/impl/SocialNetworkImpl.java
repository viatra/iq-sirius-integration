/**
 */
package socialnetwork_many_one_2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import socialnetwork_many_one_2.Family;
import socialnetwork_many_one_2.Friend;
import socialnetwork_many_one_2.SocialNetwork;
import socialnetwork_many_one_2.Socialnetwork_many_one_2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link socialnetwork_many_one_2.impl.SocialNetworkImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link socialnetwork_many_one_2.impl.SocialNetworkImpl#getFriends <em>Friends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SocialNetworkImpl extends MinimalEObjectImpl.Container implements SocialNetwork {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Family> members;

	/**
	 * The cached value of the '{@link #getFriends() <em>Friends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriends()
	 * @generated
	 * @ordered
	 */
	protected EList<Friend> friends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Socialnetwork_many_one_2Package.Literals.SOCIAL_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Family> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Family>(Family.class, this, Socialnetwork_many_one_2Package.SOCIAL_NETWORK__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Friend> getFriends() {
		if (friends == null) {
			friends = new EObjectContainmentEList<Friend>(Friend.class, this, Socialnetwork_many_one_2Package.SOCIAL_NETWORK__FRIENDS);
		}
		return friends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK__FRIENDS:
				return ((InternalEList<?>)getFriends()).basicRemove(otherEnd, msgs);
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
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK__MEMBERS:
				return getMembers();
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK__FRIENDS:
				return getFriends();
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
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Family>)newValue);
				return;
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK__FRIENDS:
				getFriends().clear();
				getFriends().addAll((Collection<? extends Friend>)newValue);
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
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK__MEMBERS:
				getMembers().clear();
				return;
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK__FRIENDS:
				getFriends().clear();
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
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK__MEMBERS:
				return members != null && !members.isEmpty();
			case Socialnetwork_many_one_2Package.SOCIAL_NETWORK__FRIENDS:
				return friends != null && !friends.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SocialNetworkImpl
