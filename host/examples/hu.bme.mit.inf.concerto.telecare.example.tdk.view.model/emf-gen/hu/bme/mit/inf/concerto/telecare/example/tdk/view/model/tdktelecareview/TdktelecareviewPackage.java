/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.TdktelecareviewFactory
 * @model kind="package"
 * @generated
 */
public interface TdktelecareviewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tdktelecareview";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.bme.mit.inf.concerto/telecare/example/tdk/view/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tdktelecareview";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TdktelecareviewPackage eINSTANCE = hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TdktelecareviewPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ViewModelImpl <em>View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ViewModelImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TdktelecareviewPackageImpl#getViewModel()
	 * @generated
	 */
	int VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__SERVERS = 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__TRIGGERS = 1;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__SENSORS = 2;

	/**
	 * The number of structural features of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TiggerImpl <em>Tigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TiggerImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TdktelecareviewPackageImpl#getTigger()
	 * @generated
	 */
	int TIGGER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIGGER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ServerImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TdktelecareviewPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.SensorImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TdktelecareviewPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONNECTED_TO = 0;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TRIGGERED_BY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.ViewModel
	 * @generated
	 */
	EClass getViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.ViewModel#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.ViewModel#getServers()
	 * @see #getViewModel()
	 * @generated
	 */
	EReference getViewModel_Servers();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.ViewModel#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.ViewModel#getTriggers()
	 * @see #getViewModel()
	 * @generated
	 */
	EReference getViewModel_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.ViewModel#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.ViewModel#getSensors()
	 * @see #getViewModel()
	 * @generated
	 */
	EReference getViewModel_Sensors();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Tigger <em>Tigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tigger</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Tigger
	 * @generated
	 */
	EClass getTigger();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Tigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Tigger#getName()
	 * @see #getTigger()
	 * @generated
	 */
	EAttribute getTigger_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Server#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Server#getName()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor#getConnectedTo()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_ConnectedTo();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor#getTriggeredBy <em>Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggered By</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor#getTriggeredBy()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_TriggeredBy();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TdktelecareviewFactory getTdktelecareviewFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ViewModelImpl <em>View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ViewModelImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TdktelecareviewPackageImpl#getViewModel()
		 * @generated
		 */
		EClass VIEW_MODEL = eINSTANCE.getViewModel();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL__SERVERS = eINSTANCE.getViewModel_Servers();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL__TRIGGERS = eINSTANCE.getViewModel_Triggers();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL__SENSORS = eINSTANCE.getViewModel_Sensors();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TiggerImpl <em>Tigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TiggerImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TdktelecareviewPackageImpl#getTigger()
		 * @generated
		 */
		EClass TIGGER = eINSTANCE.getTigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIGGER__NAME = eINSTANCE.getTigger_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.ServerImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TdktelecareviewPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__NAME = eINSTANCE.getServer_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.SensorImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl.TdktelecareviewPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__CONNECTED_TO = eINSTANCE.getSensor_ConnectedTo();

		/**
		 * The meta object literal for the '<em><b>Triggered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__TRIGGERED_BY = eINSTANCE.getSensor_TriggeredBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

	}

} //TdktelecareviewPackage
