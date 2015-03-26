package com.ll.learn.spring.d_cycle;

public class Car {

	private String name;
	
	private Integer price;
	
	private Integer speel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getSpeel() {
		return speel;
	}

	public void setSpeel(Integer speel) {
		this.speel = speel;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", speel=" + speel
				+ "]";
	}
	
}
