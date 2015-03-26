package com.ll.learn.spring.b_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("b-scope-beans.xml");
		
//		Person person1 = applicationContext.getBean("bScope", Person.class);
//		
//		Person person2 = applicationContext.getBean("bScope", Person.class);
//		
//		System.out.println(person1 == person2);
		
	}

}
