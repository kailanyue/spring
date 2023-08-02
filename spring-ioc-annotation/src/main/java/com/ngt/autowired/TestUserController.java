package com.ngt.autowired;

import com.ngt.autowired.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2023-08-03 0:54
 */
public class TestUserController {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("bean.xml");
		UserController controller = context.getBean(UserController.class);
		controller.add();
	}
}
