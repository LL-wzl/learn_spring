package com.ll.learn.spring.f_factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("f-factorybean-beans.xml");
		
		Car car = (Car) ctx.getBean("carFactoryBean");
		
		System.out.println(car);
		
	}

}
