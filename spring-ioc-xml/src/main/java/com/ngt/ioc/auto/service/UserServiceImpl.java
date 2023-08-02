package com.ngt.ioc.auto.service;

import com.ngt.ioc.auto.dao.UserDao;
import lombok.extern.log4j.Log4j2;

/**
 * 2023-08-03 0:14
 * @author yueka
 */

@Log4j2
public class UserServiceImpl implements UserService{

	private UserDao userDao;

	@Override
	public void addUserService() {
		log.info("userService方法执行了...");
		userDao.addUserDao();
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
