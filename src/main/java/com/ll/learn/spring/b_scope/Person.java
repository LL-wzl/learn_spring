package com.ll.learn.spring.b_scope;

public class Person {

	public Person() {
		System.out.println("初始化对象");
	}
	
	private Integer id;
	
	private String name;
	
	private int age;
	
	private int sex;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + "]";
	}
	
	
}
