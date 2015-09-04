/**
 */
package org.eclipse.incquery.viewmodel.configuration.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.incquery.viewmodel.configuration.Configuration;
import org.eclipse.incquery.viewmodel.configuration.ConfigurationFactory;
import org.eclipse.incquery.viewmodel.configuration.ConfigurationPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.incquery.viewmodel.configuration.Configuration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSourceModelPropertyDescriptor(object);
			addTargetModelPropertyDescriptor(object);
			addElementRuleDescriptorsPropertyDescriptor(object);
			addStructuralFeatureRuleDescriptorsPropertyDescriptor(object);
			addReferenceRuleDescriptorsPropertyDescriptor(object);
			addAttributeRuleDescriptorsPropertyDescriptor(object);
			addSourceModelURIPropertyDescriptor(object);
			addTargetModelURIPropertyDescriptor(object);
			addPatternResourcesPropertyDescriptor(object);
			addPatternResourceURIsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Configuration_sourceModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Configuration_sourceModel_feature", "_UI_Configuration_type"),
				 ConfigurationPackage.Literals.CONFIGURATION__SOURCE_MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Configuration_targetModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Configuration_targetModel_feature", "_UI_Configuration_type"),
				 ConfigurationPackage.Literals.CONFIGURATION__TARGET_MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Rule Descriptors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementRuleDescriptorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Configuration_elementRuleDescriptors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Configuration_elementRuleDescriptors_feature", "_UI_Configuration_type"),
				 ConfigurationPackage.Literals.CONFIGURATION__ELEMENT_RULE_DESCRIPTORS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Structural Feature Rule Descriptors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStructuralFeatureRuleDescriptorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Configuration_structuralFeatureRuleDescriptors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Configuration_structuralFeatureRuleDescriptors_feature", "_UI_Configuration_type"),
				 ConfigurationPackage.Literals.CONFIGURATION__STRUCTURAL_FEATURE_RULE_DESCRIPTORS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference Rule Descriptors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferenceRuleDescriptorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Configuration_referenceRuleDescriptors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Configuration_referenceRuleDescriptors_feature", "_UI_Configuration_type"),
				 ConfigurationPackage.Literals.CONFIGURATION__REFERENCE_RULE_DESCRIPTORS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute Rule Descriptors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeRuleDescriptorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Configuration_attributeRuleDescriptors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Configuration_attributeRuleDescriptors_feature", "_UI_Configuration_type"),
				 ConfigurationPackage.Literals.CONFIGURATION__ATTRIBUTE_RULE_DESCRIPTORS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Model URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceModelURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Configuration_sourceModelURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Configuration_sourceModelURI_feature", "_UI_Configuration_type"),
				 ConfigurationPackage.Literals.CONFIGURATION__SOURCE_MODEL_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Model URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetModelURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Configuration_targetModelURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Configuration_targetModelURI_feature", "_UI_Configuration_type"),
				 ConfigurationPackage.Literals.CONFIGURATION__TARGET_MODEL_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Configuration_patternResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Configuration_patternResources_feature", "_UI_Configuration_type"),
				 ConfigurationPackage.Literals.CONFIGURATION__PATTERN_RESOURCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern Resource UR Is feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternResourceURIsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Configuration_patternResourceURIs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Configuration_patternResourceURIs_feature", "_UI_Configuration_type"),
				 ConfigurationPackage.Literals.CONFIGURATION__PATTERN_RESOURCE_UR_IS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ConfigurationPackage.Literals.CONFIGURATION__RULE_DESCRIPTORS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Configuration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Configuration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Resource labelValue = ((Configuration)object).getSourceModel();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Configuration_type") :
			getString("_UI_Configuration_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Configuration.class)) {
			case ConfigurationPackage.CONFIGURATION__SOURCE_MODEL:
			case ConfigurationPackage.CONFIGURATION__TARGET_MODEL:
			case ConfigurationPackage.CONFIGURATION__SOURCE_MODEL_URI:
			case ConfigurationPackage.CONFIGURATION__TARGET_MODEL_URI:
			case ConfigurationPackage.CONFIGURATION__PATTERN_RESOURCES:
			case ConfigurationPackage.CONFIGURATION__PATTERN_RESOURCE_UR_IS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ConfigurationPackage.CONFIGURATION__RULE_DESCRIPTORS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONFIGURATION__RULE_DESCRIPTORS,
				 ConfigurationFactory.eINSTANCE.createElementRuleDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONFIGURATION__RULE_DESCRIPTORS,
				 ConfigurationFactory.eINSTANCE.createReferenceRuleDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.CONFIGURATION__RULE_DESCRIPTORS,
				 ConfigurationFactory.eINSTANCE.createAttributeRuleDescriptor()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConfigurationEditPlugin.INSTANCE;
	}

}
