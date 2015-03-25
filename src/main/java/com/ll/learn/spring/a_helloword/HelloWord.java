package com.ll.learn.spring.a_helloword;

public class HelloWord {
	
	public HelloWord(String name){
		this.name = name;
		System.out.println(name);
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
