/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.impl;

import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TelecareFactoryImpl extends EFactoryImpl implements TelecareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TelecareFactory init() {
		try {
			TelecareFactory theTelecareFactory = (TelecareFactory)EPackage.Registry.INSTANCE.getEFactory(TelecarePackage.eNS_URI);
			if (theTelecareFactory != null) {
				return theTelecareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TelecareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TelecarePackage.TELECARE_SYSTEM: return createTelecareSystem();
			case TelecarePackage.SENSOR: return createSensor();
			case TelecarePackage.HOST: return createHost();
			case TelecarePackage.MEASUREMENT_TYPE: return createMeasurementType();
			case TelecarePackage.FIXED_INTERVAL_TRIGGER: return createFixedIntervalTrigger();
			case TelecarePackage.EVENT_COMPLETED_TRIGGER: return createEventCompletedTrigger();
			case TelecarePackage.MEASUREMENT: return createMeasurement();
			case TelecarePackage.REPORTING_EVENT: return createReportingEvent();
			case TelecarePackage.GATEWAY: return createGateway();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecareSystem createTelecareSystem() {
		TelecareSystemImpl telecareSystem = new TelecareSystemImpl();
		return telecareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Host createHost() {
		HostImpl host = new HostImpl();
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementType createMeasurementType() {
		MeasurementTypeImpl measurementType = new MeasurementTypeImpl();
		return measurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedIntervalTrigger createFixedIntervalTrigger() {
		FixedIntervalTriggerImpl fixedIntervalTrigger = new FixedIntervalTriggerImpl();
		return fixedIntervalTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCompletedTrigger createEventCompletedTrigger() {
		EventCompletedTriggerImpl eventCompletedTrigger = new EventCompletedTriggerImpl();
		return eventCompletedTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement createMeasurement() {
		MeasurementImpl measurement = new MeasurementImpl();
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingEvent createReportingEvent() {
		ReportingEventImpl reportingEvent = new ReportingEventImpl();
		return reportingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecarePackage getTelecarePackage() {
		return (TelecarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TelecarePackage getPackage() {
		return TelecarePackage.eINSTANCE;
	}

} //TelecareFactoryImpl
