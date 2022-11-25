package com.atguigu.java5;

public class Cylinder extends Circle{
	
	private double length;
	
	public Cylinder() {
		length = 1;
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume() {
		
		return super.findArea() * length;
	}
	
	public double findArea() {
		return Math.PI * 4 * getRadius() * length;
	}
	

}
