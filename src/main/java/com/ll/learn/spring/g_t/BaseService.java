package com.ll.learn.spring.g_t;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

	/**
	 * 子类集成的时候装载对应类型
	 */
	@Autowired
	protected BaseRepository<T> baseRespository;
	
	public void add(){
		System.out.println("add.....");
		System.out.println(baseRespository);
	}
	
}
