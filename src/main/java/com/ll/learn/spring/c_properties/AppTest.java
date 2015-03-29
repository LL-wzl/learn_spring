package com.ll.learn.spring.c_properties;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	@Autowired
	private UserService userService;
	
	static ApplicationContext ctx = null;
	
	static{
		ctx = new ClassPathXmlApplicationContext("c-properties-beans.xml");
	}
	
	@Test
	public void testJdbcTemplate(){
		userService = ctx.getBean(UserService.class);
//		List<User> list = userService.find();
		List<User> list = userService.findNamedParame();
		if(list == null || list.isEmpty()){
			System.out.println("empty list");
		}else{
			System.out.println(list);
		}
		
	}
	
}
