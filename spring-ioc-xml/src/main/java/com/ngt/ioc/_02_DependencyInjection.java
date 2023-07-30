package com.ngt.ioc;

import com.ngt.ioc.bean.Book;
import com.ngt.ioc.bean.School;
import com.ngt.ioc.bean.Student;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
	public void mapDI(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
		Student student = context.getBean("student", Student.class);
		log.info(student);
	}
}
