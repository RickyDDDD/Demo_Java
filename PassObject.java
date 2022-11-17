package com.atguigu.exer;

public class PassObject {
	
	public static void main(String[] args) {
		PassObject test = new PassObject();
		
		Circle c = new Circle();
		
		test.printtAreas(c, 5);
		
	}
	
	public void printtAreas(Circle c , int time) {
		
		System.out.println("Radius\t\tArea");
		
		for(int i = 1 ; i <= time ;i++) {
			c.radius = i ;
			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		
	}

}
