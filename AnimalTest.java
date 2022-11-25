//package com.atguigu.java5;
//
//import java.util.Random;
//
//class Animal{
//	protected void eat() {
//		System.out.println("animal eat food");
//	}
//}
//
//class Cat extends Animal{
//	protected void eat() {
//		System.out.println("cat eat fish");
//	}
//}
//
//class Dog extends Animal{
//	protected void eat() {
//		System.out.println("dog eat bone");
//	}
//}
//
//class Sheep extends Animal{
//	protected void eat() {
//		System.out.println("sheep eat grass");
//	}
//}
//
//}
//public class InterviewTest{
//	public static Animal getInstance(int key) {
//		switch(key) {
//		case 0:
//			return new Cat();
//			
//		case 1:
//			return new Dog();
//			
//		case 2:
//			return new Sheep();
//		}
//	}
//
//	public static void main(String[] args) {
//		
//		int key = new Random().nextInt(3);
//		
//		System.out.println(key);
//		
//		Animal animal = getInstance(key);
//		
//		animal.eat();
//		
//	}
//}	
//
//
