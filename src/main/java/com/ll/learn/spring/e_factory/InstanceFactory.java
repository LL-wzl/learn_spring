package com.ll.learn.spring.e_factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法
 * @author ll
 *
 */
public class InstanceFactory {

	private Map<String, Car> map;
	
	public InstanceFactory() {
		map = new HashMap<String, Car>();
		map.put("audi", new Car("奥迪", 100000));
		map.put("BMW", new Car("宝马", 200000));
	}
	
	public Car getCar(String brand){
		return map.get(brand);
	}
}
