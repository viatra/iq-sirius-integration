package org.eclipse.incquery.viewmodel.core;

public interface TransformationInitializer {

	public void afterInitialize(ViewModelManager viewModelManager);
	
	public void beforeInitialize(ViewModelManager viewModelManager);
	
}
