/**
 */
package socialnetwork_one_many_1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialnetwork_one_many_1.Person#getName <em>Name</em>}</li>
 *   <li>{@link socialnetwork_one_many_1.Person#getHouse <em>House</em>}</li>
 *   <li>{@link socialnetwork_one_many_1.Person#getCar <em>Car</em>}</li>
 * </ul>
 *
 * @see socialnetwork_one_many_1.Socialnetwork_one_many_1Package#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see socialnetwork_one_many_1.Socialnetwork_one_many_1Package#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link socialnetwork_one_many_1.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>House</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' containment reference.
	 * @see #setHouse(House)
	 * @see socialnetwork_one_many_1.Socialnetwork_one_many_1Package#getPerson_House()
	 * @model containment="true" required="true"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link socialnetwork_one_many_1.Person#getHouse <em>House</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' containment reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

	/**
	 * Returns the value of the '<em><b>Car</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car</em>' containment reference.
	 * @see #setCar(Car)
	 * @see socialnetwork_one_many_1.Socialnetwork_one_many_1Package#getPerson_Car()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Car getCar();

	/**
	 * Sets the value of the '{@link socialnetwork_one_many_1.Person#getCar <em>Car</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car</em>' containment reference.
	 * @see #getCar()
	 * @generated
	 */
	void setCar(Car value);

} // Person
