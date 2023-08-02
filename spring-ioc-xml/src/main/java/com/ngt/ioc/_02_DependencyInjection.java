package com.ngt.ioc;

import com.alibaba.druid.pool.DruidDataSource;
import com.ngt.ioc.bean.*;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.openjdk.jol.vm.VM;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.Long.toHexString;

/**
 * 2023-07-29 17:46
 *
 * @author 696292
 */

@Log4j2
public class _02_DependencyInjection {
	public static void main(String[] args) {

	}

	// 使用 Set  进行注入
	@Test
	public void setDI() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
		Book bookSet = context.getBean("book_set", Book.class);
		log.info(bookSet);
	}

	// 使用 构造器进行注入
	@Test
	public void conDI() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
		Book bookCon = context.getBean("book_con", Book.class);
		log.info(bookCon);
	}

	// 特殊值注入
	@Test
	public void DI() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
		Book bookCon = context.getBean("book", Book.class);
		log.info(bookCon);
	}

	// 为对象类型属性赋值
	// 外部 bean
	@Test
	public void objectDI() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
		Student student1 = context.getBean("student1", Student.class);
		log.info(student1);

		Student student2 = context.getBean("student2", Student.class);
		log.info(student2);

		Student student3 = context.getBean("student3", Student.class);
		log.info(student3);
	}

	// 为数组属性赋值
	@Test
	public void arrayDI() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
		Student student = context.getBean("student", Student.class);
		log.info(student);
	}

	// 为list属性赋值
	@Test
	public void listDI() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
		School school = context.getBean("school", School.class);
		log.info(school);
	}

	// 为map属性赋值
	@Test
	public void mapDI() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
		Student student = context.getBean("student", Student.class);
		log.info(student);
	}

	// p 空间
	@Test
	public void pZoneDI() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
		Student student = context.getBean("student", Student.class);
		log.info(student);
	}

	// 从外部属性文件中获取值
	@Test
	public void loadConfigFile() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
		DruidDataSource druidDataSource = context.getBean("druidDataSource", DruidDataSource.class);
		log.info("url:{}, userName:{}", druidDataSource.getUrl(), druidDataSource.getUsername());
	}

	// bean 的作用域
	@Test
	public void scopeBean() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
		Student student1 = context.getBean("studentSingleton", Student.class);
		Student student2 = context.getBean("studentSingleton", Student.class);

		// 单例模式 创建的对象是同一个其拥有同样的内存地址，默认配置
		log.info("student1 address:{}, student2 address:{}, student1.equals(student2) {}",
				toHexString(VM.current().addressOf(student1)), toHexString(VM.current().addressOf(student2)), student1 == student2);

		Student student3 = context.getBean("studentPrototype", Student.class);
		Student student4 = context.getBean("studentPrototype", Student.class);

		// 在IOC容器中有多个实例
		log.info("student3 address:{}, student4 address:{}, student3.equals(student4) {}",
				toHexString(VM.current().addressOf(student3)), toHexString(VM.current().addressOf(student4)), student3 == student4);
	}

	// bean 生命周期
	@Test
	public void beanLife(){
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("bean-life.xml");
		UserLife user = context.getBean("userLife", UserLife.class);
		log.info("6 bean对象创建完成了，可以使用了");
		log.info(user);
		context.close(); //销毁
	}

	// MyFactoryBean
	@Test
	public void MyFactoryBean(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
		User user = context.getBean("user", User.class);
		log.info(user);
	}
}
