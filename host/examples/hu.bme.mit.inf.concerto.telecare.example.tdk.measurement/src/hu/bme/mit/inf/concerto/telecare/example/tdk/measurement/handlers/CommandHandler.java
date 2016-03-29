package hu.bme.mit.inf.concerto.telecare.example.tdk.measurement.handlers;


import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.viewmodel.configuration.Configuration;
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
			
//			// 10000x
//			targetURI = URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_10000.telecare", true);
//			copyModel(resourceSet, sourceURI, targetURI, 10000);
			
			System.out.println("EOF CREATE MODELS");
		} else if (COMMAND_MEASURE.equals(commandId)) {			
			System.out.println("MEASURE");
			
			ResourceSet rset = new ResourceSetImpl();
			Resource configResource = rset.getResource(URI.createPlatformResourceURI("/hu.bme.mit.concerto.telecare.example.tdk.view.design/model/telecareview_transformation.configuration", true), true);
			
			Configuration configurationModel = (Configuration) configResource.getContents().get(0);
			
			try {
//				measure(configurationModel, 0);
				measure(configurationModel, 1);
				
				measure(configurationModel, 1);
				measure(configurationModel, 10);
				measure(configurationModel, 25);
				measure(configurationModel, 50);
				measure(configurationModel, 75);
				measure(configurationModel, 100);
				measure(configurationModel, 150);

//				measure(configurationModel, 200);
//				measure(configurationModel, 300);
//				measure(configurationModel, 400);
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
		Iterator it = null;
		long startTS = 0l;
		long endTS = 0L;
		long numberOfSourceElements = 0;
		long numberOfSourceReferences = 0;
		long numberOfTargetElements = 0;
		long numberOfTargetReferences = 0;
		
		ResourceSet modelsRSet = new ResourceSetImpl();

		
		/* Measurement */
		configurationModel.setSourceModel(modelsRSet.getResource(URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/tc_"+type+".telecare", true), true));
		configurationModel.setTargetModel(modelsRSet.createResource(URI.createPlatformResourceURI("/hu.bme.mit.inf.concerto.telecare.example.tdk.sample/model/out_tc_"+type+".telecare", true)));
		
		EventCompletedTrigger ect = null;
		ReportingEvent re = null;
		Host h = null;
		
		Long[] times = new Long[1];
		for (int i = 0; i < times.length; i++) {
			startTS = System.nanoTime();
			ViewModelManager vmm = new ViewModelManager(configurationModel);
			vmm.initialize();
			endTS = System.nanoTime();
			//vmm.dispose();
			
			times[i] = endTS-startTS;
			
			System.out.println("Measurement("+type+"x)::"
					+ "#sourceElements:-"
					+ "#targetElements:-"
					+ "time:"+times[i]+"(ns) | "+(double)times[i] / 1000000000+"(s)");
			
			ect = TelecareFactory.eINSTANCE.createEventCompletedTrigger();
			re = TelecareFactory.eINSTANCE.createReportingEvent();
			h = TelecareFactory.eINSTANCE.createHost();
			
			ect.getTriggeredEvents().add(re);
			re.setAddress(h);
			
			
			startTS = System.nanoTime();
			((TelecareSystem) configurationModel.getSourceModel().getContents().get(0)).getHosts().add(h);
			((TelecareSystem) configurationModel.getSourceModel().getContents().get(0)).getGateways().get(0).getTriggers().add(ect);
			endTS = System.nanoTime();
			System.out.println("Measurement("+type+"x)::"
					+ "#sourceElements:-"
					+ "#targetElements:"+numberOfTargetElements+""
					+ "#targetReferences:"+numberOfTargetReferences+""
					+ "time(add):"+(endTS-startTS)+"(ns) | "+(double)(endTS-startTS) / 1000000000+"(s)");
			
			startTS = System.nanoTime();
			EcoreUtil.remove(ect);
			endTS = System.nanoTime();
			
			System.out.println("Measurement("+type+"x)::"
					+ "#sourceElements:-"
					+ "#targetElements:-"
					+ "time(remove):"+(endTS-startTS)+"(ns) | "+(double)(endTS-startTS) / 1000000000+"(s)");
			
			vmm.dispose();			
		}
		
		long minTime = Collections.min(Arrays.asList(times));
		double avgTime = 0;
		
		for (int i = 0; i < times.length; i++) {
			avgTime += times[i];
		}
		avgTime = (double)avgTime / times.length;
		
		numberOfSourceElements = 0;
		numberOfSourceReferences = 0;
		it = configurationModel.getSourceModel().getAllContents();
		while (it.hasNext()) { 
			numberOfSourceElements++; 
			
			EObject obj = (EObject)it.next();
			for (EReference ref : obj.eClass().getEAllReferences()) {
				if (obj.eGet(ref) instanceof EList) {
					numberOfSourceReferences += ((EList)obj.eGet(ref)).size();
				} else {
					if (obj.eGet(ref) != null) numberOfSourceReferences++;
				}
			}
		}

		numberOfTargetElements = 0;
		numberOfTargetReferences = 0;
		it = configurationModel.getTargetModel().getAllContents();
		while (it.hasNext()) {
			numberOfTargetElements++; 
			
			EObject obj = (EObject)it.next();
			for (EReference ref : obj.eClass().getEAllReferences()) {
				if (obj.eGet(ref) instanceof EList) {
					numberOfTargetReferences += ((EList)obj.eGet(ref)).size();
				} else {
					if (obj.eGet(ref) != null) numberOfTargetReferences++;
				}
			}
		}
		
		System.out.println("Measurement("+type+"x)::"
				+ "#sourceElements:"+numberOfSourceElements+""
				+ "#sourceReferences:"+numberOfSourceReferences+""
				+ "#targetElements:"+numberOfTargetElements+""
				+ "#targetReferences:"+numberOfTargetReferences+""
				+ "time(minimum):"+minTime+"(ns) | "+(double)minTime / 1000000000+"(s)"
				+ "time(average):"+avgTime+"(ns) | "+avgTime / 1000000000+"(s)");
		/* eof measurement */

		configurationModel.getTargetModel().save(null);
		
		System.gc();
		System.gc();
		
		Thread.sleep(2000L);
	}
}
