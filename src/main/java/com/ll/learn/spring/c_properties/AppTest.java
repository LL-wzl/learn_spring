package com.ll.learn.spring.c_properties;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("c-properties-beans.xml");
		
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		
		System.out.println(dataSource);
	}

}
