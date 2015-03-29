package com.ll.learn.spring.h_aop;

/**
 * 
 * @author Administrator
 *
 */
public interface UserDao {

	public void add(String userId, String userName);
	
	public void update(String userId, String userName);
	
	public void delete(String userId);
	
}
