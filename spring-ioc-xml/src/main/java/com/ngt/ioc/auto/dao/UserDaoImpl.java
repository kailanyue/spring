package com.ngt.ioc.auto.dao;

import lombok.extern.log4j.Log4j2;

/**
 * 2023-08-03 0:11
 */


@Log4j2
public class UserDaoImpl implements UserDao{
	@Override
	public void addUserDao() {
		log.info("userDao方法执行了...");
	}
}
