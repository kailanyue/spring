package com.ngt.ioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 2023-08-01 1:05
 */
public class MyBeanPost implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean,
												  String beanName) throws BeansException {
		System.out.println("3 bean后置处理器，初始化之前执行");
		System.out.println(beanName + "::" + bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean,
												 String beanName) throws BeansException {
		System.out.println("5 bean后置处理器，初始化之后执行");
		System.out.println(beanName + "::" + bean);
		return bean;
	}
}