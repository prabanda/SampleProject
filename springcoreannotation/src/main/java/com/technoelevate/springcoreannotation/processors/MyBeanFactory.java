package com.technoelevate.springcoreannotation.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactory  implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		 BeanDefinition definition=beanFactory.getBeanDefinition("message");
		MutablePropertyValues propertyValues= definition.getPropertyValues();
		propertyValues.addPropertyValue("message","beanfactory post processor");
		
		
	}

}
