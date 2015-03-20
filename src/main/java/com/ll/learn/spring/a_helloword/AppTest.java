package com.ll.learn.spring.a_helloword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-beans.xml");
		
		HelloWord helloWord = (HelloWord) applicationContext.getBean("helloWord");
		
		System.out.println(helloWord.getName());
		
	}

}
