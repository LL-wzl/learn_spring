package com.ll.learn.spring.e_factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

	private static Map<String, Car> map = new HashMap<String, Car>();
	
	static{
		map.put("audi", new Car("奥迪", 100000));
		map.put("BMW", new Car("宝马", 200000));
	}
	
	public static Car getCar(String branch){
		return map.get(branch);
	}
	
}
