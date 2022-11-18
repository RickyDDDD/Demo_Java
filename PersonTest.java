package com.atguigu.java2;

public class PersonTest {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setAge(1);
		System.out.println(p1.getAge());
		
		p1.eat();
		
		System.out.println();
		
		Person p2 = new Person("Jerry",20);
		System.out.println(p2.getAge() );
		
	}

}

class Person{
	private String name ;
	private int age ;
	
	public Person() {
		this.eat();
		String info = "Person 初始化时，需要考虑如下的1，2，3，4.....";
		System.out.println(info);
	}
	
	public Person(String name) {
		this();
		this.name = name ;
	}	
	public Person(int age) {
		this();
		this.age = age;
	}
	
	public Person(String name,int age) {
		this(age);
		this.name = name ;
		//this.age = age;
	}
	
	public void setName(String name) {
		this.name  = name;
	}
	public String getName() {
		return name ;
	}
	public void setAge(int age) {
		this.age  = age ;
	}
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.println("人吃饭");
		study();
	}
	
	public void study() {
		System.out.println("人学习");
	}
	
}
