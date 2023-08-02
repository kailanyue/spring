package com.ngt.ioc.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 2023-08-03 0:04
 * @author yueka
 */
public class MyFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
