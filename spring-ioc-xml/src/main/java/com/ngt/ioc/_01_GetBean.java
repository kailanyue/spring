package com.ngt.ioc;

import com.ngt.ioc.bean.User;
import com.ngt.ioc.bean.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2023-07-29 17:07
 * @author 696292
 */
public class _01_GetBean {
    public static void main(String[] args) {

    }

    // 从 IOC 容器中获取 Bean 实例
    @Test
    public void getBean(){
        // 1. 创建 IOC 容器对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 从 IOC 容器中获取 Bean 实例

        // 2.1 根据 id 获取 Bean 实例
        User user1 = (User)context.getBean("user1");


        // 2.2 根据类型获取 Bean 实例
//        User user2 = context.getBean(User.class);

        // 2.3 根据 id + 类型 获取 Bean 实例
        User user3 = context.getBean("user2", User.class);

        // 3. 调用 Bean 的方法
        user1.run();
//        user2.run();
        user3.run();
    }


    @Test
    public void getBeanInterface() {
        // 1. 创建 IOC 容器对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 从 IOC 容器中获取 Bean 实例

        // 2.1 根据 id 获取 Bean 实例
        UserDao user1 = context.getBean(UserDao.class);
        // 3. 调用 Bean 的方法
        user1.run();

    }
}
