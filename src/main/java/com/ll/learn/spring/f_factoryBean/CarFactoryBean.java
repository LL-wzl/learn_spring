package com.ll.learn.spring.f_factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 
 * @author ll
 *
 */
public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Car getObject() throws Exception {
		return new Car(brand, 5555555);
	}

	public Class<Car> getObjectType() {
		return Car.class;
	}

	public boolean isSingleton() {
		return true;
	}

	

}
