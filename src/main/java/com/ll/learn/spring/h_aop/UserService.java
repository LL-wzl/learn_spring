package com.ll.learn.spring.h_aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


	private UserDao userDao2;
	
	/**
	 * 这个地方的注解和setXxxx方法名没关，只能参数实体有关
	 * @param userDao
	 */
	@Autowired
	public void setUserDao2(UserDao userDao) {
		System.out.println("init userdao---" + userDao);
		this.userDao2 = userDao;
	}
	
	public UserDao getDao(){
		System.out.println("getdao----" + userDao2);
		return userDao2;
	}
	
}
