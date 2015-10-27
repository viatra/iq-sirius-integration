/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare;

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
 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareFactory
 * @model kind="package"
 * @generated
 */
public interface TelecarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "telecare";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.bme.mit.inf.concerto/telecare/example/tdk/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "telecare";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TelecarePackage eINSTANCE = hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecareSystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecareSystemImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getTelecareSystem()
	 * @generated
	 */
	int TELECARE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECARE_SYSTEM__SENSORS = 0;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECARE_SYSTEM__HOSTS = 1;

	/**
	 * The feature id for the '<em><b>Gateways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECARE_SYSTEM__GATEWAYS = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECARE_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECARE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.NamedElementImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.SensorImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Measurement Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MEASUREMENT_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONNECTED_TO = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.HostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.HostImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getHost()
	 * @generated
	 */
	int HOST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TriggerImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Triggered Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TRIGGERED_EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementTypeImpl <em>Measurement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementTypeImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getMeasurementType()
	 * @generated
	 */
	int MEASUREMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Min Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__MIN_INTERVAL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__MEASUREMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__SENSOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Measurement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Measurement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.FixedIntervalTriggerImpl <em>Fixed Interval Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.FixedIntervalTriggerImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getFixedIntervalTrigger()
	 * @generated
	 */
	int FIXED_INTERVAL_TRIGGER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_INTERVAL_TRIGGER__NAME = TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Triggered Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_INTERVAL_TRIGGER__TRIGGERED_EVENTS = TRIGGER__TRIGGERED_EVENTS;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_INTERVAL_TRIGGER__INTERVAL = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Interval Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_INTERVAL_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fixed Interval Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_INTERVAL_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.EventCompletedTriggerImpl <em>Event Completed Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.EventCompletedTriggerImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getEventCompletedTrigger()
	 * @generated
	 */
	int EVENT_COMPLETED_TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COMPLETED_TRIGGER__NAME = TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Triggered Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COMPLETED_TRIGGER__TRIGGERED_EVENTS = TRIGGER__TRIGGERED_EVENTS;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COMPLETED_TRIGGER__TRIGGERED_BY = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Completed Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COMPLETED_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Completed Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COMPLETED_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.EventImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TRIGGER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__TRIGGER = EVENT__TRIGGER;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASUREMENT_TYPE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.ReportingEventImpl <em>Reporting Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.ReportingEventImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getReportingEvent()
	 * @generated
	 */
	int REPORTING_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_EVENT__TRIGGER = EVENT__TRIGGER;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_EVENT__ADDRESS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reporting Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reporting Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.GatewayImpl
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__TRIGGERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__SENSORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem
	 * @generated
	 */
	EClass getTelecareSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem#getSensors()
	 * @see #getTelecareSystem()
	 * @generated
	 */
	EReference getTelecareSystem_Sensors();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosts</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem#getHosts()
	 * @see #getTelecareSystem()
	 * @generated
	 */
	EReference getTelecareSystem_Hosts();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem#getGateways <em>Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gateways</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem#getGateways()
	 * @see #getTelecareSystem()
	 * @generated
	 */
	EReference getTelecareSystem_Gateways();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getMeasurementTypes <em>Measurement Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement Types</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getMeasurementTypes()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_MeasurementTypes();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected To</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Sensor#getConnectedTo()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_ConnectedTo();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host
	 * @generated
	 */
	EClass getHost();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Trigger#getTriggeredEvents <em>Triggered Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggered Events</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Trigger#getTriggeredEvents()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_TriggeredEvents();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Type</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType
	 * @generated
	 */
	EClass getMeasurementType();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getMinInterval <em>Min Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Interval</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getMinInterval()
	 * @see #getMeasurementType()
	 * @generated
	 */
	EAttribute getMeasurementType_MinInterval();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getMeasurement()
	 * @see #getMeasurementType()
	 * @generated
	 */
	EReference getMeasurementType_Measurement();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sensor</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.MeasurementType#getSensor()
	 * @see #getMeasurementType()
	 * @generated
	 */
	EReference getMeasurementType_Sensor();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger <em>Fixed Interval Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Interval Trigger</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger
	 * @generated
	 */
	EClass getFixedIntervalTrigger();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.FixedIntervalTrigger#getInterval()
	 * @see #getFixedIntervalTrigger()
	 * @generated
	 */
	EAttribute getFixedIntervalTrigger_Interval();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.EventCompletedTrigger <em>Event Completed Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Completed Trigger</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.EventCompletedTrigger
	 * @generated
	 */
	EClass getEventCompletedTrigger();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.EventCompletedTrigger#getTriggeredBy <em>Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggered By</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.EventCompletedTrigger#getTriggeredBy()
	 * @see #getEventCompletedTrigger()
	 * @generated
	 */
	EReference getEventCompletedTrigger_TriggeredBy();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Event#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trigger</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Event#getTrigger()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Trigger();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement#getMeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Type</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Measurement#getMeasurementType()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_MeasurementType();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.ReportingEvent <em>Reporting Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reporting Event</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.ReportingEvent
	 * @generated
	 */
	EClass getReportingEvent();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.ReportingEvent#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.ReportingEvent#getAddress()
	 * @see #getReportingEvent()
	 * @generated
	 */
	EReference getReportingEvent_Address();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway#getTriggers()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Triggers();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensors</em>'.
	 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Gateway#getSensors()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Sensors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TelecareFactory getTelecareFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecareSystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecareSystemImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getTelecareSystem()
		 * @generated
		 */
		EClass TELECARE_SYSTEM = eINSTANCE.getTelecareSystem();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELECARE_SYSTEM__SENSORS = eINSTANCE.getTelecareSystem_Sensors();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELECARE_SYSTEM__HOSTS = eINSTANCE.getTelecareSystem_Hosts();

		/**
		 * The meta object literal for the '<em><b>Gateways</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELECARE_SYSTEM__GATEWAYS = eINSTANCE.getTelecareSystem_Gateways();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.SensorImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Measurement Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__MEASUREMENT_TYPES = eINSTANCE.getSensor_MeasurementTypes();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__CONNECTED_TO = eINSTANCE.getSensor_ConnectedTo();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.HostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.HostImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getHost()
		 * @generated
		 */
		EClass HOST = eINSTANCE.getHost();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TriggerImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Triggered Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TRIGGERED_EVENTS = eINSTANCE.getTrigger_TriggeredEvents();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.NamedElementImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementTypeImpl <em>Measurement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementTypeImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getMeasurementType()
		 * @generated
		 */
		EClass MEASUREMENT_TYPE = eINSTANCE.getMeasurementType();

		/**
		 * The meta object literal for the '<em><b>Min Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_TYPE__MIN_INTERVAL = eINSTANCE.getMeasurementType_MinInterval();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_TYPE__MEASUREMENT = eINSTANCE.getMeasurementType_Measurement();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_TYPE__SENSOR = eINSTANCE.getMeasurementType_Sensor();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.FixedIntervalTriggerImpl <em>Fixed Interval Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.FixedIntervalTriggerImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getFixedIntervalTrigger()
		 * @generated
		 */
		EClass FIXED_INTERVAL_TRIGGER = eINSTANCE.getFixedIntervalTrigger();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_INTERVAL_TRIGGER__INTERVAL = eINSTANCE.getFixedIntervalTrigger_Interval();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.EventCompletedTriggerImpl <em>Event Completed Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.EventCompletedTriggerImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getEventCompletedTrigger()
		 * @generated
		 */
		EClass EVENT_COMPLETED_TRIGGER = eINSTANCE.getEventCompletedTrigger();

		/**
		 * The meta object literal for the '<em><b>Triggered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_COMPLETED_TRIGGER__TRIGGERED_BY = eINSTANCE.getEventCompletedTrigger_TriggeredBy();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.EventImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TRIGGER = eINSTANCE.getEvent_Trigger();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.MeasurementImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Measurement Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASUREMENT_TYPE = eINSTANCE.getMeasurement_MeasurementType();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.ReportingEventImpl <em>Reporting Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.ReportingEventImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getReportingEvent()
		 * @generated
		 */
		EClass REPORTING_EVENT = eINSTANCE.getReportingEvent();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORTING_EVENT__ADDRESS = eINSTANCE.getReportingEvent_Address();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.GatewayImpl
		 * @see hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl.TelecarePackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__TRIGGERS = eINSTANCE.getGateway_Triggers();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__SENSORS = eINSTANCE.getGateway_Sensors();

	}

} //TelecarePackage
