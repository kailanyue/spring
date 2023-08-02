package com.ngt.ioc.auto.controller;

import com.ngt.ioc.auto.service.UserService;
import lombok.extern.log4j.Log4j2;

/**
 * 2023-08-03 0:11
 */

@Log4j2
public class UserController {
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void addUser() {
		log.info("controller方法执行了...");
		//调用service的方法
		userService.addUserService();
	}
}
