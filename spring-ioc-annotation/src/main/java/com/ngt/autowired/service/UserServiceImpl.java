package com.ngt.autowired.service;

import com.ngt.autowired.dao.UserDao;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2023-08-03 0:53
 */

@Log4j2
@Service
public class UserServiceImpl implements UserService {
	// 1.属性注入
	// @Autowired
	private UserDao userDao;

	// 2.set方法注入
	// @Autowired
	// public void setUserDao(UserDao userDao) {
	// 	this.userDao = userDao;
	// }

	// 3.构造方法注入
	// @Autowired
	// public UserServiceImpl(UserDao userDao) {
	// 	this.userDao = userDao;
	// }


	// 4.形参注入
	// public UserServiceImpl(@Autowired UserDao userDao) {
	// 	this.userDao = userDao;
	// }

	// 5.只有一个有参数构造函数，无注解
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add() {
		userDao.add();
		log.info("Service 层执行结束...");
	}
}
