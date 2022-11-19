package com.atguigu.exer;

import java.util.Scanner;

public class CylinderTest {
	
	public static void main(String[] args) {
		
		Cylineder cyl = new Cylineder();
		
//		System.out.println("please input radius");
//		Scanner rad = new Scanner(System.in);
//		
//		System.out.println("please input length");
//		Scanner leth = new Scanner(System.in);
//		
		cyl.setRadius(2);
		
		System.out.println("面积为：" +  cyl.findArea() );
		
		cyl.setLength(2);
		System.out.println("体积为：" + cyl.findVolume());
	}
	
	
}
