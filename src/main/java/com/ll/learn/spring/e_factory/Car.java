package com.ll.learn.spring.e_factory;

/**
 * 
 * @author ll
 *
 */
public class Car {

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String branch, int price){
		this.brance = branch;
		this.price = price;
	}
	
	private String brance;
	
	private int price;

	public String getBrance() {
		return brance;
	}

	public void setBrance(String brance) {
		this.brance = brance;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brance=" + brance + ", price=" + price + "]";
	}
	
}
