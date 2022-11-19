package com.atguigu.exer;

public class Cylineder extends Circle{
	
	private double length;
	
	public Cylineder() {
		length = 1.0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume() {
//		return Math.PI * getRadius() * getRadius() * length; 
		return findArea() * length;
	}
	

}
