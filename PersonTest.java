package com.atguigu.java;

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
		System.out.println("*****************************");
		//如何调用子类特有的属性和方法：
		//使用强制类型转换符（向下转型）
		Man m1 =(Man)p2;
		m1.earnMoney();
		m1.isSmoking = true;
		
		System.out.println("****************************");
		
		if(p1 instanceof Woman) {
			Woman w1 = (Woman)p2;
			w1.goShopping();
			System.out.println("*****Woman******");
		}
		if(p2 instanceof Man) {
			Man m2 = (Man)p2;
			m2.earnMoney();
			System.out.println("*****Man******");
		}		
		
	}
}
