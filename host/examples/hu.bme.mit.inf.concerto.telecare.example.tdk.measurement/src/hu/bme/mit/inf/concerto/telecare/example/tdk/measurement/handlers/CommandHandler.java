package hu.bme.mit.inf.concerto.telecare.example.tdk.measurement.handlers;


import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.viewmodel.configuration.Configuration;
import org.eclipse.incquery.viewmodel.configuration.Scheduler;
import org.eclipse.incquery.viewmodel.core.TransformationInitializer;
import org.eclipse.incquery.viewmodel.core.ViewModelManager;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.InconsistentEventSemanticsException;

import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.EventCompletedTrigger;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.Host;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.ReportingEvent;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareFactory;
import hu.bme.mit.inf.concerto.telecare.example.tdk.model.telecare.TelecareSystem;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class CommandHandler extends AbstractHandler {
	public static final String COMMAND_CREATE_MODELS = "hu.bme.mit.inf.concerto.telecare.example.tdk.measurement.commands.createModelsCommand";
	
	public static final String COMMAND_MEASURE = "hu.bme.mit.inf.concerto.telecare.example.tdk.measurement.commands.measureCommand";
	
	/**
	 * The constructor.
	 */
	public CommandHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String commandId = event.getCommand().getId();
		
		if (COMMAND_CREATE_MODELS.equals(commandId)) {
			System.out.println("CREATE MODELS");
			
			URI targetURI = null;
			ResourceSet resourceSet = new ResourceSetImpl();
			URI sourceURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/sample.telecare", true);


			// 1x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_1.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 1);
			
			// 10x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_10.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 10);

			// 25x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_25.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 25);
			
			// 50x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_50.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 50);
			
			// 75x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_75.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 75);

			// 100x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_100.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 100);
			
			// 150x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_150.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 150);

			// 200x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_200.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 200);
			
			// 300x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_300.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 300);

			// 400x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_400.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 400);
			
			// 500x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_500.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 500);

			// 750x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_750.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 750);

			// 1000x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_1000.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 1000);

			// 1500x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_1500.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 1500);

			// 2000x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_2000.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 2000);

			// 3000x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_3000.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 3000);
			
			// 4000x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_4000.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 4000);

			// 5000x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_5000.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 5000);
			
			// 7500x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_7500.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 7500);
			
			// 10000x
			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_10000.telecare", true);
			copyModel(resourceSet, sourceURI, targetURI, 10000);
			
			System.out.println("EOF CREATE MODELS");
		} else if (COMMAND_MEASURE.equals(commandId)) {			
			System.out.println("MEASURE");
			
			ResourceSet rset = new ResourceSetImpl();
			Resource configResource = rset.getResource(URI.createPlatformResourceURI("/hu.bme.mit.concerto.telecare.example.tdk.view.design/model/telecareview_transformation.configuration", true), true);
			
			Configuration configurationModel = (Configuration) configResource.getContents().get(0);
			
			try {
//				measure(configurationModel, 0);
				measure(configurationModel, 25);
				measure(configurationModel, 25);
				measure(configurationModel, 25);
				measure(configurationModel, 25);
				measure(configurationModel, 25);
				
				System.out.println("--------------");
				
//				measure(configurationModel, 1);
//				measure(configurationModel, 10);
//				measure(configurationModel, 25);
//				measure(configurationModel, 50);
//				measure(configurationModel, 75);
//				measure(configurationModel, 100);
//				measure(configurationModel, 150);
//				measure(configurationModel, 200);
				
//				measure(configurationModel, 300);
//				measure(configurationModel, 400);
//				measure(configurationModel, 500);
//				measure(configurationModel, 750);
				
//				measure(configurationModel, 1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("EOF MEASURE");
		}
		
		return null;
	}
	
	private void copyModel(ResourceSet rset, URI sourceURI, URI targetURI, int times) {
		Resource source = rset.getResource(sourceURI, true);
		Resource target = rset.createResource(targetURI);
		
		TelecareSystem copy = null;
		TelecareSystem targetRoot = null;
		
		target.getContents().add(EcoreUtil.copy(source.getContents().get(0)));
		targetRoot = (TelecareSystem) target.getContents().get(0);
		for (int i = 0; i < times-1; i++) {
			copy = (TelecareSystem) EcoreUtil.copy(source.getContents().get(0));
			
			targetRoot.getHosts().addAll(copy.getHosts());
			targetRoot.getSensors().addAll(copy.getSensors());
			targetRoot.getGateways().addAll(copy.getGateways());
		}
		
		try {
			target.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void measure(Configuration configurationModel, int type) throws ViatraQueryException, InconsistentEventSemanticsException, InterruptedException, IOException {
//		System.out.println("************* MEASURE - " + type + " *************");
		
		long startTS = 0l;
		long endTS = 0L;
		long numberOfSourceElements = 0;
		long numberOfSourceReferences = 0;
		long numberOfTargetElements = 0;
		long numberOfTargetReferences = 0;
		

		
		/* Measurement */
		
		EventCompletedTrigger ect = null;
		ReportingEvent re = null;
		Host h = null;

		int repeat = 5;
		Long[] openingTimes = new Long[repeat];
		Long[] addingTimes = new Long[repeat];
		Long[] removingTimes = new Long[repeat];
		for (int i = 0; i < repeat; i++) {
			ResourceSet modelsRSet = new ResourceSetImpl();
			configurationModel.setScheduler(Scheduler.MANUAL);
			configurationModel.setSourceModel(modelsRSet.getResource(URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_"+type+".telecare", true), true));
			configurationModel.setTargetModel(modelsRSet.createResource(URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/out_tc_"+type+".telecare", true)));

			startTS = System.nanoTime();
			ViewModelManager vmm = new ViewModelManager(configurationModel, new TransformationInitializer() {
				
				@Override
				public void beforeInitialize(ViewModelManager viewModelManager) {
					// Nothing to do...
				}
				
				@Override
				public void afterInitialize(ViewModelManager viewModelManager) {
					viewModelManager.getExecutionSchema().startUnscheduledExecution();
				}
			});
			vmm.initialize();
			endTS = System.nanoTime();
			openingTimes[i] = endTS-startTS;

			
			ect = TelecareFactory.eINSTANCE.createEventCompletedTrigger();
			ect.setName("newECT!!");
			re = TelecareFactory.eINSTANCE.createReportingEvent();
			re.setName("newRE!!!");
			h = TelecareFactory.eINSTANCE.createHost();
			h.setName("newH!!!");
			
			
			startTS = System.nanoTime();
			((TelecareSystem) configurationModel.getSourceModel().getContents().get(0)).getHosts().add(h);
			((TelecareSystem) configurationModel.getSourceModel().getContents().get(0)).getGateways().get(0).getTriggers().add(ect);
			ect.getTriggeredEvents().add(re);
			re.setAddress(h);
			vmm.getExecutionSchema().startUnscheduledExecution();
			endTS = System.nanoTime();
			addingTimes[i] = (endTS-startTS);
			
			startTS = System.nanoTime();
			EcoreUtil.remove(ect);
			vmm.getExecutionSchema().startUnscheduledExecution();
			endTS = System.nanoTime();
			removingTimes[i] = (endTS-startTS);
			
			EcoreUtil.remove(h);
			vmm.getExecutionSchema().startUnscheduledExecution();
			
			vmm.dispose();
			if (i < repeat-1) {
				configurationModel.getSourceModel().unload();
				configurationModel.getTargetModel().unload();
				modelsRSet = null;
			}
		}
		
		int[] modelSizes = null;
		long minTime_opening = Collections.min(Arrays.asList(openingTimes));
		long minTime_adding = Collections.min(Arrays.asList(addingTimes));
		long minTime_removing = Collections.min(Arrays.asList(removingTimes));
		double avgTime_opening = 0;
		double avgTime_adding = 0;
		double avgTime_removing = 0;
		
		for (int i = 0; i < repeat; i++) {
			avgTime_opening += openingTimes[i];
			avgTime_adding += addingTimes[i];
			avgTime_removing += removingTimes[i];
		}
		avgTime_opening = (double)avgTime_opening / repeat;
		avgTime_adding = (double)avgTime_adding / repeat;
		avgTime_removing = (double)avgTime_removing / repeat;
		
		modelSizes = getElementAndReferenceNumberInModel(configurationModel.getSourceModel());
		numberOfSourceElements = modelSizes[0];
		numberOfSourceReferences = modelSizes[1];
		
		modelSizes = getElementAndReferenceNumberInModel(configurationModel.getTargetModel());
		numberOfTargetElements = modelSizes[0];
		numberOfTargetReferences = modelSizes[1];
		
//		System.out.println("Measurement("+type+"x)::");
//		System.out.println("#sourceElements:"+numberOfSourceElements);
//		System.out.println("#sourceReferences:"+numberOfSourceReferences);
//		System.out.println("#targetElements:"+numberOfTargetElements);
//		System.out.println("#targetReferences:"+numberOfTargetReferences);
//		//System.out.println("openingTime(minimum):"+minTime_opening+"(ns) | "+(double)minTime_opening / 1000000+"(ms)");
//		System.out.println("openingTime(average):"+avgTime_opening+"(ns) | "+avgTime_opening / 1000000+"(ms)");
//		//System.out.println("addingTime(minimum):"+minTime_adding+"(ns) | "+(double)minTime_adding / 1000000+"(ms)");
//		System.out.println("addingTime(average):"+avgTime_adding+"(ns) | "+avgTime_adding / 1000000+"(ms)");
//		//System.out.println("removingTime(minimum):"+minTime_removing+"(ns) | "+(double)minTime_removing / 1000000+"(ms)");
//		System.out.println("removingTime(average):"+avgTime_removing+"(ns) | "+avgTime_removing / 1000000+"(ms)");
//		System.out.println();
		System.out.println("tc_" + type + ".telecare;" + numberOfSourceElements + ";" + numberOfSourceReferences + ";" + numberOfTargetElements + ";" + numberOfTargetReferences + ";" + (avgTime_opening / 1000000) + ";" + (avgTime_adding / 1000000) + ";" + (avgTime_removing / 1000000));
		
		/* eof measurement */

		configurationModel.getTargetModel().save(null);
		
		System.gc();
		System.gc();
		
		Thread.sleep(2000L);
	}
	
	private int[] getElementAndReferenceNumberInModel(Resource resource) {
		int numberOfElements = 0;
		int numberOfReferences = 0;
		TreeIterator<EObject> it = resource.getAllContents();
		while (it.hasNext()) { 
			numberOfElements++; 
			
			EObject obj = (EObject)it.next();
			for (EReference ref : obj.eClass().getEAllReferences()) {
				if (obj.eGet(ref) instanceof EList) {
					numberOfReferences += ((EList)obj.eGet(ref)).size();
				} else {
					if (obj.eGet(ref) != null) numberOfReferences++;
				}
			}
		}
		
		return new int[] {numberOfElements, numberOfReferences};
	}
}
