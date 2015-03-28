package com.ll.learn.spring.g_t;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Apptest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("g-t-beans.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		userService.add();
		
	}

}
