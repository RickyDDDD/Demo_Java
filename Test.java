package com.atguigu.java5;

public class Test {
	
	public static void main(String[] args) {
		
		Cylinder test = new Cylinder();
		
		System.out.println("表面积为：" + test.findArea());
		System.out.println("体积为：" + test.findVolume());
		
		test.setRadius(3);
		Circle cir = new Circle();
		System.out.println("表面积为 ： " + test.findArea());
		
	}

}