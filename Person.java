package com.rtguigu.exer;

public class Person {
	
	private int age ;
	private String name;
	
	public Person() {
		age =18 ;
	}
	
	public Person(String n,int a) {
		name = n;
		age = a;
	}
	
	public void setAge(int a) {
		if(age > 130 || age < 0) {
			System.out.println("输入有误");
		}else {
			age = a ;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n ;
	}
	public String getName() {
		return name;
	}
	
}
