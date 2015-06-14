/**
 */
package org.eclipse.incquery.viewmodel.traceability;

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
 * @see org.eclipse.incquery.viewmodel.traceability.TraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.incquery/viewmodel/traceability/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.incquery.viewmodel.traceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPackage eINSTANCE = org.eclipse.incquery.viewmodel.traceability.impl.TraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.incquery.viewmodel.traceability.impl.TraceabilityImpl <em>Traceability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.incquery.viewmodel.traceability.impl.TraceabilityImpl
	 * @see org.eclipse.incquery.viewmodel.traceability.impl.TraceabilityPackageImpl#getTraceability()
	 * @generated
	 */
	int TRACEABILITY = 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY__TRACES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY__ID = 1;

	/**
	 * The number of structural features of the '<em>Traceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.incquery.viewmodel.traceability.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.incquery.viewmodel.traceability.impl.TraceImpl
	 * @see org.eclipse.incquery.viewmodel.traceability.impl.TraceabilityPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGETS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ID = 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__OBJECTS = 3;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.incquery.viewmodel.traceability.Traceability <em>Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability</em>'.
	 * @see org.eclipse.incquery.viewmodel.traceability.Traceability
	 * @generated
	 */
	EClass getTraceability();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.incquery.viewmodel.traceability.Traceability#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see org.eclipse.incquery.viewmodel.traceability.Traceability#getTraces()
	 * @see #getTraceability()
	 * @generated
	 */
	EReference getTraceability_Traces();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.incquery.viewmodel.traceability.Traceability#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.incquery.viewmodel.traceability.Traceability#getId()
	 * @see #getTraceability()
	 * @generated
	 */
	EAttribute getTraceability_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.incquery.viewmodel.traceability.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.eclipse.incquery.viewmodel.traceability.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.incquery.viewmodel.traceability.Trace#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.eclipse.incquery.viewmodel.traceability.Trace#getTargets()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Targets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.incquery.viewmodel.traceability.Trace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.incquery.viewmodel.traceability.Trace#getId()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.incquery.viewmodel.traceability.Trace#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Params</em>'.
	 * @see org.eclipse.incquery.viewmodel.traceability.Trace#getParams()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Params();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.incquery.viewmodel.traceability.Trace#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Objects</em>'.
	 * @see org.eclipse.incquery.viewmodel.traceability.Trace#getObjects()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Objects();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityFactory getTraceabilityFactory();

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
		 * The meta object literal for the '{@link org.eclipse.incquery.viewmodel.traceability.impl.TraceabilityImpl <em>Traceability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.incquery.viewmodel.traceability.impl.TraceabilityImpl
		 * @see org.eclipse.incquery.viewmodel.traceability.impl.TraceabilityPackageImpl#getTraceability()
		 * @generated
		 */
		EClass TRACEABILITY = eINSTANCE.getTraceability();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY__TRACES = eINSTANCE.getTraceability_Traces();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY__ID = eINSTANCE.getTraceability_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.incquery.viewmodel.traceability.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.incquery.viewmodel.traceability.impl.TraceImpl
		 * @see org.eclipse.incquery.viewmodel.traceability.impl.TraceabilityPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TARGETS = eINSTANCE.getTrace_Targets();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__ID = eINSTANCE.getTrace_Id();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PARAMS = eINSTANCE.getTrace_Params();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__OBJECTS = eINSTANCE.getTrace_Objects();

	}

} //TraceabilityPackage
