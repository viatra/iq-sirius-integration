/**
 */
package org.eclipse.incquery.viewmodel.configuration.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.incquery.viewmodel.configuration.ConfigurationPackage;
import org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.incquery.viewmodel.configuration.ElementRuleDescriptor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementRuleDescriptorItemProvider extends RuleDescriptorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementRuleDescriptorItemProvider(AdapterFactory adapterFactory) {
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

			addElementTypePropertyDescriptor(object);
			addStructuralFeatureRuleDescriptorsPropertyDescriptor(object);
			addReferenceRuleDescriptorsPropertyDescriptor(object);
			addAttributeRuleDescriptorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Element Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementRuleDescriptor_elementType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementRuleDescriptor_elementType_feature", "_UI_ElementRuleDescriptor_type"),
				 ConfigurationPackage.Literals.ELEMENT_RULE_DESCRIPTOR__ELEMENT_TYPE,
				 true,
				 false,
				 true,
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
				 getString("_UI_ElementRuleDescriptor_structuralFeatureRuleDescriptors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementRuleDescriptor_structuralFeatureRuleDescriptors_feature", "_UI_ElementRuleDescriptor_type"),
				 ConfigurationPackage.Literals.ELEMENT_RULE_DESCRIPTOR__STRUCTURAL_FEATURE_RULE_DESCRIPTORS,
				 true,
				 false,
				 true,
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
				 getString("_UI_ElementRuleDescriptor_referenceRuleDescriptors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementRuleDescriptor_referenceRuleDescriptors_feature", "_UI_ElementRuleDescriptor_type"),
				 ConfigurationPackage.Literals.ELEMENT_RULE_DESCRIPTOR__REFERENCE_RULE_DESCRIPTORS,
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
				 getString("_UI_ElementRuleDescriptor_attributeRuleDescriptors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementRuleDescriptor_attributeRuleDescriptors_feature", "_UI_ElementRuleDescriptor_type"),
				 ConfigurationPackage.Literals.ELEMENT_RULE_DESCRIPTOR__ATTRIBUTE_RULE_DESCRIPTORS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ElementRuleDescriptor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ElementRuleDescriptor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ElementRuleDescriptor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ElementRuleDescriptor_type") :
			getString("_UI_ElementRuleDescriptor_type") + " " + label;
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
	}

}
