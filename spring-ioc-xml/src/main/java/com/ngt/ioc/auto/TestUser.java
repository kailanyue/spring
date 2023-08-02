package com.ngt.ioc.auto;

import com.ngt.ioc.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2023-08-03 0:17
 */
public class TestUser {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("bean-auto.xml");
		UserController controller = context.getBean("userController", UserController.class);
		controller.addUser();
	}
}
