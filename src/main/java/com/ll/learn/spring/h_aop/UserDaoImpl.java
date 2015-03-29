package com.ll.learn.spring.h_aop;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component
public class UserDaoImpl implements UserDao {

	public void add(String userId, String userName) {
		userName.length();
		System.out.println("user save userId["+userId+"],userName["+userName+"]");
	}

	public void update(String userId, String userName) {
		System.out.println("user update userId["+userId+"],userName["+userName+"]");
	}

	public void delete(String userId) {
		System.out.println("user delete userId["+userId+"]");
	}

}
