package com.java4;

import com.atguigu.java.Man;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age=25;
		man.earnMoney();
		
		//*****************************************
		//对象的多态性:父类的引用指向子类的对象
		Person p2 = new Man();
		Person p3 = new Woman();
		//多态的使用
		p2.eat();
		p2.walk();
		
		System.out.println(p2.id);
		
		
	}
}
