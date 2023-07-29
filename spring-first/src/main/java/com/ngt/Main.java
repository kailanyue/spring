package com.ngt;


import com.ngt.bean.User;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2023-07-28 0:54
 * @author yueka
 */

@Log4j2
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

		User user = (User)applicationContext.getBean("User");

		user.setName("ngt");
		user.show();
		log.info("### 执行调用成功了..");
	}

	@Test
	public void test() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

		User user = (User)applicationContext.getBean("User");

		user.setName("ngt");
		user.show();
		// log.info("### 执行调用成功了..");
	}

	/**
	 * 通过反射创建对象
	 */
	@Test
	public void testUser() throws Exception {
		Class clazz = Class.forName("com.ngt.bean.User");
		User user = (User)clazz.getDeclaredConstructor().newInstance();
		user.setName("ngt");
		user.show();
	}
}