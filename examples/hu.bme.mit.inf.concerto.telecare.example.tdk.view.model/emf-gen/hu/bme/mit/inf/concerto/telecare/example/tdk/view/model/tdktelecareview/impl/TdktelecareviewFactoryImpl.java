/**
 */
package hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.impl;

import hu.bme.mit.inf.concerto.telecare.example.tdk.view.model.tdktelecareview.*;

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
public class TdktelecareviewFactoryImpl extends EFactoryImpl implements TdktelecareviewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TdktelecareviewFactory init() {
		try {
			TdktelecareviewFactory theTdktelecareviewFactory = (TdktelecareviewFactory)EPackage.Registry.INSTANCE.getEFactory(TdktelecareviewPackage.eNS_URI);
			if (theTdktelecareviewFactory != null) {
				return theTdktelecareviewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TdktelecareviewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TdktelecareviewFactoryImpl() {
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
			case TdktelecareviewPackage.VIEW_MODEL: return createViewModel();
			case TdktelecareviewPackage.TIGGER: return createTigger();
			case TdktelecareviewPackage.SERVER: return createServer();
			case TdktelecareviewPackage.SENSOR: return createSensor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModel createViewModel() {
		ViewModelImpl viewModel = new ViewModelImpl();
		return viewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tigger createTigger() {
		TiggerImpl tigger = new TiggerImpl();
		return tigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
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
	public TdktelecareviewPackage getTdktelecareviewPackage() {
		return (TdktelecareviewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TdktelecareviewPackage getPackage() {
		return TdktelecareviewPackage.eINSTANCE;
	}

} //TdktelecareviewFactoryImpl
