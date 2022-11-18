package com.atguigu.java;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.name = "大黄";
//		a.age = 1 ;
//		a.legs = 4;//The field Animal.legs is not visible
		
		a.show();
		
//		a.setLegs(-6);//The field Animal.legs is not visible
		a.show();
		System.out.println(a.name);
		
	}
}

class Animal{
	String name;
	private int age ;
	private int legs; 
	
	public void setLegs(int l) {
		if(l >= 0 && l % 2 == 0) {
			legs = 1 ;
		}else {
			legs = 0 ;
		}
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void eat() {
		System.out.println("动物进食");
	}
	
	public void show() {
		System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
	}
	
	public int getAge() {
		return age;
	}
	
	public int setAge(int a) {
		age = a ;
		return age;
	}
	
}