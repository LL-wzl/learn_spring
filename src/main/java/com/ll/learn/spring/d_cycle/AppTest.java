package com.ll.learn.spring.d_cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *	测试 SpEL、IOC中bean的生命周期 、bean的后置处理器
 * @author Administrator
 *
 */
public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("d-cycle-beans.xml");
		
		Person p = (Person) ctx.getBean("person");
		
		System.out.println(p);
		
		ctx.close();
	}

}
