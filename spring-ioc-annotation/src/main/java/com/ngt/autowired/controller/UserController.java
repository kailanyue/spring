package com.ngt.autowired.controller;

import com.ngt.autowired.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 2023-08-03 0:53
 */

@Log4j2
@Controller
public class UserController {
	// 1.属性注入
	// @Autowired
	private UserService userService;

	// 2.set方法注入
	// @Autowired
	// public void setUserService(UserService userService) {
	// 	this.userService = userService;
	// }

	// 3.构造方法注入
	// @Autowired
	// public UserController(UserService userService) {
	// 	this.userService = userService;
	// }

	// 4.形参注入
	// public UserController(@Autowired UserService userService) {
	// 	this.userService = userService;
	// }

	// 5.只有一个有参数构造函数，无注解
	public UserController(UserService userService) {
		this.userService = userService;
	}

	public void add() {
		userService.add();
		log.info("Controller 层执行结束...");
	}
}
