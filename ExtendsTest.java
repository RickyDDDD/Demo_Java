package com.atguigu.java;

public class ExtendsTest {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.age = 1;
		p1.eat();
		System.out.println("****************************");
		Student s1 = new Student();
		s1.eat();
	//	s1.sleep();
		s1.name = "tom";
		s1.setAge(10);
		System.out.println(s1.getAge());
		
		s1.breath();
		
	}
	

}
