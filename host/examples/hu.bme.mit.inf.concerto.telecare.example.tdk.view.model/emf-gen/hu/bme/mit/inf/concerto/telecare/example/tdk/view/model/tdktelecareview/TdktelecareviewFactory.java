/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.TdktelecareviewPackage
 * @generated
 */
public interface TdktelecareviewFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TdktelecareviewFactory eINSTANCE = hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TdktelecareviewFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Model</em>'.
	 * @generated
	 */
	ViewModel createViewModel();

	/**
	 * Returns a new object of class '<em>Tigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tigger</em>'.
	 * @generated
	 */
	Tigger createTigger();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TdktelecareviewPackage getTdktelecareviewPackage();

} //TdktelecareviewFactory
