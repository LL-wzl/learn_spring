package com.ll.learn.spring.h_aop_xml;

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
